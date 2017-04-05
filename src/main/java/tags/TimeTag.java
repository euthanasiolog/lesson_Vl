package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by piatr on 04.04.17.
 */

public class TimeTag extends TagSupport {
    @Override
    public int doStartTag () throws JspException {
     String timeNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
     try {
         System.out.println(timeNow);
         return SKIP_BODY;
     } catch (Exception exception) { throw new JspTagException
             ("Tag Time"+exception.getMessage());
        }

    }
}

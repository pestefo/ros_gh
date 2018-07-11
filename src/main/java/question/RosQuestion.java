package question;

import tag.Tag;
import tools.HtmlContent;

import java.util.List;

/**
 * @author Braulio Lopez (brauliop.3@gmail.com)
 */
public interface RosQuestion {
    String title();

    int author();

    String date();

    List<Tag> tags();

    List<String> collaborators();

    HtmlContent content();

    String url();

    int rosId();

    long lastActivityAt();

    int lastActivityBy();

    int viewCount();

    int votes();
}

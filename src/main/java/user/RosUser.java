package user;

import tag.Tag;
import tag.TagWithCount;

import java.util.List;

/**
 * @author Braulio Lopez (brauliop.3@gmail.com)
 */
public interface RosUser {
    String name();

    int upVotes();

    int downVotes();

    int rosId();

    /* TODO: 18-05-18 Too many methods!
     * this 3 method should be one UserTag object returned by 1 method
     */

    List<TagWithCount> tags();

    List<Tag> interestingTags();

    List<Tag> ignoredTags();
}

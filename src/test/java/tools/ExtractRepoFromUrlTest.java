package tools;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Braulio Lopez (brauliop.3@gmail.com)
 */
public class ExtractRepoFromUrlTest {
    @Test
    public void extractRepoInfoFromUrl() {
        String url = "https://github.com/elbraulio/ros_gh.git";
        assertThat(
                new ExtractRepoFromUrl(url).repoFullName(),
                is("elbraulio/ros_gh")
        );
    }
}
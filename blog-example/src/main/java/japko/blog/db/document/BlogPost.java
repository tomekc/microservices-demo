package japko.blog.db.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongojack.Id;
import org.mongojack.ObjectId;

import java.util.Date;

/**
 * Created by tomek
 */

public class BlogPost {

    @ObjectId
    @JsonProperty("_id")
    public String id;

    public String title;

    public String content;

    public Date createdAt;

}

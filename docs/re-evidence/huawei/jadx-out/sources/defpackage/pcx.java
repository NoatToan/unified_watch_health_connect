package defpackage;

import com.huawei.pluginfitnessadvice.Comment;
import com.huawei.pluginfitnessadvice.Cover;
import com.huawei.pluginfitnessadvice.Video;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pcx {
    public static <T> List<T> a(JSONArray jSONArray, Class<T[]> cls) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        return peh.c(jSONArray.toString(), cls);
    }

    public static List<Comment> e(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList(10);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && (i != 1 || jSONObjectOptJSONObject.optInt("sex") == 1)) {
                Comment comment = new Comment();
                comment.saveId(jSONObjectOptJSONObject.optString("audioId"));
                comment.saveName(jSONObjectOptJSONObject.optString("audioUrl"));
                comment.saveTime(jSONObjectOptJSONObject.optInt("playTime"));
                comment.saveType(jSONObjectOptJSONObject.optInt("displayorder"));
                comment.saveLength(jSONObjectOptJSONObject.optInt("audioSize"));
                arrayList.add(comment);
            }
        }
        return arrayList;
    }

    public static List<Cover> d(List<Video> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Video video : list) {
            if (video != null) {
                Cover cover = new Cover();
                cover.saveGender(video.getGender());
                cover.saveUrl(video.getThumbnail());
                arrayList.add(cover);
            }
        }
        return arrayList;
    }
}

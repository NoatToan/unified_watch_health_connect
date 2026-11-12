package defpackage;

import com.google.gson.Gson;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.tencent.connect.share.QzonePublish;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pcw extends pcv {
    @Override // defpackage.pcv, com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: e */
    public AtomicAction parse(String str, JSONObject jSONObject) {
        AtomicAction atomicAction = super.parse(str, jSONObject);
        if (atomicAction == null) {
            return null;
        }
        atomicAction.putExtendProperty("calorie", jSONObject.optString("calorie"));
        atomicAction.putExtendProperty("duration", String.valueOf(jSONObject.optLong("duration")));
        atomicAction.putExtendProperty("actionStep", jSONObject.optString("actionStep"));
        atomicAction.putExtendProperty("breath", jSONObject.optString("breath"));
        atomicAction.putExtendProperty("commonError", jSONObject.optString("commonError"));
        atomicAction.putExtendProperty("feeling", jSONObject.optString("feeling"));
        atomicAction.putExtendProperty("introduceLyric", jSONObject.optString("introduceLyric"));
        List<Video> listA = a(jSONObject.optJSONArray("actionVideo"));
        if (njy.b(listA)) {
            atomicAction.putExtendProperty("actionVideo", new Gson().toJson(listA));
            atomicAction.setCovers(pcx.d(listA));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pictures");
        if (jSONArrayOptJSONArray != null) {
            atomicAction.putExtendProperty("pictures", jSONArrayOptJSONArray.toString());
        }
        return atomicAction;
    }

    private List<Video> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                Video video = new Video();
                video.saveId(jSONObjectOptJSONObject.optString("id"));
                video.saveName(jSONObjectOptJSONObject.optString("name"));
                video.saveType(jSONObjectOptJSONObject.optInt("type"));
                video.saveActionCount(jSONObjectOptJSONObject.optInt("actionCount"));
                video.saveDuring(jSONObjectOptJSONObject.optInt("during"));
                video.saveGender(jSONObjectOptJSONObject.optInt("sex"));
                video.saveLength(jSONObjectOptJSONObject.optInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE));
                video.saveThumbnail(jSONObjectOptJSONObject.optString("thumbnail"));
                video.saveUrl(jSONObjectOptJSONObject.optString("videoUrl"));
                video.saveLogoImgUrl(jSONObjectOptJSONObject.optString("logoImgUrl"));
                video.setIsLongVideo(jSONObjectOptJSONObject.optInt("isLongVideo"));
                video.setFileId(jSONObjectOptJSONObject.optString(RecommendConstants.FILE_ID));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("videoSegmentList");
                if (jSONArrayOptJSONArray != null) {
                    video.setVideoSegmentList(pcx.a(jSONArrayOptJSONArray, VideoSegment[].class));
                }
                arrayList.add(video);
            }
        }
        return arrayList;
    }
}

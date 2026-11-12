package defpackage;

import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pdd implements CloudDataParse<Topic> {
    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    public List<Topic> parse(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                Topic topic = parse(str, jSONObjectOptJSONObject);
                LogUtil.a("Suggestion_TopicDataParse", "topic name:", topic.acquireName());
                arrayList.add(topic);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Topic parse(String str, JSONObject jSONObject) {
        Topic topic = new Topic();
        if (jSONObject == null) {
            return topic;
        }
        topic.saveId(jSONObject.optInt("id"));
        topic.saveName(jSONObject.optString("name"));
        topic.saveNameId(jSONObject.optInt("nameId"));
        topic.saveVersion(jSONObject.optString("version"));
        topic.saveSerialNum(jSONObject.optString("serialNum"));
        topic.saveDisplayOrder(jSONObject.optInt("displayorder"));
        topic.saveWorkoutPreviewNum(jSONObject.optInt("workoutPreviewNum"));
        topic.saveWorkoutList(pda.a(jSONObject));
        topic.setSubtitle(jSONObject.optString("subTitle"));
        topic.setTopicBackImgUrl(jSONObject.optString("topicBackImgUrl"));
        topic.setDescription(jSONObject.optString("description"));
        topic.setCourseCategory(jSONObject.optInt("courseCategory"));
        return topic;
    }
}

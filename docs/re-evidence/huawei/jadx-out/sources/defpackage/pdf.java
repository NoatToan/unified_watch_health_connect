package defpackage;

import com.huawei.pluginfitnessadvice.RoadBook;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pdf implements CloudDataParse<RoadBook> {
    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    public List<RoadBook> parse(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(parse(str, jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public RoadBook parse(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new RoadBook();
        }
        return (RoadBook) peh.b(jSONObject.toString(), RoadBook.class);
    }
}

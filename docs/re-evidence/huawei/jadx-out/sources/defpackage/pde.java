package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pde implements CloudDataParse<pco> {
    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    public List<pco> parse(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                pco pcoVar = parse(str, jSONObjectOptJSONObject);
                LogUtil.a("Suggestion_OrderItemParse", "orderItem id = ", pcoVar.a(), " type = ", pcoVar.d(), " index = ", pcoVar.e(), " newUseWorkoutTime = ", pcoVar.b());
                arrayList.add(pcoVar);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public pco parse(String str, JSONObject jSONObject) {
        pco pcoVar = new pco();
        if (jSONObject == null) {
            return pcoVar;
        }
        pcoVar.e(jSONObject.optString("id"));
        pcoVar.c(Integer.valueOf(jSONObject.optInt("type")));
        pcoVar.e(Integer.valueOf(jSONObject.optInt("index")));
        pcoVar.a(Long.valueOf(jSONObject.optLong("newUseWorkoutTime")));
        return pcoVar;
    }
}

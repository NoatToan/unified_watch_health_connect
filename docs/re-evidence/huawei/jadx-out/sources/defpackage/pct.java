package defpackage;

import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParseBase;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pct extends CloudDataParseBase<ChoreographedSingleAction> {
    public pct(int i) {
        super(i);
    }

    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ChoreographedSingleAction parse(String str, JSONObject jSONObject) {
        ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
        choreographedSingleAction.setAction(pcr.d(this.mType).parse(str, jSONObject));
        choreographedSingleAction.setTargetConfig((TargetConfig) peh.b(jSONObject.optString("target"), TargetConfig.class));
        choreographedSingleAction.setIntensityConfig((TargetConfig) peh.b(jSONObject.optString("strength"), TargetConfig.class));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("playAudios");
        if (jSONArrayOptJSONArray != null) {
            choreographedSingleAction.setCommentaryGap(pcx.e(jSONArrayOptJSONArray, 4));
        }
        return choreographedSingleAction;
    }
}

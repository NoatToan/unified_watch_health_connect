package defpackage;

import com.huawei.pluginfitnessadvice.FitWorkout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pdc extends pcz {
    @Override // defpackage.pcz, com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: c */
    public FitWorkout parse(String str, JSONObject jSONObject) {
        FitWorkout fitWorkout = super.parse(str, jSONObject);
        fitWorkout.setMusicRunFlag(jSONObject.optInt("musicRunFlag", -1));
        return fitWorkout;
    }
}

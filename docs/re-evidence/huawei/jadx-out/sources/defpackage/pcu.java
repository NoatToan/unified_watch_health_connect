package defpackage;

import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParseBase;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pcu extends CloudDataParseBase<ChoreographedMultiActions> {
    public pcu(int i) {
        super(i);
    }

    @Override // com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ChoreographedMultiActions parse(String str, JSONObject jSONObject) {
        List<ChoreographedSingleAction> list = pcr.c(this.mType).parse(str, jSONObject.optJSONArray("actionList"));
        ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
        choreographedMultiActions.setActionList(list);
        choreographedMultiActions.setRepeatTimes(jSONObject.optInt("repeatTimes", 1));
        return choreographedMultiActions;
    }
}

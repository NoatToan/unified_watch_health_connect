package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cyo extends CloudCommonReponse {

    @SerializedName(ParsedFieldTag.GOAL)
    private List<cyp> d;

    public List<cyp> e() {
        return this.d;
    }

    public void c(List<cyp> list) {
        this.d = list;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("GetActiveTargetsRsp{goal=");
        stringBuffer.append(this.d);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}

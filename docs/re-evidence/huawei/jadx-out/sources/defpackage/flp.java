package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class flp extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("labelRules")
    private List<fli> f34188a;

    public List<fli> c() {
        return this.f34188a;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "QueryLabelRuleRsp{labelRules=" + this.f34188a + "}";
    }
}

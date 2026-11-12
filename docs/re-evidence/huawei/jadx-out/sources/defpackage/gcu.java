package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes29.dex */
public class gcu extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("interpretation")
    private String f34911b;

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "GetAISportsAnalysisInfoRsp{" + super.toString() + this.f34911b + "'}";
    }
}

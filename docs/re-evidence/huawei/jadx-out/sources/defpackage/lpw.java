package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.operation.utils.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lpw extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(Constants.VMALL_SIGN_INFO)
    private List<lqa> f40614b;

    @SerializedName("errorMessage")
    private String d;

    @SerializedName("errorCode")
    private int e;

    public int e() {
        return this.e;
    }

    public List<lqa> a() {
        return this.f40614b;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HonorPrivacyRsp{errorCode=");
        stringBuffer.append(this.e);
        stringBuffer.append(", errorMessage=").append(this.d);
        stringBuffer.append(", signInfos=").append(this.f40614b);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}

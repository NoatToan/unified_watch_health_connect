package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdj extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("hotPathOperationInfos")
    private List<gdr> f34927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("totalSize")
    private int f34928c;

    @SerializedName("citySupportPathAttribute")
    private gcm d;

    public List<gdr> c() {
        return this.f34927b;
    }

    public int d() {
        return this.f34928c;
    }

    public gcm e() {
        return this.d;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "GetHotPathsRsp{hotPathOperationInfos=" + this.f34927b + ", totalSize=" + this.f34928c + ", citySupportPathAttribute=" + this.d + '}';
    }
}

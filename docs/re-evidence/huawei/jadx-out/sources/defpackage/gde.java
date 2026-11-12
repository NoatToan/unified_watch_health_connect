package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes7.dex */
public class gde extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("citySupportPathAttribute")
    private gcm f34922a;

    @SerializedName("hotPathDetailInfo")
    private gdm e;

    public gdm b() {
        return this.e;
    }

    public gcm e() {
        return this.f34922a;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "GetHotPathDetailRsp{hotPathDetailInfo=" + this.e + ", citySupportPathAttribute=" + this.f34922a + '}';
    }
}

package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.vip.datatypes.MemberTypeInfo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class isd extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("memberTypeInfoList")
    private List<MemberTypeInfo> f38034c;

    public List<MemberTypeInfo> c() {
        return this.f38034c;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("memberTypeInfoList=");
        sb.append(this.f38034c);
        return sb.toString();
    }
}

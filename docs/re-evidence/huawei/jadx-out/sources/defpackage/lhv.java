package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lhv extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("versions")
    private Map<Integer, Long> f40174a;

    public Map<Integer, Long> a() {
        return this.f40174a;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("versions=");
        sb.append(this.f40174a);
        return sb.toString();
    }
}

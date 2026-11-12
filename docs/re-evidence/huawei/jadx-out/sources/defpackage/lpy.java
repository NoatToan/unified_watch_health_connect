package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes10.dex */
public class lpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("country")
    private String f40617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(Constants.VMALL_ARG_TYPE)
    private Integer f40618b;

    @SerializedName("branchId")
    private int e;

    public void c(Integer num) {
        this.f40618b = num;
    }

    public void c(String str) {
        this.f40617a = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HonorDevicePrivacy{agrType=");
        stringBuffer.append(this.f40618b);
        stringBuffer.append(", country=").append(this.f40617a);
        stringBuffer.append(", branchId=").append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}

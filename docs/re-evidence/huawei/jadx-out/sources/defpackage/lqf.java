package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes10.dex */
public class lqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isAgree")
    private boolean f40624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("branchId")
    private int f40625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("country")
    private String f40626c;

    @SerializedName(Constants.VMALL_ARG_TYPE)
    private Integer e;

    public void d(Integer num) {
        this.e = num;
    }

    public void d(String str) {
        this.f40626c = str;
    }

    public void a(boolean z) {
        this.f40624a = z;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HonorDevicePrivacy{agrType=");
        stringBuffer.append(this.e);
        stringBuffer.append(", country=").append(this.f40626c);
        stringBuffer.append(", branchId=").append(this.f40625b);
        stringBuffer.append(", isAgree=").append(this.f40624a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}

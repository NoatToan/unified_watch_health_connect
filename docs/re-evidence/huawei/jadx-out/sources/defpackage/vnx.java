package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes19.dex */
public class vnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("devId")
    private String f51386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(JsbMapKeyNames.H5_USER_ID)
    private Long f51387b;

    @SerializedName(BleConstants.DEV_INFO)
    private vnv e;

    public vnv b() {
        return this.e;
    }

    public String toString() {
        return "CommonDevice{devId=" + this.f51386a + ", devInfo=" + this.e + ", userId=" + this.f51387b + '}';
    }
}

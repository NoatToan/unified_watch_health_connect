package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes24.dex */
public class ddd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(BleConstants.KEY_PATH)
    String f31664c;

    @SerializedName("isNonsense")
    boolean d;

    @SerializedName("audioBeginTime")
    long e;

    public String b() {
        return this.f31664c;
    }

    public boolean c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public String toString() {
        return "SleepMonitorShare{path='" + this.f31664c + "', isNonsense=" + this.d + ", audioBeginTime=" + this.e + '}';
    }
}

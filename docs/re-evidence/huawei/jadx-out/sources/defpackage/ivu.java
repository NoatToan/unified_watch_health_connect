package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes33.dex */
public class ivu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(BleConstants.SPORT_TYPE)
    private int f38109a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("simpleContent")
    private String f38110c;

    @SerializedName("contentPath")
    private String e;

    public int b() {
        return this.f38109a;
    }

    public String d() {
        return this.e;
    }

    public String c() {
        return this.f38110c;
    }

    public String toString() {
        return "DivingModel{contentPath='" + this.e + "', sportType=" + this.f38109a + ", simpleContent='" + this.f38110c + "'}";
    }
}

package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes43.dex */
public class vyz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("start")
    private String f51723b;

    @SerializedName(BleConstants.LIMIT)
    private int d;

    public vyz(int i) {
        this.d = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.f51723b = str;
    }
}

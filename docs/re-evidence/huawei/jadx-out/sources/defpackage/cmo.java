package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.devicesdk.entity.ConnectMode;

/* JADX INFO: loaded from: classes4.dex */
public class cmo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("connectmode")
    private ConnectMode f1790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceIdentity")
    private String f1791c;

    @SerializedName("mIsHandshakeRunning")
    private boolean e;

    public void d(String str) {
        this.f1791c = str;
    }

    public ConnectMode b() {
        return this.f1790b;
    }

    public void d(ConnectMode connectMode) {
        this.f1790b = connectMode;
    }

    public boolean a() {
        return this.e;
    }

    public void e(boolean z) {
        this.e = z;
    }
}

package defpackage;

import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;

/* JADX INFO: loaded from: classes12.dex */
public class odh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthParam f44194b;
    private AbsPrimaryDevice d;
    private AbsPairedDevice e;

    private odh() {
    }

    static class b {
        private static final odh d = new odh();
    }

    public static odh c() {
        return b.d;
    }

    public void a(AuthParam authParam, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice) {
        this.f44194b = authParam;
        this.d = absPrimaryDevice;
        this.e = absPairedDevice;
    }

    public AuthParam a() {
        return this.f44194b;
    }

    public AbsPrimaryDevice e() {
        return this.d;
    }

    public AbsPairedDevice b() {
        return this.e;
    }
}

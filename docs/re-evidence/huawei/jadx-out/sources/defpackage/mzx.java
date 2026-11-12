package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42791c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private byte[] k;
    private String l;
    private String m;
    private String n;
    private long o;
    private String s;

    public mzx() {
        q();
    }

    private void q() {
        this.i = 0;
        this.f42791c = "";
        this.l = "SyncPairToken";
        this.m = "syncPairToken";
    }

    public String m() {
        return this.n;
    }

    public boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "udid is empty");
            return false;
        }
        this.n = str;
        return true;
    }

    public String b() {
        return this.d;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "deviceType is empty");
            return false;
        }
        this.d = str;
        return true;
    }

    public String h() {
        return this.f;
    }

    public boolean g(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 32) {
            this.f = str;
            return true;
        }
        LogUtil.j("TrustPairDevice", "model has wrong value");
        return false;
    }

    public String g() {
        return this.h;
    }

    public boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "manufactory is empty");
            return false;
        }
        this.h = str;
        return true;
    }

    public String j() {
        return this.j;
    }

    public boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "productId is empty");
            return false;
        }
        this.j = str;
        return true;
    }

    public String c() {
        return this.f42791c;
    }

    public boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "hiLinkVersion is empty");
            return false;
        }
        this.f42791c = str;
        return true;
    }

    public String n() {
        return this.l;
    }

    public boolean h(String str) {
        if (!TextUtils.isEmpty(str)) {
            if ("SyncPairToken".equals(str)) {
                this.l = str;
                return true;
            }
            LogUtil.j("TrustPairDevice", "service id is does not match");
            return false;
        }
        LogUtil.j("TrustPairDevice", "serviceId has wrong format");
        return false;
    }

    public String k() {
        return this.m;
    }

    public boolean i(String str) {
        if (!TextUtils.isEmpty(str)) {
            if ("syncPairToken".equals(str)) {
                this.m = str;
                return true;
            }
            LogUtil.j("TrustPairDevice", "service type does not match");
            return false;
        }
        LogUtil.j("TrustPairDevice", "serviceType has wrong format");
        return false;
    }

    public byte[] o() {
        LogUtil.a("TrustPairDevice", "getToken:", Integer.valueOf(this.k.length));
        return (byte[]) this.k.clone();
    }

    public boolean c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("TrustPairDevice", "setToken: token is null");
            this.k = new byte[0];
            return false;
        }
        LogUtil.a("TrustPairDevice", "setToken: token length is ", Integer.valueOf(bArr.length));
        this.k = (byte[]) bArr.clone();
        return true;
    }

    public String f() {
        return this.g;
    }

    public boolean b(String str) {
        this.g = str;
        return true;
    }

    public int d() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String a() {
        return this.f42789a;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "deviceName is empty");
            return false;
        }
        this.f42789a = str;
        return true;
    }

    public boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TrustPairDevice", "uuid is empty");
            return false;
        }
        this.s = str;
        return true;
    }

    public String p() {
        return this.s;
    }

    public int i() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public long l() {
        return this.o;
    }

    public boolean b(Long l) {
        if (l == null) {
            LogUtil.j("TrustPairDevice", "setPairState: pairState is null");
            return false;
        }
        this.o = l.longValue();
        return true;
    }

    public String e() {
        return this.f42790b;
    }

    public void d(String str) {
        this.f42790b = str;
    }
}

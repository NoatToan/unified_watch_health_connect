package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class mne {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41984c;
    private DeviceInfo e;
    private boolean f;
    private boolean g;
    private int h;
    private int k;
    private int n;
    private long l = 30000;
    private long i = 0;
    private int d = 1;
    private int j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f41983b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f41982a = new ArrayList(16);

    public DeviceInfo d() {
        return this.e;
    }

    public void e(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
    }

    public long n() {
        return this.l;
    }

    public void b(long j) {
        this.l = j;
    }

    public long i() {
        return this.i;
    }

    public void a(long j) {
        this.i = j;
    }

    public int h() {
        return this.k;
    }

    public void d(int i) {
        this.k = i;
    }

    public List<String> c() {
        return this.f41982a;
    }

    public int e() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public int j() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public boolean l() {
        return this.f;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public boolean o() {
        return this.g;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public int b() {
        return this.f41984c;
    }

    public void b(int i) {
        this.f41984c = i;
    }

    public int g() {
        return this.j;
    }

    public void c(int i) {
        this.j = i;
    }

    public List<String> a() {
        return this.f41983b;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwEphemerisManager_EphemerisDownloadInfo", "addDownloadFileName is empty");
            return;
        }
        if (this.j == 2 && "RXN_EE".equals(str)) {
            this.f41983b.add("rxn_ee_gps");
            this.f41983b.add("rxn_ee_gal");
            this.f41983b.add("rxn_ee_bds");
            return;
        }
        this.f41983b.add(str);
    }

    public int f() {
        return this.n;
    }

    public void h(int i) {
        this.n = i;
    }
}

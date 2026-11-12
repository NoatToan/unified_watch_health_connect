package defpackage;

import com.huawei.hihealth.HiHealthData;
import health.compact.a.HiCommonUtil;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39628c;
    private List<Integer> d;
    private long e;
    private int f;
    private int g;
    private String h;
    private int i;
    private int j;
    private int l;

    public kym() {
    }

    public kym(int i) {
        this.f39627b = i;
    }

    public kym(String str) {
        this.h = str;
    }

    public kym(int i, String str) {
        this.f39627b = i;
        this.h = str;
    }

    public kym(int i, int i2) {
        this.f39627b = i;
        this.l = i2;
    }

    public kym(int i, int i2, int i3, int i4) {
        this.f39627b = i;
        this.f = i2;
        this.l = i3;
        this.f39626a = i4;
    }

    public kym(int i, int i2, int i3) {
        this.f39627b = i3;
        this.f = i2;
        this.l = i;
    }

    public int f() {
        return this.j;
    }

    public void h(int i) {
        this.j = i;
    }

    public String j() {
        return this.h;
    }

    public int c() {
        return this.f39626a;
    }

    public void a(int i) {
        this.f39626a = i;
    }

    public int b() {
        return this.f39627b;
    }

    public void d(int i) {
        this.f39627b = i;
    }

    public int d() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public int i() {
        return this.l;
    }

    public void g(int i) {
        this.l = i;
    }

    public long e() {
        return this.f39628c;
    }

    public void d(long j) {
        this.f39628c = j;
    }

    public void c(int i) {
        this.i = i;
    }

    public int g() {
        return this.i;
    }

    public List<Integer> a() {
        return this.d;
    }

    public void b(List<Integer> list) {
        this.d = list;
    }

    public void e(int i) {
        this.g = i;
    }

    public int h() {
        return this.g;
    }

    public void e(long j) {
        this.e = j;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiHealthContext{app=");
        stringBuffer.append(this.f39627b);
        stringBuffer.append(", device=").append(this.f);
        stringBuffer.append(", client=").append(this.f39626a);
        stringBuffer.append(", who=").append(this.l);
        stringBuffer.append(", packageName='").append(this.h).append("', syncType=");
        stringBuffer.append(this.j);
        stringBuffer.append(", cloudDevice=").append(this.f39628c);
        stringBuffer.append(", needUploadData=").append(this.i);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public static void e(HiHealthData hiHealthData, kym kymVar) {
        if (HiCommonUtil.c(hiHealthData)) {
            LogUtil.d("HiH_HiHealthContext", "setSource hiHealthDatas == null");
            return;
        }
        if (HiCommonUtil.c(kymVar)) {
            LogUtil.d("HiH_HiHealthContext", "setSource hiContext == null");
            return;
        }
        hiHealthData.setUserId(kymVar.i());
        hiHealthData.setAppId(kymVar.b());
        hiHealthData.setDeviceId(kymVar.d());
        hiHealthData.setClientId(kymVar.c());
        hiHealthData.setSyncStatus(kymVar.f());
    }
}

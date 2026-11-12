package defpackage;

import android.content.ContentValues;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dru implements Comparable<dru> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f32274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32275c;
    private ContentValues d;
    private long e;
    private int g;
    private int h;
    private List<dru> i;
    private Object j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32273a = false;
    private boolean f = true;

    public boolean f() {
        return this.f;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public boolean h() {
        return this.f32273a;
    }

    public void d(boolean z) {
        this.f32273a = z;
    }

    public Object i() {
        return dym.d(this.j);
    }

    public void c(Object obj) {
        this.j = dym.d(obj);
    }

    public ContentValues d() {
        return this.d;
    }

    public void a(ContentValues contentValues) {
        this.d = contentValues;
    }

    public int e() {
        return ((Integer) dym.d(Integer.valueOf(this.g))).intValue();
    }

    public void d(int i) {
        this.g = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public long c() {
        return this.e;
    }

    public void d(long j) {
        this.e = j;
    }

    public int g() {
        return this.h;
    }

    public void c(int i) {
        this.h = i;
    }

    public String b() {
        return this.f32275c;
    }

    public void c(String str) {
        this.f32275c = str;
    }

    public List<dru> j() {
        return this.i;
    }

    public void b(List<dru> list) {
        this.i = list;
    }

    public DeviceInfo a() {
        return this.f32274b;
    }

    public void e(DeviceInfo deviceInfo) {
        this.f32274b = deviceInfo;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(dru druVar) {
        if (druVar == null) {
            return 1;
        }
        return Long.compare(druVar.c(), this.e);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return (obj instanceof dru) && this.e == ((dru) obj).c();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "DeviceGroupInfo{object=" + this.j + ", mContentValues=" + this.d + ", mDeviceType=" + this.g + ", line=" + this.f32273a + ", mCompareTime=" + this.e + ", mDisplayType=" + this.h + ", mCommonDeviceName='" + this.f32275c + "', mSportDeviceList=" + this.i + '}';
    }
}

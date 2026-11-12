package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gxr {
    private String g;
    private int i;
    private long n;
    private int o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f36203b = new int[8];
    private boolean h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36204c = 22103;
    private int e = 22101;
    private int j = 22104;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36202a = 22102;
    private int d = 22105;
    private Map<String, Long> f = new HashMap(16);
    private List<Map<String, Long>> k = new ArrayList(16);

    public int h() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public Map<String, Long> j() {
        return this.f;
    }

    public void b(Map<String, Long> map) {
        this.f = map;
    }

    public List<Map<String, Long>> f() {
        return this.k;
    }

    public void e(List<Map<String, Long>> list) {
        this.k = list;
    }

    public int i() {
        return this.o;
    }

    public void g(int i) {
        this.o = i;
    }

    public int d() {
        return this.f36204c;
    }

    public void e(int i) {
        this.f36204c = i;
    }

    public int b() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int c() {
        return this.j;
    }

    public void d(int i) {
        this.j = i;
    }

    public int e() {
        return this.f36202a;
    }

    public int a() {
        return this.d;
    }

    public boolean k() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public long l() {
        return this.n;
    }

    public void a(long j) {
        this.n = j;
    }

    public String g() {
        return this.g;
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(int i) {
        int[] iArr = this.f36203b;
        if (i < iArr.length && i > 0) {
            iArr[i] = iArr[i] + 1;
        } else {
            LogUtil.e("SleepDataQueryHelper", "out of range");
        }
    }

    public String toString() {
        return "SleepQueryHelperData{mDeviceId='" + this.g + "', mIdxSleep=" + this.i + ", mStartTime=" + this.n + ", mSleepDeviceType=" + this.o + ", mIsNeedOnlyManual=" + this.h + ", mDataTypeDeepSleep=" + this.f36204c + ", mDataTypeShallowSleep=" + this.e + ", mDataTypeWakeSleep=" + this.j + ", mDataTypeDreamSleep=" + this.f36202a + ", mDataTypeNoonSleep=" + this.d + ", mNoonMap=" + this.f + ", mNoonMapList=" + this.k + ", mSleepTypeCount=" + Arrays.toString(this.f36203b) + '}';
    }
}

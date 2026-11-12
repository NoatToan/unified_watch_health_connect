package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;

/* JADX INFO: loaded from: classes11.dex */
public class ntt extends CommonSegment {
    private static final long serialVersionUID = 4898624082127999532L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43707b;
    private int d;
    private String e;
    private int h = -1;
    private int i = -1;
    private int f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43708c = -1;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 8;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 0;
    }

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public int a() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int e() {
        return this.f43707b;
    }

    public void c(int i) {
        this.f43707b = i;
    }

    public int b() {
        return this.f43706a;
    }

    public void a(int i) {
        this.f43706a = i;
    }

    public void f(int i) {
        this.h = i;
    }

    public void e(int i) {
        this.i = i;
    }

    public void i(int i) {
        this.f = i;
    }

    public void b(int i) {
        this.f43708c = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        LogUtil.a("TrackExerciseSegment", "toTrackString");
        return "";
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        if (stringBuffer != null) {
            LogUtil.a("TrackExerciseSegment", "toTrackString stringBuffer");
        }
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr != null) {
            LogUtil.a("TrackExerciseSegment", "fromTrackString");
        }
    }

    public String toString() {
        return "TrackExerciseSegment{mActionId='" + this.e + ", mActionResultType=" + this.d + ", mActionResultValue=" + this.f43707b + ", mActionTargetValue=" + this.f43706a + ", mSectionStrengthType=" + this.h + ", mSectionStrengthStatistics=" + this.i + ", mSectionStrengthUpper=" + this.f + ", mSectionStrengthLower=" + this.f43708c + '}';
    }
}

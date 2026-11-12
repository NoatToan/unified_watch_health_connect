package i71;

import gg1.o0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Li71/x;", "", "Lyz1/d;", "status", "Lcom/garmin/android/apps/connectmobile/performance/model/b;", "trainingStatus", "", "sinceDate", "Le71/m;", "trainingLoadQualifier", "Li53/c;", "Li71/y;", "summaryTrainingStatusCardData", "Li41/h;", "hrvStatus", "", "altitudeAcclimationMeters", "heatAcclimationPercentage", "loadFocusPhraseResId", "vo2MaxZoneNameResId", "Lgg1/o0;", "preferredMeasurementSystem", "", "last4WeeksDataAvailable", "last2WeeksDataAvailable", "primaryTrainingDeviceCount", "<init>", "(Lyz1/d;Lcom/garmin/android/apps/connectmobile/performance/model/b;Ljava/lang/String;Le71/m;Li53/c;Li41/h;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lgg1/o0;ZZI)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f92012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.performance.model.b f92013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e71.m f92015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<y> f92016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i41.h f92017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f92018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f92019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f92020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f92021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f92022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f92023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f92024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f92025n;

    static {
        e71.m.a aVar = e71.m.f63320c;
    }

    public x(yz1.d dVar, com.garmin.android.apps.connectmobile.performance.model.b bVar, String str, e71.m mVar, i53.c<y> cVar, i41.h hVar, Integer num, Integer num2, Integer num3, Integer num4, o0 o0Var, boolean z14, boolean z15, int i14) {
        dVar.getClass();
        bVar.getClass();
        cVar.getClass();
        hVar.getClass();
        o0Var.getClass();
        this.f92012a = dVar;
        this.f92013b = bVar;
        this.f92014c = str;
        this.f92015d = mVar;
        this.f92016e = cVar;
        this.f92017f = hVar;
        this.f92018g = num;
        this.f92019h = num2;
        this.f92020i = num3;
        this.f92021j = num4;
        this.f92022k = o0Var;
        this.f92023l = z14;
        this.f92024m = z15;
        this.f92025n = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f92012a.equals(xVar.f92012a) && this.f92013b == xVar.f92013b && p005kotlin.jvm.internal.s.g(this.f92014c, xVar.f92014c) && p005kotlin.jvm.internal.s.g(this.f92015d, xVar.f92015d) && this.f92016e.equals(xVar.f92016e) && this.f92017f == xVar.f92017f && p005kotlin.jvm.internal.s.g(this.f92018g, xVar.f92018g) && p005kotlin.jvm.internal.s.g(this.f92019h, xVar.f92019h) && p005kotlin.jvm.internal.s.g(this.f92020i, xVar.f92020i) && p005kotlin.jvm.internal.s.g(this.f92021j, xVar.f92021j) && this.f92022k == xVar.f92022k && this.f92023l == xVar.f92023l && this.f92024m == xVar.f92024m && this.f92025n == xVar.f92025n;
    }

    public final int hashCode() {
        int iHashCode = (this.f92013b.hashCode() + (this.f92012a.hashCode() * 31)) * 31;
        String str = this.f92014c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e71.m mVar = this.f92015d;
        int iHashCode3 = (this.f92017f.hashCode() + l2.a(this.f92016e, (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31, 31)) * 31;
        Integer num = this.f92018g;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f92019h;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f92020i;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f92021j;
        return Integer.hashCode(this.f92025n) + q6.f.g(q6.f.g((this.f92022k.hashCode() + ((iHashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31)) * 31, 31, this.f92023l), 31, this.f92024m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingStatusKeyStatCardData(status=");
        sb3.append(this.f92012a);
        sb3.append(", trainingStatus=");
        sb3.append(this.f92013b);
        sb3.append(", sinceDate=");
        sb3.append(this.f92014c);
        sb3.append(", trainingLoadQualifier=");
        sb3.append(this.f92015d);
        sb3.append(", summaryTrainingStatusCardData=");
        sb3.append(this.f92016e);
        sb3.append(", hrvStatus=");
        sb3.append(this.f92017f);
        sb3.append(", altitudeAcclimationMeters=");
        j20.x.m(sb3, this.f92018g, ", heatAcclimationPercentage=", this.f92019h, ", loadFocusPhraseResId=");
        j20.x.m(sb3, this.f92020i, ", vo2MaxZoneNameResId=", this.f92021j, ", preferredMeasurementSystem=");
        sb3.append(this.f92022k);
        sb3.append(", last4WeeksDataAvailable=");
        sb3.append(this.f92023l);
        sb3.append(", last2WeeksDataAvailable=");
        sb3.append(this.f92024m);
        sb3.append(", primaryTrainingDeviceCount=");
        sb3.append(this.f92025n);
        sb3.append(")");
        return sb3.toString();
    }
}

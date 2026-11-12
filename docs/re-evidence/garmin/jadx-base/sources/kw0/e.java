package kw0;

import b63.o;
import com.garmin.android.apps.connectmobile.f3;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rBA\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lkw0/e;", "", "Lb63/o;", "calendarDate", "", "value", "weeklyDaysLoggedNo", "weeklyDaysLoggedYes", "weeklyDaysNoLogs", "<init>", "(Lb63/o;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "c", "a", "b", "Lkw0/e$a;", "Lkw0/e$b;", "Lkw0/e$c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f106917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f106918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f106919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f106920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f106921e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkw0/e$b;", "Lkw0/e;", "Lb63/o;", "calendarDate", "", "value", "weeklyDaysLoggedYes", "weeklyDaysLoggedNo", "weeklyDaysNoLogs", "<init>", "(Lb63/o;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o f106934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f106935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f106936h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f106937i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f106938j;

        public b(o oVar, Integer num, Integer num2, Integer num3, Integer num4) {
            super(oVar, num, num3, num2, num4, null);
            this.f106934f = oVar;
            this.f106935g = num;
            this.f106936h = num2;
            this.f106937i = num3;
            this.f106938j = num4;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final o getF106917a() {
            return this.f106934f;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getF106918b() {
            return this.f106935g;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF106919c() {
            return this.f106937i;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getF106920d() {
            return this.f106936h;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getF106921e() {
            return this.f106938j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f106934f, bVar.f106934f) && s.g(this.f106935g, bVar.f106935g) && s.g(this.f106936h, bVar.f106936h) && s.g(this.f106937i, bVar.f106937i) && s.g(this.f106938j, bVar.f106938j);
        }

        public final int hashCode() {
            o oVar = this.f106934f;
            int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
            Integer num = this.f106935g;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f106936h;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f106937i;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f106938j;
            return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("OvernightStress(calendarDate=");
            sb3.append(this.f106934f);
            sb3.append(", value=");
            sb3.append(this.f106935g);
            sb3.append(", weeklyDaysLoggedYes=");
            x.m(sb3, this.f106936h, ", weeklyDaysLoggedNo=", this.f106937i, ", weeklyDaysNoLogs=");
            return f3.i(sb3, this.f106938j, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkw0/e$c;", "Lkw0/e;", "Lb63/o;", "calendarDate", "", "value", "weeklyDaysLoggedYes", "weeklyDaysLoggedNo", "weeklyDaysNoLogs", "<init>", "(Lb63/o;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o f106939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f106940g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f106941h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f106942i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f106943j;

        public c(o oVar, Integer num, Integer num2, Integer num3, Integer num4) {
            super(oVar, num, num3, num2, num4, null);
            this.f106939f = oVar;
            this.f106940g = num;
            this.f106941h = num2;
            this.f106942i = num3;
            this.f106943j = num4;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final o getF106917a() {
            return this.f106939f;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getF106918b() {
            return this.f106940g;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF106919c() {
            return this.f106942i;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getF106920d() {
            return this.f106941h;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getF106921e() {
            return this.f106943j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f106939f, cVar.f106939f) && s.g(this.f106940g, cVar.f106940g) && s.g(this.f106941h, cVar.f106941h) && s.g(this.f106942i, cVar.f106942i) && s.g(this.f106943j, cVar.f106943j);
        }

        public final int hashCode() {
            o oVar = this.f106939f;
            int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
            Integer num = this.f106940g;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f106941h;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f106942i;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f106943j;
            return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SleepScore(calendarDate=");
            sb3.append(this.f106939f);
            sb3.append(", value=");
            sb3.append(this.f106940g);
            sb3.append(", weeklyDaysLoggedYes=");
            x.m(sb3, this.f106941h, ", weeklyDaysLoggedNo=", this.f106942i, ", weeklyDaysNoLogs=");
            return f3.i(sb3, this.f106943j, ")");
        }
    }

    public /* synthetic */ e(o oVar, Integer num, Integer num2, Integer num3, Integer num4, int i14, j jVar) {
        this(oVar, num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3, (i14 & 16) != 0 ? null : num4, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public o getF106917a() {
        return this.f106917a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Integer getF106918b() {
        return this.f106918b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Integer getF106919c() {
        return this.f106919c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public Integer getF106920d() {
        return this.f106920d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public Integer getF106921e() {
        return this.f106921e;
    }

    private e(o oVar, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f106917a = oVar;
        this.f106918b = num;
        this.f106919c = num2;
        this.f106920d = num3;
        this.f106921e = num4;
    }

    public /* synthetic */ e(o oVar, Integer num, Integer num2, Integer num3, Integer num4, j jVar) {
        this(oVar, num, num2, num3, num4);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkw0/e$a;", "Lkw0/e;", "Lb63/o;", "calendarDate", "", "value", "weeklyDaysLoggedYes", "weeklyDaysLoggedNo", "weeklyDaysNoLogs", "", "yMaximum", "yMinimum", "xMinimum", "xMaximum", "", "status", "Li41/a;", "baseline", "days", "<init>", "(Lb63/o;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Li41/a;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o f106922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f106923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f106924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f106925i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f106926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Float f106927k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Float f106928l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Float f106929m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Float f106930n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f106931o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final i41.a f106932p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f106933q;

        public /* synthetic */ a(o oVar, Integer num, Integer num2, Integer num3, Integer num4, Float f14, Float f15, Float f16, Float f17, String str, i41.a aVar, int i14, int i15, j jVar) {
            this(oVar, num, num2, num3, num4, (i15 & 32) != 0 ? null : f14, (i15 & 64) != 0 ? null : f15, (i15 & 128) != 0 ? null : f16, (i15 & 256) != 0 ? null : f17, (i15 & 512) != 0 ? null : str, (i15 & 1024) != 0 ? null : aVar, i14);
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final o getF106917a() {
            return this.f106922f;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getF106918b() {
            return this.f106923g;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF106919c() {
            return this.f106925i;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getF106920d() {
            return this.f106924h;
        }

        @Override // kw0.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getF106921e() {
            return this.f106926j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f106922f, aVar.f106922f) && s.g(this.f106923g, aVar.f106923g) && s.g(this.f106924h, aVar.f106924h) && s.g(this.f106925i, aVar.f106925i) && s.g(this.f106926j, aVar.f106926j) && s.g(this.f106927k, aVar.f106927k) && s.g(this.f106928l, aVar.f106928l) && s.g(this.f106929m, aVar.f106929m) && s.g(this.f106930n, aVar.f106930n) && s.g(this.f106931o, aVar.f106931o) && s.g(this.f106932p, aVar.f106932p) && this.f106933q == aVar.f106933q;
        }

        public final int hashCode() {
            o oVar = this.f106922f;
            int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
            Integer num = this.f106923g;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f106924h;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f106925i;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f106926j;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Float f14 = this.f106927k;
            int iHashCode6 = (iHashCode5 + (f14 == null ? 0 : f14.hashCode())) * 31;
            Float f15 = this.f106928l;
            int iHashCode7 = (iHashCode6 + (f15 == null ? 0 : f15.hashCode())) * 31;
            Float f16 = this.f106929m;
            int iHashCode8 = (iHashCode7 + (f16 == null ? 0 : f16.hashCode())) * 31;
            Float f17 = this.f106930n;
            int iHashCode9 = (iHashCode8 + (f17 == null ? 0 : f17.hashCode())) * 31;
            String str = this.f106931o;
            int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
            i41.a aVar = this.f106932p;
            return Integer.hashCode(this.f106933q) + ((iHashCode10 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("OvernightHrv(calendarDate=");
            sb3.append(this.f106922f);
            sb3.append(", value=");
            sb3.append(this.f106923g);
            sb3.append(", weeklyDaysLoggedYes=");
            x.m(sb3, this.f106924h, ", weeklyDaysLoggedNo=", this.f106925i, ", weeklyDaysNoLogs=");
            sb3.append(this.f106926j);
            sb3.append(", yMaximum=");
            sb3.append(this.f106927k);
            sb3.append(", yMinimum=");
            sb3.append(this.f106928l);
            sb3.append(", xMinimum=");
            sb3.append(this.f106929m);
            sb3.append(", xMaximum=");
            sb3.append(this.f106930n);
            sb3.append(", status=");
            sb3.append(this.f106931o);
            sb3.append(", baseline=");
            sb3.append(this.f106932p);
            sb3.append(", days=");
            sb3.append(this.f106933q);
            sb3.append(")");
            return sb3.toString();
        }

        public a(o oVar, Integer num, Integer num2, Integer num3, Integer num4, Float f14, Float f15, Float f16, Float f17, String str, i41.a aVar, int i14) {
            super(oVar, num, num3, num2, num4, null);
            this.f106922f = oVar;
            this.f106923g = num;
            this.f106924h = num2;
            this.f106925i = num3;
            this.f106926j = num4;
            this.f106927k = f14;
            this.f106928l = f15;
            this.f106929m = f16;
            this.f106930n = f17;
            this.f106931o = str;
            this.f106932p = aVar;
            this.f106933q = i14;
        }
    }
}

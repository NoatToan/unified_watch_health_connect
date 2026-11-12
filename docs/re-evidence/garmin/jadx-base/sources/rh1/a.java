package rh1;

import c22.n3;
import fw.m;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrh1/a;", "", "Lrh1/b;", "adjustedBodyComposition", "latestBodyComposition", "Lc22/n3;", "skeletalMuscleMassUnit", "Lfw/m;", "response", "", "isMeasurementDateValid", "<init>", "(Lrh1/b;Lrh1/b;Lc22/n3;Lfw/m;Z)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2881a f152744f = new C2881a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f152745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1.b f152746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3 f152747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m<rh1.b> f152748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f152749e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152750a;

        static {
            int[] iArr = new int[n3.values().length];
            try {
                iArr[n3.POUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f152750a = iArr;
        }
    }

    public /* synthetic */ a(rh1.b bVar, rh1.b bVar2, n3 n3Var, m mVar, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : bVar2, (i14 & 4) != 0 ? null : n3Var, (i14 & 8) != 0 ? null : mVar, (i14 & 16) != 0 ? true : z14);
    }

    public static a a(a aVar, rh1.b bVar, rh1.b bVar2, n3 n3Var, m mVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            bVar = aVar.f152745a;
        }
        rh1.b bVar3 = bVar;
        if ((i14 & 2) != 0) {
            bVar2 = aVar.f152746b;
        }
        rh1.b bVar4 = bVar2;
        if ((i14 & 4) != 0) {
            n3Var = aVar.f152747c;
        }
        n3 n3Var2 = n3Var;
        if ((i14 & 8) != 0) {
            mVar = aVar.f152748d;
        }
        m mVar2 = mVar;
        if ((i14 & 16) != 0) {
            z14 = aVar.f152749e;
        }
        aVar.getClass();
        return new a(bVar3, bVar4, n3Var2, mVar2, z14);
    }

    public final boolean b() {
        rh1.b bVar = this.f152745a;
        LocalDate measurementDate = bVar != null ? bVar.getMeasurementDate() : null;
        rh1.b bVar2 = this.f152746b;
        return (s.g(measurementDate, bVar2 != null ? bVar2.getMeasurementDate() : null) && s.d(bVar != null ? bVar.getBodyFatPercent() : null, bVar2 != null ? bVar2.getBodyFatPercent() : null) && s.g(bVar != null ? bVar.getMuscleMass() : null, bVar2 != null ? bVar2.getMuscleMass() : null)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f152745a, aVar.f152745a) && s.g(this.f152746b, aVar.f152746b) && this.f152747c == aVar.f152747c && s.g(this.f152748d, aVar.f152748d) && this.f152749e == aVar.f152749e;
    }

    public final int hashCode() {
        rh1.b bVar = this.f152745a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        rh1.b bVar2 = this.f152746b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        n3 n3Var = this.f152747c;
        int iHashCode3 = (iHashCode2 + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        m<rh1.b> mVar = this.f152748d;
        return Boolean.hashCode(this.f152749e) + ((iHashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdjustBodyCompositionState(adjustedBodyComposition=");
        sb3.append(this.f152745a);
        sb3.append(", latestBodyComposition=");
        sb3.append(this.f152746b);
        sb3.append(", skeletalMuscleMassUnit=");
        sb3.append(this.f152747c);
        sb3.append(", response=");
        sb3.append(this.f152748d);
        sb3.append(", isMeasurementDateValid=");
        return hb.a.k(sb3, this.f152749e, ")");
    }

    /* JADX INFO: renamed from: rh1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrh1/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2881a {
        public /* synthetic */ C2881a(j jVar) {
            this();
        }

        public static a a(rh1.b bVar, n3 n3Var, a aVar) {
            bVar.getClass();
            n3Var.getClass();
            aVar.getClass();
            if (bVar.getMeasurementDate() == null) {
                bVar = rh1.b.b(bVar, LocalDate.now(), null, null, 14);
            }
            rh1.b bVar2 = bVar;
            return a.a(aVar, bVar2, bVar2, n3Var, m.a.g(m.f73767e, bVar2, 1), false, 16);
        }

        private C2881a() {
        }
    }

    public a(rh1.b bVar, rh1.b bVar2, n3 n3Var, m<rh1.b> mVar, boolean z14) {
        this.f152745a = bVar;
        this.f152746b = bVar2;
        this.f152747c = n3Var;
        this.f152748d = mVar;
        this.f152749e = z14;
    }

    public a() {
        this(null, null, null, null, false, 31, null);
    }
}

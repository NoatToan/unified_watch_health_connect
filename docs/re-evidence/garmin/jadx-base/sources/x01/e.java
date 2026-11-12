package x01;

import fw.p;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx01/e;", "", "Lfw/p;", "status", "Lb63/l;", "lastUpdated", "Lx01/f;", "mfpStatus", "nutritionStatus", "", "hasNutritionPremiumFeature", "isTrialAvailable", "isChildAccount", "<init>", "(Lfw/p;Lb63/l;Lx01/f;Lx01/f;ZZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f188252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.l f188253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f188254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f188255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f188256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f188257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188258g;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(p pVar, b63.l lVar, f fVar, f fVar2, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        pVar = (i14 & 1) != 0 ? p.LOADING : pVar;
        if ((i14 & 2) != 0) {
            b63.l.INSTANCE.getClass();
            lVar = b63.l.f16201b;
        }
        this(pVar, lVar, (i14 & 4) != 0 ? f.NEVER : fVar, (i14 & 8) != 0 ? f.NEVER : fVar2, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? false : z16);
    }

    public static e a(e eVar, p pVar, b63.l lVar, int i14) {
        if ((i14 & 1) != 0) {
            pVar = eVar.f188252a;
        }
        p pVar2 = pVar;
        if ((i14 & 2) != 0) {
            lVar = eVar.f188253b;
        }
        b63.l lVar2 = lVar;
        f fVar = eVar.f188254c;
        f fVar2 = eVar.f188255d;
        boolean z14 = eVar.f188256e;
        boolean z15 = eVar.f188257f;
        boolean z16 = eVar.f188258g;
        eVar.getClass();
        pVar2.getClass();
        lVar2.getClass();
        fVar.getClass();
        fVar2.getClass();
        return new e(pVar2, lVar2, fVar, fVar2, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f188252a == eVar.f188252a && this.f188254c == eVar.f188254c && this.f188255d == eVar.f188255d && this.f188256e == eVar.f188256e && this.f188257f == eVar.f188257f && this.f188258g == eVar.f188258g;
    }

    public final int hashCode() {
        return Objects.hash(this.f188252a, this.f188254c, this.f188255d, Boolean.valueOf(this.f188256e), Boolean.valueOf(this.f188257f), Boolean.valueOf(this.f188258g));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionFeatureState(status=");
        sb3.append(this.f188252a);
        sb3.append(", lastUpdated=");
        sb3.append(this.f188253b);
        sb3.append(", mfpStatus=");
        sb3.append(this.f188254c);
        sb3.append(", nutritionStatus=");
        sb3.append(this.f188255d);
        sb3.append(", hasNutritionPremiumFeature=");
        kg.f.q(", isTrialAvailable=", ", isChildAccount=", sb3, this.f188256e, this.f188257f);
        return hb.a.k(sb3, this.f188258g, ")");
    }

    public e(p pVar, b63.l lVar, f fVar, f fVar2, boolean z14, boolean z15, boolean z16) {
        pVar.getClass();
        lVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        this.f188252a = pVar;
        this.f188253b = lVar;
        this.f188254c = fVar;
        this.f188255d = fVar2;
        this.f188256e = z14;
        this.f188257f = z15;
        this.f188258g = z16;
    }

    public e() {
        this(null, null, null, null, false, false, false, 127, null);
    }
}

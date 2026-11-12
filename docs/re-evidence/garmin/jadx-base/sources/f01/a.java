package f01;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lf01/a;", "", "", "lastUpdatedEpochMillis", "Lx01/f;", "mfpStatus", "nutritionStatus", "", "hasNutritionPremiumFeature", "isTrialAvailable", "isChildAccount", "<init>", "(JLx01/f;Lx01/f;ZZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLx01/f;Lx01/f;ZZZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f67667g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x01.f f67669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x01.f f67670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f67671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f67672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f67673f;

    /* JADX INFO: renamed from: f01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/CachedNutritionFeatureStateDTO.$serializer", "Lm63/e0;", "Lf01/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C1407a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1407a f67674a;
        private static final k63.e descriptor;

        static {
            C1407a c1407a = new C1407a();
            f67674a = c1407a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.CachedNutritionFeatureStateDTO", c1407a, 6);
            m1Var.j("lastUpdatedEpochMillis", false);
            m1Var.j("mfpStatus", false);
            m1Var.j("nutritionStatus", false);
            m1Var.j("hasNutritionPremiumFeature", false);
            m1Var.j("isTrialAvailable", false);
            m1Var.j("isChildAccount", false);
            descriptor = m1Var;
        }

        private C1407a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f67667g;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{v0.f117027a, lVarArr[1].getValue(), lVarArr[2].getValue(), gVar, gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f67667g;
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            boolean zG3 = false;
            long jW = 0;
            x01.f fVar = null;
            x01.f fVar2 = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        fVar = (x01.f) cVarC.l(eVar2, 1, lVarArr[1].getValue(), fVar);
                        i15 |= 2;
                        break;
                    case 2:
                        fVar2 = (x01.f) cVarC.l(eVar2, 2, lVarArr[2].getValue(), fVar2);
                        i15 |= 4;
                        break;
                    case 3:
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        zG2 = cVarC.g(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        zG3 = cVarC.g(eVar2, 5);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, jW, fVar, fVar2, zG, zG2, zG3, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f67667g;
            dVarC.z(eVar, 0, aVar.f67668a);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), aVar.f67669b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), aVar.f67670c);
            dVarC.n(eVar, 3, aVar.f67671d);
            dVarC.n(eVar, 4, aVar.f67672e);
            dVarC.n(eVar, 5, aVar.f67673f);
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f67667g = new l[]{null, m.a(nVar, new ey0.a(11)), m.a(nVar, new ey0.a(12)), null, null, null};
    }

    public /* synthetic */ a(int i14, long j8, x01.f fVar, x01.f fVar2, boolean z14, boolean z15, boolean z16, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, C1407a.f67674a.getF158591b());
            throw null;
        }
        this.f67668a = j8;
        this.f67669b = fVar;
        this.f67670c = fVar2;
        this.f67671d = z14;
        this.f67672e = z15;
        this.f67673f = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67668a == aVar.f67668a && this.f67669b == aVar.f67669b && this.f67670c == aVar.f67670c && this.f67671d == aVar.f67671d && this.f67672e == aVar.f67672e && this.f67673f == aVar.f67673f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67673f) + q6.f.g(q6.f.g((this.f67670c.hashCode() + ((this.f67669b.hashCode() + (Long.hashCode(this.f67668a) * 31)) * 31)) * 31, 31, this.f67671d), 31, this.f67672e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CachedNutritionFeatureStateDTO(lastUpdatedEpochMillis=");
        sb3.append(this.f67668a);
        sb3.append(", mfpStatus=");
        sb3.append(this.f67669b);
        sb3.append(", nutritionStatus=");
        sb3.append(this.f67670c);
        sb3.append(", hasNutritionPremiumFeature=");
        sb3.append(this.f67671d);
        com.airbnb.lottie.animation.keyframe.a.v(", isTrialAvailable=", ", isChildAccount=", sb3, this.f67672e, this.f67673f);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: f01.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf01/a$b;", "", "<init>", "()V", "Li63/c;", "Lf01/a;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1407a.f67674a;
        }

        private Companion() {
        }
    }

    public a(long j8, x01.f fVar, x01.f fVar2, boolean z14, boolean z15, boolean z16) {
        fVar.getClass();
        fVar2.getClass();
        this.f67668a = j8;
        this.f67669b = fVar;
        this.f67670c = fVar2;
        this.f67671d = z14;
        this.f67672e = z15;
        this.f67673f = z16;
    }
}

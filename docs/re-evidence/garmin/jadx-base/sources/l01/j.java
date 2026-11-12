package l01;

import b63.o;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Ll01/j;", "", "Lb63/o;", "targetDate", "", "dailyCalorieGoal", "Ll01/i;", "calculatedGramMacroGoals", "weightChangeRate", "", "weightChangeType", "<init>", "(Lb63/o;ILl01/i;ILjava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;ILl01/i;ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f107871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f107873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f107874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107875e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/settings/NutritionCalculatedTargetGoalsDTO.$serializer", "Lm63/e0;", "Ll01/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107876a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f107876a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.settings.NutritionCalculatedTargetGoalsDTO", aVar, 5);
            m1Var.j("targetDate", false);
            m1Var.j("dailyCalorieGoal", false);
            m1Var.j("calculatedGramMacroGoals", false);
            m1Var.j("weightChangeRate", false);
            m1Var.j("weightChangeType", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{h63.k.f82304a, m0Var, i.a.f107870a, m0Var, y1.f117048a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            o oVar = null;
            i iVar = null;
            String strR = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (o) cVarC.l(eVar2, 0, h63.k.f82304a, oVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    iA = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    iVar = (i) cVarC.l(eVar2, 2, i.a.f107870a, iVar);
                    i15 |= 4;
                } else if (iE == 3) {
                    iA2 = cVarC.A(eVar2, 3);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR = cVarC.r(eVar2, 4);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new j(i15, oVar, iA, iVar, iA2, strR, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.e(eVar, 0, h63.k.f82304a, jVar.f107871a);
            dVarC.v(1, jVar.f107872b, eVar);
            dVarC.e(eVar, 2, i.a.f107870a, jVar.f107873c);
            dVarC.v(3, jVar.f107874d, eVar);
            dVarC.k(eVar, 4, jVar.f107875e);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ j(int i14, o oVar, int i15, i iVar, int i16, String str, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, a.f107876a.getF158591b());
            throw null;
        }
        this.f107871a = oVar;
        this.f107872b = i15;
        this.f107873c = iVar;
        this.f107874d = i16;
        this.f107875e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f107871a, jVar.f107871a) && this.f107872b == jVar.f107872b && s.g(this.f107873c, jVar.f107873c) && this.f107874d == jVar.f107874d && s.g(this.f107875e, jVar.f107875e);
    }

    public final int hashCode() {
        return this.f107875e.hashCode() + q2.d(this.f107874d, (this.f107873c.hashCode() + q2.d(this.f107872b, this.f107871a.f16206a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionCalculatedTargetGoalsDTO(targetDate=");
        sb3.append(this.f107871a);
        sb3.append(", dailyCalorieGoal=");
        sb3.append(this.f107872b);
        sb3.append(", calculatedGramMacroGoals=");
        sb3.append(this.f107873c);
        sb3.append(", weightChangeRate=");
        sb3.append(this.f107874d);
        sb3.append(", weightChangeType=");
        return am.j.o(this.f107875e, ")", sb3);
    }

    /* JADX INFO: renamed from: l01.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/j$b;", "", "<init>", "()V", "Li63/c;", "Ll01/j;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f107876a;
        }

        private Companion() {
        }
    }

    public j(o oVar, int i14, i iVar, int i15, String str) {
        oVar.getClass();
        iVar.getClass();
        str.getClass();
        this.f107871a = oVar;
        this.f107872b = i14;
        this.f107873c = iVar;
        this.f107874d = i15;
        this.f107875e = str;
    }
}

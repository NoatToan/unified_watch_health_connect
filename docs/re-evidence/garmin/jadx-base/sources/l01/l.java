package l01;

import i3.e5;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import r1.q2;
import s21.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"Ll01/l;", "", "", "currentWeight", "targetWeight", "activeDailyCalories", "Ll01/a;", "activityMultiplierType", "Ls21/s;", "weightChangeType", "weightChangeRate", "userSuppliedDailyCalorieGoal", "Ll01/i;", "macroPercentages", "", "asOfDate", "<init>", "(IILjava/lang/Integer;Ll01/a;Ls21/s;Ljava/lang/Integer;Ljava/lang/Integer;Ll01/i;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Ll01/a;Ls21/s;Ljava/lang/Integer;Ljava/lang/Integer;Ll01/i;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f107897j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f107900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l01.a f107901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f107902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f107903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f107904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f107905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f107906i;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/settings/NutritionTargetGoalsInputDTO.$serializer", "Lm63/e0;", "Ll01/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107907a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f107907a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.settings.NutritionTargetGoalsInputDTO", aVar, 9);
            m1Var.j("currentWeight", false);
            m1Var.j("targetWeight", false);
            m1Var.j("activeDailyCalories", true);
            m1Var.j("activityLevel", true);
            m1Var.j("weightChangeType", true);
            m1Var.j("weightChangeRate", true);
            m1Var.j("userSuppliedDailyCalorieGoal", true);
            m1Var.j("macroPercentages", false);
            m1Var.j("asOfDate", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = l.f107897j;
            m0 m0Var = m0.f116981a;
            return new i63.c[]{m0Var, m0Var, j63.a.d(m0Var), j63.a.d(lVarArr[3].getValue()), j63.a.d(lVarArr[4].getValue()), j63.a.d(m0Var), j63.a.d(m0Var), i.a.f107870a, y1.f117048a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = l.f107897j;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            i iVar = null;
            Integer num = null;
            l01.a aVar = null;
            s sVar = null;
            Integer num2 = null;
            Integer num3 = null;
            String strR = null;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        iA = cVarC.A(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        iA2 = cVarC.A(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        num = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num);
                        i15 |= 4;
                        break;
                    case 3:
                        aVar = (l01.a) cVarC.v(eVar2, 3, lVarArr[3].getValue(), aVar);
                        i15 |= 8;
                        break;
                    case 4:
                        sVar = (s) cVarC.v(eVar2, 4, lVarArr[4].getValue(), sVar);
                        i15 |= 16;
                        break;
                    case 5:
                        num2 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num2);
                        i15 |= 32;
                        break;
                    case 6:
                        num3 = (Integer) cVarC.v(eVar2, 6, m0.f116981a, num3);
                        i15 |= 64;
                        break;
                    case 7:
                        iVar = (i) cVarC.l(eVar2, 7, i.a.f107870a, iVar);
                        i15 |= 128;
                        break;
                    case 8:
                        strR = cVarC.r(eVar2, 8);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new l(i15, iA, iA2, num, aVar, sVar, num2, num3, iVar, strR, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l lVar = (l) obj;
            lVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = l.f107897j;
            int i14 = lVar.f107898a;
            Integer num = lVar.f107904g;
            Integer num2 = lVar.f107903f;
            s sVar = lVar.f107902e;
            l01.a aVar = lVar.f107901d;
            Integer num3 = lVar.f107900c;
            dVarC.v(0, i14, eVar);
            dVarC.v(1, lVar.f107899b, eVar);
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 2, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || aVar != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), aVar);
            }
            if (dVarC.C(eVar) || sVar != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), sVar);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 5, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 6, m0.f116981a, num);
            }
            dVarC.e(eVar, 7, i.a.f107870a, lVar.f107905h);
            dVarC.k(eVar, 8, lVar.f107906i);
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f107897j = new o13.l[]{null, null, null, m.a(nVar, new b(8)), m.a(nVar, new b(9)), null, null, null, null};
    }

    public /* synthetic */ l(int i14, int i15, int i16, Integer num, l01.a aVar, s sVar, Integer num2, Integer num3, i iVar, String str, u1 u1Var) {
        if (387 != (i14 & 387)) {
            k1.h(i14, 387, a.f107907a.getF158591b());
            throw null;
        }
        this.f107898a = i15;
        this.f107899b = i16;
        if ((i14 & 4) == 0) {
            this.f107900c = null;
        } else {
            this.f107900c = num;
        }
        if ((i14 & 8) == 0) {
            this.f107901d = null;
        } else {
            this.f107901d = aVar;
        }
        if ((i14 & 16) == 0) {
            this.f107902e = null;
        } else {
            this.f107902e = sVar;
        }
        if ((i14 & 32) == 0) {
            this.f107903f = null;
        } else {
            this.f107903f = num2;
        }
        if ((i14 & 64) == 0) {
            this.f107904g = null;
        } else {
            this.f107904g = num3;
        }
        this.f107905h = iVar;
        this.f107906i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f107898a == lVar.f107898a && this.f107899b == lVar.f107899b && p005kotlin.jvm.internal.s.g(this.f107900c, lVar.f107900c) && this.f107901d == lVar.f107901d && this.f107902e == lVar.f107902e && p005kotlin.jvm.internal.s.g(this.f107903f, lVar.f107903f) && p005kotlin.jvm.internal.s.g(this.f107904g, lVar.f107904g) && p005kotlin.jvm.internal.s.g(this.f107905h, lVar.f107905h) && p005kotlin.jvm.internal.s.g(this.f107906i, lVar.f107906i);
    }

    public final int hashCode() {
        int iD = q2.d(this.f107899b, Integer.hashCode(this.f107898a) * 31, 31);
        Integer num = this.f107900c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        l01.a aVar = this.f107901d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s sVar = this.f107902e;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Integer num2 = this.f107903f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f107904g;
        return this.f107906i.hashCode() + ((this.f107905h.hashCode() + ((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f107898a, this.f107899b, "NutritionTargetGoalsInputDTO(currentWeight=", ", targetWeight=", ", activeDailyCalories=");
        sbJ.append(this.f107900c);
        sbJ.append(", activityMultiplierType=");
        sbJ.append(this.f107901d);
        sbJ.append(", weightChangeType=");
        sbJ.append(this.f107902e);
        sbJ.append(", weightChangeRate=");
        sbJ.append(this.f107903f);
        sbJ.append(", userSuppliedDailyCalorieGoal=");
        sbJ.append(this.f107904g);
        sbJ.append(", macroPercentages=");
        sbJ.append(this.f107905h);
        sbJ.append(", asOfDate=");
        return am.j.o(this.f107906i, ")", sbJ);
    }

    /* JADX INFO: renamed from: l01.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/l$b;", "", "<init>", "()V", "Li63/c;", "Ll01/l;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l> serializer() {
            return a.f107907a;
        }

        private Companion() {
        }
    }

    public l(int i14, int i15, Integer num, l01.a aVar, s sVar, Integer num2, Integer num3, i iVar, String str) {
        iVar.getClass();
        str.getClass();
        this.f107898a = i14;
        this.f107899b = i15;
        this.f107900c = num;
        this.f107901d = aVar;
        this.f107902e = sVar;
        this.f107903f = num2;
        this.f107904g = num3;
        this.f107905h = iVar;
        this.f107906i = str;
    }

    public /* synthetic */ l(int i14, int i15, Integer num, l01.a aVar, s sVar, Integer num2, Integer num3, i iVar, String str, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? null : num, (i16 & 8) != 0 ? null : aVar, (i16 & 16) != 0 ? null : sVar, (i16 & 32) != 0 ? null : num2, (i16 & 64) != 0 ? null : num3, iVar, str);
    }
}

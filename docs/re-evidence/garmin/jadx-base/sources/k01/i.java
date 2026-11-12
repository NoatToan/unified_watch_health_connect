package k01;

import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lk01/i;", "", "", "mealId", "", "mealName", "", "translated", "", "displayOrder", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f102064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f102066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f102067d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/reports/ThinMealDTO.$serializer", "Lm63/e0;", "Lk01/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102068a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f102068a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.reports.ThinMealDTO", aVar, 4);
            m1Var.j("mealId", false);
            m1Var.j("mealName", false);
            m1Var.j("translated", false);
            m1Var.j("displayOrder", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(v0.f117027a), j63.a.d(y1.f117048a), j63.a.d(m63.g.f116948a), j63.a.d(m0.f116981a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            String str = null;
            Boolean bool = null;
            Integer num = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else if (iE == 2) {
                    bool = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    num = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, l14, str, bool, num, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.d(eVar, 0, v0.f117027a, iVar.f102064a);
            dVarC.d(eVar, 1, y1.f117048a, iVar.f102065b);
            dVarC.d(eVar, 2, m63.g.f116948a, iVar.f102066c);
            dVarC.d(eVar, 3, m0.f116981a, iVar.f102067d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ i(int i14, Long l14, String str, Boolean bool, Integer num, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f102068a.getF158591b());
            throw null;
        }
        this.f102064a = l14;
        this.f102065b = str;
        this.f102066c = bool;
        this.f102067d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f102064a, iVar.f102064a) && s.g(this.f102065b, iVar.f102065b) && s.g(this.f102066c, iVar.f102066c) && s.g(this.f102067d, iVar.f102067d);
    }

    public final int hashCode() {
        Long l14 = this.f102064a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f102065b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f102066c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f102067d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("ThinMealDTO(mealId=", ", mealName=", this.f102065b, this.f102064a, ", translated=");
        sbJ.append(this.f102066c);
        sbJ.append(", displayOrder=");
        sbJ.append(this.f102067d);
        sbJ.append(")");
        return sbJ.toString();
    }

    /* JADX INFO: renamed from: k01.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/i$b;", "", "<init>", "()V", "Li63/c;", "Lk01/i;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f102068a;
        }

        private Companion() {
        }
    }

    public i(Long l14, String str, Boolean bool, Integer num) {
        this.f102064a = l14;
        this.f102065b = str;
        this.f102066c = bool;
        this.f102067d = num;
    }
}

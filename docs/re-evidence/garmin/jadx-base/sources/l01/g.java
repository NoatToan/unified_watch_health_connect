package l01;

import ch.qos.logback.core.joran.action.Action;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0015"}, d2 = {"Ll01/g;", "", "", "name", Action.KEY_ATTRIBUTE, "unit", "", "goalValue", "", "enabled", "", "displayOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f107859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f107860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f107861f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/settings/MicronutrientDTO.$serializer", "Lm63/e0;", "Ll01/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107862a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f107862a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.settings.MicronutrientDTO", aVar, 6);
            m1Var.j("name", false);
            m1Var.j(Action.KEY_ATTRIBUTE, false);
            m1Var.j("unit", false);
            m1Var.j("goalValue", true);
            m1Var.j("enabled", false);
            m1Var.j("displayOrder", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(x.f117036a), m63.g.f116948a, j63.a.d(m0.f116981a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            String str = null;
            String str2 = null;
            String str3 = null;
            Double d14 = null;
            Integer num = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        break;
                    case 1:
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        break;
                    case 2:
                        str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                        i15 |= 4;
                        break;
                    case 3:
                        d14 = (Double) cVarC.v(eVar2, 3, x.f117036a, d14);
                        i15 |= 8;
                        break;
                    case 4:
                        zG = cVarC.g(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        num = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, str, str2, str3, d14, zG, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            y1 y1Var = y1.f117048a;
            String str = gVar.f107856a;
            Double d14 = gVar.f107859d;
            dVarC.d(eVar, 0, y1Var, str);
            dVarC.d(eVar, 1, y1Var, gVar.f107857b);
            dVarC.d(eVar, 2, y1Var, gVar.f107858c);
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 3, x.f117036a, d14);
            }
            dVarC.n(eVar, 4, gVar.f107860e);
            dVarC.d(eVar, 5, m0.f116981a, gVar.f107861f);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ g(int i14, String str, String str2, String str3, Double d14, boolean z14, Integer num, u1 u1Var) {
        if (55 != (i14 & 55)) {
            k1.h(i14, 55, a.f107862a.getF158591b());
            throw null;
        }
        this.f107856a = str;
        this.f107857b = str2;
        this.f107858c = str3;
        if ((i14 & 8) == 0) {
            this.f107859d = null;
        } else {
            this.f107859d = d14;
        }
        this.f107860e = z14;
        this.f107861f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f107856a, gVar.f107856a) && s.g(this.f107857b, gVar.f107857b) && s.g(this.f107858c, gVar.f107858c) && s.g(this.f107859d, gVar.f107859d) && this.f107860e == gVar.f107860e && s.g(this.f107861f, gVar.f107861f);
    }

    public final int hashCode() {
        String str = this.f107856a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f107857b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f107858c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f107859d;
        int iG = q6.f.g((iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.f107860e);
        Integer num = this.f107861f;
        return iG + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("MicronutrientDTO(name=", this.f107856a, ", key=", this.f107857b, ", unit=");
        b71.i.x(sbI, this.f107858c, ", goalValue=", this.f107859d, ", enabled=");
        sbI.append(this.f107860e);
        sbI.append(", displayOrder=");
        sbI.append(this.f107861f);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: l01.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/g$b;", "", "<init>", "()V", "Li63/c;", "Ll01/g;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f107862a;
        }

        private Companion() {
        }
    }

    public g(String str, String str2, String str3, Double d14, boolean z14, Integer num) {
        this.f107856a = str;
        this.f107857b = str2;
        this.f107858c = str3;
        this.f107859d = d14;
        this.f107860e = z14;
        this.f107861f = num;
    }

    public /* synthetic */ g(String str, String str2, String str3, Double d14, boolean z14, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, (i14 & 8) != 0 ? null : d14, z14, num);
    }
}

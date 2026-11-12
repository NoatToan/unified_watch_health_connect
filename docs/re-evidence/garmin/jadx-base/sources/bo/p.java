package bo;

import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lbo/p;", "", "", "unitId", "", "unitKey", "", "factor", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f19232c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/UnitDTO.$serializer", "Lm63/e0;", "Lbo/p;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19233a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19233a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.UnitDTO", aVar, 3);
            m1Var.j("unitId", true);
            m1Var.j("unitKey", true);
            m1Var.j("factor", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(v0.f117027a), j63.a.d(y1.f117048a), j63.a.d(x.f117036a)};
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
            Double d14 = null;
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
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    d14 = (Double) cVarC.v(eVar2, 2, x.f117036a, d14);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new p(i15, l14, str, d14, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            p pVar = (p) obj;
            pVar.getClass();
            Double d14 = pVar.f19232c;
            String str = pVar.f19231b;
            Long l14 = pVar.f19230a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 0, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 2, x.f117036a, d14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ p(int i14, Long l14, String str, Double d14, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19230a = null;
        } else {
            this.f19230a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f19231b = null;
        } else {
            this.f19231b = str;
        }
        if ((i14 & 4) == 0) {
            this.f19232c = null;
        } else {
            this.f19232c = d14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return s.g(this.f19230a, pVar.f19230a) && s.g(this.f19231b, pVar.f19231b) && s.g(this.f19232c, pVar.f19232c);
    }

    public final int hashCode() {
        Long l14 = this.f19230a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f19231b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.f19232c;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return b71.i.g(b71.i.j("UnitDTO(unitId=", ", unitKey=", this.f19231b, this.f19230a, ", factor="), this.f19232c, ")");
    }

    /* JADX INFO: renamed from: bo.p$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/p$b;", "", "<init>", "()V", "Li63/c;", "Lbo/p;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<p> serializer() {
            return a.f19233a;
        }

        private Companion() {
        }
    }

    public p() {
        this((Long) null, (String) null, (Double) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public p(Long l14, String str, Double d14) {
        this.f19230a = l14;
        this.f19231b = str;
        this.f19232c = d14;
    }

    public /* synthetic */ p(Long l14, String str, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : d14);
    }
}

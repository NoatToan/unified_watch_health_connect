package in0;

import com.garmin.android.gncs.NotificationConstants;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lin0/i;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "value", "baselineUpperLimit", "baselineLowerLimit", "status", "percentage", "feedbackKey", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f94464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f94465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f94466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f94467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f94468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f94469g;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/healthstatus/data/model/HealthStatusMetricDTO.$serializer", "Lm63/e0;", "Lin0/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f94470a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f94470a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.healthstatus.data.model.HealthStatusMetricDTO", aVar, 7);
            m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, true);
            m1Var.j("value", true);
            m1Var.j("baselineUpperLimit", true);
            m1Var.j("baselineLowerLimit", true);
            m1Var.j("status", true);
            m1Var.j("percentage", true);
            m1Var.j("feedbackKey", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            x xVar = x.f117036a;
            return new i63.c[]{cVarD, j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(y1Var), j63.a.d(xVar), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            String str2 = null;
            Double d17 = null;
            String str3 = null;
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
                        d14 = (Double) cVarC.v(eVar2, 1, x.f117036a, d14);
                        i15 |= 2;
                        break;
                    case 2:
                        d15 = (Double) cVarC.v(eVar2, 2, x.f117036a, d15);
                        i15 |= 4;
                        break;
                    case 3:
                        d16 = (Double) cVarC.v(eVar2, 3, x.f117036a, d16);
                        i15 |= 8;
                        break;
                    case 4:
                        str2 = (String) cVarC.v(eVar2, 4, y1.f117048a, str2);
                        i15 |= 16;
                        break;
                    case 5:
                        d17 = (Double) cVarC.v(eVar2, 5, x.f117036a, d17);
                        i15 |= 32;
                        break;
                    case 6:
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, str, d14, d15, d16, str2, d17, str3, (u1) null);
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
            String str = iVar.f94469g;
            Double d14 = iVar.f94468f;
            String str2 = iVar.f94467e;
            Double d15 = iVar.f94466d;
            Double d16 = iVar.f94465c;
            Double d17 = iVar.f94464b;
            String str3 = iVar.f94463a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 1, x.f117036a, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 2, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 3, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 5, x.f117036a, d14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 6, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ i(int i14, String str, Double d14, Double d15, Double d16, String str2, Double d17, String str3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f94463a = null;
        } else {
            this.f94463a = str;
        }
        if ((i14 & 2) == 0) {
            this.f94464b = null;
        } else {
            this.f94464b = d14;
        }
        if ((i14 & 4) == 0) {
            this.f94465c = null;
        } else {
            this.f94465c = d15;
        }
        if ((i14 & 8) == 0) {
            this.f94466d = null;
        } else {
            this.f94466d = d16;
        }
        if ((i14 & 16) == 0) {
            this.f94467e = null;
        } else {
            this.f94467e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f94468f = null;
        } else {
            this.f94468f = d17;
        }
        if ((i14 & 64) == 0) {
            this.f94469g = null;
        } else {
            this.f94469g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f94463a, iVar.f94463a) && s.g(this.f94464b, iVar.f94464b) && s.g(this.f94465c, iVar.f94465c) && s.g(this.f94466d, iVar.f94466d) && s.g(this.f94467e, iVar.f94467e) && s.g(this.f94468f, iVar.f94468f) && s.g(this.f94469g, iVar.f94469g);
    }

    public final int hashCode() {
        String str = this.f94463a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.f94464b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f94465c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f94466d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        String str2 = this.f94467e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d17 = this.f94468f;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str3 = this.f94469g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HealthStatusMetricDTO(type=");
        sb3.append(this.f94463a);
        sb3.append(", value=");
        sb3.append(this.f94464b);
        sb3.append(", baselineUpperLimit=");
        b71.i.p(this.f94465c, this.f94466d, ", baselineLowerLimit=", ", status=", sb3);
        b71.i.x(sb3, this.f94467e, ", percentage=", this.f94468f, ", feedbackKey=");
        return am.j.o(this.f94469g, ")", sb3);
    }

    /* JADX INFO: renamed from: in0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin0/i$b;", "", "<init>", "()V", "Li63/c;", "Lin0/i;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f94470a;
        }

        private Companion() {
        }
    }

    public i() {
        this((String) null, (Double) null, (Double) null, (Double) null, (String) null, (Double) null, (String) null, 127, (p005kotlin.jvm.internal.j) null);
    }

    public i(String str, Double d14, Double d15, Double d16, String str2, Double d17, String str3) {
        this.f94463a = str;
        this.f94464b = d14;
        this.f94465c = d15;
        this.f94466d = d16;
        this.f94467e = str2;
        this.f94468f = d17;
        this.f94469g = str3;
    }

    public /* synthetic */ i(String str, Double d14, Double d15, Double d16, String str2, Double d17, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : str3);
    }
}

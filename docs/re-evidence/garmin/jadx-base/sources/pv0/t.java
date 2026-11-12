package pv0;

import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpv0/t;", "", "", "calendarDate", "", "value", "", "weeklyDaysLoggedNo", "weeklyDaysLoggedYes", "weeklyDaysNoLogs", "Li41/f;", "hrvSummary", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Li41/f;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Li41/f;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f141420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f141421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f141422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f141423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i41.f f141424f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/logging/data/model/MetricValueDTO.$serializer", "Lm63/e0;", "Lpv0/t;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f141425a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f141425a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.logging.data.model.MetricValueDTO", aVar, 6);
            m1Var.j("calendarDate", true);
            m1Var.j("value", true);
            m1Var.j("weeklyDaysLoggedNo", true);
            m1Var.j("weeklyDaysLoggedYes", true);
            m1Var.j("weeklyDaysNoLogs", true);
            m1Var.j("hrvSummary", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(y1.f117048a);
            i63.c<?> cVarD2 = j63.a.d(m63.x.f117036a);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(i41.f.a.f90935a)};
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
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            i41.f fVar = null;
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
                        d14 = (Double) cVarC.v(eVar2, 1, m63.x.f117036a, d14);
                        i15 |= 2;
                        break;
                    case 2:
                        num = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num);
                        i15 |= 4;
                        break;
                    case 3:
                        num2 = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num2);
                        i15 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num3);
                        i15 |= 16;
                        break;
                    case 5:
                        fVar = (i41.f) cVarC.v(eVar2, 5, i41.f.a.f90935a, fVar);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new t(i15, str, d14, num, num2, num3, fVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            t tVar = (t) obj;
            tVar.getClass();
            i41.f fVar2 = tVar.f141424f;
            Integer num = tVar.f141423e;
            Integer num2 = tVar.f141422d;
            Integer num3 = tVar.f141421c;
            Double d14 = tVar.f141420b;
            String str = tVar.f141419a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 0, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 1, m63.x.f117036a, d14);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 2, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 3, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 4, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || fVar2 != null) {
                dVarC.d(eVar, 5, i41.f.a.f90935a, fVar2);
            }
            dVarC.b(eVar);
        }
    }

    static {
        i41.f.Companion companion = i41.f.INSTANCE;
    }

    public /* synthetic */ t(int i14, String str, Double d14, Integer num, Integer num2, Integer num3, i41.f fVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f141419a = null;
        } else {
            this.f141419a = str;
        }
        if ((i14 & 2) == 0) {
            this.f141420b = null;
        } else {
            this.f141420b = d14;
        }
        if ((i14 & 4) == 0) {
            this.f141421c = null;
        } else {
            this.f141421c = num;
        }
        if ((i14 & 8) == 0) {
            this.f141422d = null;
        } else {
            this.f141422d = num2;
        }
        if ((i14 & 16) == 0) {
            this.f141423e = null;
        } else {
            this.f141423e = num3;
        }
        if ((i14 & 32) == 0) {
            this.f141424f = null;
        } else {
            this.f141424f = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f141419a, tVar.f141419a) && p005kotlin.jvm.internal.s.g(this.f141420b, tVar.f141420b) && p005kotlin.jvm.internal.s.g(this.f141421c, tVar.f141421c) && p005kotlin.jvm.internal.s.g(this.f141422d, tVar.f141422d) && p005kotlin.jvm.internal.s.g(this.f141423e, tVar.f141423e) && p005kotlin.jvm.internal.s.g(this.f141424f, tVar.f141424f);
    }

    public final int hashCode() {
        String str = this.f141419a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.f141420b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.f141421c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f141422d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f141423e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        i41.f fVar = this.f141424f;
        return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MetricValueDTO(calendarDate=");
        sb3.append(this.f141419a);
        sb3.append(", value=");
        sb3.append(this.f141420b);
        sb3.append(", weeklyDaysLoggedNo=");
        j20.x.m(sb3, this.f141421c, ", weeklyDaysLoggedYes=", this.f141422d, ", weeklyDaysNoLogs=");
        sb3.append(this.f141423e);
        sb3.append(", hrvSummary=");
        sb3.append(this.f141424f);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: pv0.t$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/t$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/t;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<t> serializer() {
            return a.f141425a;
        }

        private Companion() {
        }
    }

    public t() {
        this((String) null, (Double) null, (Integer) null, (Integer) null, (Integer) null, (i41.f) null, 63, (p005kotlin.jvm.internal.j) null);
    }

    public t(String str, Double d14, Integer num, Integer num2, Integer num3, i41.f fVar) {
        this.f141419a = str;
        this.f141420b = d14;
        this.f141421c = num;
        this.f141422d = num2;
        this.f141423e = num3;
        this.f141424f = fVar;
    }

    public /* synthetic */ t(String str, Double d14, Integer num, Integer num2, Integer num3, i41.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : fVar);
    }
}

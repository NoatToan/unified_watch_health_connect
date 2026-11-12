package yw1;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lyw1/v;", "", "", "calendarDate", "", "vo2MaxValue", "vo2MaxPreciseValue", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f199986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f199987c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/Vo2RecordDTO.$serializer", "Lm63/e0;", "Lyw1/v;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199988a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199988a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.Vo2RecordDTO", aVar, 3);
            m1Var.j("calendarDate", false);
            m1Var.j("vo2MaxValue", false);
            m1Var.j("vo2MaxPreciseValue", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(y1.f117048a);
            x xVar = x.f117036a;
            return new i63.c[]{cVarD, j63.a.d(xVar), j63.a.d(xVar)};
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
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    d14 = (Double) cVarC.v(eVar2, 1, x.f117036a, d14);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    d15 = (Double) cVarC.v(eVar2, 2, x.f117036a, d15);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new v(i15, str, d14, d15, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            v vVar = (v) obj;
            vVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.d(eVar, 0, y1.f117048a, vVar.f199985a);
            x xVar = x.f117036a;
            dVarC.d(eVar, 1, xVar, vVar.f199986b);
            dVarC.d(eVar, 2, xVar, vVar.f199987c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ v(int i14, String str, Double d14, Double d15, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f199988a.getF158591b());
            throw null;
        }
        this.f199985a = str;
        this.f199986b = d14;
        this.f199987c = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f199985a, vVar.f199985a) && p005kotlin.jvm.internal.s.g(this.f199986b, vVar.f199986b) && p005kotlin.jvm.internal.s.g(this.f199987c, vVar.f199987c);
    }

    public final int hashCode() {
        String str = this.f199985a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.f199986b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f199987c;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Vo2RecordDTO(calendarDate=");
        sb3.append(this.f199985a);
        sb3.append(", vo2MaxValue=");
        sb3.append(this.f199986b);
        sb3.append(", vo2MaxPreciseValue=");
        return b71.i.g(sb3, this.f199987c, ")");
    }

    /* JADX INFO: renamed from: yw1.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/v$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/v;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<v> serializer() {
            return a.f199988a;
        }

        private Companion() {
        }
    }

    public v(String str, Double d14, Double d15) {
        this.f199985a = str;
        this.f199986b = d14;
        this.f199987c = d15;
    }
}

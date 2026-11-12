package bo;

import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lbo/n;", "", "", "heliumContent", "oxygenContent", "gasIndex", "gasMode", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f19214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f19215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f19216d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/SummarizedDiveGasDTO.$serializer", "Lm63/e0;", "Lbo/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19217a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19217a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.SummarizedDiveGasDTO", aVar, 4);
            m1Var.j("heliumContent", true);
            m1Var.j("oxygenContent", true);
            m1Var.j("gasIndex", true);
            m1Var.j("gasMode", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    num2 = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num2);
                    i15 |= 2;
                } else if (iE == 2) {
                    num3 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num3);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    num4 = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num4);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new n(i15, num, num2, num3, num4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            Integer num = nVar.f19216d;
            Integer num2 = nVar.f19215c;
            Integer num3 = nVar.f19214b;
            Integer num4 = nVar.f19213a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || num4 != null) {
                dVarC.d(eVar, 0, m0.f116981a, num4);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 1, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 2, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 3, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ n(int i14, Integer num, Integer num2, Integer num3, Integer num4, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19213a = null;
        } else {
            this.f19213a = num;
        }
        if ((i14 & 2) == 0) {
            this.f19214b = null;
        } else {
            this.f19214b = num2;
        }
        if ((i14 & 4) == 0) {
            this.f19215c = null;
        } else {
            this.f19215c = num3;
        }
        if ((i14 & 8) == 0) {
            this.f19216d = null;
        } else {
            this.f19216d = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f19213a, nVar.f19213a) && s.g(this.f19214b, nVar.f19214b) && s.g(this.f19215c, nVar.f19215c) && s.g(this.f19216d, nVar.f19216d);
    }

    public final int hashCode() {
        Integer num = this.f19213a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f19214b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f19215c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f19216d;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return b71.i.h(com.airbnb.lottie.animation.keyframe.a.l(this.f19213a, "SummarizedDiveGasDTO(heliumContent=", ", oxygenContent=", ", gasIndex=", this.f19214b), this.f19215c, ", gasMode=", this.f19216d, ")");
    }

    /* JADX INFO: renamed from: bo.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/n$b;", "", "<init>", "()V", "Li63/c;", "Lbo/n;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<n> serializer() {
            return a.f19217a;
        }

        private Companion() {
        }
    }

    public n() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (p005kotlin.jvm.internal.j) null);
    }

    public n(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f19213a = num;
        this.f19214b = num2;
        this.f19215c = num3;
        this.f19216d = num4;
    }

    public /* synthetic */ n(Integer num, Integer num2, Integer num3, Integer num4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : num4);
    }
}

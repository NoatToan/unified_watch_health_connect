package tq0;

import com.roomorama.caldroid.CaldroidFragment;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Ltq0/k;", "", "", CaldroidFragment.MONTH, CaldroidFragment.YEAR, "<init>", "(II)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166097b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/InsightDemographicSelectionDateDTO.$serializer", "Lm63/e0;", "Ltq0/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f166098a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f166098a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.InsightDemographicSelectionDateDTO", aVar, 2);
            m1Var.j(CaldroidFragment.MONTH, true);
            m1Var.j(CaldroidFragment.YEAR, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{m0Var, m0Var};
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
            while (true) {
                u1 u1Var = null;
                if (!z14) {
                    cVarC.b(eVar2);
                    return new k(i15, iA, iA2, u1Var);
                }
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    iA2 = cVarC.A(eVar2, 1);
                    i15 |= 2;
                }
            }
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            int i14 = kVar.f166097b;
            int i15 = kVar.f166096a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || i15 != 0) {
                dVarC.v(0, i15, eVar);
            }
            if (dVarC.C(eVar) || i14 != 0) {
                dVarC.v(1, i14, eVar);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ k(int i14, int i15, int i16, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f166096a = 0;
        } else {
            this.f166096a = i15;
        }
        if ((i14 & 2) == 0) {
            this.f166097b = 0;
        } else {
            this.f166097b = i16;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f166096a == kVar.f166096a && this.f166097b == kVar.f166097b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166097b) + (Integer.hashCode(this.f166096a) * 31);
    }

    public final String toString() {
        return am.j.g(this.f166096a, this.f166097b, "InsightDemographicSelectionDateDTO(month=", ", year=", ")");
    }

    /* JADX INFO: renamed from: tq0.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/k$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/k;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f166098a;
        }

        private Companion() {
        }
    }

    public k(int i14, int i15) {
        this.f166096a = i14;
        this.f166097b = i15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k() {
        int i14 = 0;
        this(i14, i14, 3, (p005kotlin.jvm.internal.j) null);
    }

    public /* synthetic */ k(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? 0 : i15);
    }
}

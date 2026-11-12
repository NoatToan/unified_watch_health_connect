package rp;

import am.j;
import com.roomorama.caldroid.CaldroidFragment;
import i63.h;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lrp/f;", "Lrp/e;", "", "Lcom/garmin/android/apps/connectmobile/activities/reports/presentation/navigation/Month;", CaldroidFragment.MONTH, "Lcom/garmin/android/apps/connectmobile/activities/reports/presentation/navigation/Year;", CaldroidFragment.YEAR, "<init>", "(II)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class f extends e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154062c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/reports/presentation/navigation/MonthlyReports.$serializer", "Lm63/e0;", "Lrp/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f154063a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f154063a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.reports.presentation.navigation.MonthlyReports", aVar, 2);
            m1Var.j(CaldroidFragment.MONTH, false);
            m1Var.j(CaldroidFragment.YEAR, false);
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
                    return new f(i15, iA, iA2, u1Var);
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
            f fVar2 = (f) obj;
            fVar2.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.v(0, fVar2.f154061b, eVar);
            dVarC.v(1, fVar2.f154062c, eVar);
            dVarC.b(eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i14, int i15, int i16, u1 u1Var) {
        super(i14, u1Var);
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f154063a.getF158591b());
            throw null;
        }
        this.f154061b = i15;
        this.f154062c = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f154061b == fVar.f154061b && this.f154062c == fVar.f154062c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154062c) + (Integer.hashCode(this.f154061b) * 31);
    }

    public final String toString() {
        return j.g(this.f154061b, this.f154062c, "MonthlyReports(month=", ", year=", ")");
    }

    /* JADX INFO: renamed from: rp.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrp/f$b;", "", "<init>", "()V", "Li63/c;", "Lrp/f;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f154063a;
        }

        private Companion() {
        }
    }

    public f(int i14, int i15) {
        super(null);
        this.f154061b = i14;
        this.f154062c = i15;
    }
}

package pv0;

import com.garmin.android.apps.connectmobile.f3;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lpv0/l;", "", "", "calendarDate", "", "totalTracking", "completedTracking", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f141389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f141390c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/logging/data/model/BehaviourStats.$serializer", "Lm63/e0;", "Lpv0/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f141391a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f141391a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.logging.data.model.BehaviourStats", aVar, 3);
            m1Var.j("calendarDate", true);
            m1Var.j("totalTracking", true);
            m1Var.j("completedTracking", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(y1.f117048a);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, j63.a.d(m0Var), j63.a.d(m0Var)};
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
            Integer num = null;
            Integer num2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    num2 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new l(i15, str, num, num2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l lVar = (l) obj;
            lVar.getClass();
            Integer num = lVar.f141390c;
            Integer num2 = lVar.f141389b;
            String str = lVar.f141388a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 0, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 1, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 2, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ l(int i14, String str, Integer num, Integer num2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f141388a = null;
        } else {
            this.f141388a = str;
        }
        if ((i14 & 2) == 0) {
            this.f141389b = null;
        } else {
            this.f141389b = num;
        }
        if ((i14 & 4) == 0) {
            this.f141390c = null;
        } else {
            this.f141390c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f141388a, lVar.f141388a) && p005kotlin.jvm.internal.s.g(this.f141389b, lVar.f141389b) && p005kotlin.jvm.internal.s.g(this.f141390c, lVar.f141390c);
    }

    public final int hashCode() {
        String str = this.f141388a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f141389b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f141390c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return f3.i(u0.n("BehaviourStats(calendarDate=", this.f141389b, this.f141388a, ", totalTracking=", ", completedTracking="), this.f141390c, ")");
    }

    /* JADX INFO: renamed from: pv0.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/l$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/l;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l> serializer() {
            return a.f141391a;
        }

        private Companion() {
        }
    }

    public l() {
        this((String) null, (Integer) null, (Integer) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public l(String str, Integer num, Integer num2) {
        this.f141388a = str;
        this.f141389b = num;
        this.f141390c = num2;
    }

    public /* synthetic */ l(String str, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2);
    }
}

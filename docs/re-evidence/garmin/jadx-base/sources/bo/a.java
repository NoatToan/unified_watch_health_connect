package bo;

import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lbo/a;", "", "", "typeId", "", "typeKey", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19084b;

    /* JADX INFO: renamed from: bo.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/AccessControlRuleDTO.$serializer", "Lm63/e0;", "Lbo/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C0277a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0277a f19085a;
        private static final k63.e descriptor;

        static {
            C0277a c0277a = new C0277a();
            f19085a = c0277a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.AccessControlRuleDTO", c0277a, 2);
            m1Var.j("typeId", true);
            m1Var.j("typeKey", true);
            descriptor = m1Var;
        }

        private C0277a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(v0.f117027a), j63.a.d(y1.f117048a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, l14, str, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            String str = aVar.f19084b;
            Long l14 = aVar.f19083a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 0, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, Long l14, String str, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19083a = null;
        } else {
            this.f19083a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f19084b = null;
        } else {
            this.f19084b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f19083a, aVar.f19083a) && s.g(this.f19084b, aVar.f19084b);
    }

    public final int hashCode() {
        Long l14 = this.f19083a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f19084b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AccessControlRuleDTO(typeId=" + this.f19083a + ", typeKey=" + this.f19084b + ")";
    }

    /* JADX INFO: renamed from: bo.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/a$b;", "", "<init>", "()V", "Li63/c;", "Lbo/a;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C0277a.f19085a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this((Long) null, (String) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public a(Long l14, String str) {
        this.f19083a = l14;
        this.f19084b = str;
    }

    public /* synthetic */ a(Long l14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str);
    }
}

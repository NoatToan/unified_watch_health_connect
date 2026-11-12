package z70;

import ch.qos.logback.core.joran.action.Action;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lz70/u;", "", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class u {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202869b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/data/PreferenceDTO.$serializer", "Lm63/e0;", "Lz70/u;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202870a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f202870a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.data.PreferenceDTO", aVar, 2);
            m1Var.j(Action.KEY_ATTRIBUTE, false);
            m1Var.j("value", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var)};
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
            String str = null;
            String str2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new u(i15, str, str2, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            u uVar = (u) obj;
            uVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, uVar.f202868a);
            dVarC.d(eVar, 1, y1Var, uVar.f202869b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ u(int i14, String str, String str2, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f202870a.getF116202c());
            throw null;
        }
        this.f202868a = str;
        this.f202869b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f202868a, uVar.f202868a) && p005kotlin.jvm.internal.s.g(this.f202869b, uVar.f202869b);
    }

    public final int hashCode() {
        String str = this.f202868a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f202869b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return v.e0.g("PreferenceDTO(key=", this.f202868a, ", value=", this.f202869b, ")");
    }

    /* JADX INFO: renamed from: z70.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz70/u$b;", "", "<init>", "()V", "Li63/c;", "Lz70/u;", "serializer", "()Li63/c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<u> serializer() {
            return a.f202870a;
        }

        private Companion() {
        }
    }

    public u(String str, String str2) {
        this.f202868a = str;
        this.f202869b = str2;
    }
}

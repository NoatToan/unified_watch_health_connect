package ca0;

import java.lang.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i63.h
public interface j {
    public static final a Companion = a.f26291a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/j$a;", "", "<init>", "()V", "Li63/c;", "Lca0/j;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f26291a = new a();

        private a() {
        }

        public final i63.c<j> serializer() {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            return new i63.g("com.garmin.android.apps.connectmobile.device.setup.navigation.ConsentRoute", t0Var.b(j.class), new k23.d[]{t0Var.b(b.class), t0Var.b(c.class)}, new i63.c[]{new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.ConsentRoute.ConsentChecks", b.INSTANCE, new Annotation[0]), c.a.f26298a}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/j$b;", "Lca0/j;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b implements j {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26292a = o13.m.a(o13.n.PUBLICATION, new c63.g0(16));

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1706360911;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f26292a.getValue();
        }

        public final String toString() {
            return "ConsentChecks";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lca0/j$c;", "Lca0/j;", "", "_consentTypeId", "Lg90/a;", "consentText", "", "endFlowOnRevoke", "isConsentRequestRecentlySent", "_dependentConsentTypeId", "<init>", "(Ljava/lang/String;Lg90/a;ZZLjava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lg90/a;ZZLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c implements j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g90.a f26294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f26296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f26297e;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/ConsentRoute.ConsentRequest.$serializer", "Lm63/e0;", "Lca0/j$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26298a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26298a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.ConsentRoute.ConsentRequest", aVar, 5);
                m1Var.j("_consentTypeId", false);
                m1Var.j("consentText", false);
                m1Var.j("endFlowOnRevoke", true);
                m1Var.j("isConsentRequestRecentlySent", true);
                m1Var.j("_dependentConsentTypeId", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                i63.c<?> cVarD = j63.a.d(y1Var);
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{y1Var, g90.a.C1534a.f76464a, gVar, gVar, cVarD};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                boolean zG2 = false;
                String strR = null;
                g90.a aVar = null;
                String str = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        aVar = (g90.a) cVarC.l(eVar2, 1, g90.a.C1534a.f76464a, aVar);
                        i15 |= 2;
                    } else if (iE == 2) {
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    } else if (iE == 3) {
                        zG2 = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        str = (String) cVarC.v(eVar2, 4, m63.y1.f117048a, str);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, strR, aVar, zG, zG2, str, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = cVar.f26293a;
                String str2 = cVar.f26297e;
                boolean z14 = cVar.f26296d;
                boolean z15 = cVar.f26295c;
                dVarC.k(eVar, 0, str);
                dVarC.e(eVar, 1, g90.a.C1534a.f76464a, cVar.f26294b);
                if (dVarC.C(eVar) || z15) {
                    dVarC.n(eVar, 2, z15);
                }
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 3, z14);
                }
                if (dVarC.C(eVar) || str2 != null) {
                    dVarC.d(eVar, 4, m63.y1.f117048a, str2);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ c(int i14, String str, g90.a aVar, boolean z14, boolean z15, String str2, m63.u1 u1Var) {
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f26298a.getF158591b());
                throw null;
            }
            this.f26293a = str;
            this.f26294b = aVar;
            if ((i14 & 4) == 0) {
                this.f26295c = false;
            } else {
                this.f26295c = z14;
            }
            if ((i14 & 8) == 0) {
                this.f26296d = false;
            } else {
                this.f26296d = z15;
            }
            if ((i14 & 16) == 0) {
                this.f26297e = null;
            } else {
                this.f26297e = str2;
            }
        }

        public static c a(c cVar, boolean z14, boolean z15, int i14) {
            String str = cVar.f26293a;
            g90.a aVar = cVar.f26294b;
            if ((i14 & 4) != 0) {
                z14 = cVar.f26295c;
            }
            boolean z16 = z14;
            if ((i14 & 8) != 0) {
                z15 = cVar.f26296d;
            }
            String str2 = cVar.f26297e;
            cVar.getClass();
            str.getClass();
            aVar.getClass();
            return new c(str, aVar, z16, z15, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f26293a, cVar.f26293a) && p005kotlin.jvm.internal.s.g(this.f26294b, cVar.f26294b) && this.f26295c == cVar.f26295c && this.f26296d == cVar.f26296d && p005kotlin.jvm.internal.s.g(this.f26297e, cVar.f26297e);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.g((this.f26294b.hashCode() + (this.f26293a.hashCode() * 31)) * 31, 31, this.f26295c), 31, this.f26296d);
            String str = this.f26297e;
            return iG + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ConsentRequest(_consentTypeId=");
            sb3.append(this.f26293a);
            sb3.append(", consentText=");
            sb3.append(this.f26294b);
            sb3.append(", endFlowOnRevoke=");
            kg.f.q(", isConsentRequestRecentlySent=", ", _dependentConsentTypeId=", sb3, this.f26295c, this.f26296d);
            return am.j.o(this.f26297e, ")", sb3);
        }

        /* JADX INFO: renamed from: ca0.j$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/j$c$b;", "", "<init>", "()V", "Li63/c;", "Lca0/j$c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f26298a;
            }

            private Companion() {
            }
        }

        public c(String str, g90.a aVar, boolean z14, boolean z15, String str2) {
            str.getClass();
            aVar.getClass();
            this.f26293a = str;
            this.f26294b = aVar;
            this.f26295c = z14;
            this.f26296d = z15;
            this.f26297e = str2;
        }

        public /* synthetic */ c(String str, g90.a aVar, boolean z14, boolean z15, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, aVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? null : str2);
        }
    }
}

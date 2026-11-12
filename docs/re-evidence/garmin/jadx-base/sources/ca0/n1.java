package ca0;

import android.os.Bundle;
import java.lang.annotation.Annotation;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i63.h
public interface n1 {
    public static final a Companion = a.f26356a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$a;", "", "<init>", "()V", "Li63/c;", "Lca0/n1;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f26356a = new a();

        /* JADX INFO: renamed from: ca0.n1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/n1$a$a", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0404a extends lc.q0<l90.b> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26357s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0404a(n63.b bVar) {
                super(true);
                this.f26357s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l90.b] */
            @Override // lc.q0
            public final l90.b a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26357s;
                bVar.getClass();
                return bVar.c(l90.b.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l90.b] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final l90.b h(String str) {
                str.getClass();
                n63.b bVar = this.f26357s;
                bVar.getClass();
                return bVar.c(l90.b.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, l90.b bVar) {
                str.getClass();
                n63.b bVar2 = this.f26357s;
                bVar2.getClass();
                bundle.putString(str, bVar2.b(j63.a.d(l90.b.INSTANCE.serializer()), bVar));
            }

            @Override // lc.q0
            public final String f(l90.b bVar) {
                n63.b bVar2 = this.f26357s;
                bVar2.getClass();
                return r1.q2.j(bVar2, j63.a.d(l90.b.INSTANCE.serializer()), bVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/n1$a$b", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends lc.q0<q90.c> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26358s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n63.b bVar) {
                super(true);
                this.f26358s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, q90.c] */
            @Override // lc.q0
            public final q90.c a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26358s;
                bVar.getClass();
                return bVar.c(q90.c.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, q90.c] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final q90.c h(String str) {
                str.getClass();
                n63.b bVar = this.f26358s;
                bVar.getClass();
                return bVar.c(q90.c.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, q90.c cVar) {
                str.getClass();
                n63.b bVar = this.f26358s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(q90.c.INSTANCE.serializer()), cVar));
            }

            @Override // lc.q0
            public final String f(q90.c cVar) {
                n63.b bVar = this.f26358s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(q90.c.INSTANCE.serializer()), cVar);
            }
        }

        private a() {
        }

        public static Map a() {
            k23.p pVarC = p005kotlin.jvm.internal.s0.c(l90.b.class);
            n63.b.a aVar = n63.b.f123892d;
            return p13.u0.e(new o13.p(pVarC, new C0404a(aVar)), new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new b(aVar)));
        }

        public final i63.c<n1> serializer() {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            return new i63.g("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute", t0Var.b(n1.class), new k23.d[]{t0Var.b(b.class), t0Var.b(c.class), t0Var.b(d.class), t0Var.b(e.class), t0Var.b(f.class), t0Var.b(g.class), t0Var.b(h.class), t0Var.b(i.class), t0Var.b(j.class), t0Var.b(k.class), t0Var.b(l.class)}, new i63.c[]{new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.CompanionDeviceLink", b.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBle", c.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBleProgress", d.INSTANCE, new Annotation[0]), e.a.f26363a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBluetoothClassic", f.INSTANCE, new Annotation[0]), g.a.f26366a, h.a.f26368a, i.a.f26371a, j.a.f26373a, k.a.f26377a, l.a.f26382a}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/n1$b;", "Lca0/n1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b implements n1 {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26359a = o13.m.a(o13.n.PUBLICATION, new j0(15));

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1108345842;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f26359a.getValue();
        }

        public final String toString() {
            return "CompanionDeviceLink";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/n1$c;", "Lca0/n1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c implements n1 {
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26360a = o13.m.a(o13.n.PUBLICATION, new j0(16));

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 852593555;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) f26360a.getValue();
        }

        public final String toString() {
            return "PairBle";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/n1$d;", "Lca0/n1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements n1 {
        public static final d INSTANCE = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26361a = o13.m.a(o13.n.PUBLICATION, new j0(17));

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -443453728;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) f26361a.getValue();
        }

        public final String toString() {
            return "PairBleProgress";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/n1$f;", "Lca0/n1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f implements n1 {
        public static final f INSTANCE = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26364a = o13.m.a(o13.n.PUBLICATION, new j0(18));

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -280487220;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<f> serializer() {
            return (i63.c) f26364a.getValue();
        }

        public final String toString() {
            return "PairBluetoothClassic";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/n1$e;", "Lca0/n1;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26362a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PairBleReset.$serializer", "Lm63/e0;", "Lca0/n1$e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26363a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26363a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBleReset", aVar, 1);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.b.a.f111532a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                l90.b bVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar = (l90.b) cVarC.l(eVar2, 0, l90.b.a.f111532a, bVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new e(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.d dVarC = fVar.c(eVar2);
                dVarC.e(eVar2, 0, l90.b.a.f111532a, eVar.f26362a);
                dVarC.b(eVar2);
            }
        }

        public /* synthetic */ e(int i14, l90.b bVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26362a = bVar;
            } else {
                m63.k1.h(i14, 1, a.f26363a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.f26362a, ((e) obj).f26362a);
        }

        public final int hashCode() {
            return this.f26362a.hashCode();
        }

        public final String toString() {
            return "PairBleReset(device=" + this.f26362a + ")";
        }

        /* JADX INFO: renamed from: ca0.n1$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$e$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$e;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<e> serializer() {
                return a.f26363a;
            }

            private Companion() {
            }
        }

        public e(l90.b bVar) {
            bVar.getClass();
            this.f26362a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/n1$g;", "Lca0/n1;", "Lq90/c;", "device", "<init>", "(Lq90/c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILq90/c;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q90.c f26365a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PairCtkdDualFailure.$serializer", "Lm63/e0;", "Lca0/n1$g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26366a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26366a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairCtkdDualFailure", aVar, 1);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{q90.c.a.f143504a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                q90.c cVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        cVar = (q90.c) cVarC.l(eVar2, 0, q90.c.a.f143504a, cVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new g(i15, cVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                g gVar = (g) obj;
                gVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, q90.c.a.f143504a, gVar.f26365a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ g(int i14, q90.c cVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26365a = cVar;
            } else {
                m63.k1.h(i14, 1, a.f26366a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p005kotlin.jvm.internal.s.g(this.f26365a, ((g) obj).f26365a);
        }

        public final int hashCode() {
            return this.f26365a.hashCode();
        }

        public final String toString() {
            return "PairCtkdDualFailure(device=" + this.f26365a + ")";
        }

        /* JADX INFO: renamed from: ca0.n1$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$g$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$g;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<g> serializer() {
                return a.f26366a;
            }

            private Companion() {
            }
        }

        public g(q90.c cVar) {
            cVar.getClass();
            this.f26365a = cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/n1$h;", "Lca0/n1;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26367a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PairFailure.$serializer", "Lm63/e0;", "Lca0/n1$h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26368a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26368a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairFailure", aVar, 1);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.b.a.f111532a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                l90.b bVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar = (l90.b) cVarC.l(eVar2, 0, l90.b.a.f111532a, bVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new h(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                h hVar = (h) obj;
                hVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, l90.b.a.f111532a, hVar.f26367a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ h(int i14, l90.b bVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26367a = bVar;
            } else {
                m63.k1.h(i14, 1, a.f26368a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f26367a, ((h) obj).f26367a);
        }

        public final int hashCode() {
            return this.f26367a.hashCode();
        }

        public final String toString() {
            return "PairFailure(device=" + this.f26367a + ")";
        }

        /* JADX INFO: renamed from: ca0.n1$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$h$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$h;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<h> serializer() {
                return a.f26368a;
            }

            private Companion() {
            }
        }

        public h(l90.b bVar) {
            bVar.getClass();
            this.f26367a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/n1$i;", "Lca0/n1;", "", "deviceUnitId", "Ll90/b;", "device", "<init>", "(JLl90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLl90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f26370b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PairInReachBlocked.$serializer", "Lm63/e0;", "Lca0/n1$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26371a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26371a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairInReachBlocked", aVar, 2);
                m1Var.j("deviceUnitId", false);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.v0.f117027a, l90.b.a.f111532a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                int i15 = 0;
                long jW = 0;
                l90.b bVar = null;
                boolean z14 = true;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar = (l90.b) cVarC.l(eVar2, 1, l90.b.a.f111532a, bVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new i(i15, jW, bVar, null);
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
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, iVar.f26369a);
                dVarC.e(eVar, 1, l90.b.a.f111532a, iVar.f26370b);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ i(int i14, long j8, l90.b bVar, m63.u1 u1Var) {
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f26371a.getF158591b());
                throw null;
            }
            this.f26369a = j8;
            this.f26370b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f26369a == iVar.f26369a && p005kotlin.jvm.internal.s.g(this.f26370b, iVar.f26370b);
        }

        public final int hashCode() {
            return this.f26370b.hashCode() + (Long.hashCode(this.f26369a) * 31);
        }

        public final String toString() {
            return "PairInReachBlocked(deviceUnitId=" + this.f26369a + ", device=" + this.f26370b + ")";
        }

        /* JADX INFO: renamed from: ca0.n1$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$i$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$i;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return a.f26371a;
            }

            private Companion() {
            }
        }

        public i(long j8, l90.b bVar) {
            bVar.getClass();
            this.f26369a = j8;
            this.f26370b = bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/n1$j;", "Lca0/n1;", "Lq90/c;", "device", "<init>", "(Lq90/c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILq90/c;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q90.c f26372a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PairSuccess.$serializer", "Lm63/e0;", "Lca0/n1$j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26373a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26373a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairSuccess", aVar, 1);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{q90.c.a.f143504a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                q90.c cVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        cVar = (q90.c) cVarC.l(eVar2, 0, q90.c.a.f143504a, cVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new j(i15, cVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                j jVar = (j) obj;
                jVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, q90.c.a.f143504a, jVar.f26372a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ j(int i14, q90.c cVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26372a = cVar;
            } else {
                m63.k1.h(i14, 1, a.f26373a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && p005kotlin.jvm.internal.s.g(this.f26372a, ((j) obj).f26372a);
        }

        public final int hashCode() {
            return this.f26372a.hashCode();
        }

        public final String toString() {
            return "PairSuccess(device=" + this.f26372a + ")";
        }

        /* JADX INFO: renamed from: ca0.n1$j$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$j$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$j;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<j> serializer() {
                return a.f26373a;
            }

            private Companion() {
            }
        }

        public j(q90.c cVar) {
            cVar.getClass();
            this.f26372a = cVar;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lca0/n1$k;", "Lca0/n1;", "Lq90/c;", "device", "", "currentPrimaryTrainingName", "", "editUserSettings", "<init>", "(Lq90/c;Ljava/lang/String;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILq90/c;Ljava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q90.c f26374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26376c;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PrimaryTraining.$serializer", "Lm63/e0;", "Lca0/n1$k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26377a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26377a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PrimaryTraining", aVar, 3);
                m1Var.j("device", false);
                m1Var.j("currentPrimaryTrainingName", false);
                m1Var.j("editUserSettings", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{q90.c.a.f143504a, m63.y1.f117048a, m63.g.f116948a};
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
                q90.c cVar = null;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        cVar = (q90.c) cVarC.l(eVar2, 0, q90.c.a.f143504a, cVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new k(i15, cVar, strR, zG, null);
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
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, q90.c.a.f143504a, kVar.f26374a);
                dVarC.k(eVar, 1, kVar.f26375b);
                dVarC.n(eVar, 2, kVar.f26376c);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ k(int i14, q90.c cVar, String str, boolean z14, m63.u1 u1Var) {
            if (7 != (i14 & 7)) {
                m63.k1.h(i14, 7, a.f26377a.getF158591b());
                throw null;
            }
            this.f26374a = cVar;
            this.f26375b = str;
            this.f26376c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p005kotlin.jvm.internal.s.g(this.f26374a, kVar.f26374a) && p005kotlin.jvm.internal.s.g(this.f26375b, kVar.f26375b) && this.f26376c == kVar.f26376c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f26376c) + wr.g.j(this.f26374a.hashCode() * 31, 31, this.f26375b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PrimaryTraining(device=");
            sb3.append(this.f26374a);
            sb3.append(", currentPrimaryTrainingName=");
            sb3.append(this.f26375b);
            sb3.append(", editUserSettings=");
            return hb.a.k(sb3, this.f26376c, ")");
        }

        /* JADX INFO: renamed from: ca0.n1$k$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$k$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$k;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<k> serializer() {
                return a.f26377a;
            }

            private Companion() {
            }
        }

        public k(q90.c cVar, String str, boolean z14) {
            cVar.getClass();
            str.getClass();
            this.f26374a = cVar;
            this.f26375b = str;
            this.f26376c = z14;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lca0/n1$l;", "Lca0/n1;", "Lq90/c;", "device", "", "currentPrimaryWearableName", "", "primaryTrainingCapable", "editUserSettings", "<init>", "(Lq90/c;Ljava/lang/String;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILq90/c;Ljava/lang/String;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l implements n1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q90.c f26378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f26381d;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DevicePairingRoute.PrimaryWearable.$serializer", "Lm63/e0;", "Lca0/n1$l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26382a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26382a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PrimaryWearable", aVar, 4);
                m1Var.j("device", false);
                m1Var.j("currentPrimaryWearableName", false);
                m1Var.j("primaryTrainingCapable", false);
                m1Var.j("editUserSettings", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{q90.c.a.f143504a, m63.y1.f117048a, gVar, gVar};
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
                q90.c cVar = null;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        cVar = (q90.c) cVarC.l(eVar2, 0, q90.c.a.f143504a, cVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG2 = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new l(i15, cVar, strR, zG, zG2, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                l lVar = (l) obj;
                lVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, q90.c.a.f143504a, lVar.f26378a);
                dVarC.k(eVar, 1, lVar.f26379b);
                dVarC.n(eVar, 2, lVar.f26380c);
                dVarC.n(eVar, 3, lVar.f26381d);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ l(int i14, q90.c cVar, String str, boolean z14, boolean z15, m63.u1 u1Var) {
            if (15 != (i14 & 15)) {
                m63.k1.h(i14, 15, a.f26382a.getF158591b());
                throw null;
            }
            this.f26378a = cVar;
            this.f26379b = str;
            this.f26380c = z14;
            this.f26381d = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p005kotlin.jvm.internal.s.g(this.f26378a, lVar.f26378a) && p005kotlin.jvm.internal.s.g(this.f26379b, lVar.f26379b) && this.f26380c == lVar.f26380c && this.f26381d == lVar.f26381d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f26381d) + q6.f.g(wr.g.j(this.f26378a.hashCode() * 31, 31, this.f26379b), 31, this.f26380c);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PrimaryWearable(device=");
            sb3.append(this.f26378a);
            sb3.append(", currentPrimaryWearableName=");
            sb3.append(this.f26379b);
            sb3.append(", primaryTrainingCapable=");
            return com.airbnb.lottie.animation.keyframe.a.f(", editUserSettings=", ")", sb3, this.f26380c, this.f26381d);
        }

        /* JADX INFO: renamed from: ca0.n1$l$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/n1$l$b;", "", "<init>", "()V", "Li63/c;", "Lca0/n1$l;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<l> serializer() {
                return a.f26382a;
            }

            private Companion() {
            }
        }

        public l(q90.c cVar, String str, boolean z14, boolean z15) {
            cVar.getClass();
            str.getClass();
            this.f26378a = cVar;
            this.f26379b = str;
            this.f26380c = z14;
            this.f26381d = z15;
        }
    }
}

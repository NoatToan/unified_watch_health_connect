package ca0;

import android.os.Bundle;
import i3.e5;
import java.lang.annotation.Annotation;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i63.h
public interface c4 {
    public static final f Companion = f.f26160a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$a;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a implements c4 {
        public static final a INSTANCE = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26150a = o13.m.a(o13.n.PUBLICATION, new a2(25));

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1538341221;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) f26150a.getValue();
        }

        public final String toString() {
            return "ActivityLevel";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$d;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements c4 {
        public static final d INSTANCE = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26157a = o13.m.a(o13.n.PUBLICATION, new a2(26));

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 892136919;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) f26157a.getValue();
        }

        public final String toString() {
            return "Birthday";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$f;", "", "<init>", "()V", "Li63/c;", "Lca0/c4;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ f f26160a = new f();

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/c4$f$a", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends lc.q0<gb0.a> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26161s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n63.b bVar) {
                super(true);
                this.f26161s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [gb0.a, java.lang.Object] */
            @Override // lc.q0
            public final gb0.a a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26161s;
                bVar.getClass();
                return bVar.c(gb0.a.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [gb0.a, java.lang.Object] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final gb0.a h(String str) {
                str.getClass();
                n63.b bVar = this.f26161s;
                bVar.getClass();
                return bVar.c(gb0.a.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, gb0.a aVar) {
                str.getClass();
                n63.b bVar = this.f26161s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(gb0.a.INSTANCE.serializer()), aVar));
            }

            @Override // lc.q0
            public final String f(gb0.a aVar) {
                n63.b bVar = this.f26161s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(gb0.a.INSTANCE.serializer()), aVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/c4$f$b", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends lc.q0<pb0.a> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26162s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n63.b bVar) {
                super(true);
                this.f26162s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, pb0.a] */
            @Override // lc.q0
            public final pb0.a a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26162s;
                bVar.getClass();
                return bVar.c(pb0.a.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, pb0.a] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final pb0.a h(String str) {
                str.getClass();
                n63.b bVar = this.f26162s;
                bVar.getClass();
                return bVar.c(pb0.a.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, pb0.a aVar) {
                str.getClass();
                n63.b bVar = this.f26162s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(pb0.a.INSTANCE.serializer()), aVar));
            }

            @Override // lc.q0
            public final String f(pb0.a aVar) {
                n63.b bVar = this.f26162s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(pb0.a.INSTANCE.serializer()), aVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/c4$f$c", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends lc.q0<q90.c> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26163s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n63.b bVar) {
                super(true);
                this.f26163s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, q90.c] */
            @Override // lc.q0
            public final q90.c a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26163s;
                bVar.getClass();
                return bVar.c(q90.c.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, q90.c] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final q90.c h(String str) {
                str.getClass();
                n63.b bVar = this.f26163s;
                bVar.getClass();
                return bVar.c(q90.c.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, q90.c cVar) {
                str.getClass();
                n63.b bVar = this.f26163s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(q90.c.INSTANCE.serializer()), cVar));
            }

            @Override // lc.q0
            public final String f(q90.c cVar) {
                n63.b bVar = this.f26163s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(q90.c.INSTANCE.serializer()), cVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/c4$f$d", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends lc.q0<s90.f> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26164s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n63.b bVar) {
                super(true);
                this.f26164s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, s90.f] */
            @Override // lc.q0
            public final s90.f a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26164s;
                bVar.getClass();
                return bVar.c(s90.f.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, s90.f] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final s90.f h(String str) {
                str.getClass();
                n63.b bVar = this.f26164s;
                bVar.getClass();
                return bVar.c(s90.f.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, s90.f fVar) {
                str.getClass();
                n63.b bVar = this.f26164s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(s90.f.INSTANCE.serializer()), fVar));
            }

            @Override // lc.q0
            public final String f(s90.f fVar) {
                n63.b bVar = this.f26164s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(s90.f.INSTANCE.serializer()), fVar);
            }
        }

        private f() {
        }

        public static Map a() {
            k23.p pVarC = p005kotlin.jvm.internal.s0.c(gb0.a.class);
            n63.b.a aVar = n63.b.f123892d;
            return p13.u0.e(new o13.p(pVarC, new a(aVar)), new o13.p(p005kotlin.jvm.internal.s0.c(pb0.a.class), new b(aVar)), new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new c(aVar)), new o13.p(p005kotlin.jvm.internal.s0.c(s90.f.class), new d(aVar)));
        }

        public final i63.c<c4> serializer() {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            return new i63.g("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute", t0Var.b(c4.class), new k23.d[]{t0Var.b(a.class), t0Var.b(b.class), t0Var.b(c.class), t0Var.b(d.class), t0Var.b(e.class), t0Var.b(g.class), t0Var.b(h.class), t0Var.b(i.class), t0Var.b(j.class), t0Var.b(k.class), t0Var.b(l.class), t0Var.b(m.class), t0Var.b(n.class), t0Var.b(o.class), t0Var.b(p.class), t0Var.b(q.class)}, new i63.c[]{new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ActivityLevel", a.INSTANCE, new Annotation[0]), b.a.f26154a, c.a.f26156a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Birthday", d.INSTANCE, new Annotation[0]), e.a.f26159a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Gender", g.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Height", h.INSTANCE, new Annotation[0]), i.a.f26168a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Loading", j.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ProfileImage", k.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ProfileIntro", l.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ProfileSetupComplete", m.INSTANCE, new Annotation[0]), n.a.f26175a, o.a.f26179a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Weight", p.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.WheelchairActivityLevel", q.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$g;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g implements c4 {
        public static final g INSTANCE = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26165a = o13.m.a(o13.n.PUBLICATION, new a2(27));

        private g() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1674277733;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<g> serializer() {
            return (i63.c) f26165a.getValue();
        }

        public final String toString() {
            return "Gender";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$h;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h implements c4 {
        public static final h INSTANCE = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26166a = o13.m.a(o13.n.PUBLICATION, new a2(28));

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1645794559;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<h> serializer() {
            return (i63.c) f26166a.getValue();
        }

        public final String toString() {
            return "Height";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$j;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j implements c4 {
        public static final j INSTANCE = new j();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26169a = o13.m.a(o13.n.PUBLICATION, new a2(29));

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 53838498;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<j> serializer() {
            return (i63.c) f26169a.getValue();
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$k;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k implements c4 {
        public static final k INSTANCE = new k();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26170a = o13.m.a(o13.n.PUBLICATION, new d4(0));

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1721753716;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<k> serializer() {
            return (i63.c) f26170a.getValue();
        }

        public final String toString() {
            return "ProfileImage";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$l;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l implements c4 {
        public static final l INSTANCE = new l();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26171a = o13.m.a(o13.n.PUBLICATION, new d4(1));

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1721705315;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<l> serializer() {
            return (i63.c) f26171a.getValue();
        }

        public final String toString() {
            return "ProfileIntro";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$m;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m implements c4 {
        public static final m INSTANCE = new m();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26172a = o13.m.a(o13.n.PUBLICATION, new d4(2));

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1406973959;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<m> serializer() {
            return (i63.c) f26172a.getValue();
        }

        public final String toString() {
            return "ProfileSetupComplete";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$p;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class p implements c4 {
        public static final p INSTANCE = new p();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26180a = o13.m.a(o13.n.PUBLICATION, new d4(3));

        private p() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1216357294;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<p> serializer() {
            return (i63.c) f26180a.getValue();
        }

        public final String toString() {
            return "Weight";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/c4$q;", "Lca0/c4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class q implements c4 {
        public static final q INSTANCE = new q();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26181a = o13.m.a(o13.n.PUBLICATION, new d4(4));

        private q() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 69556977;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<q> serializer() {
            return (i63.c) f26181a.getValue();
        }

        public final String toString() {
            return "WheelchairActivityLevel";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/c4$b;", "Lca0/c4;", "", "bedTimeSeconds", "wakeTimeSeconds", "", "sleepCaptionDoNotDisturb", "<init>", "(IILjava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b implements c4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26153c;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/UserProfileRoute.AdvanceSleepIntro.$serializer", "Lm63/e0;", "Lca0/c4$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26154a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26154a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.AdvanceSleepIntro", aVar, 3);
                m1Var.j("bedTimeSeconds", false);
                m1Var.j("wakeTimeSeconds", false);
                m1Var.j("sleepCaptionDoNotDisturb", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.m0 m0Var = m63.m0.f116981a;
                return new i63.c[]{m0Var, m0Var, m63.y1.f117048a};
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
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        iA = cVarC.A(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        iA2 = cVarC.A(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new b(i15, iA, iA2, strR, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.v(0, bVar.f26151a, eVar);
                dVarC.v(1, bVar.f26152b, eVar);
                dVarC.k(eVar, 2, bVar.f26153c);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ b(int i14, int i15, int i16, String str, m63.u1 u1Var) {
            if (7 != (i14 & 7)) {
                m63.k1.h(i14, 7, a.f26154a.getF158591b());
                throw null;
            }
            this.f26151a = i15;
            this.f26152b = i16;
            this.f26153c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26151a == bVar.f26151a && this.f26152b == bVar.f26152b && p005kotlin.jvm.internal.s.g(this.f26153c, bVar.f26153c);
        }

        public final int hashCode() {
            return this.f26153c.hashCode() + r1.q2.d(this.f26152b, Integer.hashCode(this.f26151a) * 31, 31);
        }

        public final String toString() {
            return am.j.o(this.f26153c, ")", e5.j(this.f26151a, this.f26152b, "AdvanceSleepIntro(bedTimeSeconds=", ", wakeTimeSeconds=", ", sleepCaptionDoNotDisturb="));
        }

        /* JADX INFO: renamed from: ca0.c4$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$b$b;", "", "<init>", "()V", "Li63/c;", "Lca0/c4$b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return a.f26154a;
            }

            private Companion() {
            }
        }

        public b(int i14, int i15, String str) {
            str.getClass();
            this.f26151a = i14;
            this.f26152b = i15;
            this.f26153c = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/c4$c;", "Lca0/c4;", "", "fromReturningUserReview", "<init>", "(Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c implements c4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26155a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/UserProfileRoute.AdvancedSleepWindows.$serializer", "Lm63/e0;", "Lca0/c4$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26156a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26156a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.AdvancedSleepWindows", aVar, 1);
                m1Var.j("fromReturningUserReview", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.g.f116948a};
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
                while (true) {
                    m63.u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new c(i15, zG, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 0);
                        i15 = 1;
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
                c cVar = (c) obj;
                cVar.getClass();
                boolean z14 = cVar.f26155a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 0, z14);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ c(int i14, boolean z14, m63.u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f26155a = false;
            } else {
                this.f26155a = z14;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f26155a == ((c) obj).f26155a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f26155a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("AdvancedSleepWindows(fromReturningUserReview=", ")", this.f26155a);
        }

        /* JADX INFO: renamed from: ca0.c4$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$c$b;", "", "<init>", "()V", "Li63/c;", "Lca0/c4$c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f26156a;
            }

            private Companion() {
            }
        }

        public c() {
            this(false, 1, (p005kotlin.jvm.internal.j) null);
        }

        public c(boolean z14) {
            this.f26155a = z14;
        }

        public /* synthetic */ c(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/c4$e;", "Lca0/c4;", "", "initialSeconds", "<init>", "(J)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e implements c4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26158a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/UserProfileRoute.BottomTime.$serializer", "Lm63/e0;", "Lca0/c4$e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26159a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26159a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.BottomTime", aVar, 1);
                m1Var.j("initialSeconds", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.v0.f117027a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                long jW = 0;
                boolean z14 = true;
                int i15 = 0;
                while (true) {
                    m63.u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new e(i15, jW, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        jW = cVarC.w(eVar2, 0);
                        i15 = 1;
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
                e eVar = (e) obj;
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.d dVarC = fVar.c(eVar2);
                dVarC.z(eVar2, 0, eVar.f26158a);
                dVarC.b(eVar2);
            }
        }

        public /* synthetic */ e(int i14, long j8, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26158a = j8;
            } else {
                m63.k1.h(i14, 1, a.f26159a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f26158a == ((e) obj).f26158a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26158a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f26158a, "BottomTime(initialSeconds=", ")");
        }

        /* JADX INFO: renamed from: ca0.c4$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$e$b;", "", "<init>", "()V", "Li63/c;", "Lca0/c4$e;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<e> serializer() {
                return a.f26159a;
            }

            private Companion() {
            }
        }

        public e(long j8) {
            this.f26158a = j8;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/c4$i;", "Lca0/c4;", "Ls90/f;", "userShortName", "<init>", "(Ls90/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILs90/f;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i implements c4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s90.f f26167a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/UserProfileRoute.IndexScaleShortName.$serializer", "Lm63/e0;", "Lca0/c4$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26168a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26168a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.IndexScaleShortName", aVar, 1);
                m1Var.j("userShortName", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{s90.f.a.f158034a};
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
                s90.f fVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        fVar = (s90.f) cVarC.l(eVar2, 0, s90.f.a.f158034a, fVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new i(i15, fVar, u1Var);
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
                dVarC.e(eVar, 0, s90.f.a.f158034a, iVar.f26167a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ i(int i14, s90.f fVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26167a = fVar;
            } else {
                m63.k1.h(i14, 1, a.f26168a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && p005kotlin.jvm.internal.s.g(this.f26167a, ((i) obj).f26167a);
        }

        public final int hashCode() {
            return this.f26167a.hashCode();
        }

        public final String toString() {
            return "IndexScaleShortName(userShortName=" + this.f26167a + ")";
        }

        /* JADX INFO: renamed from: ca0.c4$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$i$b;", "", "<init>", "()V", "Li63/c;", "Lca0/c4$i;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return a.f26168a;
            }

            private Companion() {
            }
        }

        public i(s90.f fVar) {
            fVar.getClass();
            this.f26167a = fVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/c4$n;", "Lca0/c4;", "", "isReturningUser", "", "sleepCaptionDoNotDisturb", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class n implements c4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26174b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/UserProfileRoute.ReviewSleepSchedules.$serializer", "Lm63/e0;", "Lca0/c4$n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26175a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26175a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ReviewSleepSchedules", aVar, 2);
                m1Var.j("isReturningUser", true);
                m1Var.j("sleepCaptionDoNotDisturb", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.g.f116948a, m63.y1.f117048a};
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
                boolean zG = false;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        zG = cVarC.g(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new n(i15, zG, strR, u1Var);
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
                boolean z14 = nVar.f26173a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 0, z14);
                }
                dVarC.k(eVar, 1, nVar.f26174b);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ n(int i14, boolean z14, String str, m63.u1 u1Var) {
            if (2 != (i14 & 2)) {
                m63.k1.h(i14, 2, a.f26175a.getF158591b());
                throw null;
            }
            if ((i14 & 1) == 0) {
                this.f26173a = false;
            } else {
                this.f26173a = z14;
            }
            this.f26174b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f26173a == nVar.f26173a && p005kotlin.jvm.internal.s.g(this.f26174b, nVar.f26174b);
        }

        public final int hashCode() {
            return this.f26174b.hashCode() + (Boolean.hashCode(this.f26173a) * 31);
        }

        public final String toString() {
            return "ReviewSleepSchedules(isReturningUser=" + this.f26173a + ", sleepCaptionDoNotDisturb=" + this.f26174b + ")";
        }

        /* JADX INFO: renamed from: ca0.c4$n$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$n$b;", "", "<init>", "()V", "Li63/c;", "Lca0/c4$n;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<n> serializer() {
                return a.f26175a;
            }

            private Companion() {
            }
        }

        public n(boolean z14, String str) {
            str.getClass();
            this.f26173a = z14;
            this.f26174b = str;
        }

        public /* synthetic */ n(boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, str);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/c4$o;", "Lca0/c4;", "", "bedTimeSeconds", "wakeTimeSeconds", "", "sleepCaptionDoNotDisturb", "<init>", "(IILjava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class o implements c4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26178c;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/UserProfileRoute.SimpleSleep.$serializer", "Lm63/e0;", "Lca0/c4$o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26179a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26179a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.SimpleSleep", aVar, 3);
                m1Var.j("bedTimeSeconds", false);
                m1Var.j("wakeTimeSeconds", false);
                m1Var.j("sleepCaptionDoNotDisturb", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.m0 m0Var = m63.m0.f116981a;
                return new i63.c[]{m0Var, m0Var, m63.y1.f117048a};
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
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        iA = cVarC.A(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        iA2 = cVarC.A(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new o(i15, iA, iA2, strR, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                o oVar = (o) obj;
                oVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.v(0, oVar.f26176a, eVar);
                dVarC.v(1, oVar.f26177b, eVar);
                dVarC.k(eVar, 2, oVar.f26178c);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ o(int i14, int i15, int i16, String str, m63.u1 u1Var) {
            if (7 != (i14 & 7)) {
                m63.k1.h(i14, 7, a.f26179a.getF158591b());
                throw null;
            }
            this.f26176a = i15;
            this.f26177b = i16;
            this.f26178c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f26176a == oVar.f26176a && this.f26177b == oVar.f26177b && p005kotlin.jvm.internal.s.g(this.f26178c, oVar.f26178c);
        }

        public final int hashCode() {
            return this.f26178c.hashCode() + r1.q2.d(this.f26177b, Integer.hashCode(this.f26176a) * 31, 31);
        }

        public final String toString() {
            return am.j.o(this.f26178c, ")", e5.j(this.f26176a, this.f26177b, "SimpleSleep(bedTimeSeconds=", ", wakeTimeSeconds=", ", sleepCaptionDoNotDisturb="));
        }

        /* JADX INFO: renamed from: ca0.c4$o$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/c4$o$b;", "", "<init>", "()V", "Li63/c;", "Lca0/c4$o;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<o> serializer() {
                return a.f26179a;
            }

            private Companion() {
            }
        }

        public o(int i14, int i15, String str) {
            str.getClass();
            this.f26176a = i14;
            this.f26177b = i15;
            this.f26178c = str;
        }
    }
}

package ca0;

import android.os.Bundle;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i63.h
public interface b1 {
    public static final a Companion = a.f26080a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$a;", "", "<init>", "()V", "Li63/c;", "Lca0/b1;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f26080a = new a();

        /* JADX INFO: renamed from: ca0.b1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$a", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0399a extends lc.q0<l90.b> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26081s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0399a(n63.b bVar) {
                super(true);
                this.f26081s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l90.b] */
            @Override // lc.q0
            public final l90.b a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26081s;
                bVar.getClass();
                return bVar.c(l90.b.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l90.b] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final l90.b h(String str) {
                str.getClass();
                n63.b bVar = this.f26081s;
                bVar.getClass();
                return bVar.c(l90.b.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, l90.b bVar) {
                str.getClass();
                n63.b bVar2 = this.f26081s;
                bVar2.getClass();
                bundle.putString(str, bVar2.b(j63.a.d(l90.b.INSTANCE.serializer()), bVar));
            }

            @Override // lc.q0
            public final String f(l90.b bVar) {
                n63.b bVar2 = this.f26081s;
                bVar2.getClass();
                return r1.q2.j(bVar2, j63.a.d(l90.b.INSTANCE.serializer()), bVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$b", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends lc.q0<List<? extends l90.b>> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26082s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n63.b bVar) {
                super(true);
                this.f26082s = bVar;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends l90.b>] */
            @Override // lc.q0
            public final List<? extends l90.b> a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26082s;
                bVar.getClass();
                return bVar.c(new m63.e(l90.b.INSTANCE.serializer()), strI);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends l90.b>] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final List<? extends l90.b> h(String str) {
                str.getClass();
                n63.b bVar = this.f26082s;
                bVar.getClass();
                return bVar.c(new m63.e(l90.b.INSTANCE.serializer()), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, List<? extends l90.b> list) {
                str.getClass();
                n63.b bVar = this.f26082s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(new m63.e(l90.b.INSTANCE.serializer())), list));
            }

            @Override // lc.q0
            public final String f(List<? extends l90.b> list) {
                n63.b bVar = this.f26082s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(new m63.e(l90.b.INSTANCE.serializer())), list);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$c", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends lc.q0<l90.k> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26083s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n63.b bVar) {
                super(true);
                this.f26083s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l90.k] */
            @Override // lc.q0
            public final l90.k a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26083s;
                bVar.getClass();
                return bVar.c(l90.k.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l90.k] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final l90.k h(String str) {
                str.getClass();
                n63.b bVar = this.f26083s;
                bVar.getClass();
                return bVar.c(l90.k.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, l90.k kVar) {
                str.getClass();
                n63.b bVar = this.f26083s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(l90.k.INSTANCE.serializer()), kVar));
            }

            @Override // lc.q0
            public final String f(l90.k kVar) {
                n63.b bVar = this.f26083s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(l90.k.INSTANCE.serializer()), kVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$d", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends lc.q0<l90.k> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26084s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n63.b bVar) {
                super(true);
                this.f26084s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l90.k] */
            @Override // lc.q0
            public final l90.k a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26084s;
                bVar.getClass();
                return bVar.c(j63.a.d(l90.k.INSTANCE.serializer()), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l90.k] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final l90.k h(String str) {
                str.getClass();
                n63.b bVar = this.f26084s;
                bVar.getClass();
                return bVar.c(j63.a.d(l90.k.INSTANCE.serializer()), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, l90.k kVar) {
                str.getClass();
                n63.b bVar = this.f26084s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(l90.k.INSTANCE.serializer()), kVar));
            }

            @Override // lc.q0
            public final String f(l90.k kVar) {
                n63.b bVar = this.f26084s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(l90.k.INSTANCE.serializer()), kVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$e", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends lc.q0<List<? extends l90.k>> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26085s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(n63.b bVar) {
                super(true);
                this.f26085s = bVar;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends l90.k>] */
            @Override // lc.q0
            public final List<? extends l90.k> a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26085s;
                bVar.getClass();
                return bVar.c(new m63.e(l90.k.INSTANCE.serializer()), strI);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends l90.k>] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final List<? extends l90.k> h(String str) {
                str.getClass();
                n63.b bVar = this.f26085s;
                bVar.getClass();
                return bVar.c(new m63.e(l90.k.INSTANCE.serializer()), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, List<? extends l90.k> list) {
                str.getClass();
                n63.b bVar = this.f26085s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(new m63.e(l90.k.INSTANCE.serializer())), list));
            }

            @Override // lc.q0
            public final String f(List<? extends l90.k> list) {
                n63.b bVar = this.f26085s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(new m63.e(l90.k.INSTANCE.serializer())), list);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$f", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class f extends lc.q0<d90.b> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26086s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(n63.b bVar) {
                super(true);
                this.f26086s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [d90.b, java.lang.Object] */
            @Override // lc.q0
            public final d90.b a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26086s;
                bVar.getClass();
                return bVar.c(d90.b.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [d90.b, java.lang.Object] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final d90.b h(String str) {
                str.getClass();
                n63.b bVar = this.f26086s;
                bVar.getClass();
                return bVar.c(d90.b.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, d90.b bVar) {
                str.getClass();
                n63.b bVar2 = this.f26086s;
                bVar2.getClass();
                bundle.putString(str, bVar2.b(j63.a.d(d90.b.INSTANCE.serializer()), bVar));
            }

            @Override // lc.q0
            public final String f(d90.b bVar) {
                n63.b bVar2 = this.f26086s;
                bVar2.getClass();
                return r1.q2.j(bVar2, j63.a.d(d90.b.INSTANCE.serializer()), bVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ca0/b1$a$g", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class g extends lc.q0<List<? extends nv.e>> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f26087s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(n63.b bVar) {
                super(true);
                this.f26087s = bVar;
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List<? extends nv.e>] */
            @Override // lc.q0
            public final List<? extends nv.e> a(Bundle bundle, String str) {
                String strI = r1.q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f26087s;
                bVar.getClass();
                return bVar.c(new m63.e(new m63.b0("com.garmin.android.apps.connectmobile.bic.device.troubleshooting.TroubleshootingInstruction", nv.e.values())), strI);
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends nv.e>] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final List<? extends nv.e> h(String str) {
                str.getClass();
                n63.b bVar = this.f26087s;
                bVar.getClass();
                return bVar.c(new m63.e(new m63.b0("com.garmin.android.apps.connectmobile.bic.device.troubleshooting.TroubleshootingInstruction", nv.e.values())), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, List<? extends nv.e> list) {
                str.getClass();
                n63.b bVar = this.f26087s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(new m63.e(new m63.b0("com.garmin.android.apps.connectmobile.bic.device.troubleshooting.TroubleshootingInstruction", nv.e.values()))), list));
            }

            @Override // lc.q0
            public final String f(List<? extends nv.e> list) {
                n63.b bVar = this.f26087s;
                bVar.getClass();
                return r1.q2.j(bVar, j63.a.d(new m63.e(new m63.b0("com.garmin.android.apps.connectmobile.bic.device.troubleshooting.TroubleshootingInstruction", nv.e.values()))), list);
            }
        }

        private a() {
        }

        public static Map a() {
            k23.p pVarC = p005kotlin.jvm.internal.s0.c(l90.b.class);
            n63.b.a aVar = n63.b.f123892d;
            o13.p pVar = new o13.p(pVarC, new C0399a(aVar));
            k23.r.a aVar2 = k23.r.f102461c;
            k23.p pVarC2 = p005kotlin.jvm.internal.s0.c(l90.b.class);
            aVar2.getClass();
            return p13.u0.e(pVar, new o13.p(p005kotlin.jvm.internal.s0.d(List.class, k23.r.a.a(pVarC2)), new b(aVar)), new o13.p(p005kotlin.jvm.internal.s0.c(l90.k.class), new c(aVar)), new o13.p(p005kotlin.jvm.internal.s0.b(l90.k.class), new d(aVar)), new o13.p(p005kotlin.jvm.internal.s0.d(List.class, k23.r.a.a(p005kotlin.jvm.internal.s0.c(l90.k.class))), new e(aVar)), new o13.p(p005kotlin.jvm.internal.s0.c(d90.b.class), new f(aVar)), new o13.p(p005kotlin.jvm.internal.s0.d(List.class, k23.r.a.a(p005kotlin.jvm.internal.s0.c(nv.e.class))), new g(aVar)));
        }

        public final i63.c<b1> serializer() {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            return new i63.g("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute", t0Var.b(b1.class), new k23.d[]{t0Var.b(b.class), t0Var.b(c.class), t0Var.b(d.class), t0Var.b(e.class), t0Var.b(f.class), t0Var.b(g.class), t0Var.b(h.class), t0Var.b(i.class), t0Var.b(j.class), t0Var.b(k.class), t0Var.b(l.class), t0Var.b(m.class), t0Var.b(n.class), t0Var.b(o.class), t0Var.b(p.class), t0Var.b(q.class), t0Var.b(r.class)}, new i63.c[]{b.a.f26089a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.Detection", c.INSTANCE, new Annotation[0]), d.a.f26092a, e.a.f26095a, f.a.f26097a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceList", g.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceNotFound", h.INSTANCE, new Annotation[0]), i.a.f26102a, j.a.f26105a, k.a.f26108a, l.a.f26111a, m.a.f26113a, n.a.f26116a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.More", o.INSTANCE, new Annotation[0]), p.a.f26120a, new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.ScanPermissions", q.INSTANCE, new Annotation[0]), r.a.f26123a}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/b1$c;", "Lca0/b1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c implements b1 {
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26090a = o13.m.a(o13.n.PUBLICATION, new j0(6));

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1087502897;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) f26090a.getValue();
        }

        public final String toString() {
            return "Detection";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/b1$g;", "Lca0/b1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g implements b1 {
        public static final g INSTANCE = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26098a = o13.m.a(o13.n.PUBLICATION, new j0(7));

        private g() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -921872886;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<g> serializer() {
            return (i63.c) f26098a.getValue();
        }

        public final String toString() {
            return "DeviceList";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/b1$h;", "Lca0/b1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h implements b1 {
        public static final h INSTANCE = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26099a = o13.m.a(o13.n.PUBLICATION, new j0(8));

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1132976091;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<h> serializer() {
            return (i63.c) f26099a.getValue();
        }

        public final String toString() {
            return "DeviceNotFound";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/b1$o;", "Lca0/b1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class o implements b1 {
        public static final o INSTANCE = new o();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26117a = o13.m.a(o13.n.PUBLICATION, new j0(9));

        private o() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 651401675;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<o> serializer() {
            return (i63.c) f26117a.getValue();
        }

        public final String toString() {
            return "More";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lca0/b1$q;", "Lca0/b1;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class q implements b1 {
        public static final q INSTANCE = new q();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f26121a = o13.m.a(o13.n.PUBLICATION, new j0(11));

        private q() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1195897233;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<q> serializer() {
            return (i63.c) f26121a.getValue();
        }

        public final String toString() {
            return "ScanPermissions";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/b1$b;", "Lca0/b1;", "Ll90/k;", "device", "<init>", "(Ll90/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.k f26088a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.Detected.$serializer", "Lm63/e0;", "Lca0/b1$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26089a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26089a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.Detected", aVar, 1);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.k.a.f111583a};
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
                l90.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        kVar = (l90.k) cVarC.l(eVar2, 0, l90.k.a.f111583a, kVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new b(i15, kVar, u1Var);
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
                dVarC.e(eVar, 0, l90.k.a.f111583a, bVar.f26088a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ b(int i14, l90.k kVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26088a = kVar;
            } else {
                m63.k1.h(i14, 1, a.f26089a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f26088a, ((b) obj).f26088a);
        }

        public final int hashCode() {
            return this.f26088a.hashCode();
        }

        public final String toString() {
            return "Detected(device=" + this.f26088a + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$b$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return a.f26089a;
            }

            private Companion() {
            }
        }

        public b(l90.k kVar) {
            kVar.getClass();
            this.f26088a = kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/b1$d;", "Lca0/b1;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26091a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceAntIdInput.$serializer", "Lm63/e0;", "Lca0/b1$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26092a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26092a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceAntIdInput", aVar, 1);
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
                return new d(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, l90.b.a.f111532a, dVar.f26091a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ d(int i14, l90.b bVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26091a = bVar;
            } else {
                m63.k1.h(i14, 1, a.f26092a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f26091a, ((d) obj).f26091a);
        }

        public final int hashCode() {
            return this.f26091a.hashCode();
        }

        public final String toString() {
            return "DeviceAntIdInput(device=" + this.f26091a + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$d$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$d;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return a.f26092a;
            }

            private Companion() {
            }
        }

        public d(l90.b bVar) {
            bVar.getClass();
            this.f26091a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/b1$e;", "Lca0/b1;", "Ll90/b;", "device", "", "dualBleMacAddress", "<init>", "(Ll90/b;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26094b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceBTCScanning.$serializer", "Lm63/e0;", "Lca0/b1$e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26095a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26095a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceBTCScanning", aVar, 2);
                m1Var.j("device", false);
                m1Var.j("dualBleMacAddress", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.b.a.f111532a, j63.a.d(m63.y1.f117048a)};
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
                String str = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        bVar = (l90.b) cVarC.l(eVar2, 0, l90.b.a.f111532a, bVar);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        str = (String) cVarC.v(eVar2, 1, m63.y1.f117048a, str);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new e(i15, bVar, str, u1Var);
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
                l90.b.a aVar = l90.b.a.f111532a;
                l90.b bVar = eVar.f26093a;
                String str = eVar.f26094b;
                dVarC.e(eVar2, 0, aVar, bVar);
                if (dVarC.C(eVar2) || str != null) {
                    dVarC.d(eVar2, 1, m63.y1.f117048a, str);
                }
                dVarC.b(eVar2);
            }
        }

        public /* synthetic */ e(int i14, l90.b bVar, String str, m63.u1 u1Var) {
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, a.f26095a.getF158591b());
                throw null;
            }
            this.f26093a = bVar;
            if ((i14 & 2) == 0) {
                this.f26094b = null;
            } else {
                this.f26094b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p005kotlin.jvm.internal.s.g(this.f26093a, eVar.f26093a) && p005kotlin.jvm.internal.s.g(this.f26094b, eVar.f26094b);
        }

        public final int hashCode() {
            int iHashCode = this.f26093a.hashCode() * 31;
            String str = this.f26094b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "DeviceBTCScanning(device=" + this.f26093a + ", dualBleMacAddress=" + this.f26094b + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$e$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$e;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<e> serializer() {
                return a.f26095a;
            }

            private Companion() {
            }
        }

        public e(l90.b bVar, String str) {
            bVar.getClass();
            this.f26093a = bVar;
            this.f26094b = str;
        }

        public /* synthetic */ e(l90.b bVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, (i14 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/b1$f;", "Lca0/b1;", "Ll90/k;", "device", "<init>", "(Ll90/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.k f26096a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceConfirm.$serializer", "Lm63/e0;", "Lca0/b1$f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26097a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26097a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceConfirm", aVar, 1);
                m1Var.j("device", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.k.a.f111583a};
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
                l90.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        kVar = (l90.k) cVarC.l(eVar2, 0, l90.k.a.f111583a, kVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new f(i15, kVar, u1Var);
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
                dVarC.e(eVar, 0, l90.k.a.f111583a, fVar2.f26096a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ f(int i14, l90.k kVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26096a = kVar;
            } else {
                m63.k1.h(i14, 1, a.f26097a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f26096a, ((f) obj).f26096a);
        }

        public final int hashCode() {
            return this.f26096a.hashCode();
        }

        public final String toString() {
            return "DeviceConfirm(device=" + this.f26096a + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$f$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$f;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<f> serializer() {
                return a.f26097a;
            }

            private Companion() {
            }
        }

        public f(l90.k kVar) {
            kVar.getClass();
            this.f26096a = kVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/b1$i;", "Lca0/b1;", "Ll90/b;", "device", "Ll90/k;", "scannedDevice", "<init>", "(Ll90/b;Ll90/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Ll90/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.k f26101b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DevicePairTutorials.$serializer", "Lm63/e0;", "Lca0/b1$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26102a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26102a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DevicePairTutorials", aVar, 2);
                m1Var.j("device", false);
                m1Var.j("scannedDevice", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.b.a.f111532a, j63.a.d(l90.k.a.f111583a)};
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
                l90.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        bVar = (l90.b) cVarC.l(eVar2, 0, l90.b.a.f111532a, bVar);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        kVar = (l90.k) cVarC.v(eVar2, 1, l90.k.a.f111583a, kVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new i(i15, bVar, kVar, u1Var);
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
                l90.b.a aVar = l90.b.a.f111532a;
                l90.b bVar = iVar.f26100a;
                l90.k kVar = iVar.f26101b;
                dVarC.e(eVar, 0, aVar, bVar);
                if (dVarC.C(eVar) || kVar != null) {
                    dVarC.d(eVar, 1, l90.k.a.f111583a, kVar);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ i(int i14, l90.b bVar, l90.k kVar, m63.u1 u1Var) {
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, a.f26102a.getF158591b());
                throw null;
            }
            this.f26100a = bVar;
            if ((i14 & 2) == 0) {
                this.f26101b = null;
            } else {
                this.f26101b = kVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p005kotlin.jvm.internal.s.g(this.f26100a, iVar.f26100a) && p005kotlin.jvm.internal.s.g(this.f26101b, iVar.f26101b);
        }

        public final int hashCode() {
            int iHashCode = this.f26100a.hashCode() * 31;
            l90.k kVar = this.f26101b;
            return iHashCode + (kVar == null ? 0 : kVar.hashCode());
        }

        public final String toString() {
            return "DevicePairTutorials(device=" + this.f26100a + ", scannedDevice=" + this.f26101b + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$i$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$i;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return a.f26102a;
            }

            private Companion() {
            }
        }

        public i(l90.b bVar, l90.k kVar) {
            bVar.getClass();
            this.f26100a = bVar;
            this.f26101b = kVar;
        }

        public /* synthetic */ i(l90.b bVar, l90.k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, (i14 & 2) != 0 ? null : kVar);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/b1$j;", "Lca0/b1;", "Ll90/k;", "device", "", "passkey", "<init>", "(Ll90/k;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/k;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.k f26103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26104b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DevicePasskeyConfirm.$serializer", "Lm63/e0;", "Lca0/b1$j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26105a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26105a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DevicePasskeyConfirm", aVar, 2);
                m1Var.j("device", false);
                m1Var.j("passkey", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.k.a.f111583a, m63.y1.f117048a};
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
                l90.k kVar = null;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        kVar = (l90.k) cVarC.l(eVar2, 0, l90.k.a.f111583a, kVar);
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
                return new j(i15, kVar, strR, u1Var);
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
                dVarC.e(eVar, 0, l90.k.a.f111583a, jVar.f26103a);
                dVarC.k(eVar, 1, jVar.f26104b);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ j(int i14, l90.k kVar, String str, m63.u1 u1Var) {
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f26105a.getF158591b());
                throw null;
            }
            this.f26103a = kVar;
            this.f26104b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p005kotlin.jvm.internal.s.g(this.f26103a, jVar.f26103a) && p005kotlin.jvm.internal.s.g(this.f26104b, jVar.f26104b);
        }

        public final int hashCode() {
            return this.f26104b.hashCode() + (this.f26103a.hashCode() * 31);
        }

        public final String toString() {
            return "DevicePasskeyConfirm(device=" + this.f26103a + ", passkey=" + this.f26104b + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$j$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$j$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$j;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<j> serializer() {
                return a.f26105a;
            }

            private Companion() {
            }
        }

        public j(l90.k kVar, String str) {
            kVar.getClass();
            str.getClass();
            this.f26103a = kVar;
            this.f26104b = str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/b1$k;", "Lca0/b1;", "Ll90/b;", "device", "Ld90/b;", "screenContent", "<init>", "(Ll90/b;Ld90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Ld90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d90.b f26107b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceScanInstructions.$serializer", "Lm63/e0;", "Lca0/b1$k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26108a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26108a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceScanInstructions", aVar, 2);
                m1Var.j("device", false);
                m1Var.j("screenContent", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.b.a.f111532a, d90.b.a.f58428a};
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
                d90.b bVar2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        bVar = (l90.b) cVarC.l(eVar2, 0, l90.b.a.f111532a, bVar);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar2 = (d90.b) cVarC.l(eVar2, 1, d90.b.a.f58428a, bVar2);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new k(i15, bVar, bVar2, u1Var);
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
                dVarC.e(eVar, 0, l90.b.a.f111532a, kVar.f26106a);
                dVarC.e(eVar, 1, d90.b.a.f58428a, kVar.f26107b);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ k(int i14, l90.b bVar, d90.b bVar2, m63.u1 u1Var) {
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f26108a.getF158591b());
                throw null;
            }
            this.f26106a = bVar;
            this.f26107b = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p005kotlin.jvm.internal.s.g(this.f26106a, kVar.f26106a) && p005kotlin.jvm.internal.s.g(this.f26107b, kVar.f26107b);
        }

        public final int hashCode() {
            return this.f26107b.hashCode() + (this.f26106a.hashCode() * 31);
        }

        public final String toString() {
            return "DeviceScanInstructions(device=" + this.f26106a + ", screenContent=" + this.f26107b + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$k$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$k$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$k;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<k> serializer() {
                return a.f26108a;
            }

            private Companion() {
            }
        }

        public k(l90.b bVar, d90.b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.f26106a = bVar;
            this.f26107b = bVar2;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lca0/b1$l;", "Lca0/b1;", "Ll90/b;", "device", "", "antId", "<init>", "(Ll90/b;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f26110b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceScanning.$serializer", "Lm63/e0;", "Lca0/b1$l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26111a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26111a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceScanning", aVar, 2);
                m1Var.j("device", false);
                m1Var.j("antId", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l90.b.a.f111532a, j63.a.d(m63.v0.f117027a)};
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
                Long l14 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        bVar = (l90.b) cVarC.l(eVar2, 0, l90.b.a.f111532a, bVar);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        l14 = (Long) cVarC.v(eVar2, 1, m63.v0.f117027a, l14);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new l(i15, bVar, l14, u1Var);
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
                l90.b.a aVar = l90.b.a.f111532a;
                l90.b bVar = lVar.f26109a;
                Long l14 = lVar.f26110b;
                dVarC.e(eVar, 0, aVar, bVar);
                if (dVarC.C(eVar) || l14 != null) {
                    dVarC.d(eVar, 1, m63.v0.f117027a, l14);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ l(int i14, l90.b bVar, Long l14, m63.u1 u1Var) {
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, a.f26111a.getF158591b());
                throw null;
            }
            this.f26109a = bVar;
            if ((i14 & 2) == 0) {
                this.f26110b = null;
            } else {
                this.f26110b = l14;
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
            return p005kotlin.jvm.internal.s.g(this.f26109a, lVar.f26109a) && p005kotlin.jvm.internal.s.g(this.f26110b, lVar.f26110b);
        }

        public final int hashCode() {
            int iHashCode = this.f26109a.hashCode() * 31;
            Long l14 = this.f26110b;
            return iHashCode + (l14 == null ? 0 : l14.hashCode());
        }

        public final String toString() {
            return "DeviceScanning(device=" + this.f26109a + ", antId=" + this.f26110b + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$l$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$l$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$l;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<l> serializer() {
                return a.f26111a;
            }

            private Companion() {
            }
        }

        public l(l90.b bVar, Long l14) {
            bVar.getClass();
            this.f26109a = bVar;
            this.f26110b = l14;
        }

        public /* synthetic */ l(l90.b bVar, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, (i14 & 2) != 0 ? null : l14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/b1$m;", "Lca0/b1;", "", "_deviceFamily", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26112a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceTypeList.$serializer", "Lm63/e0;", "Lca0/b1$m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26113a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26113a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceTypeList", aVar, 1);
                m1Var.j("_deviceFamily", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.y1.f117048a};
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
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 0);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new m(i15, strR, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                m mVar = (m) obj;
                mVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, mVar.f26112a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ m(int i14, String str, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26112a = str;
            } else {
                m63.k1.h(i14, 1, a.f26113a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && p005kotlin.jvm.internal.s.g(this.f26112a, ((m) obj).f26112a);
        }

        public final int hashCode() {
            return this.f26112a.hashCode();
        }

        public final String toString() {
            return am.j.m("DeviceTypeList(_deviceFamily=", this.f26112a, ")");
        }

        /* JADX INFO: renamed from: ca0.b1$m$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$m$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$m;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<m> serializer() {
                return a.f26113a;
            }

            private Companion() {
            }
        }

        public m(String str) {
            str.getClass();
            this.f26112a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lca0/b1$n;", "Lca0/b1;", "", "deviceProductNumber", "deviceApplicationKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class n implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26115b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.DeviceTypeScanning.$serializer", "Lm63/e0;", "Lca0/b1$n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26116a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26116a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceTypeScanning", aVar, 2);
                m1Var.j("deviceProductNumber", false);
                m1Var.j("deviceApplicationKey", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var)};
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
                String str = null;
                String str2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        str = (String) cVarC.v(eVar2, 0, m63.y1.f117048a, str);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        str2 = (String) cVarC.v(eVar2, 1, m63.y1.f117048a, str2);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new n(i15, str, str2, u1Var);
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
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                m63.y1 y1Var = m63.y1.f117048a;
                dVarC.d(eVar, 0, y1Var, nVar.f26114a);
                dVarC.d(eVar, 1, y1Var, nVar.f26115b);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ n(int i14, String str, String str2, m63.u1 u1Var) {
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f26116a.getF158591b());
                throw null;
            }
            this.f26114a = str;
            this.f26115b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return p005kotlin.jvm.internal.s.g(this.f26114a, nVar.f26114a) && p005kotlin.jvm.internal.s.g(this.f26115b, nVar.f26115b);
        }

        public final int hashCode() {
            String str = this.f26114a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26115b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return v.e0.g("DeviceTypeScanning(deviceProductNumber=", this.f26114a, ", deviceApplicationKey=", this.f26115b, ")");
        }

        /* JADX INFO: renamed from: ca0.b1$n$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$n$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$n;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<n> serializer() {
                return a.f26116a;
            }

            private Companion() {
            }
        }

        public n(String str, String str2) {
            this.f26114a = str;
            this.f26115b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lca0/b1$p;", "Lca0/b1;", "", "Ll90/k;", "devices", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class p implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f26118b = {o13.m.a(o13.n.PUBLICATION, new j0(10))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<l90.k> f26119a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.MultipleDeviceDetected.$serializer", "Lm63/e0;", "Lca0/b1$p;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26120a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26120a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.MultipleDeviceDetected", aVar, 1);
                m1Var.j("devices", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{p.f26118b[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = p.f26118b;
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new p(i15, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                p pVar = (p) obj;
                pVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, p.f26118b[0].getValue(), pVar.f26119a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ p(int i14, List list, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26119a = list;
            } else {
                m63.k1.h(i14, 1, a.f26120a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && p005kotlin.jvm.internal.s.g(this.f26119a, ((p) obj).f26119a);
        }

        public final int hashCode() {
            return this.f26119a.hashCode();
        }

        public final String toString() {
            return tn.k.h("MultipleDeviceDetected(devices=", ")", this.f26119a);
        }

        /* JADX INFO: renamed from: ca0.b1$p$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$p$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$p;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<p> serializer() {
                return a.f26120a;
            }

            private Companion() {
            }
        }

        public p(List<l90.k> list) {
            list.getClass();
            this.f26119a = list;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lca0/b1$r;", "Lca0/b1;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl90/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class r implements b1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f26122a;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/navigation/DeviceDiscoveryRoute.Troubleshooting.$serializer", "Lm63/e0;", "Lca0/b1$r;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26123a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f26123a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.Troubleshooting", aVar, 1);
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
                return new r(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                r rVar = (r) obj;
                rVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, l90.b.a.f111532a, rVar.f26122a);
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ r(int i14, l90.b bVar, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f26122a = bVar;
            } else {
                m63.k1.h(i14, 1, a.f26123a.getF158591b());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && p005kotlin.jvm.internal.s.g(this.f26122a, ((r) obj).f26122a);
        }

        public final int hashCode() {
            return this.f26122a.hashCode();
        }

        public final String toString() {
            return "Troubleshooting(device=" + this.f26122a + ")";
        }

        /* JADX INFO: renamed from: ca0.b1$r$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b1$r$b;", "", "<init>", "()V", "Li63/c;", "Lca0/b1$r;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<r> serializer() {
                return a.f26123a;
            }

            private Companion() {
            }
        }

        public r(l90.b bVar) {
            bVar.getClass();
            this.f26122a = bVar;
        }
    }
}

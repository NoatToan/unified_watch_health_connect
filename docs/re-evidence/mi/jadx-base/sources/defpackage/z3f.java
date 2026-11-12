package defpackage;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.ProtoSyntax;
import androidx.health.platform.client.proto.f0;
import androidx.health.platform.client.proto.j0;
import androidx.health.platform.client.proto.q0;
import androidx.health.platform.client.proto.r0;
import androidx.health.platform.client.proto.w1;
import androidx.health.platform.client.proto.x1;

/* JADX INFO: loaded from: classes.dex */
public final class z3f implements sfl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vrf f40834b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrf f40835a;

    public class a implements vrf {
        @Override // defpackage.vrf
        public rrf a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.vrf
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements vrf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public vrf[] f40836a;

        public b(vrf... vrfVarArr) {
            this.f40836a = vrfVarArr;
        }

        @Override // defpackage.vrf
        public rrf a(Class<?> cls) {
            for (vrf vrfVar : this.f40836a) {
                if (vrfVar.b(cls)) {
                    return vrfVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // defpackage.vrf
        public boolean b(Class<?> cls) {
            for (vrf vrfVar : this.f40836a) {
                if (vrfVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public z3f() {
        this(b());
    }

    public static vrf b() {
        return new b(uxa.c(), c());
    }

    public static vrf c() {
        try {
            return (vrf) Class.forName("androidx.health.platform.client.proto.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f40834b;
        }
    }

    public static boolean d(rrf rrfVar) {
        return rrfVar.c() == ProtoSyntax.PROTO2;
    }

    public static <T> w1<T> e(Class<T> cls, rrf rrfVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return d(rrfVar) ? q0.T(cls, rrfVar, clg.b(), j0.b(), x1.M(), kk8.b(), g4f.b()) : q0.T(cls, rrfVar, clg.b(), j0.b(), x1.M(), null, g4f.b());
        }
        return d(rrfVar) ? q0.T(cls, rrfVar, clg.a(), j0.a(), x1.H(), kk8.a(), g4f.a()) : q0.T(cls, rrfVar, clg.a(), j0.a(), x1.I(), null, g4f.a());
    }

    @Override // defpackage.sfl
    public <T> w1<T> a(Class<T> cls) {
        x1.J(cls);
        rrf rrfVarA = this.f40835a.a(cls);
        if (rrfVarA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? r0.k(x1.M(), kk8.b(), rrfVarA.b()) : r0.k(x1.H(), kk8.a(), rrfVarA.b());
        }
        return e(cls, rrfVarA);
    }

    public z3f(vrf vrfVar) {
        this.f40835a = (vrf) f0.b(vrfVar, "messageInfoFactory");
    }
}

package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.d0;
import com.google.protobuf.e1;
import com.google.protobuf.f1;
import com.google.protobuf.h0;
import com.google.protobuf.m;
import com.google.protobuf.t0;
import com.google.protobuf.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b4f implements ufl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xrf f3783b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrf f3784a;

    public static class a implements xrf {
        @Override // defpackage.xrf
        public trf a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.xrf
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements xrf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public xrf[] f3785a;

        public b(xrf... xrfVarArr) {
            this.f3785a = xrfVarArr;
        }

        @Override // defpackage.xrf
        public trf a(Class<?> cls) {
            for (xrf xrfVar : this.f3785a) {
                if (xrfVar.b(cls)) {
                    return xrfVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // defpackage.xrf
        public boolean b(Class<?> cls) {
            for (xrf xrfVar : this.f3785a) {
                if (xrfVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public b4f() {
        this(b());
    }

    public static xrf b() {
        return new b(wxa.c(), c());
    }

    public static xrf c() {
        try {
            m mVar = m.f9706a;
            return (xrf) m.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f3783b;
        }
    }

    public static boolean d(trf trfVar) {
        return trfVar.c() == ProtoSyntax.PROTO2;
    }

    public static <T> e1<T> e(Class<T> cls, trf trfVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return d(trfVar) ? t0.P(cls, trfVar, elg.b(), h0.b(), f1.O(), mk8.b(), i4f.b()) : t0.P(cls, trfVar, elg.b(), h0.b(), f1.O(), null, i4f.b());
        }
        return d(trfVar) ? t0.P(cls, trfVar, elg.a(), h0.a(), f1.I(), mk8.a(), i4f.a()) : t0.P(cls, trfVar, elg.a(), h0.a(), f1.J(), null, i4f.a());
    }

    @Override // defpackage.ufl
    public <T> e1<T> a(Class<T> cls) {
        f1.K(cls);
        trf trfVarA = this.f3784a.a(cls);
        if (trfVarA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? u0.k(f1.O(), mk8.b(), trfVarA.b()) : u0.k(f1.I(), mk8.a(), trfVarA.b());
        }
        return e(cls, trfVarA);
    }

    public b4f(xrf xrfVar) {
        this.f3784a = (xrf) d0.b(xrfVar, "messageInfoFactory");
    }
}

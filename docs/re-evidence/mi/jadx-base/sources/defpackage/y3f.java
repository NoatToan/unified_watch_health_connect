package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.ProtoSyntax;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.w;

/* JADX INFO: loaded from: classes.dex */
public final class y3f implements vfl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yrf f39751b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yrf f39752a;

    public static class a implements yrf {
        @Override // defpackage.yrf
        public urf a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.yrf
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements yrf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public yrf[] f39753a;

        public b(yrf... yrfVarArr) {
            this.f39753a = yrfVarArr;
        }

        @Override // defpackage.yrf
        public urf a(Class<?> cls) {
            for (yrf yrfVar : this.f39753a) {
                if (yrfVar.b(cls)) {
                    return yrfVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // defpackage.yrf
        public boolean b(Class<?> cls) {
            for (yrf yrfVar : this.f39753a) {
                if (yrfVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public y3f() {
        this(b());
    }

    public static yrf b() {
        return new b(xxa.c(), c());
    }

    public static yrf c() {
        try {
            return (yrf) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f39751b;
        }
    }

    public static boolean d(urf urfVar) {
        return urfVar.c() == ProtoSyntax.PROTO2;
    }

    public static <T> k0<T> e(Class<T> cls, urf urfVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return d(urfVar) ? d0.P(cls, urfVar, flg.b(), w.b(), l0.M(), nk8.b(), j4f.b()) : d0.P(cls, urfVar, flg.b(), w.b(), l0.M(), null, j4f.b());
        }
        return d(urfVar) ? d0.P(cls, urfVar, flg.a(), w.a(), l0.H(), nk8.a(), j4f.a()) : d0.P(cls, urfVar, flg.a(), w.a(), l0.I(), null, j4f.a());
    }

    @Override // defpackage.vfl
    public <T> k0<T> a(Class<T> cls) {
        l0.J(cls);
        urf urfVarA = this.f39752a.a(cls);
        if (urfVarA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? e0.k(l0.M(), nk8.b(), urfVarA.b()) : e0.k(l0.H(), nk8.a(), urfVarA.b());
        }
        return e(cls, urfVarA);
    }

    public y3f(yrf yrfVar) {
        this.f39752a = (yrf) s.b(yrfVar, "messageInfoFactory");
    }
}

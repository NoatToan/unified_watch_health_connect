package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a4f implements tfl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wrf f600b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrf f601a;

    public class a implements wrf {
        @Override // defpackage.wrf
        public srf a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.wrf
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements wrf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public wrf[] f602a;

        public b(wrf... wrfVarArr) {
            this.f602a = wrfVarArr;
        }

        @Override // defpackage.wrf
        public srf a(Class<?> cls) {
            for (wrf wrfVar : this.f602a) {
                if (wrfVar.b(cls)) {
                    return wrfVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // defpackage.wrf
        public boolean b(Class<?> cls) {
            for (wrf wrfVar : this.f602a) {
                if (wrfVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public a4f() {
        this(b());
    }

    public static wrf b() {
        return new b(vxa.c(), c());
    }

    public static wrf c() {
        try {
            return (wrf) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f600b;
        }
    }

    public static boolean d(srf srfVar) {
        return srfVar.c() == ProtoSyntax.PROTO2;
    }

    public static <T> k0<T> e(Class<T> cls, srf srfVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return d(srfVar) ? d0.O(cls, srfVar, dlg.b(), w.b(), l0.M(), lk8.b(), h4f.b()) : d0.O(cls, srfVar, dlg.b(), w.b(), l0.M(), null, h4f.b());
        }
        return d(srfVar) ? d0.O(cls, srfVar, dlg.a(), w.a(), l0.H(), lk8.a(), h4f.a()) : d0.O(cls, srfVar, dlg.a(), w.a(), l0.I(), null, h4f.a());
    }

    @Override // defpackage.tfl
    public <T> k0<T> a(Class<T> cls) {
        l0.J(cls);
        srf srfVarA = this.f601a.a(cls);
        if (srfVarA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? e0.k(l0.M(), lk8.b(), srfVarA.b()) : e0.k(l0.H(), lk8.a(), srfVarA.b());
        }
        return e(cls, srfVarA);
    }

    public a4f(wrf wrfVar) {
        this.f601a = (wrf) s.b(wrfVar, "messageInfoFactory");
    }
}

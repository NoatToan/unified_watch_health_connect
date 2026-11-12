package s23;

import lc.u0;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import t23.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends p005kotlin.reflect.jvm.internal.impl.builtins.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f156268h = {s0.f105811a.h(new i0(k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f156269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o43.j f156270g;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f156275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f156276b;

        public b(c0 c0Var, boolean z14) {
            c0Var.getClass();
            this.f156275a = c0Var;
            this.f156276b = z14;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156277a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f156277a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o43.n nVar, a aVar) {
        super(nVar);
        nVar.getClass();
        aVar.getClass();
        this.f156270g = nVar.g(new h(this, nVar));
        int i14 = c.f156277a[aVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                c(false);
            } else if (i14 == 3) {
                c(true);
            } else {
                u0.r();
                throw null;
            }
        }
    }

    public final u L() {
        return (u) gl1.d.B(this.f156270g, f156268h[0]);
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.builtins.d
    public final v23.a d() {
        return L();
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.builtins.d
    public final Iterable m() {
        Iterable<v23.b> iterableM = super.m();
        iterableM.getClass();
        o43.n nVar = this.f105836d;
        if (nVar == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(6);
            throw null;
        }
        w23.i0 i0VarL = l();
        i0VarL.getClass();
        return h0.B0(iterableM, new g(nVar, i0VarL, null, 4, null));
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.builtins.d
    public final v23.c q() {
        return L();
    }
}

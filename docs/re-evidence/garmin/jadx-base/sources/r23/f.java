package r23;

import androidx.room.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.c f149957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149958b;

    public static final class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f149959c = new a();

        private a() {
            super(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l, "Function", false, null, true);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f149960c = new b();

        private b() {
            super(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105857i, "KFunction", true, null, false);
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f149961c = new c();

        private c() {
            super(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105857i, "KSuspendFunction", true, null, false);
        }
    }

    public static final class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f149962c = new d();

        private d() {
            super(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105854f, "SuspendFunction", false, null, true);
        }
    }

    public f(x33.c cVar, String str, boolean z14, x33.b bVar, boolean z15) {
        cVar.getClass();
        str.getClass();
        this.f149957a = cVar;
        this.f149958b = str;
    }

    public final x33.f a(int i14) {
        return x33.f.e(this.f149958b + i14);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f149957a);
        sb3.append('.');
        return a0.m(sb3, this.f149958b, 'N');
    }
}

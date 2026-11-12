package p43;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f135867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t43.p f135870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f135871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f135872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f135873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayDeque<t43.i> f135874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z43.j f135875i;

    public interface a {

        /* JADX INFO: renamed from: p43.l1$a$a, reason: collision with other inner class name */
        public static final class C2571a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f135876a;

            @Override // p43.l1.a
            public final void a(g gVar) {
                if (this.f135876a) {
                    return;
                }
                this.f135876a = ((Boolean) gVar.invoke()).booleanValue();
            }
        }

        void a(g gVar);
    }

    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    public l1(boolean z14, boolean z15, boolean z16, boolean z17, t43.p pVar, o oVar, p pVar2) {
        pVar.getClass();
        oVar.getClass();
        pVar2.getClass();
        this.f135867a = z14;
        this.f135868b = z15;
        this.f135869c = z16;
        this.f135870d = pVar;
        this.f135871e = oVar;
        this.f135872f = pVar2;
    }

    public final void a() {
        ArrayDeque<t43.i> arrayDeque = this.f135874h;
        arrayDeque.getClass();
        arrayDeque.clear();
        z43.j jVar = this.f135875i;
        jVar.getClass();
        jVar.clear();
    }

    public boolean b(t43.h hVar, t43.h hVar2) {
        hVar.getClass();
        return true;
    }

    public final void c() {
        if (this.f135874h == null) {
            this.f135874h = new ArrayDeque<>(4);
        }
        if (this.f135875i == null) {
            z43.j.f202430c.getClass();
            this.f135875i = z43.j.b.a();
        }
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f135881a = new b();

            private b() {
                super(null);
            }

            @Override // p43.l1.c
            public final t43.i a(l1 l1Var, t43.h hVar) {
                l1Var.getClass();
                hVar.getClass();
                return l1Var.f135870d.A0(hVar);
            }
        }

        /* JADX INFO: renamed from: p43.l1$c$c, reason: collision with other inner class name */
        public static final class C2572c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2572c f135882a = new C2572c();

            private C2572c() {
                super(null);
            }

            @Override // p43.l1.c
            public final t43.i a(l1 l1Var, t43.h hVar) {
                l1Var.getClass();
                hVar.getClass();
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f135883a = new d();

            private d() {
                super(null);
            }

            @Override // p43.l1.c
            public final t43.i a(l1 l1Var, t43.h hVar) {
                l1Var.getClass();
                hVar.getClass();
                return l1Var.f135870d.k(hVar);
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public abstract t43.i a(l1 l1Var, t43.h hVar);

        private c() {
        }
    }
}

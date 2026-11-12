package a43;

import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1163a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f1164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f1165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f1166d;

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1168a = new a();

            private a() {
            }

            @Override // a43.n.b
            public final void a(StringBuilder sb3) {
                sb3.getClass();
                sb3.append("(");
            }

            @Override // a43.n.b
            public final void b(StringBuilder sb3) {
                sb3.getClass();
                sb3.append(")");
            }

            @Override // a43.n.b
            public final void c(j1 j1Var, StringBuilder sb3) {
                j1Var.getClass();
                sb3.getClass();
            }

            @Override // a43.n.b
            public final void d(j1 j1Var, int i14, int i15, StringBuilder sb3) {
                sb3.getClass();
                if (i14 != i15 - 1) {
                    sb3.append(", ");
                }
            }
        }

        void a(StringBuilder sb3);

        void b(StringBuilder sb3);

        void c(j1 j1Var, StringBuilder sb3);

        void d(j1 j1Var, int i14, int i15, StringBuilder sb3);
    }

    static {
        a.a(c.f1108a);
        a.a(e.f1138a);
        a.a(f.f1140a);
        a.a(g.f1144a);
        a.a(h.f1149a);
        a.a(i.f1154a);
        f1164b = a.a(j.f1158a);
        a.a(k.f1160a);
        f1165c = a.a(l.f1161a);
        f1166d = a.a(m.f1162a);
        a.a(d.f1135a);
    }

    public abstract String n(u23.c cVar, u23.e eVar);

    public abstract String o(x33.d dVar);

    public abstract String p(x33.f fVar, boolean z14);

    public static final class a {

        /* JADX INFO: renamed from: a43.n$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0012a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1167a;

            static {
                int[] iArr = new int[t23.f.values().length];
                try {
                    iArr[t23.f.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t23.f.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[t23.f.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[t23.f.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[t23.f.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[t23.f.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f1167a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static w a(e23.l lVar) {
            lVar.getClass();
            c0 c0Var = new c0();
            lVar.invoke(c0Var);
            c0Var.f1109a = true;
            return new w(c0Var);
        }

        private a() {
        }
    }
}

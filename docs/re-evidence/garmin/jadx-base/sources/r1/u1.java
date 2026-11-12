package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lr1/u1;", "", "<init>", "()V", "a", "Lr1/v1;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f149287a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f149288b = new v1(new o2(null, null, null, null, null, false, null, 127, null));

    public /* synthetic */ u1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract o2 a();

    public final v1 b(u1 u1Var) {
        y1 y1Var = u1Var.a().f149181a;
        if (y1Var == null) {
            y1Var = a().f149181a;
        }
        l2 l2Var = u1Var.a().f149182b;
        if (l2Var == null) {
            l2Var = a().f149182b;
        }
        h0 h0Var = u1Var.a().f149183c;
        if (h0Var == null) {
            h0Var = a().f149183c;
        }
        e2 e2Var = u1Var.a().f149184d;
        if (e2Var == null) {
            e2Var = a().f149184d;
        }
        r2 r2Var = u1Var.a().f149185e;
        if (r2Var == null) {
            r2Var = a().f149185e;
        }
        return new v1(new o2(y1Var, l2Var, h0Var, e2Var, r2Var, false, p13.u0.h(a().f149187g, u1Var.a().f149187g), 32, null));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u1) && p005kotlin.jvm.internal.s.g(((u1) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(f149288b)) {
            return "EnterTransition.None";
        }
        o2 o2VarA = a();
        StringBuilder sb3 = new StringBuilder("EnterTransition: \nFade - ");
        y1 y1Var = o2VarA.f149181a;
        sb3.append(y1Var != null ? y1Var.toString() : null);
        sb3.append(",\nSlide - ");
        l2 l2Var = o2VarA.f149182b;
        sb3.append(l2Var != null ? l2Var.toString() : null);
        sb3.append(",\nShrink - ");
        h0 h0Var = o2VarA.f149183c;
        sb3.append(h0Var != null ? h0Var.toString() : null);
        sb3.append(",\nScale - ");
        e2 e2Var = o2VarA.f149184d;
        sb3.append(e2Var != null ? e2Var.toString() : null);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr1/u1$a;", "", "<init>", "()V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private u1() {
    }
}

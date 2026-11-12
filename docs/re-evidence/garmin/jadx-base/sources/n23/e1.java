package n23;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ln23/e1;", "Ln23/a4;", "Ln23/p0;", "callable", "", FirebaseAnalytics.Param.INDEX, "Lk23/k$a;", "kind", "Lkotlin/Function0;", "Lt23/o0;", "computeDescriptor", "<init>", "(Ln23/p0;ILk23/k$a;Le23/a;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 implements a4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f122427e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0<?> f122428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k23.k.a f122430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4.a f122431d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/e1$a;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Type {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type[] f122432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f122433b;

        public a(Type[] typeArr) {
            typeArr.getClass();
            this.f122432a = typeArr;
            this.f122433b = Arrays.hashCode(typeArr);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f122432a, ((a) obj).f122432a);
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        public final String getTypeName() {
            return p13.u.P(this.f122432a, ", ", "[", "]", null, 56);
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF122433b() {
            return this.f122433b;
        }

        public final String toString() {
            return getTypeName();
        }
    }

    static {
        p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(e1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        f122427e = new k23.l[]{t0Var.h(i0Var), j.l(e1.class, "annotations", "getAnnotations()Ljava/util/List;", 0, t0Var)};
    }

    public e1(p0<?> p0Var, int i14, k23.k.a aVar, e23.a<? extends t23.o0> aVar2) {
        p0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f122428a = p0Var;
        this.f122429b = i14;
        this.f122430c = aVar;
        this.f122431d = new c4.a(null, aVar2);
        c4.a(null, new c1(this));
    }

    @Override // k23.k
    public final boolean a() {
        t23.o0 o0VarC = c();
        return (o0VarC instanceof t23.j1) && ((t23.j1) o0VarC).R() != null;
    }

    public final t23.o0 c() {
        k23.l<Object> lVar = f122427e[0];
        Object objInvoke = this.f122431d.invoke();
        objInvoke.getClass();
        return (t23.o0) objInvoke;
    }

    @Override // k23.k
    public final boolean d() {
        t23.o0 o0VarC = c();
        t23.j1 j1Var = o0VarC instanceof t23.j1 ? (t23.j1) o0VarC : null;
        if (j1Var != null) {
            return f43.e.a(j1Var);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.f122428a.equals(a4Var.getF122428a()) && this.f122429b == a4Var.getF122429b();
    }

    @Override // k23.k
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF122429b() {
        return this.f122429b;
    }

    @Override // k23.k
    /* JADX INFO: renamed from: getKind, reason: from getter */
    public final k23.k.a getF122430c() {
        return this.f122430c;
    }

    @Override // k23.k
    public final String getName() {
        t23.o0 o0VarC = c();
        t23.j1 j1Var = o0VarC instanceof t23.j1 ? (t23.j1) o0VarC : null;
        if (j1Var != null && !j1Var.d().M()) {
            x33.f name = j1Var.getName();
            name.getClass();
            if (!name.f188606b) {
                return name.b();
            }
        }
        return null;
    }

    @Override // k23.k
    public final b53.l getType() {
        p43.n0 type = c().getType();
        type.getClass();
        return new b53.l(type, new d1(this));
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122429b) + (this.f122428a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strC;
        l4.f122528a.getClass();
        StringBuilder sb3 = new StringBuilder();
        int i14 = l4.a.f122529a[this.f122430c.ordinal()];
        if (i14 == 1) {
            sb3.append("instance parameter");
        } else if (i14 == 2) {
            sb3.append("context parameter " + getName());
        } else if (i14 == 3) {
            sb3.append("extension receiver parameter");
        } else {
            if (i14 != 4) {
                lc.u0.r();
                return null;
            }
            sb3.append("parameter #" + this.f122429b + ' ' + getName());
        }
        sb3.append(" of ");
        v3 v3Var = this.f122428a;
        if (v3Var instanceof k23.l) {
            strC = l4.d((k23.l) v3Var);
        } else {
            if (!(v3Var instanceof k23.g)) {
                ds.e0.t(v3Var, "Illegal callable: ");
                return null;
            }
            strC = l4.c((k23.g) v3Var);
        }
        sb3.append(strC);
        return sb3.toString();
    }

    @Override // n23.a4
    /* JADX INFO: renamed from: y, reason: from getter */
    public final p0 getF122428a() {
        return this.f122428a;
    }
}

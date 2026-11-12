package s1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0007\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ls1/r0;", "T", "Ls1/a0;", "Ls1/r0$b;", "config", "<init>", "(Ls1/r0$b;)V", "b", "a", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f155723a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls1/r0$b;", "T", "Ls1/s0;", "Ls1/r0$a;", "<init>", "()V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> extends s0<T, a<T>> {
        public b() {
            super(null);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final a a(int i14, Float f14) {
            a aVar = new a(f14, null, 0, 6, null);
            this.f155736b.i(i14, aVar);
            return aVar;
        }
    }

    public r0(b<T> bVar) {
        this.f155723a = bVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // s1.f0, s1.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends r> q2<V> a(c2<T, V> c2Var) {
        int[] iArr;
        Object[] objArr;
        long[] jArr;
        b<T> bVar = this.f155723a;
        p1.h0 h0Var = new p1.h0(bVar.f155736b.f134776e + 2);
        p1.n nVar = bVar.f155736b;
        p1.i0 i0Var = new p1.i0(nVar.f134776e);
        int[] iArr2 = nVar.f134773b;
        Object[] objArr2 = nVar.f134774c;
        long[] jArr2 = nVar.f134772a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr2[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j8 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            int i19 = iArr2[i18];
                            a aVar = (a) objArr2[i18];
                            h0Var.d(i19);
                            i0Var.i(i19, new p2(c2Var.a().invoke(aVar.f155700a), aVar.f155701b, aVar.f155724c, null));
                        }
                        j8 >>= i15;
                        i17++;
                        iArr2 = iArr2;
                        i15 = i15;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    jArr = jArr2;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                    jArr = jArr2;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                iArr2 = iArr;
                objArr2 = objArr;
                jArr2 = jArr;
            }
        }
        if (!nVar.a(0)) {
            h0Var.c();
        }
        if (!nVar.a(bVar.f155735a)) {
            h0Var.d(bVar.f155735a);
        }
        int i24 = h0Var.f134763b;
        if (i24 != 0) {
            int[] iArr3 = h0Var.f134762a;
            iArr3.getClass();
            Arrays.sort(iArr3, 0, i24);
        }
        int i25 = bVar.f155735a;
        c0 c0Var = e0.f155563d;
        t.f155740b.getClass();
        return new q2<>(h0Var, i0Var, i25, 0, c0Var, 0, null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls1/r0$a;", "T", "Ls1/q0;", "value", "Ls1/b0;", "easing", "Ls1/t;", "arcMode", "<init>", "(Ljava/lang/Object;Ls1/b0;ILkotlin/jvm/internal/j;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> extends q0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f155724c;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Object obj, b0 b0Var, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            b0Var = (i15 & 2) != 0 ? e0.f155563d : b0Var;
            if ((i15 & 4) != 0) {
                t.f155740b.getClass();
                i14 = 0;
            }
            this(obj, b0Var, i14, null);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (p005kotlin.jvm.internal.s.g(aVar.f155700a, this.f155700a) && p005kotlin.jvm.internal.s.g(aVar.f155701b, this.f155701b)) {
                int i14 = aVar.f155724c;
                t.a aVar2 = t.f155740b;
                if (i14 == this.f155724c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            T t7 = this.f155700a;
            int iHashCode = t7 != null ? t7.hashCode() : 0;
            t.a aVar = t.f155740b;
            return this.f155701b.hashCode() + r1.q2.d(this.f155724c, iHashCode * 31, 31);
        }

        public /* synthetic */ a(Object obj, b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this(obj, b0Var, i14);
        }

        private a(T t7, b0 b0Var, int i14) {
            super(t7, b0Var, null);
            this.f155724c = i14;
        }
    }
}

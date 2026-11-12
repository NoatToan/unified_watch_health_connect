package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<C> f2150a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2151b = 0;
    public long[] c;
    public int d;
    public final a<C, T, A> e;

    public static abstract class a<C, T, A> {
        public abstract void a(C c, T t, int i, A a2);
    }

    public c(a<C, T, A> aVar) {
        this.e = aVar;
    }

    public synchronized void a(C c) {
        try {
            if (c == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f2150a.lastIndexOf(c);
            if (iLastIndexOf < 0 || c(iLastIndexOf)) {
                this.f2150a.add(c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized c<C, T, A> clone() {
        c<C, T, A> cVar;
        CloneNotSupportedException e;
        try {
            cVar = (c) super.clone();
            try {
                cVar.f2151b = 0L;
                cVar.c = null;
                cVar.d = 0;
                cVar.f2150a = new ArrayList();
                int size = this.f2150a.size();
                for (int i = 0; i < size; i++) {
                    if (!c(i)) {
                        cVar.f2150a.add(this.f2150a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (CloneNotSupportedException e3) {
            cVar = null;
            e = e3;
        }
        return cVar;
    }

    public final boolean c(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f2151b) != 0;
        }
        long[] jArr = this.c;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    public synchronized void d(T t, int i, A a2) {
        try {
            this.d++;
            g(t, i, a2);
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                long[] jArr = this.c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j = this.c[length];
                        if (j != 0) {
                            j((length + 1) * 64, j);
                            this.c[length] = 0;
                        }
                    }
                }
                long j2 = this.f2151b;
                if (j2 != 0) {
                    j(0, j2);
                    this.f2151b = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
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
    public final void e(T t, int i, A a2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.e.a(this.f2150a.get(i2), t, i, a2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    public final void f(T t, int i, A a2) {
        e(t, i, a2, 0, Math.min(64, this.f2150a.size()), this.f2151b);
    }

    public final void g(T t, int i, A a2) {
        int size = this.f2150a.size();
        long[] jArr = this.c;
        int length = jArr == null ? -1 : jArr.length - 1;
        h(t, i, a2, length);
        e(t, i, a2, (length + 2) * 64, size, 0L);
    }

    public final void h(T t, int i, A a2, int i2) {
        if (i2 < 0) {
            f(t, i, a2);
            return;
        }
        long j = this.c[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(this.f2150a.size(), i3 + 64);
        h(t, i, a2, i2 - 1);
        e(t, i, a2, i3, iMin, j);
    }

    public synchronized void i(C c) {
        try {
            if (this.d == 0) {
                this.f2150a.remove(c);
            } else {
                int iLastIndexOf = this.f2150a.lastIndexOf(c);
                if (iLastIndexOf >= 0) {
                    k(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = i + 63; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f2150a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    public final void k(int i) {
        if (i < 64) {
            this.f2151b = (1 << i) | this.f2151b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.c;
        if (jArr == null) {
            this.c = new long[this.f2150a.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.f2150a.size() / 64];
            long[] jArr3 = this.c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.c = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.c;
        jArr4[i2] = j | jArr4[i2];
    }
}

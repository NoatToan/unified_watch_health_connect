package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lp1/a1;", "E", "", "", "initialCapacity", "<init>", "(I)V", "Lp1/q0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f134667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134668b;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<E, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a1<E> f134669a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1<E> a1Var) {
            super(1);
            this.f134669a = a1Var;
        }

        @Override // e23.l
        public final CharSequence invoke(Object obj) {
            return obj == this.f134669a ? "(this)" : String.valueOf(obj);
        }
    }

    private a1(int i14) {
        this.f134667a = i14 == 0 ? b1.f134677a : new Object[i14];
    }

    public final E a() {
        if (!d()) {
            return (E) this.f134667a[0];
        }
        n23.j.s("ObjectList is empty.");
        return null;
    }

    public final E b(int i14) {
        if (i14 >= 0 && i14 < this.f134668b) {
            return (E) this.f134667a[i14];
        }
        f(i14);
        throw null;
    }

    public final int c(E e4) {
        Object[] objArr = this.f134667a;
        int i14 = 0;
        if (e4 == null) {
            int i15 = this.f134668b;
            while (i14 < i15) {
                if (objArr[i14] == null) {
                    return i14;
                }
                i14++;
            }
            return -1;
        }
        int i16 = this.f134668b;
        while (i14 < i16) {
            if (e4.equals(objArr[i14])) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public final boolean d() {
        return this.f134668b == 0;
    }

    public final boolean e() {
        return this.f134668b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            int i14 = a1Var.f134668b;
            int i15 = this.f134668b;
            if (i14 == i15) {
                Object[] objArr = this.f134667a;
                Object[] objArr2 = a1Var.f134667a;
                j23.l lVarO = j23.t.o(0, i15);
                int i16 = lVarO.f96796a;
                int i17 = lVarO.f96797b;
                if (i16 > i17) {
                    return true;
                }
                while (p005kotlin.jvm.internal.s.g(objArr[i16], objArr2[i16])) {
                    if (i16 == i17) {
                        return true;
                    }
                    i16++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i14) {
        StringBuilder sbI = b71.i.i(i14, "Index ", " must be in 0..");
        sbI.append(this.f134668b - 1);
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.f134667a;
        int i14 = this.f134668b;
        int iHashCode = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj = objArr[i15];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        a aVar = new a(this);
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        Object[] objArr = this.f134667a;
        int i14 = this.f134668b;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj = objArr[i15];
            if (i15 == -1) {
                sb3.append((CharSequence) "...");
                return sb3.toString();
            }
            if (i15 != 0) {
                sb3.append((CharSequence) ", ");
            }
            sb3.append(aVar.invoke(obj));
        }
        sb3.append((CharSequence) "]");
        return sb3.toString();
    }

    public /* synthetic */ a1(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }
}

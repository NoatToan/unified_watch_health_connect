package defpackage;

import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class ord implements fai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f29421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f29422b;
    public Object[] c;
    public nrd.a d;
    public gj1 e = null;
    public Stack<gj1> f = null;

    public static class a implements nrd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f29423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public obm f29424b;
        public t4n c;
        public int d;

        public a(int i, String str, obm obmVar, t4n t4nVar) {
            this.f29423a = str;
            this.f29424b = obmVar;
            this.c = t4nVar;
            this.d = i;
        }

        @Override // nrd.a
        public obm a() {
            return this.f29424b;
        }

        public String b() {
            return this.f29423a;
        }

        public String c(glo gloVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(gloVar.d(b()));
            stringBuffer.append("(");
            stringBuffer.append(((pbm) a()).l(gloVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // nrd.a
        public final String toString() {
            return c(glo.f19117k);
        }
    }

    public ord(nrd.a aVar, Object obj, Object obj2, Object[] objArr) {
        this.d = aVar;
        this.f29421a = obj;
        this.f29422b = obj2;
        this.c = objArr;
    }

    @Override // defpackage.nrd
    public obm a() {
        return this.d.a();
    }

    @Override // defpackage.fai
    public Object b() throws Throwable {
        Stack<gj1> stack = this.f;
        if (stack != null) {
            return stack.peek().d(this.f.peek().b());
        }
        gj1 gj1Var = this.e;
        if (gj1Var == null) {
            return null;
        }
        return gj1Var.d(gj1Var.b());
    }

    @Override // defpackage.nrd
    public Object[] c() {
        if (this.c == null) {
            this.c = new Object[0];
        }
        Object[] objArr = this.c;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // defpackage.fai
    public Object d(Object[] objArr) throws Throwable {
        int i;
        Stack<gj1> stack = this.f;
        gj1 gj1VarPeek = stack == null ? this.e : stack.peek();
        if (gj1VarPeek == null) {
            return null;
        }
        int iA = gj1VarPeek.a();
        int i2 = 0;
        boolean z = (65536 & iA) != 0;
        int i3 = (iA & 4096) != 0 ? 1 : 0;
        int i4 = (iA & 256) != 0 ? 1 : 0;
        boolean z2 = (iA & 16) != 0;
        boolean z3 = (iA & 1) != 0;
        Object[] objArrB = gj1VarPeek.b();
        int i5 = ((!z2 || z) ? 0 : 1) + i3;
        if (i3 == 0 || i4 == 0) {
            i = 0;
        } else {
            objArrB[0] = objArr[0];
            i = 1;
        }
        if (z2 && z3) {
            if (z) {
                i = i4 + 1;
                objArrB[0] = objArr[i4];
            } else {
                char c = (i3 == 0 || i4 == 0) ? (char) 0 : (char) 1;
                int i6 = (i3 == 0 || i4 == 0) ? 0 : 1;
                if (z2 && z3 && !z) {
                    i2 = 1;
                }
                objArrB[i3] = objArr[c];
                i = i6 + i2;
            }
        }
        for (int i7 = i; i7 < objArr.length; i7++) {
            objArrB[(i7 - i) + i5] = objArr[i7];
        }
        return gj1VarPeek.d(objArrB);
    }

    @Override // defpackage.fai
    public void e(gj1 gj1Var) {
        this.e = gj1Var;
    }

    @Override // defpackage.nrd
    public Object getTarget() {
        return this.f29422b;
    }

    public final String toString() {
        return this.d.toString();
    }
}

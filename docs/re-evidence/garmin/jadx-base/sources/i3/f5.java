package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li3/f5;", "Lx5/r0;", "Ll3/k0;", "dateInputFormat", "<init>", "(Ll3/k0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f5 implements x5.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3.k0 f88073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f88076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f88077f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i3/f5$a", "Lx5/c0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements x5.c0 {
        public a() {
        }

        @Override // x5.c0
        public final int a(int i14) {
            f5 f5Var = f5.this;
            if (i14 <= f5Var.f88074c - 1) {
                return i14;
            }
            if (i14 <= f5Var.f88075d - 1) {
                return i14 - 1;
            }
            int i15 = f5Var.f88076e;
            return i14 <= i15 + 1 ? i14 - 2 : i15;
        }

        @Override // x5.c0
        public final int b(int i14) {
            f5 f5Var = f5.this;
            if (i14 < f5Var.f88074c) {
                return i14;
            }
            if (i14 < f5Var.f88075d) {
                return i14 + 1;
            }
            int i15 = f5Var.f88076e;
            return i14 <= i15 ? i14 + 2 : i15 + 2;
        }
    }

    public f5(l3.k0 k0Var) {
        this.f88073b = k0Var;
        String str = k0Var.f109296a;
        char c14 = k0Var.f109297b;
        this.f88074c = d53.w.G(c14, 0, 6, str);
        this.f88075d = d53.w.K(c14, 0, 6, k0Var.f109296a);
        this.f88076e = k0Var.f109298c.length();
        this.f88077f = new a();
    }

    @Override // x5.r0
    public final x5.q0 a(s5.c cVar) {
        int length = cVar.f157138b.length();
        String strB0 = cVar.f157138b;
        int i14 = 0;
        int i15 = this.f88076e;
        if (length > i15) {
            strB0 = d53.w.b0(strB0, j23.t.o(0, i15));
        }
        String string = "";
        int i16 = 0;
        while (i14 < strB0.length()) {
            int i17 = i16 + 1;
            string = string + strB0.charAt(i14);
            if (i17 == this.f88074c || i16 + 2 == this.f88075d) {
                StringBuilder sbK = e5.k(string);
                sbK.append(this.f88073b.f109297b);
                string = sbK.toString();
            }
            i14++;
            i16 = i17;
        }
        return new x5.q0(new s5.c(string, null, 2, null), this.f88077f);
    }
}

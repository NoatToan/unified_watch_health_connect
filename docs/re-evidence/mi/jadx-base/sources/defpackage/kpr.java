package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class kpr extends f83 {
    @Override // defpackage.f83, defpackage.s98
    public void a(y98 y98Var) {
        StringBuilder sb = new StringBuilder();
        while (y98Var.i()) {
            char c = y98Var.c();
            y98Var.f++;
            c(c, sb);
            if (sb.length() % 3 == 0) {
                f83.g(y98Var, sb);
                if (p7c.n(y98Var.d(), y98Var.f, e()) != e()) {
                    y98Var.o(0);
                    break;
                }
            }
        }
        f(y98Var, sb);
    }

    @Override // defpackage.f83
    public int c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c < 'A' || c > 'Z') {
            p7c.e(c);
        } else {
            sb.append((char) (c - '3'));
        }
        return 1;
    }

    @Override // defpackage.f83
    public int e() {
        return 3;
    }

    @Override // defpackage.f83
    public void f(y98 y98Var, StringBuilder sb) {
        y98Var.p();
        int iA = y98Var.g().a() - y98Var.a();
        y98Var.f -= sb.length();
        if (y98Var.f() > 1 || iA > 1 || y98Var.f() != iA) {
            y98Var.r((char) 254);
        }
        if (y98Var.e() < 0) {
            y98Var.o(0);
        }
    }
}

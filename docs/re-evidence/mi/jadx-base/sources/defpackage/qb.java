package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qb implements s98 {
    public static char b(char c, char c2) {
        if (p7c.f(c) && p7c.f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // defpackage.s98
    public void a(y98 y98Var) {
        if (p7c.a(y98Var.d(), y98Var.f) >= 2) {
            y98Var.r(b(y98Var.d().charAt(y98Var.f), y98Var.d().charAt(y98Var.f + 1)));
            y98Var.f += 2;
            return;
        }
        char c = y98Var.c();
        int iN = p7c.n(y98Var.d(), y98Var.f, c());
        if (iN == c()) {
            if (!p7c.g(c)) {
                y98Var.r((char) (c + 1));
                y98Var.f++;
                return;
            } else {
                y98Var.r((char) 235);
                y98Var.r((char) (c - 127));
                y98Var.f++;
                return;
            }
        }
        if (iN == 1) {
            y98Var.r((char) 230);
            y98Var.o(1);
            return;
        }
        if (iN == 2) {
            y98Var.r((char) 239);
            y98Var.o(2);
            return;
        }
        if (iN == 3) {
            y98Var.r((char) 238);
            y98Var.o(3);
        } else if (iN == 4) {
            y98Var.r((char) 240);
            y98Var.o(4);
        } else {
            if (iN != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iN)));
            }
            y98Var.r((char) 231);
            y98Var.o(5);
        }
    }

    public int c() {
        return 0;
    }
}

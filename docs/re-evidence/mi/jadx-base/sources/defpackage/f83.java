package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class f83 implements s98 {
    public static String d(CharSequence charSequence, int i) {
        int iCharAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    public static void g(y98 y98Var, StringBuilder sb) {
        y98Var.s(d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // defpackage.s98
    public void a(y98 y98Var) {
        StringBuilder sb = new StringBuilder();
        while (y98Var.i()) {
            char c = y98Var.c();
            y98Var.f++;
            int iC = c(c, sb);
            int iA = y98Var.a() + ((sb.length() / 3) << 1);
            y98Var.q(iA);
            int iA2 = y98Var.g().a() - iA;
            if (!y98Var.i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iA2 < 2 || iA2 > 2)) {
                    iC = b(y98Var, sb, sb2, iC);
                }
                while (sb.length() % 3 == 1 && ((iC <= 3 && iA2 != 1) || iC > 3)) {
                    iC = b(y98Var, sb, sb2, iC);
                }
                break;
            }
            if (sb.length() % 3 == 0 && p7c.n(y98Var.d(), y98Var.f, e()) != e()) {
                y98Var.o(0);
                break;
            }
        }
        f(y98Var, sb);
    }

    public final int b(y98 y98Var, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        y98Var.f--;
        int iC = c(y98Var.c(), sb2);
        y98Var.k();
        return iC;
    }

    public int c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public int e() {
        return 1;
    }

    public void f(y98 y98Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iA = y98Var.a() + length;
        y98Var.q(iA);
        int iA2 = y98Var.g().a() - iA;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                g(y98Var, sb);
            }
            if (y98Var.i()) {
                y98Var.r((char) 254);
            }
        } else if (iA2 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                g(y98Var, sb);
            }
            if (y98Var.i()) {
                y98Var.r((char) 254);
            }
            y98Var.f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                g(y98Var, sb);
            }
            if (iA2 > 0 || y98Var.i()) {
                y98Var.r((char) 254);
            }
        }
        y98Var.o(0);
    }
}

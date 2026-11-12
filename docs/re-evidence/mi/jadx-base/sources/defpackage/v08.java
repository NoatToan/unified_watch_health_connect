package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class v08 implements s98 {
    public static void b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            p7c.e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0001, B:9:0x000f, B:11:0x0025, B:22:0x0049, B:28:0x005a, B:30:0x0072, B:33:0x008a, B:32:0x0081, B:36:0x0091, B:37:0x0098), top: B:40:0x0001 }] */
    public static void e(y98 y98Var, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                y98Var.o(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                y98Var.p();
                int iA = y98Var.g().a() - y98Var.a();
                int iF = y98Var.f();
                if (iF > iA) {
                    y98Var.q(y98Var.a() + 1);
                    iA = y98Var.g().a() - y98Var.a();
                }
                if (iF <= iA && iA <= 2) {
                    y98Var.o(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strC = c(charSequence, 0);
            if (!(!y98Var.i()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                y98Var.q(y98Var.a() + i);
                if (y98Var.g().a() - y98Var.a() >= 3) {
                    y98Var.q(y98Var.a() + strC.length());
                } else if (z) {
                    y98Var.k();
                    y98Var.f -= i;
                }
                y98Var.s(strC);
            } else if (z) {
                y98Var.k();
                y98Var.f -= i;
            } else {
                y98Var.s(strC);
            }
            y98Var.o(0);
        } catch (Throwable th) {
            y98Var.o(0);
            throw th;
        }
    }

    @Override // defpackage.s98
    public void a(y98 y98Var) {
        StringBuilder sb = new StringBuilder();
        while (y98Var.i()) {
            b(y98Var.c(), sb);
            y98Var.f++;
            if (sb.length() >= 4) {
                y98Var.s(c(sb, 0));
                sb.delete(0, 4);
                if (p7c.n(y98Var.d(), y98Var.f, d()) != d()) {
                    y98Var.o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(y98Var, sb);
    }

    public int d() {
        return 4;
    }
}

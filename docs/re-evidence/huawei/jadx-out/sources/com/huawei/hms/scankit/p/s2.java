package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes10.dex */
final class s2 implements v2 {
    public int a() {
        return 4;
    }

    private static void a(char c2, StringBuilder sb) {
        if (c2 >= ' ' && c2 <= '?') {
            sb.append(c2);
        } else if (c2 >= '@' && c2 <= '^') {
            sb.append((char) (c2 - '@'));
        } else {
            d4.a(c2);
        }
    }

    private static String a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
            char c2 = (char) ((iCharAt >> 16) & 255);
            char c3 = (char) ((iCharAt >> 8) & 255);
            char c4 = (char) (iCharAt & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x007d A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x0001, B:9:0x000f, B:11:0x0025, B:20:0x0046, B:26:0x0056, B:28:0x006e, B:31:0x0086, B:30:0x007d, B:34:0x008d, B:35:0x0094), top: B:39:0x0001 }] */
    private static void a(y2 y2Var, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                y2Var.b(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                y2Var.l();
                int iA = y2Var.g().a() - y2Var.a();
                int iF = y2Var.f();
                if (iF > iA) {
                    y2Var.c(y2Var.a() + 1);
                    iA = y2Var.g().a() - y2Var.a();
                }
                if (iF <= iA && iA <= 2) {
                    y2Var.b(0);
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String strA = a(charSequence, 0);
                if (y2Var.i() || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    y2Var.c(y2Var.a() + i);
                    if (y2Var.g().a() - y2Var.a() >= 3) {
                        y2Var.c(y2Var.a() + strA.length());
                    } else if (z) {
                        y2Var.k();
                        y2Var.d -= i;
                    }
                    y2Var.a(strA);
                } else if (z) {
                    y2Var.k();
                    y2Var.d -= i;
                } else {
                    y2Var.a(strA);
                }
                y2Var.b(0);
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } catch (Throwable th) {
            y2Var.b(0);
            throw th;
        }
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(y2 y2Var) {
        StringBuilder sb = new StringBuilder();
        while (y2Var.i()) {
            a(y2Var.c(), sb);
            y2Var.d++;
            if (sb.length() >= 4) {
                y2Var.a(a(sb, 0));
                sb.delete(0, 4);
                if (d4.a(y2Var.d(), y2Var.d, a()) != a()) {
                    y2Var.b(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        a(y2Var, sb);
    }

    s2() {
    }
}

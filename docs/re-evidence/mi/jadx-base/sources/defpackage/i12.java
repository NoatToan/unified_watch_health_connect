package defpackage;

import androidx.work.WorkInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class i12 implements s98 {
    public static char c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + WorkInfo.STOP_REASON_NOT_STOPPED);
    }

    @Override // defpackage.s98
    public void a(y98 y98Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (y98Var.i()) {
            sb.append(y98Var.c());
            y98Var.f++;
            if (p7c.n(y98Var.d(), y98Var.f, b()) != b()) {
                y98Var.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iA = y98Var.a() + length + 1;
        y98Var.q(iA);
        boolean z = y98Var.g().a() - iA > 0;
        if (y98Var.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            y98Var.r(c(sb.charAt(i), y98Var.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}

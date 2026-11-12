package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class u1 extends q2 {
    public u1(zo2 zo2Var) {
        super(zo2Var);
    }

    @Override // defpackage.p00
    public String d() throws NotFoundException, FormatException {
        if (c().k() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 8);
        int iF = b().f(48, 2);
        sb.append("(393");
        sb.append(iF);
        sb.append(')');
        int iF2 = b().f(50, 10);
        if (iF2 / 100 == 0) {
            sb.append('0');
        }
        if (iF2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(iF2);
        sb.append(b().c(60, null).b());
        return sb.toString();
    }
}

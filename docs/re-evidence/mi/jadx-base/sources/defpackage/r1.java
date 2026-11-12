package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class r1 extends q2 {
    public r1(zo2 zo2Var) {
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
        sb.append("(392");
        sb.append(iF);
        sb.append(')');
        sb.append(b().c(50, null).b());
        return sb.toString();
    }
}

package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class p2 extends q2 {
    public p2(zo2 zo2Var) {
        super(zo2Var);
    }

    @Override // defpackage.p00
    public String d() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(b().f(4, 4));
        g(sb, 8, length);
        return b().a(sb, 48);
    }
}

package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l2 extends e3 {
    public l2(zo2 zo2Var) {
        super(zo2Var);
    }

    @Override // defpackage.p00
    public String d() throws NotFoundException {
        if (c().k() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 5);
        j(sb, 45, 15);
        return sb.toString();
    }
}

package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class k2 extends e3 {
    public final String c;
    public final String d;

    public k2(zo2 zo2Var, String str, String str2) {
        super(zo2Var);
        this.c = str2;
        this.d = str;
    }

    @Override // defpackage.p00
    public String d() throws NotFoundException {
        if (c().k() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 8);
        j(sb, 48, 20);
        k(sb, 68);
        return sb.toString();
    }

    @Override // defpackage.e3
    public void h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // defpackage.e3
    public int i(int i) {
        return i % 100000;
    }

    public final void k(StringBuilder sb, int i) {
        int iF = b().f(i, 16);
        if (iF == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.c);
        sb.append(')');
        int i2 = iF % 32;
        int i3 = iF / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i2);
    }
}

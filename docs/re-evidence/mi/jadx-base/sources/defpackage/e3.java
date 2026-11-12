package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e3 extends q2 {
    public e3(zo2 zo2Var) {
        super(zo2Var);
    }

    public abstract void h(StringBuilder sb, int i);

    public abstract int i(int i);

    public final void j(StringBuilder sb, int i, int i2) {
        int iF = b().f(i, i2);
        h(sb, iF);
        int i3 = i(iF);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}

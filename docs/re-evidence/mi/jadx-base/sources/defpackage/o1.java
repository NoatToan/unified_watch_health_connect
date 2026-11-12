package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class o1 extends l2 {
    public o1(zo2 zo2Var) {
        super(zo2Var);
    }

    @Override // defpackage.e3
    public void h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // defpackage.e3
    public int i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}

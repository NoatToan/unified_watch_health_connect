package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class w1n extends rtr {
    public w1n(a52 a52Var) {
        super(a52Var);
    }

    public w1n o(w1n w1nVar, float f) {
        int i;
        float f2 = 12.0f;
        if (f < 12.0f) {
            i = 6;
        } else {
            f2 = 10.0f;
            if (f < 10.0f) {
                i = 5;
            } else {
                int iRound = Math.round(f);
                f2 = iRound + (iRound / 6);
                i = 7;
            }
        }
        if (f2 != this.mAxisMaximum) {
            w1nVar.setAxisMaximum(f2);
            w1nVar.setLabelCount(i);
        }
        return w1nVar;
    }
}

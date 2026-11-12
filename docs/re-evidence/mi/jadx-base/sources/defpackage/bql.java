package defpackage;

import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;

/* JADX INFO: loaded from: classes7.dex */
public class bql extends vq5 {
    public int l;

    public bql(int i, int i2, String str, dq5 dq5Var, dq5 dq5Var2) {
        super(i, i2, str, dq5Var, dq5Var2);
        q(DateType.DURATION);
        t(GrainType.SECOND);
    }

    public void A(int i) {
        this.l = i;
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Second>";
    }

    public int z() {
        return this.l;
    }
}

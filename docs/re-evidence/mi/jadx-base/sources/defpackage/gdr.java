package defpackage;

import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;

/* JADX INFO: loaded from: classes7.dex */
public class gdr extends vq5 {
    public gdr(int i, int i2, String str, dq5 dq5Var, dq5 dq5Var2) {
        super(i, i2, str, dq5Var, dq5Var2);
        q(DateType.DURATION);
        t(GrainType.WEEK);
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Week>";
    }
}

package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;

/* JADX INFO: loaded from: classes7.dex */
public class a5g extends vq5 {
    public boolean l;
    public int m;

    public a5g(int i, int i2, String str, dq5 dq5Var, dq5 dq5Var2) {
        super(i, i2, str, dq5Var, dq5Var2);
        q(DateType.DURATION);
        t(GrainType.MINUTE);
    }

    public boolean A() {
        return this.l;
    }

    public void B(int i) {
        this.m = i;
    }

    public void C(boolean z) {
        this.l = z;
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Minute>";
    }

    @Override // defpackage.vq5
    public void v(JsonObject jsonObject) {
        jsonObject.addProperty("is_override_hour", Boolean.valueOf(this.l));
    }

    public int z() {
        return this.m;
    }
}

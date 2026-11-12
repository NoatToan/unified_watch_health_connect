package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;

/* JADX INFO: loaded from: classes7.dex */
public class cr5 extends vq5 {
    public int l;
    public DayType m;

    public cr5(int i, int i2, String str, dq5 dq5Var, dq5 dq5Var2) {
        super(i, i2, str, dq5Var, dq5Var2);
        t(GrainType.DAY);
        q(DateType.DURATION);
        C(DayType.MORNING);
    }

    public DayType A() {
        return this.m;
    }

    public void B(int i) {
        this.l = i;
    }

    public void C(DayType dayType) {
        this.m = dayType;
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Day>";
    }

    @Override // defpackage.vq5
    public void v(JsonObject jsonObject) {
        jsonObject.addProperty("date_num", Integer.valueOf(this.l));
    }

    public int z() {
        return this.l;
    }
}

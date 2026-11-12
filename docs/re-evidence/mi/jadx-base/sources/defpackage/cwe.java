package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class cwe extends yb8 {
    public dq5 d;
    public DayType e;
    public boolean f;
    public GrainType g;

    public cwe(int i, int i2, String str, dq5 dq5Var, DayType dayType, boolean z) {
        super(i, i2, str);
        this.d = dq5Var;
        this.e = dayType;
        this.f = z;
        if (dayType == null) {
            this.g = GrainType.DATE;
        } else if (z) {
            this.g = GrainType.DATETIME;
        } else {
            this.g = GrainType.PARTOFDAY;
        }
    }

    @Override // defpackage.yb8
    public String c() {
        return "<LunarDate>";
    }

    @Override // defpackage.yb8
    public List<q69> h() {
        mq5 mq5VarC;
        HashMap map = new HashMap();
        DayType dayType = this.e;
        if (dayType == null) {
            dq5 dq5Var = this.d;
            mq5VarC = dq5.c(dq5Var, dq5Var, DateType.LUNARDATE);
            mq5VarC.k(GrainType.DATE);
            mq5VarC.n(TimeSubType.CONCRETE);
        } else if (this.f) {
            dq5 dq5VarJ = this.d.G(dq5.s(dayType, this.d.g())).J(this.d.l());
            this.d = dq5VarJ;
            mq5VarC = dq5.c(dq5VarJ, dq5VarJ, DateType.DATETIME);
            mq5VarC.k(GrainType.DATETIME);
            mq5VarC.n(TimeSubType.CONCRETE);
        } else {
            ljh<dq5, dq5> ljhVarN = dq5.n(this.d, dayType);
            mq5VarC = dq5.c(ljhVarN.a(), ljhVarN.b(), DateType.DURATION);
            mq5VarC.k(GrainType.PARTOFDAY);
        }
        map.put(mq5VarC.f(), mq5VarC);
        return Collections.singletonList(new q69(d(), b(), e(), null, map));
    }

    @Override // defpackage.yb8
    public JsonObject i() {
        JsonObject jsonObjectA = a();
        jsonObjectA.addProperty("grain_type", this.g.toString());
        GrainType grainType = this.g;
        if (grainType == GrainType.DATE) {
            jsonObjectA.addProperty("value", this.d.C(DateType.LUNARDATE.getFormat()));
        } else if (grainType == GrainType.PARTOFDAY) {
            ljh<dq5, dq5> ljhVarN = dq5.n(this.d, this.e);
            dq5 dq5VarA = ljhVarN.a();
            dq5 dq5VarB = ljhVarN.b();
            DateType dateType = DateType.DATETIME;
            jsonObjectA.addProperty(StatConstants.PARAM_START, dq5VarA.C(dateType.getFormat()));
            jsonObjectA.addProperty(StatConstants.PARAM_END, dq5VarB.C(dateType.getFormat()));
        } else if (grainType == GrainType.DATETIME) {
            jsonObjectA.addProperty("value", this.d.C(DateType.DATETIME.getFormat()));
        }
        jsonObjectA.addProperty("date_type", DateType.LUNARDATE.toString());
        return jsonObjectA;
    }
}

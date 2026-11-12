package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class xk9 extends yb8 {
    public static Gson g = new Gson();
    public Map<String, dq5> d;
    public DayType e;
    public int f;

    public xk9(int i, int i2, String str, Map<String, dq5> map, DayType dayType, int i3) {
        super(i, i2, str);
        this.d = map;
        this.e = dayType;
        this.f = i3;
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Festival>";
    }

    @Override // defpackage.yb8
    public List<q69> h() {
        mq5 mq5VarC;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, dq5> entry : this.d.entrySet()) {
            String key = entry.getKey();
            dq5 value = entry.getValue();
            HashMap map = new HashMap();
            DayType dayType = this.e;
            if (dayType == null) {
                mq5VarC = dq5.c(value, value, DateType.DATE);
                mq5VarC.k(GrainType.DATE);
                mq5VarC.n(TimeSubType.CONCRETE);
            } else {
                int i = this.f;
                if (i == -1) {
                    ljh<dq5, dq5> ljhVarN = dq5.n(value, dayType);
                    mq5VarC = dq5.c(ljhVarN.a(), ljhVarN.b(), DateType.DURATION);
                    mq5VarC.k(GrainType.PARTOFDAY);
                } else {
                    dq5 dq5VarG = value.G(dq5.s(dayType, i));
                    mq5VarC = dq5.c(dq5VarG, dq5VarG, DateType.DATETIME);
                    mq5VarC.k(GrainType.DATETIME);
                    mq5VarC.n(TimeSubType.CONCRETE);
                }
            }
            mq5VarC.j(true);
            map.put(mq5VarC.f(), mq5VarC);
            arrayList.add(new q69(d(), b(), e(), key, null, map));
        }
        return arrayList;
    }

    @Override // defpackage.yb8
    public JsonObject i() {
        JsonObject jsonObjectA = a();
        jsonObjectA.addProperty("festivals", g.toJson(this.d));
        jsonObjectA.addProperty("fes_flag", Boolean.TRUE);
        return jsonObjectA;
    }
}

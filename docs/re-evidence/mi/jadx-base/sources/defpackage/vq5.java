package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vq5 extends yb8 {
    public dq5 d;
    public dq5 e;
    public GrainType f;
    public DateType g;
    public TimeSubType h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f37124k;

    public vq5(int i, int i2, String str, dq5 dq5Var, dq5 dq5Var2) {
        super(i, i2, str);
        this.d = dq5Var;
        this.e = dq5Var2;
        this.i = false;
        this.j = false;
        this.f37124k = -1L;
    }

    @Override // defpackage.yb8
    public List<q69> h() {
        HashMap map = new HashMap();
        map.put(j().getType(), dq5.c(n(), l(), j()));
        return Collections.singletonList(new q69(d(), b(), e(), null, map));
    }

    @Override // defpackage.yb8
    public JsonObject i() {
        JsonObject jsonObjectA = a();
        TimeZone timeZoneP = this.d.p();
        jsonObjectA.addProperty("start_dt", this.d.D(this.g.getFormat(), timeZoneP));
        jsonObjectA.addProperty("end_dt", this.e.D(this.g.getFormat(), timeZoneP));
        jsonObjectA.addProperty("is_relative", Boolean.valueOf(this.i));
        jsonObjectA.addProperty("date_type", this.g.toString());
        jsonObjectA.addProperty("grain_type", this.f.toString());
        TimeSubType timeSubType = this.h;
        if (timeSubType != null) {
            jsonObjectA.addProperty("sub_type", timeSubType.toString());
        }
        v(jsonObjectA);
        return jsonObjectA;
    }

    public DateType j() {
        return this.g;
    }

    public long k() {
        return this.f37124k;
    }

    public dq5 l() {
        return this.e;
    }

    public GrainType m() {
        return this.f;
    }

    public dq5 n() {
        return this.d;
    }

    public TimeSubType o() {
        return this.h;
    }

    public boolean p() {
        return this.i;
    }

    public void q(DateType dateType) {
        this.g = dateType;
    }

    public void r(long j) {
        this.f37124k = j;
    }

    public void s(dq5 dq5Var) {
        this.e = dq5Var;
    }

    public void t(GrainType grainType) {
        this.f = grainType;
    }

    public void u(boolean z) {
        this.j = z;
    }

    public void v(JsonObject jsonObject) {
    }

    public void w(boolean z) {
        this.i = z;
    }

    public void x(dq5 dq5Var) {
        this.d = dq5Var;
    }

    public void y(TimeSubType timeSubType) {
        this.h = timeSubType;
    }
}

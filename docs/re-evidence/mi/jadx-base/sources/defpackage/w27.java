package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class w27 extends u2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f37474a;

    public w27(double d) {
        this.f37474a = d;
    }

    public static w27 W(double d) {
        return new w27(d);
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return (int) this.f37474a;
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return (long) this.f37474a;
    }

    @Override // defpackage.zsd
    public Number R() {
        return Double.valueOf(this.f37474a);
    }

    @Override // defpackage.u2h
    public boolean V() {
        return Double.isNaN(this.f37474a) || Double.isInfinite(this.f37474a);
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.DOUBLE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof w27)) {
            return Double.compare(this.f37474a, ((w27) obj).f37474a) == 0;
        }
        return false;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f37474a);
        return ((int) (jDoubleToLongBits >> 32)) ^ ((int) jDoubleToLongBits);
    }

    @Override // defpackage.zsd
    public String l() {
        return o2h.s(this.f37474a);
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return q().toBigInteger();
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f37474a);
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.t0(this.f37474a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f37474a;
    }
}

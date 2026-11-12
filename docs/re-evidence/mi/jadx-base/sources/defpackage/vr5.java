package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class vr5 extends u2h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vr5 f37151b = new vr5(BigDecimal.ZERO);
    public static final BigDecimal c = BigDecimal.valueOf(-2147483648L);
    public static final BigDecimal d = BigDecimal.valueOf(2147483647L);
    public static final BigDecimal e = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final BigDecimal f = BigDecimal.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f37152a;

    public vr5(BigDecimal bigDecimal) {
        this.f37152a = bigDecimal;
    }

    public static vr5 W(BigDecimal bigDecimal) {
        return new vr5(bigDecimal);
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return this.f37152a.intValue();
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return this.f37152a.longValue();
    }

    @Override // defpackage.zsd
    public Number R() {
        return this.f37152a;
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof vr5) && ((vr5) obj).f37152a.compareTo(this.f37152a) == 0;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public int hashCode() {
        return Double.valueOf(t()).hashCode();
    }

    @Override // defpackage.zsd
    public String l() {
        return this.f37152a.toString();
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return this.f37152a.toBigInteger();
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return this.f37152a;
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.y0(this.f37152a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f37152a.doubleValue();
    }
}

package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class vi2 extends u2h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f36914b = BigInteger.valueOf(-2147483648L);
    public static final BigInteger c = BigInteger.valueOf(2147483647L);
    public static final BigInteger d = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger e = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f36915a;

    public vi2(BigInteger bigInteger) {
        this.f36915a = bigInteger;
    }

    public static vi2 W(BigInteger bigInteger) {
        return new vi2(bigInteger);
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return this.f36915a.intValue();
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return this.f36915a.longValue();
    }

    @Override // defpackage.zsd
    public Number R() {
        return this.f36915a;
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof vi2)) {
            return ((vi2) obj).f36915a.equals(this.f36915a);
        }
        return false;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public int hashCode() {
        return this.f36915a.hashCode();
    }

    @Override // defpackage.zsd
    public String l() {
        return this.f36915a.toString();
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return this.f36915a;
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return new BigDecimal(this.f36915a);
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.z0(this.f36915a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f36915a.doubleValue();
    }
}

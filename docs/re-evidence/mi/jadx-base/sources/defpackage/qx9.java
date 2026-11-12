package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class qx9 extends u2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31933a;

    public qx9(float f) {
        this.f31933a = f;
    }

    public static qx9 W(float f) {
        return new qx9(f);
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return (int) this.f31933a;
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return (long) this.f31933a;
    }

    @Override // defpackage.zsd
    public Number R() {
        return Float.valueOf(this.f31933a);
    }

    @Override // defpackage.u2h
    public boolean V() {
        return Float.isNaN(this.f31933a) || Float.isInfinite(this.f31933a);
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.FLOAT;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof qx9)) {
            return Float.compare(this.f31933a, ((qx9) obj).f31933a) == 0;
        }
        return false;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f31933a);
    }

    @Override // defpackage.zsd
    public String l() {
        return o2h.t(this.f31933a);
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return q().toBigInteger();
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f31933a);
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.u0(this.f31933a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f31933a;
    }
}

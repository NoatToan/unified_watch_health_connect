package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class hcd extends u2h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hcd[] f19930b = new hcd[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19931a;

    static {
        for (int i = 0; i < 12; i++) {
            f19930b[i] = new hcd(i - 1);
        }
    }

    public hcd(int i) {
        this.f19931a = i;
    }

    public static hcd W(int i) {
        return (i > 10 || i < -1) ? new hcd(i) : f19930b[i - (-1)];
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return this.f19931a;
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return this.f19931a;
    }

    @Override // defpackage.zsd
    public Number R() {
        return Integer.valueOf(this.f19931a);
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.INT;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof hcd) && ((hcd) obj).f19931a == this.f19931a;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public int hashCode() {
        return this.f19931a;
    }

    @Override // defpackage.zsd
    public String l() {
        return o2h.u(this.f19931a);
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return BigInteger.valueOf(this.f19931a);
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f19931a);
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.v0(this.f19931a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f19931a;
    }
}

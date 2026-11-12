package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class zre extends u2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41601a;

    public zre(long j) {
        this.f41601a = j;
    }

    public static zre W(long j) {
        return new zre(j);
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return (int) this.f41601a;
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return this.f41601a;
    }

    @Override // defpackage.zsd
    public Number R() {
        return Long.valueOf(this.f41601a);
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.LONG;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof zre) && ((zre) obj).f41601a == this.f41601a;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public int hashCode() {
        long j = this.f41601a;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    @Override // defpackage.zsd
    public String l() {
        return o2h.v(this.f41601a);
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return BigInteger.valueOf(this.f41601a);
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f41601a);
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.w0(this.f41601a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f41601a;
    }
}

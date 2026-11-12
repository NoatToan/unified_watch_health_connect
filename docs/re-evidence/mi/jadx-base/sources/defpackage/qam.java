package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class qam extends u2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f31294a;

    public qam(short s) {
        this.f31294a = s;
    }

    public static qam W(short s) {
        return new qam(s);
    }

    @Override // defpackage.u2h, defpackage.zsd
    public int B() {
        return this.f31294a;
    }

    @Override // defpackage.u2h, defpackage.zsd
    public long P() {
        return this.f31294a;
    }

    @Override // defpackage.zsd
    public Number R() {
        return Short.valueOf(this.f31294a);
    }

    @Override // defpackage.m82, com.fasterxml.jackson.core.b
    public JsonParser.NumberType e() {
        return JsonParser.NumberType.INT;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof qam) && ((qam) obj).f31294a == this.f31294a;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public int hashCode() {
        return this.f31294a;
    }

    @Override // defpackage.zsd
    public String l() {
        return o2h.u(this.f31294a);
    }

    @Override // defpackage.zsd
    public BigInteger m() {
        return BigInteger.valueOf(this.f31294a);
    }

    @Override // defpackage.zsd
    public BigDecimal q() {
        return BigDecimal.valueOf(this.f31294a);
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.A0(this.f31294a);
    }

    @Override // defpackage.zsd
    public double t() {
        return this.f31294a;
    }
}

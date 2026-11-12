package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class cn9 extends ntd {
    public dip d;
    public boolean e;
    public boolean f;

    @Deprecated
    public boolean g;
    public JsonToken h;
    public JsonToken i;
    public eip j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public eip f5572k;
    public dip l;
    public int m;

    public cn9(JsonParser jsonParser, dip dipVar, boolean z, boolean z2) {
        super(jsonParser);
        this.d = dipVar;
        this.l = dipVar;
        this.j = eip.o(dipVar);
        this.f = z;
        this.e = z2;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public boolean B0() {
        return this.h == JsonToken.START_ARRAY;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public boolean C0() {
        return this.h == JsonToken.START_OBJECT;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        return this.c.E();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0190  */
    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken G0() throws IOException {
        dip dipVarL;
        JsonToken jsonTokenS0;
        boolean zS;
        dip dipVarQ;
        dip dipVarL2;
        JsonToken jsonTokenS1;
        dip dipVarF;
        JsonToken jsonTokenS2;
        dip dipVarL3;
        JsonToken jsonToken;
        if (!this.e && (jsonToken = this.h) != null && this.f5572k == null && jsonToken.isScalarValue() && !this.j.s() && !this.f && this.l == dip.f15573a) {
            this.h = null;
            return null;
        }
        eip eipVarP = this.f5572k;
        if (eipVarP != null) {
            while (true) {
                JsonToken jsonTokenT = eipVarP.t();
                if (jsonTokenT != null) {
                    this.h = jsonTokenT;
                    return jsonTokenT;
                }
                eip eipVar = this.j;
                if (eipVarP == eipVar) {
                    this.f5572k = null;
                    if (!eipVarP.f()) {
                        break;
                    }
                    JsonToken jsonTokenK = this.c.K();
                    this.h = jsonTokenK;
                    return jsonTokenK;
                }
                eipVarP = eipVar.p(eipVarP);
                this.f5572k = eipVarP;
                if (eipVarP == null) {
                    throw a("Unexpected problem: chain of filtered context broken");
                }
            }
        }
        JsonToken jsonTokenG0 = this.c.G0();
        if (jsonTokenG0 == null) {
            this.h = jsonTokenG0;
            return jsonTokenG0;
        }
        int iId = jsonTokenG0.id();
        if (iId == 1) {
            dip dipVar = this.l;
            dip dipVar2 = dip.f15573a;
            if (dipVar == dipVar2) {
                this.j = this.j.n(dipVar, true);
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
            if (dipVar == null || (dipVarL = this.j.l(dipVar)) == null) {
                this.c.O0();
            } else {
                if (dipVarL != dipVar2) {
                    dipVarL = dipVarL.d();
                }
                this.l = dipVarL;
                if (dipVarL == dipVar2) {
                    this.j = this.j.n(dipVarL, true);
                    this.h = jsonTokenG0;
                    return jsonTokenG0;
                }
                eip eipVarN = this.j.n(dipVarL, false);
                this.j = eipVarN;
                if (this.f && (jsonTokenS0 = S0(eipVarN)) != null) {
                    this.h = jsonTokenS0;
                    return jsonTokenS0;
                }
            }
        } else if (iId == 2) {
            zS = this.j.s();
            dipVarQ = this.j.q();
            if (dipVarQ != null && dipVarQ != dip.f15573a) {
                dipVarQ.b();
            }
            eip eipVarE = this.j.e();
            this.j = eipVarE;
            this.l = eipVarE.q();
            if (zS) {
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
        } else if (iId == 3) {
            dip dipVar3 = this.l;
            dip dipVar4 = dip.f15573a;
            if (dipVar3 == dipVar4) {
                this.j = this.j.m(dipVar3, true);
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
            if (dipVar3 == null || (dipVarL2 = this.j.l(dipVar3)) == null) {
                this.c.O0();
            } else {
                if (dipVarL2 != dipVar4) {
                    dipVarL2 = dipVarL2.c();
                }
                this.l = dipVarL2;
                if (dipVarL2 == dipVar4) {
                    this.j = this.j.m(dipVarL2, true);
                    this.h = jsonTokenG0;
                    return jsonTokenG0;
                }
                eip eipVarM = this.j.m(dipVarL2, false);
                this.j = eipVarM;
                if (this.f && (jsonTokenS1 = S0(eipVarM)) != null) {
                    this.h = jsonTokenS1;
                    return jsonTokenS1;
                }
            }
        } else if (iId == 4) {
            zS = this.j.s();
            dipVarQ = this.j.q();
            if (dipVarQ != null) {
                dipVarQ.b();
            }
            eip eipVarE2 = this.j.e();
            this.j = eipVarE2;
            this.l = eipVarE2.q();
            if (zS) {
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
        } else if (iId != 5) {
            dip dipVar5 = this.l;
            dip dipVar6 = dip.f15573a;
            if (dipVar5 == dipVar6) {
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
            if (dipVar5 != null && (((dipVarL3 = this.j.l(dipVar5)) == dipVar6 || (dipVarL3 != null && dipVarL3.h(this.c))) && T0())) {
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
        } else {
            String strJ = this.c.J();
            dip dipVarV = this.j.v(strJ);
            dip dipVar7 = dip.f15573a;
            if (dipVarV == dipVar7) {
                this.l = dipVarV;
                if (!this.f && this.g && !this.j.s()) {
                    jsonTokenG0 = this.j.t();
                    this.f5572k = this.j;
                }
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
            if (dipVarV == null || (dipVarF = dipVarV.f(strJ)) == null) {
                this.c.G0();
                this.c.O0();
            } else {
                this.l = dipVarF;
                if (dipVarF == dipVar7) {
                    if (!T0()) {
                        this.c.G0();
                        this.c.O0();
                    } else if (this.f) {
                        this.h = jsonTokenG0;
                        return jsonTokenG0;
                    }
                }
                if (this.f && (jsonTokenS2 = S0(this.j)) != null) {
                    this.h = jsonTokenS2;
                    return jsonTokenS2;
                }
            }
        }
        return R0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public JsonToken H0() throws IOException {
        JsonToken jsonTokenG0 = G0();
        return jsonTokenG0 == JsonToken.FIELD_NAME ? G0() : jsonTokenG0;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public String J() throws IOException {
        fud fudVarP0 = P0();
        JsonToken jsonToken = this.h;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return fudVarP0.b();
        }
        fud fudVarE = fudVarP0.e();
        if (fudVarE == null) {
            return null;
        }
        return fudVarE.b();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public JsonToken K() {
        return this.h;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.c.K0(base64Variant, outputStream);
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public final int M() {
        JsonToken jsonToken = this.h;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public BigDecimal N() throws IOException {
        return this.c.N();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public double O() throws IOException {
        return this.c.O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser O0() throws IOException {
        JsonToken jsonToken = this.h;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken jsonTokenG0 = G0();
            if (jsonTokenG0 == null) {
                return this;
            }
            if (jsonTokenG0.isStructStart()) {
                i++;
            } else if (jsonTokenG0.isStructEnd() && (i = i - 1) == 0) {
                return this;
            }
        }
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public Object P() throws IOException {
        return this.c.P();
    }

    public fud P0() {
        eip eipVar = this.f5572k;
        return eipVar != null ? eipVar : this.j;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public float Q() throws IOException {
        return this.c.Q();
    }

    public final JsonToken Q0(eip eipVar) throws IOException {
        this.f5572k = eipVar;
        JsonToken jsonTokenT = eipVar.t();
        if (jsonTokenT != null) {
            return jsonTokenT;
        }
        while (eipVar != this.j) {
            eipVar = this.f5572k.p(eipVar);
            this.f5572k = eipVar;
            if (eipVar == null) {
                throw a("Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenT2 = eipVar.t();
            if (jsonTokenT2 != null) {
                return jsonTokenT2;
            }
        }
        throw a("Internal error: failed to locate expected buffered tokens");
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public int R() throws IOException {
        return this.c.R();
    }

    public final JsonToken R0() throws IOException {
        dip dipVarL;
        JsonToken jsonTokenS0;
        JsonToken jsonTokenS1;
        JsonToken jsonTokenS2;
        while (true) {
            JsonToken jsonTokenG0 = this.c.G0();
            if (jsonTokenG0 == null) {
                this.h = jsonTokenG0;
                return jsonTokenG0;
            }
            int iId = jsonTokenG0.id();
            if (iId != 1) {
                if (iId != 2) {
                    if (iId == 3) {
                        dip dipVar = this.l;
                        dip dipVar2 = dip.f15573a;
                        if (dipVar == dipVar2) {
                            this.j = this.j.m(dipVar, true);
                            this.h = jsonTokenG0;
                            return jsonTokenG0;
                        }
                        if (dipVar == null) {
                            this.c.O0();
                        } else {
                            dip dipVarL2 = this.j.l(dipVar);
                            if (dipVarL2 == null) {
                                this.c.O0();
                            } else {
                                if (dipVarL2 != dipVar2) {
                                    dipVarL2 = dipVarL2.c();
                                }
                                this.l = dipVarL2;
                                if (dipVarL2 == dipVar2) {
                                    this.j = this.j.m(dipVarL2, true);
                                    this.h = jsonTokenG0;
                                    return jsonTokenG0;
                                }
                                eip eipVarM = this.j.m(dipVarL2, false);
                                this.j = eipVarM;
                                if (this.f && (jsonTokenS1 = S0(eipVarM)) != null) {
                                    this.h = jsonTokenS1;
                                    return jsonTokenS1;
                                }
                            }
                        }
                    } else if (iId != 4) {
                        if (iId != 5) {
                            dip dipVar3 = this.l;
                            dip dipVar4 = dip.f15573a;
                            if (dipVar3 == dipVar4) {
                                this.h = jsonTokenG0;
                                return jsonTokenG0;
                            }
                            if (dipVar3 != null && ((dipVarL = this.j.l(dipVar3)) == dipVar4 || (dipVarL != null && dipVarL.h(this.c)))) {
                                if (T0()) {
                                    this.h = jsonTokenG0;
                                    return jsonTokenG0;
                                }
                            }
                        } else {
                            String strJ = this.c.J();
                            dip dipVarV = this.j.v(strJ);
                            dip dipVar5 = dip.f15573a;
                            if (dipVarV == dipVar5) {
                                this.l = dipVarV;
                                this.h = jsonTokenG0;
                                return jsonTokenG0;
                            }
                            if (dipVarV == null) {
                                this.c.G0();
                                this.c.O0();
                            } else {
                                dip dipVarF = dipVarV.f(strJ);
                                if (dipVarF == null) {
                                    this.c.G0();
                                    this.c.O0();
                                } else {
                                    this.l = dipVarF;
                                    if (dipVarF == dipVar5) {
                                        if (T0() && this.f) {
                                            this.h = jsonTokenG0;
                                            return jsonTokenG0;
                                        }
                                    } else if (this.f && (jsonTokenS0 = S0(this.j)) != null) {
                                        this.h = jsonTokenS0;
                                        return jsonTokenS0;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean zS = this.j.s();
                dip dipVarQ = this.j.q();
                if (dipVarQ != null && dipVarQ != dip.f15573a) {
                    dipVarQ.b();
                }
                eip eipVarE = this.j.e();
                this.j = eipVarE;
                this.l = eipVarE.q();
                if (zS) {
                    this.h = jsonTokenG0;
                    return jsonTokenG0;
                }
            } else {
                dip dipVar6 = this.l;
                dip dipVar7 = dip.f15573a;
                if (dipVar6 == dipVar7) {
                    this.j = this.j.n(dipVar6, true);
                    this.h = jsonTokenG0;
                    return jsonTokenG0;
                }
                if (dipVar6 == null) {
                    this.c.O0();
                } else {
                    dip dipVarL3 = this.j.l(dipVar6);
                    if (dipVarL3 == null) {
                        this.c.O0();
                    } else {
                        if (dipVarL3 != dipVar7) {
                            dipVarL3 = dipVarL3.d();
                        }
                        this.l = dipVarL3;
                        if (dipVarL3 == dipVar7) {
                            this.j = this.j.n(dipVarL3, true);
                            this.h = jsonTokenG0;
                            return jsonTokenG0;
                        }
                        eip eipVarN = this.j.n(dipVarL3, false);
                        this.j = eipVarN;
                        if (this.f && (jsonTokenS2 = S0(eipVarN)) != null) {
                            this.h = jsonTokenS2;
                            return jsonTokenS2;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public long S() throws IOException {
        return this.c.S();
    }

    public final JsonToken S0(eip eipVar) throws IOException {
        dip dipVarL;
        while (true) {
            JsonToken jsonTokenG0 = this.c.G0();
            if (jsonTokenG0 == null) {
                return jsonTokenG0;
            }
            int iId = jsonTokenG0.id();
            boolean z = false;
            if (iId != 1) {
                if (iId != 2) {
                    if (iId == 3) {
                        dip dipVarL2 = this.j.l(this.l);
                        if (dipVarL2 == null) {
                            this.c.O0();
                        } else {
                            dip dipVar = dip.f15573a;
                            if (dipVarL2 != dipVar) {
                                dipVarL2 = dipVarL2.c();
                            }
                            this.l = dipVarL2;
                            if (dipVarL2 == dipVar) {
                                this.j = this.j.m(dipVarL2, true);
                                return Q0(eipVar);
                            }
                            this.j = this.j.m(dipVarL2, false);
                        }
                    } else if (iId != 4) {
                        if (iId != 5) {
                            dip dipVar2 = this.l;
                            dip dipVar3 = dip.f15573a;
                            if (dipVar2 == dipVar3) {
                                return Q0(eipVar);
                            }
                            if (dipVar2 != null && ((dipVarL = this.j.l(dipVar2)) == dipVar3 || (dipVarL != null && dipVarL.h(this.c)))) {
                                if (T0()) {
                                    return Q0(eipVar);
                                }
                            }
                        } else {
                            String strJ = this.c.J();
                            dip dipVarV = this.j.v(strJ);
                            dip dipVar4 = dip.f15573a;
                            if (dipVarV == dipVar4) {
                                this.l = dipVarV;
                                return Q0(eipVar);
                            }
                            if (dipVarV == null) {
                                this.c.G0();
                                this.c.O0();
                            } else {
                                dip dipVarF = dipVarV.f(strJ);
                                if (dipVarF == null) {
                                    this.c.G0();
                                    this.c.O0();
                                } else {
                                    this.l = dipVarF;
                                    if (dipVarF != dipVar4) {
                                        continue;
                                    } else {
                                        if (T0()) {
                                            return Q0(eipVar);
                                        }
                                        this.l = this.j.v(strJ);
                                    }
                                }
                            }
                        }
                    }
                }
                dip dipVarQ = this.j.q();
                if (dipVarQ != null && dipVarQ != dip.f15573a) {
                    dipVarQ.b();
                }
                eip eipVar2 = this.j;
                if (eipVar2 == eipVar && eipVar2.s()) {
                    z = true;
                }
                eip eipVarE = this.j.e();
                this.j = eipVarE;
                this.l = eipVarE.q();
                if (z) {
                    return jsonTokenG0;
                }
            } else {
                dip dipVar5 = this.l;
                dip dipVar6 = dip.f15573a;
                if (dipVar5 == dipVar6) {
                    this.j = this.j.n(dipVar5, true);
                    return jsonTokenG0;
                }
                if (dipVar5 == null) {
                    this.c.O0();
                } else {
                    dip dipVarL3 = this.j.l(dipVar5);
                    if (dipVarL3 == null) {
                        this.c.O0();
                    } else {
                        if (dipVarL3 != dipVar6) {
                            dipVarL3 = dipVarL3.d();
                        }
                        this.l = dipVarL3;
                        if (dipVarL3 == dipVar6) {
                            this.j = this.j.n(dipVarL3, true);
                            return Q0(eipVar);
                        }
                        this.j = this.j.n(dipVarL3, false);
                    }
                }
            }
        }
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType T() throws IOException {
        return this.c.T();
    }

    public final boolean T0() throws IOException {
        int i = this.m;
        if (i != 0 && !this.e) {
            return false;
        }
        this.m = i + 1;
        return true;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public Number U() throws IOException {
        return this.c.U();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public fud b0() {
        return P0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public short c0() throws IOException {
        return this.c.c0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public String d0() throws IOException {
        return this.c.d0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public char[] f0() throws IOException {
        return this.c.f0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public int g0() throws IOException {
        return this.c.g0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public int i0() throws IOException {
        return this.c.i0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public void l() {
        JsonToken jsonToken = this.h;
        if (jsonToken != null) {
            this.i = jsonToken;
            this.h = null;
        }
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public JsonToken m() {
        return this.h;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        return this.c.m0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public BigInteger o() throws IOException {
        return this.c.o();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public int o0() throws IOException {
        return this.c.o0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public int r0(int i) throws IOException {
        return this.c.r0(i);
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        return this.c.s(base64Variant);
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public long s0() throws IOException {
        return this.c.s0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public long t0(long j) throws IOException {
        return this.c.t0(j);
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public String u0() throws IOException {
        return this.c.u0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public String v0(String str) throws IOException {
        return this.c.v0(str);
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public boolean w0() {
        return this.h != null;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public boolean x0() {
        return this.c.x0();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public byte y() throws IOException {
        return this.c.y();
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public final boolean y0(JsonToken jsonToken) {
        return this.h == jsonToken;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser
    public boolean z0(int i) {
        JsonToken jsonToken = this.h;
        if (jsonToken == null) {
            return i == 0;
        }
        return jsonToken.id() == i;
    }
}

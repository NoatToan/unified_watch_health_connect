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
public class ntd extends JsonParser {
    public JsonParser c;

    public ntd(JsonParser jsonParser) {
        this.c = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean B0() {
        return this.c.B0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean C0() {
        return this.c.C0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public v3h D() {
        return this.c.D();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean D0() throws IOException {
        return this.c.D0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        return this.c.E();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken H0() throws IOException {
        return this.c.H0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser I0(int i, int i2) {
        this.c.I0(i, i2);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String J() throws IOException {
        return this.c.J();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser J0(int i, int i2) {
        this.c.J0(i, i2);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken K() {
        return this.c.K();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.c.K0(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean L0() {
        return this.c.L0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int M() {
        return this.c.M();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void M0(Object obj) {
        this.c.M0(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal N() throws IOException {
        return this.c.N();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser N0(int i) {
        this.c.N0(i);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double O() throws IOException {
        return this.c.O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object P() throws IOException {
        return this.c.P();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float Q() throws IOException {
        return this.c.Q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int R() throws IOException {
        return this.c.R();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long S() throws IOException {
        return this.c.S();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType T() throws IOException {
        return this.c.T();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number U() throws IOException {
        return this.c.U();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object Z() throws IOException {
        return this.c.Z();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public fud b0() {
        return this.c.b0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean c() {
        return this.c.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public short c0() throws IOException {
        return this.c.c0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean d() {
        return this.c.d();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String d0() throws IOException {
        return this.c.d0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] f0() throws IOException {
        return this.c.f0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int g0() throws IOException {
        return this.c.g0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int i0() throws IOException {
        return this.c.i0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void l() {
        this.c.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken m() {
        return this.c.m();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        return this.c.m0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser n(JsonParser.Feature feature) {
        this.c.n(feature);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object n0() throws IOException {
        return this.c.n0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger o() throws IOException {
        return this.c.o();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int o0() throws IOException {
        return this.c.o0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int r0(int i) throws IOException {
        return this.c.r0(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        return this.c.s(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long s0() throws IOException {
        return this.c.s0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long t0(long j) throws IOException {
        return this.c.t0(j);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String u0() throws IOException {
        return this.c.u0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String v0(String str) throws IOException {
        return this.c.v0(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean w0() {
        return this.c.w0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean x0() {
        return this.c.x0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte y() throws IOException {
        return this.c.y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean y0(JsonToken jsonToken) {
        return this.c.y0(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean z0(int i) {
        return this.c.z0(i);
    }
}

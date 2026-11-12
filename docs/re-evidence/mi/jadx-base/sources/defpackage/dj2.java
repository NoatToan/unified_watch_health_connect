package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class dj2 extends rnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dj2 f15582b = new dj2(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15583a;

    public dj2(byte[] bArr) {
        this.f15583a = bArr;
    }

    public static dj2 V(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? f15582b : new dj2(bArr);
    }

    public static dj2 W(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        return i2 == 0 ? f15582b : new dj2(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof dj2)) {
            return Arrays.equals(((dj2) obj).f15583a, this.f15583a);
        }
        return false;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public int hashCode() {
        byte[] bArr = this.f15583a;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    @Override // defpackage.zsd
    public String l() {
        return a.a().encode(this.f15583a, false);
    }

    @Override // defpackage.zsd
    public byte[] o() {
        return this.f15583a;
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        Base64Variant base64Variant = wwlVar.getConfig().getBase64Variant();
        byte[] bArr = this.f15583a;
        jsonGenerator.b0(base64Variant, bArr, 0, bArr.length);
    }

    @Override // defpackage.rnq, defpackage.zsd
    public String toString() {
        return a.a().encode(this.f15583a, true);
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.BINARY;
    }

    public dj2(byte[] bArr, int i, int i2) {
        if (i == 0 && i2 == bArr.length) {
            this.f15583a = bArr;
            return;
        }
        byte[] bArr2 = new byte[i2];
        this.f15583a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}

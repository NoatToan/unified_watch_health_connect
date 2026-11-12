package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class aee extends ValueNode {
    static final aee e = new aee(new byte[0]);
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f320a;

    public aee(byte[] bArr) {
        this.f320a = bArr;
    }

    public aee(byte[] bArr, int i, int i2) {
        if (i == 0 && i2 == bArr.length) {
            this.f320a = bArr;
            return;
        }
        byte[] bArr2 = new byte[i2];
        this.f320a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static aee a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return e;
        }
        return new aee(bArr);
    }

    public static aee b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (i2 == 0) {
            return e;
        }
        return new aee(bArr, i, i2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.BINARY;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() {
        return this.f320a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return wm.d().e(this.f320a, false);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Base64Variant base64Variant = serializerProvider.getConfig().getBase64Variant();
        byte[] bArr = this.f320a;
        jsonGenerator.writeBinary(base64Variant, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aee)) {
            return Arrays.equals(((aee) obj).f320a, this.f320a);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        byte[] bArr = this.f320a;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }
}

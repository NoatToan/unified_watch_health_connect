package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.NumericNode;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public class aem extends NumericNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final aem[] f333b = new aem[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f334a;

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToInt() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToLong() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isInt() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isIntegralNumber() {
        return true;
    }

    static {
        for (int i = 0; i < 12; i++) {
            f333b[i] = new aem(i - 1);
        }
    }

    public aem(int i) {
        this.f334a = i;
    }

    public static aem a(int i) {
        if (i > 10 || i < -1) {
            return new aem(i);
        }
        return f333b[i + 1];
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public Number numberValue() {
        return Integer.valueOf(this.f334a);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public short shortValue() {
        return (short) this.f334a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public int intValue() {
        return this.f334a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public long longValue() {
        return this.f334a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public float floatValue() {
        return this.f334a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public double doubleValue() {
        return this.f334a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f334a);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this.f334a);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return xc.a(this.f334a);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        return this.f334a != 0;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this.f334a);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof aem) && ((aem) obj).f334a == this.f334a;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.f334a;
    }
}

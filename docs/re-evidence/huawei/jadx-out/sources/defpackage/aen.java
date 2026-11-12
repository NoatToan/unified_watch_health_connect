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
public class aen extends NumericNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final float f335a;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isFloat() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isFloatingPointNumber() {
        return true;
    }

    public aen(float f) {
        this.f335a = f;
    }

    public static aen e(float f) {
        return new aen(f);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToInt() {
        float f = this.f335a;
        return f >= -2.1474836E9f && f <= 2.1474836E9f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToLong() {
        float f = this.f335a;
        return f >= -9.223372E18f && f <= 9.223372E18f;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToExactIntegral() {
        if (Float.isNaN(this.f335a) || Float.isInfinite(this.f335a)) {
            return false;
        }
        float f = this.f335a;
        return f == ((float) Math.round(f));
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public Number numberValue() {
        return Float.valueOf(this.f335a);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public short shortValue() {
        return (short) this.f335a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public int intValue() {
        return (int) this.f335a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public long longValue() {
        return (long) this.f335a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public float floatValue() {
        return this.f335a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public double doubleValue() {
        return this.f335a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f335a);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return xc.d(this.f335a);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean isNaN() {
        return Float.isNaN(this.f335a) || Float.isInfinite(this.f335a);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this.f335a);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aen)) {
            if (Float.compare(this.f335a, ((aen) obj).f335a) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Float.floatToIntBits(this.f335a);
    }
}

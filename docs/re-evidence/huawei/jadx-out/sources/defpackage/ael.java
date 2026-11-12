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
public class ael extends NumericNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final double f332b;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isDouble() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isFloatingPointNumber() {
        return true;
    }

    public ael(double d) {
        this.f332b = d;
    }

    public static ael d(double d) {
        return new ael(d);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToInt() {
        double d = this.f332b;
        return d >= -2.147483648E9d && d <= 2.147483647E9d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToLong() {
        double d = this.f332b;
        return d >= -9.223372036854776E18d && d <= 9.223372036854776E18d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToExactIntegral() {
        if (Double.isNaN(this.f332b) || Double.isInfinite(this.f332b)) {
            return false;
        }
        double d = this.f332b;
        return d == Math.rint(d);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public Number numberValue() {
        return Double.valueOf(this.f332b);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public short shortValue() {
        return (short) this.f332b;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public int intValue() {
        return (int) this.f332b;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public long longValue() {
        return (long) this.f332b;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public float floatValue() {
        return (float) this.f332b;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public double doubleValue() {
        return this.f332b;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f332b);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return xc.a(this.f332b);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean isNaN() {
        return Double.isNaN(this.f332b) || Double.isInfinite(this.f332b);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this.f332b);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ael)) {
            if (Double.compare(this.f332b, ((ael) obj).f332b) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f332b);
        return ((int) (jDoubleToLongBits >> 32)) ^ ((int) jDoubleToLongBits);
    }
}

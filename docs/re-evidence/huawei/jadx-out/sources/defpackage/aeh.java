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
public class aeh extends NumericNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BigDecimal f326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aeh f325c = new aeh(BigDecimal.ZERO);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BigDecimal f324b = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal d = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal g = BigDecimal.valueOf(Long.MIN_VALUE);
    private static final BigDecimal e = BigDecimal.valueOf(Long.MAX_VALUE);

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isBigDecimal() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isFloatingPointNumber() {
        return true;
    }

    public aeh(BigDecimal bigDecimal) {
        this.f326a = bigDecimal;
    }

    public static aeh d(BigDecimal bigDecimal) {
        return new aeh(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToInt() {
        return this.f326a.compareTo(f324b) >= 0 && this.f326a.compareTo(d) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToLong() {
        return this.f326a.compareTo(g) >= 0 && this.f326a.compareTo(e) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToExactIntegral() {
        return this.f326a.signum() == 0 || this.f326a.scale() <= 0 || aej.a(this.f326a).scale() <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public Number numberValue() {
        return this.f326a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public short shortValue() {
        return this.f326a.shortValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public int intValue() {
        return this.f326a.intValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public long longValue() {
        return this.f326a.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigInteger bigIntegerValue() {
        return this.f326a.toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public float floatValue() {
        return this.f326a.floatValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public double doubleValue() {
        return this.f326a.doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigDecimal decimalValue() {
        return this.f326a;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this.f326a.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this.f326a);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof aeh) && ((aeh) obj).f326a.compareTo(this.f326a) == 0;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }
}

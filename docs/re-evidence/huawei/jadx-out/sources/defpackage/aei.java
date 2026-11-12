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
public class aei extends NumericNode {
    protected final BigInteger d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BigInteger f327a = BigInteger.valueOf(-2147483648L);
    private static final BigInteger e = BigInteger.valueOf(2147483647L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BigInteger f328b = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigInteger f329c = BigInteger.valueOf(Long.MAX_VALUE);

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isBigInteger() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isIntegralNumber() {
        return true;
    }

    public aei(BigInteger bigInteger) {
        this.d = bigInteger;
    }

    public static aei c(BigInteger bigInteger) {
        return new aei(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToInt() {
        return this.d.compareTo(f327a) >= 0 && this.d.compareTo(e) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToLong() {
        return this.d.compareTo(f328b) >= 0 && this.d.compareTo(f329c) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public Number numberValue() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public short shortValue() {
        return this.d.shortValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public int intValue() {
        return this.d.intValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public long longValue() {
        return this.d.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigInteger bigIntegerValue() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public float floatValue() {
        return this.d.floatValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public double doubleValue() {
        return this.d.doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigDecimal decimalValue() {
        return new BigDecimal(this.d);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this.d.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        return !BigInteger.ZERO.equals(this.d);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aei)) {
            return ((aei) obj).d.equals(this.d);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.d.hashCode();
    }
}

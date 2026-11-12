package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NodeCursor;
import com.fasterxml.jackson.databind.node.NumericNode;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public class aet extends ParserMinimalBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ObjectCodec f342a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f343c;
    protected NodeCursor d;

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return false;
    }

    public aet(JsonNode jsonNode) {
        this(jsonNode, null);
    }

    public aet(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this.f342a = objectCodec;
        this.d = new NodeCursor.e(jsonNode, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this.f342a = objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this.f342a;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public yb<StreamReadCapability> getReadCapabilities() {
        return DEFAULT_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f343c) {
            return;
        }
        this.f343c = true;
        this.d = null;
        this._currToken = null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        this._currToken = this.d.nextToken();
        if (this._currToken == null) {
            this.f343c = true;
            return null;
        }
        int i = AnonymousClass4.f344c[this._currToken.ordinal()];
        if (i == 1) {
            this.d = this.d.startObject();
        } else if (i == 2) {
            this.d = this.d.startArray();
        } else if (i == 3 || i == 4) {
            this.d = this.d.getParent();
        }
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        if (this._currToken == JsonToken.START_OBJECT) {
            this.d = this.d.getParent();
            this._currToken = JsonToken.END_OBJECT;
            return this;
        }
        if (this._currToken == JsonToken.START_ARRAY) {
            this.d = this.d.getParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean isClosed() {
        return this.f343c;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        NodeCursor parent = this.d;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        NodeCursor parent = this.d;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            parent = parent.getParent();
        }
        if (parent != null) {
            parent.overrideCurrentName(str);
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public wq getTokenLocation() {
        return wq.f52339c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public wq getCurrentLocation() {
        return wq.f52339c;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        if (this.f343c) {
            return null;
        }
        switch (this._currToken) {
            case FIELD_NAME:
                return this.d.getCurrentName();
            case VALUE_STRING:
                return c().textValue();
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
                return String.valueOf(c().numberValue());
            case VALUE_EMBEDDED_OBJECT:
                JsonNode jsonNodeC = c();
                if (jsonNodeC != null && jsonNodeC.isBinary()) {
                    return jsonNodeC.asText();
                }
                break;
        }
        if (this._currToken == null) {
            return null;
        }
        return this._currToken.asString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        return getText().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        return getText().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        JsonNode jsonNodeE = e();
        if (jsonNodeE == null) {
            return null;
        }
        return jsonNodeE.numberType();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        return e().bigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        return e().decimalValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        return e().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return (float) e().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        NumericNode numericNode = (NumericNode) e();
        if (!numericNode.canConvertToInt()) {
            reportOverflowInt();
        }
        return numericNode.intValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        NumericNode numericNode = (NumericNode) e();
        if (!numericNode.canConvertToLong()) {
            reportOverflowLong();
        }
        return numericNode.longValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        return e().numberValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        JsonNode jsonNodeC;
        if (this.f343c || (jsonNodeC = c()) == null) {
            return null;
        }
        if (jsonNodeC.isPojo()) {
            return ((aew) jsonNodeC).b();
        }
        if (jsonNodeC.isBinary()) {
            return ((aee) jsonNodeC).binaryValue();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this.f343c) {
            return false;
        }
        JsonNode jsonNodeC = c();
        if (jsonNodeC instanceof NumericNode) {
            return ((NumericNode) jsonNodeC).isNaN();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonNode jsonNodeC = c();
        if (jsonNodeC == null) {
            return null;
        }
        if (jsonNodeC instanceof aex) {
            return ((aex) jsonNodeC).c(base64Variant);
        }
        return jsonNodeC.binaryValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(base64Variant);
        if (binaryValue == null) {
            return 0;
        }
        outputStream.write(binaryValue, 0, binaryValue.length);
        return binaryValue.length;
    }

    protected JsonNode c() {
        NodeCursor nodeCursor;
        if (this.f343c || (nodeCursor = this.d) == null) {
            return null;
        }
        return nodeCursor.currentNode();
    }

    protected JsonNode e() throws wn {
        JsonNode jsonNodeC = c();
        if (jsonNodeC != null && jsonNodeC.isNumber()) {
            return jsonNodeC;
        }
        throw _constructError("Current token (" + (jsonNodeC == null ? null : jsonNodeC.asToken()) + ") not numeric, cannot use numeric value accessors");
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() throws wn {
        _throwInternal();
    }
}

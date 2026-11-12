package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public class wv extends ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JsonToken f52526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ws f52527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ws f52528c;
    protected boolean d;
    protected TokenFilter.Inclusion e;
    protected TokenFilter f;
    protected JsonToken g;
    protected int i;
    protected TokenFilter j;

    public wv(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.j = tokenFilter;
        this.f = tokenFilter;
        this.f52527b = ws.a(tokenFilter);
        this.e = inclusion;
        this.d = z;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this.f52526a;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this.f52526a;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int getCurrentTokenId() {
        return currentTokenId();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public final int currentTokenId() {
        JsonToken jsonToken = this.f52526a;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this.f52526a != null;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this.f52526a;
        if (jsonToken == null) {
            return i == 0;
        }
        return jsonToken.id() == i;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public final boolean hasToken(JsonToken jsonToken) {
        return this.f52526a == jsonToken;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this.f52526a == JsonToken.START_ARRAY;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this.f52526a == JsonToken.START_OBJECT;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public wq getCurrentLocation() {
        return this.h.getCurrentLocation();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return e();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        JsonStreamContext jsonStreamContextE = e();
        if (this.f52526a == JsonToken.START_OBJECT || this.f52526a == JsonToken.START_ARRAY) {
            JsonStreamContext parent = jsonStreamContextE.getParent();
            if (parent == null) {
                return null;
            }
            return parent.getCurrentName();
        }
        return jsonStreamContextE.getCurrentName();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this.f52526a;
        if (jsonToken != null) {
            this.g = jsonToken;
            this.f52526a = null;
        }
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonToken getLastClearedToken() {
        return this.g;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x019b  */
    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        TokenFilter tokenFilterC;
        JsonToken jsonTokenD;
        boolean zA;
        TokenFilter tokenFilterB;
        TokenFilter tokenFilterC2;
        JsonToken jsonTokenD2;
        TokenFilter tokenFilterB2;
        JsonToken jsonTokenD3;
        TokenFilter tokenFilterC3;
        JsonToken jsonToken;
        if (!this.d && (jsonToken = this.f52526a) != null && this.f52528c == null && jsonToken.isScalarValue() && !this.f52527b.a() && this.e == TokenFilter.Inclusion.ONLY_INCLUDE_ALL && this.f == TokenFilter.f4077c) {
            this.f52526a = null;
            return null;
        }
        ws wsVarC = this.f52528c;
        if (wsVarC != null) {
            while (true) {
                JsonToken jsonTokenC = wsVarC.c();
                if (jsonTokenC != null) {
                    this.f52526a = jsonTokenC;
                    return jsonTokenC;
                }
                ws wsVar = this.f52527b;
                if (wsVarC == wsVar) {
                    this.f52528c = null;
                    if (!wsVarC.inArray()) {
                        break;
                    }
                    JsonToken currentToken = this.h.getCurrentToken();
                    this.f52526a = currentToken;
                    return currentToken;
                }
                wsVarC = wsVar.c(wsVarC);
                this.f52528c = wsVarC;
                if (wsVarC == null) {
                    throw _constructError("Unexpected problem: chain of filtered context broken");
                }
            }
        }
        JsonToken jsonTokenNextToken = this.h.nextToken();
        if (jsonTokenNextToken == null) {
            this.f52526a = jsonTokenNextToken;
            return jsonTokenNextToken;
        }
        int iId = jsonTokenNextToken.id();
        if (iId == 1) {
            TokenFilter tokenFilter = this.f;
            if (tokenFilter == TokenFilter.f4077c) {
                this.f52527b = this.f52527b.c(tokenFilter, true);
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
            if (tokenFilter == null || (tokenFilterC = this.f52527b.c(tokenFilter)) == null) {
                this.h.skipChildren();
            } else {
                if (tokenFilterC != TokenFilter.f4077c) {
                    tokenFilterC = tokenFilterC.e();
                }
                this.f = tokenFilterC;
                if (tokenFilterC == TokenFilter.f4077c) {
                    this.f52527b = this.f52527b.c(tokenFilterC, true);
                    this.f52526a = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
                if (tokenFilterC != null && this.e == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.f52527b = this.f52527b.c(tokenFilterC, true);
                    this.f52526a = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
                this.f52527b = this.f52527b.c(tokenFilterC, false);
                if (this.e == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenD = d(this.f52527b)) != null) {
                    this.f52526a = jsonTokenD;
                    return jsonTokenD;
                }
            }
        } else if (iId == 2) {
            zA = this.f52527b.a();
            tokenFilterB = this.f52527b.b();
            if (tokenFilterB != null && tokenFilterB != TokenFilter.f4077c) {
                tokenFilterB.a();
            }
            ws parent = this.f52527b.getParent();
            this.f52527b = parent;
            this.f = parent.b();
            if (zA) {
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
        } else if (iId == 3) {
            TokenFilter tokenFilter2 = this.f;
            if (tokenFilter2 == TokenFilter.f4077c) {
                this.f52527b = this.f52527b.d(tokenFilter2, true);
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
            if (tokenFilter2 == null || (tokenFilterC2 = this.f52527b.c(tokenFilter2)) == null) {
                this.h.skipChildren();
            } else {
                if (tokenFilterC2 != TokenFilter.f4077c) {
                    tokenFilterC2 = tokenFilterC2.c();
                }
                this.f = tokenFilterC2;
                if (tokenFilterC2 == TokenFilter.f4077c) {
                    this.f52527b = this.f52527b.d(tokenFilterC2, true);
                    this.f52526a = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
                if (tokenFilterC2 != null && this.e == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.f52527b = this.f52527b.d(tokenFilterC2, true);
                    this.f52526a = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
                this.f52527b = this.f52527b.d(tokenFilterC2, false);
                if (this.e == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenD2 = d(this.f52527b)) != null) {
                    this.f52526a = jsonTokenD2;
                    return jsonTokenD2;
                }
            }
        } else if (iId == 4) {
            zA = this.f52527b.a();
            tokenFilterB = this.f52527b.b();
            if (tokenFilterB != null) {
                tokenFilterB.a();
            }
            ws parent2 = this.f52527b.getParent();
            this.f52527b = parent2;
            this.f = parent2.b();
            if (zA) {
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
        } else if (iId == 5) {
            String currentName = this.h.getCurrentName();
            TokenFilter tokenFilterE = this.f52527b.e(currentName);
            if (tokenFilterE == TokenFilter.f4077c) {
                this.f = tokenFilterE;
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
            if (tokenFilterE == null || (tokenFilterB2 = tokenFilterE.b(currentName)) == null) {
                this.h.nextToken();
                this.h.skipChildren();
            } else {
                this.f = tokenFilterB2;
                if (tokenFilterB2 == TokenFilter.f4077c) {
                    if (c()) {
                        if (this.e == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                            this.f52526a = jsonTokenNextToken;
                            return jsonTokenNextToken;
                        }
                    } else {
                        this.h.nextToken();
                        this.h.skipChildren();
                    }
                }
                if (this.e != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenD3 = d(this.f52527b)) != null) {
                    this.f52526a = jsonTokenD3;
                    return jsonTokenD3;
                }
            }
        } else {
            TokenFilter tokenFilter3 = this.f;
            if (tokenFilter3 == TokenFilter.f4077c) {
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
            if (tokenFilter3 != null && (((tokenFilterC3 = this.f52527b.c(tokenFilter3)) == TokenFilter.f4077c || (tokenFilterC3 != null && tokenFilterC3.c(this.h))) && c())) {
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
        }
        return a();
    }

    protected final JsonToken a() throws IOException {
        TokenFilter tokenFilterC;
        JsonToken jsonTokenD;
        JsonToken jsonTokenD2;
        JsonToken jsonTokenD3;
        while (true) {
            JsonToken jsonTokenNextToken = this.h.nextToken();
            if (jsonTokenNextToken == null) {
                this.f52526a = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                TokenFilter tokenFilter = this.f;
                if (tokenFilter == TokenFilter.f4077c) {
                    this.f52527b = this.f52527b.c(tokenFilter, true);
                    this.f52526a = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
                if (tokenFilter == null) {
                    this.h.skipChildren();
                } else {
                    TokenFilter tokenFilterC2 = this.f52527b.c(tokenFilter);
                    if (tokenFilterC2 == null) {
                        this.h.skipChildren();
                    } else {
                        if (tokenFilterC2 != TokenFilter.f4077c) {
                            tokenFilterC2 = tokenFilterC2.e();
                        }
                        this.f = tokenFilterC2;
                        if (tokenFilterC2 == TokenFilter.f4077c) {
                            this.f52527b = this.f52527b.c(tokenFilterC2, true);
                            this.f52526a = jsonTokenNextToken;
                            return jsonTokenNextToken;
                        }
                        if (tokenFilterC2 != null && this.e == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.f52527b = this.f52527b.c(tokenFilterC2, true);
                            this.f52526a = jsonTokenNextToken;
                            return jsonTokenNextToken;
                        }
                        this.f52527b = this.f52527b.c(tokenFilterC2, false);
                        if (this.e == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenD3 = d(this.f52527b)) != null) {
                            this.f52526a = jsonTokenD3;
                            return jsonTokenD3;
                        }
                    }
                }
            } else {
                if (iId != 2) {
                    if (iId == 3) {
                        TokenFilter tokenFilter2 = this.f;
                        if (tokenFilter2 == TokenFilter.f4077c) {
                            this.f52527b = this.f52527b.d(tokenFilter2, true);
                            this.f52526a = jsonTokenNextToken;
                            return jsonTokenNextToken;
                        }
                        if (tokenFilter2 == null) {
                            this.h.skipChildren();
                        } else {
                            TokenFilter tokenFilterC3 = this.f52527b.c(tokenFilter2);
                            if (tokenFilterC3 == null) {
                                this.h.skipChildren();
                            } else {
                                if (tokenFilterC3 != TokenFilter.f4077c) {
                                    tokenFilterC3 = tokenFilterC3.c();
                                }
                                this.f = tokenFilterC3;
                                if (tokenFilterC3 == TokenFilter.f4077c) {
                                    this.f52527b = this.f52527b.d(tokenFilterC3, true);
                                    this.f52526a = jsonTokenNextToken;
                                    return jsonTokenNextToken;
                                }
                                if (tokenFilterC3 != null && this.e == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this.f52527b = this.f52527b.d(tokenFilterC3, true);
                                    this.f52526a = jsonTokenNextToken;
                                    return jsonTokenNextToken;
                                }
                                this.f52527b = this.f52527b.d(tokenFilterC3, false);
                                if (this.e == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenD2 = d(this.f52527b)) != null) {
                                    this.f52526a = jsonTokenD2;
                                    return jsonTokenD2;
                                }
                            }
                        }
                    } else if (iId != 4) {
                        if (iId == 5) {
                            String currentName = this.h.getCurrentName();
                            TokenFilter tokenFilterE = this.f52527b.e(currentName);
                            if (tokenFilterE == TokenFilter.f4077c) {
                                this.f = tokenFilterE;
                                this.f52526a = jsonTokenNextToken;
                                return jsonTokenNextToken;
                            }
                            if (tokenFilterE == null) {
                                this.h.nextToken();
                                this.h.skipChildren();
                            } else {
                                TokenFilter tokenFilterB = tokenFilterE.b(currentName);
                                if (tokenFilterB == null) {
                                    this.h.nextToken();
                                    this.h.skipChildren();
                                } else {
                                    this.f = tokenFilterB;
                                    if (tokenFilterB == TokenFilter.f4077c) {
                                        if (c() && this.e == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                            this.f52526a = jsonTokenNextToken;
                                            return jsonTokenNextToken;
                                        }
                                    } else if (this.e != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenD = d(this.f52527b)) != null) {
                                        this.f52526a = jsonTokenD;
                                        return jsonTokenD;
                                    }
                                }
                            }
                        } else {
                            TokenFilter tokenFilter3 = this.f;
                            if (tokenFilter3 == TokenFilter.f4077c) {
                                this.f52526a = jsonTokenNextToken;
                                return jsonTokenNextToken;
                            }
                            if (tokenFilter3 != null && ((tokenFilterC = this.f52527b.c(tokenFilter3)) == TokenFilter.f4077c || (tokenFilterC != null && tokenFilterC.c(this.h)))) {
                                if (c()) {
                                    this.f52526a = jsonTokenNextToken;
                                    return jsonTokenNextToken;
                                }
                            }
                        }
                    }
                }
                boolean zA = this.f52527b.a();
                TokenFilter tokenFilterB2 = this.f52527b.b();
                if (tokenFilterB2 != null && tokenFilterB2 != TokenFilter.f4077c) {
                    tokenFilterB2.a();
                }
                ws parent = this.f52527b.getParent();
                this.f52527b = parent;
                this.f = parent.b();
                if (zA) {
                    this.f52526a = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
            }
        }
    }

    protected final JsonToken d(ws wsVar) throws IOException {
        JsonToken jsonTokenNextToken;
        TokenFilter tokenFilterC;
        while (true) {
            jsonTokenNextToken = this.h.nextToken();
            if (jsonTokenNextToken == null) {
                break;
            }
            int iId = jsonTokenNextToken.id();
            boolean z = false;
            if (iId == 1) {
                TokenFilter tokenFilter = this.f;
                if (tokenFilter == TokenFilter.f4077c) {
                    this.f52527b = this.f52527b.c(tokenFilter, true);
                    return jsonTokenNextToken;
                }
                if (tokenFilter == null) {
                    this.h.skipChildren();
                } else {
                    TokenFilter tokenFilterC2 = this.f52527b.c(tokenFilter);
                    if (tokenFilterC2 == null) {
                        this.h.skipChildren();
                    } else {
                        if (tokenFilterC2 != TokenFilter.f4077c) {
                            tokenFilterC2 = tokenFilterC2.e();
                        }
                        this.f = tokenFilterC2;
                        if (tokenFilterC2 == TokenFilter.f4077c) {
                            this.f52527b = this.f52527b.c(tokenFilterC2, true);
                            return e(wsVar);
                        }
                        if (tokenFilterC2 != null && this.e == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.f52527b = this.f52527b.d(tokenFilterC2, true);
                            return e(wsVar);
                        }
                        this.f52527b = this.f52527b.c(tokenFilterC2, false);
                    }
                }
            } else {
                if (iId != 2) {
                    if (iId == 3) {
                        TokenFilter tokenFilterC3 = this.f52527b.c(this.f);
                        if (tokenFilterC3 == null) {
                            this.h.skipChildren();
                        } else {
                            if (tokenFilterC3 != TokenFilter.f4077c) {
                                tokenFilterC3 = tokenFilterC3.c();
                            }
                            this.f = tokenFilterC3;
                            if (tokenFilterC3 == TokenFilter.f4077c) {
                                this.f52527b = this.f52527b.d(tokenFilterC3, true);
                                return e(wsVar);
                            }
                            if (tokenFilterC3 != null && this.e == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this.f52527b = this.f52527b.d(tokenFilterC3, true);
                                return e(wsVar);
                            }
                            this.f52527b = this.f52527b.d(tokenFilterC3, false);
                        }
                    } else if (iId != 4) {
                        if (iId == 5) {
                            String currentName = this.h.getCurrentName();
                            TokenFilter tokenFilterE = this.f52527b.e(currentName);
                            if (tokenFilterE == TokenFilter.f4077c) {
                                this.f = tokenFilterE;
                                return e(wsVar);
                            }
                            if (tokenFilterE == null) {
                                this.h.nextToken();
                                this.h.skipChildren();
                            } else {
                                TokenFilter tokenFilterB = tokenFilterE.b(currentName);
                                if (tokenFilterB == null) {
                                    this.h.nextToken();
                                    this.h.skipChildren();
                                } else {
                                    this.f = tokenFilterB;
                                    if (tokenFilterB != TokenFilter.f4077c) {
                                        continue;
                                    } else {
                                        if (c()) {
                                            return e(wsVar);
                                        }
                                        this.f = this.f52527b.e(currentName);
                                    }
                                }
                            }
                        } else {
                            TokenFilter tokenFilter2 = this.f;
                            if (tokenFilter2 == TokenFilter.f4077c) {
                                return e(wsVar);
                            }
                            if (tokenFilter2 != null && ((tokenFilterC = this.f52527b.c(tokenFilter2)) == TokenFilter.f4077c || (tokenFilterC != null && tokenFilterC.c(this.h)))) {
                                if (c()) {
                                    return e(wsVar);
                                }
                            }
                        }
                    }
                }
                TokenFilter tokenFilterB2 = this.f52527b.b();
                if (tokenFilterB2 != null && tokenFilterB2 != TokenFilter.f4077c) {
                    tokenFilterB2.a();
                }
                ws wsVar2 = this.f52527b;
                if (wsVar2 == wsVar && wsVar2.a()) {
                    z = true;
                }
                ws parent = this.f52527b.getParent();
                this.f52527b = parent;
                this.f = parent.b();
                if (z) {
                    break;
                }
            }
        }
        return jsonTokenNextToken;
    }

    private JsonToken e(ws wsVar) throws IOException {
        this.f52528c = wsVar;
        JsonToken jsonTokenC = wsVar.c();
        if (jsonTokenC != null) {
            return jsonTokenC;
        }
        while (wsVar != this.f52527b) {
            wsVar = this.f52528c.c(wsVar);
            this.f52528c = wsVar;
            if (wsVar == null) {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenC2 = wsVar.c();
            if (jsonTokenC2 != null) {
                return jsonTokenC2;
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean c() throws IOException {
        int i = this.i;
        if (i != 0 && !this.d) {
            return false;
        }
        this.i = i + 1;
        return true;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() throws IOException {
        JsonToken jsonTokenNextToken = nextToken();
        return jsonTokenNextToken == JsonToken.FIELD_NAME ? nextToken() : jsonTokenNextToken;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        if (this.f52526a == JsonToken.START_OBJECT || this.f52526a == JsonToken.START_ARRAY) {
            int i = 1;
            while (true) {
                JsonToken jsonTokenNextToken = nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (!jsonTokenNextToken.isStructStart()) {
                    if (jsonTokenNextToken.isStructEnd() && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        return this.h.getText();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return this.h.hasTextCharacters();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        return this.h.getTextCharacters();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        return this.h.getTextLength();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        return this.h.getTextOffset();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        return this.h.getBigIntegerValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean getBooleanValue() throws IOException {
        return this.h.getBooleanValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public byte getByteValue() throws IOException {
        return this.h.getByteValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public short getShortValue() throws IOException {
        return this.h.getShortValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        return this.h.getDecimalValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        return this.h.getDoubleValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return this.h.getFloatValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        return this.h.getIntValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        return this.h.getLongValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        return this.h.getNumberType();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        return this.h.getNumberValue();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        return this.h.getValueAsInt();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) throws IOException {
        return this.h.getValueAsInt(i);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        return this.h.getValueAsLong();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j) throws IOException {
        return this.h.getValueAsLong(j);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble() throws IOException {
        return this.h.getValueAsDouble();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble(double d) throws IOException {
        return this.h.getValueAsDouble(d);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean() throws IOException {
        return this.h.getValueAsBoolean();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean(boolean z) throws IOException {
        return this.h.getValueAsBoolean(z);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        return this.h.getValueAsString();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        return this.h.getValueAsString(str);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() throws IOException {
        return this.h.getEmbeddedObject();
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        return this.h.getBinaryValue(base64Variant);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.h.readBinaryValue(base64Variant, outputStream);
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public wq getTokenLocation() {
        return this.h.getTokenLocation();
    }

    protected JsonStreamContext e() {
        ws wsVar = this.f52528c;
        return wsVar != null ? wsVar : this.f52527b;
    }
}

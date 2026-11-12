package defpackage;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class yo extends ObjectCodec implements Versioned, Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected transient JavaType f53691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final yi f53692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final DefaultDeserializationContext f53693c;
    protected final zn d;
    protected final InjectableValues e;
    protected final JsonDeserializer<Object> f;
    protected final FormatSchema g;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> h;
    protected final JsonFactory i;
    protected final boolean j;
    private final TokenFilter k;
    protected final JavaType m;
    protected final Object n;

    public yo(ObjectMapper objectMapper, yi yiVar, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this.f53692b = yiVar;
        this.f53693c = objectMapper.f;
        this.h = objectMapper.k;
        this.i = objectMapper.j;
        this.m = javaType;
        this.n = obj;
        this.g = formatSchema;
        this.e = injectableValues;
        this.j = yiVar.useRootWrapping();
        this.f = c(javaType);
        this.d = null;
        this.k = null;
    }

    protected yo(yo yoVar, yi yiVar, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, zn znVar) {
        this.f53692b = yiVar;
        this.f53693c = yoVar.f53693c;
        this.h = yoVar.h;
        this.i = yoVar.i;
        this.m = javaType;
        this.f = jsonDeserializer;
        this.n = obj;
        this.g = formatSchema;
        this.e = injectableValues;
        this.j = yiVar.useRootWrapping();
        this.d = znVar;
        this.k = yoVar.k;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    protected yo a(yo yoVar, yi yiVar, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, zn znVar) {
        return new yo(yoVar, yiVar, javaType, jsonDeserializer, obj, formatSchema, injectableValues, znVar);
    }

    protected <T> yl<T> b(JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z) {
        return new yl<>(this.m, jsonParser, deserializationContext, jsonDeserializer, z, this.n);
    }

    protected JsonToken d(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this.f53692b.d(jsonParser, this.g);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != null) {
            return jsonTokenCurrentToken;
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken == null) {
            deserializationContext.reportInputMismatch(this.m, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenNextToken;
    }

    public yo a(JavaType javaType) {
        if (javaType != null && javaType.equals(this.m)) {
            return this;
        }
        JsonDeserializer<Object> jsonDeserializerC = c(javaType);
        zn znVarA = this.d;
        if (znVarA != null) {
            znVarA = znVarA.a(javaType);
        }
        return a(this, this.f53692b, javaType, jsonDeserializerC, this.n, this.g, this.e, znVarA);
    }

    public yo d(Class<?> cls) {
        return a(this.f53692b.constructType(cls));
    }

    public yo b(TypeReference<?> typeReference) {
        return a(this.f53692b.getTypeFactory().b(typeReference.getType()));
    }

    public yo b(Object obj) {
        if (obj == this.n) {
            return this;
        }
        if (obj == null) {
            return a(this, this.f53692b, this.m, this.f, null, this.g, this.e, this.d);
        }
        JavaType javaTypeConstructType = this.m;
        if (javaTypeConstructType == null) {
            javaTypeConstructType = this.f53692b.constructType(obj.getClass());
        }
        return a(this, this.f53692b, javaTypeConstructType, this.f, obj, this.g, this.e, this.d);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this.i;
    }

    public ahp a() {
        return this.f53692b.getTypeFactory();
    }

    public JsonParser a(byte[] bArr) throws IOException {
        a("content", bArr);
        return this.f53692b.d(this.i.createParser(bArr), this.g);
    }

    public JsonParser a(String str) throws IOException {
        a("content", str);
        return this.f53692b.d(this.i.createParser(str), this.g);
    }

    public <T> T a(JsonParser jsonParser) throws IOException {
        a("p", jsonParser);
        return (T) d(jsonParser, this.n);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        a("p", jsonParser);
        return (T) d((Class<?>) cls).a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        a("p", jsonParser);
        return (T) b((TypeReference<?>) typeReference).a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        a("p", jsonParser);
        return (T) a((JavaType) resolvedType).a(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        a("p", jsonParser);
        return d((Class<?>) cls).b(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        a("p", jsonParser);
        return b((TypeReference<?>) typeReference).b(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        a("p", jsonParser);
        return a(jsonParser, (JavaType) resolvedType);
    }

    public <T> Iterator<T> a(JsonParser jsonParser, JavaType javaType) throws IOException {
        a("p", jsonParser);
        return a(javaType).b(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonNode createArrayNode() {
        return this.f53692b.c().arrayNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public JsonNode createObjectNode() {
        return this.f53692b.c().objectNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JsonNode missingNode() {
        return this.f53692b.c().a();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public JsonNode nullNode() {
        return this.f53692b.c().nullNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonParser treeAsTokens(TreeNode treeNode) {
        a("n", treeNode);
        return new aet((JsonNode) treeNode, b((Object) null));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        a("p", jsonParser);
        return d(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) {
        throw new UnsupportedOperationException();
    }

    public <T> T c(String str) throws wr {
        if (this.d != null) {
            e(str);
        }
        try {
            return (T) e(b(a(str), false));
        } catch (wr e) {
            throw e;
        } catch (IOException e2) {
            throw ym.fromUnexpectedIOE(e2);
        }
    }

    public <T> T b(byte[] bArr) throws IOException {
        if (this.d != null) {
            return (T) b(bArr, 0, bArr.length);
        }
        return (T) e(b(a(bArr), false));
    }

    public <T> yl<T> b(JsonParser jsonParser) throws IOException {
        a("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextC = c(jsonParser);
        return b(jsonParser, defaultDeserializationContextC, a(defaultDeserializationContextC), false);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws wr {
        a("n", treeNode);
        try {
            return (T) readValue(treeAsTokens(treeNode), cls);
        } catch (wr e) {
            throw e;
        } catch (IOException e2) {
            throw ym.fromUnexpectedIOE(e2);
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    protected Object d(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextC = c(jsonParser);
        JsonToken jsonTokenD = d(defaultDeserializationContextC, jsonParser);
        if (jsonTokenD == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = a(defaultDeserializationContextC).getNullValue(defaultDeserializationContextC);
            }
        } else if (jsonTokenD != JsonToken.END_ARRAY && jsonTokenD != JsonToken.END_OBJECT) {
            obj = defaultDeserializationContextC.readRootValue(jsonParser, this.m, a(defaultDeserializationContextC), this.n);
        }
        jsonParser.clearCurrentToken();
        if (this.f53692b.d(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            b(jsonParser, defaultDeserializationContextC, this.m);
        }
        return obj;
    }

    protected Object e(JsonParser jsonParser) throws IOException {
        Object rootValue;
        try {
            DefaultDeserializationContext defaultDeserializationContextC = c(jsonParser);
            JsonToken jsonTokenD = d(defaultDeserializationContextC, jsonParser);
            if (jsonTokenD == JsonToken.VALUE_NULL) {
                rootValue = this.n;
                if (rootValue == null) {
                    rootValue = a(defaultDeserializationContextC).getNullValue(defaultDeserializationContextC);
                }
            } else if (jsonTokenD == JsonToken.END_ARRAY || jsonTokenD == JsonToken.END_OBJECT) {
                rootValue = this.n;
            } else {
                rootValue = defaultDeserializationContextC.readRootValue(jsonParser, this.m, a(defaultDeserializationContextC), this.n);
            }
            if (this.f53692b.d(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                b(jsonParser, defaultDeserializationContextC, this.m);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            if (jsonParser != null) {
                try {
                    jsonParser.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected final JsonNode d(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeD;
        this.f53692b.b(jsonParser);
        FormatSchema formatSchema = this.g;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        DefaultDeserializationContext defaultDeserializationContextC = c(jsonParser);
        if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
            jsonNodeD = this.f53692b.c().nullNode();
        } else {
            jsonNodeD = (JsonNode) defaultDeserializationContextC.readRootValue(jsonParser, e(), d(defaultDeserializationContextC), null);
        }
        if (this.f53692b.d(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            b(jsonParser, defaultDeserializationContextC, e());
        }
        return jsonNodeD;
    }

    protected JsonParser b(JsonParser jsonParser, boolean z) {
        return (this.k == null || wv.class.isInstance(jsonParser)) ? jsonParser : new wv(jsonParser, this.k, TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z);
    }

    protected final void b(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            Class<?> clsB = ahw.b(javaType);
            if (clsB == null && (obj = this.n) != null) {
                clsB = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsB, jsonParser, jsonTokenNextToken);
        }
    }

    protected Object b(byte[] bArr, int i, int i2) throws IOException {
        zn.c cVarC = this.d.c(bArr, i, i2);
        if (!cVarC.a()) {
            e(this.d, cVarC);
        }
        return cVarC.d().e(cVarC.c());
    }

    protected void e(zn znVar, zn.c cVar) throws wr {
        throw new wn(null, "Cannot detect format from input, does not look like any of detectable formats " + znVar.toString());
    }

    protected DefaultDeserializationContext c(JsonParser jsonParser) {
        return this.f53693c.createInstance(this.f53692b, jsonParser, this.e);
    }

    protected DefaultDeserializationContext c() {
        return this.f53693c.createDummyInstance(this.f53692b);
    }

    protected void e(Object obj) throws wn {
        throw new wn(null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    protected JsonDeserializer<Object> a(DeserializationContext deserializationContext) throws ym {
        JsonDeserializer<Object> jsonDeserializer = this.f;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this.m;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        JsonDeserializer<Object> jsonDeserializer2 = this.h.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this.h.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected JsonDeserializer<Object> d(DeserializationContext deserializationContext) throws ym {
        JavaType javaTypeE = e();
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this.h.get(javaTypeE);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaTypeE);
            if (jsonDeserializerFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaTypeE, "Cannot find a deserializer for type " + javaTypeE);
            }
            this.h.put(javaTypeE, jsonDeserializerFindRootValueDeserializer);
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected JsonDeserializer<Object> c(JavaType javaType) {
        if (javaType == null || !this.f53692b.d(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this.h.get(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            try {
                jsonDeserializerFindRootValueDeserializer = c().findRootValueDeserializer(javaType);
                if (jsonDeserializerFindRootValueDeserializer != null) {
                    this.h.put(javaType, jsonDeserializerFindRootValueDeserializer);
                }
            } catch (wr unused) {
            }
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected final JavaType e() {
        JavaType javaType = this.f53691a;
        if (javaType != null) {
            return javaType;
        }
        JavaType javaTypeB = a().b(JsonNode.class);
        this.f53691a = javaTypeB;
        return javaTypeB;
    }

    protected final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}

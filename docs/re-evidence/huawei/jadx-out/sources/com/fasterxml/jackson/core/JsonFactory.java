package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JacksonFeature;
import defpackage.wu;
import defpackage.xa;
import defpackage.xi;
import defpackage.xk;
import defpackage.xl;
import defpackage.xn;
import defpackage.xo;
import defpackage.xp;
import defpackage.xq;
import defpackage.xr;
import defpackage.xt;
import defpackage.xu;
import defpackage.xw;
import defpackage.xy;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

/* JADX INFO: loaded from: classes21.dex */
public class JsonFactory extends TokenStreamFactory implements Versioned, Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final transient xt f4075c;
    protected int f;
    protected CharacterEscapes g;
    protected int h;
    protected InputDecorator i;
    protected int j;
    protected int k;
    protected ObjectCodec l;
    protected final char m;
    protected OutputDecorator n;
    protected final transient xr o;
    protected SerializableString q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final int f4073a = Feature.collectDefaults();
    protected static final int d = JsonParser.Feature.collectDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int f4074b = JsonGenerator.Feature.collectDefaults();
    public static final SerializableString e = DefaultPrettyPrinter.e;

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean e() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends FormatFeature> getFormatReadFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends FormatFeature> getFormatWriteFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean requiresPropertyOrdering() {
        return false;
    }

    public enum Feature implements JacksonFeature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public int getMask() {
            return 1 << ordinal();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonFactory() {
        this(null);
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this.o = xr.a();
        this.f4075c = xt.e();
        this.f = f4073a;
        this.k = d;
        this.j = f4074b;
        this.q = e;
        this.l = objectCodec;
        this.m = '\"';
    }

    protected JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this.o = xr.a();
        this.f4075c = xt.e();
        this.f = f4073a;
        this.k = d;
        this.j = f4074b;
        this.q = e;
        this.l = objectCodec;
        this.f = jsonFactory.f;
        this.k = jsonFactory.k;
        this.j = jsonFactory.j;
        this.i = jsonFactory.i;
        this.n = jsonFactory.n;
        this.g = jsonFactory.g;
        this.q = jsonFactory.q;
        this.h = jsonFactory.h;
        this.m = jsonFactory.m;
    }

    protected Object readResolve() {
        return new JsonFactory(this, this.l);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canParseAsync() {
        return a();
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canUseSchema(FormatSchema formatSchema) {
        String formatName;
        return (formatSchema == null || (formatName = getFormatName()) == null || !formatName.equals(formatSchema.getSchemaType())) ? false : true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return "JSON";
        }
        return null;
    }

    public MatchStrength a(InputAccessor inputAccessor) throws IOException {
        if (getClass() == JsonFactory.class) {
            return e(inputAccessor);
        }
        return null;
    }

    protected MatchStrength e(InputAccessor inputAccessor) throws IOException {
        return xi.b(inputAccessor);
    }

    @Override // com.fasterxml.jackson.core.Versioned
    public wu version() {
        return xo.d;
    }

    public final boolean e(Feature feature) {
        return (feature.getMask() & this.f) != 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getParserFeatures() {
        return this.k;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getGeneratorFeatures() {
        return this.j;
    }

    public final JsonFactory d(JsonParser.Feature feature, boolean z) {
        return z ? c(feature) : b(feature);
    }

    public JsonFactory c(JsonParser.Feature feature) {
        this.k = feature.getMask() | this.k;
        return this;
    }

    public JsonFactory b(JsonParser.Feature feature) {
        this.k = (~feature.getMask()) & this.k;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this.k) != 0;
    }

    public final JsonFactory c(JsonGenerator.Feature feature, boolean z) {
        return z ? e(feature) : d(feature);
    }

    public JsonFactory e(JsonGenerator.Feature feature) {
        this.j = feature.getMask() | this.j;
        return this;
    }

    public JsonFactory d(JsonGenerator.Feature feature) {
        this.j = (~feature.getMask()) & this.j;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.j) != 0;
    }

    public JsonFactory d(ObjectCodec objectCodec) {
        this.l = objectCodec;
        return this;
    }

    public ObjectCodec c() {
        return this.l;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(File file) throws IOException {
        xa xaVarD = d((Object) file, true);
        return e(b(new FileInputStream(file), xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(URL url) throws IOException {
        xa xaVarD = d((Object) url, true);
        return e(b(_optimizedStreamFromURL(url), xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(InputStream inputStream) throws IOException {
        xa xaVarD = d((Object) inputStream, false);
        return e(b(inputStream, xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(Reader reader) throws IOException {
        xa xaVarD = d((Object) reader, false);
        return e(c(reader, xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        xa xaVarD = d((Object) bArr, true);
        InputDecorator inputDecorator = this.i;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(xaVarD, bArr, 0, bArr.length)) != null) {
            return e(inputStreamDecorate, xaVarD);
        }
        return d(bArr, 0, bArr.length, xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStreamDecorate;
        xa xaVarD = d((Object) bArr, true);
        InputDecorator inputDecorator = this.i;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(xaVarD, bArr, i, i2)) != null) {
            return e(inputStreamDecorate, xaVarD);
        }
        return d(bArr, i, i2, xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this.i != null || length > 32768 || !e()) {
            return createParser(new StringReader(str));
        }
        xa xaVarD = d((Object) str, true);
        char[] cArrD = xaVarD.d(length);
        str.getChars(0, length, cArrD, 0);
        return d(cArrD, 0, length, xaVarD, true);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        if (this.i != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return d(cArr, i, i2, d((Object) cArr, true), false);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(DataInput dataInput) throws IOException {
        xa xaVarD = d((Object) dataInput, false);
        return a(c(dataInput, xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        e("Non-blocking source not (yet?) supported for this format (%s)");
        return new xu(d((Object) null), this.k, this.f4075c.d(this.f));
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        xa xaVarD = d((Object) outputStream, false);
        xaVarD.a(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return b(e(outputStream, xaVarD), xaVarD);
        }
        return d(a(c(outputStream, jsonEncoding, xaVarD), xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(Writer writer) throws IOException {
        xa xaVarD = d((Object) writer, false);
        return d(a(writer, xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        xa xaVarD = d((Object) fileOutputStream, true);
        xaVarD.a(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return b(e(fileOutputStream, xaVarD), xaVarD);
        }
        return d(a(c(fileOutputStream, jsonEncoding, xaVarD), xaVarD), xaVarD);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    protected JsonParser e(InputStream inputStream, xa xaVar) throws IOException {
        return new xi(xaVar, inputStream).c(this.k, this.l, this.f4075c, this.o, this.f);
    }

    protected JsonParser e(Reader reader, xa xaVar) throws IOException {
        return new xl(xaVar, this.k, reader, this.l, this.o.a(this.f));
    }

    protected JsonParser d(char[] cArr, int i, int i2, xa xaVar, boolean z) throws IOException {
        return new xl(xaVar, this.k, null, this.l, this.o.a(this.f), cArr, i, i + i2, z);
    }

    protected JsonParser d(byte[] bArr, int i, int i2, xa xaVar) throws IOException {
        return new xi(xaVar, bArr, i, i2).c(this.k, this.l, this.f4075c, this.o, this.f);
    }

    protected JsonParser a(DataInput dataInput, xa xaVar) throws IOException {
        e("InputData source not (yet?) supported for this format (%s)");
        int iE = xi.e(dataInput);
        return new xp(xaVar, this.k, dataInput, this.l, this.f4075c.d(this.f), iE);
    }

    protected JsonGenerator d(Writer writer, xa xaVar) throws IOException {
        xq xqVar = new xq(xaVar, this.j, this.l, writer, this.m);
        int i = this.h;
        if (i > 0) {
            xqVar.setHighestNonEscapedChar(i);
        }
        CharacterEscapes characterEscapes = this.g;
        if (characterEscapes != null) {
            xqVar.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this.q;
        if (serializableString != e) {
            xqVar.setRootValueSeparator(serializableString);
        }
        return xqVar;
    }

    protected JsonGenerator b(OutputStream outputStream, xa xaVar) throws IOException {
        xn xnVar = new xn(xaVar, this.j, this.l, outputStream, this.m);
        int i = this.h;
        if (i > 0) {
            xnVar.setHighestNonEscapedChar(i);
        }
        CharacterEscapes characterEscapes = this.g;
        if (characterEscapes != null) {
            xnVar.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this.q;
        if (serializableString != e) {
            xnVar.setRootValueSeparator(serializableString);
        }
        return xnVar;
    }

    protected Writer c(OutputStream outputStream, JsonEncoding jsonEncoding, xa xaVar) throws IOException {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new xk(xaVar, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    protected final InputStream b(InputStream inputStream, xa xaVar) throws IOException {
        InputStream inputStreamDecorate;
        InputDecorator inputDecorator = this.i;
        return (inputDecorator == null || (inputStreamDecorate = inputDecorator.decorate(xaVar, inputStream)) == null) ? inputStream : inputStreamDecorate;
    }

    protected final Reader c(Reader reader, xa xaVar) throws IOException {
        Reader readerDecorate;
        InputDecorator inputDecorator = this.i;
        return (inputDecorator == null || (readerDecorate = inputDecorator.decorate(xaVar, reader)) == null) ? reader : readerDecorate;
    }

    protected final DataInput c(DataInput dataInput, xa xaVar) throws IOException {
        DataInput dataInputDecorate;
        InputDecorator inputDecorator = this.i;
        return (inputDecorator == null || (dataInputDecorate = inputDecorator.decorate(xaVar, dataInput)) == null) ? dataInput : dataInputDecorate;
    }

    protected final OutputStream e(OutputStream outputStream, xa xaVar) throws IOException {
        OutputStream outputStreamDecorate;
        OutputDecorator outputDecorator = this.n;
        return (outputDecorator == null || (outputStreamDecorate = outputDecorator.decorate(xaVar, outputStream)) == null) ? outputStream : outputStreamDecorate;
    }

    protected final Writer a(Writer writer, xa xaVar) throws IOException {
        Writer writerDecorate;
        OutputDecorator outputDecorator = this.n;
        return (outputDecorator == null || (writerDecorate = outputDecorator.decorate(xaVar, writer)) == null) ? writer : writerDecorate;
    }

    public xw d() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this.f)) {
            return xy.a();
        }
        return new xw();
    }

    protected xa d(Object obj, boolean z) {
        return new xa(d(), obj, z);
    }

    protected xa d(Object obj) {
        return new xa(d(), obj, false);
    }

    private final void e(String str) {
        if (!a()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    private final boolean a() {
        return getFormatName() == "JSON";
    }
}

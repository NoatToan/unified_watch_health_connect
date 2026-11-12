package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import defpackage.awg;
import defpackage.c1a;
import defpackage.fpr;
import defpackage.g8q;
import defpackage.h8q;
import defpackage.j8q;
import defpackage.khh;
import defpackage.mm5;
import defpackage.owl;
import defpackage.r73;
import defpackage.rad;
import defpackage.s73;
import defpackage.tgj;
import defpackage.v3h;
import defpackage.x53;
import defpackage.xuc;
import defpackage.y53;
import defpackage.z0a;
import defpackage.zt3;
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

/* JADX INFO: loaded from: classes4.dex */
public class JsonFactory implements Serializable {
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 1;
    protected final transient r73 _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected v3h _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient zt3 _rootCharSymbols;
    protected owl _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    private static final owl DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this(null);
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public xuc _createContext(Object obj, boolean z) {
        return new xuc(_getBufferRecycler(), obj, z);
    }

    public OutputStream _createDataOutputWrapper(DataOutput dataOutput) {
        return new mm5(dataOutput);
    }

    public JsonGenerator _createGenerator(Writer writer, xuc xucVar) throws IOException {
        fpr fprVar = new fpr(xucVar, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            fprVar.K(characterEscapes);
        }
        owl owlVar = this._rootValueSeparator;
        if (owlVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            fprVar.Q(owlVar);
        }
        return fprVar;
    }

    public xuc _createNonBlockingContext(Object obj) {
        return new xuc(new x53(), obj, false);
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, xuc xucVar, boolean z) throws IOException {
        return new tgj(xucVar, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.q(this._factoryFeatures), cArr, i, i + i2, z);
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, xuc xucVar) throws IOException {
        h8q h8qVar = new h8q(xucVar, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            h8qVar.K(characterEscapes);
        }
        owl owlVar = this._rootValueSeparator;
        if (owlVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            h8qVar.Q(owlVar);
        }
        return h8qVar;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, xuc xucVar) throws IOException {
        return jsonEncoding == JsonEncoding.UTF8 ? new j8q(xucVar, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public final InputStream _decorate(InputStream inputStream, xuc xucVar) throws IOException {
        InputStream inputStreamDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (inputStreamDecorate = inputDecorator.decorate(xucVar, inputStream)) == null) ? inputStream : inputStreamDecorate;
    }

    public x53 _getBufferRecycler() {
        return Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? y53.b() : new x53();
    }

    public InputStream _optimizedStreamFromURL(URL url) throws IOException {
        String host;
        return (!"file".equals(url.getProtocol()) || !((host = url.getHost()) == null || host.length() == 0) || url.getPath().indexOf(37) >= 0) ? url.openStream() : new FileInputStream(url.getPath());
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(c1a c1aVar) {
        String formatName;
        return (c1aVar == null || (formatName = getFormatName()) == null || !formatName.equals(c1aVar.a())) ? false : true;
    }

    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        xuc xucVar_createContext = _createContext(outputStream, false);
        xucVar_createContext.u(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, xucVar_createContext), xucVar_createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, xucVar_createContext), xucVar_createContext), xucVar_createContext);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException {
        return createParser(file);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) support for this format (%s)");
        return new awg(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.G(this._factoryFeatures));
    }

    public JsonParser createParser(File file) throws IOException {
        xuc xucVar_createContext = _createContext(file, true);
        return _createParser(_decorate(new FileInputStream(file), xucVar_createContext), xucVar_createContext);
    }

    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public v3h getCodec() {
        return this._objectCodec;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public Class<? extends z0a> getFormatReadFeatureType() {
        return null;
    }

    public Class<? extends z0a> getFormatWriteFeatureType() {
        return null;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public String getRootValueSeparator() {
        owl owlVar = this._rootValueSeparator;
        if (owlVar == null) {
            return null;
        }
        return owlVar.getValue();
    }

    public MatchStrength hasFormat(rad radVar) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(radVar);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(rad radVar) throws IOException {
        return s73.h(radVar);
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(v3h v3hVar) {
        this._objectCodec = v3hVar;
        return this;
    }

    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public Version version() {
        return khh.f23851a;
    }

    public JsonFactory(v3h v3hVar) {
        this._rootCharSymbols = zt3.m();
        this._byteSymbolCanonicalizer = r73.A();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = v3hVar;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException {
        return createParser(url);
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public final Reader _decorate(Reader reader, xuc xucVar) throws IOException {
        Reader readerDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (readerDecorate = inputDecorator.decorate(xucVar, reader)) == null) ? reader : readerDecorate;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException {
        return createParser(inputStream);
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public JsonParser _createParser(InputStream inputStream, xuc xucVar) throws IOException {
        return new s73(xucVar, inputStream).c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException {
        return createParser(reader);
    }

    public JsonParser createParser(URL url) throws IOException {
        xuc xucVar_createContext = _createContext(url, true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), xucVar_createContext), xucVar_createContext);
    }

    public JsonParser _createParser(Reader reader, xuc xucVar) throws IOException {
        return new tgj(xucVar, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.q(this._factoryFeatures));
    }

    public final DataInput _decorate(DataInput dataInput, xuc xucVar) throws IOException {
        DataInput dataInputDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (dataInputDecorate = inputDecorator.decorate(xucVar, dataInput)) == null) ? dataInput : dataInputDecorate;
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException {
        return createParser(bArr);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException {
        return createParser(bArr, i, i2);
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, xuc xucVar) throws IOException {
        return new s73(xucVar, bArr, i, i2).c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public final OutputStream _decorate(OutputStream outputStream, xuc xucVar) throws IOException {
        OutputStream outputStreamDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (outputStreamDecorate = outputDecorator.decorate(xucVar, outputStream)) == null) ? outputStream : outputStreamDecorate;
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException {
        return createParser(str);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        xuc xucVar_createContext = _createContext(inputStream, false);
        return _createParser(_decorate(inputStream, xucVar_createContext), xucVar_createContext);
    }

    public JsonParser _createParser(DataInput dataInput, xuc xucVar) throws IOException {
        _requireJSONFactory("InputData source not (yet?) support for this format (%s)");
        int iL = s73.l(dataInput);
        return new g8q(xucVar, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.G(this._factoryFeatures), iL);
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        xuc xucVar_createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, xucVar_createContext), xucVar_createContext);
    }

    public final Writer _decorate(Writer writer, xuc xucVar) throws IOException {
        Writer writerDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (writerDecorate = outputDecorator.decorate(xucVar, writer)) == null) ? writer : writerDecorate;
    }

    public JsonParser createParser(Reader reader) throws IOException {
        xuc xucVar_createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, xucVar_createContext), xucVar_createContext);
    }

    public JsonFactory(JsonFactory jsonFactory, v3h v3hVar) {
        this._rootCharSymbols = zt3.m();
        this._byteSymbolCanonicalizer = r73.A();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = v3hVar;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        xuc xucVar_createContext = _createContext(fileOutputStream, true);
        xucVar_createContext.u(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(fileOutputStream, xucVar_createContext), xucVar_createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, xucVar_createContext), xucVar_createContext), xucVar_createContext);
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        xuc xucVar_createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(xucVar_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(inputStreamDecorate, xucVar_createContext);
        }
        return _createParser(bArr, 0, bArr.length, xucVar_createContext);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStreamDecorate;
        xuc xucVar_createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(xucVar_createContext, bArr, i, i2)) != null) {
            return _createParser(inputStreamDecorate, xucVar_createContext);
        }
        return _createParser(bArr, i, i2, xucVar_createContext);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this._inputDecorator == null && length <= 32768 && canUseCharArrays()) {
            xuc xucVar_createContext = _createContext(str, true);
            char[] cArrI = xucVar_createContext.i(length);
            str.getChars(0, length, cArrI, 0);
            return _createParser(cArrI, 0, length, xucVar_createContext, true);
        }
        return createParser(new StringReader(str));
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(cArr, true), false);
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        xuc xucVar_createContext = _createContext(dataInput, false);
        return _createParser(_decorate(dataInput, xucVar_createContext), xucVar_createContext);
    }
}

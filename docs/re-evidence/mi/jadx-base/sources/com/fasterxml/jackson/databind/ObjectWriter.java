package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.c1a;
import defpackage.ccd;
import defpackage.e5q;
import defpackage.eud;
import defpackage.h04;
import defpackage.ihh;
import defpackage.irl;
import defpackage.ksd;
import defpackage.m5q;
import defpackage.owl;
import defpackage.r7i;
import defpackage.t63;
import defpackage.tm9;
import defpackage.vwl;
import defpackage.z0a;
import defpackage.z4q;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectWriter implements Serializable {
    protected static final r7i NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final SerializationConfig _config;
    protected final JsonFactory _generatorFactory;
    protected final GeneratorSettings _generatorSettings;
    protected final Prefetch _prefetch;
    protected final vwl _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    public static final class Prefetch implements Serializable {
        public static final Prefetch empty = new Prefetch(null, null, null);
        private static final long serialVersionUID = 1;
        private final JavaType rootType;
        private final e5q typeSerializer;
        private final eud<Object> valueSerializer;

        private Prefetch(JavaType javaType, eud<Object> eudVar, e5q e5qVar) {
            this.rootType = javaType;
            this.valueSerializer = eudVar;
            this.typeSerializer = e5qVar;
        }

        public Prefetch forRootType(ObjectWriter objectWriter, JavaType javaType) {
            if (javaType == null || javaType.isJavaLangObject()) {
                return (this.rootType == null || this.valueSerializer == null) ? this : new Prefetch(null, null, this.typeSerializer);
            }
            if (javaType.equals(this.rootType)) {
                return this;
            }
            if (objectWriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                try {
                    eud<Object> eudVarFindTypedValueSerializer = objectWriter._serializerProvider().findTypedValueSerializer(javaType, true, (BeanProperty) null);
                    return eudVarFindTypedValueSerializer instanceof m5q ? new Prefetch(javaType, null, ((m5q) eudVarFindTypedValueSerializer).a()) : new Prefetch(javaType, eudVarFindTypedValueSerializer, null);
                } catch (JsonProcessingException unused) {
                }
            }
            return new Prefetch(javaType, null, this.typeSerializer);
        }

        public final e5q getTypeSerializer() {
            return this.typeSerializer;
        }

        public final eud<Object> getValueSerializer() {
            return this.valueSerializer;
        }

        public boolean hasSerializer() {
            return (this.valueSerializer == null && this.typeSerializer == null) ? false : true;
        }

        public void serialize(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) throws IOException {
            e5q e5qVar = this.typeSerializer;
            if (e5qVar != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.rootType, this.valueSerializer, e5qVar);
                return;
            }
            eud<Object> eudVar = this.valueSerializer;
            if (eudVar != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, this.rootType, eudVar);
                return;
            }
            JavaType javaType = this.rootType;
            if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, r7i r7iVar) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = r7iVar == null ? GeneratorSettings.empty : new GeneratorSettings(r7iVar, null, null, null);
        if (javaType == null || javaType.hasRawClass(Object.class)) {
            this._prefetch = Prefetch.empty;
        } else {
            this._prefetch = Prefetch.empty.forRootType(this, javaType.withStaticTyping());
        }
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                h04.i(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _configureGenerator(jsonGenerator);
        if (this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseable(jsonGenerator, obj);
            return;
        }
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            jsonGenerator.close();
        } catch (Exception e) {
            h04.j(jsonGenerator, e);
        }
    }

    public final void _configureGenerator(JsonGenerator jsonGenerator) {
        this._config.initialize(jsonGenerator);
        this._generatorSettings.initialize(jsonGenerator);
    }

    public ObjectWriter _new(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        return new ObjectWriter(objectWriter, jsonFactory);
    }

    public b _newSequenceWriter(boolean z, JsonGenerator jsonGenerator, boolean z2) throws IOException {
        _configureGenerator(jsonGenerator);
        return new b(_serializerProvider(), jsonGenerator, z2, this._prefetch).a(z);
    }

    public DefaultSerializerProvider _serializerProvider() {
        return this._serializerProvider.createInstance(this._config, this._serializerFactory);
    }

    public void _verifySchemaType(c1a c1aVar) {
        if (c1aVar == null || this._generatorFactory.canUseSchema(c1aVar)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + c1aVar.getClass().getName() + " for format " + this._generatorFactory.getFormatName());
    }

    public void acceptJsonFormatVisitor(JavaType javaType, ksd ksdVar) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        _serializerProvider().acceptJsonFormatVisitor(javaType, ksdVar);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider().hasSerializerFor(cls, null);
    }

    public ObjectWriter forType(JavaType javaType) {
        return _new(this._generatorSettings, this._prefetch.forRootType(this, javaType));
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public SerializationConfig getConfig() {
        return this._config;
    }

    public JsonFactory getFactory() {
        return this._generatorFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean hasPrefetchedSerializer() {
        return this._prefetch.hasSerializer();
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public Version version() {
        return ihh.f21147a;
    }

    public ObjectWriter with(SerializationFeature serializationFeature) {
        return _new(this, this._config.with(serializationFeature));
    }

    public ObjectWriter withAttribute(Object obj, Object obj2) {
        return _new(this, this._config.withAttribute(obj, obj2));
    }

    public ObjectWriter withAttributes(Map<?, ?> map) {
        return _new(this, this._config.withAttributes(map));
    }

    public ObjectWriter withDefaultPrettyPrinter() {
        return with(this._config.getDefaultPrettyPrinter());
    }

    public ObjectWriter withFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withFeatures(serializationFeatureArr));
    }

    public ObjectWriter withRootName(String str) {
        return _new(this, this._config.withRootName(str));
    }

    public ObjectWriter withRootValueSeparator(String str) {
        return _new(this._generatorSettings.withRootValueSeparator(str), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withSchema(c1a c1aVar) {
        return with(c1aVar);
    }

    @Deprecated
    public ObjectWriter withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectWriter withView(Class<?> cls) {
        return _new(this, this._config.withView(cls));
    }

    public ObjectWriter without(SerializationFeature serializationFeature) {
        return _new(this, this._config.without(serializationFeature));
    }

    public ObjectWriter withoutAttribute(Object obj) {
        return _new(this, this._config.withoutAttribute(obj));
    }

    public ObjectWriter withoutFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withoutFeatures(serializationFeatureArr));
    }

    public ObjectWriter withoutRootName() {
        return _new(this, this._config.withRootName(PropertyName.NO_NAME));
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _configureGenerator(jsonGenerator);
        if (!this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            h04.i(null, closeable, e);
        }
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        t63 t63Var = new t63(this._generatorFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._generatorFactory.createGenerator(t63Var, JsonEncoding.UTF8), obj);
            byte[] bArrD = t63Var.D();
            t63Var.p();
            return bArrD;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        irl irlVar = new irl(this._generatorFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._generatorFactory.createGenerator(irlVar), obj);
            return irlVar.a();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public b writeValues(File file) throws IOException {
        return _newSequenceWriter(false, this._generatorFactory.createGenerator(file, JsonEncoding.UTF8), true);
    }

    public b writeValuesAsArray(File file) throws IOException {
        return _newSequenceWriter(true, this._generatorFactory.createGenerator(file, JsonEncoding.UTF8), true);
    }

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings empty = new GeneratorSettings(null, null, null, null);
        private static final long serialVersionUID = 1;
        public final CharacterEscapes characterEscapes;
        public final r7i prettyPrinter;
        public final owl rootValueSeparator;
        public final c1a schema;

        public GeneratorSettings(r7i r7iVar, c1a c1aVar, CharacterEscapes characterEscapes, owl owlVar) {
            this.prettyPrinter = r7iVar;
            this.characterEscapes = characterEscapes;
            this.rootValueSeparator = owlVar;
        }

        private final String _rootValueSeparatorAsString() {
            owl owlVar = this.rootValueSeparator;
            if (owlVar == null) {
                return null;
            }
            return owlVar.getValue();
        }

        public void initialize(JsonGenerator jsonGenerator) {
            r7i r7iVar = this.prettyPrinter;
            if (r7iVar != null) {
                if (r7iVar == ObjectWriter.NULL_PRETTY_PRINTER) {
                    jsonGenerator.P(null);
                } else {
                    if (r7iVar instanceof ccd) {
                        r7iVar = (r7i) ((ccd) r7iVar).createInstance();
                    }
                    jsonGenerator.P(r7iVar);
                }
            }
            CharacterEscapes characterEscapes = this.characterEscapes;
            if (characterEscapes != null) {
                jsonGenerator.K(characterEscapes);
            }
            owl owlVar = this.rootValueSeparator;
            if (owlVar != null) {
                jsonGenerator.Q(owlVar);
            }
        }

        public GeneratorSettings with(c1a c1aVar) {
            return c1aVar == null ? this : new GeneratorSettings(this.prettyPrinter, c1aVar, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(owl owlVar) {
            if (owlVar == null) {
                return this.rootValueSeparator == null ? this : new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, null);
            }
            return owlVar.equals(this.rootValueSeparator) ? this : new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, owlVar);
        }

        public GeneratorSettings with(r7i r7iVar) {
            if (r7iVar == null) {
                r7iVar = ObjectWriter.NULL_PRETTY_PRINTER;
            }
            return r7iVar == this.prettyPrinter ? this : new GeneratorSettings(r7iVar, null, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings with(CharacterEscapes characterEscapes) {
            return this.characterEscapes == characterEscapes ? this : new GeneratorSettings(this.prettyPrinter, null, characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(String str) {
            if (str == null) {
                return this.rootValueSeparator == null ? this : new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, null);
            }
            return str.equals(_rootValueSeparatorAsString()) ? this : new GeneratorSettings(this.prettyPrinter, null, this.characterEscapes, new SerializedString(str));
        }
    }

    public ObjectWriter _new(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        return serializationConfig == this._config ? this : new ObjectWriter(objectWriter, serializationConfig);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider().hasSerializerFor(cls, atomicReference);
    }

    public ObjectWriter forType(Class<?> cls) {
        return cls == Object.class ? forType((JavaType) null) : forType(this._config.constructType(cls));
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public ObjectWriter with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withFeatures(featureArr));
    }

    public ObjectWriter withRootName(PropertyName propertyName) {
        return _new(this, this._config.withRootName(propertyName));
    }

    public ObjectWriter withRootValueSeparator(owl owlVar) {
        return _new(this._generatorSettings.withRootValueSeparator(owlVar), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withType(Class<?> cls) {
        return forType(cls);
    }

    public ObjectWriter without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.without(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withoutFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withoutFeatures(featureArr));
    }

    @Deprecated
    public boolean isEnabled(JsonParser.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public ObjectWriter with(JsonGenerator.Feature feature) {
        return _new(this, this._config.with(feature));
    }

    public ObjectWriter withFeatures(z0a... z0aVarArr) {
        return _new(this, this._config.withFeatures(z0aVarArr));
    }

    @Deprecated
    public ObjectWriter withType(z4q<?> z4qVar) {
        return forType(z4qVar);
    }

    public ObjectWriter without(JsonGenerator.Feature feature) {
        return _new(this, this._config.without(feature));
    }

    public ObjectWriter withoutFeatures(z0a... z0aVarArr) {
        return _new(this, this._config.withoutFeatures(z0aVarArr));
    }

    public ObjectWriter _new(GeneratorSettings generatorSettings, Prefetch prefetch) {
        return (this._generatorSettings == generatorSettings && this._prefetch == prefetch) ? this : new ObjectWriter(this, this._config, generatorSettings, prefetch);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, ksd ksdVar) throws JsonMappingException {
        acceptJsonFormatVisitor(this._config.constructType(cls), ksdVar);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public ObjectWriter with(z0a z0aVar) {
        return _new(this, this._config.with(z0aVar));
    }

    public ObjectWriter without(z0a z0aVar) {
        return _new(this, this._config.without(z0aVar));
    }

    public b writeValues(JsonGenerator jsonGenerator) throws IOException {
        _configureGenerator(jsonGenerator);
        return _newSequenceWriter(false, jsonGenerator, false);
    }

    public b writeValuesAsArray(JsonGenerator jsonGenerator) throws IOException {
        return _newSequenceWriter(true, jsonGenerator, false);
    }

    public ObjectWriter forType(z4q<?> z4qVar) {
        this._config.getTypeFactory();
        throw null;
    }

    public ObjectWriter with(DateFormat dateFormat) {
        return _new(this, this._config.with(dateFormat));
    }

    public b writeValuesAsArray(Writer writer) throws IOException {
        return _newSequenceWriter(true, this._generatorFactory.createGenerator(writer), true);
    }

    public ObjectWriter with(tm9 tm9Var) {
        return tm9Var == this._config.getFilterProvider() ? this : _new(this, this._config.withFilters(tm9Var));
    }

    public b writeValues(Writer writer) throws IOException {
        return _newSequenceWriter(false, this._generatorFactory.createGenerator(writer), true);
    }

    public b writeValuesAsArray(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(true, this._generatorFactory.createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public ObjectWriter with(r7i r7iVar) {
        return _new(this._generatorSettings.with(r7iVar), this._prefetch);
    }

    public ObjectWriter with(c1a c1aVar) {
        _verifySchemaType(c1aVar);
        return _new(this._generatorSettings.with(c1aVar), this._prefetch);
    }

    public b writeValues(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(false, this._generatorFactory.createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public b writeValuesAsArray(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(true, this._generatorFactory.createGenerator(dataOutput), true);
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = GeneratorSettings.empty;
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter with(Locale locale) {
        return _new(this, this._config.with(locale));
    }

    public ObjectWriter with(TimeZone timeZone) {
        return _new(this, this._config.with(timeZone));
    }

    public void writeValue(File file, Object obj) throws IOException {
        _configAndWriteValue(this._generatorFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public b writeValues(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(false, this._generatorFactory.createGenerator(dataOutput), true);
    }

    public ObjectWriter with(Base64Variant base64Variant) {
        return _new(this, this._config.with(base64Variant));
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _configAndWriteValue(this._generatorFactory.createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter with(CharacterEscapes characterEscapes) {
        return _new(this._generatorSettings.with(characterEscapes), this._prefetch);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _configAndWriteValue(this._generatorFactory.createGenerator(writer), obj);
    }

    public ObjectWriter with(JsonFactory jsonFactory) {
        return jsonFactory == this._generatorFactory ? this : _new(this, jsonFactory);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _configAndWriteValue(this._generatorFactory.createGenerator(dataOutput), obj);
    }

    public ObjectWriter with(ContextAttributes contextAttributes) {
        return _new(this, this._config.with(contextAttributes));
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, c1a c1aVar) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = c1aVar == null ? GeneratorSettings.empty : new GeneratorSettings(null, c1aVar, null, null);
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = generatorSettings;
        this._prefetch = prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        this._config = objectWriter._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = jsonFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }
}

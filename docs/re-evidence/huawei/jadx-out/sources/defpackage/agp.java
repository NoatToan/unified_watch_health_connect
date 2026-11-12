package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes21.dex */
public class agp extends PropertyWriter {
    private static final BeanProperty j = new BeanProperty.a();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final TypeSerializer f389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JsonSerializer<Object> f390c;
    protected final BeanProperty d;
    protected Object e;
    protected JsonSerializer<Object> i;

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(aeu aeuVar, SerializerProvider serializerProvider) throws ym {
    }

    public agp(TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(beanProperty == null ? yq.f53746b : beanProperty.getMetadata());
        this.f389b = typeSerializer;
        this.d = beanProperty == null ? j : beanProperty;
    }

    public void c(Object obj, Object obj2, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2) {
        this.f388a = obj;
        this.e = obj2;
        this.f390c = jsonSerializer;
        this.i = jsonSerializer2;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        Object obj = this.f388a;
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public ys getFullName() {
        return new ys(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.d.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this.d.getContextAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        this.f390c.serialize(this.f388a, jsonGenerator, serializerProvider);
        TypeSerializer typeSerializer = this.f389b;
        if (typeSerializer == null) {
            this.i.serialize(this.e, jsonGenerator, serializerProvider);
        } else {
            this.i.serializeWithType(this.e, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        if (jsonGenerator.canOmitFields()) {
            return;
        }
        jsonGenerator.writeOmittedField(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        TypeSerializer typeSerializer = this.f389b;
        if (typeSerializer == null) {
            this.i.serialize(this.e, jsonGenerator, serializerProvider);
        } else {
            this.i.serializeWithType(this.e, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        jsonGenerator.writeNull();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        this.d.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this.d.getType();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public ys getWrapperName() {
        return this.d.getWrapperName();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.d.getMember();
    }
}

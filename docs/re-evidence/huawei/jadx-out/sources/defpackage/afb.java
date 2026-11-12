package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class afb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AnnotatedMember f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected JsonSerializer<Object> f352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected agq f353c;
    protected final BeanProperty d;

    public afb(BeanProperty beanProperty, AnnotatedMember annotatedMember, JsonSerializer<?> jsonSerializer) {
        this.f351a = annotatedMember;
        this.d = beanProperty;
        this.f352b = jsonSerializer;
        if (jsonSerializer instanceof agq) {
            this.f353c = (agq) jsonSerializer;
        }
    }

    public void c(yt ytVar) {
        this.f351a.fixAccess(ytVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void d(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object value = this.f351a.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            serializerProvider.reportBadDefinition(this.d.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.f351a.getName(), value.getClass().getName()));
        }
        agq agqVar = this.f353c;
        if (agqVar != null) {
            agqVar.c((Map<?, ?>) value, jsonGenerator, serializerProvider);
        } else {
            this.f352b.serialize(value, jsonGenerator, serializerProvider);
        }
    }

    public void a(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyFilter propertyFilter) throws Exception {
        Object value = this.f351a.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            serializerProvider.reportBadDefinition(this.d.getType(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", this.f351a.getName(), value.getClass().getName()));
        }
        agq agqVar = this.f353c;
        if (agqVar != null) {
            agqVar.d(serializerProvider, jsonGenerator, obj, (Map) value, propertyFilter, null);
        } else {
            this.f352b.serialize(value, jsonGenerator, serializerProvider);
        }
    }

    public void a(SerializerProvider serializerProvider) throws ym {
        JsonSerializer<?> jsonSerializer = this.f352b;
        if (jsonSerializer instanceof ContextualSerializer) {
            JsonSerializer<?> jsonSerializerHandlePrimaryContextualization = serializerProvider.handlePrimaryContextualization(jsonSerializer, this.d);
            this.f352b = jsonSerializerHandlePrimaryContextualization;
            if (jsonSerializerHandlePrimaryContextualization instanceof agq) {
                this.f353c = (agq) jsonSerializerHandlePrimaryContextualization;
            }
        }
    }
}

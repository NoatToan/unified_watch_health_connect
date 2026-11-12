package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class qd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeanProperty f31380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotatedMember f31381b;
    public eud<Object> c;
    public MapSerializer d;

    public qd1(BeanProperty beanProperty, AnnotatedMember annotatedMember, eud<?> eudVar) {
        this.f31381b = annotatedMember;
        this.f31380a = beanProperty;
        this.c = eudVar;
        if (eudVar instanceof MapSerializer) {
            this.d = (MapSerializer) eudVar;
        }
    }

    public void a(SerializationConfig serializationConfig) {
        this.f31381b.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void b(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, odi odiVar) throws Exception {
        Object value = this.f31381b.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            wwlVar.reportBadDefinition(this.f31380a.getType(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", this.f31381b.getName(), value.getClass().getName()));
        }
        MapSerializer mapSerializer = this.d;
        if (mapSerializer != null) {
            mapSerializer.serializeFilteredAnyProperties(wwlVar, jsonGenerator, obj, (Map) value, odiVar, null);
        } else {
            this.c.serialize(value, jsonGenerator, wwlVar);
        }
    }

    public void c(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        Object value = this.f31381b.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            wwlVar.reportBadDefinition(this.f31380a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.f31381b.getName(), value.getClass().getName()));
        }
        MapSerializer mapSerializer = this.d;
        if (mapSerializer != null) {
            mapSerializer.serializeFields((Map) value, jsonGenerator, wwlVar);
        } else {
            this.c.serialize(value, jsonGenerator, wwlVar);
        }
    }

    public void d(wwl wwlVar) throws JsonMappingException {
        eud<?> eudVar = this.c;
        if (eudVar instanceof cj4) {
            eud<?> eudVarHandlePrimaryContextualization = wwlVar.handlePrimaryContextualization(eudVar, this.f31380a);
            this.c = eudVarHandlePrimaryContextualization;
            if (eudVarHandlePrimaryContextualization instanceof MapSerializer) {
                this.d = (MapSerializer) eudVarHandlePrimaryContextualization;
            }
        }
    }
}

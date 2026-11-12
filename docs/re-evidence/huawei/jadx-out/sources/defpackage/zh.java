package defpackage;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes21.dex */
public class zh extends SettableBeanProperty {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f54092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f54093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JacksonInject.b f54094c;
    protected final acp d;
    protected SettableBeanProperty e;

    protected zh(ys ysVar, JavaType javaType, ys ysVar2, TypeDeserializer typeDeserializer, Annotations annotations, acp acpVar, int i, JacksonInject.b bVar, yq yqVar) {
        super(ysVar, javaType, ysVar2, typeDeserializer, annotations, yqVar);
        this.d = acpVar;
        this.f54093b = i;
        this.f54094c = bVar;
        this.e = null;
    }

    public static zh a(ys ysVar, JavaType javaType, ys ysVar2, TypeDeserializer typeDeserializer, Annotations annotations, acp acpVar, int i, JacksonInject.b bVar, yq yqVar) {
        return new zh(ysVar, javaType, ysVar2, typeDeserializer, annotations, acpVar, i, bVar, yqVar);
    }

    protected zh(zh zhVar, ys ysVar) {
        super(zhVar, ysVar);
        this.d = zhVar.d;
        this.f54094c = zhVar.f54094c;
        this.e = zhVar.e;
        this.f54093b = zhVar.f54093b;
        this.f54092a = zhVar.f54092a;
    }

    protected zh(zh zhVar, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(zhVar, jsonDeserializer, nullValueProvider);
        this.d = zhVar.d;
        this.f54094c = zhVar.f54094c;
        this.e = zhVar.e;
        this.f54093b = zhVar.f54093b;
        this.f54092a = zhVar.f54092a;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(ys ysVar) {
        return new zh(this, ysVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new zh(this, jsonDeserializer, this._valueDeserializer == this._nullProvider ? jsonDeserializer : this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new zh(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(yi yiVar) {
        SettableBeanProperty settableBeanProperty = this.e;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(yiVar);
        }
    }

    public void e(SettableBeanProperty settableBeanProperty) {
        this.e = settableBeanProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void markAsIgnorable() {
        this.f54092a = true;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isIgnorable() {
        return this.f54092a;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        acp acpVar = this.d;
        if (acpVar == null) {
            return null;
        }
        return (A) acpVar.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this.f54093b;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        b();
        this.e.set(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        b();
        return this.e.setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        b();
        this.e.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        b();
        return this.e.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public yq getMetadata() {
        yq metadata = super.getMetadata();
        SettableBeanProperty settableBeanProperty = this.e;
        return settableBeanProperty != null ? metadata.c(settableBeanProperty.getMetadata().a()) : metadata;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object getInjectableValueId() {
        JacksonInject.b bVar = this.f54094c;
        if (bVar == null) {
            return null;
        }
        return bVar.c();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isInjectionOnly() {
        JacksonInject.b bVar = this.f54094c;
        return (bVar == null || bVar.e(true)) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public String toString() {
        return "[creator property, name " + ahw.e(getName()) + "; inject id '" + getInjectableValueId() + "']";
    }

    private final void b() throws IOException {
        if (this.e == null) {
            d(null, null);
        }
    }

    private void d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str = "No fallback setter/field defined for creator property " + ahw.e(getName());
        if (deserializationContext != null) {
            deserializationContext.reportBadDefinition(getType(), str);
            return;
        }
        throw abv.d(jsonParser, str, getType());
    }
}

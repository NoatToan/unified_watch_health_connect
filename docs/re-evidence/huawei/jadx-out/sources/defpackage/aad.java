package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes21.dex */
public class aad extends SettableBeanProperty {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SettableBeanProperty f142a;

    public aad(SettableBeanProperty settableBeanProperty, acv acvVar) {
        super(settableBeanProperty);
        this.f142a = settableBeanProperty;
        this._objectIdInfo = acvVar;
    }

    public aad(aad aadVar, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(aadVar, jsonDeserializer, nullValueProvider);
        this.f142a = aadVar.f142a;
        this._objectIdInfo = aadVar._objectIdInfo;
    }

    public aad(aad aadVar, ys ysVar) {
        super(aadVar, ysVar);
        this.f142a = aadVar.f142a;
        this._objectIdInfo = aadVar._objectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(ys ysVar) {
        return new aad(this, ysVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new aad(this, jsonDeserializer, this._valueDeserializer == this._nullProvider ? jsonDeserializer : this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new aad(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(yi yiVar) {
        SettableBeanProperty settableBeanProperty = this.f142a;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(yiVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f142a.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.f142a.getMember();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this.f142a.getCreatorIndex();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (zm e) {
            if (this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) {
                throw ym.from(jsonParser, "Unresolved forward reference but no identity info", e);
            }
            e.e().a((ReadableObjectId.Referring) new a(this, e, this._type.getRawClass(), obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        this.f142a.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this.f142a.setAndReturn(obj, obj2);
    }

    public static final class a extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final aad f144c;

        public a(aad aadVar, zm zmVar, Class<?> cls, Object obj) {
            super(zmVar, cls);
            this.f144c = aadVar;
            this.f143b = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (!hasId(obj)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
            }
            this.f144c.set(this.f143b, obj2);
        }
    }
}

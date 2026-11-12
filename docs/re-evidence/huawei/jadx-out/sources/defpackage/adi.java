package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase;

/* JADX INFO: loaded from: classes21.dex */
public class adi extends TypeSerializerBase {
    public adi(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        super(typeIdResolver, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public adi forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new adi(this._idResolver, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }
}

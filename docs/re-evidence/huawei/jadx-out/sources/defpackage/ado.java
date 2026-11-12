package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase;

/* JADX INFO: loaded from: classes21.dex */
public class ado extends TypeSerializerBase {
    protected final String d;

    public ado(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this.d = str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ado forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new ado(this._idResolver, beanProperty, this.d);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }
}

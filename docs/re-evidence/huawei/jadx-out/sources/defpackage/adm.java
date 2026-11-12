package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/* JADX INFO: loaded from: classes21.dex */
public class adm extends adi {
    protected final String e;

    public adm(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this.e = str;
    }

    @Override // defpackage.adi, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public adm forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new adm(this._idResolver, beanProperty, this.e);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return this.e;
    }

    @Override // defpackage.adi, com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.PROPERTY;
    }
}

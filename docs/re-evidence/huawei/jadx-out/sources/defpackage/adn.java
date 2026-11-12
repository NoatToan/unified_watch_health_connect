package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/* JADX INFO: loaded from: classes21.dex */
public class adn extends adm {
    public adn(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty, str);
    }

    @Override // defpackage.adm, defpackage.adi, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public adn forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new adn(this._idResolver, beanProperty, this.e);
    }

    @Override // defpackage.adm, defpackage.adi, com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }
}

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import defpackage.c4h;
import defpackage.ih2;
import defpackage.itd;
import defpackage.wwl;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    private static final long serialVersionUID = 1;

    public PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    @Deprecated
    public abstract void depositSchemaProperty(c4h c4hVar, wwl wwlVar) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException;

    public <A extends Annotation> A findAnnotation(Class<A> cls) {
        A a2 = (A) getAnnotation(cls);
        return a2 == null ? (A) getContextAnnotation(cls) : a2;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getContextAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract PropertyName getFullName();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ AnnotatedMember getMember();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, defpackage.ogg
    public abstract String getName();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ JavaType getType();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ PropertyName getWrapperName();

    public abstract void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception;

    public abstract void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception;

    public abstract void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception;

    public abstract void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception;

    public PropertyWriter(ih2 ih2Var) {
        super(ih2Var.getMetadata());
    }

    public PropertyWriter(PropertyWriter propertyWriter) {
        super(propertyWriter);
    }
}

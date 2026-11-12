package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes4.dex */
public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    public EnumSetSerializer(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (e5q) null, (eud<Object>) null);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public EnumSetSerializer _withValueTypeSerializer(e5q e5qVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<EnumSet<? extends Enum<?>>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud eudVar, Boolean bool) {
        return withResolved2(beanProperty, e5qVar, (eud<?>) eudVar, bool);
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(enumSetSerializer, beanProperty, e5qVar, eudVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int size = enumSet.size();
        if (size == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(enumSet, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M0(size);
        serializeContents(enumSet, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        eud<Object> eudVarFindValueSerializer = this._elementSerializer;
        for (Enum<?> r1 : enumSet) {
            if (eudVarFindValueSerializer == null) {
                eudVarFindValueSerializer = wwlVar.findValueSerializer(r1.getDeclaringClass(), this._property);
            }
            eudVarFindValueSerializer.serialize(r1, jsonGenerator, wwlVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<EnumSet<? extends Enum<?>>> withResolved2(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, e5qVar, eudVar, bool);
    }
}

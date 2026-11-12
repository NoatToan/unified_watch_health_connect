package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import defpackage.e5q;
import defpackage.eud;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    public IteratorSerializer(JavaType javaType, boolean z, e5q e5qVar) {
        super((Class<?>) Iterator.class, javaType, z, e5qVar, (eud<Object>) null);
    }

    public void _serializeDynamicContents(Iterator<?> it, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        e5q e5qVar = this._valueTypeSerializer;
        a aVar = this._dynamicSerializers;
        do {
            Object next = it.next();
            if (next == null) {
                wwlVar.defaultSerializeNull(jsonGenerator);
            } else {
                Class<?> cls = next.getClass();
                eud<Object> eudVarI = aVar.i(cls);
                if (eudVarI == null) {
                    eudVarI = this._elementType.hasGenericTypes() ? _findAndAddDynamic(aVar, wwlVar.constructSpecializedType(this._elementType, cls), wwlVar) : _findAndAddDynamic(aVar, cls, wwlVar);
                    aVar = this._dynamicSerializers;
                }
                if (e5qVar == null) {
                    eudVarI.serialize(next, jsonGenerator, wwlVar);
                } else {
                    eudVarI.serializeWithType(next, jsonGenerator, wwlVar, e5qVar);
                }
            }
        } while (it.hasNext());
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return new IteratorSerializer(this, this._property, e5qVar, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Iterator<?>> withResolved2(BeanProperty beanProperty, e5q e5qVar, eud eudVar, Boolean bool) {
        return withResolved(beanProperty, e5qVar, (eud<?>) eudVar, bool);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(iteratorSerializer, beanProperty, e5qVar, eudVar, bool);
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Iterator<?> it, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.L0();
        serializeContents(it, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (it.hasNext()) {
            eud<Object> eudVar = this._elementSerializer;
            if (eudVar == null) {
                _serializeDynamicContents(it, jsonGenerator, wwlVar);
                return;
            }
            e5q e5qVar = this._valueTypeSerializer;
            do {
                Object next = it.next();
                if (next == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else if (e5qVar == null) {
                    eudVar.serialize(next, jsonGenerator, wwlVar);
                } else {
                    eudVar.serializeWithType(next, jsonGenerator, wwlVar, e5qVar);
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<Iterator<?>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, e5qVar, eudVar, bool);
    }
}

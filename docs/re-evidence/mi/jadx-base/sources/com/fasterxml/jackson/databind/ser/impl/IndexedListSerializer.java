package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import defpackage.e5q;
import defpackage.eud;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    private static final long serialVersionUID = 1;

    public IndexedListSerializer(JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super((Class<?>) List.class, javaType, z, e5qVar, eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return new IndexedListSerializer(this, this._property, e5qVar, this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(List<?> list, JsonGenerator jsonGenerator, wwl wwlVar, eud<Object> eudVar) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        e5q e5qVar = this._valueTypeSerializer;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == null) {
                try {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } catch (Exception e) {
                    wrapAndThrow(wwlVar, e, list, i);
                }
            } else if (e5qVar == null) {
                eudVar.serialize(obj, jsonGenerator, wwlVar);
            } else {
                eudVar.serializeWithType(obj, jsonGenerator, wwlVar, e5qVar);
            }
        }
    }

    public void serializeTypedContents(List<?> list, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        try {
            e5q e5qVar = this._valueTypeSerializer;
            a aVar = this._dynamicSerializers;
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    eud<Object> eudVarI = aVar.i(cls);
                    if (eudVarI == null) {
                        eudVarI = this._elementType.hasGenericTypes() ? _findAndAddDynamic(aVar, wwlVar.constructSpecializedType(this._elementType, cls), wwlVar) : _findAndAddDynamic(aVar, cls, wwlVar);
                        aVar = this._dynamicSerializers;
                    }
                    eudVarI.serializeWithType(obj, jsonGenerator, wwlVar, e5qVar);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, list, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<List<?>> withResolved2(BeanProperty beanProperty, e5q e5qVar, eud eudVar, Boolean bool) {
        return withResolved(beanProperty, e5qVar, (eud<?>) eudVar, bool);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(indexedListSerializer, beanProperty, e5qVar, eudVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(List<?> list) {
        return list.size() == 1;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, List<?> list) {
        return list.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(List<?> list, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(list, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M0(size);
        serializeContents(list, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        eud<Object> eudVar = this._elementSerializer;
        if (eudVar != null) {
            serializeContentsUsing(list, jsonGenerator, wwlVar, eudVar);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(list, jsonGenerator, wwlVar);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        try {
            a aVar = this._dynamicSerializers;
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    eud<Object> eudVarI = aVar.i(cls);
                    if (eudVarI == null) {
                        eudVarI = this._elementType.hasGenericTypes() ? _findAndAddDynamic(aVar, wwlVar.constructSpecializedType(this._elementType, cls), wwlVar) : _findAndAddDynamic(aVar, cls, wwlVar);
                        aVar = this._dynamicSerializers;
                    }
                    eudVarI.serialize(obj, jsonGenerator, wwlVar);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, list, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<List<?>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, e5qVar, eudVar, bool);
    }
}

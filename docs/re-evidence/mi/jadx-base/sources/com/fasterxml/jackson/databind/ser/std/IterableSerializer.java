package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import defpackage.e5q;
import defpackage.eud;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    public IterableSerializer(JavaType javaType, boolean z, e5q e5qVar) {
        super((Class<?>) Iterable.class, javaType, z, e5qVar, (eud<Object>) null);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return new IterableSerializer(this, this._property, e5qVar, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Iterable<?>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud eudVar, Boolean bool) {
        return withResolved2(beanProperty, e5qVar, (eud<?>) eudVar, bool);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(iterableSerializer, beanProperty, e5qVar, eudVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Iterable<?> iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Iterable<?> iterable, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE) && hasSingleElement(iterable)) {
            serializeContents(iterable, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.L0();
        serializeContents(iterable, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Iterable<?> iterable, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        eud<Object> eudVar;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            e5q e5qVar = this._valueTypeSerializer;
            Class<?> cls = null;
            eud<Object> eudVarFindValueSerializer = null;
            do {
                Object next = it.next();
                if (next == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    eud<Object> eudVar2 = this._elementSerializer;
                    if (eudVar2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            eudVarFindValueSerializer = wwlVar.findValueSerializer(cls2, this._property);
                            cls = cls2;
                        }
                        eudVar = eudVarFindValueSerializer;
                    } else {
                        eudVar = eudVarFindValueSerializer;
                        eudVarFindValueSerializer = eudVar2;
                    }
                    if (e5qVar == null) {
                        eudVarFindValueSerializer.serialize(next, jsonGenerator, wwlVar);
                    } else {
                        eudVarFindValueSerializer.serializeWithType(next, jsonGenerator, wwlVar, e5qVar);
                    }
                    eudVarFindValueSerializer = eudVar;
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Iterable<?>> withResolved2(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        return new IterableSerializer(this, beanProperty, e5qVar, eudVar, bool);
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.a;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    private static final long serialVersionUID = 1;

    public CollectionSerializer(JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super((Class<?>) Collection.class, javaType, z, e5qVar, eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return new CollectionSerializer(this, this._property, e5qVar, (eud<?>) this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, wwl wwlVar, eud<Object> eudVar) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            e5q e5qVar = this._valueTypeSerializer;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        wwlVar.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e) {
                        wrapAndThrow(wwlVar, e, collection, i);
                    }
                } else if (e5qVar == null) {
                    eudVar.serialize(next, jsonGenerator, wwlVar);
                } else {
                    eudVar.serializeWithType(next, jsonGenerator, wwlVar, e5qVar);
                }
                i++;
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Collection<?>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud eudVar, Boolean bool) {
        return withResolved2(beanProperty, e5qVar, (eud<?>) eudVar, bool);
    }

    @Deprecated
    public CollectionSerializer(JavaType javaType, boolean z, e5q e5qVar, BeanProperty beanProperty, eud<Object> eudVar) {
        this(javaType, z, e5qVar, eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Collection<?> collection) {
        return collection.size() == 1;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M0(size);
        serializeContents(collection, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.M(collection);
        eud<Object> eudVar = this._elementSerializer;
        if (eudVar != null) {
            serializeContentsUsing(collection, jsonGenerator, wwlVar, eudVar);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            a aVar = this._dynamicSerializers;
            e5q e5qVar = this._valueTypeSerializer;
            int i = 0;
            do {
                try {
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
                    i++;
                } catch (Exception e) {
                    wrapAndThrow(wwlVar, e, collection, i);
                    return;
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Collection<?>> withResolved2(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, e5qVar, eudVar, bool);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(collectionSerializer, beanProperty, e5qVar, eudVar, bool);
    }
}

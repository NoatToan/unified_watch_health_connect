package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.b;
import defpackage.esd;
import defpackage.q4q;
import defpackage.z1h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    private static final long serialVersionUID = 1;

    public ArrayBlockingQueueDeserializer(JavaType javaType, esd<Object> esdVar, q4q q4qVar, b bVar) {
        super(javaType, esdVar, q4qVar, bVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public /* bridge */ /* synthetic */ CollectionDeserializer withResolved(esd esdVar, esd esdVar2, q4q q4qVar, z1h z1hVar, Boolean bool) {
        return withResolved((esd<?>) esdVar, (esd<?>) esdVar2, q4qVar, z1hVar, bool);
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, esd<Object> esdVar, q4q q4qVar, b bVar, esd<Object> esdVar2, z1h z1hVar, Boolean bool) {
        super(javaType, esdVar, q4qVar, bVar, esdVar2, z1hVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, defpackage.esd
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (collection != null) {
            return super.deserialize(jsonParser, deserializationContext, collection);
        }
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext, new ArrayBlockingQueue(1));
        }
        Collection<Object> collectionDeserialize = super.deserialize(jsonParser, deserializationContext, (Collection<Object>) new ArrayList());
        return new ArrayBlockingQueue(collectionDeserialize.size(), false, collectionDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public ArrayBlockingQueueDeserializer withResolved(esd<?> esdVar, esd<?> esdVar2, q4q q4qVar, z1h z1hVar, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this._containerType, esdVar2, q4qVar, this._valueInstantiator, esdVar, z1hVar, bool);
    }

    public ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer) {
        super(arrayBlockingQueueDeserializer);
    }
}

package defpackage;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: loaded from: classes4.dex */
public interface oz5 {

    public static class a implements oz5 {
        @Override // defpackage.oz5
        public esd<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.oz5
        public esd<?> findTreeNodeDeserializer(Class<? extends zsd> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
            return null;
        }
    }

    esd<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException;

    esd<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException;

    esd<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException;

    esd<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException;

    esd<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException;

    esd<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException;

    esd<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException;

    esd<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException;

    esd<?> findTreeNodeDeserializer(Class<? extends zsd> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException;
}

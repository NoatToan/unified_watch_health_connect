package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: loaded from: classes4.dex */
public interface xwl {

    public static class a implements xwl {
        @Override // defpackage.xwl
        public eud<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
            return null;
        }

        @Override // defpackage.xwl
        public eud<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
            return null;
        }

        @Override // defpackage.xwl
        public eud<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
            return null;
        }

        @Override // defpackage.xwl
        public eud<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, fh2 fh2Var, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2) {
            return null;
        }

        @Override // defpackage.xwl
        public eud<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, fh2 fh2Var, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2) {
            return null;
        }

        @Override // defpackage.xwl
        public eud<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
            return findSerializer(serializationConfig, referenceType, fh2Var);
        }

        @Override // defpackage.xwl
        public eud<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var) {
            return null;
        }
    }

    eud<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar);

    eud<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar);

    eud<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar);

    eud<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, fh2 fh2Var, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2);

    eud<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, fh2 fh2Var, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2);

    eud<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar);

    eud<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var);
}

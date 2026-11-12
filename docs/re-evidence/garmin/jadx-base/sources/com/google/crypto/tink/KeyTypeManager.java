package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import n23.j;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
@Alpha
public abstract class KeyTypeManager<KeyProtoT extends MessageLite> {
    private final Class<KeyProtoT> clazz;
    private final Map<Class<?>, PrimitiveFactory<?, KeyProtoT>> factories;
    private final Class<?> firstPrimitiveClass;

    public static abstract class KeyFactory<KeyFormatProtoT extends MessageLite, KeyT> {
        private final Class<KeyFormatProtoT> clazz;

        public KeyFactory(Class<KeyFormatProtoT> cls) {
            this.clazz = cls;
        }

        public abstract KeyT createKey(KeyFormatProtoT keyformatprotot);

        public KeyT deriveKey(KeyFormatProtoT keyformatprotot, InputStream inputStream) throws GeneralSecurityException {
            throw new GeneralSecurityException("deriveKey not implemented for key of type " + this.clazz.toString());
        }

        public final Class<KeyFormatProtoT> getKeyFormatClass() {
            return this.clazz;
        }

        public abstract KeyFormatProtoT parseKeyFormat(ByteString byteString);

        public abstract void validateKeyFormat(KeyFormatProtoT keyformatprotot);
    }

    public static abstract class PrimitiveFactory<PrimitiveT, KeyT> {
        private final Class<PrimitiveT> clazz;

        public PrimitiveFactory(Class<PrimitiveT> cls) {
            this.clazz = cls;
        }

        public abstract PrimitiveT getPrimitive(KeyT keyt);

        public final Class<PrimitiveT> getPrimitiveClass() {
            return this.clazz;
        }
    }

    @SafeVarargs
    public KeyTypeManager(Class<KeyProtoT> cls, PrimitiveFactory<?, KeyProtoT>... primitiveFactoryArr) {
        this.clazz = cls;
        HashMap map = new HashMap();
        for (PrimitiveFactory<?, KeyProtoT> primitiveFactory : primitiveFactoryArr) {
            if (map.containsKey(primitiveFactory.getPrimitiveClass())) {
                j.A(primitiveFactory.getPrimitiveClass().getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                throw null;
            }
            map.put(primitiveFactory.getPrimitiveClass(), primitiveFactory);
        }
        if (primitiveFactoryArr.length > 0) {
            this.firstPrimitiveClass = primitiveFactoryArr[0].getPrimitiveClass();
        } else {
            this.firstPrimitiveClass = Void.class;
        }
        this.factories = Collections.unmodifiableMap(map);
    }

    public final Class<?> firstSupportedPrimitiveClass() {
        return this.firstPrimitiveClass;
    }

    public final Class<KeyProtoT> getKeyClass() {
        return this.clazz;
    }

    public abstract String getKeyType();

    public final <P> P getPrimitive(KeyProtoT keyprotot, Class<P> cls) {
        PrimitiveFactory<?, KeyProtoT> primitiveFactory = this.factories.get(cls);
        if (primitiveFactory != null) {
            return (P) primitiveFactory.getPrimitive(keyprotot);
        }
        e.r("Requested primitive class ", cls.getCanonicalName(), " not supported.");
        return null;
    }

    public abstract int getVersion();

    public KeyFactory<?, KeyProtoT> keyFactory() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract KeyData.KeyMaterialType keyMaterialType();

    public abstract KeyProtoT parseKey(ByteString byteString);

    public final Set<Class<?>> supportedPrimitives() {
        return this.factories.keySet();
    }

    public abstract void validateKey(KeyProtoT keyprotot);
}

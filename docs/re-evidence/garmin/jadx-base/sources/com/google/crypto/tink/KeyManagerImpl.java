package com.google.crypto.tink;

import androidx.room.a0;
import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Alpha
public class KeyManagerImpl<PrimitiveT, KeyProtoT extends MessageLite> implements KeyManager<PrimitiveT> {
    private final KeyTypeManager<KeyProtoT> keyTypeManager;
    private final Class<PrimitiveT> primitiveClass;

    public static class KeyFactoryHelper<KeyFormatProtoT extends MessageLite, KeyProtoT extends MessageLite> {
        final KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory;

        public KeyFactoryHelper(KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) {
            this.keyFactory = keyFactory;
        }

        private KeyProtoT validateCreate(KeyFormatProtoT keyformatprotot) {
            this.keyFactory.validateKeyFormat(keyformatprotot);
            return this.keyFactory.createKey(keyformatprotot);
        }

        public KeyProtoT castValidateCreate(MessageLite messageLite) {
            return (KeyProtoT) validateCreate((MessageLite) KeyManagerImpl.castOrThrowSecurityException(messageLite, "Expected proto of type ".concat(this.keyFactory.getKeyFormatClass().getName()), this.keyFactory.getKeyFormatClass()));
        }

        public KeyProtoT parseValidateCreate(ByteString byteString) {
            return (KeyProtoT) validateCreate(this.keyFactory.parseKeyFormat(byteString));
        }
    }

    public KeyManagerImpl(KeyTypeManager<KeyProtoT> keyTypeManager, Class<PrimitiveT> cls) {
        if (!keyTypeManager.supportedPrimitives().contains(cls) && !Void.class.equals(cls)) {
            h.s(a0.j("Given internalKeyMananger ", keyTypeManager.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.keyTypeManager = keyTypeManager;
        this.primitiveClass = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <CastedT> CastedT castOrThrowSecurityException(Object obj, String str, Class<CastedT> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        a.t(str);
        return null;
    }

    private KeyFactoryHelper<?, KeyProtoT> keyFactoryHelper() {
        return new KeyFactoryHelper<>(this.keyTypeManager.keyFactory());
    }

    private PrimitiveT validateKeyAndGetPrimitive(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.primitiveClass)) {
            a.t("Cannot create a primitive for Void");
            return null;
        }
        this.keyTypeManager.validateKey(keyprotot);
        return (PrimitiveT) this.keyTypeManager.getPrimitive(keyprotot, this.primitiveClass);
    }

    @Override // com.google.crypto.tink.KeyManager
    public final boolean doesSupport(String str) {
        return str.equals(getKeyType());
    }

    @Override // com.google.crypto.tink.KeyManager
    public final String getKeyType() {
        return this.keyTypeManager.getKeyType();
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(ByteString byteString) throws GeneralSecurityException {
        try {
            return validateKeyAndGetPrimitive(this.keyTypeManager.parseKey(byteString));
        } catch (InvalidProtocolBufferException e4) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.keyTypeManager.getKeyClass().getName()), e4);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final Class<PrimitiveT> getPrimitiveClass() {
        return this.primitiveClass;
    }

    @Override // com.google.crypto.tink.KeyManager
    public int getVersion() {
        return this.keyTypeManager.getVersion();
    }

    @Override // com.google.crypto.tink.KeyManager
    public final MessageLite newKey(ByteString byteString) throws GeneralSecurityException {
        try {
            return keyFactoryHelper().parseValidateCreate(byteString);
        } catch (InvalidProtocolBufferException e4) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.keyTypeManager.keyFactory().getKeyFormatClass().getName()), e4);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final KeyData newKeyData(ByteString byteString) throws GeneralSecurityException {
        try {
            return KeyData.newBuilder().setTypeUrl(getKeyType()).setValue(keyFactoryHelper().parseValidateCreate(byteString).toByteString()).setKeyMaterialType(this.keyTypeManager.keyMaterialType()).build();
        } catch (InvalidProtocolBufferException e4) {
            throw new GeneralSecurityException("Unexpected proto", e4);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(MessageLite messageLite) {
        return validateKeyAndGetPrimitive((MessageLite) castOrThrowSecurityException(messageLite, "Expected proto of type ".concat(this.keyTypeManager.getKeyClass().getName()), this.keyTypeManager.getKeyClass()));
    }

    @Override // com.google.crypto.tink.KeyManager
    public final MessageLite newKey(MessageLite messageLite) {
        return keyFactoryHelper().castValidateCreate(messageLite);
    }
}

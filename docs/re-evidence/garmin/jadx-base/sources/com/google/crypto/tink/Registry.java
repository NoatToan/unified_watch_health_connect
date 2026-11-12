package com.google.crypto.tink;

import am.j;
import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final ConcurrentMap<String, KeyManagerContainer> keyManagerMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> primitiveWrapperMap = new ConcurrentHashMap();

    public interface KeyDeriverContainer {
        KeyData deriveKey(ByteString byteString, InputStream inputStream);
    }

    public interface KeyManagerContainer {
        Class<?> getImplementingClass();

        <P> KeyManager<P> getKeyManager(Class<P> cls);

        KeyManager<?> getUntypedKeyManager();

        MessageLite parseKey(ByteString byteString);

        Class<?> publicKeyManagerClassOrNull();

        Set<Class<?>> supportedPrimitives();
    }

    private Registry() {
    }

    @Deprecated
    public static synchronized void addCatalogue(String str, Catalogue<?> catalogue) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
            ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
            Locale locale = Locale.US;
            if (concurrentMap.containsKey(str.toLowerCase(locale))) {
                if (!catalogue.getClass().equals(concurrentMap.get(str.toLowerCase(locale)).getClass())) {
                    logger.warning("Attempted overwrite of a catalogueName catalogue for name ".concat(str));
                    throw new GeneralSecurityException("catalogue for name " + str + " has been already registered");
                }
            }
            concurrentMap.put(str.toLowerCase(locale), catalogue);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }

    private static <P> KeyManagerContainer createContainerFor(final KeyManager<P> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.1
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return keyManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) {
                if (keyManager.getPrimitiveClass().equals(cls)) {
                    return keyManager;
                }
                throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                return keyManager;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return Collections.singleton(keyManager.getPrimitiveClass());
            }
        };
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.4
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString byteString, InputStream inputStream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    MessageLite keyFormat = keyFactory.parseKeyFormat(byteString);
                    keyFactory.validateKeyFormat(keyFormat);
                    return (MessageLite) keyFactory.deriveKey(keyFormat, inputStream);
                } catch (InvalidProtocolBufferException e4) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e4);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException {
                return KeyData.newBuilder().setTypeUrl(keyTypeManager.getKeyType()).setValue(deriveKeyWithFactory(byteString, inputStream, keyTypeManager.keyFactory()).toByteString()).setKeyMaterialType(keyTypeManager.keyMaterialType()).build();
            }
        };
    }

    private static <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> KeyManagerContainer createPrivateKeyContainerFor(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> keyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.3
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return privateKeyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                try {
                    return new PrivateKeyManagerImpl(privateKeyTypeManager, keyTypeManager, cls);
                } catch (IllegalArgumentException e4) {
                    throw new GeneralSecurityException("Primitive type not supported", e4);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                PrivateKeyTypeManager privateKeyTypeManager2 = privateKeyTypeManager;
                return new PrivateKeyManagerImpl(privateKeyTypeManager2, keyTypeManager, privateKeyTypeManager2.firstSupportedPrimitiveClass());
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.crypto.tink.shaded.protobuf.MessageLite] */
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) {
                ?? key = privateKeyTypeManager.parseKey(byteString);
                privateKeyTypeManager.validateKey(key);
                return key;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return keyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return privateKeyTypeManager.supportedPrimitives();
            }
        };
    }

    public static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream inputStream) {
        String typeUrl;
        ConcurrentMap<String, KeyDeriverContainer> concurrentMap;
        typeUrl = keyTemplate.getTypeUrl();
        concurrentMap = keyDeriverMap;
        if (!concurrentMap.containsKey(typeUrl)) {
            throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
        }
        return concurrentMap.get(typeUrl).deriveKey(keyTemplate.getValue(), inputStream);
    }

    private static synchronized void ensureKeyManagerInsertable(String str, Class<?> cls, boolean z14) {
        ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
        if (concurrentMap.containsKey(str)) {
            KeyManagerContainer keyManagerContainer = concurrentMap.get(str);
            if (keyManagerContainer.getImplementingClass().equals(cls)) {
                if (z14 && !newKeyAllowedMap.get(str).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            logger.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + keyManagerContainer.getImplementingClass().getName() + ", cannot be re-registered with " + cls.getName());
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String str) throws GeneralSecurityException {
        if (str == null) {
            h.s("catalogueName must be non-null.");
            return null;
        }
        ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
        Locale locale = Locale.US;
        Catalogue<?> catalogue = concurrentMap.get(str.toLowerCase(locale));
        if (catalogue != null) {
            return catalogue;
        }
        String strM = j.m("no catalogue found for ", str, ". ");
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strM = strM.concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strM = strM.concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strM = strM.concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strM = strM.concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strM = strM.concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strM = strM.concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strM = strM.concat("Maybe call TinkConfig.register().");
        }
        a.t(strM);
        return null;
    }

    public static Class<?> getInputPrimitive(Class<?> cls) {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(cls);
        if (primitiveWrapper == null) {
            return null;
        }
        return primitiveWrapper.getInputPrimitiveClass();
    }

    public static <P> KeyManager<P> getKeyManager(String str, Class<P> cls) {
        return getKeyManagerInternal(str, (Class) checkNotNull(cls));
    }

    private static synchronized KeyManagerContainer getKeyManagerContainerOrThrow(String str) {
        ConcurrentMap<String, KeyManagerContainer> concurrentMap;
        concurrentMap = keyManagerMap;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return concurrentMap.get(str);
    }

    private static <P> KeyManager<P> getKeyManagerInternal(String str, Class<P> cls) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainerOrThrow = getKeyManagerContainerOrThrow(str);
        if (cls == null) {
            return (KeyManager<P>) keyManagerContainerOrThrow.getUntypedKeyManager();
        }
        if (keyManagerContainerOrThrow.supportedPrimitives().contains(cls)) {
            return keyManagerContainerOrThrow.getKeyManager(cls);
        }
        StringBuilder sb3 = new StringBuilder("Primitive type ");
        androidx.core.view.j.o(cls, sb3, " not supported by key manager of type ");
        sb3.append(keyManagerContainerOrThrow.getImplementingClass());
        sb3.append(", supported primitives: ");
        sb3.append(toCommaSeparatedString(keyManagerContainerOrThrow.supportedPrimitives()));
        throw new GeneralSecurityException(sb3.toString());
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    private static <P> P getPrimitiveInternal(String str, MessageLite messageLite, Class<P> cls) {
        return (P) getKeyManagerInternal(str, cls).getPrimitive(messageLite);
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, KeyManager<P> keyManager, Class<P> cls) {
        return getPrimitivesInternal(keysetHandle, keyManager, (Class) checkNotNull(cls));
    }

    private static <P> PrimitiveSet<P> getPrimitivesInternal(KeysetHandle keysetHandle, KeyManager<P> keyManager, Class<P> cls) throws GeneralSecurityException {
        Util.validateKeyset(keysetHandle.getKeyset());
        PrimitiveSet<P> primitiveSetNewPrimitiveSet = PrimitiveSet.newPrimitiveSet(cls);
        for (Keyset.Key key : keysetHandle.getKeyset().getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                PrimitiveSet.Entry<P> entryAddPrimitive = primitiveSetNewPrimitiveSet.addPrimitive((keyManager == null || !keyManager.doesSupport(key.getKeyData().getTypeUrl())) ? (P) getPrimitiveInternal(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), cls) : keyManager.getPrimitive(key.getKeyData().getValue()), key);
                if (key.getKeyId() == keysetHandle.getKeyset().getPrimaryKeyId()) {
                    primitiveSetNewPrimitiveSet.setPrimary(entryAddPrimitive);
                }
            }
        }
        return primitiveSetNewPrimitiveSet;
    }

    public static KeyData getPublicKeyData(String str, ByteString byteString) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(str);
        if (keyManager instanceof PrivateKeyManager) {
            return ((PrivateKeyManager) keyManager).getPublicKeyData(byteString);
        }
        throw new GeneralSecurityException(j.m("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static KeyManager<?> getUntypedKeyManager(String str) {
        return getKeyManagerContainerOrThrow(str).getUntypedKeyManager();
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeyManager<?> untypedKeyManager;
        untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (!newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return untypedKeyManager.newKey(keyTemplate.getValue());
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeyManager<?> untypedKeyManager;
        untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (!newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return untypedKeyManager.newKeyData(keyTemplate.getValue());
    }

    public static MessageLite parseKeyData(KeyData keyData) {
        return getKeyManagerContainerOrThrow(keyData.getTypeUrl()).parseKey(keyData.getValue());
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager, boolean z14) {
        Class<?> clsPublicKeyManagerClassOrNull;
        try {
            if (privateKeyTypeManager == null || keyTypeManager == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            String keyType = privateKeyTypeManager.getKeyType();
            String keyType2 = keyTypeManager.getKeyType();
            ensureKeyManagerInsertable(keyType, privateKeyTypeManager.getClass(), z14);
            ensureKeyManagerInsertable(keyType2, keyTypeManager.getClass(), false);
            if (keyType.equals(keyType2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (concurrentMap.containsKey(keyType) && (clsPublicKeyManagerClassOrNull = concurrentMap.get(keyType).publicKeyManagerClassOrNull()) != null && !clsPublicKeyManagerClassOrNull.equals(keyTypeManager.getClass())) {
                logger.warning("Attempted overwrite of a registered key manager for key type " + keyType + " with inconsistent public key type " + keyType2);
                throw new GeneralSecurityException("public key manager corresponding to " + privateKeyTypeManager.getClass().getName() + " is already registered with " + clsPublicKeyManagerClassOrNull.getName() + ", cannot be re-registered with " + keyTypeManager.getClass().getName());
            }
            if (!concurrentMap.containsKey(keyType) || concurrentMap.get(keyType).publicKeyManagerClassOrNull() == null) {
                concurrentMap.put(keyType, createPrivateKeyContainerFor(privateKeyTypeManager, keyTypeManager));
                keyDeriverMap.put(keyType, createDeriverFor(privateKeyTypeManager));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = newKeyAllowedMap;
            concurrentMap2.put(keyType, Boolean.valueOf(z14));
            if (!concurrentMap.containsKey(keyType2)) {
                concurrentMap.put(keyType2, createContainerFor(keyTypeManager));
            }
            concurrentMap2.put(keyType2, Boolean.FALSE);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(KeyTypeManager<KeyProtoT> keyTypeManager, boolean z14) {
        try {
            if (keyTypeManager == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = keyTypeManager.getKeyType();
            ensureKeyManagerInsertable(keyType, keyTypeManager.getClass(), z14);
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (!concurrentMap.containsKey(keyType)) {
                concurrentMap.put(keyType, createContainerFor(keyTypeManager));
                keyDeriverMap.put(keyType, createDeriverFor(keyTypeManager));
            }
            newKeyAllowedMap.put(keyType, Boolean.valueOf(z14));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(PrimitiveWrapper<B, P> primitiveWrapper) {
        try {
            if (primitiveWrapper == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> primitiveClass = primitiveWrapper.getPrimitiveClass();
            ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> concurrentMap = primitiveWrapperMap;
            if (concurrentMap.containsKey(primitiveClass)) {
                PrimitiveWrapper<?, ?> primitiveWrapper2 = concurrentMap.get(primitiveClass);
                if (!primitiveWrapper.getClass().equals(primitiveWrapper2.getClass())) {
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + primitiveClass);
                    throw new GeneralSecurityException("SetWrapper for primitive (" + primitiveClass.getName() + ") is already registered to be " + primitiveWrapper2.getClass().getName() + ", cannot be re-registered with " + primitiveWrapper.getClass().getName());
                }
            }
            concurrentMap.put(primitiveClass, primitiveWrapper);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized void reset() {
        keyManagerMap.clear();
        keyDeriverMap.clear();
        newKeyAllowedMap.clear();
        catalogueMap.clear();
        primitiveWrapperMap.clear();
    }

    private static String toCommaSeparatedString(Set<Class<?>> set) {
        StringBuilder sb3 = new StringBuilder();
        boolean z14 = true;
        for (Class<?> cls : set) {
            if (!z14) {
                sb3.append(", ");
            }
            sb3.append(cls.getCanonicalName());
            z14 = false;
        }
        return sb3.toString();
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> cls) throws GeneralSecurityException {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(cls);
        if (primitiveWrapper == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(primitiveSet.getPrimitiveClass().getName()));
        }
        if (primitiveWrapper.getInputPrimitiveClass().equals(primitiveSet.getPrimitiveClass())) {
            return (P) primitiveWrapper.wrap(primitiveSet);
        }
        StringBuilder sb3 = new StringBuilder("Wrong input primitive class, expected ");
        sb3.append(primitiveWrapper.getInputPrimitiveClass());
        Class<B> primitiveClass = primitiveSet.getPrimitiveClass();
        sb3.append(", got ");
        sb3.append(primitiveClass);
        throw new GeneralSecurityException(sb3.toString());
    }

    private static <KeyProtoT extends MessageLite> KeyManagerContainer createContainerFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.2
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return keyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                try {
                    return new KeyManagerImpl(keyTypeManager, cls);
                } catch (IllegalArgumentException e4) {
                    throw new GeneralSecurityException("Primitive type not supported", e4);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                KeyTypeManager keyTypeManager2 = keyTypeManager;
                return new KeyManagerImpl(keyTypeManager2, keyTypeManager2.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) {
                MessageLite key = keyTypeManager.parseKey(byteString);
                keyTypeManager.validateKey(key);
                return key;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return keyTypeManager.supportedPrimitives();
            }
        };
    }

    private static <P> P getPrimitiveInternal(String str, ByteString byteString, Class<P> cls) {
        return (P) getKeyManagerInternal(str, cls).getPrimitive(byteString);
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String str) {
        return getKeyManagerInternal(str, null);
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, Class<P> cls) {
        return getPrimitives(keysetHandle, null, cls);
    }

    public static <P> P getPrimitive(String str, MessageLite messageLite, Class<P> cls) {
        return (P) getPrimitiveInternal(str, messageLite, (Class) checkNotNull(cls));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, ByteString byteString) {
        return (P) getPrimitiveInternal(str, byteString, (Class) null);
    }

    public static <P> P getPrimitive(String str, ByteString byteString, Class<P> cls) {
        return (P) getPrimitiveInternal(str, byteString, (Class) checkNotNull(cls));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, byte[] bArr) {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr));
    }

    public static <P> P getPrimitive(String str, byte[] bArr, Class<P> cls) {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr), cls);
    }

    @Deprecated
    public static <P> P getPrimitive(String str, MessageLite messageLite) {
        return (P) getPrimitiveInternal(str, messageLite, (Class) null);
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> cls) {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), cls);
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager, boolean z14) {
        try {
            if (keyManager != null) {
                String keyType = keyManager.getKeyType();
                ensureKeyManagerInsertable(keyType, keyManager.getClass(), z14);
                keyManagerMap.putIfAbsent(keyType, createContainerFor(keyManager));
                newKeyAllowedMap.put(keyType, Boolean.valueOf(z14));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized MessageLite newKey(String str, MessageLite messageLite) {
        KeyManager keyManager;
        keyManager = getKeyManager(str);
        if (newKeyAllowedMap.get(str).booleanValue()) {
        } else {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + str);
        }
        return keyManager.newKey(messageLite);
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) {
        return newKeyData(keyTemplate.getProto());
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager) {
        registerKeyManager((KeyManager) keyManager, true);
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager) {
        registerKeyManager(str, keyManager, true);
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager, boolean z14) {
        try {
            if (keyManager != null) {
                if (str.equals(keyManager.getKeyType())) {
                    registerKeyManager(keyManager, z14);
                } else {
                    throw new GeneralSecurityException("Manager does not support key type " + str + ".");
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }
}

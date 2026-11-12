package com.google.crypto.tink.integration.android;

import am.j;
import android.content.Context;
import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";
    private KeysetManager keysetManager;
    private final Aead masterKey;
    private final KeysetWriter writer;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AndroidKeysetManager(Builder builder) {
        this.writer = builder.writer;
        this.masterKey = builder.masterKey;
        this.keysetManager = builder.keysetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i14 == 1) {
            return KeyTemplate.OutputPrefixType.TINK;
        }
        if (i14 == 2) {
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        if (i14 == 3) {
            return KeyTemplate.OutputPrefixType.RAW;
        }
        if (i14 == 4) {
            return KeyTemplate.OutputPrefixType.CRUNCHY;
        }
        h.s("Unknown output prefix type");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    private boolean shouldUseKeystore() {
        return this.masterKey != null && isAtLeastM();
    }

    private void write(KeysetManager keysetManager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                keysetManager.getKeysetHandle().write(this.writer, this.masterKey);
            } else {
                CleartextKeysetHandle.write(keysetManager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e4) {
            throw new GeneralSecurityException(e4);
        }
    }

    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }

    public synchronized AndroidKeysetManager delete(int i14) {
        KeysetManager keysetManagerDelete = this.keysetManager.delete(i14);
        this.keysetManager = keysetManagerDelete;
        write(keysetManagerDelete);
        return this;
    }

    public synchronized AndroidKeysetManager destroy(int i14) {
        KeysetManager keysetManagerDestroy = this.keysetManager.destroy(i14);
        this.keysetManager = keysetManagerDestroy;
        write(keysetManagerDestroy);
        return this;
    }

    public synchronized AndroidKeysetManager disable(int i14) {
        KeysetManager keysetManagerDisable = this.keysetManager.disable(i14);
        this.keysetManager = keysetManagerDisable;
        write(keysetManagerDisable);
        return this;
    }

    public synchronized AndroidKeysetManager enable(int i14) {
        KeysetManager keysetManagerEnable = this.keysetManager.enable(i14);
        this.keysetManager = keysetManagerEnable;
        write(keysetManagerEnable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() {
        return this.keysetManager.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    @Deprecated
    public synchronized AndroidKeysetManager promote(int i14) {
        return setPrimary(i14);
    }

    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeysetManager keysetManagerRotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = keysetManagerRotate;
        write(keysetManagerRotate);
        return this;
    }

    public synchronized AndroidKeysetManager setPrimary(int i14) {
        KeysetManager primary = this.keysetManager.setPrimary(i14);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }

    public /* synthetic */ AndroidKeysetManager(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public static final class Builder {
        private KeysetManager keysetManager;
        private KeysetReader reader = null;
        private KeysetWriter writer = null;
        private String masterKeyUri = null;
        private Aead masterKey = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;
        private KeyStore keyStore = null;

        private KeysetManager read() {
            Aead aead = this.masterKey;
            if (aead != null) {
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(this.reader, aead));
                } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                    String unused2 = AndroidKeysetManager.TAG;
                }
            }
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(this.reader));
        }

        private KeysetManager readOrGenerateNewKeyset() throws GeneralSecurityException {
            try {
                return read();
            } catch (FileNotFoundException unused) {
                String unused2 = AndroidKeysetManager.TAG;
                if (this.keyTemplate == null) {
                    a.t("cannot read or generate keyset");
                    return null;
                }
                KeysetManager keysetManagerAdd = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
                KeysetManager primary = keysetManagerAdd.setPrimary(keysetManagerAdd.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
                if (this.masterKey != null) {
                    primary.getKeysetHandle().write(this.writer, this.masterKey);
                } else {
                    CleartextKeysetHandle.write(primary.getKeysetHandle(), this.writer);
                }
                return primary;
            }
        }

        private Aead readOrGenerateNewMasterKey() throws KeyStoreException {
            if (!AndroidKeysetManager.isAtLeastM()) {
                String unused = AndroidKeysetManager.TAG;
                return null;
            }
            AndroidKeystoreKmsClient androidKeystoreKmsClientBuild = this.keyStore != null ? new AndroidKeystoreKmsClient.Builder().setKeyStore(this.keyStore).build() : new AndroidKeystoreKmsClient();
            boolean zHasKey = androidKeystoreKmsClientBuild.hasKey(this.masterKeyUri);
            if (!zHasKey) {
                try {
                    AndroidKeystoreKmsClient.generateNewAeadKey(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException unused2) {
                    String unused3 = AndroidKeysetManager.TAG;
                    return null;
                }
            }
            try {
                return androidKeystoreKmsClientBuild.getAead(this.masterKeyUri);
            } catch (GeneralSecurityException | ProviderException e4) {
                if (zHasKey) {
                    throw new KeyStoreException(j.m("the master key ", this.masterKeyUri, " exists but is unusable"), e4);
                }
                String unused4 = AndroidKeysetManager.TAG;
                return null;
            }
        }

        public synchronized AndroidKeysetManager build() {
            try {
                if (this.masterKeyUri != null) {
                    this.masterKey = readOrGenerateNewMasterKey();
                }
                this.keysetManager = readOrGenerateNewKeyset();
            } catch (Throwable th3) {
                throw th3;
            }
            return new AndroidKeysetManager(this, null);
        }

        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        public Builder withKeyStore(KeyStore keyStore) {
            this.keyStore = keyStore;
            return this;
        }

        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            this.keyTemplate = KeyTemplate.create(keyTemplate.getTypeUrl(), keyTemplate.getValue().toByteArray(), AndroidKeysetManager.fromProto(keyTemplate.getOutputPrefixType()));
            return this;
        }

        public Builder withMasterKeyUri(String str) {
            if (!str.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                h.s("key URI must start with android-keystore://");
                return null;
            }
            if (this.useKeystore) {
                this.masterKeyUri = str;
                return this;
            }
            h.s("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            return null;
        }

        public Builder withSharedPref(Context context, String str, String str2) {
            if (context == null) {
                h.s("need an Android context");
                return null;
            }
            if (str == null) {
                h.s("need a keyset name");
                return null;
            }
            this.reader = new SharedPrefKeysetReader(context, str, str2);
            this.writer = new SharedPrefKeysetWriter(context, str, str2);
            return this;
        }

        public Builder withKeyTemplate(KeyTemplate keyTemplate) {
            this.keyTemplate = keyTemplate;
            return this;
        }
    }
}

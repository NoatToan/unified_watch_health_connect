package com.google.crypto.tink.aead;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class AeadWrapper implements PrimitiveWrapper<Aead, Aead> {
    private static final Logger logger = Logger.getLogger(AeadWrapper.class.getName());

    public static class WrappedAead implements Aead {
        private final PrimitiveSet<Aead> pSet;

        private WrappedAead(PrimitiveSet<Aead> primitiveSet) {
            this.pSet = primitiveSet;
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<PrimitiveSet.Entry<Aead>> it = this.pSet.getPrimitive(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().getPrimitive().decrypt(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e4) {
                        AeadWrapper.logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e4.toString());
                    }
                }
            }
            Iterator<PrimitiveSet.Entry<Aead>> it3 = this.pSet.getRawPrimitives().iterator();
            while (it3.hasNext()) {
                try {
                    return it3.next().getPrimitive().decrypt(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            a.t("decryption failed");
            return null;
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] encrypt(byte[] bArr, byte[] bArr2) {
            return Bytes.concat(this.pSet.getPrimary().getIdentifier(), this.pSet.getPrimary().getPrimitive().encrypt(bArr, bArr2));
        }
    }

    public static void register() {
        Registry.registerPrimitiveWrapper(new AeadWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Aead> getInputPrimitiveClass() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Aead> getPrimitiveClass() {
        return Aead.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Aead wrap(PrimitiveSet<Aead> primitiveSet) {
        return new WrappedAead(primitiveSet);
    }
}

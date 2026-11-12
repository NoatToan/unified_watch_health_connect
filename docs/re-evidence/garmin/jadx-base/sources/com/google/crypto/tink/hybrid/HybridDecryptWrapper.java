package com.google.crypto.tink.hybrid;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class HybridDecryptWrapper implements PrimitiveWrapper<HybridDecrypt, HybridDecrypt> {
    private static final Logger logger = Logger.getLogger(HybridDecryptWrapper.class.getName());

    public static class WrappedHybridDecrypt implements HybridDecrypt {
        private final PrimitiveSet<HybridDecrypt> primitives;

        public WrappedHybridDecrypt(PrimitiveSet<HybridDecrypt> primitiveSet) {
            this.primitives = primitiveSet;
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<PrimitiveSet.Entry<HybridDecrypt>> it = this.primitives.getPrimitive(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().getPrimitive().decrypt(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e4) {
                        HybridDecryptWrapper.logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e4.toString());
                    }
                }
            }
            Iterator<PrimitiveSet.Entry<HybridDecrypt>> it3 = this.primitives.getRawPrimitives().iterator();
            while (it3.hasNext()) {
                try {
                    return it3.next().getPrimitive().decrypt(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            a.t("decryption failed");
            return null;
        }
    }

    public static void register() {
        Registry.registerPrimitiveWrapper(new HybridDecryptWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getInputPrimitiveClass() {
        return HybridDecrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getPrimitiveClass() {
        return HybridDecrypt.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public HybridDecrypt wrap(PrimitiveSet<HybridDecrypt> primitiveSet) {
        return new WrappedHybridDecrypt(primitiveSet);
    }
}

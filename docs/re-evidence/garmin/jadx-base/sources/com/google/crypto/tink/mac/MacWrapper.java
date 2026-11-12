package com.google.crypto.tink.mac;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
class MacWrapper implements PrimitiveWrapper<Mac, Mac> {
    private static final Logger logger = Logger.getLogger(MacWrapper.class.getName());

    public static class WrappedMac implements Mac {
        private final byte[] formatVersion;
        private final PrimitiveSet<Mac> primitives;

        private WrappedMac(PrimitiveSet<Mac> primitiveSet) {
            this.formatVersion = new byte[]{0};
            this.primitives = primitiveSet;
        }

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(byte[] bArr) {
            boolean zEquals = this.primitives.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY);
            PrimitiveSet<Mac> primitiveSet = this.primitives;
            return zEquals ? Bytes.concat(primitiveSet.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(Bytes.concat(bArr, this.formatVersion))) : Bytes.concat(primitiveSet.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(bArr));
        }

        /* JADX INFO: Removed unreachable split cross block B:27:0x0084 */
        @Override // com.google.crypto.tink.Mac
        public void verifyMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                a.t("tag too short");
                return;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (PrimitiveSet.Entry<Mac> entry : this.primitives.getPrimitive(bArrCopyOf)) {
                try {
                    if (entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                        entry.getPrimitive().verifyMac(bArrCopyOfRange, Bytes.concat(bArr2, this.formatVersion));
                        return;
                    } else {
                        entry.getPrimitive().verifyMac(bArrCopyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e4) {
                    MacWrapper.logger.info("tag prefix matches a key, but cannot verify: " + e4);
                }
            }
            Iterator<PrimitiveSet.Entry<Mac>> it = this.primitives.getRawPrimitives().iterator();
            while (it.hasNext()) {
                try {
                    it.next().getPrimitive().verifyMac(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            a.t("invalid MAC");
        }
    }

    public static void register() {
        Registry.registerPrimitiveWrapper(new MacWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getInputPrimitiveClass() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getPrimitiveClass() {
        return Mac.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Mac wrap(PrimitiveSet<Mac> primitiveSet) {
        return new WrappedMac(primitiveSet);
    }
}

package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeySignWrapper implements PrimitiveWrapper<PublicKeySign, PublicKeySign> {

    public static class WrappedPublicKeySign implements PublicKeySign {
        private final PrimitiveSet<PublicKeySign> primitives;

        public WrappedPublicKeySign(PrimitiveSet<PublicKeySign> primitiveSet) {
            this.primitives = primitiveSet;
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public byte[] sign(byte[] bArr) {
            boolean zEquals = this.primitives.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY);
            PrimitiveSet<PublicKeySign> primitiveSet = this.primitives;
            return zEquals ? Bytes.concat(primitiveSet.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().sign(Bytes.concat(bArr, new byte[]{0}))) : Bytes.concat(primitiveSet.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().sign(bArr));
        }
    }

    public static void register() {
        Registry.registerPrimitiveWrapper(new PublicKeySignWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeySign> getInputPrimitiveClass() {
        return PublicKeySign.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeySign> getPrimitiveClass() {
        return PublicKeySign.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PublicKeySign wrap(PrimitiveSet<PublicKeySign> primitiveSet) {
        return new WrappedPublicKeySign(primitiveSet);
    }
}

package org.conscrypt;

import j20.x;

/* JADX INFO: loaded from: classes3.dex */
abstract class NativeRef {
    final long address;

    public static final class EC_GROUP extends NativeRef {
        public EC_GROUP(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.EC_GROUP_clear_free(j8);
        }
    }

    public static final class EC_POINT extends NativeRef {
        public EC_POINT(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.EC_POINT_clear_free(j8);
        }
    }

    public static final class EVP_CIPHER_CTX extends NativeRef {
        public EVP_CIPHER_CTX(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.EVP_CIPHER_CTX_free(j8);
        }
    }

    public static final class EVP_MD_CTX extends NativeRef {
        public EVP_MD_CTX(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.EVP_MD_CTX_destroy(j8);
        }
    }

    public static final class EVP_PKEY extends NativeRef {
        public EVP_PKEY(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.EVP_PKEY_free(j8);
        }
    }

    public static final class EVP_PKEY_CTX extends NativeRef {
        public EVP_PKEY_CTX(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.EVP_PKEY_CTX_free(j8);
        }
    }

    public static final class HMAC_CTX extends NativeRef {
        public HMAC_CTX(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.HMAC_CTX_free(j8);
        }
    }

    public static final class SSL_SESSION extends NativeRef {
        public SSL_SESSION(long j8) {
            super(j8);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j8) {
            NativeCrypto.SSL_SESSION_free(j8);
        }
    }

    public NativeRef(long j8) {
        if (j8 != 0) {
            this.address = j8;
        } else {
            x.l("address == 0");
            throw null;
        }
    }

    public abstract void doFree(long j8);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    public void finalize() throws Throwable {
        try {
            long j8 = this.address;
            if (j8 != 0) {
                doFree(j8);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        long j8 = this.address;
        return (int) (j8 ^ (j8 >>> 32));
    }
}

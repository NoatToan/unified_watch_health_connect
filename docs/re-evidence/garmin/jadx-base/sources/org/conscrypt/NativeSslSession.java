package org.conscrypt;

import am.j;
import b71.i;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class NativeSslSession {
    private static final Logger logger = Logger.getLogger(NativeSslSession.class.getName());

    public static final class Impl extends NativeSslSession {
        private final String cipherSuite;
        private final AbstractSessionContext context;
        private final String host;
        private final X509Certificate[] peerCertificates;
        private final byte[] peerOcspStapledResponse;
        private final byte[] peerSignedCertificateTimestamp;
        private final int port;
        private final String protocol;
        private final NativeRef.SSL_SESSION ref;

        private Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i14, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2) {
            this.context = abstractSessionContext;
            this.host = str;
            this.port = i14;
            this.peerCertificates = x509CertificateArr;
            this.peerOcspStapledResponse = bArr;
            this.peerSignedCertificateTimestamp = bArr2;
            this.protocol = NativeCrypto.SSL_SESSION_get_version(ssl_session.address);
            this.cipherSuite = NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_SESSION_cipher(ssl_session.address));
            this.ref = ssl_session;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCreationTime() {
            return NativeCrypto.SSL_SESSION_get_time(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        public String getCipherSuite() {
            return this.cipherSuite;
        }

        @Override // org.conscrypt.NativeSslSession
        public byte[] getId() {
            return NativeCrypto.SSL_SESSION_session_id(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        public String getPeerHost() {
            return this.host;
        }

        @Override // org.conscrypt.NativeSslSession
        public byte[] getPeerOcspStapledResponse() {
            return this.peerOcspStapledResponse;
        }

        @Override // org.conscrypt.NativeSslSession
        public int getPeerPort() {
            return this.port;
        }

        @Override // org.conscrypt.NativeSslSession
        public byte[] getPeerSignedCertificateTimestamp() {
            return this.peerSignedCertificateTimestamp;
        }

        @Override // org.conscrypt.NativeSslSession
        public String getProtocol() {
            return this.protocol;
        }

        @Override // org.conscrypt.NativeSslSession
        public boolean isSingleUse() {
            return NativeCrypto.SSL_SESSION_should_be_single_use(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        public boolean isValid() {
            return System.currentTimeMillis() - (Math.max(0L, Math.min((long) this.context.getSessionTimeout(), NativeCrypto.SSL_SESSION_get_timeout(this.ref.address))) * 1000) < getCreationTime();
        }

        @Override // org.conscrypt.NativeSslSession
        public void offerToResume(NativeSsl nativeSsl) {
            nativeSsl.offerToResumeSession(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        public byte[] toBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value);
                byte[] bArrI2d_SSL_SESSION = NativeCrypto.i2d_SSL_SESSION(this.ref.address);
                dataOutputStream.writeInt(bArrI2d_SSL_SESSION.length);
                dataOutputStream.write(bArrI2d_SSL_SESSION);
                dataOutputStream.writeInt(this.peerCertificates.length);
                for (X509Certificate x509Certificate : this.peerCertificates) {
                    byte[] encoded = x509Certificate.getEncoded();
                    dataOutputStream.writeInt(encoded.length);
                    dataOutputStream.write(encoded);
                }
                if (this.peerOcspStapledResponse != null) {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.peerOcspStapledResponse.length);
                    dataOutputStream.write(this.peerOcspStapledResponse);
                } else {
                    dataOutputStream.writeInt(0);
                }
                byte[] bArr = this.peerSignedCertificateTimestamp;
                if (bArr != null) {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(this.peerSignedCertificateTimestamp);
                } else {
                    dataOutputStream.writeInt(0);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e4) {
                NativeSslSession.logger.log(Level.WARNING, "Failed to convert saved SSL Session: ", (Throwable) e4);
                return null;
            } catch (CertificateEncodingException e14) {
                NativeSslSession.log(e14);
                return null;
            }
        }

        @Override // org.conscrypt.NativeSslSession
        public SSLSession toSSLSession() {
            return new SSLSession() { // from class: org.conscrypt.NativeSslSession.Impl.1
                @Override // javax.net.ssl.SSLSession
                public int getApplicationBufferSize() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getCipherSuite() {
                    return Impl.this.getCipherSuite();
                }

                @Override // javax.net.ssl.SSLSession
                public long getCreationTime() {
                    return Impl.this.getCreationTime();
                }

                @Override // javax.net.ssl.SSLSession
                public byte[] getId() {
                    return Impl.this.getId();
                }

                @Override // javax.net.ssl.SSLSession
                public long getLastAccessedTime() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Certificate[] getLocalCertificates() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Principal getLocalPrincipal() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public int getPacketBufferSize() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public javax.security.cert.X509Certificate[] getPeerCertificateChain() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Certificate[] getPeerCertificates() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getPeerHost() {
                    return Impl.this.getPeerHost();
                }

                @Override // javax.net.ssl.SSLSession
                public int getPeerPort() {
                    return Impl.this.getPeerPort();
                }

                @Override // javax.net.ssl.SSLSession
                public Principal getPeerPrincipal() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getProtocol() {
                    return Impl.this.getProtocol();
                }

                @Override // javax.net.ssl.SSLSession
                public SSLSessionContext getSessionContext() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Object getValue(String str) {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String[] getValueNames() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public void invalidate() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public boolean isValid() {
                    return Impl.this.isValid();
                }

                @Override // javax.net.ssl.SSLSession
                public void putValue(String str, Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public void removeValue(String str) {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    private static void checkRemaining(ByteBuffer byteBuffer, int i14) throws IOException {
        if (i14 < 0) {
            h.C(j.h(i14, "Length is negative: "));
        } else {
            if (i14 <= byteBuffer.remaining()) {
                return;
            }
            StringBuilder sbI = i.i(i14, "Length of blob is longer than available: ", " > ");
            sbI.append(byteBuffer.remaining());
            throw new IOException(sbI.toString());
        }
    }

    private static byte[] getOcspResponse(ConscryptSession conscryptSession) {
        List<byte[]> statusResponses = conscryptSession.getStatusResponses();
        if (statusResponses.size() >= 1) {
            return statusResponses.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(Throwable th3) {
        logger.log(Level.INFO, "Error inflating SSL session: {0}", th3.getMessage() != null ? th3.getMessage() : th3.getClass().getName());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    public static NativeSslSession newInstance(AbstractSessionContext abstractSessionContext, byte[] bArr, String str, int i14) {
        byte[] bArr2;
        byte[] bArr3;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        try {
            int i15 = byteBufferWrap.getInt();
            if (!SSLUtils.SessionType.isSupportedType(i15)) {
                throw new IOException("Unexpected type ID: " + i15);
            }
            int i16 = byteBufferWrap.getInt();
            checkRemaining(byteBufferWrap, i16);
            byte[] bArr4 = new byte[i16];
            byteBufferWrap.get(bArr4);
            int i17 = byteBufferWrap.getInt();
            checkRemaining(byteBufferWrap, i17);
            X509Certificate[] x509CertificateArr = new X509Certificate[i17];
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = byteBufferWrap.getInt();
                checkRemaining(byteBufferWrap, i19);
                byte[] bArr5 = new byte[i19];
                byteBufferWrap.get(bArr5);
                try {
                    x509CertificateArr[i18] = OpenSSLX509Certificate.fromX509Der(bArr5);
                } catch (Exception unused) {
                    throw new IOException("Can not read certificate " + i18 + "/" + i17);
                }
            }
            if (i15 >= SSLUtils.SessionType.OPEN_SSL_WITH_OCSP.value) {
                int i24 = byteBufferWrap.getInt();
                checkRemaining(byteBufferWrap, i24);
                if (i24 >= 1) {
                    int i25 = byteBufferWrap.getInt();
                    checkRemaining(byteBufferWrap, i25);
                    byte[] bArr6 = new byte[i25];
                    byteBufferWrap.get(bArr6);
                    for (int i26 = 1; i26 < i24; i26++) {
                        int i27 = byteBufferWrap.getInt();
                        checkRemaining(byteBufferWrap, i27);
                        byteBufferWrap.position(byteBufferWrap.position() + i27);
                    }
                    bArr2 = bArr6;
                } else {
                    bArr2 = null;
                }
            } else {
                bArr2 = null;
            }
            if (i15 == SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value) {
                int i28 = byteBufferWrap.getInt();
                checkRemaining(byteBufferWrap, i28);
                if (i28 > 0) {
                    byte[] bArr7 = new byte[i28];
                    byteBufferWrap.get(bArr7);
                    bArr3 = bArr7;
                } else {
                    bArr3 = null;
                }
            } else {
                bArr3 = null;
            }
            if (byteBufferWrap.remaining() == 0) {
                return new Impl(abstractSessionContext, new NativeRef.SSL_SESSION(NativeCrypto.d2i_SSL_SESSION(bArr4)), str, i14, x509CertificateArr, bArr2, bArr3);
            }
            log(new AssertionError("Read entire session, but data still remains; rejecting"));
            return null;
        } catch (IOException e4) {
            log(e4);
            return null;
        } catch (BufferUnderflowException e14) {
            log(e14);
            return null;
        }
    }

    public abstract String getCipherSuite();

    public abstract byte[] getId();

    public abstract String getPeerHost();

    public abstract byte[] getPeerOcspStapledResponse();

    public abstract int getPeerPort();

    public abstract byte[] getPeerSignedCertificateTimestamp();

    public abstract String getProtocol();

    public abstract boolean isSingleUse();

    public abstract boolean isValid();

    public abstract void offerToResume(NativeSsl nativeSsl);

    public abstract byte[] toBytes();

    public abstract SSLSession toSSLSession();

    public static NativeSslSession newInstance(NativeRef.SSL_SESSION ssl_session, ConscryptSession conscryptSession) {
        AbstractSessionContext abstractSessionContext = (AbstractSessionContext) conscryptSession.getSessionContext();
        if (abstractSessionContext instanceof ClientSessionContext) {
            return new Impl(abstractSessionContext, ssl_session, conscryptSession.getPeerHost(), conscryptSession.getPeerPort(), conscryptSession.getPeerCertificates(), getOcspResponse(conscryptSession), conscryptSession.getPeerSignedCertificateTimestamp());
        }
        return new Impl(abstractSessionContext, ssl_session, null, -1, null, null, null);
    }
}

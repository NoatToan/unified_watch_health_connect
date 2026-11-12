package defpackage;

import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zzz extends HandshakeMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aacm f54857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CertPath f54858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<byte[]> f54859c;
    private static final Logger e = aaex.a((Class<?>) zzz.class);
    private final CertPath d;
    private final int g;
    private final byte[] h;
    private final PublicKey i;
    private final List<byte[]> j;

    static {
        CertPath certPathGenerateCertPath;
        aacm aacmVar = new aacm("X.509");
        f54857a = aacmVar;
        try {
            certPathGenerateCertPath = aacmVar.d().generateCertPath(Collections.EMPTY_LIST);
        } catch (GeneralSecurityException unused) {
            certPathGenerateCertPath = null;
        }
        f54858b = certPathGenerateCertPath;
        f54859c = Collections.EMPTY_LIST;
    }

    public zzz() {
        this(f54858b);
    }

    public zzz(List<X509Certificate> list) {
        this(list, null);
    }

    public zzz(List<X509Certificate> list, List<X500Principal> list2) {
        this(zzi.c(list, list2));
        Logger logger = e;
        if (logger.isDebugEnabled()) {
            int size = this.d.getCertificates().size();
            if (size < list.size()) {
                logger.debug("created CERTIFICATE message with truncated certificate chain [length: {}, full-length: {}]", Integer.valueOf(size), Integer.valueOf(list.size()));
            } else {
                logger.debug("created CERTIFICATE message with certificate chain [length: {}]", Integer.valueOf(size));
            }
        }
    }

    private zzz(CertPath certPath) {
        int length;
        if (certPath == null) {
            throw new NullPointerException("Certificate chain must not be null!");
        }
        this.h = null;
        this.d = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (size == 0) {
            this.i = null;
            this.j = f54859c;
            this.g = 3;
            return;
        }
        List<byte[]> arrayList = new ArrayList<>(size);
        try {
            Iterator<? extends Certificate> it = certificates.iterator();
            length = 0;
            while (it.hasNext()) {
                byte[] encoded = it.next().getEncoded();
                arrayList.add(encoded);
                length += encoded.length + 3;
            }
        } catch (CertificateEncodingException e2) {
            List<byte[]> list = f54859c;
            e.warn("Could not encode certificate chain", (Throwable) e2);
            length = 0;
            arrayList = list;
        }
        this.i = arrayList.isEmpty() ? null : certificates.get(0).getPublicKey();
        this.j = arrayList;
        this.g = length + 3;
    }

    public zzz(PublicKey publicKey) {
        this.i = publicKey;
        if (publicKey == null) {
            this.h = null;
            this.d = f54858b;
            this.j = f54859c;
            this.g = 3;
            return;
        }
        this.d = null;
        this.j = null;
        byte[] encoded = publicKey.getEncoded();
        this.h = encoded;
        this.g = encoded.length + 3;
    }

    public zzz(byte[] bArr) {
        this(a(bArr));
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.CERTIFICATE;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.g;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        String strReplaceAll;
        CertPath certPath;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString(i));
        String strD = zzp.d(i + 1);
        String strD2 = zzp.d(i + 2);
        byte[] bArr = this.h;
        if (bArr == null && (certPath = this.d) != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            sb.append(strD);
            sb.append("Certificate chain: ");
            sb.append(certificates.size());
            sb.append(" certificates");
            sb.append(zzp.c());
            int i2 = 0;
            for (Certificate certificate : certificates) {
                sb.append(strD2);
                sb.append("Certificate Length: ");
                sb.append(this.j.get(i2).length);
                sb.append(" bytes");
                sb.append(zzp.c());
                String strE = zzp.e(certificate);
                sb.append(strD2);
                sb.append("Certificate[");
                sb.append(i2);
                sb.append(".]: ");
                sb.append(strE.replaceAll("\n", "\n" + strD2));
                sb.append(zzp.c());
                i2++;
            }
        } else if (bArr != null && this.d == null) {
            sb.append(strD);
            sb.append("Raw Public Key: ");
            PublicKey publicKey = this.i;
            if (publicKey != null) {
                strReplaceAll = zzp.b(publicKey).replaceAll("\n", "\n" + strD2);
            } else {
                strReplaceAll = "<empty>";
            }
            sb.append(strReplaceAll.replaceAll("\n", "\n" + strD2));
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    public PublicKey a() {
        return this.i;
    }

    public CertPath b() {
        return this.d;
    }

    public boolean e() {
        return this.i == null;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl(getMessageLength());
        byte[] bArr = this.h;
        if (bArr == null) {
            zzlVar.d(getMessageLength() - 3, 24);
            Iterator<byte[]> it = this.j.iterator();
            while (it.hasNext()) {
                zzlVar.b(it.next(), 24);
            }
        } else {
            zzlVar.b(bArr, 24);
        }
        return zzlVar.d();
    }

    public static zzz c(zzf zzfVar, CertificateType certificateType) throws aaay {
        int iA = zzfVar.a(24);
        if (iA == 0) {
            return new zzz(f54858b);
        }
        if (CertificateType.RAW_PUBLIC_KEY == certificateType) {
            e.debug("Parsing RawPublicKey CERTIFICATE message");
            return new zzz(zzfVar.b(iA));
        }
        if (CertificateType.X_509 == certificateType) {
            zzf zzfVarD = zzfVar.d(iA);
            e.debug("Parsing X.509 CERTIFICATE message");
            try {
                CertificateFactory certificateFactoryD = f54857a.d();
                ArrayList arrayList = new ArrayList();
                while (zzfVarD.d()) {
                    arrayList.add(certificateFactoryD.generateCertificate(zzfVarD.c(zzfVarD.a(24))));
                }
                return new zzz(certificateFactoryD.generateCertPath(arrayList));
            } catch (GeneralSecurityException e2) {
                throw new aaay("Cannot parse X.509 certificate chain provided by peer", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE), e2);
            }
        }
        throw new IllegalArgumentException("Certificate type " + certificateType + " not supported!");
    }

    private static PublicKey a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            String strJ = zza.j(bArr);
            if (strJ != null) {
                aacq aacqVar = (aacq) aacq.d.c(strJ);
                if (aacqVar == null || aacqVar.c() == null) {
                    return null;
                }
                return aacqVar.c().generatePublic(new X509EncodedKeySpec(bArr));
            }
            e.info("Could not reconstruct the peer's public key [{}]", zzp.b(bArr));
            return null;
        } catch (IllegalArgumentException e2) {
            e.warn("Could not reconstruct the peer's public key", (Throwable) e2);
            return null;
        } catch (GeneralSecurityException e3) {
            e.warn("Could not reconstruct the peer's public key", (Throwable) e3);
            return null;
        }
    }
}

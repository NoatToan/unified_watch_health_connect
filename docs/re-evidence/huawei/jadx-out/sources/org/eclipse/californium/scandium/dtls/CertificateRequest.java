package org.eclipse.californium.scandium.dtls;

import defpackage.aacx;
import defpackage.aaex;
import defpackage.zzf;
import defpackage.zzi;
import defpackage.zzl;
import defpackage.zzp;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class CertificateRequest extends HandshakeMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f44546a = aaex.a((Class<?>) CertificateRequest.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ClientCertificateType> f44547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44548c;
    private final List<X500Principal> d;
    private final List<SignatureAndHashAlgorithm> e;

    public CertificateRequest() {
        this.f44547b = new ArrayList();
        this.e = new ArrayList();
        this.d = new ArrayList();
        this.f44548c = 0;
    }

    public CertificateRequest(List<ClientCertificateType> list, List<SignatureAndHashAlgorithm> list2, List<X500Principal> list3) {
        ArrayList arrayList = new ArrayList();
        this.f44547b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        this.d = new ArrayList();
        this.f44548c = 0;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (!list2.isEmpty()) {
            arrayList2.addAll(list2);
        }
        if (list3 != null) {
            e(list3);
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.CERTIFICATE_REQUEST;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.f44547b.size() + 3 + (this.e.size() * 2) + 2 + this.f44548c;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        String strD = zzp.d(i + 1);
        String strD2 = zzp.d(i + 2);
        if (!this.f44547b.isEmpty()) {
            sb.append(strD);
            sb.append("Client certificate type:");
            sb.append(zzp.c());
            for (ClientCertificateType clientCertificateType : this.f44547b) {
                sb.append(strD2);
                sb.append(clientCertificateType);
                sb.append(zzp.c());
            }
        }
        if (!this.e.isEmpty()) {
            sb.append(strD);
            sb.append("Signature and hash algorithm:");
            sb.append(zzp.c());
            for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : this.e) {
                sb.append(strD2);
                sb.append(signatureAndHashAlgorithm);
                sb.append(zzp.c());
            }
        }
        if (!this.d.isEmpty()) {
            sb.append(strD);
            sb.append("Certificate authorities:");
            sb.append(zzp.c());
            for (X500Principal x500Principal : this.d) {
                sb.append(strD2);
                sb.append(x500Principal.getName());
                sb.append(zzp.c());
            }
        }
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl();
        zzlVar.d(this.f44547b.size(), 8);
        Iterator<ClientCertificateType> it = this.f44547b.iterator();
        while (it.hasNext()) {
            zzlVar.d(it.next().getCode(), 8);
        }
        zzlVar.d(this.e.size() * 2, 16);
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : this.e) {
            zzlVar.d(signatureAndHashAlgorithm.c().getCode(), 8);
            zzlVar.d(signatureAndHashAlgorithm.b().getCode(), 8);
        }
        zzlVar.d(this.f44548c, 16);
        Iterator<X500Principal> it2 = this.d.iterator();
        while (it2.hasNext()) {
            zzlVar.b(it2.next().getEncoded(), 16);
        }
        return zzlVar.d();
    }

    public static HandshakeMessage c(zzf zzfVar) {
        ArrayList arrayList = new ArrayList();
        zzf zzfVarD = zzfVar.d(zzfVar.a(8));
        while (zzfVarD.d()) {
            arrayList.add(ClientCertificateType.getTypeByCode(zzfVarD.a(8)));
        }
        ArrayList arrayList2 = new ArrayList();
        zzf zzfVarD2 = zzfVar.d(zzfVar.a(16));
        while (zzfVarD2.d()) {
            arrayList2.add(new SignatureAndHashAlgorithm(zzfVarD2.a(8), zzfVarD2.a(8)));
        }
        ArrayList arrayList3 = new ArrayList();
        zzf zzfVarD3 = zzfVar.d(zzfVar.a(16));
        while (zzfVarD3.d()) {
            arrayList3.add(new X500Principal(zzfVarD3.j(16)));
        }
        return new CertificateRequest(arrayList, arrayList2, arrayList3);
    }

    public enum ClientCertificateType {
        RSA_SIGN(1, CipherSuite.CertificateKeyAlgorithm.RSA),
        DSS_SIGN(2, CipherSuite.CertificateKeyAlgorithm.DSA),
        RSA_FIXED_DH(3, null),
        DSS_FIXED_DH(4, null),
        RSA_EPHEMERAL_DH_RESERVED(5, null),
        DSS_EPHEMERAL_DH_RESERVED(6, null),
        FORTEZZA_DMS_RESERVED(20, null),
        ECDSA_SIGN(64, CipherSuite.CertificateKeyAlgorithm.EC),
        RSA_FIXED_ECDH(65, null),
        ECDSA_FIXED_ECDH(66, null);

        private final int code;
        private final CipherSuite.CertificateKeyAlgorithm keyAlgorithm;

        ClientCertificateType(int i, CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm) {
            this.code = i;
            this.keyAlgorithm = certificateKeyAlgorithm;
        }

        public int getCode() {
            return this.code;
        }

        public boolean requiresSigningCapability() {
            return this.keyAlgorithm != null;
        }

        public boolean isCompatibleWithKeyAlgorithm(String str) {
            CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm = this.keyAlgorithm;
            if (certificateKeyAlgorithm == null) {
                return false;
            }
            return certificateKeyAlgorithm.isCompatible(str);
        }

        public CipherSuite.CertificateKeyAlgorithm getCertificateKeyAlgorithm() {
            return this.keyAlgorithm;
        }

        public static ClientCertificateType getTypeByCode(int i) {
            for (ClientCertificateType clientCertificateType : values()) {
                if (clientCertificateType.code == i) {
                    return clientCertificateType;
                }
            }
            return null;
        }
    }

    public void b(ClientCertificateType clientCertificateType) {
        this.f44547b.add(clientCertificateType);
    }

    public void c(CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm) {
        for (ClientCertificateType clientCertificateType : ClientCertificateType.values()) {
            if (clientCertificateType.getCertificateKeyAlgorithm() == certificateKeyAlgorithm) {
                b(clientCertificateType);
            }
        }
    }

    public void d(List<SignatureAndHashAlgorithm> list) {
        this.e.addAll(list);
    }

    public boolean b(X500Principal x500Principal) {
        if (x500Principal == null) {
            throw new NullPointerException("authority must not be null");
        }
        int length = x500Principal.getEncoded().length + 2;
        if (this.f44548c + length > 65535) {
            return false;
        }
        this.d.add(x500Principal);
        this.f44548c += length;
        return true;
    }

    public boolean e(List<X500Principal> list) {
        Iterator<X500Principal> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!b(it.next())) {
                f44546a.debug("could add only {} of {} certificate authorities, max length exceeded", Integer.valueOf(i), Integer.valueOf(list.size()));
                return false;
            }
            i++;
        }
        return true;
    }

    public List<CipherSuite.CertificateKeyAlgorithm> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<ClientCertificateType> it = this.f44547b.iterator();
        while (it.hasNext()) {
            aacx.c(arrayList, it.next().getCertificateKeyAlgorithm());
        }
        return arrayList;
    }

    boolean b(PublicKey publicKey) {
        String algorithm = publicKey.getAlgorithm();
        Iterator<ClientCertificateType> it = this.f44547b.iterator();
        while (it.hasNext()) {
            if (it.next().isCompatibleWithKeyAlgorithm(algorithm)) {
                return true;
            }
        }
        return false;
    }

    boolean a(X509Certificate x509Certificate) {
        String algorithm = x509Certificate.getPublicKey().getAlgorithm();
        Boolean boolValueOf = null;
        for (ClientCertificateType clientCertificateType : this.f44547b) {
            if (!clientCertificateType.isCompatibleWithKeyAlgorithm(algorithm)) {
                f44546a.debug("type: {}, is not compatible with KeyAlgorithm[{}]", clientCertificateType, algorithm);
            } else {
                if (clientCertificateType.requiresSigningCapability()) {
                    if (boolValueOf == null) {
                        boolValueOf = Boolean.valueOf(zzi.e(x509Certificate, true));
                    }
                    if (!boolValueOf.booleanValue()) {
                        f44546a.error("type: {}, requires missing signing capability!", clientCertificateType);
                    }
                }
                f44546a.debug("type: {}, is compatible with KeyAlgorithm[{}] and meets signing requirements", clientCertificateType, algorithm);
                return true;
            }
        }
        f44546a.debug("certificate [{}] with public key {} is not of any supported type", x509Certificate, algorithm);
        return false;
    }

    public SignatureAndHashAlgorithm a(PublicKey publicKey, List<SignatureAndHashAlgorithm> list) {
        if (b(publicKey)) {
            return SignatureAndHashAlgorithm.a(SignatureAndHashAlgorithm.a(this.e, list), publicKey);
        }
        return null;
    }

    public SignatureAndHashAlgorithm e(List<X509Certificate> list, List<SignatureAndHashAlgorithm> list2) {
        SignatureAndHashAlgorithm signatureAndHashAlgorithmA;
        X509Certificate x509Certificate = list.get(0);
        if (a(x509Certificate) && (signatureAndHashAlgorithmA = SignatureAndHashAlgorithm.a(SignatureAndHashAlgorithm.a(this.e, list2), x509Certificate.getPublicKey())) != null && SignatureAndHashAlgorithm.d(this.e, list)) {
            return signatureAndHashAlgorithmA;
        }
        return null;
    }

    public List<SignatureAndHashAlgorithm> b() {
        return Collections.unmodifiableList(this.e);
    }

    public List<X500Principal> d() {
        return Collections.unmodifiableList(this.d);
    }
}

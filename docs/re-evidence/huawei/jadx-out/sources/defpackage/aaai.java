package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.HelloExtension;
import org.eclipse.californium.scandium.dtls.HelloHandshakeMessage;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.SupportedPointFormatsExtension;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public final class aaai extends HelloHandshakeMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<CompressionMethod> f31b;
    private final List<CipherSuite> d;

    public aaai(aabl aablVar, List<CipherSuite> list, List<SignatureAndHashAlgorithm> list2, List<CertificateType> list3, List<CertificateType> list4, List<XECDHECryptography.SupportedGroup> list5) {
        this(aablVar, aacd.e(), list, list2, list3, list4, list5);
    }

    public aaai(aabl aablVar, aaam aaamVar, List<SignatureAndHashAlgorithm> list, List<CertificateType> list2, List<CertificateType> list3, List<XECDHECryptography.SupportedGroup> list4) {
        this(aablVar, aaamVar.l(), Arrays.asList(aaamVar.a()), list, list2, list3, list4);
        e(aaamVar.e());
    }

    private aaai(aabl aablVar, aacd aacdVar, List<CipherSuite> list, List<SignatureAndHashAlgorithm> list2, List<CertificateType> list3, List<CertificateType> list4, List<XECDHECryptography.SupportedGroup> list5) {
        super(aablVar, aacdVar);
        this.f30a = zzg.f54809a;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f31b = new ArrayList();
        if (CipherSuite.containsEccBasedCipherSuite(list)) {
            addExtension(new aace(list5));
            addExtension(SupportedPointFormatsExtension.f44566b);
        }
        if (CipherSuite.containsCipherSuiteRequiringCertExchange(list)) {
            if (!list2.isEmpty()) {
                if (c(list3) && c(list4)) {
                    list2 = SignatureAndHashAlgorithm.c(list2, CipherSuite.getCertificateKeyAlgorithms(list));
                }
                addExtension(new aacf(list2));
            }
            if (d(list3)) {
                addExtension(new aaaa(list3));
            }
            if (d(list4)) {
                addExtension(new aacb(list4));
            }
        }
    }

    private aaai(zzf zzfVar) throws aaay {
        super(zzfVar);
        this.f30a = zzfVar.j(8);
        this.d = CipherSuite.listFromReader(zzfVar.d(zzfVar.a(16)));
        this.f31b = CompressionMethod.listFromReader(zzfVar.d(zzfVar.a(8)));
        this.extensions.e(zzfVar);
        aaby serverNameExtension = getServerNameExtension();
        if (serverNameExtension != null && serverNameExtension.e() == null) {
            throw new aaay("ClientHello message contains empty ServerNameExtension", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
        }
    }

    private boolean d(List<CertificateType> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.size() > 1 || !list.contains(CertificateType.X_509);
    }

    private boolean c(List<CertificateType> list) {
        if (list == null || list.size() != 1) {
            return false;
        }
        return list.contains(CertificateType.RAW_PUBLIC_KEY);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl();
        writeHeader(zzlVar);
        zzlVar.b(this.f30a, 8);
        zzlVar.d((this.d.size() * 16) / 8, 16);
        CipherSuite.listToWriter(zzlVar, this.d);
        zzlVar.d(this.f31b.size(), 8);
        CompressionMethod.listToWriter(zzlVar, this.f31b);
        this.extensions.e(zzlVar);
        return zzlVar.d();
    }

    public static aaai c(zzf zzfVar) throws aaay {
        return new aaai(zzfVar);
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloHandshakeMessage, org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        int i2 = i + 1;
        String strD = zzp.d(i2);
        String strD2 = zzp.d(i + 2);
        sb.append(strD);
        sb.append("Cookie Length: ");
        sb.append(this.f30a.length);
        sb.append(" bytes");
        sb.append(zzp.c());
        if (this.f30a.length > 0) {
            sb.append(strD);
            sb.append("Cookie: ");
            sb.append(zzp.e(this.f30a));
            sb.append(zzp.c());
        }
        sb.append(strD);
        sb.append("Cipher Suites (");
        sb.append(this.d.size());
        sb.append(" suites, ");
        sb.append((this.d.size() * 16) / 8);
        sb.append(" bytes)");
        sb.append(zzp.c());
        for (CipherSuite cipherSuite : this.d) {
            sb.append(strD2);
            sb.append("Cipher Suite: ");
            sb.append(cipherSuite);
            sb.append(zzp.c());
        }
        sb.append(strD);
        sb.append("Compression Methods (");
        sb.append(this.f31b.size());
        sb.append(" methods, ");
        sb.append(this.f31b.size());
        sb.append(" bytes)");
        sb.append(zzp.c());
        for (CompressionMethod compressionMethod : this.f31b) {
            sb.append(strD2);
            sb.append("Compression Method: ");
            sb.append(compressionMethod);
            sb.append(zzp.c());
        }
        sb.append(this.extensions.d(i2));
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.CLIENT_HELLO;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        int iC = this.sessionId.c();
        int length = this.f30a.length;
        int size = (this.d.size() * 16) / 8;
        return iC + 39 + length + size + this.f31b.size() + this.extensions.a();
    }

    public byte[] e() {
        return this.f30a;
    }

    public boolean g() {
        return this.f30a.length > 0;
    }

    public void b(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("cookie must not be null!");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("cookie must not be empty!");
        }
        this.f30a = Arrays.copyOf(bArr, bArr.length);
        fragmentChanged();
    }

    public void a(Mac mac) {
        byte[] byteArray = toByteArray();
        int iC = this.sessionId.c() + 35;
        int length = this.f30a.length;
        int size = (((this.d.size() * 16) + 24) + (this.f31b.size() * 8)) / 8;
        mac.update(byteArray, 12, iC);
        mac.update(byteArray, length + iC + 13, size);
    }

    public List<CipherSuite> c() {
        return Collections.unmodifiableList(this.d);
    }

    public List<CipherSuite> e(List<CipherSuite> list) {
        return CipherSuite.preselectCipherSuites(list, this.d);
    }

    public List<CompressionMethod> d() {
        return Collections.unmodifiableList(this.f31b);
    }

    public void e(CompressionMethod compressionMethod) {
        aacx.c(this.f31b, compressionMethod);
    }

    public aade b() {
        aaby serverNameExtension = getServerNameExtension();
        if (serverNameExtension == null) {
            return null;
        }
        return serverNameExtension.e();
    }

    public aace a() {
        return (aace) this.extensions.d(HelloExtension.ExtensionType.ELLIPTIC_CURVES);
    }

    public boolean h() {
        return hasRenegotiationInfoExtension() || this.d.contains(CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV);
    }
}

package org.eclipse.californium.scandium.dtls;

import com.huawei.openalliance.ad.constant.Constants;
import defpackage.aaay;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ECDHServerKeyExchange extends ServerKeyExchange {
    private static final int CURVE_TYPE_BITS = 8;
    private static final int NAMED_CURVE = 3;
    private static final int NAMED_CURVE_BITS = 16;
    private static final int PUBLIC_LENGTH_BITS = 8;
    private final byte[] encodedPoint;
    private final XECDHECryptography.SupportedGroup supportedGroup;

    public ECDHServerKeyExchange(XECDHECryptography.SupportedGroup supportedGroup, byte[] bArr) {
        if (supportedGroup == null) {
            throw new NullPointerException("Supported group (curve) must not be null!");
        }
        if (bArr == null) {
            throw new NullPointerException("encoded point must not be null!");
        }
        this.supportedGroup = supportedGroup;
        this.encodedPoint = bArr;
    }

    protected int getNamedCurveLength() {
        return this.encodedPoint.length + 4;
    }

    protected void writeNamedCurve(zzl zzlVar) {
        zzlVar.d(3, 8);
        zzlVar.d(this.supportedGroup.getId(), 16);
        zzlVar.b(this.encodedPoint, 8);
    }

    public static c readNamedCurve(zzf zzfVar) throws aaay {
        int iA = zzfVar.a(8);
        if (iA != 3) {
            throw new aaay(String.format("Curve type [%s] received in ServerKeyExchange message is unsupported", Integer.valueOf(iA)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        int iA2 = zzfVar.a(16);
        XECDHECryptography.SupportedGroup supportedGroupFromId = XECDHECryptography.SupportedGroup.fromId(iA2);
        if (supportedGroupFromId == null || !supportedGroupFromId.isUsable()) {
            throw new aaay(String.format("Server used unsupported elliptic curve (%d) for ECDH", Integer.valueOf(iA2)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
        return new c(supportedGroupFromId, zzfVar.j(8));
    }

    protected void updateSignatureForNamedCurve(Signature signature) throws SignatureException {
        int id = getSupportedGroup().getId();
        signature.update((byte) 3);
        signature.update((byte) (id >> 8));
        signature.update((byte) id);
        signature.update((byte) this.encodedPoint.length);
        signature.update(this.encodedPoint);
    }

    public XECDHECryptography.SupportedGroup getSupportedGroup() {
        return this.supportedGroup;
    }

    public byte[] getEncodedPoint() {
        byte[] bArr = this.encodedPoint;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Diffie-Hellman public key: " + this.supportedGroup.name() + Constants.LINK + zzp.a(this.encodedPoint, (char) 0, 16) + zzp.c();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XECDHECryptography.SupportedGroup f44550a;
        public final byte[] e;

        c(XECDHECryptography.SupportedGroup supportedGroup, byte[] bArr) {
            this.f44550a = supportedGroup;
            this.e = bArr;
        }
    }
}

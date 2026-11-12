package org.eclipse.californium.scandium.dtls;

import defpackage.aaay;
import defpackage.aabl;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AlertMessage implements DTLSMessage, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AlertDescription f44544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AlertLevel f44545b;
    private final aabl d;

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public int size() {
        return 2;
    }

    public AlertMessage(AlertLevel alertLevel, AlertDescription alertDescription) {
        this(alertLevel, alertDescription, null);
    }

    public AlertMessage(AlertLevel alertLevel, AlertDescription alertDescription, aabl aablVar) {
        if (alertLevel == null) {
            throw new NullPointerException("Level must not be null");
        }
        if (alertDescription == null) {
            throw new NullPointerException("Description must not be null");
        }
        if (aablVar != null && alertDescription != AlertDescription.PROTOCOL_VERSION) {
            throw new IllegalArgumentException("Protocol version is only supported for that specific alert!");
        }
        this.f44545b = alertLevel;
        this.f44544a = alertDescription;
        this.d = aablVar;
    }

    public enum AlertLevel {
        WARNING(1),
        FATAL(2);

        private byte code;

        AlertLevel(int i) {
            this.code = (byte) i;
        }

        public byte getCode() {
            return this.code;
        }

        public static AlertLevel getLevelByCode(int i) {
            if (i == 1) {
                return WARNING;
            }
            if (i != 2) {
                return null;
            }
            return FATAL;
        }
    }

    public enum AlertDescription {
        CLOSE_NOTIFY(0, "close_notify"),
        UNEXPECTED_MESSAGE(10, "unexpected_message"),
        BAD_RECORD_MAC(20, "bad_record_mac"),
        DECRYPTION_FAILED_RESERVED(21, "decryption_failed"),
        RECORD_OVERFLOW(22, "record_overflow"),
        DECOMPRESSION_FAILURE(30, "decompression_failure"),
        HANDSHAKE_FAILURE(40, "handshake_failure"),
        NO_CERTIFICATE_RESERVED(41, "no_certificate"),
        BAD_CERTIFICATE(42, "bad_certificate"),
        UNSUPPORTED_CERTIFICATE(43, "unsupported_certificate"),
        CERTIFICATE_REVOKED(44, "certificate_revoked"),
        CERTIFICATE_EXPIRED(45, "certificate_expired"),
        CERTIFICATE_UNKNOWN(46, "certificate_unknown"),
        ILLEGAL_PARAMETER(47, "illegal_parameter"),
        UNKNOWN_CA(48, "unknown_ca"),
        ACCESS_DENIED(49, "access_denied"),
        DECODE_ERROR(50, "decode_error"),
        DECRYPT_ERROR(51, "decrypt_error"),
        EXPORT_RESTRICTION_RESERVED(60, "export_restriction"),
        PROTOCOL_VERSION(70, "protocol_version"),
        INSUFFICIENT_SECURITY(71, "insufficient_security"),
        INTERNAL_ERROR(80, "internal_error"),
        USER_CANCELED(90, "user_canceled"),
        NO_RENEGOTIATION(100, "no_negotiation"),
        UNSUPPORTED_EXTENSION(110, "unsupported_extension"),
        UNKNOWN_PSK_IDENTITY(115, "unknown_psk_identity");

        private byte code;
        private String description;

        AlertDescription(int i, String str) {
            this.code = (byte) i;
            this.description = str;
        }

        public byte getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }

        public static AlertDescription getDescriptionByCode(int i) {
            for (AlertDescription alertDescription : values()) {
                if (alertDescription.code == ((byte) i)) {
                    return alertDescription;
                }
            }
            return null;
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public ContentType getContentType() {
        return ContentType.ALERT;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        String strD = zzp.d(i);
        sb.append(strD);
        sb.append("Alert Protocol");
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Level: ");
        sb.append(this.f44545b);
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Description: ");
        sb.append(this.f44544a);
        sb.append(zzp.c());
        if (this.d != null) {
            sb.append(strD);
            sb.append("Protocol Version: ");
            sb.append(this.d);
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    public String toString() {
        return toString(0);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public byte[] toByteArray() {
        zzl zzlVar = new zzl(2);
        zzlVar.d(this.f44545b.getCode(), 8);
        zzlVar.d(this.f44544a.getCode(), 8);
        return zzlVar.d();
    }

    public static AlertMessage c(byte[] bArr) throws aaay {
        zzf zzfVar = new zzf(bArr);
        byte bE = zzfVar.e();
        byte bE2 = zzfVar.e();
        AlertLevel levelByCode = AlertLevel.getLevelByCode(bE);
        AlertDescription descriptionByCode = AlertDescription.getDescriptionByCode(bE2);
        if (levelByCode == null) {
            throw new aaay(String.format("Unknown alert level code [%d]", Byte.valueOf(bE)), new AlertMessage(AlertLevel.FATAL, AlertDescription.DECODE_ERROR));
        }
        if (descriptionByCode == null) {
            throw new aaay(String.format("Unknown alert description code [%d]", Byte.valueOf(bE2)), new AlertMessage(AlertLevel.FATAL, AlertDescription.DECODE_ERROR));
        }
        return new AlertMessage(levelByCode, descriptionByCode);
    }

    public aabl a() {
        return this.d;
    }

    public AlertLevel c() {
        return this.f44545b;
    }

    public AlertDescription e() {
        return this.f44544a;
    }

    public int hashCode() {
        return (this.f44545b.code + (this.f44544a.code & 255)) << 8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertMessage alertMessage = (AlertMessage) obj;
        return this.f44544a == alertMessage.f44544a && this.f44545b == alertMessage.f44545b;
    }
}

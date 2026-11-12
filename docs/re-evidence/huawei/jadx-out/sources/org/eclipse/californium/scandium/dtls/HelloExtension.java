package org.eclipse.californium.scandium.dtls;

import defpackage.aaaa;
import defpackage.aaan;
import defpackage.aaau;
import defpackage.aaay;
import defpackage.aabt;
import defpackage.aabu;
import defpackage.aaby;
import defpackage.aacb;
import defpackage.aace;
import defpackage.aacf;
import defpackage.aaex;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HelloExtension {
    public static final int LENGTH_BITS = 16;

    @Deprecated
    protected static final Logger LOGGER = aaex.a((Class<?>) HelloExtension.class);
    public static final int TYPE_BITS = 16;
    private final ExtensionType type;

    protected abstract int getExtensionLength();

    protected abstract void writeExtensionTo(zzl zzlVar);

    public HelloExtension(ExtensionType extensionType) {
        if (extensionType == null) {
            throw new NullPointerException("extension type must not be null!");
        }
        this.type = extensionType;
    }

    public String toString(int i) {
        return zzp.d(i) + "Extension: " + this.type + " (" + this.type.getId() + "), " + getExtensionLength() + " bytes" + zzp.c();
    }

    public String toString() {
        return toString(0);
    }

    public final ExtensionType getType() {
        return this.type;
    }

    public int getLength() {
        return getExtensionLength() + 4;
    }

    public void writeTo(zzl zzlVar) {
        zzlVar.d(getType().getId(), 16);
        zzlVar.d(getExtensionLength(), 16);
        writeExtensionTo(zzlVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    public static HelloExtension readFrom(zzf zzfVar) throws aaay {
        HelloExtension helloExtensionA;
        int iA = zzfVar.a(16);
        zzf zzfVarD = zzfVar.d(zzfVar.a(16));
        ExtensionType extensionTypeById = ExtensionType.getExtensionTypeById(iA);
        if (extensionTypeById != null) {
            switch (AnonymousClass5.f44561c[extensionTypeById.ordinal()]) {
                case 1:
                    helloExtensionA = aace.a(zzfVarD);
                    break;
                case 2:
                    helloExtensionA = SupportedPointFormatsExtension.e(zzfVarD);
                    break;
                case 3:
                    helloExtensionA = aacf.d(zzfVarD);
                    break;
                case 4:
                    helloExtensionA = aaaa.e(zzfVarD);
                    break;
                case 5:
                    helloExtensionA = aacb.c(zzfVarD);
                    break;
                case 6:
                    helloExtensionA = MaxFragmentLengthExtension.d(zzfVarD);
                    break;
                case 7:
                    helloExtensionA = aaby.a(zzfVarD);
                    break;
                case 8:
                    helloExtensionA = aabu.b(zzfVarD);
                    break;
                case 9:
                    helloExtensionA = aaau.d(zzfVarD);
                    break;
                case 10:
                    helloExtensionA = aaan.a(zzfVarD, extensionTypeById);
                    break;
                case 11:
                    helloExtensionA = aabt.b(zzfVarD);
                    break;
                default:
                    if (extensionTypeById.replacement != ExtensionType.CONNECTION_ID) {
                        helloExtensionA = null;
                    } else {
                        helloExtensionA = aaan.a(zzfVarD, extensionTypeById);
                    }
                    break;
            }
        } else {
            helloExtensionA = null;
        }
        if (helloExtensionA != null) {
            if (zzfVarD.d()) {
                throw new aaay(String.format("Too many bytes, %d left, hello extension not completely parsed! hello extension type %d", Integer.valueOf(zzfVarD.i().length), Integer.valueOf(iA)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
            }
            return helloExtensionA;
        }
        zzfVarD.a();
        return helloExtensionA;
    }

    /* JADX INFO: renamed from: org.eclipse.californium.scandium.dtls.HelloExtension$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f44561c;

        static {
            int[] iArr = new int[ExtensionType.values().length];
            f44561c = iArr;
            try {
                iArr[ExtensionType.ELLIPTIC_CURVES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44561c[ExtensionType.EC_POINT_FORMATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44561c[ExtensionType.SIGNATURE_ALGORITHMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44561c[ExtensionType.CLIENT_CERT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44561c[ExtensionType.SERVER_CERT_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44561c[ExtensionType.MAX_FRAGMENT_LENGTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44561c[ExtensionType.SERVER_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44561c[ExtensionType.RECORD_SIZE_LIMIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44561c[ExtensionType.EXTENDED_MASTER_SECRET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44561c[ExtensionType.CONNECTION_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44561c[ExtensionType.RENEGOTIATION_INFO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public enum ExtensionType {
        SERVER_NAME(0, "server_name"),
        MAX_FRAGMENT_LENGTH(1, "max_fragment_length"),
        CLIENT_CERTIFICATE_URL(2, "client_certificate_url"),
        TRUSTED_CA_KEYS(3, "trusted_ca_keys"),
        TRUNCATED_HMAC(4, "truncated_hmac"),
        STATUS_REQUEST(5, "status_request"),
        USER_MAPPING(6, "user_mapping"),
        CLIENT_AUTHZ(7, "client_authz"),
        SERVER_AUTHZ(8, "server_authz"),
        CERT_TYPE(9, "cert_type"),
        ELLIPTIC_CURVES(10, "elliptic_curves"),
        EC_POINT_FORMATS(11, "ec_point_formats"),
        SRP(12, "srp"),
        SIGNATURE_ALGORITHMS(13, "signature_algorithms"),
        USE_SRTP(14, "use_srtp"),
        HEARTBEAT(15, "heartbeat"),
        APPLICATION_LAYER_PROTOCOL_NEGOTIATION(16, "application_layer_protocol_negotiation"),
        STATUS_REQUEST_V2(17, "status_request_v2"),
        SIGNED_CERTIFICATE_TIMESTAMP(18, "signed_certificate_timestamp"),
        CLIENT_CERT_TYPE(19, "client_certificate_type"),
        SERVER_CERT_TYPE(20, "server_certificate_type"),
        ENCRYPT_THEN_MAC(22, "encrypt_then_mac"),
        EXTENDED_MASTER_SECRET(23, "extended_master_secret"),
        RECORD_SIZE_LIMIT(28, "record_size_limit"),
        SESSION_TICKET_TLS(35, "SessionTicket TLS"),
        CONNECTION_ID(54, "Connection ID"),
        CONNECTION_ID_DEPRECATED(53, "Connection ID (deprecated)", CONNECTION_ID),
        RENEGOTIATION_INFO(65281, "renegotiation_info");

        private int id;
        private String name;
        private ExtensionType replacement;

        ExtensionType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        ExtensionType(int i, String str, ExtensionType extensionType) {
            this.id = i;
            this.name = str;
            this.replacement = extensionType;
        }

        public static ExtensionType getExtensionTypeById(int i) {
            for (ExtensionType extensionType : values()) {
                if (extensionType.getId() == i) {
                    return extensionType;
                }
            }
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        public int getId() {
            return this.id;
        }

        public ExtensionType getReplacementType() {
            return this.replacement;
        }
    }
}

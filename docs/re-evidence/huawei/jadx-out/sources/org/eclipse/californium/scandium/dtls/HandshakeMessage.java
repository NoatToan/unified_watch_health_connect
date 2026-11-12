package org.eclipse.californium.scandium.dtls;

import defpackage.aaad;
import defpackage.aaai;
import defpackage.aaaq;
import defpackage.aaas;
import defpackage.aaat;
import defpackage.aaav;
import defpackage.aaaw;
import defpackage.aaax;
import defpackage.aaay;
import defpackage.aabb;
import defpackage.aabc;
import defpackage.aabe;
import defpackage.aabg;
import defpackage.aabi;
import defpackage.aabm;
import defpackage.aabx;
import defpackage.aabz;
import defpackage.aaex;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;
import defpackage.zzz;
import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HandshakeMessage implements DTLSMessage {
    public static final int FRAGMENT_LENGTH_BITS = 24;
    public static final int FRAGMENT_OFFSET_BITS = 24;
    private static final Logger LOGGER = aaex.a((Class<?>) HandshakeMessage.class);
    public static final int MESSAGE_HEADER_LENGTH_BYTES = 12;
    public static final int MESSAGE_LENGTH_BITS = 24;
    public static final int MESSAGE_SEQ_BITS = 16;
    public static final int MESSAGE_TYPE_BITS = 8;
    private byte[] byteArray;
    private int messageSeq;
    private HandshakeMessage nextHandshakeMessage;
    private byte[] rawMessage;

    public abstract byte[] fragmentToByteArray();

    public int getFragmentOffset() {
        return 0;
    }

    public abstract int getMessageLength();

    public abstract HandshakeType getMessageType();

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public int size() {
        return getFragmentLength() + 12;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public final ContentType getContentType() {
        return ContentType.HANDSHAKE;
    }

    protected String getImplementationTypePrefix() {
        return "";
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        String strD = zzp.d(i);
        sb.append(strD);
        sb.append(getImplementationTypePrefix());
        sb.append("Handshake Message");
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Type: ");
        sb.append(getMessageType());
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Message Sequence No: ");
        sb.append(this.messageSeq);
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Length: ");
        sb.append(getMessageLength());
        sb.append(" bytes");
        sb.append(zzp.c());
        return sb.toString();
    }

    public String toString() {
        return toString(0);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSMessage
    public byte[] toByteArray() {
        byte[] bArr = this.rawMessage;
        if (bArr != null) {
            return bArr;
        }
        if (this.byteArray == null) {
            zzl zzlVar = new zzl(getFragmentLength() + 12);
            writeTo(zzlVar);
            this.byteArray = zzlVar.d();
        }
        return this.byteArray;
    }

    public void writeTo(zzl zzlVar) {
        zzlVar.d(getMessageType().getCode(), 8);
        zzlVar.d(getMessageLength(), 24);
        zzlVar.d(this.messageSeq, 16);
        zzlVar.d(getFragmentOffset(), 24);
        zzlVar.d(getFragmentLength(), 24);
        zzlVar.a(fragmentToByteArray());
    }

    protected void fragmentChanged() {
        this.byteArray = null;
    }

    public static HandshakeMessage fromByteArray(byte[] bArr) throws aaay {
        HandshakeMessage handshakeMessageC;
        try {
            zzf zzfVar = new zzf(bArr, false);
            int i = 0;
            HandshakeMessage handshakeMessage = null;
            HandshakeMessage handshakeMessage2 = null;
            while (true) {
                int iA = zzfVar.a(8);
                HandshakeType typeByCode = HandshakeType.getTypeByCode(iA);
                if (typeByCode == null) {
                    throw new aaay(String.format("Cannot parse unsupported message type %d", Integer.valueOf(iA)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
                }
                LOGGER.trace("Parsing HANDSHAKE message of type [{}]", typeByCode);
                int iA2 = zzfVar.a(24);
                int iA3 = zzfVar.a(16);
                int iA4 = zzfVar.a(24);
                int iA5 = zzfVar.a(24);
                int iB = zzfVar.b() / 8;
                if (iA5 > iB) {
                    throw new aaay(String.format("Message %s fragment length %d exceeds available data %d", typeByCode, Integer.valueOf(iA5), Integer.valueOf(iB)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
                }
                zzf zzfVarD = zzfVar.d(iA5);
                int length = bArr.length - (zzfVar.b() / 8);
                if (iA2 != iA5) {
                    int i2 = iA5 + iA4;
                    if (i2 > iA2) {
                        throw new aaay(String.format("Message %s fragment %d exceeds overall length %d", typeByCode, Integer.valueOf(i2), Integer.valueOf(iA2)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
                    }
                    handshakeMessageC = new aaav(typeByCode, iA2, iA3, iA4, zzfVarD.i());
                } else {
                    if (iA4 != 0) {
                        throw new aaay(String.format("Message %s unexpected fragment offset", typeByCode), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
                    }
                    try {
                        handshakeMessageC = fromReader(typeByCode, zzfVarD, null);
                    } catch (e unused) {
                        handshakeMessageC = aabc.c(typeByCode);
                    }
                    handshakeMessageC.rawMessage = Arrays.copyOfRange(bArr, i, length);
                    handshakeMessageC.setMessageSeq(iA3);
                }
                if (handshakeMessage == null) {
                    handshakeMessage = handshakeMessageC;
                } else {
                    handshakeMessage2.setNextHandshakeMessage(handshakeMessageC);
                }
                if (!zzfVar.d()) {
                    return handshakeMessage;
                }
                handshakeMessage2 = handshakeMessageC;
                i = length;
            }
        } catch (IllegalArgumentException e2) {
            LOGGER.debug("Handshake message malformed", (Throwable) e2);
            throw new aaay("Handshake message malformed, " + e2.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
        }
    }

    public static HandshakeMessage fromGenericHandshakeMessage(aabc aabcVar, aabb aabbVar) throws aaay {
        try {
            HandshakeType messageType = aabcVar.getMessageType();
            LOGGER.trace("Parsing HANDSHAKE message of type [{}]", messageType);
            byte[] byteArray = aabcVar.toByteArray();
            HandshakeMessage handshakeMessageFromReader = fromReader(messageType, new zzf(aabcVar.fragmentToByteArray(), false), aabbVar);
            handshakeMessageFromReader.rawMessage = byteArray;
            handshakeMessageFromReader.setMessageSeq(aabcVar.getMessageSeq());
            handshakeMessageFromReader.setNextHandshakeMessage(aabcVar.getNextHandshakeMessage());
            return handshakeMessageFromReader;
        } catch (IllegalArgumentException e2) {
            LOGGER.debug("Handshake message malformed", (Throwable) e2);
            throw new aaay("Handshake message malformed, " + e2.getMessage(), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
        }
    }

    private static HandshakeMessage fromReader(HandshakeType handshakeType, zzf zzfVar, aabb aabbVar) throws aaay {
        HandshakeMessage aabgVar;
        AnonymousClass5 anonymousClass5 = null;
        String str = "HandshakeParameter must not be null!";
        switch (AnonymousClass5.f44551c[handshakeType.ordinal()]) {
            case 1:
                aabgVar = new aabg();
                break;
            case 2:
                aabgVar = aaai.c(zzfVar);
                break;
            case 3:
                aabgVar = aabx.a(zzfVar);
                break;
            case 4:
                aabgVar = aabe.b(zzfVar);
                break;
            case 5:
                if (aabbVar == null) {
                    throw new e(str, anonymousClass5);
                }
                aabgVar = zzz.c(zzfVar, aabbVar.e());
                break;
                break;
            case 6:
                if (aabbVar == null) {
                    throw new e(str, anonymousClass5);
                }
                aabgVar = readServerKeyExchange(zzfVar, aabbVar.b());
                break;
                break;
            case 7:
                aabgVar = CertificateRequest.c(zzfVar);
                break;
            case 8:
                aabgVar = new aabz();
                break;
            case 9:
                aabgVar = aaad.d(zzfVar);
                break;
            case 10:
                if (aabbVar == null) {
                    throw new e(str, anonymousClass5);
                }
                aabgVar = readClientKeyExchange(zzfVar, aabbVar.b());
                break;
                break;
            case 11:
                aabgVar = aaaw.b(zzfVar);
                break;
            default:
                throw new aaay(String.format("Cannot parse unsupported message type %s", handshakeType), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNEXPECTED_MESSAGE));
        }
        if (zzfVar.d()) {
            throw new aaay(String.format("Too many bytes, %d left, message not completely parsed! message type %s", Integer.valueOf(zzfVar.b() / 8), handshakeType), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECODE_ERROR));
        }
        return aabgVar;
    }

    /* JADX INFO: renamed from: org.eclipse.californium.scandium.dtls.HandshakeMessage$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f44551c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CipherSuite.KeyExchangeAlgorithm.values().length];
            d = iArr;
            try {
                iArr[CipherSuite.KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CipherSuite.KeyExchangeAlgorithm.PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CipherSuite.KeyExchangeAlgorithm.ECDHE_PSK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[HandshakeType.values().length];
            f44551c = iArr2;
            try {
                iArr2[HandshakeType.HELLO_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44551c[HandshakeType.CLIENT_HELLO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44551c[HandshakeType.SERVER_HELLO.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44551c[HandshakeType.HELLO_VERIFY_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44551c[HandshakeType.CERTIFICATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44551c[HandshakeType.SERVER_KEY_EXCHANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44551c[HandshakeType.CERTIFICATE_REQUEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44551c[HandshakeType.SERVER_HELLO_DONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44551c[HandshakeType.CERTIFICATE_VERIFY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44551c[HandshakeType.CLIENT_KEY_EXCHANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44551c[HandshakeType.FINISHED.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private static HandshakeMessage readServerKeyExchange(zzf zzfVar, CipherSuite.KeyExchangeAlgorithm keyExchangeAlgorithm) throws aaay {
        int i = AnonymousClass5.d[keyExchangeAlgorithm.ordinal()];
        if (i == 1) {
            return aaax.c(zzfVar);
        }
        if (i == 2) {
            return aabm.c(zzfVar);
        }
        if (i == 3) {
            return aaat.c(zzfVar);
        }
        throw new aaay("Unsupported key exchange algorithm", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
    }

    private static HandshakeMessage readClientKeyExchange(zzf zzfVar, CipherSuite.KeyExchangeAlgorithm keyExchangeAlgorithm) throws aaay {
        int i = AnonymousClass5.d[keyExchangeAlgorithm.ordinal()];
        if (i == 1) {
            return aaas.a(zzfVar);
        }
        if (i == 2) {
            return aabi.d(zzfVar);
        }
        if (i == 3) {
            return aaaq.c(zzfVar);
        }
        throw new aaay("Unknown key exchange algorithm", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
    }

    public int getFragmentLength() {
        return getMessageLength();
    }

    public int getMessageSeq() {
        return this.messageSeq;
    }

    public void setMessageSeq(int i) {
        if (this.byteArray != null) {
            throw new IllegalStateException("message is already serialized!");
        }
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Handshake message sequence number " + i + " out of range [0...65535]!");
        }
        this.messageSeq = i;
    }

    public void setNextHandshakeMessage(HandshakeMessage handshakeMessage) {
        this.nextHandshakeMessage = handshakeMessage;
    }

    public HandshakeMessage getNextHandshakeMessage() {
        return this.nextHandshakeMessage;
    }

    protected final byte[] getRawMessage() {
        return this.rawMessage;
    }

    static class e extends IllegalArgumentException {
        private static final long serialVersionUID = -5365688530126068164L;

        /* synthetic */ e(String str, AnonymousClass5 anonymousClass5) {
            this(str);
        }

        private e(String str) {
            super(str);
        }
    }
}

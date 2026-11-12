package org.eclipse.californium.core.network.serialization;

import defpackage.zuu;
import defpackage.zuw;
import defpackage.zvb;
import defpackage.zvc;
import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zvi;
import defpackage.zvn;
import defpackage.zvo;
import defpackage.zwj;
import defpackage.zxx;
import defpackage.zzf;
import defpackage.zzg;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.OptionDefinition;
import org.eclipse.californium.core.coap.option.OptionRegistry;

/* JADX INFO: loaded from: classes20.dex */
public abstract class DataParser {
    protected final OptionRegistry optionRegistry;

    protected void assertValidOptions(zvi zviVar) {
    }

    @Deprecated
    protected boolean isCiriticalCustomOption(int i) {
        return false;
    }

    protected abstract zwj parseHeader(zzf zzfVar);

    public DataParser() {
        this.optionRegistry = zvo.a();
    }

    @Deprecated
    public DataParser(int[] iArr) {
        this.optionRegistry = new zvn(true, iArr == null ? OptionNumberRegistry.e() : iArr, zvo.a());
    }

    public DataParser(OptionRegistry optionRegistry) {
        this.optionRegistry = optionRegistry == null ? zvo.a() : optionRegistry;
    }

    public final Message parseMessage(zxx zxxVar) {
        if (zxxVar == null) {
            throw new NullPointerException("raw-data must not be null!");
        }
        if (zxxVar.e() == null) {
            throw new NullPointerException("raw-data connector's address must not be null!");
        }
        Message message = parseMessage(zxxVar.b());
        message.setSourceContext(zxxVar.c());
        if (message instanceof zvg) {
            ((zvg) message).e(zxxVar.e(), zxxVar.f());
        } else {
            message.setLocalAddress(zxxVar.e());
        }
        message.setNanoTimestamp(zxxVar.a());
        return message;
    }

    public final Message parseMessage(byte[] bArr) {
        String message;
        Message message2;
        zzf zzfVar = new zzf(bArr);
        zwj header = parseHeader(zzfVar);
        try {
            if (CoAP.a(header.c())) {
                message2 = parseMessage(zzfVar, header, new zvg(CoAP.Code.valueOf(header.c())));
            } else if (CoAP.f(header.c())) {
                message2 = parseMessage(zzfVar, header, new zvf(CoAP.ResponseCode.valueOf(header.c())));
            } else {
                message2 = CoAP.b(header.c()) ? parseMessage(zzfVar, header, new zvd(header.a())) : null;
            }
            if (message2 != null) {
                message2.setBytes(bArr);
                return message2;
            }
            message = "illegal message code";
            throw new zuw(message, header.e(), header.b(), header.c(), CoAP.Type.CON == header.a());
        } catch (zuw e) {
            throw e;
        } catch (zvb e2) {
            message = e2.getMessage();
        }
    }

    protected Message parseMessage(zzf zzfVar, zwj zwjVar, Message message) {
        message.setMID(zwjVar.b());
        message.setType(zwjVar.a());
        message.setToken(zwjVar.e());
        parseOptionsAndPayload(zzfVar, message);
        return message;
    }

    public void parseOptionsAndPayload(zzf zzfVar, Message message) {
        if (zzfVar == null) {
            throw new NullPointerException("reader must not be null!");
        }
        if (message == null) {
            throw new NullPointerException("message must not be null!");
        }
        int rawCode = message.getRawCode();
        zvi options = message.getOptions();
        int iDetermineValueFromNibble = 0;
        byte bE = 0;
        while (zzfVar.d() && (bE = zzfVar.e()) != -1) {
            try {
                iDetermineValueFromNibble += determineValueFromNibble(zzfVar, (bE & 240) >> 4);
                int iDetermineValueFromNibble2 = determineValueFromNibble(zzfVar, bE & 15);
                if (zzfVar.h(iDetermineValueFromNibble2)) {
                    zvc zvcVarCreateOption = createOption(rawCode, iDetermineValueFromNibble, zzfVar.b(iDetermineValueFromNibble2));
                    if (zvcVarCreateOption != null) {
                        options.b(zvcVarCreateOption);
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Message contains option of length %d with only fewer bytes left in the message", Integer.valueOf(iDetermineValueFromNibble2)));
                }
            } catch (IllegalArgumentException e) {
                throw new zuw(e.getMessage(), message.getToken(), message.getMID(), message.getRawCode(), message.isConfirmable());
            } catch (zuu e2) {
                throw new zuw(e2.getMessage(), message.getToken(), message.getMID(), message.getRawCode(), message.isConfirmable(), e2.c());
            }
        }
        try {
            assertValidOptions(message.getOptions());
            if (bE == -1) {
                if (!zzfVar.d()) {
                    throw new zuw("Found payload marker (0xFF) but message contains no payload", message.getToken(), message.getMID(), message.getRawCode(), message.isConfirmable());
                }
                if (!message.isIntendedPayload()) {
                    message.setUnintendedPayload();
                }
                message.setPayload(zzfVar.i());
                message.assertPayloadMatchsBlocksize();
                return;
            }
            message.setPayload(zzg.f54809a);
        } catch (IllegalArgumentException e3) {
            throw new zuw(e3.getMessage(), message.getToken(), message.getMID(), message.getRawCode(), message.isConfirmable(), CoAP.ResponseCode.BAD_REQUEST);
        }
    }

    public zvc createOption(int i, int i2, byte[] bArr) {
        OptionDefinition definitionByNumber = this.optionRegistry.getDefinitionByNumber(i, i2);
        if (definitionByNumber != null) {
            return definitionByNumber.create(bArr);
        }
        if (!OptionNumberRegistry.c(i2)) {
            return null;
        }
        throw new IllegalArgumentException("Unknown critical option " + i2 + " is not supported!");
    }

    private static int determineValueFromNibble(zzf zzfVar, int i) {
        if (i <= 12) {
            return i;
        }
        if (i == 13) {
            return zzfVar.a(8) + 13;
        }
        if (i == 14) {
            return zzfVar.a(16) + 269;
        }
        throw new IllegalArgumentException("Message contains illegal option delta/length: " + i);
    }
}

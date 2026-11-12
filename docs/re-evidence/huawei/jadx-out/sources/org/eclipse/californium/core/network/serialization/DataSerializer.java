package org.eclipse.californium.core.network.serialization;

import defpackage.zvc;
import defpackage.zvd;
import defpackage.zve;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zvi;
import defpackage.zwj;
import defpackage.zxx;
import defpackage.zzl;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.elements.MessageCallback;

/* JADX INFO: loaded from: classes20.dex */
public abstract class DataSerializer {
    protected void assertValidOptions(zvi zviVar) {
    }

    protected abstract void serializeHeader(zzl zzlVar, zwj zwjVar);

    public final byte[] getByteArray(Message message) {
        if (message == null) {
            throw new NullPointerException("message must not be null!");
        }
        assertValidOptions(message.getOptions());
        message.assertPayloadMatchsBlocksize();
        if (message.getRawCode() == 0) {
            if (message.getType() == CoAP.Type.NON) {
                throw new IllegalArgumentException("NON message must not use code 0 (empty message)!");
            }
            if (!message.getToken().b()) {
                throw new IllegalArgumentException("Empty messages must not use a token!");
            }
            if (message.getPayloadSize() > 0) {
                throw new IllegalArgumentException("Empty messages must not contain payload!");
            }
            zzl zzlVar = new zzl(4);
            serializeEmpytMessage(zzlVar, message);
            return zzlVar.d();
        }
        if (message.getType() == CoAP.Type.RST) {
            throw new IllegalArgumentException("RST must use code 0 (empty message)!");
        }
        zzl zzlVar2 = new zzl();
        serializeMessage(zzlVar2, message);
        return zzlVar2.d();
    }

    public final zxx serializeRequest(zvg zvgVar) {
        return serializeRequest(zvgVar, null);
    }

    public final zxx serializeRequest(zvg zvgVar, MessageCallback messageCallback) {
        if (zvgVar == null) {
            throw new NullPointerException("request must not be null!");
        }
        if (zvgVar.getBytes() == null) {
            zvgVar.setBytes(getByteArray(zvgVar));
        }
        return zxx.b(zvgVar.getBytes(), zvgVar.getEffectiveDestinationContext(), messageCallback, zvgVar.j());
    }

    public final zxx serializeResponse(zvf zvfVar) {
        return serializeResponse(zvfVar, null);
    }

    public final zxx serializeResponse(zvf zvfVar, MessageCallback messageCallback) {
        if (zvfVar == null) {
            throw new NullPointerException("response must not be null!");
        }
        if (zvfVar.getBytes() == null) {
            zvfVar.setBytes(getByteArray(zvfVar));
        }
        return zxx.b(zvfVar.getBytes(), zvfVar.getEffectiveDestinationContext(), messageCallback, false);
    }

    public final zxx serializeEmptyMessage(zvd zvdVar) {
        return serializeEmptyMessage(zvdVar, null);
    }

    public final zxx serializeEmptyMessage(zvd zvdVar, MessageCallback messageCallback) {
        if (zvdVar == null) {
            throw new NullPointerException("empty-message must not be null!");
        }
        if (zvdVar.getBytes() == null) {
            zvdVar.setBytes(getByteArray(zvdVar));
        }
        return zxx.b(zvdVar.getBytes(), zvdVar.getEffectiveDestinationContext(), messageCallback, false);
    }

    protected void serializeEmpytMessage(zzl zzlVar, Message message) {
        serializeHeader(zzlVar, new zwj(1, message.getType(), zve.e, 0, message.getMID(), 0));
        zzlVar.g();
    }

    protected void serializeMessage(zzl zzlVar, Message message) {
        zzl zzlVar2 = new zzl();
        serializeOptionsAndPayload(zzlVar2, message.getOptions(), message.getPayload());
        zzlVar2.g();
        serializeHeader(zzlVar, new zwj(1, message.getType(), message.getToken(), message.getRawCode(), message.getMID(), zzlVar2.e()));
        zzlVar.g();
        zzlVar.e(zzlVar2);
    }

    public static void serializeOptionsAndPayload(zzl zzlVar, zvi zviVar, byte[] bArr) {
        if (zzlVar == null) {
            throw new NullPointerException("writer must not be null!");
        }
        if (zviVar == null) {
            throw new NullPointerException("option-set must not be null!");
        }
        int i = 0;
        for (zvc zvcVar : zviVar.d()) {
            byte[] bArrH = zvcVar.h();
            int iD = zvcVar.d();
            int i2 = iD - i;
            int optionNibble = getOptionNibble(i2);
            zzlVar.d(optionNibble, 4);
            int length = bArrH.length;
            int optionNibble2 = getOptionNibble(length);
            zzlVar.d(optionNibble2, 4);
            if (optionNibble == 13) {
                zzlVar.d(i2 - 13, 8);
            } else if (optionNibble == 14) {
                zzlVar.d(i2 - 269, 16);
            }
            if (optionNibble2 == 13) {
                zzlVar.d(length - 13, 8);
            } else if (optionNibble2 == 14) {
                zzlVar.d(length - 269, 16);
            }
            zzlVar.a(bArrH);
            i = iD;
        }
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        zzlVar.d((byte) -1);
        zzlVar.a(bArr);
    }

    private static int getOptionNibble(int i) {
        if (i <= 12) {
            return i;
        }
        if (i <= 268) {
            return 13;
        }
        if (i <= 65804) {
            return 14;
        }
        throw new IllegalArgumentException("Unsupported option delta " + i);
    }
}

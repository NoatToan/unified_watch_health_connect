package com.garmin.device.sharing.management.dtos;

import i63.c;
import j63.a;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/garmin/device/sharing/management/dtos/ConnectionInfoDto.$serializer", "Lm63/e0;", "Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "<init>", "()V", "", "Li63/c;", "childSerializers", "()[Li63/c;", "Ll63/e;", "decoder", "deserialize", "(Ll63/e;)Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "Ll63/f;", "encoder", "value", "", "serialize", "(Ll63/f;Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;)V", "Lk63/e;", "getDescriptor", "()Lk63/e;", "descriptor", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@e
public final class ConnectionInfoDto$$serializer implements e0<ConnectionInfoDto> {
    public static final ConnectionInfoDto$$serializer INSTANCE;
    private static final /* synthetic */ m1 descriptor;

    static {
        ConnectionInfoDto$$serializer connectionInfoDto$$serializer = new ConnectionInfoDto$$serializer();
        INSTANCE = connectionInfoDto$$serializer;
        m1 m1Var = new m1("com.garmin.device.sharing.management.dtos.ConnectionInfoDto", connectionInfoDto$$serializer, 4);
        m1Var.j("macAddress", false);
        m1Var.j("capabilitiesBitmask", false);
        m1Var.j("androidGarminBonding", false);
        m1Var.j("connectionType", true);
        descriptor = m1Var;
    }

    private ConnectionInfoDto$$serializer() {
    }

    @Override // m63.e0
    public c<?>[] childSerializers() {
        c[] cVarArr = ConnectionInfoDto.$childSerializers;
        c<?> cVarD = a.d(GarminBondingInfo$$serializer.INSTANCE);
        c<?> cVarD2 = a.d(cVarArr[3]);
        y1 y1Var = y1.f117048a;
        return new c[]{y1Var, y1Var, cVarD, cVarD2};
    }

    @Override // i63.b
    public ConnectionInfoDto deserialize(l63.e decoder) {
        decoder.getClass();
        k63.e f94809a = getF158591b();
        l63.c cVarC = decoder.c(f94809a);
        c[] cVarArr = ConnectionInfoDto.$childSerializers;
        int i14 = l63.c.f110557a;
        boolean z14 = true;
        int i15 = 0;
        String strR = null;
        String strR2 = null;
        GarminBondingInfo garminBondingInfo = null;
        BluetoothConnectionType bluetoothConnectionType = null;
        while (z14) {
            int iE = cVarC.e(f94809a);
            if (iE == -1) {
                z14 = false;
            } else if (iE == 0) {
                strR = cVarC.r(f94809a, 0);
                i15 |= 1;
            } else if (iE == 1) {
                strR2 = cVarC.r(f94809a, 1);
                i15 |= 2;
            } else if (iE == 2) {
                garminBondingInfo = (GarminBondingInfo) cVarC.v(f94809a, 2, GarminBondingInfo$$serializer.INSTANCE, garminBondingInfo);
                i15 |= 4;
            } else {
                if (iE != 3) {
                    hb.a.o(iE);
                    return null;
                }
                bluetoothConnectionType = (BluetoothConnectionType) cVarC.v(f94809a, 3, cVarArr[3], bluetoothConnectionType);
                i15 |= 8;
            }
        }
        cVarC.b(f94809a);
        return new ConnectionInfoDto(i15, strR, strR2, garminBondingInfo, bluetoothConnectionType, (u1) null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public void serialize(f encoder, ConnectionInfoDto value) {
        encoder.getClass();
        value.getClass();
        k63.e f94809a = getF158591b();
        d dVarC = encoder.c(f94809a);
        ConnectionInfoDto.write$Self$shared_device_management_release(value, dVarC, f94809a);
        dVarC.b(f94809a);
    }

    @Override // m63.e0
    public c<?>[] typeParametersSerializers() {
        return k1.f116970b;
    }
}

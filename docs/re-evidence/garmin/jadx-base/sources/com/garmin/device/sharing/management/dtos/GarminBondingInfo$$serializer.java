package com.garmin.device.sharing.management.dtos;

import i63.c;
import j63.a;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/garmin/device/sharing/management/dtos/GarminBondingInfo.$serializer", "Lm63/e0;", "Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "<init>", "()V", "", "Li63/c;", "childSerializers", "()[Li63/c;", "Ll63/e;", "decoder", "deserialize", "(Ll63/e;)Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "Ll63/f;", "encoder", "value", "", "serialize", "(Ll63/f;Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;)V", "Lk63/e;", "getDescriptor", "()Lk63/e;", "descriptor", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@e
public final class GarminBondingInfo$$serializer implements e0<GarminBondingInfo> {
    public static final GarminBondingInfo$$serializer INSTANCE;
    private static final /* synthetic */ m1 descriptor;

    static {
        GarminBondingInfo$$serializer garminBondingInfo$$serializer = new GarminBondingInfo$$serializer();
        INSTANCE = garminBondingInfo$$serializer;
        m1 m1Var = new m1("com.garmin.device.sharing.management.dtos.GarminBondingInfo", garminBondingInfo$$serializer, 3);
        m1Var.j("encryptionDiversifier", false);
        m1Var.j("rand", false);
        m1Var.j("longTermKey", false);
        descriptor = m1Var;
    }

    private GarminBondingInfo$$serializer() {
    }

    @Override // m63.e0
    public c<?>[] childSerializers() {
        y1 y1Var = y1.f117048a;
        return new c[]{a.d(y1Var), a.d(y1Var), a.d(y1Var)};
    }

    @Override // i63.b
    public GarminBondingInfo deserialize(l63.e decoder) {
        decoder.getClass();
        k63.e f158591b = getF158591b();
        l63.c cVarC = decoder.c(f158591b);
        int i14 = l63.c.f110557a;
        boolean z14 = true;
        int i15 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z14) {
            int iE = cVarC.e(f158591b);
            if (iE == -1) {
                z14 = false;
            } else if (iE == 0) {
                str = (String) cVarC.v(f158591b, 0, y1.f117048a, str);
                i15 |= 1;
            } else if (iE == 1) {
                str2 = (String) cVarC.v(f158591b, 1, y1.f117048a, str2);
                i15 |= 2;
            } else {
                if (iE != 2) {
                    hb.a.o(iE);
                    return null;
                }
                str3 = (String) cVarC.v(f158591b, 2, y1.f117048a, str3);
                i15 |= 4;
            }
        }
        cVarC.b(f158591b);
        return new GarminBondingInfo(i15, str, str2, str3, null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public void serialize(f encoder, GarminBondingInfo value) {
        encoder.getClass();
        value.getClass();
        k63.e f158591b = getF158591b();
        d dVarC = encoder.c(f158591b);
        GarminBondingInfo.write$Self$shared_device_management_release(value, dVarC, f158591b);
        dVarC.b(f158591b);
    }

    @Override // m63.e0
    public c<?>[] typeParametersSerializers() {
        return k1.f116970b;
    }
}

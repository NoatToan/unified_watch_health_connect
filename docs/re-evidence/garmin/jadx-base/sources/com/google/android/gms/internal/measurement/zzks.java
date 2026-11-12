package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkr;
import com.google.android.gms.internal.measurement.zzks;
import java.io.IOException;
import java.util.List;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzks<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkr<MessageType, BuilderType>> implements zznm {
    protected int zza = 0;

    public static void zzce(Iterable iterable, List list) {
        zzkr.zzaU(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final zzlh zzcb() {
        try {
            int iZzcn = zzcn();
            zzlh zzlhVar = zzlh.zzb;
            byte[] bArr = new byte[iZzcn];
            int i14 = zzlm.zzb;
            zzlk zzlkVar = new zzlk(bArr, 0, iZzcn);
            zzcB(zzlkVar);
            return zzle.zza(zzlkVar, bArr);
        } catch (IOException e4) {
            String name = getClass().getName();
            q2.v(e0.h(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e4);
            return null;
        }
    }

    public final byte[] zzcc() {
        try {
            int iZzcn = zzcn();
            byte[] bArr = new byte[iZzcn];
            int i14 = zzlm.zzb;
            zzlk zzlkVar = new zzlk(bArr, 0, iZzcn);
            zzcB(zzlkVar);
            zzlkVar.zzE();
            return bArr;
        } catch (IOException e4) {
            String name = getClass().getName();
            q2.v(e0.h(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e4);
            return null;
        }
    }

    public int zzcd(zznx zznxVar) {
        throw null;
    }
}

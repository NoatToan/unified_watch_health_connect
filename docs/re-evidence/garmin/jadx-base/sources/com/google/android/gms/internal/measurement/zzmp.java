package com.google.android.gms.internal.measurement;

import j20.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public final class zzmp {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzli(bArr, 0, 0, false, null).zza(0);
        } catch (zzmr e4) {
            l2.t(e4);
        }
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        x.l("messageType");
        return null;
    }

    public static int zzb(boolean z14) {
        return z14 ? 1231 : 1237;
    }

    public static int zzc(int i14, byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            i14 = (i14 * 31) + bArr[i17];
        }
        return i14;
    }

    public static boolean zzd(zznm zznmVar) {
        if (zznmVar instanceof zzkt) {
            throw null;
        }
        return false;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import j20.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public final class zzep {
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
            new zzdh(bArr, 0, 0, false, null).zza(0);
        } catch (zzer e4) {
            l2.t(e4);
        }
    }

    public static int zza(boolean z14) {
        return z14 ? 1231 : 1237;
    }

    public static int zzb(int i14, byte[] bArr, int i15, int i16) {
        for (int i17 = i15; i17 < i15 + i16; i17++) {
            i14 = (i14 * 31) + bArr[i17];
        }
        return i14;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        x.l("messageType");
        return null;
    }
}

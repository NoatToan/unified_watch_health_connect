package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbm {
    Object[] zza;
    int zzb;
    zzbl zzc;

    public zzbm(int i14) {
        this.zza = new Object[i14 + i14];
        this.zzb = 0;
    }

    private final void zzb(int i14) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i15 = i14 + i14;
        if (i15 > length) {
            if (i15 > length) {
                length = length + (length >> 1) + 1;
                if (length < i15) {
                    int iHighestOneBit = Integer.highestOneBit(i15 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.zza = Arrays.copyOf(objArr, length);
        }
    }

    public final zzbm zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzbf.zza(key, value);
            Object[] objArr = this.zza;
            int i14 = this.zzb;
            int i15 = i14 + i14;
            objArr[i15] = key;
            objArr[i15 + 1] = value;
            this.zzb = i14 + 1;
        }
        return this;
    }

    public zzbm() {
        this(4);
    }
}

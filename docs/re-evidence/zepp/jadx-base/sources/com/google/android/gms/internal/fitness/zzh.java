package com.google.android.gms.internal.fitness;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.List;
import javax.annotation.concurrent.NotThreadSafe;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@NotThreadSafe
public final class zzh {
    public static <T> int zza(@Nullable T t, List<T> list) {
        if (t == null) {
            return -1;
        }
        int iIndexOf = list.indexOf(t);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        list.add(t);
        return list.size() - 1;
    }
}

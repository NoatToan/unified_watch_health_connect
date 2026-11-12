package com.google.android.play.agesignals;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public class AgeSignalsManagerFactory {
    private AgeSignalsManagerFactory() {
    }

    public static AgeSignalsManager create(Context context) {
        return new zzb(new zzj(context));
    }
}

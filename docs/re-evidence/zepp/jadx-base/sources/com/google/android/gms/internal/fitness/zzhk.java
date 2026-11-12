package com.google.android.gms.internal.fitness;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzhk extends IOException {
    private zzik a;

    public zzhk(String str) {
        super(str);
        this.a = null;
    }

    public static zzhj a() {
        return new zzhj("Protocol message tag had invalid wire type.");
    }
}

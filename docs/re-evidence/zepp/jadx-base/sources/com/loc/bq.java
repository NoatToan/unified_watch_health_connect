package com.loc;

import android.content.Context;

/* JADX INFO: loaded from: classes18.dex */
public final class bq extends bp {
    private Context b;
    private boolean c;

    public bq(Context context) {
        this.c = false;
        this.b = context;
        this.c = false;
    }

    @Override // com.loc.bp
    public final boolean a() {
        return n.q(this.b) == 1 || this.c;
    }
}

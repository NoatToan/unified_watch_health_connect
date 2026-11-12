package com.amap.api.mapcore.util;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class jp extends jo {
    private Context a;
    private boolean b;

    public jp(Context context, boolean z) {
        this.b = false;
        this.a = context;
        this.b = z;
    }

    @Override // com.amap.api.mapcore.util.jo
    public final boolean c() {
        return gn.p(this.a) == 1 || this.b;
    }
}

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class jn extends jo {
    public int a;
    public long b;
    private String d;
    private Context e;

    public jn(Context context, int i, String str, jo joVar) {
        super(joVar);
        this.a = i;
        this.d = str;
        this.e = context;
    }

    @Override // com.amap.api.mapcore.util.jo
    public final void a_(boolean z) {
        super.a_(z);
        if (z) {
            String str = this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.b = jCurrentTimeMillis;
            hl.a(this.e, str, String.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // com.amap.api.mapcore.util.jo
    public final boolean c() {
        if (this.b == 0) {
            String strA = hl.a(this.e, this.d);
            this.b = TextUtils.isEmpty(strA) ? 0L : Long.parseLong(strA);
        }
        return System.currentTimeMillis() - this.b >= ((long) this.a);
    }
}

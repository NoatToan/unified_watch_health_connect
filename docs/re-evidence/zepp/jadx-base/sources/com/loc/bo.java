package com.loc;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public final class bo extends bp {
    private int b;
    private long c;
    private String d;
    private Context e;

    public bo(Context context, int i, String str, bp bpVar) {
        super(bpVar);
        this.b = i;
        this.d = str;
        this.e = context;
    }

    @Override // com.loc.bp
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            String str = this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.c = jCurrentTimeMillis;
            z.a(this.e, str, String.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // com.loc.bp
    public final boolean a() {
        if (this.c == 0) {
            String strA = z.a(this.e, this.d);
            this.c = TextUtils.isEmpty(strA) ? 0L : Long.parseLong(strA);
        }
        return System.currentTimeMillis() - this.c >= ((long) this.b);
    }
}

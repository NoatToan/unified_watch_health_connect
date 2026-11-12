package com.xiaomi.push;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
final class o0 extends C1648r.b {
    public final /* synthetic */ Context a;

    public o0(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.C1648r.b
    public void b() {
        ArrayList arrayList;
        synchronized (cx.d) {
            arrayList = new ArrayList(cx.e);
            cx.e.clear();
        }
        cx.k(this.a, arrayList);
    }
}

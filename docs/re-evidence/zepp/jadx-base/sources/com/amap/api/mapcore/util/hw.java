package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hw {
    private Context a;
    private gt b;
    private boolean c = true;
    private String d = "40C27E38DCAD404B5465362914090908";
    private js e = new js("40C27E38DCAD404B5465362914090908");

    public final void a(Context context, boolean z, String str, String str2, String str3, String[] strArr) {
        try {
            gt gtVarA = new gt.a(str, str2, str).a(strArr).a(str3).a();
            if (context == null) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.b = gtVarA;
            this.c = z;
            this.e.a(applicationContext, gtVarA);
        } catch (gi unused) {
        }
    }

    public final void a(String str, String str2) {
        List<gt> listA = this.e.a(this.a);
        hy hyVar = hy.a.a;
        hy.a(this.a, str, str2, listA, this.c, this.b);
    }
}

package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ix f2940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2941c = true;
    private String d = "40C27E38DCAD404B5465362914090908";
    private kb e = new kb("40C27E38DCAD404B5465362914090908");

    public final void a(Context context, boolean z, String str, String str2, String str3, String[] strArr) {
        try {
            ix ixVarA = new ix.a(str, str2, str).a(strArr).a(str3).a();
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.f2939a = applicationContext;
                this.f2940b = ixVarA;
                this.f2941c = z;
                this.e.a(applicationContext, ixVarA);
            }
        } catch (ik unused) {
        }
    }

    public final void a(String str, String str2) {
        List<ix> listA = this.e.a(this.f2939a);
        jz jzVar = jz.a.f2942a;
        jz.a(this.f2939a, str, str2, listA, this.f2941c, this.f2940b);
    }
}

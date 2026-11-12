package com.unionpay;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.unionpay.utils.UPUtils;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private IUnionCallback c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f10769a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f10770b = false;
    private final Handler.Callback d = new h(this);

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList a(Context context, String str, String str2) {
        ArrayList arrayListB = null;
        try {
            String strA = com.unionpay.utils.b.a(str, str2);
            if (!TextUtils.isEmpty(strA)) {
                if (this.c != null && !this.f10770b) {
                    arrayListB = com.unionpay.utils.b.b(context, strA);
                }
                UPUtils.a(context, str, "direct_configs");
                UPUtils.a(context, str2, "direct_mode");
            }
        } catch (Exception unused) {
        }
        return arrayListB;
    }

    public static /* synthetic */ boolean c(g gVar) {
        gVar.f10770b = true;
        return true;
    }

    public final void a(Context context, String str, String str2, IUnionCallback iUnionCallback, boolean z) {
        String strD = UPUtils.d(com.unionpay.utils.b.a(str));
        this.f10770b = z;
        this.c = iUnionCallback;
        if (this.f10769a == null) {
            this.f10769a = new Handler(this.d);
        }
        if (!TextUtils.isEmpty(strD)) {
            Executors.newSingleThreadExecutor().execute(new i(this, strD, str2, context, str, iUnionCallback));
        } else {
            if (z || iUnionCallback == null) {
                return;
            }
            iUnionCallback.onError("03", "unknown error");
            this.f10770b = true;
        }
    }
}

package com.xmlywind.sdk.splash;

import android.app.Activity;
import android.view.ViewGroup;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.LoadAdRequest;

/* JADX INFO: loaded from: classes22.dex */
public class c {
    public g a;

    public c(Activity activity, LoadAdRequest loadAdRequest, b bVar) {
        this.a = new g(activity, loadAdRequest, bVar);
    }

    public void a(Activity activity) {
        this.a.a(activity);
    }

    public boolean a() {
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(false);
            return true;
        }
        SigmobLog.e("loadAd adManager is null");
        return false;
    }

    public boolean a(ViewGroup viewGroup) {
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(viewGroup);
            return true;
        }
        SigmobLog.e("showAd adManager is null");
        return false;
    }

    public void b(Activity activity) {
        this.a.b(activity);
    }

    public boolean b() {
        g gVar = this.a;
        if (gVar != null) {
            return gVar.g();
        }
        return false;
    }

    public void c(Activity activity) {
        this.a.c(activity);
    }
}

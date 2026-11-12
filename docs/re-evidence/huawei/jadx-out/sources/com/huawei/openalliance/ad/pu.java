package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.HiAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f20078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f20079c;

    public void b() {
        if (this.f20078b == null) {
            hw.c("PreloadWebViewProcessor", "preloadHost, ad record is null");
            return;
        }
        if (!this.f20079c.cP()) {
            hw.a("PreloadWebViewProcessor", "preload host is not enable");
            return;
        }
        String strC = this.f20078b.C();
        final String strS = com.huawei.openalliance.ad.utils.dg.s(strC);
        String strM = com.huawei.openalliance.ad.utils.dg.m(strC);
        if (TextUtils.isEmpty(strM) || !this.f20079c.cQ().contains(strM)) {
            hw.a("PreloadWebViewProcessor", "host url empty or list not contains host");
        } else {
            hw.b("PreloadWebViewProcessor", "preload host : %s", com.huawei.openalliance.ad.utils.dg.h(strS));
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.pu.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.huawei.openalliance.ad.views.web.b.a(pu.this.f20077a).a(strS, true);
                    } catch (Exception e) {
                        hw.c("PreloadWebViewProcessor", "preload host err: %s", e.getClass().getSimpleName());
                    }
                }
            });
        }
    }

    public void a(ContentRecord contentRecord) {
        this.f20078b = contentRecord;
    }

    public void a() {
        if (!HiAd.a(this.f20077a).m()) {
            hw.b("PreloadWebViewProcessor", "app disable preload webView");
            return;
        }
        ContentRecord contentRecord = this.f20078b;
        if (contentRecord == null || contentRecord.j() == null) {
            hw.b("PreloadWebViewProcessor", "contentRecord or meataData is null");
            return;
        }
        final String strC = this.f20078b.C();
        int iH = this.f20078b.j().H();
        if (iH == 0) {
            hw.b("PreloadWebViewProcessor", "not preload url. enablePreload: %s", Integer.valueOf(iH));
            return;
        }
        List<Integer> listO = this.f20078b.O();
        if (com.huawei.openalliance.ad.utils.bm.a(listO) || a(listO)) {
            hw.b("PreloadWebViewProcessor", "not preload url. ClickActionList not support");
            return;
        }
        int iT = fp.b(this.f20077a).t();
        if (iT == 1 || (iT == 0 && com.huawei.openalliance.ad.utils.cb.a(this.f20077a))) {
            hw.b("PreloadWebViewProcessor", "preLoad");
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.pu.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.huawei.openalliance.ad.views.web.b.a(pu.this.f20077a).a(strC, false);
                    } catch (Throwable unused) {
                        hw.c("PreloadWebViewProcessor", "preLoad fail");
                    }
                }
            });
        }
    }

    private boolean a(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        String strU = fp.b(this.f20077a).u();
        if (TextUtils.isEmpty(strU)) {
            return true;
        }
        return Collections.disjoint(Arrays.asList(strU.split(",")), arrayList);
    }

    public pu(Context context) {
        this.f20077a = context.getApplicationContext();
        this.f20079c = fp.b(context);
    }
}

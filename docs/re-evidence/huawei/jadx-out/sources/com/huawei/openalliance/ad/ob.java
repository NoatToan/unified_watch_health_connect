package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes41.dex */
public class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f19814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19815c;
    private rc d;
    private cv e;
    private WeakReference<View> f;

    public boolean a(Long l, Integer num, Integer num2) {
        View view = this.f.get();
        if (view == null) {
            return false;
        }
        String strE = com.huawei.openalliance.ad.utils.dk.e(view);
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(l).a(num).b(num2).a(this.f19815c).e(vv.b(view)).d(strE);
        this.d.a(c0229a.a());
        return true;
    }

    public boolean a(Context context, MaterialClickInfo materialClickInfo) {
        hw.b("SplashIconViewPresenter", "onClick");
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f19813a, this.f19814b, new HashMap(0));
        if (!aVarA.a()) {
            return false;
        }
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar.b(aVarA.c()).a((Integer) 23).a(materialClickInfo).d(this.f19815c);
        this.d.a(aVar.a());
        return true;
    }

    public void a(View view) {
        this.f = new WeakReference<>(view);
    }

    public void a(int i) {
        this.e.b(this.f19814b, i);
    }

    public void a() {
        this.e.d(this.f19814b);
    }

    public ob(Context context, ContentRecord contentRecord, String str) {
        this.f19813a = context.getApplicationContext();
        this.f19814b = contentRecord;
        this.f19815c = str;
        this.d = new pc(this.f19813a, new tc(this.f19813a, 1), contentRecord);
        this.e = new com.huawei.openalliance.ad.analysis.c(this.f19813a);
    }
}

package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.hms.ads.uiengine.common.IInterstitialView;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;

/* JADX INFO: loaded from: classes12.dex */
public class nk extends jr<IInterstitialView> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IInterstitialView f19744c;
    private Context d;
    private com.huawei.openalliance.ad.inter.data.d e;

    public void b() {
    }

    public void c() {
        this.f19384b.b();
    }

    public void a(boolean z) {
        this.f19384b.b(z);
    }

    public void a(com.huawei.openalliance.ad.uriaction.interfaces.a aVar, Integer num, MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        if (num == null) {
            num = 7;
        }
        aVar2.b(aVar.c()).a(num).a(materialClickInfo);
        this.f19384b.a(aVar2.a());
    }

    public void a(com.huawei.openalliance.ad.inter.data.d dVar) {
        this.e = dVar;
        this.f19383a = pf.a(dVar);
        this.f19384b.a(this.f19383a);
    }

    @Override // com.huawei.openalliance.ad.jr
    public final void a(IInterstitialView iInterstitialView) {
        this.f19744c = iInterstitialView;
    }

    public void a(long j, int i, Integer num) {
        String strF = f();
        com.huawei.openalliance.ad.inter.data.d dVar = this.e;
        if (dVar != null) {
            hw.a("InterstitialAdPresenter", "slotId: %s, contentId: %s, slot pos: %s", dVar.V(), this.e.getContentId(), strF);
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(j)).a(Integer.valueOf(i)).d(strF).e(vv.b((View) this.f19744c)).b(num);
        this.f19384b.a(c0229a.a());
    }

    public void a(long j, int i) {
        this.f19384b.a(j, i);
    }

    @Override // com.huawei.openalliance.ad.jr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IInterstitialView d() {
        return this.f19744c;
    }

    public nk(Context context, IInterstitialView iInterstitialView) {
        a(iInterstitialView);
        this.d = context;
        this.f19384b = new pc(context, new sx(context));
    }
}

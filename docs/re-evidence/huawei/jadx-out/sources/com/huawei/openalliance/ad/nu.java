package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.views.interfaces.IPPSPlacementView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class nu extends jr<IPPSPlacementView> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19778c;
    private com.huawei.openalliance.ad.inter.data.h d;

    public void b() {
        this.f19384b.b();
    }

    public void a(boolean z) {
        if (this.f19384b == null) {
            return;
        }
        this.f19384b.b(z);
    }

    public void a(com.huawei.openalliance.ad.inter.data.h hVar) {
        this.d = hVar;
        this.f19383a = pq.a(hVar);
        Context context = this.f19778c;
        this.f19384b = new pc(context, new ta(context), this.f19383a);
    }

    public void a(MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.inter.data.h hVar = this.d;
        if (hVar == null) {
            return;
        }
        hVar.e(true);
        hw.a("PlacementAdPresenter", "begin to deal click");
        HashMap map = new HashMap();
        map.put("appId", this.d.getAppMarketAppId());
        map.put("thirdId", this.d.getPromotionChannel());
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f19778c, this.f19383a, map);
        if (aVarA.a()) {
            a(aVarA, materialClickInfo);
        }
    }

    public void a(long j, int i, Integer num) {
        String strF = f();
        com.huawei.openalliance.ad.inter.data.h hVar = this.d;
        if (hVar != null) {
            hw.a("PlacementAdPresenter", "slotId: %s, contentId: %s, slot pos: %s", hVar.M(), this.d.getContentId(), strF);
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(j)).a(Integer.valueOf(i)).b(num).d(strF).e(g()).a(com.huawei.openalliance.ad.utils.b.a(d()));
        this.f19384b.a(c0229a.a());
    }

    public void a() {
        this.f19384b.b(0, 0);
    }

    private void a(com.huawei.openalliance.ad.uriaction.interfaces.a aVar, MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar2.b(aVar.c()).a((Integer) 7).a(materialClickInfo).d(com.huawei.openalliance.ad.utils.b.a(d()));
        this.f19384b.a(aVar2.a());
    }

    public nu(Context context, IPPSPlacementView iPPSPlacementView) {
        this.f19778c = context;
        a(iPPSPlacementView);
        this.f19384b = new pc(context, new ta(context));
    }
}

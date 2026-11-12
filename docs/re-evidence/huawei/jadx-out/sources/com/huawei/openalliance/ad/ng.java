package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f19720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaterialClickInfo f19721c;

    public void a() {
        long jI;
        int iK;
        if (this.f19720b == null) {
            return;
        }
        hw.b("AppDownBtnPresenter", "rpt imp for app detail activity.");
        Context context = this.f19719a;
        pc pcVar = new pc(context, sw.a(context, this.f19720b.f()));
        pcVar.a(this.f19720b);
        if (this.f19720b.j() != null) {
            jI = this.f19720b.j().i();
            iK = this.f19720b.j().k();
        } else {
            jI = 500;
            iK = 50;
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229aB = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a().a(Long.valueOf(jI)).a(Integer.valueOf(iK)).b((Integer) 2).a(com.huawei.openalliance.ad.utils.b.a((Object) this.f19719a)).d(Constants.DEF_SLOT_POSITION).b(this.f19720b.aC());
        MaterialClickInfo materialClickInfo = this.f19721c;
        if (materialClickInfo != null && com.huawei.openalliance.ad.utils.dg.r(materialClickInfo.f())) {
            c0229aB.e(this.f19721c.f());
        }
        pcVar.a(c0229aB.a());
    }

    public ng(Context context, ContentRecord contentRecord, MaterialClickInfo materialClickInfo) {
        this.f19719a = context;
        this.f19720b = contentRecord;
        this.f19721c = materialClickInfo;
    }
}

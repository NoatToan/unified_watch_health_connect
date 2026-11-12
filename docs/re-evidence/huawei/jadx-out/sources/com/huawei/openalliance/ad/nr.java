package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdShowListener;
import com.huawei.openalliance.ad.views.interfaces.IPPSLinkedView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class nr extends jr<IPPSLinkedView> implements oh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19772c;
    private LinkedSplashAd d;
    private AdActionListener e;
    private AdShowListener f;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    public boolean k() {
        return this.h;
    }

    @Override // com.huawei.openalliance.ad.oh
    public void j() {
        this.f19384b.f();
    }

    @Override // com.huawei.openalliance.ad.oh
    public void i() {
        this.f19384b.c();
    }

    @Override // com.huawei.openalliance.ad.oh
    public void h() {
        this.f19384b.p();
    }

    @Override // com.huawei.openalliance.ad.oh
    public void c() {
        this.f19384b.b(0, 0);
    }

    public void b(boolean z) {
        this.h = z;
    }

    @Override // com.huawei.openalliance.ad.oh
    public void b(long j, long j2, long j3, long j4) {
        this.f19384b.b(j, j2, (int) j3, (int) j4);
    }

    @Override // com.huawei.openalliance.ad.oh
    public void b() {
        this.f19384b.b();
    }

    @Override // com.huawei.openalliance.ad.oh
    public boolean a(int i, MaterialClickInfo materialClickInfo) {
        LinkedSplashAd linkedSplashAd = this.d;
        if (linkedSplashAd == null) {
            return false;
        }
        linkedSplashAd.f(true);
        df.a((IAd) this.d);
        hw.b("PPSLinkedVideoViewPresenter", "begin to deal click");
        HashMap map = new HashMap();
        map.put("appId", this.d.T());
        map.put("thirdId", this.d.S());
        a(map);
        AdActionListener adActionListener = this.e;
        if (adActionListener != null) {
            adActionListener.onAdClick();
        }
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f19772c, this.f19383a, map);
        boolean zA = aVarA.a();
        if (zA) {
            a(aVarA, i, materialClickInfo);
        }
        com.huawei.openalliance.ad.inter.c.a(this.f19772c).a(false);
        return zA;
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(boolean z) {
        this.f19384b.b(z);
    }

    @Override // com.huawei.openalliance.ad.jr, com.huawei.openalliance.ad.oh
    public void a(String str) {
        super.a(str);
        c(false);
        b(false);
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(Long l, Integer num, Integer num2) {
        String splashViewSlotPosition;
        LinkedSplashAd linkedSplashAd = this.d;
        boolean zA = com.huawei.openalliance.ad.utils.c.a(linkedSplashAd != null ? linkedSplashAd.d() : null, num2);
        if (l() && (!zA || k())) {
            hw.c("PPSLinkedVideoViewPresenter", "show event already reported before, ignore this");
            return;
        }
        IPPSLinkedView iPPSLinkedViewD = d();
        if (iPPSLinkedViewD != null) {
            splashViewSlotPosition = iPPSLinkedViewD.getSplashViewSlotPosition();
            LinkedSplashAd linkedSplashAd2 = this.d;
            if (linkedSplashAd2 != null) {
                hw.a("PPSLinkedVideoViewPresenter", "slotId: %s, contentId: %s, slot pos: %s", linkedSplashAd2.getSlotId(), this.d.getContentId(), splashViewSlotPosition);
            }
        } else {
            splashViewSlotPosition = "";
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(l).a(num).b(num2).e(g()).a(com.huawei.openalliance.ad.utils.b.a(d()));
        if (!com.huawei.openalliance.ad.utils.dg.b(splashViewSlotPosition)) {
            c0229a.d(splashViewSlotPosition);
        }
        this.f19384b.a(c0229a.a());
        if (zA) {
            b(true);
        }
        if (l()) {
            return;
        }
        c(true);
        if (this.f != null && this.f19383a != null) {
            HashMap map = new HashMap();
            map.put(AdShowExtras.PRELOAD_MODE, String.valueOf(fl.a(this.f19772c).a(this.f19383a.n())));
            map.put(AdShowExtras.DOWNLOAD_SOURCE, com.huawei.openalliance.ad.utils.d.a(this.f19383a.V()));
            this.f.onAdShowed(map);
        }
        AdActionListener adActionListener = this.e;
        if (adActionListener != null) {
            adActionListener.onAdShowed();
        }
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(AdShowListener adShowListener) {
        this.f = adShowListener;
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(AdActionListener adActionListener) {
        this.e = adActionListener;
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(LinkedSplashAd linkedSplashAd) {
        this.d = linkedSplashAd;
        if (linkedSplashAd != null) {
            this.f19383a = linkedSplashAd.P();
        }
        this.f19384b = new pc(this.f19772c, new tc(this.f19772c, 1), this.f19383a);
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(long j, long j2, long j3, long j4) {
        this.f19384b.c(j, j2, (int) j3, (int) j4);
    }

    @Override // com.huawei.openalliance.ad.oh
    public void a(long j, int i) {
        this.f19384b.a(j, i);
    }

    @Override // com.huawei.openalliance.ad.jr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IPPSLinkedView d() {
        return (IPPSLinkedView) super.d();
    }

    private boolean l() {
        return this.g;
    }

    private void c(boolean z) {
        this.g = z;
    }

    private void a(Map<String, String> map) {
        LinkedSplashAd linkedSplashAd;
        if (map == null || map.isEmpty() || (linkedSplashAd = this.d) == null || linkedSplashAd.getVideoInfo() == null) {
            return;
        }
        int iB = this.d.getVideoInfo().b();
        if (Math.abs(this.d.getVideoInfo().getVideoDuration() - iB) < 1000) {
            iB = 0;
        }
        hw.b("PPSLinkedVideoViewPresenter", "buildLinkedAdConfig, duration: %s, set progress from LinkedSplash view:%s ", Integer.valueOf(this.d.getVideoInfo().getVideoDuration()), Integer.valueOf(iB));
        map.put(MapKeyNames.LINKED_CUSTOM_RETURN_VIDEO_DIRECT, this.d.getVideoInfo().f() ? "true" : "false");
        map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH, this.d.getVideoInfo().getSoundSwitch());
        map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS, String.valueOf(iB));
        map.put(MapKeyNames.LINKED_SPLASH_MEDIA_PATH, this.d.K());
        map.put(MapKeyNames.LINKED_CUSTOM_SHOW_ID, this.d.getShowId());
    }

    private void a(com.huawei.openalliance.ad.uriaction.interfaces.a aVar, int i, MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar2.b(aVar.c()).a(Integer.valueOf(i)).a(materialClickInfo).d(com.huawei.openalliance.ad.utils.b.a(d()));
        this.f19384b.a(aVar2.a());
    }

    public nr(Context context, IPPSLinkedView iPPSLinkedView) {
        this.f19772c = context.getApplicationContext();
        a(iPPSLinkedView);
        this.f19384b = new pc(this.f19772c, new tc(this.f19772c, 1));
    }
}

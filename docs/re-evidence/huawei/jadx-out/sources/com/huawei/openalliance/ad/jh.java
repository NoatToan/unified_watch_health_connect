package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes41.dex */
public class jh extends jf {
    private final int p;

    @Override // com.huawei.openalliance.ad.jf
    protected void d(ContentRecord contentRecord) {
    }

    @Override // com.huawei.openalliance.ad.jf
    protected String z() {
        return "CacheAdMediator" + this.p;
    }

    @Override // com.huawei.openalliance.ad.jf
    protected String r() {
        return String.valueOf(1);
    }

    @Override // com.huawei.openalliance.ad.ri
    public List<ContentRecord> b(AdContentRsp adContentRsp) {
        List<ContentRecord> listA = po.a(adContentRsp, this.n);
        if (k() != null) {
            a(listA, k().b(), 1);
        }
        return listA;
    }

    @Override // com.huawei.openalliance.ad.ri
    public List<ContentRecord> a(AdContentRsp adContentRsp) {
        return po.b(adContentRsp, this.n);
    }

    @Override // com.huawei.openalliance.ad.jj
    public void B() {
        hw.b("CacheAdMediator", "onAdFailToDisplay");
        j();
    }

    @Override // com.huawei.openalliance.ad.jj
    public void A() {
        hw.b("CacheAdMediator", "start");
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP == null) {
            c(-4);
            j();
            return;
        }
        Context context = lVarP.getContext();
        db dbVar = new db(context);
        dbVar.a(new dd(context));
        boolean z = com.huawei.openalliance.ad.utils.d.r(context) == 1;
        hw.b("CacheAdMediator", "readScreenOn: %s", Boolean.valueOf(z));
        ContentRecord contentRecord = (dbVar.a() || z) ? null : (ContentRecord) com.huawei.openalliance.ad.utils.dj.b(new Callable<ContentRecord>() { // from class: com.huawei.openalliance.ad.jh.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ContentRecord call() {
                jh.this.h();
                return jh.this.D();
            }
        });
        this.g = true;
        if (contentRecord != null) {
            e(contentRecord);
            if (contentRecord.F() == 12) {
                if (d() != 1 || !(c() instanceof LinkedAdListener)) {
                    c(1200);
                    B();
                    C();
                    return;
                }
                LinkedAdListener linkedAdListener = (LinkedAdListener) c();
                LinkedSplashAd linkedSplashAdA = ph.a(context, contentRecord);
                hw.b("CacheAdMediator", "on content find, linkedAd loaded. ");
                this.l.b(System.currentTimeMillis());
                linkedAdListener.onLinkedAdLoaded(linkedSplashAdA);
                this.k = contentRecord;
                C();
                g(200);
                return;
            }
            this.e.a(contentRecord);
            if (!c(contentRecord)) {
                c(ErrorCode.ERROR_CODE_NULL_AD_VIEW);
                B();
            }
        } else {
            hw.b("CacheAdMediator", "show sloganView");
            lVarP.a(new ht() { // from class: com.huawei.openalliance.ad.jh.2
                @Override // com.huawei.openalliance.ad.ht
                public void b() {
                    hw.b("CacheAdMediator", "on Slogan Show End");
                    com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.jh.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            jh.this.c(ErrorCode.ERROR_CODE_NO_CACHE_AD);
                            jh.this.j();
                        }
                    });
                }

                @Override // com.huawei.openalliance.ad.ht
                public void a() {
                    hw.b("CacheAdMediator", "on Slogan Reach Min Show Time");
                }
            });
        }
        C();
    }

    private ContentRecord a(String str, int i, long j, Map<String, Integer> map) {
        hw.b("CacheAdMediator", "query CachedContentV3");
        List<ContentRecord> listB = ex.b(this.o).b(str, i, j, this.n);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return null;
        }
        for (ContentRecord contentRecord : listB) {
            if (contentRecord != null && !com.huawei.openalliance.ad.utils.c.a(contentRecord.aW(), map)) {
                hw.b("CacheAdMediator", "v3 content got");
                return contentRecord;
            }
        }
        return null;
    }

    private ContentRecord a(String str, int i, long j) {
        boolean z = false;
        boolean z2 = false;
        ContentRecord contentRecord = null;
        ContentRecord contentRecord2 = null;
        for (ContentRecord contentRecord3 : this.d.b(str, i, j, this.n)) {
            if (contentRecord3 != null) {
                if (z && z2) {
                    break;
                }
                if (!z && contentRecord3.F() == 12) {
                    contentRecord2 = contentRecord3;
                    z = true;
                } else if (!z2 && contentRecord3.F() != 12) {
                    contentRecord = contentRecord3;
                    z2 = true;
                }
            }
        }
        hw.b("CacheAdMediator", "linkedSupportMode:%s, firstNormal: %s, firstLink:%s", Integer.valueOf(d()), contentRecord, contentRecord2);
        if (d() != 1) {
            df.a((ContentRecord) null);
            return contentRecord;
        }
        if (contentRecord2 == null) {
            df.a((ContentRecord) null);
            return contentRecord;
        }
        if (contentRecord != null) {
            df.a(contentRecord);
            return contentRecord2;
        }
        df.a((ContentRecord) null);
        return contentRecord2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContentRecord D() {
        AdSlotParam adSlotParamK = k();
        if (adSlotParamK == null) {
            return null;
        }
        String str = adSlotParamK.a().get(0);
        int iB = adSlotParamK.b();
        long jBa = this.f19309c.ba();
        ContentRecord contentRecordA = a(str, iB, jBa, adSlotParamK.G());
        return contentRecordA == null ? a(str, iB, jBa) : contentRecordA;
    }

    private void C() {
        com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.jh.3
            @Override // java.lang.Runnable
            public void run() {
                jh.this.m();
            }
        }, 2000L);
    }

    public jh(com.huawei.openalliance.ad.views.interfaces.l lVar) {
        super(lVar);
        this.p = hashCode();
    }
}

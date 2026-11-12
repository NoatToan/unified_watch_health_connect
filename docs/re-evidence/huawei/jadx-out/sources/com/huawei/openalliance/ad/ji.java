package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ji extends jf {
    boolean p;
    private final int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private ContentRecord u;
    private boolean v;

    private boolean a(boolean z, boolean z2, boolean z3) {
        if (z && z2) {
            return true;
        }
        return z2 && z3;
    }

    @Override // com.huawei.openalliance.ad.jf
    protected String z() {
        return "RealtimeAdMediator" + this.q;
    }

    @Override // com.huawei.openalliance.ad.jf
    protected String r() {
        return String.valueOf(2);
    }

    @Override // com.huawei.openalliance.ad.jf
    protected void d(ContentRecord contentRecord) {
        hw.b(z(), "on content loaded, content record: " + com.huawei.openalliance.ad.utils.dg.b(contentRecord));
        this.u = contentRecord;
        this.e.a(contentRecord);
        e(contentRecord);
        if (contentRecord == null) {
            hw.a(z(), "ERROR_CODE_EMPTY_REQ_PARAM: contentRecord is null. ");
            c(ErrorCode.ERROR_CODE_NO_AD_RECORD);
            B();
            return;
        }
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP == null) {
            c(ErrorCode.ERROR_CODE_NULL_AD_VIEW);
            B();
            return;
        }
        Context context = lVarP.getContext();
        dd ddVar = new dd(context);
        if (ddVar.a()) {
            c(ErrorCode.ERROR_CODE_TRIGGER_DISTURB);
            B();
            return;
        }
        if (contentRecord.F() != 12) {
            if (!this.r && !this.s) {
                hw.b(z(), "slogan hasn't reach min show time or end, show ad later");
                return;
            }
            if (ddVar.a()) {
                c(ErrorCode.ERROR_CODE_TRIGGER_DISTURB);
                B();
                return;
            }
            boolean zC = c(contentRecord);
            this.p = true;
            if (zC) {
                return;
            }
            b(ErrorCode.ERROR_CODE_NULL_AD_VIEW);
            return;
        }
        if (d() == 1 && (c() instanceof LinkedAdListener)) {
            hw.b(z(), "on linked loaded, sloganShowEnd:" + this.s);
            if (!this.s) {
                LinkedAdListener linkedAdListener = (LinkedAdListener) c();
                LinkedSplashAd linkedSplashAdA = ph.a(context, contentRecord);
                hw.b(z(), "on content loaded, linkedAd loaded. ");
                this.l.b(System.currentTimeMillis());
                linkedAdListener.onLinkedAdLoaded(linkedSplashAdA);
                this.k = contentRecord;
                this.v = true;
                g(200);
                return;
            }
        }
        com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.ji.5
            @Override // java.lang.Runnable
            public void run() {
                ji.this.c(1200);
                ji.this.B();
            }
        });
    }

    public void c(boolean z) {
        this.p = z;
    }

    @Override // com.huawei.openalliance.ad.ri
    public List<ContentRecord> b(AdContentRsp adContentRsp) {
        ArrayList arrayList = new ArrayList();
        if (adContentRsp != null) {
            List<Ad30> listC = adContentRsp.c();
            if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
                int i = 0;
                Content content = null;
                Content content2 = null;
                Content content3 = null;
                String str = "";
                String str2 = str;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                while (i < listC.size() && !z) {
                    Ad30 ad30 = listC.get(i);
                    String strA = ad30.a();
                    String strG = ad30.g();
                    int iB = ad30.b();
                    if (200 != iB) {
                        hw.b("RealtimeAdMediator", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), strA);
                    }
                    List<Content> listC2 = ad30.c();
                    if (!com.huawei.openalliance.ad.utils.bm.a(listC2)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Content content4 : listC2) {
                            if (a(z4, z3, z2)) {
                                z = true;
                                break;
                            }
                            ArrayList arrayList3 = arrayList;
                            if (!z4 && content4.f() == 12) {
                                content = content4;
                                z4 = true;
                            } else if (!z3 && content4.f() != 12 && content4.J() == 0) {
                                content2 = content4;
                                z3 = true;
                            } else if (!z2 && content4.f() != 12 && content4.J() != 0) {
                                content3 = content4;
                                z2 = true;
                            }
                            arrayList2.add(content4.g());
                            arrayList = arrayList3;
                        }
                        a(p().getContext().getApplicationContext(), arrayList2);
                        i++;
                        str = strA;
                        str2 = strG;
                        listC = listC;
                        arrayList = arrayList;
                    }
                }
                hw.b(z(), "linkedSupportMode:%s, firstNormal: %s, firstLink:%s, firstSpare: %s", Integer.valueOf(d()), content2, content, content3);
                String str3 = str2;
                a(content, content2, content3, adContentRsp, str, str3);
                return a(adContentRsp, str, content, content2, content3, str3);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.ri
    public List<ContentRecord> a(AdContentRsp adContentRsp) {
        return po.b(adContentRsp, this.n);
    }

    public boolean C() {
        return this.p;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void B() {
        boolean zBu = this.f19309c.bu();
        hw.b(z(), "onAdFailToDisplay - finishSplashOnMinSlogan: %s reachMinSloganShowTime: %s sloganShowEnd: %s", Boolean.valueOf(zBu), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
        this.t = true;
        if ((zBu && this.r) || this.s) {
            j();
        }
    }

    @Override // com.huawei.openalliance.ad.jj
    public void A() {
        hw.b(z(), "start");
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP == null) {
            c(-4);
            j();
        } else {
            m();
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ji.1
                @Override // java.lang.Runnable
                public void run() {
                    ji.this.h();
                }
            });
            lVarP.a(new ht() { // from class: com.huawei.openalliance.ad.ji.2
                @Override // com.huawei.openalliance.ad.ht
                public void b() {
                    com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.ji.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ji.this.D();
                        }
                    });
                }

                @Override // com.huawei.openalliance.ad.ht
                public void a() {
                    com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.ji.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ji.this.E();
                        }
                    });
                }
            });
            n();
        }
    }

    private void h(int i) {
        c(i);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContentRecord b(AdContentRsp adContentRsp, String str, Content content, String str2) {
        if (content == null) {
            return null;
        }
        content.a(adContentRsp.h(), this.n);
        ContentRecord contentRecordA = pn.a(str, content, this.n, str2);
        if (contentRecordA != null) {
            contentRecordA.D(adContentRsp.q());
            contentRecordA.E(adContentRsp.r());
            contentRecordA.U(adContentRsp.v());
            contentRecordA.y(adContentRsp.k());
        }
        return contentRecordA;
    }

    private void a(final Content content, final Content content2, final Content content3, final AdContentRsp adContentRsp, final String str, final String str2) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ji.4
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ji.this.b(adContentRsp, str, content, str2));
                arrayList.add(ji.this.b(adContentRsp, str, content2, str2));
                arrayList.add(ji.this.b(adContentRsp, str, content3, str2));
                ji jiVar = ji.this;
                jiVar.a(arrayList, jiVar.k().b(), 2);
            }
        });
    }

    private void a(final Context context, final List<String> list) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ji.3
            @Override // java.lang.Runnable
            public void run() {
                dk.a(context, "normal").a(list, false);
                dk.a(context, "ar").a(list, false);
            }
        });
    }

    private List<ContentRecord> a(AdContentRsp adContentRsp, String str, Content content, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(adContentRsp, str, content, str2));
        return arrayList;
    }

    private List<ContentRecord> a(AdContentRsp adContentRsp, String str, Content content, Content content2, Content content3, String str2) {
        ContentRecord contentRecordA;
        if (d() != 1 || content == null) {
            return a(adContentRsp, content3, content2, str, str2);
        }
        if (content2 != null) {
            content2.a(adContentRsp.h(), this.n);
            contentRecordA = pn.a(str, content2, this.n, str2);
        } else {
            contentRecordA = null;
        }
        df.a(contentRecordA);
        return a(adContentRsp, str, content, str2);
    }

    private List<ContentRecord> a(AdContentRsp adContentRsp, Content content, Content content2, String str, String str2) {
        df.a((ContentRecord) null);
        if (content != null) {
            content.a(adContentRsp.h(), this.n);
            df.b(pn.a(str, content, this.n, str2));
        } else {
            df.b((ContentRecord) null);
        }
        if (content2 != null) {
            return a(adContentRsp, str, content2, str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        hw.b(z(), "doOnReachMinSloganShowTime, adHasShown:%s ", Boolean.valueOf(this.p));
        this.r = true;
        if (!this.p && this.u != null && !this.v) {
            hw.b(z(), "doOnReachMinSloganShowTime Ad has been loaded, but not shown yet");
            d(this.u);
            return;
        }
        boolean zBu = this.f19309c.bu();
        hw.b(z(), "doOnReachMinSloganShowTime finish splash: %s adFailToDisplay: %s", Boolean.valueOf(zBu), Boolean.valueOf(this.t));
        if (zBu && this.t) {
            hw.b(z(), "ad fail to load when reach min slogan show time");
            c(ErrorCode.ERROR_CODE_OTHER);
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        hw.b(z(), "doOnShowSloganEnd, adHasShown:%s ", Boolean.valueOf(this.p));
        this.s = true;
        if (this.t) {
            hw.b(z(), "Ad fails to display or loading timeout, ad dismiss");
            c(ErrorCode.ERROR_CODE_OTHER);
            j();
            return;
        }
        if (this.p) {
            return;
        }
        hw.b(z(), "doOnShowSloganEnd Ad has been loaded, but not shown yet");
        if (!this.v) {
            if (this.u != null) {
                hw.b(z(), "show splash");
                d(this.u);
                return;
            } else {
                synchronized (this) {
                    if (!d(-2)) {
                        hw.b(z(), "no ad to display when slogan ends");
                        h(-2);
                    }
                }
                return;
            }
        }
        ContentRecord contentRecordG = df.g();
        this.u = contentRecordG;
        if (contentRecordG == null) {
            hw.b(z(), "linked loaded, do not call play");
            h(-6);
        } else {
            hw.b(z(), "linked loaded, display normal when slogan ends");
            d(this.u);
            df.a((ContentRecord) null);
            e(1202);
        }
    }

    public ji(com.huawei.openalliance.ad.views.interfaces.l lVar) {
        super(lVar);
        this.q = hashCode();
        this.r = false;
        this.s = false;
        this.p = false;
        this.t = false;
        this.v = false;
    }
}

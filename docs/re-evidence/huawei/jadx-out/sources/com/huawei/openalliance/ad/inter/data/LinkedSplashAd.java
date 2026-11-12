package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import com.huawei.openalliance.ad.os;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class LinkedSplashAd extends e implements ILinkedSplashAd {
    private ContentRecord i;
    private transient LinkedAdListener j;
    private transient IAdEvent k;
    private int l;
    private String m;
    private String n;
    private String o;
    private int p;
    private int q;
    private String r;
    private boolean s = false;

    @Override // com.huawei.openalliance.ad.inter.data.e, com.huawei.openalliance.ad.inter.data.INativeAd
    public List<FeedbackInfo> getFeedbackInfoList() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.ILinkedSplashAd
    public void setListener(LinkedAdListener linkedAdListener) {
        this.j = linkedAdListener;
    }

    @Override // com.huawei.openalliance.ad.inter.data.ILinkedSplashAd
    public boolean isFromExsplash() {
        return this.s;
    }

    public void i(int i) {
        this.q = i;
    }

    public void h(int i) {
        this.p = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.ILinkedSplashAd
    public String getSoundSwitch() {
        return getVideoInfo() != null ? getVideoInfo().getSoundSwitch() : "n";
    }

    @Override // com.huawei.openalliance.ad.inter.data.ILinkedSplashAd
    public LinkedAdListener getListener() {
        return this.j;
    }

    public void g(int i) {
        this.l = i;
    }

    public void e(boolean z) {
        this.s = z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public IAdEvent b(Context context) {
        if (this.k == null) {
            if (context != null) {
                this.k = new os(context.getApplicationContext(), this);
            } else {
                hw.b("LinkedSplashAd", " context is null, ");
            }
        }
        return this.k;
    }

    public void a(ContentRecord contentRecord) {
        this.i = contentRecord;
    }

    public List<AdvertiserInfo> Q() {
        ContentRecord contentRecord = this.i;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.aU();
    }

    public ContentRecord P() {
        return this.i;
    }

    public int O() {
        return this.q;
    }

    public int N() {
        return this.p;
    }

    public String M() {
        return this.o;
    }

    public String L() {
        return this.n;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public String K() {
        return this.r;
    }

    public String J() {
        return this.m;
    }

    public int I() {
        return this.l;
    }

    public void D(String str) {
        this.o = str;
    }

    public void C(String str) {
        this.n = str;
    }

    @Override // com.huawei.openalliance.ad.inter.data.e
    public void B(String str) {
        this.r = str;
    }

    public void A(String str) {
        this.m = str;
    }
}

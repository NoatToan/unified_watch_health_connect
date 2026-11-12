package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.views.PPSInterstitialVideoView;

/* JADX INFO: loaded from: classes12.dex */
public class nl extends jr<PPSInterstitialVideoView> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PPSInterstitialVideoView f19745c;
    private Context d;
    private cv e;

    public void c() {
        this.f19384b.f();
    }

    public void b(long j, long j2, long j3, long j4) {
        this.f19384b.b(j, j2, (int) j3, (int) j4);
    }

    public void b() {
        this.f19384b.c();
    }

    @Override // com.huawei.openalliance.ad.jr
    public final void a(PPSInterstitialVideoView pPSInterstitialVideoView) {
        this.f19745c = pPSInterstitialVideoView;
    }

    public void a(ContentRecord contentRecord) {
        this.f19383a = contentRecord;
        Context context = this.d;
        this.f19384b = new pc(context, new sx(context), this.f19383a);
    }

    public void a(long j, long j2, long j3, long j4) {
        this.f19384b.c(j, j2, (int) j3, (int) j4);
    }

    public void a(final long j, final long j2, final long j3) {
        if (j == 0 || j >= j3 || this.e == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.nl.1
            @Override // java.lang.Runnable
            public void run() {
                long j4 = j3;
                long j5 = j;
                long j6 = j2;
                long j7 = 0;
                if (j6 != 0 && j6 < j4) {
                    j7 = j4 - j6;
                }
                nl.this.e.a(nl.this.f19383a, j4 - j5, j7);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.jr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PPSInterstitialVideoView d() {
        return this.f19745c;
    }

    public nl(Context context, PPSInterstitialVideoView pPSInterstitialVideoView) {
        a(pPSInterstitialVideoView);
        this.d = context;
        this.f19384b = new pc(context, new sx(context));
        this.e = new com.huawei.openalliance.ad.analysis.c(this.d);
    }
}

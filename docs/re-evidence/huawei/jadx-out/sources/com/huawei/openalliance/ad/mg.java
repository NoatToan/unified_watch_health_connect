package com.huawei.openalliance.ad;

import android.content.Context;
import com.iab.omid.library.huawei.adsession.AdEvents;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.media.InteractionType;
import com.iab.omid.library.huawei.adsession.media.MediaEvents;
import com.iab.omid.library.huawei.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class mg extends mf implements me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19616a = false;
    private mk d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<MediaEvents> f19617b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<AdEvents> f19618c = new ArrayList();
    private boolean e = false;
    private int f = 0;
    private float g = 0.0f;
    private boolean h = false;

    @Override // com.huawei.openalliance.ad.mv
    public void l() {
        this.f = 1;
        if (this.f19617b.isEmpty()) {
            hw.c(n(), "resume, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "resume ");
                    }
                    mediaEvents.resume();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "resume, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void k() {
        if (this.f19617b.isEmpty() || 1 != this.f) {
            return;
        }
        try {
            this.f = 2;
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "pause ");
                    }
                    mediaEvents.pause();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "pause, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void j() {
        if (!this.h) {
            this.f = 0;
        }
        if (this.f19617b.isEmpty()) {
            hw.c(n(), "skipped, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "skipped ");
                    }
                    mediaEvents.skipped();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "skipped, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void i() {
        if (this.f19617b.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "bufferFinish ");
                    }
                    mediaEvents.bufferFinish();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "bufferFinish, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void h() {
        if (this.f19617b.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "bufferStart ");
                    }
                    mediaEvents.bufferStart();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "bufferStart, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void g() {
        this.g = 0.0f;
        this.f = 0;
        if (this.f19617b.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "complete ");
                    }
                    mediaEvents.complete();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "complete, fail");
        }
    }

    public void f() {
        if (this.f19618c.isEmpty()) {
            hw.c(n(), "impressionOccurred, mAdEventList isEmpty");
            return;
        }
        try {
            Iterator<AdEvents> it = this.f19618c.iterator();
            while (it.hasNext()) {
                it.next().impressionOccurred();
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "impressionOccurred, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mf
    void d() {
        if (this.f19617b.isEmpty()) {
            hw.c(n(), "thirdQuartile, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    hw.b(n(), "thirdQuartile ");
                    mediaEvents.thirdQuartile();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "thirdQuartile, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mf
    void c() {
        if (this.f19617b.isEmpty()) {
            hw.c(n(), "midpoint, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    hw.b(n(), "midpoint ");
                    mediaEvents.midpoint();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "midpoint, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void b(boolean z) {
        this.h = z;
    }

    @Override // com.huawei.openalliance.ad.mv
    public void b(float f) {
        mk mkVar;
        hw.b(n(), "volumeChange %s", Float.valueOf(f));
        this.e = Math.abs(f - 0.0f) < 1.0E-8f;
        if (this.f19617b.isEmpty() || this.f != 1) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null && (mkVar = this.d) != null) {
                    if (f == -1.0f) {
                        mediaEvents.volumeChange(mkVar.a(this.e));
                    } else {
                        mediaEvents.volumeChange(f);
                    }
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "volumeChange, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.me
    public void b() {
        if (hw.a()) {
            hw.a(n(), "release ");
        }
        this.f = 0;
        mk mkVar = this.d;
        if (mkVar != null) {
            mkVar.a();
        }
        com.huawei.openalliance.ad.utils.bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.mg.2
            @Override // java.lang.Runnable
            public void run() {
                mg.this.f19617b.clear();
                mg.this.f19618c.clear();
            }
        }, 200L);
    }

    @Override // com.huawei.openalliance.ad.mf
    void a(VastProperties vastProperties) {
        if (this.f19618c.isEmpty()) {
            return;
        }
        try {
            for (AdEvents adEvents : this.f19618c) {
                if (adEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "loaded ");
                    }
                    adEvents.loaded(vastProperties);
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "loaded, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mf
    void a(InteractionType interactionType) {
        if (this.f19617b.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "adUserInteraction ");
                    }
                    mediaEvents.adUserInteraction(interactionType);
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "adUserInteraction, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(my myVar) {
        VastProperties vastPropertiesB;
        if (myVar == null || !my.a() || (vastPropertiesB = myVar.b()) == null) {
            return;
        }
        a(vastPropertiesB);
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(mw mwVar) {
        InteractionType interactionTypeA;
        if (!mw.a() || (interactionTypeA = mw.a(mwVar)) == null) {
            return;
        }
        a(interactionTypeA);
    }

    @Override // com.huawei.openalliance.ad.me
    public void a(mq mqVar) {
        String strN;
        String str;
        if (f19616a) {
            if ((mqVar instanceof lx) && e()) {
                lx lxVar = (lx) mqVar;
                Context contextE = lxVar.e();
                if (contextE != null) {
                    hw.b(n(), "Set VolumeChange observer");
                    mk mkVar = new mk(contextE);
                    this.d = mkVar;
                    mkVar.a(new mk.b() { // from class: com.huawei.openalliance.ad.mg.1
                        @Override // com.huawei.openalliance.ad.mk.b
                        public void a() {
                            mg.this.m();
                        }
                    });
                }
                List<AdSession> listB = lxVar.b();
                if (!listB.isEmpty()) {
                    for (AdSession adSession : listB) {
                        if (adSession != null) {
                            if (hw.a()) {
                                hw.a(n(), "setAdSessionAgent, add mVideoEventsList");
                            }
                            this.f19617b.add(MediaEvents.createMediaEvents(adSession));
                            this.f19618c.add(AdEvents.createAdEvents(adSession));
                        }
                    }
                    return;
                }
                strN = n();
                str = "adSessionList is empty";
            } else {
                strN = n();
                str = "adsessionAgent is null";
            }
            hw.b(strN, str);
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(float f, boolean z) {
        this.f = 1;
        this.e = z;
        a(f, z ? 0.0f : 1.0f);
    }

    @Override // com.huawei.openalliance.ad.mf
    void a(float f, float f2) {
        if (this.f19617b.isEmpty()) {
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    if (hw.a()) {
                        hw.a(n(), "start，duration: %s ", Float.valueOf(f));
                    }
                    mediaEvents.start(f, f2);
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "start, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(float f) {
        int iA = mj.a(this.g, f);
        if (hw.a()) {
            hw.a(n(), "onProgress %s", Integer.valueOf(iA));
        }
        if (iA == 25) {
            this.g = iA;
            a();
        } else if (iA == 50) {
            this.g = iA;
            c();
        } else {
            if (iA != 75) {
                return;
            }
            this.g = iA;
            d();
        }
    }

    @Override // com.huawei.openalliance.ad.mf
    void a() {
        if (this.f19617b.isEmpty()) {
            hw.c(n(), "firstQuartile, mVideoEventsList isEmpty");
            return;
        }
        try {
            for (MediaEvents mediaEvents : this.f19617b) {
                if (mediaEvents != null) {
                    hw.b(n(), "firstQuartile");
                    mediaEvents.firstQuartile();
                }
            }
        } catch (IllegalStateException unused) {
            hw.b(n(), "firstQuartile, fail");
        }
    }

    private String n() {
        return "VideoEventAgent" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (hw.a()) {
            hw.a(n(), "volumeChangeInner %s", Boolean.valueOf(this.e));
        }
        b(this.e ? 0.0f : 1.0f);
    }

    public static boolean e() {
        return f19616a;
    }

    mg() {
    }

    static {
        f19616a = mi.a("com.iab.omid.library.huawei.adsession.media.MediaEvents") && mi.a("com.iab.omid.library.huawei.adsession.AdEvents");
    }
}

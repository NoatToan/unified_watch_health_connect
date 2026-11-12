package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.views.interfaces.n;

/* JADX INFO: loaded from: classes41.dex */
public abstract class np<V extends com.huawei.openalliance.ad.views.interfaces.n> extends jr<V> implements oj<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f19766c;
    private boolean d = false;
    private boolean e = false;
    private CountDownTimer f;

    protected abstract void b(String str);

    @Override // com.huawei.openalliance.ad.oj
    public boolean h() {
        return this.e;
    }

    @Override // com.huawei.openalliance.ad.oj
    public void c() {
        jj adMediator = d().getAdMediator();
        if (adMediator != null) {
            adMediator.v();
        }
    }

    @Override // com.huawei.openalliance.ad.oj
    public void b(Long l) {
        a(11, "feedback", l);
    }

    public void b(ContentRecord contentRecord) {
        jj adMediator = d().getAdMediator();
        if (adMediator != null) {
            adMediator.f(contentRecord);
        }
    }

    @Override // com.huawei.openalliance.ad.oj
    public void b() {
        hw.b("PPSBaseViewPresenter", "onDisplayTimeUp hasShowFinish: %s", Boolean.valueOf(this.d));
        if (this.d) {
            return;
        }
        this.d = true;
        a(true);
        jj adMediator = d().getAdMediator();
        if (adMediator != null) {
            adMediator.u();
        }
    }

    @Override // com.huawei.openalliance.ad.oj
    public void a(Long l) {
        a(10, "onWhyThisAd", l);
    }

    @Override // com.huawei.openalliance.ad.oj
    public void a(ContentRecord contentRecord, long j, int i) {
        jj adMediator = d().getAdMediator();
        if (adMediator != null) {
            adMediator.a(contentRecord, j, i);
        }
    }

    @Override // com.huawei.openalliance.ad.oj
    public void a(ContentRecord contentRecord) {
        this.f19383a = contentRecord;
        if (contentRecord == null) {
            hw.c("PPSBaseViewPresenter", "loadAdMaterial contentRecord is null");
            d().a(-7);
            return;
        }
        hw.b("PPSBaseViewPresenter", "loadAdMaterial");
        String strB = contentRecord.B();
        if (TextUtils.isEmpty(strB)) {
            strB = contentRecord.A();
        }
        this.f19384b.a(contentRecord);
        b(strB);
    }

    @Override // com.huawei.openalliance.ad.oj
    public void a(int i, int i2, Long l) {
        hw.b("PPSBaseViewPresenter", "skip ad - hasShowFinish: %s", Boolean.valueOf(this.d));
        if (this.d) {
            return;
        }
        a(false);
        this.d = true;
        a();
    }

    @Override // com.huawei.openalliance.ad.oj
    public void a(int i, int i2, ContentRecord contentRecord, Long l, MaterialClickInfo materialClickInfo, int i3) {
        hw.b("PPSBaseViewPresenter", "onTouch");
        jj adMediator = d().getAdMediator();
        if (adMediator == null || !adMediator.a(i, i2, contentRecord, l, materialClickInfo, i3)) {
            return;
        }
        if (this.d) {
            hw.b("PPSBaseViewPresenter", "onDoActionSucc hasShowFinish");
            return;
        }
        this.d = true;
        a(false);
        a();
    }

    @Override // com.huawei.openalliance.ad.oj
    public void a(int i) {
        hw.b("PPSBaseViewPresenter", "startDisplayDurationCountTask duration: %d", Integer.valueOf(i));
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(i, 500L) { // from class: com.huawei.openalliance.ad.np.1
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                int iMax = Math.max(1, (int) Math.ceil((j * 1.0f) / 1000.0f));
                hw.a("PPSBaseViewPresenter", "count down time: %d seconds: %d", Long.valueOf(j), Integer.valueOf(iMax));
                ((com.huawei.openalliance.ad.views.interfaces.n) np.this.d()).c(iMax);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                ((com.huawei.openalliance.ad.views.interfaces.n) np.this.d()).c(1);
                np.this.b();
            }
        };
        this.f = countDownTimer2;
        countDownTimer2.start();
    }

    public void a() {
        hw.b("PPSBaseViewPresenter", "cancelDisplayDurationCountTask");
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f = null;
        }
    }

    private void a(boolean z) {
        hw.b("PPSBaseViewPresenter", "setNormalEnd, isNormalEnd= %s", Boolean.valueOf(z));
        this.e = z;
    }

    private void a(int i, String str, Long l) {
        if (this.d) {
            hw.b("PPSBaseViewPresenter", "%s hasShowFinish", str);
            return;
        }
        this.d = true;
        c();
        a();
    }

    public np(Context context, V v, int i) {
        this.f19766c = context.getApplicationContext();
        this.f19384b = new pc(this.f19766c, new tc(this.f19766c, i));
        a(v);
    }
}

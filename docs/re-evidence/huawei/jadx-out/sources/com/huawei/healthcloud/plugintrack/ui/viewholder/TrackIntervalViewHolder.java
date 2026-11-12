package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.interval.IntervalCard;
import com.huawei.ui.commonui.interval.IntervalCardData;
import com.huawei.ui.commonui.interval.IntervalData;
import defpackage.jxk;
import defpackage.njy;
import defpackage.qqv;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrackIntervalViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f11408a;
    private int d;
    private IntervalCardData f;
    private float g;
    private float h;
    private IntervalCard i;
    private int j;
    private IntervalClickListener k;
    private boolean l;
    private float m;
    private boolean n;
    private int o;
    private int p;
    private float q;
    private IntervalCard r;
    private IntervalCardData s;
    private float t;
    private int u;
    private final int v;
    private float w;
    private final ShowDataPanelLayout x;
    private View y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11410c = qrs.d(BaseApplication.b(), 110.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11409b = qrs.d(BaseApplication.b(), 96.0f);
    private int e = qrs.d(BaseApplication.b(), 214.0f);

    public interface IntervalClickListener {
        void intervalClick(TrackMainFragmentShowType trackMainFragmentShowType);
    }

    public TrackIntervalViewHolder(int i, View view, ShowDataPanelLayout showDataPanelLayout) {
        this.v = i;
        this.y = view;
        this.x = showDataPanelLayout;
        d();
        e();
    }

    public void d() {
        this.f11408a = (LinearLayout) this.y.findViewById(R.id.interval_card_layout);
        g();
        i();
    }

    private void g() {
        IntervalCard intervalCard = (IntervalCard) this.y.findViewById(R.id.heart_interval_card);
        this.i = intervalCard;
        intervalCard.setShadowVisibility(true);
        this.i.setFlowingLightVisibility(true);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: jur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39078c.d(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        IntervalClickListener intervalClickListener = this.k;
        if (intervalClickListener != null) {
            intervalClickListener.intervalClick(TrackMainFragmentShowType.HEART_RATE);
        }
    }

    private void i() {
        IntervalCard intervalCard = (IntervalCard) this.y.findViewById(R.id.power_interval_card);
        this.r = intervalCard;
        intervalCard.setShadowVisibility(true);
        this.r.setFlowingLightVisibility(true);
        this.r.setOnClickListener(new View.OnClickListener() { // from class: jus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39079c.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        IntervalClickListener intervalClickListener = this.k;
        if (intervalClickListener != null) {
            intervalClickListener.intervalClick(TrackMainFragmentShowType.POWER);
        }
    }

    public void c(boolean z, Context context) {
        IntervalCard intervalCard = this.i;
        if (intervalCard == null) {
            ReleaseLogUtil.d("Track_TrackIntervalViewHolder", "refreshHeartCard mHeartCard is null isDarkMode ", Boolean.valueOf(z), " context ", context);
        } else {
            intervalCard.setData(z, context, this.f);
        }
    }

    public void d(boolean z, Context context, IntervalCardData intervalCardData) {
        if (this.i == null) {
            g();
        }
        IntervalCardData.CardType cardTypeB = b(intervalCardData);
        intervalCardData.e(cardTypeB);
        intervalCardData.d(this.d);
        intervalCardData.c(this.j);
        this.f = intervalCardData;
        c(intervalCardData, true);
        c(z, context);
        if (IntervalCardData.CardType.LARGE == cardTypeB) {
            qsp.c((View) this.r, 8);
            this.i.a();
            LogUtil.a("Track_TrackIntervalViewHolder", "heart large card data with: ", intervalCardData);
        } else if (!this.l) {
            this.i.b();
        }
        qsp.c((View) this.i, 0);
        b(cardTypeB);
    }

    public void b(boolean z, Context context) {
        IntervalCard intervalCard = this.r;
        if (intervalCard == null) {
            ReleaseLogUtil.d("Track_TrackIntervalViewHolder", "refreshPowerCard mPowerCard is null isDarkMode ", Boolean.valueOf(z), " context ", context);
        } else {
            intervalCard.setData(z, context, this.s);
        }
    }

    public void a(boolean z, Context context, IntervalCardData intervalCardData) {
        if (this.r == null) {
            i();
        }
        IntervalCardData.CardType cardTypeB = b(intervalCardData);
        intervalCardData.e(cardTypeB);
        intervalCardData.d(this.d);
        intervalCardData.c(this.j);
        this.s = intervalCardData;
        c(intervalCardData, false);
        b(z, context);
        if (IntervalCardData.CardType.LARGE == cardTypeB) {
            qsp.c((View) this.i, 8);
            this.r.a();
            LogUtil.a("Track_TrackIntervalViewHolder", "power large card data with: ", intervalCardData);
        } else if (!this.l) {
            this.r.b();
        }
        qsp.c((View) this.r, 0);
        b(cardTypeB);
    }

    private IntervalCardData.CardType b(IntervalCardData intervalCardData) {
        if (intervalCardData.d() == IntervalCardData.CardType.LARGE) {
            this.d = this.e;
            this.j = this.o;
            return IntervalCardData.CardType.LARGE;
        }
        return b();
    }

    private IntervalCardData.CardType b() {
        int i = (((Boolean) jxk.f39164c.first).booleanValue() && ((Boolean) jxk.e.first).booleanValue()) ? 1 : 0;
        if (((Boolean) jxk.f39164c.second).booleanValue() && ((Boolean) jxk.e.second).booleanValue()) {
            i++;
        }
        if (i == 2) {
            this.d = this.f11410c;
            this.j = this.u;
            return IntervalCardData.CardType.SMALL;
        }
        if (i == 1) {
            this.d = this.f11409b;
            this.j = this.p;
            return IntervalCardData.CardType.MEDIUM;
        }
        this.j = 0;
        this.d = 0;
        qsp.c((View) this.f11408a, 8);
        return null;
    }

    private void c(IntervalCardData intervalCardData, boolean z) {
        float f;
        if (njy.e(intervalCardData.c())) {
            return;
        }
        if (IntervalCardData.CardType.LARGE == intervalCardData.d()) {
            f = z ? this.h : this.t;
        } else if (IntervalCardData.CardType.MEDIUM == intervalCardData.d()) {
            f = z ? this.g : this.q;
        } else {
            f = z ? this.m : this.w;
        }
        for (IntervalData intervalData : intervalCardData.c()) {
            if (intervalData != null) {
                if (intervalData.b() != null) {
                    intervalData.d((IntervalCardData.CardType.MEDIUM == intervalCardData.d() ? 3.6f : 3.0f) * f);
                } else {
                    intervalData.d(f);
                }
            }
        }
    }

    private void b(final IntervalCardData.CardType cardType) {
        if (this.r == null && this.i == null) {
            LogUtil.j("Track_TrackIntervalViewHolder", "mPowerCard and mHeartCard not init");
            return;
        }
        if (!this.n) {
            int i = this.v == 259 ? 6 : 4;
            ShowDataPanelLayout showDataPanelLayout = this.x;
            if (showDataPanelLayout == null || showDataPanelLayout.getPanelMode() != i) {
                a(cardType);
                return;
            } else {
                LogUtil.a("Track_TrackIntervalViewHolder", "power goingDefaultHeight");
                this.x.a(i, this.d, new ShowDataPanelLayout.HeightChangeListener() { // from class: juo
                    @Override // com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.HeightChangeListener
                    public final void onFinish(boolean z) {
                        this.d.b(cardType, z);
                    }
                });
                return;
            }
        }
        a(cardType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(IntervalCardData.CardType cardType, boolean z) {
        this.n = z;
        if (z) {
            a(cardType);
        }
    }

    private void a(IntervalCardData.CardType cardType) {
        f();
        if (IntervalCardData.CardType.LARGE != cardType) {
            ShowDataPanelLayout showDataPanelLayout = this.x;
            if (showDataPanelLayout == null) {
                ReleaseLogUtil.d("Track_TrackIntervalViewHolder", "adjustPanelHeight mShowDataPanelLayout is null");
            } else {
                showDataPanelLayout.b(this.d);
            }
        }
    }

    private void f() {
        if (b() == null) {
            qsp.c((View) this.f11408a, 8);
            return;
        }
        if (!((Boolean) jxk.e.first).booleanValue()) {
            qsp.c((View) this.i, 8);
        }
        if (!((Boolean) jxk.e.second).booleanValue()) {
            qsp.c((View) this.r, 8);
        }
        qsp.c((View) this.f11408a, 0);
    }

    public void c() {
        f();
        b(b());
    }

    public void d(boolean z) {
        IntervalCard intervalCard = this.r;
        if (intervalCard != null) {
            intervalCard.setShadowVisibility(z);
            this.r.setFlowingLightVisibility(z);
        }
        IntervalCard intervalCard2 = this.i;
        if (intervalCard2 != null) {
            intervalCard2.setShadowVisibility(z);
            this.i.setFlowingLightVisibility(z);
        }
    }

    public void a(boolean z) {
        IntervalCard intervalCard;
        IntervalCard intervalCard2;
        if (!z && (intervalCard2 = this.r) != null) {
            intervalCard2.a();
        }
        if (z && (intervalCard = this.i) != null) {
            intervalCard.a();
        }
        this.l = true;
    }

    public void a() {
        IntervalCard intervalCard = this.r;
        if (intervalCard != null) {
            intervalCard.b();
        }
        IntervalCard intervalCard2 = this.i;
        if (intervalCard2 != null) {
            intervalCard2.b();
        }
        this.l = false;
    }

    public void e(IntervalClickListener intervalClickListener) {
        this.k = intervalClickListener;
    }

    public void e() {
        this.p = qqv.d(BaseApplication.b()) - qrs.d(BaseApplication.b(), 24.0f);
        this.u = (qqv.d(BaseApplication.b()) - qrs.d(BaseApplication.b(), 36.0f)) / 2;
        this.o = qqv.d(BaseApplication.b()) - qrs.d(BaseApplication.b(), 28.0f);
        this.m = ((qrs.q() * 0.5f) - qrs.d(BaseApplication.b(), 54.0f)) / 7.0f;
        this.w = ((qrs.q() * 0.5f) - qrs.d(BaseApplication.b(), 56.0f)) / 9.0f;
        this.h = ((qrs.q() * 1.0f) - qrs.d(BaseApplication.b(), 110.0f)) / 7.0f;
        this.t = ((qrs.q() * 1.0f) - qrs.d(BaseApplication.b(), 110.0f)) / 9.0f;
        this.g = qrs.d(BaseApplication.b(), 22.0f);
        this.q = qrs.d(BaseApplication.b(), 22.0f);
    }

    public void c(boolean z) {
        IntervalCard intervalCard = this.i;
        if (intervalCard != null) {
            intervalCard.setClickable(z);
        }
        IntervalCard intervalCard2 = this.r;
        if (intervalCard2 != null) {
            intervalCard2.setClickable(z);
        }
    }
}

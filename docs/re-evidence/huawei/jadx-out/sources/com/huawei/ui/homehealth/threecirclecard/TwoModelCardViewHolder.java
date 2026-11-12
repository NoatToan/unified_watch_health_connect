package com.huawei.ui.homehealth.threecirclecard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.tbf;
import defpackage.tbh;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class TwoModelCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CardViewBaseHolder f26126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CardViewBaseHolder f26128c;
    private LinearLayout d;
    private RelativeLayout e;
    private LinearLayout g;
    private RelativeLayout i;

    public void d() {
    }

    public TwoModelCardViewHolder(View view, Context context, boolean z, String str, final ThreeCircleCardData threeCircleCardData, final ThreeLeafCardData threeLeafCardData, final LayoutInflater layoutInflater) {
        super(view, context, z);
        LogUtil.a("TwoModelCardViewHolder", "TwoModelCardViewHolder start");
        this.f26127b = str;
        this.d = (LinearLayout) view.findViewById(R.id.three_circle);
        this.g = (LinearLayout) view.findViewById(R.id.three_leaf);
        tbh.f48930c = false;
        if ("threeCircleCard".equals(tbf.e())) {
            this.f26128c = (CardViewBaseHolder) threeCircleCardData.getCardViewHolder(this.d, layoutInflater);
        } else {
            this.f26126a = (CardViewBaseHolder) threeLeafCardData.getCardViewHolder(this.g, layoutInflater);
        }
        e();
        c(this.f26127b);
        HandlerExecutor.c(new Runnable() { // from class: tdq
            @Override // java.lang.Runnable
            public final void run() {
                this.f49002b.a(threeLeafCardData, layoutInflater, threeCircleCardData);
            }
        }, 1000L);
        LogUtil.a("TwoModelCardViewHolder", "TwoModelCardViewHolder end");
    }

    public /* synthetic */ void a(ThreeLeafCardData threeLeafCardData, LayoutInflater layoutInflater, ThreeCircleCardData threeCircleCardData) {
        LogUtil.a("TwoModelCardViewHolder", "TwoModelCardViewHolder load other card");
        if ("threeCircleCard".equals(tbf.e())) {
            CardViewBaseHolder cardViewBaseHolder = (CardViewBaseHolder) threeLeafCardData.getCardViewHolder(this.g, layoutInflater);
            this.f26126a = cardViewBaseHolder;
            this.i = cardViewBaseHolder.d();
        } else {
            CardViewBaseHolder cardViewBaseHolder2 = (CardViewBaseHolder) threeCircleCardData.getCardViewHolder(this.d, layoutInflater);
            this.f26128c = cardViewBaseHolder2;
            this.e = cardViewBaseHolder2.d();
        }
        tbh.f48930c = true;
        LogUtil.a("TwoModelCardViewHolder", "TwoModelCardViewHolder load other card end");
    }

    public void b() {
        d(this.e);
        d(this.i);
        e();
    }

    public void b(String str) {
        if ("threeCircleCard".equals(str)) {
            this.g.setVisibility(4);
        } else if ("threeLeafCard".equals(str)) {
            this.d.setVisibility(4);
        } else {
            LogUtil.c("TwoModelCardViewHolder", "card type error");
        }
    }

    public void e(String str) {
        View viewE;
        CardViewBaseHolder cardViewBaseHolder = this.f26128c;
        if (cardViewBaseHolder == null || this.f26126a == null) {
            ReleaseLogUtil.b("R_TwoModelCardViewHolder", "changeOverlayView holder is null");
            return;
        }
        if (cardViewBaseHolder.e() != null) {
            viewE = this.f26128c.e();
        } else {
            viewE = this.f26126a.e();
        }
        e(viewE, str, true);
    }

    public void c(String str) {
        if ("threeCircleCard".equals(str)) {
            this.d.setVisibility(0);
            this.g.setVisibility(8);
        } else if ("threeLeafCard".equals(str)) {
            this.d.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            LogUtil.c("TwoModelCardViewHolder", "card type error");
        }
    }

    private void e() {
        CardViewBaseHolder cardViewBaseHolder = this.f26128c;
        if (cardViewBaseHolder != null) {
            this.e = cardViewBaseHolder.d();
        }
        CardViewBaseHolder cardViewBaseHolder2 = this.f26126a;
        if (cardViewBaseHolder2 != null) {
            this.i = cardViewBaseHolder2.d();
        }
    }

    private void d(RelativeLayout relativeLayout) {
        if (relativeLayout == null || !(relativeLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = -2;
        relativeLayout.setLayoutParams(layoutParams);
    }

    private void c() {
        if ("threeCircleCard".equals(this.f26127b)) {
            this.d.setVisibility(0);
            this.g.setVisibility(4);
        } else if ("threeLeafCard".equals(this.f26127b)) {
            this.d.setVisibility(4);
            this.g.setVisibility(0);
        } else {
            LogUtil.c("TwoModelCardViewHolder", "card type error");
        }
    }

    public void e(View view, String str, boolean z) {
        ReleaseLogUtil.c("R_TwoModelCardViewHolder", "setOverlayAnimateBg overlayLayout is null:", Boolean.valueOf(view == null));
        if ("threeCircleCard".equals(str)) {
            CardViewBaseHolder cardViewBaseHolder = this.f26128c;
            if (cardViewBaseHolder != null) {
                cardViewBaseHolder.b(view, z);
            }
            CardViewBaseHolder cardViewBaseHolder2 = this.f26126a;
            if (cardViewBaseHolder2 != null) {
                cardViewBaseHolder2.e(view);
                return;
            }
            return;
        }
        CardViewBaseHolder cardViewBaseHolder3 = this.f26126a;
        if (cardViewBaseHolder3 != null) {
            cardViewBaseHolder3.b(view, z);
        }
        CardViewBaseHolder cardViewBaseHolder4 = this.f26128c;
        if (cardViewBaseHolder4 != null) {
            cardViewBaseHolder4.e(view);
        }
    }

    public void a(String str) {
        LogUtil.a("TwoModelCardViewHolder", "notifyModelChanged, targetType: ", str);
        this.f26127b = str;
        c();
    }
}

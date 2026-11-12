package com.huawei.openalliance.ad;

import android.view.MotionEvent;
import android.view.View;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class uy implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f20701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f20702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f20703c;
    float d;
    private final PPSRewardView e;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int iA = a(motionEvent);
        if (iA == 0) {
            this.f20701a = motionEvent.getX();
            this.f20702b = motionEvent.getY();
        }
        if (iA != 1) {
            return false;
        }
        this.f20703c = Math.abs(motionEvent.getX() - this.f20701a);
        float fAbs = Math.abs(motionEvent.getY() - this.f20702b);
        this.d = fAbs;
        if (this.f20703c >= 30.0f || fAbs >= 30.0f) {
            return false;
        }
        hw.b("RewardContentViewOTL", "click action");
        if (this.e.r() || !this.e.j()) {
            return false;
        }
        this.e.k();
        return false;
    }

    private int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public uy(PPSRewardView pPSRewardView) {
        this.e = pPSRewardView;
    }
}

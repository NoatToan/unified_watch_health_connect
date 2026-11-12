package com.xmlywind.sdk.nativead;

import android.content.Context;
import com.xmlywind.sdk.base.models.BaseAdUnit;

/* JADX INFO: loaded from: classes22.dex */
public class SigNativeAdView extends SigAdView {
    public r d;

    public SigNativeAdView(Context context) {
        super(context);
    }

    public void a(r rVar) {
        this.d = rVar;
    }

    @Override // com.xmlywind.sdk.nativead.SigAdView
    public void c() {
        super.c();
        this.d = null;
    }

    public b getAdConfig() {
        r rVar = this.d;
        if (rVar != null) {
            return rVar.u();
        }
        return null;
    }

    public BaseAdUnit getAdUnit() {
        r rVar = this.d;
        if (rVar != null) {
            return rVar.k();
        }
        return null;
    }

    public SigAppInfoView getAppInfoView() {
        r rVar = this.d;
        if (rVar != null) {
            return rVar.m();
        }
        return null;
    }

    public s getNativeAdUnit() {
        r rVar = this.d;
        if (rVar != null) {
            return rVar.l();
        }
        return null;
    }

    public double getVideoDuration() {
        return 0.0d;
    }

    public double getVideoProgress() {
        return 0.0d;
    }

    public void setUIStyle(f fVar) {
        this.a = fVar;
    }
}

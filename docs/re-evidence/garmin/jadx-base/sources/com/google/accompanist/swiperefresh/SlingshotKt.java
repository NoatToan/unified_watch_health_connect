package com.google.accompanist.swiperefresh;

import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "offsetY", "maxOffsetY", "", "height", "Lcom/google/accompanist/swiperefresh/Slingshot;", "rememberUpdatedSlingshot", "(FFILp3/m;I)Lcom/google/accompanist/swiperefresh/Slingshot;", "MaxProgressArc", "F", "swiperefresh_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SlingshotKt {
    public static final float MaxProgressArc = 0.8f;

    public static final Slingshot rememberUpdatedSlingshot(float f14, float f15, int i14, m mVar, int i15) {
        mVar.L(-2136847435);
        x1 x1Var = n.f135158a;
        float fMin = Math.min(1.0f, f14 / f15);
        float fMax = (Math.max(fMin - 0.4f, 0.0f) * 5) / 3;
        float f16 = 2;
        float fMax2 = Math.max(0.0f, Math.min(Math.abs(f14) - f15, f15 * f16) / f15) / 4;
        float fPow = (fMax2 - ((float) Math.pow(fMax2, 2))) * f16;
        int i16 = (((int) ((f15 * fMin) + ((f15 * fPow) * f16))) + i14) - i14;
        float f17 = fMax * 0.8f;
        float f18 = f17 <= 0.8f ? f17 : 0.8f;
        float f19 = ((fPow * f16) + ((0.4f * fMax) - 0.25f)) * 0.5f;
        float fMin2 = Math.min(1.0f, fMax);
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new Slingshot();
            mVar.K(objQ);
        }
        mVar.R();
        Slingshot slingshot = (Slingshot) objQ;
        slingshot.setOffset(i16);
        slingshot.setStartTrim(0.0f);
        slingshot.setEndTrim(f18);
        slingshot.setRotation(f19);
        slingshot.setArrowScale(fMin2);
        mVar.R();
        return slingshot;
    }
}

package com.huawei.openalliance.ad;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class ho implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<com.huawei.openalliance.ad.activity.a> f18898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<View> f18899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f18900c;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        String str;
        try {
            View view = this.f18899b.get();
            com.huawei.openalliance.ad.activity.a aVar = this.f18898a.get();
            if (view == null || aVar == null || this.f18900c == null) {
                str = "anchorView or activity or location is null.";
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                if (i == 0 && iArr[1] == 0) {
                    hw.b("DialogOnGlobalLayoutListener", "anchorView onGlobalLayout newLoc[x,y] =0,0");
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                int[] iArr2 = this.f18900c;
                if (iArr2[0] == i && iArr2[1] == iArr[1]) {
                    return;
                }
                if (!a(iArr2, iArr)) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    hw.b("DialogOnGlobalLayoutListener", "anchorView location change newLoc[x,y] = " + iArr[0] + "," + iArr[1] + "--oldLoc[x,y] = " + this.f18900c[0] + "," + this.f18900c[1]);
                    aVar.finish();
                    return;
                }
                str = "the anchorView's sliding distance is acceptable";
            }
            hw.b("DialogOnGlobalLayoutListener", str);
        } catch (Throwable th) {
            hw.c("DialogOnGlobalLayoutListener", "onGlobalLayout error:" + th.getClass().getSimpleName());
        }
    }

    private boolean a(int[] iArr, int[] iArr2) {
        int iMax = Math.max(com.huawei.openalliance.ad.utils.as.h(this.f18898a.get()), com.huawei.openalliance.ad.utils.dk.g(this.f18898a.get()));
        return Math.abs(iArr[0] - iArr2[0]) <= iMax && Math.abs(iArr[1] - iArr2[1]) <= iMax;
    }

    public ho(com.huawei.openalliance.ad.activity.a aVar, View view, int[] iArr) {
        this.f18898a = new WeakReference<>(aVar);
        this.f18899b = new WeakReference<>(view);
        this.f18900c = iArr;
    }
}

package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class hn implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f18895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<View> f18896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f18897c;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        try {
            View view = this.f18896b.get();
            Context context = this.f18895a.get();
            if (view != null && context != null && this.f18897c != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                if (i == 0 && iArr[1] == 0) {
                    hw.b("CustomOnGlobalLayoutListener", "anchorView onGlobalLayout newLoc[x,y] =0,0");
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                int[] iArr2 = this.f18897c;
                if ((iArr2[0] != i || iArr2[1] != iArr[1]) && !a(iArr2, iArr)) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    hw.b("CustomOnGlobalLayoutListener", "anchorView location change newLoc[x,y] = " + iArr[0] + "," + iArr[1] + "--oldLoc[x,y] = " + this.f18897c[0] + "," + this.f18897c[1]);
                    jq.a().a(NotifyMessageNames.FEEDBACK_RECEIVE, new Intent("com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE"));
                }
            }
        } catch (Throwable th) {
            hw.c("CustomOnGlobalLayoutListener", "onGlobalLayout error:" + th.getClass().getSimpleName());
        }
    }

    private boolean a(int[] iArr, int[] iArr2) {
        int iMax = Math.max(com.huawei.openalliance.ad.utils.as.h(this.f18895a.get()), com.huawei.openalliance.ad.utils.dk.g(this.f18895a.get()));
        return Math.abs(iArr[0] - iArr2[0]) <= iMax && Math.abs(iArr[1] - iArr2[1]) <= iMax;
    }

    public hn(View view, Context context, int[] iArr) {
        this.f18895a = new WeakReference<>(context);
        this.f18896b = new WeakReference<>(view);
        this.f18897c = iArr == null ? null : Arrays.copyOf(iArr, iArr.length);
    }
}

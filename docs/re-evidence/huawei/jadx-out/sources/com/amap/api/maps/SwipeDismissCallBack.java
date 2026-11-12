package com.amap.api.maps;

import android.view.View;

/* JADX INFO: loaded from: classes21.dex */
public class SwipeDismissCallBack implements SwipeDismissTouchListener.DismissCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SwipeDismissView f3395a;

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(Object obj) {
        return true;
    }

    public SwipeDismissCallBack(SwipeDismissView swipeDismissView) {
        this.f3395a = swipeDismissView;
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(View view, Object obj) {
        if (this.f3395a.onDismissCallback != null) {
            this.f3395a.onDismissCallback.onDismiss();
        }
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onNotifySwipe() {
        if (this.f3395a.onDismissCallback != null) {
            this.f3395a.onDismissCallback.onNotifySwipe();
        }
    }
}

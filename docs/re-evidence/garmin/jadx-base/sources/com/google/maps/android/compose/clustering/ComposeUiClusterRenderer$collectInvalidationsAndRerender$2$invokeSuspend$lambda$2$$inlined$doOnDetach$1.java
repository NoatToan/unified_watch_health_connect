package com.google.maps.android.compose.clustering;

import android.view.View;
import p005kotlin.Metadata;
import q53.t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/google/maps/android/compose/clustering/ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$lambda$2$$inlined$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$lambda$2$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ t $$this$callbackFlow$inlined;
    final /* synthetic */ View $this_doOnDetach;

    public ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$lambda$2$$inlined$doOnDetach$1(View view2, t tVar) {
        this.$this_doOnDetach = view2;
        this.$$this$callbackFlow$inlined = tVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view2) {
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        this.$$this$callbackFlow$inlined.q(null);
    }
}

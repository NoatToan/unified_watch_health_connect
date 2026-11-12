package com.mapbox.maps.extension.compose.animation.viewport;

import android.animation.Animator;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/extension/compose/animation/viewport/OnAnimationCompletedListener;", "Landroid/animation/Animator$AnimatorListener;", "completionListener", "", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "(Ljava/util/List;)V", "getCompletionListener", "()Ljava/util/List;", "isCancelled", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class OnAnimationCompletedListener implements Animator.AnimatorListener {
    private final List<CompletionListener> completionListener;
    private boolean isCancelled;

    /* JADX WARN: Multi-variable type inference failed */
    public OnAnimationCompletedListener(List<? extends CompletionListener> list) {
        list.getClass();
        this.completionListener = list;
    }

    public final List<CompletionListener> getCompletionListener() {
        return this.completionListener;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        animation.getClass();
        this.isCancelled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        animation.getClass();
        for (CompletionListener completionListener : this.completionListener) {
            if (completionListener != null) {
                completionListener.onComplete(!this.isCancelled);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        animation.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        animation.getClass();
    }
}

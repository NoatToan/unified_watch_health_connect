package com.huami.mifit.analytics.monitor;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/mifit/analytics/monitor/ViewTreeStatusObservable;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnWindowAttachListener;", "", "onDraw", "onScrollChanged", "onWindowAttached", "onWindowDetached", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "handle", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class ViewTreeStatusObservable implements ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnWindowAttachListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> handle;

    public ViewTreeStatusObservable(@NotNull Function0<Unit> function0) {
        this.handle = function0;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        this.handle.invoke();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        this.handle.invoke();
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public void onWindowAttached() {
        this.handle.invoke();
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public void onWindowDetached() {
        this.handle.invoke();
    }
}

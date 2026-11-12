package androidx.core.view;

import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/view/d1;", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class d1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<View, Unit> f6413b;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(View view2, e23.l<? super View, Unit> lVar) {
        this.f6412a = view2;
        this.f6413b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        this.f6412a.removeOnAttachStateChangeListener(this);
        this.f6413b.invoke(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
    }
}

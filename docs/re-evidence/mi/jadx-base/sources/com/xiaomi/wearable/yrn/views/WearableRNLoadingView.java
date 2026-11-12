package com.xiaomi.wearable.yrn.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.o1d;
import defpackage.r0s;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/yrn/views/WearableRNLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo1d;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "", "showLoading", "()V", "showRetry", "dismiss", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnRetryListener", "(Landroid/view/View$OnClickListener;)V", "Lr0s;", "binding", "Lr0s;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableRNLoadingView extends ConstraintLayout implements o1d {

    @NotNull
    private final r0s binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WearableRNLoadingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // defpackage.o1d
    public void dismiss() {
        ProgressBar loadingView = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        ViewExtKt.gone(loadingView);
        ViewExtKt.gone(this);
    }

    @Override // defpackage.o1d
    @NotNull
    public View getView() {
        View root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.o1d
    public void setOnRetryListener(@Nullable View.OnClickListener listener) {
    }

    @Override // defpackage.o1d
    public void showLoading() {
        ProgressBar loadingView = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        ViewExtKt.visible(loadingView);
    }

    @Override // defpackage.o1d
    public void showRetry() {
        ProgressBar loadingView = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        ViewExtKt.visible(loadingView);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WearableRNLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WearableRNLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WearableRNLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = r0s.A0(LayoutInflater.from(context));
    }
}

package com.xiaomi.fitness.watch.face.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import defpackage.isi;
import defpackage.noi;
import defpackage.ovi;
import defpackage.p1j;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0003\u0010\u001b\u001a\u00020\u0007H\u0007J\u001e\u0010\u001c\u001a\u00020\u00162\b\b\u0003\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0012\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\u0012\u0010!\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010\"\u001a\u00020\u0016J4\u0010#\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/StateLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentView", "Landroid/view/View;", "stateView", "loadingView", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "onFinishInflate", "", "showEmpty", "descRes", "desStr", "", "icon", "showLoading", "desc", "showError", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "showNoNet", "showContent", "setStateView", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateLayout extends FrameLayout {

    @Nullable
    private View contentView;

    /* JADX INFO: renamed from: inflater$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inflater;

    @Nullable
    private View loadingView;

    @Nullable
    private View stateView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LayoutInflater getInflater() {
        return (LayoutInflater) this.inflater.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutInflater inflater_delegate$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return LayoutInflater.from(context);
    }

    private final void setStateView(int descRes, String desStr, int icon, View.OnClickListener listener) {
        if (this.stateView == null) {
            View viewInflate = getInflater().inflate(ovi.D0, (ViewGroup) this, false);
            this.stateView = viewInflate;
            addView(viewInflate);
        }
        View view = this.contentView;
        if (view != null) {
            ViewExtKt.invisible(view);
        }
        View view2 = this.loadingView;
        if (view2 != null) {
            ViewExtKt.gone(view2);
        }
        View view3 = this.stateView;
        if (view3 != null) {
            TextView textView = (TextView) view3.findViewById(isi.g2);
            TextView textView2 = (TextView) view3.findViewById(isi.c);
            ViewExtKt.visible(view3);
            if (desStr == null || desStr.length() == 0) {
                textView.setText(descRes);
            } else {
                textView.setText(desStr);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(0, icon, 0, 0);
            if (listener == null) {
                Intrinsics.checkNotNull(textView2);
                ViewExtKt.gone(textView2);
            } else {
                Intrinsics.checkNotNull(textView2);
                ViewExtKt.visible(textView2);
                textView2.setOnClickListener(listener);
            }
        }
    }

    public static /* synthetic */ void setStateView$default(StateLayout stateLayout, int i, String str, int i2, View.OnClickListener onClickListener, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            onClickListener = null;
        }
        stateLayout.setStateView(i, str, i2, onClickListener);
    }

    public static /* synthetic */ void showEmpty$default(StateLayout stateLayout, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = p1j.common_data_empty;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            i2 = noi.M;
        }
        stateLayout.showEmpty(i, str, i2);
    }

    public static /* synthetic */ void showError$default(StateLayout stateLayout, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            onClickListener = null;
        }
        stateLayout.showError(onClickListener);
    }

    public static /* synthetic */ void showLoading$default(StateLayout stateLayout, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = p1j.N5;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        stateLayout.showLoading(i, str);
    }

    public static /* synthetic */ void showNoNet$default(StateLayout stateLayout, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            onClickListener = null;
        }
        stateLayout.showNoNet(onClickListener);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) {
            throw new RuntimeException("StateLayout should be one child");
        }
        if (getChildCount() == 1) {
            this.contentView = getChildAt(0);
        }
    }

    public final void showContent() {
        View view = this.loadingView;
        if (view != null) {
            ViewExtKt.gone(view);
        }
        View view2 = this.stateView;
        if (view2 != null) {
            ViewExtKt.gone(view2);
        }
        View view3 = this.contentView;
        if (view3 != null) {
            ViewExtKt.visible(view3);
        }
    }

    @JvmOverloads
    public final void showEmpty() {
        showEmpty$default(this, 0, null, 0, 7, null);
    }

    public final void showError(@Nullable View.OnClickListener listener) {
        setStateView$default(this, p1j.common_hint_unkonwn_error, null, noi.M, listener, 2, null);
    }

    @JvmOverloads
    public final void showLoading() {
        showLoading$default(this, 0, null, 3, null);
    }

    public final void showNoNet(@Nullable View.OnClickListener listener) {
        setStateView$default(this, p1j.common_hint_network_unavailable, null, noi.common_net_unavailable, listener, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmOverloads
    public final void showEmpty(int i) {
        showEmpty$default(this, i, null, 0, 6, null);
    }

    @JvmOverloads
    public final void showLoading(int i) {
        showLoading$default(this, i, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.inflater = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sco
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateLayout.inflater_delegate$lambda$0(context);
            }
        });
    }

    @JvmOverloads
    public final void showEmpty(int i, @Nullable String str) {
        showEmpty$default(this, i, str, 0, 4, null);
    }

    @JvmOverloads
    public final void showLoading(int desc, @Nullable String desStr) {
        if (this.loadingView == null) {
            View viewInflate = getInflater().inflate(ovi.E0, (ViewGroup) this, false);
            this.loadingView = viewInflate;
            addView(viewInflate, 0);
        }
        View view = this.loadingView;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(isi.g2);
            if (desStr != null && desStr.length() != 0) {
                textView.setText(desStr);
            } else {
                textView.setText(desc);
            }
            ViewExtKt.visible(view);
        }
        View view2 = this.stateView;
        if (view2 != null) {
            ViewExtKt.gone(view2);
        }
        View view3 = this.contentView;
        if (view3 != null) {
            ViewExtKt.invisible(view3);
        }
    }

    @JvmOverloads
    public final void showEmpty(int descRes, @Nullable String desStr, int icon) {
        setStateView$default(this, descRes, desStr, icon, null, 8, null);
    }

    public /* synthetic */ StateLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

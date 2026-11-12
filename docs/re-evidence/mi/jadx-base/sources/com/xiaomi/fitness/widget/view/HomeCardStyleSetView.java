package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.b5j;
import defpackage.ksi;
import defpackage.qvi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/widget/view/HomeCardStyleSetView;", "Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutRes", "getLayoutRes", "()I", "onInitView", "", "typedArray", "Landroid/content/res/TypedArray;", "setTopViewShow", "visible", "", "setEnable", "enable", "drawable", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeCardStyleSetView extends CardStyleSetView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeCardStyleSetView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public int getLayoutRes() {
        return qvi.d;
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public void onInitView(@Nullable Context context, @Nullable AttributeSet attrs, @NotNull TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        findViewById(ksi.n).setVisibility(typedArray.getBoolean(b5j.K, false) ? 0 : 8);
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public void setEnable(boolean enable, int drawable) {
        super.setEnable(enable, drawable);
    }

    public final void setTopViewShow(boolean visible) {
        findViewById(ksi.n).setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeCardStyleSetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HomeCardStyleSetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeCardStyleSetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

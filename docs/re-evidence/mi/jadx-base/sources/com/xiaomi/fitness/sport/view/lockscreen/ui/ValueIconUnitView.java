package com.xiaomi.fitness.sport.view.lockscreen.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.dvi;
import defpackage.t4j;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020 R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "valueView", "Landroid/widget/TextView;", "getValueView", "()Landroid/widget/TextView;", "setValueView", "(Landroid/widget/TextView;)V", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "setIconView", "(Landroid/widget/ImageView;)V", "unitView", "getUnitView", "setUnitView", "initViews", "", "setValue", "value", "", "setUnit", "unit", "setIcon", "resId", "", "setTextColor", "colorInt", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValueIconUnitView extends RelativeLayout {
    public ImageView iconView;
    public TextView unitView;
    public TextView valueView;

    public ValueIconUnitView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(dvi.J0, this);
        initViews(attributeSet);
    }

    private final void initViews(AttributeSet attrs) {
        setValueView((TextView) findViewById(xri.m8));
        setIconView((ImageView) findViewById(xri.u2));
        setUnitView((TextView) findViewById(xri.e8));
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, t4j.b5);
        String string = typedArrayObtainAttributes.getString(t4j.e5);
        Drawable drawable = typedArrayObtainAttributes.getDrawable(t4j.c5);
        String string2 = typedArrayObtainAttributes.getString(t4j.d5);
        if (string == null || StringsKt__StringsKt.isBlank(string)) {
            ViewExtKt.gone(this);
        } else {
            getValueView().setText(string);
            getIconView().setBackground(drawable);
            getUnitView().setText(string2);
        }
        typedArrayObtainAttributes.recycle();
    }

    @NotNull
    public final ImageView getIconView() {
        ImageView imageView = this.iconView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iconView");
        return null;
    }

    @NotNull
    public final TextView getUnitView() {
        TextView textView = this.unitView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unitView");
        return null;
    }

    @NotNull
    public final TextView getValueView() {
        TextView textView = this.valueView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueView");
        return null;
    }

    public final void setIcon(int resId) {
        getIconView().setImageDrawable(ViewExtKt.getDrawable(this, resId));
    }

    public final void setIconView(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.iconView = imageView;
    }

    public final void setTextColor(int colorInt) {
        getValueView().setTextColor(colorInt);
        getUnitView().setTextColor(colorInt);
    }

    public final void setUnit(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        getUnitView().setText(unit);
    }

    public final void setUnitView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.unitView = textView;
    }

    public final void setValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getValueView().setText(value);
    }

    public final void setValueView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.valueView = textView;
    }
}

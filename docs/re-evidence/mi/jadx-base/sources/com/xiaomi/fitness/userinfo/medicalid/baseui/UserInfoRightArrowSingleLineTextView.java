package com.xiaomi.fitness.userinfo.medicalid.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.a5j;
import defpackage.hki;
import defpackage.hsi;
import defpackage.moi;
import defpackage.nvi;
import defpackage.wli;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u001d\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u001f\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00102\b\b\u0001\u0010!\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010$\u001a\u00020\u00102\b\b\u0001\u0010!\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0016H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemRemind", "mIvFeatureItemMore", "Landroid/widget/ImageView;", "setTitle", "", "title", "", "titleRes", "setRemindTextEnable", "isEnabled", "", "setTitleBold", "isBold", "setRemindText", "remindText", "setSubTitleMaxLines", "maxLines", "remindTextRes", "setRemindDotColor", "remindDotColor", "setRemindDotDrawable", "drawable", "showMore", "more", "setEndButtonIcon", "setEndButton", "btn", "Landroid/view/View;", "setEnable", "enable", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UserInfoRightArrowSingleLineTextView extends LinearLayout {

    @NotNull
    private final ImageView mIvFeatureItemMore;

    @NotNull
    private final TextView mTvFeatureItemRemind;

    @NotNull
    private final TextView mTvFeatureItemTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoRightArrowSingleLineTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setEnable(boolean enable) {
        setEnabled(enable);
        this.mIvFeatureItemMore.setEnabled(enable);
        this.mTvFeatureItemRemind.setEnabled(enable);
        this.mTvFeatureItemTitle.setEnabled(enable);
    }

    public final void setEndButton(@NotNull View btn) {
        Intrinsics.checkNotNullParameter(btn, "btn");
        removeView(this.mIvFeatureItemMore);
        addView(btn);
    }

    public final void setEndButtonIcon(int drawable) {
        this.mIvFeatureItemMore.setImageResource(drawable);
    }

    public final void setRemindDotColor(int remindDotColor) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        int dimen = (int) ViewExtKt.getDimen(this, wli.c);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, dimen, dimen);
        Drawable drawable = ViewExtKt.getDrawable(this, moi.f);
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(remindDotColor);
        }
        this.mTvFeatureItemRemind.setBackground(drawable);
    }

    public final void setRemindDotDrawable(int drawable) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        int dimen = (int) ViewExtKt.getDimen(this, wli.c);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, dimen, dimen);
        this.mTvFeatureItemRemind.setBackground(ViewExtKt.getDrawable(this, drawable));
    }

    public final void setRemindText(@Nullable String remindText) {
        if (remindText == null || remindText.length() == 0) {
            ViewExtKt.gone(this.mTvFeatureItemRemind);
            return;
        }
        this.mTvFeatureItemRemind.setBackground(null);
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        this.mTvFeatureItemRemind.setText(remindText);
    }

    public final void setRemindTextEnable(boolean isEnabled) {
        this.mTvFeatureItemRemind.setEnabled(isEnabled);
    }

    public final void setSubTitleMaxLines(int maxLines) {
        this.mTvFeatureItemRemind.setMaxLines(maxLines);
    }

    public final void setTitle(@Nullable String title) {
        this.mTvFeatureItemTitle.setText(title);
    }

    public final void setTitleBold(boolean isBold) {
        if (isBold) {
            this.mTvFeatureItemTitle.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    public final void showMore(boolean more) {
        ViewExtKt.setVisible(this.mIvFeatureItemMore, more);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoRightArrowSingleLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ UserInfoRightArrowSingleLineTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoRightArrowSingleLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a5j.k3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        typedArrayObtainStyledAttributes.getDrawable(a5j.l3);
        String string = typedArrayObtainStyledAttributes.getString(a5j.s3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(a5j.r3, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(a5j.q3, true);
        int color = typedArrayObtainStyledAttributes.getColor(a5j.m3, ViewExtKt.getColor(this, hki.f20170b));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(a5j.o3, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(a5j.p3, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(a5j.t3, false);
        String string2 = typedArrayObtainStyledAttributes.getString(a5j.n3);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(nvi.H, (ViewGroup) this, true);
        this.mTvFeatureItemTitle = (TextView) viewInflate.findViewById(hsi.s1);
        TextView textView = (TextView) viewInflate.findViewById(hsi.r1);
        this.mTvFeatureItemRemind = textView;
        this.mIvFeatureItemMore = (ImageView) viewInflate.findViewById(hsi.O);
        setTitle(string);
        showMore(z2);
        if (z4) {
            viewInflate.setBackgroundResource(moi.h);
        }
        setRemindTextEnable(z3);
        setTitleBold(z5);
        if (z) {
            if (string2 != null && string2.length() != 0) {
                setRemindText(string2);
                setRemindTextEnable(z);
                return;
            } else {
                setRemindDotColor(color);
                return;
            }
        }
        ViewExtKt.gone(textView);
    }

    public final void setRemindText(int remindTextRes) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, -2, -2);
        this.mTvFeatureItemRemind.setText(remindTextRes);
    }
}

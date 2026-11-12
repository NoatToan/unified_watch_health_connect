package com.xiaomi.fitness.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import coil.transform.RoundedCornersTransformation;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.b5j;
import defpackage.bmi;
import defpackage.ksi;
import defpackage.lki;
import defpackage.qoi;
import defpackage.qvi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010 \u001a\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u0007J\u0018\u0010!\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0018J\u0018\u0010!\u001a\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0018J\u0010\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010#\u001a\u00020\u00122\b\b\u0001\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010-\u001a\u00020\u00122\b\b\u0001\u0010/\u001a\u00020\u0007J\u0010\u00100\u001a\u00020\u00122\b\u00101\u001a\u0004\u0018\u00010\u001cJ\u0010\u00100\u001a\u00020\u00122\b\b\u0001\u0010/\u001a\u00020\u0007J\u0010\u00102\u001a\u00020\u00122\b\b\u0001\u00103\u001a\u00020\u0007J\u0010\u00104\u001a\u00020\u00122\b\b\u0001\u00105\u001a\u00020\u0007J\u000e\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u0016J\u0010\u00108\u001a\u00020\u00122\b\b\u0001\u00105\u001a\u00020\u0007J\u000e\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0016H\u0016J&\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007J\u0006\u0010C\u001a\u00020\rJ;\u0010D\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010HR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIvFeatureItemStartIcon", "Landroid/widget/ImageView;", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemRemind", "mIvFeatureItemMore", "mTvFeatureItemRightText", "setIcon", "", "icon", "Landroid/graphics/drawable/Drawable;", "iconCircle", "", "iconCorners", "", "setRemindTextColor", "color", "url", "", "setStartIconVisible", "visible", "iconRes", "setCircleIcon", "setRoundedIcon", "corner", "setTitle", "title", "titleRes", "updateTitleMaxLines", "lines", "setRemindTextEnable", "isEnabled", "setTitleBold", "isBold", "setTitleTextColor", "setRemindText", "remindText", "remindTextRes", "setRightTextWithDot", "rightText", "setRemindDotColor", "remindDotColor", "setRemindDotDrawable", "drawable", "showMore", "more", "setEndButtonIcon", "setEndButton", "btn", "Landroid/view/View;", "setEnable", "enable", "setViewPadding", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "getTvFeatureItemRemind", "setArrowViewPadding", "iconDrawable", "Landroid/graphics/drawable/Icon;", Constants.KEY_RECHARGE_ICON_URL, "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRightArrowSingleLineTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RightArrowSingleLineTextView.kt\ncom/xiaomi/fitness/widget/RightArrowSingleLineTextView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,310:1\n54#2,3:311\n24#2:314\n57#2,6:315\n63#2,2:322\n54#2,3:324\n24#2:327\n59#2,6:328\n54#2,3:334\n24#2:337\n59#2,6:338\n54#2,3:344\n24#2:347\n59#2,6:348\n54#2,3:354\n24#2:357\n59#2,6:358\n57#3:321\n*S KotlinDebug\n*F\n+ 1 RightArrowSingleLineTextView.kt\ncom/xiaomi/fitness/widget/RightArrowSingleLineTextView\n*L\n127#1:311,3\n127#1:314\n127#1:315,6\n127#1:322,2\n143#1:324,3\n143#1:327\n143#1:328,6\n151#1:334,3\n151#1:337\n151#1:338,6\n159#1:344,3\n159#1:347\n159#1:348,6\n167#1:354,3\n167#1:357\n167#1:358,6\n127#1:321\n*E\n"})
public class RightArrowSingleLineTextView extends LinearLayout {

    @NotNull
    private final ImageView mIvFeatureItemMore;

    @NotNull
    private final ImageView mIvFeatureItemStartIcon;

    @NotNull
    private final TextView mTvFeatureItemRemind;

    @NotNull
    private final TextView mTvFeatureItemRightText;

    @NotNull
    private final TextView mTvFeatureItemTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightArrowSingleLineTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setArrowViewPadding$default(RightArrowSingleLineTextView rightArrowSingleLineTextView, Drawable drawable, Integer num, Icon icon, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setArrowViewPadding");
        }
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 2) != 0) {
            num = -1;
        }
        if ((i & 4) != 0) {
            icon = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        rightArrowSingleLineTextView.setArrowViewPadding(drawable, num, icon, str);
    }

    private final void setIcon(Drawable icon, boolean iconCircle, float iconCorners) {
        setArrowViewPadding$default(this, icon, null, null, null, 14, null);
        if (icon == null) {
            ViewExtKt.gone(this.mIvFeatureItemStartIcon);
            return;
        }
        if (iconCircle) {
            setCircleIcon(icon);
        } else if (iconCorners > 0.0f) {
            setRoundedIcon(icon, iconCorners);
        } else {
            setIcon(icon);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getTvFeatureItemRemind, reason: from getter */
    public final TextView getMTvFeatureItemRemind() {
        return this.mTvFeatureItemRemind;
    }

    public final void setArrowViewPadding(@Nullable Drawable icon, @Nullable Integer iconRes, @Nullable Icon iconDrawable, @Nullable String iconUrl) {
    }

    public final void setCircleIcon(@Nullable Drawable icon) {
        setArrowViewPadding$default(this, icon, null, null, null, 14, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public void setEnable(boolean enable) {
        setEnabled(enable);
        this.mIvFeatureItemMore.setEnabled(enable);
        this.mIvFeatureItemStartIcon.setEnabled(enable);
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
        int dimen = (int) ViewExtKt.getDimen(this, bmi.d);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, dimen, dimen);
        Drawable drawable = ViewExtKt.getDrawable(this, qoi.f31697a);
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(remindDotColor);
        }
        this.mTvFeatureItemRemind.setBackground(drawable);
    }

    public final void setRemindDotDrawable(int drawable) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        int dimen = (int) ViewExtKt.getDimen(this, bmi.d);
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
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, -2, -2);
        this.mTvFeatureItemRemind.setText(remindText);
    }

    public final void setRemindTextColor(int color) {
        this.mTvFeatureItemRemind.setTextColor(color);
    }

    public final void setRemindTextEnable(boolean isEnabled) {
        this.mTvFeatureItemRemind.setEnabled(isEnabled);
    }

    public final void setRightTextWithDot(@Nullable String rightText) {
        if (rightText != null && rightText.length() != 0) {
            ViewExtKt.visible(this.mTvFeatureItemRightText);
            this.mTvFeatureItemRightText.setText(rightText);
            setRemindDotColor(ViewExtKt.getColor(this, lki.d));
        } else {
            ViewExtKt.gone(this.mTvFeatureItemRightText);
            if (this.mTvFeatureItemRemind.getText().toString().length() == 0) {
                ViewExtKt.gone(this.mTvFeatureItemRemind);
            }
        }
    }

    public final void setRoundedIcon(@Nullable Drawable icon, float corner) {
        setArrowViewPadding$default(this, icon, null, null, null, 14, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setStartIconVisible(boolean visible) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, visible);
    }

    public final void setTitle(@Nullable String title) {
        this.mTvFeatureItemTitle.setText(title);
    }

    public final void setTitleBold(boolean isBold) {
        if (isBold) {
            this.mTvFeatureItemTitle.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    public final void setTitleTextColor(int color) {
        this.mTvFeatureItemTitle.setTextColor(color);
    }

    public final void setViewPadding(int left, int top, int right, int bottom) {
        setPadding(left, top, right, bottom);
    }

    public final void showMore(boolean more) {
        ViewExtKt.setVisible(this.mIvFeatureItemMore, more);
    }

    public final void updateTitleMaxLines(int lines) {
        this.mTvFeatureItemTitle.setSingleLine(false);
        this.mTvFeatureItemTitle.setMaxLines(lines);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightArrowSingleLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ RightArrowSingleLineTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightArrowSingleLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.L3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b5j.M3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.N3, false);
        float f = typedArrayObtainStyledAttributes.getFloat(b5j.O3, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(b5j.V3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b5j.U3, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(b5j.T3, true);
        int color = typedArrayObtainStyledAttributes.getColor(b5j.P3, ViewExtKt.getColor(this, lki.d));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(b5j.R3, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(b5j.S3, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(b5j.W3, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(b5j.X3, -1);
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.Q3);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(qvi.h, (ViewGroup) this, true);
        this.mIvFeatureItemStartIcon = (ImageView) viewInflate.findViewById(ksi.t);
        TextView textView = (TextView) viewInflate.findViewById(ksi.O);
        this.mTvFeatureItemTitle = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(ksi.L);
        this.mTvFeatureItemRemind = textView2;
        this.mIvFeatureItemMore = (ImageView) viewInflate.findViewById(ksi.s);
        this.mTvFeatureItemRightText = (TextView) viewInflate.findViewById(ksi.M);
        setArrowViewPadding$default(this, drawable, null, null, null, 14, null);
        setIcon(drawable, z, f);
        setTitle(string);
        if (integer > 0) {
            textView.setMaxLines(integer);
        }
        showMore(z3);
        if (z5) {
            viewInflate.setBackgroundResource(qoi.h);
        }
        setRemindTextEnable(z4);
        setTitleBold(z6);
        if (z2) {
            if (string2 != null && string2.length() != 0) {
                setRemindText(string2);
                setRemindTextEnable(z2);
                return;
            } else {
                setRemindDotColor(color);
                return;
            }
        }
        ViewExtKt.gone(textView2);
    }

    public final void setIcon(@Nullable Drawable icon) {
        setArrowViewPadding$default(this, icon, null, null, null, 14, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        this.mIvFeatureItemStartIcon.setImageDrawable(icon);
    }

    public final void setRemindText(int remindTextRes) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, -2, -2);
        this.mTvFeatureItemRemind.setText(remindTextRes);
    }

    public final void setRightTextWithDot(int remindTextRes) {
        ViewExtKt.visible(this.mTvFeatureItemRightText);
        this.mTvFeatureItemRightText.setText(remindTextRes);
        setRemindDotColor(ViewExtKt.getColor(this, lki.d));
    }

    public final void setIcon(@Nullable String url) {
        setArrowViewPadding$default(this, null, null, null, url, 7, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, true ^ (url == null || url.length() == 0));
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView).build());
    }

    public final void setCircleIcon(int iconRes) {
        setArrowViewPadding$default(this, null, Integer.valueOf(iconRes), null, null, 13, null);
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setRoundedIcon(int iconRes, float corner) {
        setArrowViewPadding$default(this, null, Integer.valueOf(iconRes), null, null, 13, null);
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setIcon(int iconRes) {
        setArrowViewPadding$default(this, null, Integer.valueOf(iconRes), null, null, 13, null);
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        this.mIvFeatureItemStartIcon.setImageResource(iconRes);
    }
}

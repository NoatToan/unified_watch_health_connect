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
import com.miui.circulate.device.api.Column;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001d\u001a\u00020\u00132\b\b\u0001\u0010\u001c\u001a\u00020\u0007J\u0018\u0010\u001e\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u0019J\u0018\u0010\u001e\u001a\u00020\u00132\b\b\u0001\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0019J\u0010\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010 \u001a\u00020\u00132\b\b\u0001\u0010\"\u001a\u00020\u0007J\u0010\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010#\u001a\u00020\u00132\b\b\u0001\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0017J\u0010\u0010,\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010,\u001a\u00020\u00132\b\b\u0001\u0010.\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010/\u001a\u00020\u00132\b\b\u0001\u0010.\u001a\u00020\u0007J\u0010\u00101\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u00010\u001bJ\u0010\u00101\u001a\u00020\u00132\b\b\u0001\u0010.\u001a\u00020\u0007J\u0010\u00102\u001a\u00020\u00132\b\b\u0001\u00103\u001a\u00020\u0007J\u0010\u00104\u001a\u00020\u00132\b\b\u0001\u00105\u001a\u00020\u0007J\u000e\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u0017J\u0010\u00108\u001a\u00020\u00132\b\b\u0001\u00105\u001a\u00020\u0007J\u0010\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0017H\u0016J\u0018\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u0007H\u0016J&\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007J\u0006\u0010@\u001a\u00020\rJ;\u0010A\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010ER\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIvFeatureItemStartIcon", "Landroid/widget/ImageView;", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemSubtitle", "mTvFeatureItemRightText", "mTvFeatureItemRemind", "mIvFeatureItemMore", "setIcon", "", "icon", "Landroid/graphics/drawable/Drawable;", "iconCircle", "", "iconCorners", "", "url", "", "iconRes", "setCircleIcon", "setRoundedIcon", "corner", "setTitle", "title", "titleRes", "setSubtitle", Column.SUBTITLE, "setSubTitleTextEnable", "isEnabled", "setSubTitleMaxLines", "maxLines", "setRemindTextEnable", "setTitleBold", "isBold", "setRemindText", "remindText", "remindTextRes", "setRightText", "rightText", "setRightTextWithDot", "setRemindDotColor", "remindDotColor", "setRemindDotDrawable", "drawable", "showMore", "more", "setEndButtonIcon", "setEnable", "enable", "setViewPadding", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "getRemindTextView", "setArrowViewPadding", "iconDrawable", "Landroid/graphics/drawable/Icon;", Constants.KEY_RECHARGE_ICON_URL, "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRightArrowTwoLineTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RightArrowTwoLineTextView.kt\ncom/xiaomi/fitness/widget/RightArrowTwoLineTextView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,336:1\n54#2,3:337\n24#2:340\n57#2,6:341\n63#2,2:348\n54#2,3:350\n24#2:353\n59#2,6:354\n54#2,3:360\n24#2:363\n59#2,6:364\n54#2,3:370\n24#2:373\n59#2,6:374\n54#2,3:380\n24#2:383\n59#2,6:384\n57#3:347\n*S KotlinDebug\n*F\n+ 1 RightArrowTwoLineTextView.kt\ncom/xiaomi/fitness/widget/RightArrowTwoLineTextView\n*L\n132#1:337,3\n132#1:340\n132#1:341,6\n132#1:348,2\n144#1:350,3\n144#1:353\n144#1:354,6\n152#1:360,3\n152#1:363\n152#1:364,6\n160#1:370,3\n160#1:373\n160#1:374,6\n168#1:380,3\n168#1:383\n168#1:384,6\n132#1:347\n*E\n"})
public class RightArrowTwoLineTextView extends LinearLayout {

    @NotNull
    private final ImageView mIvFeatureItemMore;

    @NotNull
    private final ImageView mIvFeatureItemStartIcon;

    @NotNull
    private final TextView mTvFeatureItemRemind;

    @NotNull
    private final TextView mTvFeatureItemRightText;

    @NotNull
    private final TextView mTvFeatureItemSubtitle;

    @NotNull
    private final TextView mTvFeatureItemTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightArrowTwoLineTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setArrowViewPadding$default(RightArrowTwoLineTextView rightArrowTwoLineTextView, Drawable drawable, Integer num, Icon icon, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setArrowViewPadding");
        }
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 2) != 0) {
            num = -2;
        }
        if ((i & 4) != 0) {
            icon = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        rightArrowTwoLineTextView.setArrowViewPadding(drawable, num, icon, str);
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
    /* JADX INFO: renamed from: getRemindTextView, reason: from getter */
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
        this.mTvFeatureItemSubtitle.setEnabled(enable);
        this.mTvFeatureItemTitle.setEnabled(enable);
        this.mTvFeatureItemRightText.setEnabled(enable);
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

    public final void setRemindTextEnable(boolean isEnabled) {
        this.mTvFeatureItemRemind.setEnabled(isEnabled);
    }

    public final void setRightText(@Nullable String rightText) {
        if (rightText == null || rightText.length() == 0) {
            ViewExtKt.gone(this.mTvFeatureItemRightText);
        } else {
            ViewExtKt.visible(this.mTvFeatureItemRightText);
            this.mTvFeatureItemRightText.setText(rightText);
        }
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

    public final void setSubTitleMaxLines(int maxLines) {
        this.mTvFeatureItemSubtitle.setMaxLines(maxLines);
    }

    public final void setSubTitleTextEnable(boolean isEnabled) {
        this.mTvFeatureItemSubtitle.setEnabled(isEnabled);
    }

    public final void setSubtitle(@Nullable String subtitle) {
        if (subtitle == null || subtitle.length() == 0) {
            ViewExtKt.gone(this.mTvFeatureItemSubtitle);
        } else {
            ViewExtKt.visible(this.mTvFeatureItemSubtitle);
            this.mTvFeatureItemSubtitle.setText(subtitle);
        }
    }

    public final void setTitle(@Nullable String title) {
        this.mTvFeatureItemTitle.setText(title);
    }

    public final void setTitleBold(boolean isBold) {
        if (isBold) {
            this.mTvFeatureItemTitle.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    public final void setViewPadding(int left, int top, int right, int bottom) {
        setPadding(left, top, right, bottom);
    }

    public final void showMore(boolean more) {
        ViewExtKt.setVisible(this.mIvFeatureItemMore, more);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightArrowTwoLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ RightArrowTwoLineTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightArrowTwoLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.Y3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b5j.Z3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.a4, false);
        float f = typedArrayObtainStyledAttributes.getFloat(b5j.b4, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(b5j.j4);
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.h4);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b5j.g4, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(b5j.f4, true);
        int color = typedArrayObtainStyledAttributes.getColor(b5j.c4, ViewExtKt.getColor(this, lki.d));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(b5j.e4, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(b5j.S3, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(b5j.k4, false);
        String string3 = typedArrayObtainStyledAttributes.getString(b5j.d4);
        int integer = typedArrayObtainStyledAttributes.getInteger(b5j.l4, -1);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(b5j.i4, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(qvi.l, (ViewGroup) this, true);
        this.mIvFeatureItemStartIcon = (ImageView) viewInflate.findViewById(ksi.t);
        TextView textView = (TextView) viewInflate.findViewById(ksi.O);
        this.mTvFeatureItemTitle = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(ksi.N);
        this.mTvFeatureItemSubtitle = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(ksi.L);
        this.mTvFeatureItemRemind = textView3;
        this.mTvFeatureItemRightText = (TextView) viewInflate.findViewById(ksi.M);
        this.mIvFeatureItemMore = (ImageView) viewInflate.findViewById(ksi.s);
        setArrowViewPadding$default(this, drawable, null, null, null, 14, null);
        if (z5) {
            viewInflate.setBackgroundResource(qoi.h);
        }
        setIcon(drawable, z, f);
        setTitle(string);
        if (integer > 0) {
            textView.setMaxLines(integer);
        }
        setSubtitle(string2);
        if (integer2 > 0) {
            textView2.setMaxLines(integer2);
        }
        showMore(z3);
        setRemindTextEnable(z4);
        setTitleBold(z6);
        if (z2) {
            if (string3 != null && string3.length() != 0) {
                setRemindText(string3);
                setRemindTextEnable(z2);
                return;
            } else {
                setRemindDotColor(color);
                return;
            }
        }
        ViewExtKt.gone(textView3);
    }

    public final void setRightText(int remindTextRes) {
        ViewExtKt.visible(this.mTvFeatureItemRightText);
        this.mTvFeatureItemRightText.setText(remindTextRes);
    }

    public final void setSubtitle(int subtitle) {
        this.mTvFeatureItemSubtitle.setText(subtitle);
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

    public void setEnable(boolean enable, int drawable) {
        this.mTvFeatureItemTitle.setEnabled(enable);
        this.mIvFeatureItemStartIcon.setImageResource(drawable);
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

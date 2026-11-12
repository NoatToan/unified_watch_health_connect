package com.xiaomi.fitness.widget;

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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import coil.transform.RoundedCornersTransformation;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.b5j;
import defpackage.bmi;
import defpackage.ksi;
import defpackage.lki;
import defpackage.qoi;
import defpackage.qvi;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u00020\u000f¢\u0006\u0004\bS\u0010TJ)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010#\u001a\u00020\b2\b\b\u0001\u0010$\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010&\u001a\u00020\b2\b\b\u0001\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010(\u001a\u00020\b2\b\b\u0001\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0011J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u001eJ\u0017\u0010+\u001a\u00020\b2\b\b\u0001\u0010'\u001a\u00020\u000f¢\u0006\u0004\b+\u0010\u0011J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u001eJ\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u001eJ\u0015\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010;J-\u0010@\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f¢\u0006\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010J\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010DR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/widget/FeatureItemView;", "Landroid/widget/LinearLayout;", "Landroid/graphics/drawable/Drawable;", "icon", "", "iconCircle", "", "iconCorners", "", "setIcon", "(Landroid/graphics/drawable/Drawable;ZF)V", "(Landroid/graphics/drawable/Drawable;)V", "", "url", "(Ljava/lang/String;)V", "", "iconRes", "(I)V", "setCircleIcon", "corner", "setRoundedIcon", "(Landroid/graphics/drawable/Drawable;F)V", "(IF)V", "title", "setTitle", "titleRes", Column.SUBTITLE, "setSubtitle", "isEnabled", "setSubTitleTextEnable", "(Z)V", "setRemindTextEnable", "isBold", "setTitleBold", "remindText", "setRemindText", "remindTextRes", "remindDotColor", "setRemindDotColor", "drawable", "setRemindDotDrawable", "more", "showMore", "setEndButtonIcon", "Landroid/view/View;", "btn", "setEndButton", "(Landroid/view/View;)V", "switchOn", "setSwitch", "getSwitch", "()Z", "showSwitch", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "callback", "setOnCheckedChangeCallback", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;)V", "enable", "setEnable", "(ZI)V", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "setViewPadding", "(IIII)V", "Landroid/widget/ImageView;", "mIvFeatureItemStartIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemSubtitle", "mTvFeatureItemRemind", "mIvFeatureItemMore", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "mIvFeatureItemSwitchBtn", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeatureItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureItemView.kt\ncom/xiaomi/fitness/widget/FeatureItemView\n+ 2 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt\n+ 3 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt$loadWithLifecycle$1\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,297:1\n270#2,9:298\n279#2,3:308\n282#2,8:312\n272#3:307\n24#4:311\n54#4,3:320\n24#4:323\n59#4,6:324\n54#4,3:330\n24#4:333\n59#4,6:334\n54#4,3:340\n24#4:343\n59#4,6:344\n54#4,3:350\n24#4:353\n59#4,6:354\n*S KotlinDebug\n*F\n+ 1 FeatureItemView.kt\ncom/xiaomi/fitness/widget/FeatureItemView\n*L\n131#1:298,9\n131#1:308,3\n131#1:312,8\n131#1:307\n131#1:311\n141#1:320,3\n141#1:323\n141#1:324,6\n148#1:330,3\n148#1:333\n148#1:334,6\n155#1:340,3\n155#1:343\n155#1:344,6\n162#1:350,3\n162#1:353\n162#1:354,6\n*E\n"})
public class FeatureItemView extends LinearLayout {

    @NotNull
    private final ImageView mIvFeatureItemMore;

    @NotNull
    private final ImageView mIvFeatureItemStartIcon;

    @NotNull
    private final SwitchButton mIvFeatureItemSwitchBtn;

    @NotNull
    private final TextView mTvFeatureItemRemind;

    @NotNull
    private final TextView mTvFeatureItemSubtitle;

    @NotNull
    private final TextView mTvFeatureItemTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeatureItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setIcon(Drawable icon, boolean iconCircle, float iconCorners) {
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

    public final boolean getSwitch() {
        return this.mIvFeatureItemSwitchBtn.isChecked();
    }

    public final void setCircleIcon(@Nullable Drawable icon) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public void setEnable(boolean enable, int drawable) {
        this.mTvFeatureItemTitle.setTextColor(x44.a(enable ? lki.f25173a : lki.common_item_sub_title_txt_color));
        this.mIvFeatureItemStartIcon.setImageResource(drawable);
    }

    public final void setEndButton(@NotNull View btn) {
        Intrinsics.checkNotNullParameter(btn, "btn");
        removeView(this.mIvFeatureItemMore);
        addView(btn);
    }

    public final void setEndButtonIcon(int drawable) {
        this.mIvFeatureItemMore.setImageResource(drawable);
    }

    public final void setOnCheckedChangeCallback(@NotNull ISwitchButton.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mIvFeatureItemSwitchBtn.setOnCheckedChangeCallback(callback);
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
        if (isEnabled) {
            this.mTvFeatureItemRemind.setTextColor(ViewExtKt.getColor(this, lki.e));
        } else {
            this.mTvFeatureItemRemind.setTextColor(ViewExtKt.getColor(this, lki.f25174b));
        }
    }

    public final void setRoundedIcon(@Nullable Drawable icon, float corner) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setSubTitleTextEnable(boolean isEnabled) {
        if (isEnabled) {
            this.mTvFeatureItemSubtitle.setTextColor(ViewExtKt.getColor(this, lki.e));
        } else {
            this.mTvFeatureItemSubtitle.setTextColor(ViewExtKt.getColor(this, lki.f25174b));
        }
    }

    public final void setSubtitle(@Nullable String subtitle) {
        if (subtitle == null || subtitle.length() == 0) {
            ViewExtKt.gone(this.mTvFeatureItemSubtitle);
        } else {
            ViewExtKt.visible(this.mTvFeatureItemSubtitle);
            this.mTvFeatureItemSubtitle.setText(subtitle);
        }
    }

    public final void setSwitch(boolean switchOn) {
        this.mIvFeatureItemSwitchBtn.setChecked(switchOn);
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

    public final void showSwitch(boolean more) {
        ViewExtKt.setVisible(this.mIvFeatureItemSwitchBtn, more);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeatureItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ FeatureItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeatureItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.U0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b5j.V0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.W0, false);
        float f = typedArrayObtainStyledAttributes.getFloat(b5j.X0, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(b5j.f1);
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.e1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b5j.c1, false);
        typedArrayObtainStyledAttributes.getBoolean(b5j.b1, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(b5j.d1, false);
        int color = typedArrayObtainStyledAttributes.getColor(b5j.Y0, ViewExtKt.getColor(this, lki.d));
        float dimension = typedArrayObtainStyledAttributes.getDimension(b5j.j1, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(b5j.i1, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(b5j.k1, 0.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(b5j.h1, 0.0f);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(b5j.a1, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(b5j.g1, false);
        String string3 = typedArrayObtainStyledAttributes.getString(b5j.Z0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(qvi.n, (ViewGroup) this, true);
        this.mIvFeatureItemStartIcon = (ImageView) viewInflate.findViewById(ksi.t);
        this.mTvFeatureItemTitle = (TextView) viewInflate.findViewById(ksi.O);
        this.mTvFeatureItemSubtitle = (TextView) viewInflate.findViewById(ksi.N);
        TextView textView = (TextView) viewInflate.findViewById(ksi.L);
        this.mTvFeatureItemRemind = textView;
        this.mIvFeatureItemMore = (ImageView) viewInflate.findViewById(ksi.s);
        this.mIvFeatureItemSwitchBtn = (SwitchButton) viewInflate.findViewById(ksi.A);
        int i2 = (int) dimension;
        int i3 = (int) dimension3;
        int i4 = (int) dimension4;
        setPadding(i2 != 0 ? i2 : (int) ViewExtKt.getDimen(this, bmi.f4371b), i3 == 0 ? 0 : i3, i2 != 0 ? (int) dimension2 : (int) ViewExtKt.getDimen(this, bmi.c), i4 == 0 ? 0 : i4);
        setIcon(drawable, z, f);
        setTitle(string);
        setSubtitle(string2);
        showSwitch(z3);
        if (z3) {
            showMore(false);
        }
        setRemindTextEnable(z4);
        setTitleBold(z5);
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
        ViewExtKt.gone(textView);
    }

    public final void setIcon(@Nullable Drawable icon) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        this.mIvFeatureItemStartIcon.setImageDrawable(icon);
    }

    public final void setSubtitle(int subtitle) {
        this.mTvFeatureItemSubtitle.setText(subtitle);
    }

    public final void setIcon(@Nullable String url) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, true ^ (url == null || url.length() == 0));
        ImageView imageView = this.mIvFeatureItemStartIcon;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(imageView);
        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest imageRequestBuild = new ImageRequest.Builder(context).data(url).target(imageView).lifecycle(lifecycle).build();
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Disposable disposableEnqueue = Coil.imageLoader(context2).enqueue(imageRequestBuild);
        if (lifecycle != null) {
            lifecycle.addObserver(new ViewExtKt.AnonymousClass2(disposableEnqueue, lifecycle));
        }
    }

    public final void setRemindText(int remindTextRes) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, -2, -2);
        this.mTvFeatureItemRemind.setText(remindTextRes);
    }

    public final void setCircleIcon(int iconRes) {
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setRoundedIcon(int iconRes, float corner) {
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setIcon(int iconRes) {
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        this.mIvFeatureItemStartIcon.setImageResource(iconRes);
    }
}

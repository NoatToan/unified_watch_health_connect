package com.xiaomi.fitness.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
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
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.b5j;
import defpackage.bmi;
import defpackage.ksi;
import defpackage.lki;
import defpackage.p80;
import defpackage.qoi;
import defpackage.qvi;
import defpackage.r1j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010M\u001a\u00020L\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N\u0012\b\b\u0002\u0010P\u001a\u00020\u0011¢\u0006\u0004\bQ\u0010RJ)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010\"\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010%\u001a\u00020\b2\b\b\u0001\u0010$\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\b2\b\b\u0001\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0013J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u001eJ\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\u001eJ\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u001eJ-\u0010;\u001a\u00020\b2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<J=\u0010@\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "Landroid/widget/LinearLayout;", "Landroid/graphics/drawable/Drawable;", "icon", "", "iconCircle", "", "iconCorners", "", "setIcon", "(Landroid/graphics/drawable/Drawable;ZF)V", "setupViewAccessibility", "()V", "(Landroid/graphics/drawable/Drawable;)V", "", "url", "(Ljava/lang/String;)V", "", "iconRes", "(I)V", "setCircleIcon", "corner", "setRoundedIcon", "(Landroid/graphics/drawable/Drawable;F)V", "(IF)V", "title", "setTitle", "titleRes", "isEnabled", "setRemindTextEnable", "(Z)V", "isBold", "setTitleBold", "remindText", "setRemindText", "remindTextRes", "remindDotColor", "setRemindDotColor", "drawable", "setRemindDotDrawable", "switchOn", "setSwitch", "getSwitch", "()Z", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "getSwitchButton", "()Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "more", "showSwitch", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "callback", "setOnCheckedChangeCallback", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;)V", "enable", "setEnable", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "setViewPadding", "(IIII)V", "Landroid/graphics/drawable/Icon;", "iconDrawable", Constants.KEY_RECHARGE_ICON_URL, "setSwitchViewPadding", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "mIvFeatureItemStartIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemRemind", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "mIvFeatureItemSwitchBtn", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSwitchButtonSingleLineTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchButtonSingleLineTextView.kt\ncom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView\n+ 2 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt\n+ 3 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt$loadWithLifecycle$1\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,303:1\n270#2,9:304\n279#2,3:314\n282#2,8:318\n272#3:313\n24#4:317\n54#4,3:326\n24#4:329\n59#4,6:330\n54#4,3:336\n24#4:339\n59#4,6:340\n54#4,3:346\n24#4:349\n59#4,6:350\n54#4,3:356\n24#4:359\n59#4,6:360\n*S KotlinDebug\n*F\n+ 1 SwitchButtonSingleLineTextView.kt\ncom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView\n*L\n147#1:304,9\n147#1:314,3\n147#1:318,8\n147#1:313\n147#1:317\n159#1:326,3\n159#1:329\n159#1:330,6\n167#1:336,3\n167#1:339\n167#1:340,6\n175#1:346,3\n175#1:349\n175#1:350,6\n183#1:356,3\n183#1:359\n183#1:360,6\n*E\n"})
public class SwitchButtonSingleLineTextView extends LinearLayout {

    @NotNull
    private final ImageView mIvFeatureItemStartIcon;

    @NotNull
    private final SwitchButton mIvFeatureItemSwitchBtn;

    @NotNull
    private final TextView mTvFeatureItemRemind;

    @NotNull
    private final TextView mTvFeatureItemTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonSingleLineTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setIcon(Drawable icon, boolean iconCircle, float iconCorners) {
        setSwitchViewPadding$default(this, icon, null, null, null, 14, null);
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

    public static /* synthetic */ void setSwitchViewPadding$default(SwitchButtonSingleLineTextView switchButtonSingleLineTextView, Drawable drawable, Integer num, Icon icon, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSwitchViewPadding");
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
        switchButtonSingleLineTextView.setSwitchViewPadding(drawable, num, icon, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupViewAccessibility$lambda$0(SwitchButtonSingleLineTextView this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.mIvFeatureItemSwitchBtn.onTouchEvent(motionEvent);
    }

    public final boolean getSwitch() {
        return this.mIvFeatureItemSwitchBtn.isChecked();
    }

    @NotNull
    public final ISwitchButton getSwitchButton() {
        return this.mIvFeatureItemSwitchBtn;
    }

    public final void setCircleIcon(@Nullable Drawable icon) {
        setSwitchViewPadding$default(this, icon, null, null, null, 14, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public void setEnable(boolean enable) {
        setEnabled(false);
        this.mTvFeatureItemTitle.setEnabled(false);
        this.mTvFeatureItemRemind.setEnabled(false);
        this.mIvFeatureItemSwitchBtn.setEnabled(false);
        this.mIvFeatureItemStartIcon.setEnabled(false);
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
        this.mTvFeatureItemRemind.setEnabled(isEnabled);
    }

    public final void setRoundedIcon(@Nullable Drawable icon, float corner) {
        setSwitchViewPadding$default(this, icon, null, null, null, 14, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setSwitch(boolean switchOn) {
        this.mIvFeatureItemSwitchBtn.setChecked(switchOn);
        this.mIvFeatureItemSwitchBtn.setContentDescription(ResourceExtKt.getString(switchOn ? r1j.common_switch_open_content : r1j.common_switch_off_content));
    }

    public final void setSwitchViewPadding(@Nullable Drawable icon, @Nullable Integer iconRes, @Nullable Icon iconDrawable, @Nullable String iconUrl) {
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

    public void setupViewAccessibility() {
        if (p80.a(ApplicationExtKt.getApplication())) {
            this.mIvFeatureItemSwitchBtn.setFocusable(0);
            setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView.setupViewAccessibility.1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                }
            });
            setOnTouchListener(new View.OnTouchListener() { // from class: hro
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SwitchButtonSingleLineTextView.setupViewAccessibility$lambda$0(this.f20382a, view, motionEvent);
                }
            });
        } else {
            this.mIvFeatureItemSwitchBtn.setFocusable(1);
            setAccessibilityDelegate(null);
            setOnTouchListener(null);
        }
    }

    public final void showSwitch(boolean more) {
        ViewExtKt.setVisible(this.mIvFeatureItemSwitchBtn, more);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonSingleLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ SwitchButtonSingleLineTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonSingleLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.d5);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b5j.e5);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.f5, false);
        float f = typedArrayObtainStyledAttributes.getFloat(b5j.g5, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(b5j.m5);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b5j.k5, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(b5j.l5, true);
        int color = typedArrayObtainStyledAttributes.getColor(b5j.h5, ViewExtKt.getColor(this, lki.d));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(b5j.j5, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(b5j.n5, false);
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.i5);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(qvi.i, (ViewGroup) this, true);
        this.mIvFeatureItemStartIcon = (ImageView) viewInflate.findViewById(ksi.t);
        this.mTvFeatureItemTitle = (TextView) viewInflate.findViewById(ksi.O);
        TextView textView = (TextView) viewInflate.findViewById(ksi.L);
        this.mTvFeatureItemRemind = textView;
        this.mIvFeatureItemSwitchBtn = (SwitchButton) viewInflate.findViewById(ksi.A);
        setSwitchViewPadding$default(this, drawable, null, null, null, 14, null);
        viewInflate.setBackgroundResource(qoi.h);
        setIcon(drawable, z, f);
        setTitle(string);
        showSwitch(z3);
        setRemindTextEnable(z4);
        setTitleBold(z5);
        if (z2) {
            if (string2 != null && string2.length() != 0) {
                setRemindText(string2);
                setRemindTextEnable(z2);
            } else {
                setRemindDotColor(color);
            }
        } else {
            ViewExtKt.gone(textView);
        }
        setupViewAccessibility();
    }

    public final void setIcon(@Nullable Drawable icon) {
        setSwitchViewPadding$default(this, icon, null, null, null, 14, null);
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        this.mIvFeatureItemStartIcon.setImageDrawable(icon);
    }

    public final void setRemindText(int remindTextRes) {
        ViewExtKt.visible(this.mTvFeatureItemRemind);
        ViewExtKt.setWidthAndHeight(this.mTvFeatureItemRemind, -2, -2);
        this.mTvFeatureItemRemind.setText(remindTextRes);
    }

    public final void setIcon(@Nullable String url) {
        setSwitchViewPadding$default(this, null, null, null, url, 7, null);
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

    public final void setCircleIcon(int iconRes) {
        setSwitchViewPadding$default(this, null, Integer.valueOf(iconRes), null, null, 13, null);
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setRoundedIcon(int iconRes, float corner) {
        setSwitchViewPadding$default(this, null, Integer.valueOf(iconRes), null, null, 13, null);
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setIcon(int iconRes) {
        setSwitchViewPadding$default(this, null, Integer.valueOf(iconRes), null, null, 13, null);
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        this.mIvFeatureItemStartIcon.setImageResource(iconRes);
    }
}

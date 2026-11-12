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
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010W\u001a\u00020V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X\u0012\b\b\u0002\u0010Z\u001a\u00020\u0017¢\u0006\u0004\b[\u0010\\J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0013J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\t\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001c\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b \u0010\u0016J\u0017\u0010 \u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u0019J\u0017\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b#\u0010\u0016J\u0017\u0010#\u001a\u00020\b2\b\b\u0001\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u0019J\u0015\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0017¢\u0006\u0004\b%\u0010\u0019J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0012J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u0012J\u0017\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b,\u0010\u0016J\u0017\u0010,\u001a\u00020\b2\b\b\u0001\u0010-\u001a\u00020\u0017¢\u0006\u0004\b,\u0010\u0019J\u0017\u0010/\u001a\u00020\b2\b\b\u0001\u0010.\u001a\u00020\u0017¢\u0006\u0004\b/\u0010\u0019J\u0017\u00101\u001a\u00020\b2\b\b\u0001\u00100\u001a\u00020\u0017¢\u0006\u0004\b1\u0010\u0019J\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\u0012J\r\u00104\u001a\u00020\u0004¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\u0012J\u0015\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\u0012J-\u0010B\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u0017¢\u0006\u0004\bB\u0010CJ\r\u0010E\u001a\u00020D¢\u0006\u0004\bE\u0010FJ=\u0010J\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010S\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u0014\u0010T\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006]"}, d2 = {"Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "Landroid/widget/LinearLayout;", "Landroid/graphics/drawable/Drawable;", "icon", "", "iconCircle", "", "iconCorners", "", "setIcon", "(Landroid/graphics/drawable/Drawable;ZF)V", "setupViewAccessibility", "()V", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "getSwitchButton", "()Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "isSingleLine", "isTitleSingleLine", "(Z)V", "(Landroid/graphics/drawable/Drawable;)V", "", "url", "(Ljava/lang/String;)V", "", "iconRes", "(I)V", "setCircleIcon", "corner", "setRoundedIcon", "(Landroid/graphics/drawable/Drawable;F)V", "(IF)V", "title", "setTitle", "titleRes", Column.SUBTITLE, "setSubtitle", "maxLines", "setSubTitleMaxLines", "isEnabled", "setSubTitleTextEnable", "setRemindTextEnable", "isBold", "setTitleBold", "remindText", "setRemindText", "remindTextRes", "remindDotColor", "setRemindDotColor", "drawable", "setRemindDotDrawable", "switchOn", "setSwitch", "getSwitch", "()Z", "more", "showSwitch", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "callback", "setOnCheckedChangeCallback", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;)V", "enable", "setEnable", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "setViewPadding", "(IIII)V", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "getSwitchButtonView", "()Lcom/xiaomi/fitness/widget/button/SwitchButton;", "Landroid/graphics/drawable/Icon;", "iconDrawable", Constants.KEY_RECHARGE_ICON_URL, "setSwitchViewPadding", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "mIvFeatureItemStartIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemSubtitle", "mTvFeatureItemRemind", "mIvFeatureItemSwitchBtn", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSwitchButtonTwoLineTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchButtonTwoLineTextView.kt\ncom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView\n+ 2 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt\n+ 3 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt$loadWithLifecycle$1\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,355:1\n270#2,9:356\n279#2,3:366\n282#2,8:370\n272#3:365\n24#4:369\n54#4,3:378\n24#4:381\n59#4,6:382\n54#4,3:388\n24#4:391\n59#4,6:392\n54#4,3:398\n24#4:401\n59#4,6:402\n54#4,3:408\n24#4:411\n59#4,6:412\n*S KotlinDebug\n*F\n+ 1 SwitchButtonTwoLineTextView.kt\ncom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView\n*L\n172#1:356,9\n172#1:366,3\n172#1:370,8\n172#1:365\n172#1:369\n184#1:378,3\n184#1:381\n184#1:382,6\n192#1:388,3\n192#1:391\n192#1:392,6\n200#1:398,3\n200#1:401\n200#1:402,6\n208#1:408,3\n208#1:411\n208#1:412,6\n*E\n"})
public class SwitchButtonTwoLineTextView extends LinearLayout {

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
    public SwitchButtonTwoLineTextView(@NotNull Context context) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeCallback$lambda$5(ISwitchButton.a callback, SwitchButtonTwoLineTextView this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        callback.onCheckedChanged(this$0.mIvFeatureItemSwitchBtn.isChecked(), this$0.mIvFeatureItemSwitchBtn);
        this$0.mIvFeatureItemSwitchBtn.setContentDescription(ResourceExtKt.getString(this$0.mIvFeatureItemSwitchBtn.isChecked() ? r1j.common_switch_open_content : r1j.common_switch_off_content));
    }

    public static /* synthetic */ void setSwitchViewPadding$default(SwitchButtonTwoLineTextView switchButtonTwoLineTextView, Drawable drawable, Integer num, Icon icon, String str, int i, Object obj) {
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
        switchButtonTwoLineTextView.setSwitchViewPadding(drawable, num, icon, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupViewAccessibility$lambda$0(SwitchButtonTwoLineTextView this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("SwitchButtonTwoLineTextView", "onTouchListener");
        return this$0.mIvFeatureItemSwitchBtn.onTouchEvent(motionEvent);
    }

    public final boolean getSwitch() {
        return this.mIvFeatureItemSwitchBtn.isChecked();
    }

    @NotNull
    public final ISwitchButton getSwitchButton() {
        return this.mIvFeatureItemSwitchBtn;
    }

    @NotNull
    /* JADX INFO: renamed from: getSwitchButtonView, reason: from getter */
    public final SwitchButton getMIvFeatureItemSwitchBtn() {
        return this.mIvFeatureItemSwitchBtn;
    }

    public final void isTitleSingleLine(boolean isSingleLine) {
        this.mTvFeatureItemTitle.setSingleLine(isSingleLine);
        if (isSingleLine) {
            this.mTvFeatureItemTitle.setMaxLines(1);
        } else {
            this.mTvFeatureItemTitle.setMaxLines(Integer.MAX_VALUE);
        }
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
        setEnabled(enable);
        this.mIvFeatureItemStartIcon.setEnabled(enable);
        this.mIvFeatureItemSwitchBtn.setEnabled(enable);
        this.mTvFeatureItemRemind.setEnabled(enable);
        this.mTvFeatureItemSubtitle.setEnabled(enable);
        this.mTvFeatureItemTitle.setEnabled(enable);
    }

    public final void setOnCheckedChangeCallback(@NotNull final ISwitchButton.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mIvFeatureItemSwitchBtn.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: jro
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SwitchButtonTwoLineTextView.setOnCheckedChangeCallback$lambda$5(callback, this, z, iSwitchButton);
            }
        });
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
        if (!p80.a(ApplicationExtKt.getApplication())) {
            this.mIvFeatureItemSwitchBtn.setFocusable(1);
            setAccessibilityDelegate(null);
            setOnTouchListener(null);
        } else {
            this.mIvFeatureItemSwitchBtn.setFocusable(0);
            setFocusable(0);
            setClickable(false);
            setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView.setupViewAccessibility.1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                    Logger.i("SwitchButtonTwoLineTextView", "info " + info);
                }
            });
            setOnTouchListener(new View.OnTouchListener() { // from class: iro
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SwitchButtonTwoLineTextView.setupViewAccessibility$lambda$0(this.f22026a, view, motionEvent);
                }
            });
        }
    }

    public final void showSwitch(boolean more) {
        ViewExtKt.setVisible(this.mIvFeatureItemSwitchBtn, more);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonTwoLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ SwitchButtonTwoLineTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonTwoLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.o5);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b5j.p5);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.q5, false);
        float f = typedArrayObtainStyledAttributes.getFloat(b5j.r5, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(b5j.A5);
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.z5);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b5j.w5, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(b5j.x5, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(b5j.v5, true);
        int color = typedArrayObtainStyledAttributes.getColor(b5j.s5, ViewExtKt.getColor(this, lki.d));
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(b5j.u5, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(b5j.B5, false);
        String string3 = typedArrayObtainStyledAttributes.getString(b5j.t5);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(b5j.y5, true);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(qvi.m, (ViewGroup) this, true);
        if (z4) {
            viewInflate.setBackgroundResource(qoi.h);
        }
        this.mIvFeatureItemStartIcon = (ImageView) viewInflate.findViewById(ksi.t);
        this.mTvFeatureItemTitle = (TextView) viewInflate.findViewById(ksi.O);
        this.mTvFeatureItemSubtitle = (TextView) viewInflate.findViewById(ksi.N);
        TextView textView = (TextView) viewInflate.findViewById(ksi.L);
        this.mTvFeatureItemRemind = textView;
        this.mIvFeatureItemSwitchBtn = (SwitchButton) viewInflate.findViewById(ksi.A);
        setIcon(drawable, z, f);
        setTitle(string);
        setSubtitle(string2);
        showSwitch(z3);
        setRemindTextEnable(z5);
        setTitleBold(z6);
        isTitleSingleLine(z7);
        if (z2) {
            if (string3 != null && string3.length() != 0) {
                setRemindText(string3);
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

    public final void setSubtitle(int subtitle) {
        this.mTvFeatureItemSubtitle.setText(subtitle);
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

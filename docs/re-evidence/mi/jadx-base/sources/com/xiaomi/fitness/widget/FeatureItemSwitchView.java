package com.xiaomi.fitness.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.b5j;
import defpackage.ksi;
import defpackage.qvi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\f¢\u0006\u0004\b1\u00102J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/widget/FeatureItemSwitchView;", "Landroid/widget/LinearLayout;", "Landroid/graphics/drawable/Drawable;", "icon", "", "iconCircle", "", "iconCorners", "", "setIcon", "(Landroid/graphics/drawable/Drawable;ZF)V", "(Landroid/graphics/drawable/Drawable;)V", "", "iconRes", "(I)V", "setCircleIcon", "corner", "setRoundedIcon", "(Landroid/graphics/drawable/Drawable;F)V", "(IF)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "titleRes", Column.SUBTITLE, "setSubtitle", "switchOn", "setSwitch", "(Z)V", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "callback", "setOnCheckedChangeCallback", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;)V", "Landroid/widget/ImageView;", "mIvFeatureItemStartIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "mTvFeatureItemTitle", "Landroid/widget/TextView;", "mTvFeatureItemSubtitle", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "mSwitchBtn", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeatureItemSwitchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureItemSwitchView.kt\ncom/xiaomi/fitness/widget/FeatureItemSwitchView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,142:1\n54#2,3:143\n24#2:146\n59#2,6:147\n54#2,3:153\n24#2:156\n59#2,6:157\n54#2,3:163\n24#2:166\n59#2,6:167\n54#2,3:173\n24#2:176\n59#2,6:177\n*S KotlinDebug\n*F\n+ 1 FeatureItemSwitchView.kt\ncom/xiaomi/fitness/widget/FeatureItemSwitchView\n*L\n87#1:143,3\n87#1:146\n87#1:147,6\n94#1:153,3\n94#1:156\n94#1:157,6\n101#1:163,3\n101#1:166\n101#1:167,6\n108#1:173,3\n108#1:176\n108#1:177,6\n*E\n"})
public class FeatureItemSwitchView extends LinearLayout {

    @NotNull
    private final ImageView mIvFeatureItemStartIcon;

    @NotNull
    private final SwitchButton mSwitchBtn;

    @NotNull
    private final TextView mTvFeatureItemSubtitle;

    @NotNull
    private final TextView mTvFeatureItemTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeatureItemSwitchView(@NotNull Context context) {
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

    public final void setCircleIcon(@Nullable Drawable icon) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new CircleCropTransformation());
        imageLoader.enqueue(builderTarget.build());
    }

    public final void setOnCheckedChangeCallback(@NotNull ISwitchButton.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mSwitchBtn.setOnCheckedChangeCallback(callback);
    }

    public final void setRoundedIcon(@Nullable Drawable icon, float corner) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        ImageView imageView = this.mIvFeatureItemStartIcon;
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(icon).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(corner));
        imageLoader.enqueue(builderTarget.build());
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
        this.mSwitchBtn.setChecked(switchOn);
    }

    public final void setTitle(@Nullable String title) {
        this.mTvFeatureItemTitle.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeatureItemSwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int titleRes) {
        this.mTvFeatureItemTitle.setText(titleRes);
    }

    public /* synthetic */ FeatureItemSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeatureItemSwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.N0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b5j.O0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.P0, false);
        float f = typedArrayObtainStyledAttributes.getFloat(b5j.Q0, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(b5j.T0);
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.S0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b5j.R0, false);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(context).inflate(qvi.o, (ViewGroup) this, true);
        this.mIvFeatureItemStartIcon = (ImageView) viewInflate.findViewById(ksi.t);
        this.mTvFeatureItemTitle = (TextView) viewInflate.findViewById(ksi.O);
        this.mTvFeatureItemSubtitle = (TextView) viewInflate.findViewById(ksi.N);
        this.mSwitchBtn = (SwitchButton) viewInflate.findViewById(ksi.A);
        setIcon(drawable, z, f);
        setTitle(string);
        setSubtitle(string2);
        setSwitch(z2);
    }

    public final void setIcon(@Nullable Drawable icon) {
        ViewExtKt.setVisible(this.mIvFeatureItemStartIcon, icon != null);
        this.mIvFeatureItemStartIcon.setImageDrawable(icon);
    }

    public final void setSubtitle(int subtitle) {
        this.mTvFeatureItemSubtitle.setText(subtitle);
    }

    public final void setIcon(int iconRes) {
        ViewExtKt.visible(this.mIvFeatureItemStartIcon);
        this.mIvFeatureItemStartIcon.setImageResource(iconRes);
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
}

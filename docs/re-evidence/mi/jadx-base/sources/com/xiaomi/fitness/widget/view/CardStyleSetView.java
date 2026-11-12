package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.tsmclient.entity.CardUIInfo;
import defpackage.b5j;
import defpackage.ksi;
import defpackage.lki;
import defpackage.qvi;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0018\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010!\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020\u0007H\u0016J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010%J\u0010\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010%J\u000e\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u0007H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00078UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "title_", "Landroid/widget/TextView;", "des_", "left_", "Landroid/widget/ImageView;", "arrow_", "subTitle_", "cardRoot_", "Landroid/view/View;", "getCardRoot_", "()Landroid/view/View;", "setCardRoot_", "(Landroid/view/View;)V", "redDot", "onInitView", "", "Landroid/content/res/TypedArray;", "layoutRes", "getLayoutRes", "()I", "initView", "setValue", "typedArray", "setBackgroundResource", "res", "setDes", "des", "", "setTitle", "title", "setSubTitle", CardUIInfo.KEY_SUBTITILE, "setLeft_", "leftRes", "showRedDot", "show", "", "setEnable", "enable", "drawable", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CardStyleSetView extends ConstraintLayout {

    @Nullable
    private ImageView arrow_;

    @Nullable
    private View cardRoot_;

    @Nullable
    private TextView des_;

    @Nullable
    private ImageView left_;

    @Nullable
    private final View redDot;

    @Nullable
    private TextView subTitle_;

    @Nullable
    private TextView title_;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardStyleSetView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView() {
        this.left_ = (ImageView) findViewById(ksi.f24264k);
        this.title_ = (TextView) findViewById(ksi.l);
        this.des_ = (TextView) findViewById(ksi.i);
        this.arrow_ = (ImageView) findViewById(ksi.j);
        this.subTitle_ = (TextView) findViewById(ksi.m);
        this.cardRoot_ = findViewById(ksi.h);
    }

    private final void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(b5j.J);
        String string2 = typedArray.getString(b5j.H);
        String string3 = typedArray.getString(b5j.I);
        if (!typedArray.getBoolean(b5j.G, true)) {
            ImageView imageView = this.arrow_;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(8);
        }
        int resourceId = typedArray.getResourceId(b5j.F, 0);
        if (resourceId == 0) {
            ImageView imageView2 = this.left_;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setVisibility(8);
        } else {
            ImageView imageView3 = this.left_;
            Intrinsics.checkNotNull(imageView3);
            imageView3.setImageResource(resourceId);
        }
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setText(string);
        TextView textView2 = this.des_;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(string2);
        setSubTitle(string3);
    }

    @Nullable
    public final View getCardRoot_() {
        return this.cardRoot_;
    }

    public int getLayoutRes() {
        return qvi.f31888b;
    }

    public void onInitView(@Nullable Context context, @Nullable AttributeSet attrs, @NotNull TypedArray defStyleAttr) {
        Intrinsics.checkNotNullParameter(defStyleAttr, "defStyleAttr");
    }

    @Override // android.view.View
    public void setBackgroundResource(int res) {
    }

    public final void setCardRoot_(@Nullable View view) {
        this.cardRoot_ = view;
    }

    public final void setDes(@NotNull String des) {
        Intrinsics.checkNotNullParameter(des, "des");
        TextView textView = this.des_;
        Intrinsics.checkNotNull(textView);
        textView.setText(des);
    }

    public void setEnable(boolean enable, int drawable) {
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(x44.a(enable ? lki.f25173a : lki.common_item_sub_title_txt_color));
        ImageView imageView = this.left_;
        Intrinsics.checkNotNull(imageView);
        imageView.setImageResource(drawable);
    }

    public final void setLeft_(int leftRes) {
        if (leftRes == 0) {
            ImageView imageView = this.left_;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(8);
        } else {
            ImageView imageView2 = this.left_;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setVisibility(0);
            ImageView imageView3 = this.left_;
            Intrinsics.checkNotNull(imageView3);
            imageView3.setImageResource(leftRes);
        }
    }

    public final void setSubTitle(@Nullable String subTitle) {
        if (TextUtils.isEmpty(subTitle)) {
            TextView textView = this.subTitle_;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.subTitle_;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(subTitle);
            TextView textView3 = this.subTitle_;
            Intrinsics.checkNotNull(textView3);
            textView3.setVisibility(0);
        }
    }

    public final void setTitle(@Nullable String title) {
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
    }

    public final void showRedDot(boolean show) {
        if (show) {
            View view = this.redDot;
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
        } else {
            View view2 = this.redDot;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardStyleSetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardStyleSetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardStyleSetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(getLayoutRes(), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.E);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        initView();
        onInitView(context, attributeSet, typedArrayObtainStyledAttributes);
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}

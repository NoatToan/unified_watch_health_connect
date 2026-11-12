package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.b5j;
import defpackage.ksi;
import defpackage.lki;
import defpackage.ni4;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010$J\u0010\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u001b2\b\b\u0001\u0010+\u001a\u00020\u0007J\u0010\u0010,\u001a\u00020\u001b2\b\b\u0001\u0010+\u001a\u00020\u0007J\u000e\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020!J\u000e\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020!J\u000e\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020!J\u0010\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020!H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010-\u001a\u0004\u0018\u00010$2\b\u0010\u0014\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/widget/view/SetRightArrowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rootView_", "Landroid/view/View;", "title_", "Landroid/widget/TextView;", "des_", "getDes_", "()Landroid/widget/TextView;", "setDes_", "(Landroid/widget/TextView;)V", "line_", "value", "rightValueView", "getRightValueView", "rightImgV", "Landroid/widget/ImageView;", "rightRedPoint_", "initView", "", "setValue", "typedArray", "Landroid/content/res/TypedArray;", "setThemeBlack", "isBlack", "", "setDes", "des", "", "setTitle", "title", "setTitleStyle", "typeface", "Landroid/graphics/Typeface;", "setTitleColor", "colorId", "setRightValueTextColor", "rightValue", "getRightValue", "()Ljava/lang/String;", "setRightValue", "(Ljava/lang/String;)V", "showRightIcon", PluginDeviceInfo.FDESC, "setLineShow", "isLineShow", "setRedPointShow", "isRedPointShow", "setEnabled", "enabled", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSetRightArrowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetRightArrowView.kt\ncom/xiaomi/fitness/widget/view/SetRightArrowView\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,175:1\n108#2:176\n80#2,22:177\n*S KotlinDebug\n*F\n+ 1 SetRightArrowView.kt\ncom/xiaomi/fitness/widget/view/SetRightArrowView\n*L\n134#1:176\n134#1:177,22\n*E\n"})
public final class SetRightArrowView extends LinearLayout {

    @Nullable
    private TextView des_;

    @Nullable
    private View line_;

    @Nullable
    private ImageView rightImgV;

    @Nullable
    private View rightRedPoint_;

    @Nullable
    private TextView rightValueView;

    @Nullable
    private View rootView_;

    @Nullable
    private TextView title_;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetRightArrowView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView() {
        this.rootView_ = findViewById(ksi.z);
        this.title_ = (TextView) findViewById(ksi.d);
        this.des_ = (TextView) findViewById(ksi.f24263b);
        this.line_ = findViewById(ksi.c);
        this.rightImgV = (ImageView) findViewById(ksi.e);
        this.rightValueView = (TextView) findViewById(ksi.g);
        this.rightRedPoint_ = findViewById(ksi.f);
    }

    private final void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(b5j.y4);
        String string2 = typedArray.getString(b5j.v4);
        Drawable drawable = typedArray.getDrawable(b5j.z4);
        String string3 = typedArray.getString(b5j.C4);
        boolean z = typedArray.getBoolean(b5j.w4, false);
        boolean z2 = typedArray.getBoolean(b5j.x4, false);
        boolean z3 = typedArray.getBoolean(b5j.B4, false);
        boolean z4 = typedArray.getBoolean(b5j.A4, true);
        boolean z5 = typedArray.getBoolean(b5j.E4, false);
        boolean z6 = typedArray.getBoolean(b5j.F4, false);
        int resourceId = typedArray.getResourceId(b5j.D4, -1);
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setText(string);
        setThemeBlack(z6);
        if (z) {
            TextView textView2 = this.des_;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(0);
            TextView textView3 = this.des_;
            Intrinsics.checkNotNull(textView3);
            textView3.setText(string2);
        } else {
            TextView textView4 = this.des_;
            Intrinsics.checkNotNull(textView4);
            textView4.setVisibility(8);
        }
        if (z2) {
            View view = this.line_;
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
        } else {
            View view2 = this.line_;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(8);
        }
        if (z3) {
            TextView textView5 = this.rightValueView;
            Intrinsics.checkNotNull(textView5);
            textView5.setVisibility(0);
            TextView textView6 = this.rightValueView;
            Intrinsics.checkNotNull(textView6);
            textView6.setText(string3);
            setRightValueTextColor(resourceId);
        } else {
            TextView textView7 = this.rightValueView;
            Intrinsics.checkNotNull(textView7);
            textView7.setVisibility(8);
        }
        if (!z4) {
            ImageView imageView = this.rightImgV;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(8);
        }
        if (drawable != null) {
            ImageView imageView2 = this.rightImgV;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setImageDrawable(drawable);
        }
        if (z5) {
            View view3 = this.rightRedPoint_;
            Intrinsics.checkNotNull(view3);
            view3.setVisibility(0);
        } else {
            View view4 = this.rightRedPoint_;
            Intrinsics.checkNotNull(view4);
            view4.setVisibility(8);
        }
    }

    @Nullable
    public final TextView getDes_() {
        return this.des_;
    }

    @Nullable
    public final String getRightValue() {
        TextView textView = this.rightValueView;
        Intrinsics.checkNotNull(textView);
        String string = textView.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return string.subSequence(i, length + 1).toString();
    }

    @Nullable
    public final TextView getRightValueView() {
        return this.rightValueView;
    }

    public final void setDes(@NotNull String des) {
        Intrinsics.checkNotNullParameter(des, "des");
        TextView textView = this.des_;
        Intrinsics.checkNotNull(textView);
        textView.setText(des);
        TextView textView2 = this.des_;
        Intrinsics.checkNotNull(textView2);
        textView2.setVisibility(TextUtils.isEmpty(des) ? 8 : 0);
    }

    public final void setDes_(@Nullable TextView textView) {
        this.des_ = textView;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setEnabled(enabled);
        TextView textView2 = this.des_;
        Intrinsics.checkNotNull(textView2);
        textView2.setEnabled(enabled);
        TextView textView3 = this.rightValueView;
        Intrinsics.checkNotNull(textView3);
        textView3.setEnabled(enabled);
    }

    public final void setLineShow(boolean isLineShow) {
        if (isLineShow) {
            View view = this.line_;
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
        } else {
            View view2 = this.line_;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(4);
        }
    }

    public final void setRedPointShow(boolean isRedPointShow) {
        if (isRedPointShow) {
            View view = this.rightRedPoint_;
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
        } else {
            View view2 = this.rightRedPoint_;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(8);
        }
    }

    public final void setRightValue(@Nullable String str) {
        TextView textView = this.rightValueView;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(0);
        TextView textView2 = this.rightValueView;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(str);
    }

    public final void setRightValueTextColor(int colorId) {
        if (colorId != -1) {
            TextView textView = this.rightValueView;
            Intrinsics.checkNotNull(textView);
            textView.setTextColor(ni4.d(getContext(), colorId));
        }
    }

    public final void setThemeBlack(boolean isBlack) {
        View view = this.rootView_;
        Intrinsics.checkNotNull(view);
        view.setBackgroundResource(isBlack ? lki.common_main_dark_gray_color : qoi.h);
        setTitleColor(isBlack ? lki.u : lki.m);
        setRightValueTextColor(isBlack ? lki.u : lki.l);
        View view2 = this.line_;
        Intrinsics.checkNotNull(view2);
        view2.setBackgroundResource(isBlack ? lki.v : qoi.d);
    }

    public final void setTitle(@Nullable String title) {
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
    }

    public final void setTitleColor(int colorId) {
        if (colorId != -1) {
            TextView textView = this.title_;
            Intrinsics.checkNotNull(textView);
            textView.setTextColor(ni4.d(getContext(), colorId));
        }
    }

    public final void setTitleStyle(@Nullable Typeface typeface) {
        TextView textView = this.title_;
        Intrinsics.checkNotNull(textView);
        textView.setTypeface(typeface);
    }

    public final void showRightIcon(boolean b2) {
        ImageView imageView = this.rightImgV;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(b2 ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetRightArrowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SetRightArrowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetRightArrowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(qvi.g, this);
        setGravity(16);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.u4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}

package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.gki;
import defpackage.gsi;
import defpackage.mvi;
import defpackage.ppi;
import defpackage.rz5;
import defpackage.x44;
import defpackage.z4j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010r\u001a\u00020k\u0012\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u000eJ3\u0010\u001f\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\"\u0010@\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00108\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010'\"\u0004\bL\u0010)R\"\u0010M\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\u001bR\"\u0010R\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010\u001bR\"\u0010U\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR\"\u0010^\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010N\u001a\u0004\ba\u0010P\"\u0004\b\u0011\u0010\u001bR\"\u0010b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010N\u001a\u0004\bc\u0010P\"\u0004\bd\u0010\u001bR\"\u0010e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010N\u001a\u0004\bf\u0010P\"\u0004\bg\u0010\u001bR\"\u0010h\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010V\u001a\u0004\bi\u0010X\"\u0004\bj\u0010ZR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006w"}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "textView", "", "textSize", "textViewWidth", "(Landroid/widget/TextView;F)F", "Lrz5;", "model", "", "isUpdateStartOri", "", "setGravity", "(Lrz5;Z)V", "", "itemGravity", "setItemGravity", "(ILrz5;Z)V", "value", "name", "isCenter", "", "getDex", "(IIZ)Ljava/lang/String;", "colorRes", "setElementValueTxtColor", "(I)V", "onFinishInflate", "()V", "isAuto", "bindData", "(Lrz5;IZZ)V", "remindResource", "setTypeClickListener", "(Lrz5;Ljava/lang/Integer;)V", "mValueTV", "Landroid/widget/TextView;", "getMValueTV", "()Landroid/widget/TextView;", "setMValueTV", "(Landroid/widget/TextView;)V", "mNameTV", "getMNameTV", "setMNameTV", "unitTv", "getUnitTv", "setUnitTv", "Landroid/widget/ImageView;", "imageClickGuide", "Landroid/widget/ImageView;", "getImageClickGuide", "()Landroid/widget/ImageView;", "setImageClickGuide", "(Landroid/widget/ImageView;)V", "valueLayout", "Landroid/widget/LinearLayout;", "getValueLayout", "()Landroid/widget/LinearLayout;", "setValueLayout", "(Landroid/widget/LinearLayout;)V", "nameLayout", "getNameLayout", "setNameLayout", "imageGuideLayout", "getImageGuideLayout", "setImageGuideLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRootView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setRootView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "levelIcon", "getLevelIcon", "setLevelIcon", "txtValueColor", "I", "getTxtValueColor", "()I", "setTxtValueColor", "txtNameColor", "getTxtNameColor", "setTxtNameColor", "txtValueSize", "F", "getTxtValueSize", "()F", "setTxtValueSize", "(F)V", "txtNameSize", "getTxtNameSize", "setTxtNameSize", "itemHeight", "getItemHeight", "setItemHeight", "getItemGravity", "txtValueFount", "getTxtValueFount", "setTxtValueFount", "txtUnitColor", "getTxtUnitColor", "setTxtUnitColor", "txtUnitSize", "getTxtUnitSize", "setTxtUnitSize", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class SportDetailItemView extends LinearLayout {
    public ImageView imageClickGuide;
    public LinearLayout imageGuideLayout;
    private int itemGravity;
    private float itemHeight;
    public TextView levelIcon;

    @NotNull
    private Context mContext;
    public TextView mNameTV;
    public TextView mValueTV;
    public LinearLayout nameLayout;
    public ConstraintLayout rootView;
    private int txtNameColor;
    private float txtNameSize;
    private int txtUnitColor;
    private float txtUnitSize;
    private int txtValueColor;
    private int txtValueFount;
    private float txtValueSize;
    public TextView unitTv;
    public LinearLayout valueLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(mvi.l, this);
        this.mContext = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.p5);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.txtValueColor = typedArrayObtainStyledAttributes.getColor(z4j.w5, x44.a(gki.p));
            this.txtUnitColor = typedArrayObtainStyledAttributes.getColor(z4j.u5, x44.a(gki.f19087r));
            this.txtNameColor = typedArrayObtainStyledAttributes.getColor(z4j.s5, x44.a(gki.f19087r));
            this.txtValueSize = typedArrayObtainStyledAttributes.getDimension(z4j.y5, DisplayUtil.sp2px(24.0f));
            this.txtNameSize = typedArrayObtainStyledAttributes.getDimension(z4j.t5, DisplayUtil.sp2px(12.0f));
            this.itemHeight = typedArrayObtainStyledAttributes.getDimension(z4j.r5, DisplayUtil.dip2px(90.0f));
            this.txtUnitSize = typedArrayObtainStyledAttributes.getDimension(z4j.v5, DisplayUtil.dip2px(3.0f));
            this.itemGravity = typedArrayObtainStyledAttributes.getInt(z4j.q5, 0);
            this.txtValueFount = typedArrayObtainStyledAttributes.getResourceId(z4j.x5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ void bindData$default(SportDetailItemView sportDetailItemView, rz5 rz5Var, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        sportDetailItemView.bindData(rz5Var, i, z, z2);
    }

    private final String getDex(int value, int name, boolean isCenter) {
        StringBuilder sb = new StringBuilder("");
        int iAbs = Math.abs(value - name);
        for (int i = 0; i < iAbs; i++) {
            sb.append("  ");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final void setGravity(rz5 model, boolean isUpdateStartOri) {
        int i = this.itemGravity;
        if (i == 0) {
            if (isUpdateStartOri) {
                getNameLayout().setPadding(ExtUtilsKt.getDp(Float.valueOf(10.0f)), 0, 0, 0);
                getValueLayout().setPadding(ExtUtilsKt.getDp(Float.valueOf(10.0f)), 0, 0, 0);
                ViewGroup.LayoutParams layoutParams = getNameLayout().getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.t = getRootView().getId();
                layoutParams2.v = -1;
                getNameLayout().setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = getValueLayout().getLayoutParams();
                Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.t = getRootView().getId();
                layoutParams4.v = -1;
                layoutParams4.i = getRootView().getId();
                getValueLayout().setLayoutParams(layoutParams4);
                return;
            }
            getNameLayout().setPadding(0, 0, 0, 0);
            getValueLayout().setPadding(0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams5 = getNameLayout().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.t = getRootView().getId();
            layoutParams6.v = getRootView().getId();
            getNameLayout().setLayoutParams(layoutParams6);
            ViewGroup.LayoutParams layoutParams7 = getValueLayout().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.t = getRootView().getId();
            layoutParams8.v = getRootView().getId();
            layoutParams8.i = getRootView().getId();
            getValueLayout().setLayoutParams(layoutParams8);
            return;
        }
        if (i == 1) {
            getNameLayout().setPadding(0, 0, 0, 0);
            getValueLayout().setPadding(0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams9 = getValueLayout().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
            layoutParams10.t = getRootView().getId();
            layoutParams10.v = -1;
            layoutParams10.i = getRootView().getId();
            getValueLayout().setLayoutParams(layoutParams10);
            ViewGroup.LayoutParams layoutParams11 = getNameLayout().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
            layoutParams12.t = getRootView().getId();
            layoutParams12.v = -1;
            getNameLayout().setLayoutParams(layoutParams12);
            return;
        }
        if (i != 2) {
            return;
        }
        getNameLayout().setPadding(ExtUtilsKt.getDp(Float.valueOf(10.0f)), 0, 0, 0);
        getValueLayout().setPadding(ExtUtilsKt.getDp(Float.valueOf(10.0f)), 0, 0, 0);
        ViewGroup.LayoutParams layoutParams13 = getValueLayout().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams13, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
        layoutParams14.t = getRootView().getId();
        layoutParams14.v = -1;
        layoutParams14.i = getRootView().getId();
        getValueLayout().setLayoutParams(layoutParams14);
        ViewGroup.LayoutParams layoutParams15 = getNameLayout().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams15, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
        layoutParams16.t = getRootView().getId();
        layoutParams16.v = -1;
        getNameLayout().setLayoutParams(layoutParams16);
    }

    public static /* synthetic */ void setTypeClickListener$default(SportDetailItemView sportDetailItemView, rz5 rz5Var, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        sportDetailItemView.setTypeClickListener(rz5Var, num);
    }

    private final float textViewWidth(TextView textView, float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(textView.getText().toString());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00fc  */
    public final void bindData(@Nullable rz5 model, int itemGravity, boolean isUpdateStartOri, boolean isAuto) {
        if ((model == null || !model.b()) && model != null) {
            getMNameTV().setText(model.f33082b);
            if (model.a()) {
                getMValueTV().setTextDirection(3);
            } else if (model.c()) {
                getMValueTV().setTextSize(18.0f);
                Typeface font = this.mContext.getResources().getFont(ppi.f30618a);
                Intrinsics.checkNotNullExpressionValue(font, "getFont(...)");
                getMValueTV().setTypeface(font);
            }
            String str = model.d;
            String str2 = model.c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str + str2;
            if (isAuto) {
                getMValueTV().setAutoSizeTextTypeUniformWithConfiguration(6, (int) this.txtValueSize, 1, 0);
                getMValueTV().setMaxLines(1);
            }
            getMValueTV().setText(str3);
            SpannableString spannableString = new SpannableString(str3);
            String elementUnit = model.c;
            if (elementUnit != null) {
                Intrinsics.checkNotNullExpressionValue(elementUnit, "elementUnit");
                if (elementUnit.length() == 0) {
                    getUnitTv().setVisibility(4);
                } else {
                    getUnitTv().setVisibility(0);
                    spannableString.setSpan(new ForegroundColorSpan(getUnitTv().getCurrentTextColor()), model.d.length(), str3.length(), 33);
                    if (getUnitTv().getTextSize() + 10 < this.txtValueSize) {
                        spannableString.setSpan(new AbsoluteSizeSpan((int) getUnitTv().getTextSize(), false), model.d.length(), str3.length(), 33);
                    }
                }
            } else {
                getUnitTv().setVisibility(4);
            }
            getMValueTV().setText(spannableString);
        } else {
            getMNameTV().setVisibility(4);
            getMValueTV().setVisibility(4);
            getUnitTv().setVisibility(4);
        }
        if ((model == null || model.e != -1) && (model == null || model.f != -1)) {
            getLevelIcon().setVisibility(0);
            TextView levelIcon = getLevelIcon();
            Integer numValueOf = model != null ? Integer.valueOf(model.e) : null;
            Intrinsics.checkNotNull(numValueOf);
            levelIcon.setBackgroundResource(numValueOf.intValue());
            getLevelIcon().setContentDescription(model.g);
            TextView levelIcon2 = getLevelIcon();
            String str4 = model.g;
            Intrinsics.checkNotNull(str4);
            levelIcon2.setText(str4);
            getLevelIcon().setTextColor(ExtUtilsKt.getColor(model.f));
        } else {
            getLevelIcon().setVisibility(8);
        }
        setItemGravity(itemGravity, model, isUpdateStartOri);
    }

    @NotNull
    public final ImageView getImageClickGuide() {
        ImageView imageView = this.imageClickGuide;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageClickGuide");
        return null;
    }

    @NotNull
    public final LinearLayout getImageGuideLayout() {
        LinearLayout linearLayout = this.imageGuideLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageGuideLayout");
        return null;
    }

    public final int getItemGravity() {
        return this.itemGravity;
    }

    public final float getItemHeight() {
        return this.itemHeight;
    }

    @NotNull
    public final TextView getLevelIcon() {
        TextView textView = this.levelIcon;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("levelIcon");
        return null;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final TextView getMNameTV() {
        TextView textView = this.mNameTV;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNameTV");
        return null;
    }

    @NotNull
    public final TextView getMValueTV() {
        TextView textView = this.mValueTV;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mValueTV");
        return null;
    }

    @NotNull
    public final LinearLayout getNameLayout() {
        LinearLayout linearLayout = this.nameLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nameLayout");
        return null;
    }

    @Override // android.view.View
    @NotNull
    public final ConstraintLayout getRootView() {
        ConstraintLayout constraintLayout = this.rootView;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rootView");
        return null;
    }

    public final int getTxtNameColor() {
        return this.txtNameColor;
    }

    public final float getTxtNameSize() {
        return this.txtNameSize;
    }

    public final int getTxtUnitColor() {
        return this.txtUnitColor;
    }

    public final float getTxtUnitSize() {
        return this.txtUnitSize;
    }

    public final int getTxtValueColor() {
        return this.txtValueColor;
    }

    public final int getTxtValueFount() {
        return this.txtValueFount;
    }

    public final float getTxtValueSize() {
        return this.txtValueSize;
    }

    @NotNull
    public final TextView getUnitTv() {
        TextView textView = this.unitTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unitTv");
        return null;
    }

    @NotNull
    public final LinearLayout getValueLayout() {
        LinearLayout linearLayout = this.valueLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueLayout");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setMValueTV((TextView) findViewById(gsi.x0));
        setUnitTv((TextView) findViewById(gsi.v0));
        setMNameTV((TextView) findViewById(gsi.P));
        setImageClickGuide((ImageView) findViewById(gsi.l));
        setImageGuideLayout((LinearLayout) findViewById(gsi.m));
        setValueLayout((LinearLayout) findViewById(gsi.w0));
        setNameLayout((LinearLayout) findViewById(gsi.O));
        setLevelIcon((TextView) findViewById(gsi.p));
        setRootView((ConstraintLayout) findViewById(gsi.Y));
        getMValueTV().setTextColor(this.txtValueColor);
        getMNameTV().setTextColor(this.txtNameColor);
        getUnitTv().setTextColor(this.txtUnitColor);
        getMValueTV().setTextSize(0, this.txtValueSize);
        getMNameTV().setTextSize(0, this.txtNameSize);
        getMNameTV().setAutoSizeTextTypeUniformWithConfiguration(6, (int) this.txtNameSize, 1, 0);
        getMNameTV().setMaxLines(1);
        int i = this.txtValueFount;
        if (i > 0) {
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(this.mContext, i);
            getMValueTV().setTypeface(typefaceAsResourceId);
            getUnitTv().setTypeface(typefaceAsResourceId);
        }
        setGravity(null, false);
    }

    public final void setElementValueTxtColor(int colorRes) {
        getMValueTV().setTextColor(x44.a(colorRes));
    }

    public final void setImageClickGuide(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imageClickGuide = imageView;
    }

    public final void setImageGuideLayout(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.imageGuideLayout = linearLayout;
    }

    public final void setItemGravity(int i) {
        this.itemGravity = i;
    }

    public final void setItemHeight(float f) {
        this.itemHeight = f;
    }

    public final void setLevelIcon(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.levelIcon = textView;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMNameTV(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mNameTV = textView;
    }

    public final void setMValueTV(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mValueTV = textView;
    }

    public final void setNameLayout(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nameLayout = linearLayout;
    }

    public final void setRootView(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.rootView = constraintLayout;
    }

    public final void setTxtNameColor(int i) {
        this.txtNameColor = i;
    }

    public final void setTxtNameSize(float f) {
        this.txtNameSize = f;
    }

    public final void setTxtUnitColor(int i) {
        this.txtUnitColor = i;
    }

    public final void setTxtUnitSize(float f) {
        this.txtUnitSize = f;
    }

    public final void setTxtValueColor(int i) {
        this.txtValueColor = i;
    }

    public final void setTxtValueFount(int i) {
        this.txtValueFount = i;
    }

    public final void setTxtValueSize(float f) {
        this.txtValueSize = f;
    }

    public final void setTypeClickListener(@Nullable rz5 model, @Nullable Integer remindResource) {
        if (model == null) {
            ViewExtKt.gone(getImageClickGuide());
            ViewExtKt.gone(getImageGuideLayout());
            return;
        }
        if (remindResource != null) {
            getImageClickGuide().setImageResource(remindResource.intValue());
        }
        ViewExtKt.visible(getImageClickGuide());
        ViewExtKt.visible(getImageGuideLayout());
        getImageClickGuide().setOnClickListener(model.j);
        getImageClickGuide().setContentDescription(model.f33082b);
    }

    public final void setUnitTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.unitTv = textView;
    }

    public final void setValueLayout(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.valueLayout = linearLayout;
    }

    private final void setItemGravity(int itemGravity, rz5 model, boolean isUpdateStartOri) {
        this.itemGravity = itemGravity;
        setGravity(model, isUpdateStartOri);
        invalidate();
    }

    public static /* synthetic */ void bindData$default(SportDetailItemView sportDetailItemView, rz5 rz5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        sportDetailItemView.bindData(rz5Var, z);
    }

    public final void bindData(@Nullable rz5 model, boolean isAuto) {
        bindData$default(this, model, 0, false, isAuto, 4, null);
    }
}

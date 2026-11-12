package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.widget.SosSetView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.cji;
import defpackage.eui;
import defpackage.i4j;
import defpackage.jni;
import defpackage.wzi;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u001f\u001a\u00020\rJ\b\u0010 \u001a\u0004\u0018\u00010\rJ\b\u0010!\u001a\u0004\u0018\u00010\rJ\u0014\u0010\"\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/SosSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "remarkText", "", "numberText", "selectImage", "Landroid/widget/ImageView;", "titleTv", "Landroid/widget/TextView;", "subtitleTv", "remarkNumberTv", "gotoSetTv", "rightArrow", "miuiSosTv", "setChoose", "", "isChoose", "", "setRemarkAndNumber", "remark", RealNameWebViewActivity.NUMBER, "getRemarkAndNumber", "getRemark", "getNumber", "setOnSosSetViewClickListener", "callback", "Lkotlin/Function0;", "setFuncGroup", "isMiuiSos", "setInfoGroup", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosSetView extends ConstraintLayout {

    @NotNull
    private TextView gotoSetTv;

    @NotNull
    private TextView miuiSosTv;

    @Nullable
    private String numberText;

    @NotNull
    private TextView remarkNumberTv;

    @Nullable
    private String remarkText;

    @NotNull
    private ImageView rightArrow;

    @NotNull
    private ImageView selectImage;

    @NotNull
    private TextView subtitleTv;

    @NotNull
    private TextView titleTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SosSetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(eui.y1, (ViewGroup) this, true);
        this.selectImage = (ImageView) viewInflate.findViewById(zqi.A0);
        this.titleTv = (TextView) viewInflate.findViewById(zqi.U9);
        this.subtitleTv = (TextView) viewInflate.findViewById(zqi.X8);
        this.remarkNumberTv = (TextView) viewInflate.findViewById(zqi.m7);
        this.gotoSetTv = (TextView) viewInflate.findViewById(zqi.o3);
        this.rightArrow = (ImageView) viewInflate.findViewById(zqi.y7);
        this.miuiSosTv = (TextView) viewInflate.findViewById(zqi.k5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.w4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(i4j.x4, false);
        typedArrayObtainStyledAttributes.recycle();
        setChoose(false);
        setFuncGroup(z);
        setInfoGroup(z);
    }

    private final void setFuncGroup(boolean isMiuiSos) {
        if (isMiuiSos) {
            this.titleTv.setText(getContext().getResources().getString(wzi.U3));
            this.subtitleTv.setText(getContext().getResources().getString(wzi.O3));
        } else {
            this.titleTv.setText(getContext().getResources().getString(wzi.T3));
            this.subtitleTv.setText(getContext().getResources().getString(wzi.N3));
        }
    }

    private final void setInfoGroup(boolean isMiuiSos) {
        if (isMiuiSos) {
            ViewExtKt.gone(this.remarkNumberTv);
            ViewExtKt.gone(this.gotoSetTv);
            ViewExtKt.gone(this.rightArrow);
            ViewExtKt.visible(this.miuiSosTv);
            return;
        }
        ViewExtKt.visible(this.remarkNumberTv);
        this.remarkNumberTv.setText(ResourceExtKt.getString(wzi.Q3, ResourceExtKt.getString(wzi.w2), ResourceExtKt.getString(wzi.F2)));
        ViewExtKt.visible(this.gotoSetTv);
        ViewExtKt.visible(this.rightArrow);
        ViewExtKt.gone(this.miuiSosTv);
        setRemarkAndNumber(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnSosSetViewClickListener$lambda$0(Function0 callback, View view) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke();
    }

    @Nullable
    /* JADX INFO: renamed from: getNumber, reason: from getter */
    public final String getNumberText() {
        return this.numberText;
    }

    @Nullable
    /* JADX INFO: renamed from: getRemark, reason: from getter */
    public final String getRemarkText() {
        return this.remarkText;
    }

    @NotNull
    public final String getRemarkAndNumber() {
        return this.remarkNumberTv.getText().toString();
    }

    public final void setChoose(boolean isChoose) {
        if (isChoose) {
            ViewExtKt.visible(this.selectImage);
            setBackgroundResource(jni.T);
            this.titleTv.setTextColor(ViewExtKt.getColor(this, cji.d));
            this.subtitleTv.setTextColor(ViewExtKt.getColor(this, cji.d));
            return;
        }
        setBackgroundResource(jni.S);
        this.titleTv.setTextColor(ViewExtKt.getColor(this, cji.f5405k));
        this.subtitleTv.setTextColor(ViewExtKt.getColor(this, cji.l));
        ViewExtKt.gone(this.selectImage);
    }

    public final void setOnSosSetViewClickListener(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        setOnClickListener(new View.OnClickListener() { // from class: p4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosSetView.setOnSosSetViewClickListener$lambda$0(callback, view);
            }
        });
    }

    public final void setRemarkAndNumber(@Nullable String remark, @Nullable String number) {
        if (number == null) {
            String string = getContext().getResources().getString(wzi.Q3, ResourceExtKt.getString(wzi.w2), ResourceExtKt.getString(wzi.F2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.remarkNumberTv.setTextColor(ViewExtKt.getColor(this, cji.m));
            this.remarkNumberTv.setText(string);
            this.gotoSetTv.setText(ResourceExtKt.getString(wzi.R3));
            return;
        }
        this.remarkText = remark;
        this.numberText = number;
        String string2 = getContext().getResources().getString(wzi.Q3, remark, number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.remarkNumberTv.setTextColor(ViewExtKt.getColor(this, cji.f5405k));
        this.remarkNumberTv.setText(string2);
        this.gotoSetTv.setText(ResourceExtKt.getString(wzi.D3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SosSetView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SosSetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

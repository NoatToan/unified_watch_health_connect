package com.xiaomi.fitness.userinfo.medicalid.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.a5j;
import defpackage.hsi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.v2j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/baseui/DisplayItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemTitleTv", "Landroid/widget/TextView;", "getItemTitleTv", "()Landroid/widget/TextView;", "setItemTitleTv", "(Landroid/widget/TextView;)V", "itemDetailTv", "getItemDetailTv", "setItemDetailTv", "initView", "", "updateItemDetailFilled", "isNotFilled", "", "detail", "", "updateEmergencyContact", "isNotSet", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisplayItemView extends RelativeLayout {
    public TextView itemDetailTv;
    public TextView itemTitleTv;

    public DisplayItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(nvi.f28485r, this);
        initView(attributeSet);
    }

    private final void initView(AttributeSet attrs) {
        setItemTitleTv((TextView) findViewById(hsi.M));
        setItemDetailTv((TextView) findViewById(hsi.L));
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, a5j.X4);
        getItemTitleTv().setText(typedArrayObtainAttributes.getString(a5j.Y4));
        typedArrayObtainAttributes.recycle();
    }

    @NotNull
    public final TextView getItemDetailTv() {
        TextView textView = this.itemDetailTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemDetailTv");
        return null;
    }

    @NotNull
    public final TextView getItemTitleTv() {
        TextView textView = this.itemTitleTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemTitleTv");
        return null;
    }

    public final void setItemDetailTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.itemDetailTv = textView;
    }

    public final void setItemTitleTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.itemTitleTv = textView;
    }

    public final void updateEmergencyContact(boolean isNotSet, @Nullable String detail) {
        if (isNotSet) {
            getItemDetailTv().setTextAppearance(v2j.f36415b);
            getItemDetailTv().setText(ResourceExtKt.getString(o1j.G));
        } else {
            getItemDetailTv().setTextAppearance(v2j.f36414a);
            getItemDetailTv().setText(detail);
        }
    }

    public final void updateItemDetailFilled(boolean isNotFilled, @Nullable String detail) {
        if (isNotFilled) {
            getItemDetailTv().setTextAppearance(v2j.f36415b);
            getItemDetailTv().setText(ResourceExtKt.getString(o1j.v0));
        } else {
            getItemDetailTv().setTextAppearance(v2j.f36414a);
            getItemDetailTv().setText(detail);
        }
    }
}

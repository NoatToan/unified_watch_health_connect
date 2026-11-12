package com.xiaomi.fitness.access.health_connect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.aui;
import defpackage.vqi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectAuthedTypeItem;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getAttrs", "()Landroid/util/AttributeSet;", "typeImage", "Landroid/widget/ImageView;", "typeName", "Landroid/widget/TextView;", "initView", "", "updateItemInfo", "drawableRes", "", "name", "", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectAuthedTypeItem extends FrameLayout {

    @Nullable
    private final AttributeSet attrs;

    @NotNull
    private final Context ctx;

    @Nullable
    private ImageView typeImage;

    @Nullable
    private TextView typeName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectAuthedTypeItem(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.attrs = attributeSet;
        initView();
    }

    private final void initView() {
        LayoutInflater.from(this.ctx).inflate(aui.j, this);
        this.typeImage = (ImageView) findViewById(vqi.r0);
        this.typeName = (TextView) findViewById(vqi.s0);
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final void updateItemInfo(int drawableRes, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ImageView imageView = this.typeImage;
        if (imageView != null) {
            imageView.setImageResource(drawableRes);
        }
        TextView textView = this.typeName;
        if (textView != null) {
            textView.setText(name);
        }
    }
}

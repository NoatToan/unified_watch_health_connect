package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseNoticeCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconView", "Landroid/widget/ImageView;", "titleView", "Landroid/widget/TextView;", "subTitleView", "arrowTitleView", "arrowView", "setTitle", "", "title", "", "setSubTitle", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseNoticeCardView extends ConstraintLayout {

    @NotNull
    private TextView arrowTitleView;

    @NotNull
    private ImageView arrowView;

    @NotNull
    private ImageView iconView;

    @NotNull
    private TextView subTitleView;

    @NotNull
    private TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseNoticeCardView(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    public final void setSubTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.subTitleView.setText(title);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleView.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseNoticeCardView(@NotNull Context context, @NotNull AttributeSet attr, int i) {
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        LayoutInflater.from(context).inflate(jui.e3, (ViewGroup) this, true);
        setBackgroundResource(pni.A2);
        this.iconView = (ImageView) findViewById(eri.i7);
        this.titleView = (TextView) findViewById(eri.fj);
        this.subTitleView = (TextView) findViewById(eri.yh);
        this.arrowTitleView = (TextView) findViewById(eri.I);
        this.arrowView = (ImageView) findViewById(eri.be);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attr, n4j.S1);
        int resourceId = typedArrayObtainAttributes.getResourceId(n4j.Y1, 0);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(n4j.W1, 0);
        int resourceId3 = typedArrayObtainAttributes.getResourceId(n4j.T1, 0);
        boolean z = typedArrayObtainAttributes.getBoolean(n4j.U1, false);
        int resourceId4 = typedArrayObtainAttributes.getResourceId(n4j.V1, pni.G);
        int dimensionPixelSize = typedArrayObtainAttributes.getDimensionPixelSize(n4j.X1, 0);
        ExtUtilsKt.setVisible(this.arrowTitleView, z);
        if (resourceId4 == 0) {
            ExtUtilKt.gone(this.iconView);
        } else {
            ExtUtilKt.visible(this.iconView);
            this.iconView.setImageResource(resourceId4);
        }
        this.titleView.setText(context.getString(resourceId));
        this.subTitleView.setText(context.getString(resourceId2));
        this.arrowTitleView.setText(context.getString(resourceId3));
        this.subTitleView.setTextSize(0, dimensionPixelSize);
        typedArrayObtainAttributes.recycle();
    }

    public /* synthetic */ CurseNoticeCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

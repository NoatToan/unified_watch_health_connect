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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseMoreView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconView", "Landroid/widget/ImageView;", "titleView", "Landroid/widget/TextView;", "arrowView", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseMoreView extends ConstraintLayout {

    @NotNull
    private ImageView arrowView;

    @NotNull
    private ImageView iconView;

    @NotNull
    private TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseMoreView(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseMoreView(@NotNull Context context, @NotNull AttributeSet attr, int i) {
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        LayoutInflater.from(context).inflate(jui.i3, (ViewGroup) this, true);
        setBackgroundResource(pni.A2);
        this.iconView = (ImageView) findViewById(eri.i7);
        this.titleView = (TextView) findViewById(eri.fj);
        this.arrowView = (ImageView) findViewById(eri.be);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attr, n4j.Z1);
        ExtUtilsKt.setVisible(this.arrowView, typedArrayObtainAttributes.getBoolean(n4j.a2, false));
        int resourceId = typedArrayObtainAttributes.getResourceId(n4j.b2, 0);
        if (resourceId == 0) {
            ExtUtilKt.gone(this.iconView);
        } else {
            ExtUtilKt.visible(this.iconView);
            this.iconView.setImageResource(resourceId);
        }
        int resourceId2 = typedArrayObtainAttributes.getResourceId(n4j.c2, 0);
        if (resourceId2 > 0) {
            this.titleView.setText(resourceId2);
        }
        typedArrayObtainAttributes.recycle();
    }

    public /* synthetic */ CurseMoreView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

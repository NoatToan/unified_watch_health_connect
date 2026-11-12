package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/ChooseSportView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sportName", "Landroid/widget/TextView;", "getSportName", "()Landroid/widget/TextView;", "setSportName", "(Landroid/widget/TextView;)V", "imgStatus", "Landroid/widget/ImageView;", "getImgStatus", "()Landroid/widget/ImageView;", "setImgStatus", "(Landroid/widget/ImageView;)V", "setName", "", "name", "", "setOnSelect", "isSelected", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChooseSportView extends ConstraintLayout {

    @Nullable
    private ImageView imgStatus;

    @Nullable
    private TextView sportName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChooseSportView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final ImageView getImgStatus() {
        return this.imgStatus;
    }

    @Nullable
    public final TextView getSportName() {
        return this.sportName;
    }

    public final void setImgStatus(@Nullable ImageView imageView) {
        this.imgStatus = imageView;
    }

    public final void setName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TextView textView = this.sportName;
        if (textView != null) {
            textView.setText(name);
        }
    }

    public final void setOnSelect(boolean isSelected) {
        ImageView imageView = this.imgStatus;
        if (imageView != null) {
            imageView.setBackgroundResource(isSelected ? hoi.z1 : hoi.y1);
        }
    }

    public final void setSportName(@Nullable TextView textView) {
        this.sportName = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChooseSportView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChooseSportView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(ivi.y0, (ViewGroup) this, true);
        this.sportName = (TextView) viewInflate.findViewById(bsi.V6);
        this.imgStatus = (ImageView) viewInflate.findViewById(bsi.C2);
    }

    public /* synthetic */ ChooseSportView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

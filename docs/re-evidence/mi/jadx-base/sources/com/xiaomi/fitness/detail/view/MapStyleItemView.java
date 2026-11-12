package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bsi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013J\u001e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/detail/view/MapStyleItemView;", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "imageView", "Landroid/widget/ImageView;", "txtView", "Landroid/widget/TextView;", "selectStatue", "", "getSelectStatue", "()Z", "setSelectStatue", "(Z)V", "onFinishInflate", "", "resetSelectStatue", "select", "bindData", "imgResource", "mapStyleName", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapStyleItemView extends LinearLayout {
    private ImageView imageView;

    @NotNull
    private Context mContext;
    private boolean selectStatue;
    private TextView txtView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapStyleItemView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public final void bindData(int imgResource, @NotNull String mapStyleName, boolean select) {
        Intrinsics.checkNotNullParameter(mapStyleName, "mapStyleName");
        ImageView imageView = this.imageView;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageResource(imgResource);
        TextView textView2 = this.txtView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtView");
        } else {
            textView = textView2;
        }
        textView.setText(mapStyleName);
        resetSelectStatue(select);
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    public final boolean getSelectStatue() {
        return this.selectStatue;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.imageView = (ImageView) findViewById(bsi.q2);
        this.txtView = (TextView) findViewById(bsi.X8);
    }

    public final void resetSelectStatue(boolean select) {
        TextView textView = null;
        ImageView imageView = null;
        if (select) {
            TextView textView2 = this.txtView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtView");
                textView2 = null;
            }
            textView2.setTextColor(x44.a(dki.d1));
            ImageView imageView2 = this.imageView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            } else {
                imageView = imageView2;
            }
            imageView.setBackgroundResource(hoi.E1);
        } else {
            ImageView imageView3 = this.imageView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView3 = null;
            }
            imageView3.setBackground(null);
            TextView textView3 = this.txtView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtView");
            } else {
                textView = textView3;
            }
            textView.setTextColor(x44.a(dki.G0));
        }
        this.selectStatue = select;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setSelectStatue(boolean z) {
        this.selectStatue = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapStyleItemView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ MapStyleItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapStyleItemView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        LayoutInflater.from(getContext()).inflate(ivi.i2, this);
    }
}

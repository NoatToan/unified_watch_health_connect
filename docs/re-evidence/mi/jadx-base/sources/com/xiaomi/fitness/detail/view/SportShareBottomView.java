package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import defpackage.dbe;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareBottomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/Bitmap;", "qrBitmap", "", "setQrBitmap", "(Landroid/graphics/Bitmap;)V", "postSetQrBitmap", "Ldbe;", "binding", "Ldbe;", "Landroid/widget/ImageView;", "shareBottomQrcode", "Landroid/widget/ImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportShareBottomView extends ConstraintLayout {

    @NotNull
    private final dbe binding;

    @NotNull
    private ImageView shareBottomQrcode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareBottomView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postSetQrBitmap$lambda$0(SportShareBottomView this$0, Bitmap qrBitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(qrBitmap, "$qrBitmap");
        this$0.shareBottomQrcode.setImageBitmap(qrBitmap);
    }

    public final void postSetQrBitmap(@NotNull final Bitmap qrBitmap) {
        Intrinsics.checkNotNullParameter(qrBitmap, "qrBitmap");
        this.shareBottomQrcode.post(new Runnable() { // from class: m0o
            @Override // java.lang.Runnable
            public final void run() {
                SportShareBottomView.postSetQrBitmap$lambda$0(this.f25630a, qrBitmap);
            }
        });
    }

    public final void setQrBitmap(@NotNull Bitmap qrBitmap) {
        Intrinsics.checkNotNullParameter(qrBitmap, "qrBitmap");
        this.shareBottomQrcode.setImageBitmap(qrBitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportShareBottomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        dbe dbeVarA0 = dbe.A0(LayoutInflater.from(context), this, true);
        this.binding = dbeVarA0;
        this.shareBottomQrcode = dbeVarA0.A;
    }
}

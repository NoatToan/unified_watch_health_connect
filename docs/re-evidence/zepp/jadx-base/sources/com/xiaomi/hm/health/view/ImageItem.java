package com.xiaomi.hm.health.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.databinding.ImageItemViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/view/ImageItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "", "setImageBackgroundColor", "Landroid/graphics/drawable/Drawable;", "drawable", "tint", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V", "", "dotIsShow", "show", "setShowDot", "Lcom/xiaomi/hm/health/databinding/ImageItemViewBinding;", "a", "Lcom/xiaomi/hm/health/databinding/ImageItemViewBinding;", "getBinding", "()Lcom/xiaomi/hm/health/databinding/ImageItemViewBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ImageItem extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ImageItemViewBinding binding;

    @JvmOverloads
    public ImageItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ImageItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ImageItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void setImageDrawable$default(ImageItem imageItem, Drawable drawable, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        imageItem.setImageDrawable(drawable, num);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean dotIsShow() {
        return this.binding.imageItemDot.getVisibility() == 0;
    }

    @NotNull
    public final ImageItemViewBinding getBinding() {
        return this.binding;
    }

    public final void setImageBackgroundColor(@ColorInt int color) {
        this.binding.imageItemIv.setBackgroundColor(color);
    }

    public final void setImageDrawable(@NotNull Drawable drawable, @ColorInt @Nullable Integer tint) {
        ShapeableImageView shapeableImageView = this.binding.imageItemIv;
        if (tint != null) {
            drawable.setTint(tint.intValue());
        }
        Unit unit = Unit.INSTANCE;
        shapeableImageView.setImageDrawable(drawable);
    }

    public final void setShowDot(boolean show) {
        this.binding.imageItemDot.setVisibility(show ? 0 : 8);
    }

    @JvmOverloads
    public ImageItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ImageItemViewBinding imageItemViewBindingInflate = ImageItemViewBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = imageItemViewBindingInflate;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageItem);
        imageItemViewBindingInflate.imageItemName.setText(typedArrayObtainStyledAttributes.getString(3));
        imageItemViewBindingInflate.imageItemIv.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, ViewExtKt.loadColor(this, com.huami.watch.hmwatchmanager.R.color.s15)));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int color = typedArrayObtainStyledAttributes.getColor(2, ViewExtKt.loadColor(this, com.huami.watch.hmwatchmanager.R.color.s5));
        if (drawable != null) {
            drawable.setTint(color);
            imageItemViewBindingInflate.imageItemIv.setImageDrawable(drawable);
        }
        imageItemViewBindingInflate.imageItemDot.setVisibility(typedArrayObtainStyledAttributes.getBoolean(4, false) ? 0 : 8);
        typedArrayObtainStyledAttributes.recycle();
    }
}

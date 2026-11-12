package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0013\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\t\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/RTLTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "a", "Landroid/graphics/drawable/Drawable;", "left", "top", "right", "bottom", "setCompoundDrawables", "", "Z", "getEnableTRL", "()Z", "setEnableTRL", "(Z)V", "enableTRL", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class RTLTextView extends AppCompatTextView {

    @NotNull
    private static final String b = "RTLTextView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean enableTRL;

    public RTLTextView(@NotNull Context context) {
        super(context);
        a();
    }

    private final void a() {
        setCompoundDrawables(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], getCompoundDrawablesRelative()[2], getCompoundDrawablesRelative()[3]);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean getEnableTRL() {
        return this.enableTRL;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable left, @Nullable Drawable top, @Nullable Drawable right, @Nullable Drawable bottom) {
        Drawable drawable$default;
        Drawable drawable$default2;
        Drawable drawable$default3;
        boolean zIsRTL = RTLHelper.INSTANCE.isRTL(getContext());
        this.enableTRL = zIsRTL;
        if (!zIsRTL) {
            super.setCompoundDrawables(left, top, right, bottom);
            return;
        }
        Drawable drawable$default4 = null;
        if (right == null) {
            drawable$default = null;
        } else {
            Matrix matrix = new Matrix();
            matrix.postScale(-1.0f, 1.0f);
            Unit unit = Unit.INSTANCE;
            Bitmap bitmap = com.huami.femalehealth.uilib.helper.ExtKt.toBitmap(right, matrix);
            if (bitmap == null) {
                drawable$default = null;
            } else {
                drawable$default = com.huami.femalehealth.uilib.helper.ExtKt.toDrawable$default(bitmap, null, 1, null);
            }
        }
        if (top == null) {
            drawable$default2 = null;
        } else {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(-1.0f, 1.0f);
            Unit unit2 = Unit.INSTANCE;
            Bitmap bitmap2 = com.huami.femalehealth.uilib.helper.ExtKt.toBitmap(top, matrix2);
            if (bitmap2 == null) {
                drawable$default2 = null;
            } else {
                drawable$default2 = com.huami.femalehealth.uilib.helper.ExtKt.toDrawable$default(bitmap2, null, 1, null);
            }
        }
        if (left == null) {
            drawable$default3 = null;
        } else {
            Matrix matrix3 = new Matrix();
            matrix3.postScale(-1.0f, 1.0f);
            Unit unit3 = Unit.INSTANCE;
            Bitmap bitmap3 = com.huami.femalehealth.uilib.helper.ExtKt.toBitmap(left, matrix3);
            if (bitmap3 == null) {
                drawable$default3 = null;
            } else {
                drawable$default3 = com.huami.femalehealth.uilib.helper.ExtKt.toDrawable$default(bitmap3, null, 1, null);
            }
        }
        if (bottom != null) {
            Matrix matrix4 = new Matrix();
            matrix4.postScale(-1.0f, 1.0f);
            Unit unit4 = Unit.INSTANCE;
            Bitmap bitmap4 = com.huami.femalehealth.uilib.helper.ExtKt.toBitmap(bottom, matrix4);
            if (bitmap4 != null) {
                drawable$default4 = com.huami.femalehealth.uilib.helper.ExtKt.toDrawable$default(bitmap4, null, 1, null);
            }
        }
        super.setCompoundDrawables(drawable$default, drawable$default2, drawable$default3, drawable$default4);
    }

    public final void setEnableTRL(boolean z) {
        this.enableTRL = z;
    }

    public RTLTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public RTLTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

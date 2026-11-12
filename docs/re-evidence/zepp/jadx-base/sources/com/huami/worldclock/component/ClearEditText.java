package com.huami.worldclock.component;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.utils.DensityUtils;
import com.huami.worldclock.utils.RtlUtils;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\b\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J(\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016J(\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000eH\u0004J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002H\u0016R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006="}, d2 = {"Lcom/huami/worldclock/component/ClearEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "", "a", "Landroid/graphics/drawable/Drawable;", "drawable", "", "layerId", "tintColor", "b", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Landroid/view/View;", "v", "hasFocus", "onFocusChange", "", SOAP.XMLNS, "start", "count", b.d0, "onTextChanged", "beforeTextChanged", "Landroid/text/Editable;", "afterTextChanged", "visible", "setClearIconVisible", "l", "setOnFocusChangeListener", "watcher", "addTextChangedListener", "Landroid/graphics/drawable/Drawable;", "mClearDrawable", "mSearchDrawable", "c", "Z", GoogleApiAvailabilityLight.a, "Landroid/text/TextWatcher;", "getMTextWatcher", "()Landroid/text/TextWatcher;", "setMTextWatcher", "(Landroid/text/TextWatcher;)V", "mTextWatcher", "e", "Landroid/view/View$OnFocusChangeListener;", "getMOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "setMOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "mOnFocusChangeListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class ClearEditText extends AppCompatEditText implements TextWatcher, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Drawable mClearDrawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Drawable mSearchDrawable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasFocus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextWatcher mTextWatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private View.OnFocusChangeListener mOnFocusChangeListener;

    @JvmOverloads
    public ClearEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ClearEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ClearEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    private final void a() {
        this.hasFocus = hasFocus();
        this.mClearDrawable = getCompoundDrawables()[2];
        this.mSearchDrawable = getCompoundDrawables()[0];
        if (this.mClearDrawable == null) {
            this.mClearDrawable = getCompoundDrawablesRelative()[2];
            this.mSearchDrawable = getCompoundDrawablesRelative()[0];
        }
        Drawable drawable = this.mClearDrawable;
        if (drawable != null && (drawable instanceof LayerDrawable)) {
            DensityUtils densityUtils = DensityUtils.INSTANCE;
            int iDip2px = densityUtils.dip2px(getContext(), 10.0f);
            int iDip2px2 = densityUtils.dip2px(getContext(), 20.0f);
            Drawable drawable2 = this.mClearDrawable;
            Objects.requireNonNull(drawable2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) drawable2).getDrawable(0).setBounds(0, 0, iDip2px2, iDip2px2);
            Drawable drawable3 = this.mClearDrawable;
            Objects.requireNonNull(drawable3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            int i = iDip2px / 2;
            int i2 = iDip2px + i;
            ((LayerDrawable) drawable3).getDrawable(1).setBounds(i, i, i2, i2);
        }
        Drawable drawable4 = this.mSearchDrawable;
        if (drawable4 != null) {
            drawable4.setBounds(0, 0, this.mSearchDrawable.getIntrinsicWidth(), this.mSearchDrawable.getIntrinsicHeight());
        }
        Drawable drawable5 = this.mClearDrawable;
        if (drawable5 != null) {
            b(drawable5, com.huami.worldclock.R.id.world_clock_layer_svg_close, com.huami.worldclock.R.color.s5);
        }
        Drawable drawable6 = this.mSearchDrawable;
        if (drawable6 != null) {
            b(drawable6, com.huami.worldclock.R.id.world_clock_layer_svg_search, com.huami.worldclock.R.color.s3);
        }
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    private final void b(Drawable drawable, @IdRes int layerId, @ColorRes int tintColor) {
        if (drawable == null) {
            return;
        }
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable == null) {
            return;
        }
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(layerId);
        int color = ContextCompat.getColor(getContext(), tintColor);
        if (Build.VERSION.SDK_INT >= 21) {
            drawableFindDrawableByLayerId.setTint(color);
        } else {
            drawableFindDrawableByLayerId.mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(@NotNull TextWatcher watcher) {
        if (watcher instanceof ClearEditText) {
            super.addTextChangedListener(watcher);
        } else {
            this.mTextWatcher = watcher;
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable s) {
        TextWatcher textWatcher = this.mTextWatcher;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(s);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
        TextWatcher textWatcher = this.mTextWatcher;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(s, start, count, after);
        }
    }

    @Nullable
    public final View.OnFocusChangeListener getMOnFocusChangeListener() {
        return this.mOnFocusChangeListener;
    }

    @Nullable
    public final TextWatcher getMTextWatcher() {
        return this.mTextWatcher;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(@NotNull View v, boolean hasFocus) {
        this.hasFocus = hasFocus;
        setClearIconVisible(hasFocus && !TextUtils.isEmpty(getText()));
        View.OnFocusChangeListener onFocusChangeListener = this.mOnFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(v, hasFocus);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s, int start, int count, int after) {
        boolean z;
        if (this.hasFocus) {
            z = s.length() > 0;
        }
        setClearIconVisible(z);
        TextWatcher textWatcher = this.mTextWatcher;
        if (textWatcher != null) {
            textWatcher.onTextChanged(s, start, count, after);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        boolean z = true;
        if (event.getAction() == 1 && this.mClearDrawable != null) {
            if (RtlUtils.INSTANCE.isRTL()) {
                int totalPaddingLeft = getTotalPaddingLeft() + getCompoundDrawablePadding();
                if (event.getX() <= 0.0f || event.getX() >= totalPaddingLeft) {
                    z = false;
                }
            } else {
                if (event.getX() <= (getWidth() - getTotalPaddingRight()) - getCompoundDrawablePadding() || event.getX() >= getWidth()) {
                    z = false;
                }
            }
            if (z) {
                setText("");
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setClearIconVisible(boolean visible) {
        Drawable drawable = this.mClearDrawable;
        if (drawable == null) {
            return;
        }
        if (!visible) {
            drawable = null;
        }
        if (RtlUtils.INSTANCE.isRTL()) {
            setCompoundDrawables(drawable, getCompoundDrawables()[1], this.mSearchDrawable, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(this.mSearchDrawable, getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
        }
    }

    public final void setMOnFocusChangeListener(@Nullable View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnFocusChangeListener = onFocusChangeListener;
    }

    public final void setMTextWatcher(@Nullable TextWatcher textWatcher) {
        this.mTextWatcher = textWatcher;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(@NotNull View.OnFocusChangeListener l) {
        if (l instanceof ClearEditText) {
            super.setOnFocusChangeListener(l);
        } else {
            this.mOnFocusChangeListener = l;
        }
    }

    @JvmOverloads
    public ClearEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

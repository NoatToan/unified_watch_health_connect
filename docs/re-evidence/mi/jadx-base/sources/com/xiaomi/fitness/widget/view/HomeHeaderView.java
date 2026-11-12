package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.HomeHeaderView;
import defpackage.b5j;
import defpackage.bmi;
import defpackage.ksi;
import defpackage.qvi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u0007H\u0016J\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#J\u0012\u0010%\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\b\u0010(\u001a\u00020\u0011H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/widget/view/HomeHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvTitle", "Landroid/widget/TextView;", "mTvSubtitle", "mIvAdd", "Landroid/widget/ImageView;", "expandTouchWidth", "initView", "", "setValue", "typedArray", "Landroid/content/res/TypedArray;", "setBackgroundResource", "res", "getSubTitleTextView", "setDes", "des", "", "setTitle", "title", "setEnable", "enable", "", "drawable", "setMenuClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setSubtitleClickListener", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "setPadding", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeHeaderView extends LinearLayout {
    private final int expandTouchWidth;
    private ImageView mIvAdd;
    private TextView mTvSubtitle;
    private TextView mTvTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView() {
        this.mIvAdd = (ImageView) findViewById(ksi.o);
        this.mTvTitle = (TextView) findViewById(ksi.q);
        TextView textView = (TextView) findViewById(ksi.p);
        this.mTvSubtitle = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
            textView = null;
        }
        Object parent = textView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        final View view = (View) parent;
        view.post(new Runnable() { // from class: gac
            @Override // java.lang.Runnable
            public final void run() {
                HomeHeaderView.initView$lambda$0(this.f18778a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(HomeHeaderView this$0, View parent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parent, "$parent");
        Rect rect = new Rect();
        TextView textView = this$0.mTvSubtitle;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
            textView = null;
        }
        textView.getHitRect(rect);
        int i = rect.top;
        int i2 = this$0.expandTouchWidth;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        TextView textView3 = this$0.mTvSubtitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
        } else {
            textView2 = textView3;
        }
        parent.setTouchDelegate(new TouchDelegate(rect, textView2));
    }

    private final void setPadding() {
        int dimen = (int) ViewExtKt.getDimen(this, bmi.f);
        setPaddingRelative(dimen, getPaddingTop(), dimen, getPaddingBottom());
    }

    private final void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(b5j.E1);
        String string2 = typedArray.getString(b5j.C1);
        TextView textView = null;
        if (!typedArray.getBoolean(b5j.D1, true)) {
            ImageView imageView = this.mIvAdd;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvAdd");
                imageView = null;
            }
            imageView.setVisibility(8);
        }
        TextView textView2 = this.mTvTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTitle");
            textView2 = null;
        }
        textView2.setText(string);
        TextView textView3 = this.mTvSubtitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
        } else {
            textView = textView3;
        }
        textView.setText(string2);
    }

    @NotNull
    public final TextView getSubTitleTextView() {
        TextView textView = this.mTvSubtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
        return null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setPadding();
    }

    @Override // android.view.View
    public void setBackgroundResource(int res) {
    }

    public final void setDes(@NotNull String des) {
        Intrinsics.checkNotNullParameter(des, "des");
        TextView textView = this.mTvSubtitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
            textView = null;
        }
        textView.setText(des);
    }

    public final void setEnable(boolean enable, int drawable) {
    }

    public final void setMenuClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ImageView imageView = this.mIvAdd;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvAdd");
            imageView = null;
        }
        imageView.setOnClickListener(listener);
    }

    public final void setSubtitleClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        TextView textView = this.mTvSubtitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
            textView = null;
        }
        textView.setOnClickListener(listener);
    }

    public final void setTitle(@Nullable String title) {
        TextView textView = this.mTvTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTitle");
            textView = null;
        }
        textView.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HomeHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.expandTouchWidth = 50;
        LayoutInflater.from(context).inflate(qvi.f31887a, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.B1);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setPadding();
    }
}

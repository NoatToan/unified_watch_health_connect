package com.xiaomi.fitness.relative.home;

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
import com.xiaomi.fitness.relative.home.RelativeHomeHeaderView;
import defpackage.eri;
import defpackage.ili;
import defpackage.jui;
import defpackage.n4j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u0007H\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bJ,\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001fJ\u0010\u0010!\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0007J\u0016\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*J\u000e\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*J\u0012\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/relative/home/RelativeHomeHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTvTitle", "Landroid/widget/TextView;", "mTvSubtitle", "mIvAdd", "Landroid/widget/ImageView;", "mIvBack", "expandTouchWidth", "initView", "", "setValue", "typedArray", "Landroid/content/res/TypedArray;", "setBackgroundResource", "res", "getSubTitleTextView", "setDes", "des", "", "bindData", "title", "addClick", "Lkotlin/Function0;", "backClick", "setTitle", "setImage", "resourceId", "setEnable", "enable", "", "drawable", "setMenuClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setBackClickListener", "setSubtitleClickListener", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "setPadding", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeHomeHeaderView extends LinearLayout {
    private final int expandTouchWidth;
    private ImageView mIvAdd;
    private ImageView mIvBack;
    private TextView mTvSubtitle;
    private TextView mTvTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RelativeHomeHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$1(Function0 addClick, View view) {
        Intrinsics.checkNotNullParameter(addClick, "$addClick");
        addClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$2(Function0 backClick, View view) {
        Intrinsics.checkNotNullParameter(backClick, "$backClick");
        backClick.invoke();
    }

    private final void initView() {
        this.mIvAdd = (ImageView) findViewById(eri.A5);
        this.mTvTitle = (TextView) findViewById(eri.D5);
        this.mTvSubtitle = (TextView) findViewById(eri.C5);
        this.mIvBack = (ImageView) findViewById(eri.B5);
        TextView textView = this.mTvSubtitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSubtitle");
            textView = null;
        }
        Object parent = textView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        final View view = (View) parent;
        view.post(new Runnable() { // from class: fik
            @Override // java.lang.Runnable
            public final void run() {
                RelativeHomeHeaderView.initView$lambda$0(this.f17820a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(RelativeHomeHeaderView this$0, View parent) {
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
        int dimen = (int) ViewExtKt.getDimen(this, ili.j);
        setPaddingRelative(dimen, getPaddingTop(), dimen, getPaddingBottom());
    }

    private final void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(n4j.t2);
        String string2 = typedArray.getString(n4j.r2);
        TextView textView = null;
        if (!typedArray.getBoolean(n4j.s2, true)) {
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

    public final void bindData(@Nullable String title, @NotNull final Function0<Unit> addClick, @NotNull final Function0<Unit> backClick) {
        Intrinsics.checkNotNullParameter(addClick, "addClick");
        Intrinsics.checkNotNullParameter(backClick, "backClick");
        TextView textView = this.mTvTitle;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTitle");
            textView = null;
        }
        textView.setText(title);
        ImageView imageView2 = this.mIvAdd;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvAdd");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: gik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeHomeHeaderView.bindData$lambda$1(addClick, view);
            }
        });
        ImageView imageView3 = this.mIvBack;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvBack");
        } else {
            imageView = imageView3;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeHomeHeaderView.bindData$lambda$2(backClick, view);
            }
        });
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

    public final void setBackClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ImageView imageView = this.mIvBack;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvBack");
            imageView = null;
        }
        imageView.setOnClickListener(listener);
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

    public final void setImage(int resourceId) {
        ImageView imageView = this.mIvAdd;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvAdd");
            imageView = null;
        }
        imageView.setImageResource(resourceId);
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
    public RelativeHomeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RelativeHomeHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RelativeHomeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.expandTouchWidth = 50;
        LayoutInflater.from(context).inflate(jui.n8, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.q2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setPadding();
    }
}

package com.huami.watchfacesstore.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.CommonTitleBar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/huami/watchfacesstore/view/CommonTitleBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Landroid/view/View;", "", TransportUri.ACTION_BLOCK, "setOnRightClick", "", "title", "setTitleText", "", "titleId", "setRightText", "", "isVisible", "setLeftVisible", "a", "Lkotlin/jvm/functions/Function1;", "rightClick", "Landroid/widget/TextView;", "b", "Lkotlin/Lazy;", "getTvTitle", "()Landroid/widget/TextView;", "tvTitle", "c", "getTvRight", "tvRight", "Landroid/widget/ImageView;", GoogleApiAvailabilityLight.a, "getIvBack", "()Landroid/widget/ImageView;", "ivBack", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleArr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CommonTitleBar extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super View, Unit> rightClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvRight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivBack;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ImageView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) CommonTitleBar.this.findViewById(R.id.iv_back);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TextView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) CommonTitleBar.this.findViewById(R.id.tv_right);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<TextView> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) CommonTitleBar.this.findViewById(R.id.tv_title);
        }
    }

    @JvmOverloads
    public CommonTitleBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CommonTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommonTitleBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Context context, View view) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CommonTitleBar commonTitleBar, View view) {
        Function1<? super View, Unit> function1 = commonTitleBar.rightClick;
        if (function1 == null) {
            return;
        }
        function1.invoke(view);
    }

    private final ImageView getIvBack() {
        return (ImageView) this.ivBack.getValue();
    }

    private final TextView getTvRight() {
        return (TextView) this.tvRight.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.tvTitle.getValue();
    }

    public final void setLeftVisible(boolean isVisible) {
        getIvBack().setVisibility(isVisible ? 0 : 8);
    }

    public final void setOnRightClick(@Nullable Function1<? super View, Unit> block) {
        this.rightClick = block;
    }

    public final void setRightText(@NotNull CharSequence title) {
        getTvRight().setText(title);
    }

    public final void setTitleText(@NotNull CharSequence title) {
        getTvTitle().setText(title);
    }

    @JvmOverloads
    public CommonTitleBar(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tvTitle = LazyKt__LazyJVMKt.lazy(new c());
        this.tvRight = LazyKt__LazyJVMKt.lazy(new b());
        this.ivBack = LazyKt__LazyJVMKt.lazy(new a());
        LayoutInflater.from(context).inflate(R.layout.wf_title_bar, (ViewGroup) this, true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CommonTitleBar);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.CommonTitleBar_titleText);
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.CommonTitleBar_rightText);
            getTvTitle().setText(string == null ? "" : string);
            getTvRight().setText(string2 == null ? "" : string2);
            typedArrayObtainStyledAttributes.recycle();
        }
        getIvBack().setOnClickListener(new View.OnClickListener() { // from class: lx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonTitleBar.c(context, view);
            }
        });
        getTvRight().setOnClickListener(new View.OnClickListener() { // from class: mx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonTitleBar.d(this.a, view);
            }
        });
    }

    public final void setRightText(@StringRes int titleId) {
        getTvRight().setText(titleId);
    }

    public final void setTitleText(@StringRes int titleId) {
        getTvTitle().setText(titleId);
    }
}

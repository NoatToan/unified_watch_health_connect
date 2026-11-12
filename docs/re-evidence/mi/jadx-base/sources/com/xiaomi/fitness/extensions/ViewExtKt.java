package com.xiaomi.fitness.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import coil.Coil;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.jrk;
import defpackage.ksi;
import defpackage.pah;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0002\u001a\u0012\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001\u001a\u0012\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u001a\u0010\u0012\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u001a2\u0010\u0013\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u001a\f\u0010\u0018\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u000f\u001a\u0016\u0010/\u001a\u0004\u0018\u000100*\u00020\u00022\b\b\u0001\u00101\u001a\u00020\u000f\u001a\u0014\u00102\u001a\u00020\u000f*\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u000f\u001a\u001b\u0010?\u001a\u00020\u0001\"\b\b\u0000\u00107*\u00020\u0002*\u0002H7H\u0002¢\u0006\u0002\u0010\u0003\u001a5\u0010@\u001a\u00020A*\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\u0019\b\u0002\u0010E\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00050F¢\u0006\u0002\bHH\u0086\bø\u0001\u0000\u001a7\u0010I\u001a\u00020\u0005\"\b\b\u0000\u00107*\u00020\u0002*\u0002H72\b\b\u0002\u0010J\u001a\u0002052\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u0002H7\u0012\u0004\u0012\u00020\u00050F¢\u0006\u0002\u0010L\u001a\u0014\u0010M\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010N\u001a\u00020-\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0019\u001a\u00020\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001c\u001a\u00020\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0007*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020\u000f*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010%\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010'\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b'\u0010&\"\u0015\u0010(\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010&\"\u0015\u0010)\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010&\"\u0015\u0010*\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b*\u0010&\"\u0015\u0010+\u001a\u00020\u0001*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010&\"2\u00106\u001a\u000205\"\b\b\u0000\u00107*\u00020\u0002*\u0002H72\u0006\u00104\u001a\u0002058B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\"2\u0010<\u001a\u000205\"\b\b\u0000\u00107*\u00020\u0002*\u0002H72\u0006\u00104\u001a\u0002058B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b=\u00109\"\u0004\b>\u0010;\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006O"}, d2 = {"isGone", "", "Landroid/view/View;", "(Landroid/view/View;)Z", "toast", "", "toastMsg", "", "toastLong", "gone", "visible", "invisible", "setVisible", "setWidth", "width", "", "setHeight", "height", "setWidthAndHeight", "setNewPadding", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "measureView", "viewHeight", "getViewHeight", "(Landroid/view/View;)I", "viewWidth", "getViewWidth", "textString", "Landroid/widget/TextView;", "getTextString", "(Landroid/widget/TextView;)Ljava/lang/String;", "textLength", "getTextLength", "(Landroid/widget/TextView;)I", "isTextEmpty", "(Landroid/widget/TextView;)Z", "isTextNullOrEmpty", "isTextNotEmpty", "isTextBlank", "isTextNullOrBlank", "isTextNotBlank", "getDimen", "", "dimen", "getDrawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "getColor", "colorRes", "value", "", "triggerLastTime", "T", "getTriggerLastTime", "(Landroid/view/View;)J", "setTriggerLastTime", "(Landroid/view/View;J)V", "triggerDelay", "getTriggerDelay", "setTriggerDelay", "clickEnable", "loadWithLifecycle", "Lcoil/request/Disposable;", "Landroid/widget/ImageView;", "data", "", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "Lkotlin/ExtensionFunctionType;", "clickWithTrigger", "delay", "block", "(Landroid/view/View;JLkotlin/jvm/functions/Function1;)V", "preventParentHorizontalOverflow", "extra", "widget_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,359:1\n310#2:360\n326#2,4:361\n311#2:365\n310#2:366\n326#2,4:367\n311#2:371\n310#2:372\n326#2,4:373\n311#2:377\n81#2:379\n24#3:378\n*S KotlinDebug\n*F\n+ 1 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt\n*L\n84#1:360\n84#1:361,4\n84#1:365\n94#1:366\n94#1:367,4\n94#1:371\n105#1:372\n105#1:373,4\n105#1:377\n319#1:379\n281#1:378\n*E\n"})
public final class ViewExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.extensions.ViewExtKt$loadWithLifecycle$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/extensions/ViewExtKt$loadWithLifecycle$2", "Landroidx/lifecycle/DefaultLifecycleObserver;", LifecycleConstantKt.ON_DESTROY, "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2 implements DefaultLifecycleObserver {
        final /* synthetic */ Disposable $disposable;
        final /* synthetic */ Lifecycle $lifecycle;

        public AnonymousClass2(Disposable disposable, Lifecycle lifecycle) {
            this.$disposable = disposable;
            this.$lifecycle = lifecycle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            this.$disposable.dispose();
            this.$lifecycle.removeObserver(this);
        }
    }

    private static final <T extends View> boolean clickEnable(T t) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - getTriggerLastTime(t) >= getTriggerDelay(t) || getTriggerLastTime(t) > jCurrentTimeMillis;
        setTriggerLastTime(t, jCurrentTimeMillis);
        return z;
    }

    public static final <T extends View> void clickWithTrigger(@NotNull final T t, long j, @NotNull final Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        setTriggerDelay(t, j);
        t.setOnClickListener(new View.OnClickListener() { // from class: ktq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewExtKt.clickWithTrigger$lambda$3(t, block, view);
            }
        });
    }

    public static /* synthetic */ void clickWithTrigger$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        clickWithTrigger(view, j, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickWithTrigger$lambda$3(View this_clickWithTrigger, Function1 block, View view) {
        Intrinsics.checkNotNullParameter(this_clickWithTrigger, "$this_clickWithTrigger");
        Intrinsics.checkNotNullParameter(block, "$block");
        if (clickEnable(this_clickWithTrigger)) {
            block.invoke2(this_clickWithTrigger);
        }
    }

    public static final int getColor(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return jrk.d(view.getResources(), i, null);
    }

    public static final float getDimen(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getResources().getDimension(i);
    }

    @Nullable
    public static final Drawable getDrawable(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return jrk.f(view.getResources(), i, null);
    }

    public static final int getTextLength(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getText().length();
    }

    @NotNull
    public static final String getTextString(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getText().toString();
    }

    private static final <T extends View> long getTriggerDelay(T t) {
        if (t.getTag(ksi.H) == null) {
            return -1L;
        }
        Object tag = t.getTag(ksi.H);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) tag).longValue();
    }

    private static final <T extends View> long getTriggerLastTime(T t) {
        if (t.getTag(ksi.I) == null) {
            return 0L;
        }
        Object tag = t.getTag(ksi.I);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) tag).longValue();
    }

    public static final int getViewHeight(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        measureView(view);
        return view.getMeasuredHeight();
    }

    public static final int getViewWidth(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        measureView(view);
        return view.getMeasuredWidth();
    }

    public static final void gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final void invisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    public static final boolean isGone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isTextBlank(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return StringsKt__StringsKt.isBlank(text);
    }

    public static final boolean isTextEmpty(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text.length() == 0;
    }

    public static final boolean isTextNotBlank(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return !StringsKt__StringsKt.isBlank(text);
    }

    public static final boolean isTextNotEmpty(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return !isTextEmpty(textView);
    }

    public static final boolean isTextNullOrBlank(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        return text == null || StringsKt__StringsKt.isBlank(text);
    }

    public static final boolean isTextNullOrEmpty(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        return text == null || text.length() == 0;
    }

    @NotNull
    public static final Disposable loadWithLifecycle(@NotNull ImageView imageView, @Nullable Object obj, @NotNull Function1<? super ImageRequest.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(imageView);
        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(context).data(obj).target(imageView);
        builder.invoke2(builderTarget);
        ImageRequest imageRequestBuild = builderTarget.lifecycle(lifecycle).build();
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Disposable disposableEnqueue = Coil.imageLoader(context2).enqueue(imageRequestBuild);
        if (lifecycle != null) {
            lifecycle.addObserver(new AnonymousClass2(disposableEnqueue, lifecycle));
        }
        return disposableEnqueue;
    }

    public static /* synthetic */ Disposable loadWithLifecycle$default(ImageView imageView, Object obj, Function1 builder, int i, Object obj2) {
        if ((i & 2) != 0) {
            builder = new Function1<ImageRequest.Builder, Unit>() { // from class: com.xiaomi.fitness.extensions.ViewExtKt.loadWithLifecycle.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ImageRequest.Builder builder2) {
                    Intrinsics.checkNotNullParameter(builder2, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(ImageRequest.Builder builder2) {
                    invoke2(builder2);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(imageView);
        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(context).data(obj).target(imageView);
        builder.invoke2(builderTarget);
        ImageRequest imageRequestBuild = builderTarget.lifecycle(lifecycle).build();
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Disposable disposableEnqueue = Coil.imageLoader(context2).enqueue(imageRequestBuild);
        if (lifecycle != null) {
            lifecycle.addObserver(new AnonymousClass2(disposableEnqueue, lifecycle));
        }
        return disposableEnqueue;
    }

    private static final void measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static final void preventParentHorizontalOverflow(@NotNull final View view, final float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        pah.a(view, new Runnable() { // from class: com.xiaomi.fitness.extensions.ViewExtKt$preventParentHorizontalOverflow$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                Object parent = view2.getParent();
                View view3 = parent instanceof View ? (View) parent : null;
                if (view3 == null) {
                    return;
                }
                float width = view3.getWidth();
                float x = view2.getX();
                float f2 = x - f;
                float width2 = x + view2.getWidth();
                float f3 = f;
                float f4 = width2 + f3;
                float f5 = 0.0f;
                if (f2 < 0.0f && f4 > width) {
                    int iCoerceAtLeast = (int) RangesKt___RangesKt.coerceAtLeast(width - (2 * f3), 0.0f);
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    Logger.i("preventParentHorizontalOverflow", "start: " + f2 + ", end: " + f4 + ", pw: " + width + ", maxW: " + iCoerceAtLeast);
                    if (layoutParams.width > iCoerceAtLeast) {
                        layoutParams.width = iCoerceAtLeast;
                        view2.setLayoutParams(layoutParams);
                        Logger.i("preventParentHorizontalOverflow", "start: " + f2 + ", end: " + f4 + ", pw: " + width + ", maxW: " + iCoerceAtLeast);
                        return;
                    }
                }
                if (f2 < 0.0f) {
                    f5 = -f2;
                } else if (f4 > width) {
                    f5 = width - f4;
                }
                Logger.i("preventParentHorizontalOverflow", "start: " + f2 + ", end: " + f4 + ", pw: " + width + ", shift: " + f5);
                view2.setTranslationX(f5);
            }
        });
    }

    public static /* synthetic */ void preventParentHorizontalOverflow$default(View view, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        preventParentHorizontalOverflow(view, f);
    }

    public static final void setHeight(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void setNewPadding(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void setNewPadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        setNewPadding(view, i, i2, i3, i4);
    }

    private static final <T extends View> void setTriggerDelay(T t, long j) {
        t.setTag(ksi.H, Long.valueOf(j));
    }

    private static final <T extends View> void setTriggerLastTime(T t, long j) {
        t.setTag(ksi.I, Long.valueOf(j));
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            visible(view);
        } else {
            gone(view);
        }
    }

    public static final void setWidth(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void setWidthAndHeight(@NotNull View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void toast(@NotNull View view, @NotNull String toastMsg) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(toastMsg, "toastMsg");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ToastExtKt.toastShort(context, toastMsg);
    }

    public static final void toastLong(@NotNull View view, @NotNull String toastMsg) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(toastMsg, "toastMsg");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ToastExtKt.toastLong(context, toastMsg);
    }

    public static final void visible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}

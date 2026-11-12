package com.huami.bloodpressure_ui.ext;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.TextUtilsCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.Constant;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a\b\u0010\u0010\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0000H\u0000\u001a\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0000\u001a\u0017\u0010\u0016\u001a\u00020\u0003*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0000\"\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"(\u0010'\u001a\u00020!*\u00020\u00002\u0006\u0010\"\u001a\u00020!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroid/view/View;", "", "gone", "", "setGone", "inVisible", "setInvisible", "Lkotlin/Function1;", TransportUri.ACTION_BLOCK, "setOnDebounceClickListener", "isFastClick", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "isRTL", "", "getScreenWidth", "getScreenHeight", "Landroid/util/DisplayMetrics;", "getScreenMetrics", "awaitNextLayout", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "alpha", "addAlpha", "Landroid/widget/TextView;", "resId", "setStyle", "a", LogUtil.I, "FAST_CLICK_THRSHOLD", "", "value", "b", "(Landroid/view/View;)J", GoogleApiAvailabilityLight.a, "(Landroid/view/View;J)V", "triggerTime", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    private static final int a = 300;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ View a;
        public final /* synthetic */ ViewExKt$awaitNextLayout$2$listener$1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, ViewExKt$awaitNextLayout$2$listener$1 viewExKt$awaitNextLayout$2$listener$1) {
            super(1);
            this.a = view;
            this.b = viewExKt$awaitNextLayout$2$listener$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            this.a.removeOnLayoutChangeListener(this.b);
        }
    }

    public static final int addAlpha(int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLayoutChangeListener, com.huami.bloodpressure_ui.ext.ViewExKt$awaitNextLayout$2$listener$1] */
    @Nullable
    public static final Object awaitNextLayout(@NotNull View view, @NotNull Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ?? r1 = new View.OnLayoutChangeListener() { // from class: com.huami.bloodpressure_ui.ext.ViewExKt$awaitNextLayout$2$listener$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@Nullable View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                if (v != null) {
                    v.removeOnLayoutChangeListener(this);
                }
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(unit));
            }
        };
        cancellableContinuationImpl.invokeOnCancellation(new a(view, r1));
        view.addOnLayoutChangeListener(r1);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private static final long b(View view) {
        Object tag = view.getTag(R.id.bloodpressure_click_trigger);
        Long l = tag instanceof Long ? (Long) tag : null;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, View view, View view2) {
        if (isFastClick(view2)) {
            return;
        }
        function1.invoke(view);
    }

    private static final void d(View view, long j) {
        view.setTag(R.id.bloodpressure_click_trigger, Long.valueOf(j));
    }

    public static final float dp2px(@NotNull Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final int getScreenHeight(@NotNull View view) {
        return getScreenMetrics(view).heightPixels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final DisplayMetrics getScreenMetrics(@NotNull View view) {
        view.getContext();
        if (!(view instanceof Activity)) {
            return view.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) view).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int getScreenWidth(@NotNull View view) {
        return getScreenMetrics(view).widthPixels;
    }

    public static final boolean isFastClick(@NotNull View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - b(view) < 300) {
            return true;
        }
        d(view, jElapsedRealtime);
        return false;
    }

    public static final boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final void setGone(@NotNull View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setOnDebounceClickListener(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: db8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExKt.c(function1, view, view2);
            }
        });
    }

    public static final void setStyle(@NotNull TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }
}

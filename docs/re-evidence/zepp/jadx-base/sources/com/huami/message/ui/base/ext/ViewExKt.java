package com.huami.message.ui.base.ext;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import com.huami.message.ui.base.ext.ViewExKt;
import com.xiaomi.hm.health.Constant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\n\u0010\u000b\u001a\u00020\u0007*\u00020\u0000\u001a(\u0010\u0010\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u000e\u001a\u0012\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Landroid/view/View;", "", Constant.PAI_KEY_DAILY_PAI, "dpToPx", "", "sp", "spToPx", "", "visible", "", "setVisible", "isVisible", "", "delay", "Lkotlin/Function1;", "action", "smartClick", "size", "expendTouchArea", "message-mifit_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.message.ui.base.ext.ViewExKt$smartClick$1$1", f = "ViewEx.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function1<View, Unit> c;
        public final /* synthetic */ View d;
        public final /* synthetic */ long e;
        public final /* synthetic */ View f;

        /* JADX INFO: renamed from: com.huami.message.ui.base.ext.ViewExKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.message.ui.base.ext.ViewExKt$smartClick$1$1$1", f = "ViewEx.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0477a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ View c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0477a(long j, View view, Continuation<? super C0477a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0477a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0477a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    this.a = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.c.setClickable(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super View, Unit> function1, View view, long j, View view2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = view;
            this.e = j;
            this.f = view2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            this.c.invoke(this.d);
            e.f(coroutineScope, null, null, new C0477a(this.e, this.f, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view, int i, View view2) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int iDpToPx = dpToPx(view, i);
        rect.top -= iDpToPx;
        rect.bottom += iDpToPx;
        rect.left -= iDpToPx;
        rect.right += iDpToPx;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, long j, View view, View view2) {
        view2.setClickable(false);
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(function1, view2, j, view, null), 2, null);
    }

    public static final float dpToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    public static final void expendTouchArea(@NotNull final View view, final int i) {
        Object parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        final View view2 = (View) parent;
        view2.post(new Runnable() { // from class: fb8
            @Override // java.lang.Runnable
            public final void run() {
                ViewExKt.c(view, i, view2);
            }
        });
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void smartClick(@NotNull final View view, final long j, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: eb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExKt.d(function1, j, view, view2);
            }
        });
    }

    public static /* synthetic */ void smartClick$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        smartClick(view, j, function1);
    }

    public static final float spToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(2, f, view.getResources().getDisplayMetrics());
    }

    public static final int dpToPx(@NotNull View view, int i) {
        return (int) TypedValue.applyDimension(1, i, view.getResources().getDisplayMetrics());
    }
}

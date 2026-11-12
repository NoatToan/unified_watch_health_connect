package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Display;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.xiaomi.hm.health.Constant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a/\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\r\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\n\u0010\u0012\u001a\u00020\u0006*\u00020\u0011\u001a\n\u0010\u0013\u001a\u00020\u0006*\u00020\u0011\u001a(\u0010\u0016\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0014\u001a\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u0012\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0019\u001a\u001e\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001d\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001d\u0018\u0001*\u00020 H\u0086\b¢\u0006\u0004\b!\u0010\"\u001a*\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019\u001a\u0014\u0010)\u001a\u00020\u0019*\u00020'2\b\b\u0001\u0010(\u001a\u00020\u0019\u001a\u0016\u0010,\u001a\u0004\u0018\u00010+*\u00020\u00002\b\b\u0001\u0010*\u001a\u00020\u0019\u001a\u0012\u0010/\u001a\u00020\u0019*\u00020\u00192\u0006\u0010.\u001a\u00020-¨\u00060"}, d2 = {"Landroid/view/View;", "", Constant.PAI_KEY_DAILY_PAI, "dpToPx", "sp", "spToPx", "", "visible", "isGone", "", "setVisible", "", "delay", "(Landroid/view/View;ZZJ)Lkotlin/Unit;", "isVisible", "Landroid/graphics/Point;", "findScreenWH", "Landroid/view/ViewStub;", "isInflated", "isNotInflated", "Lkotlin/Function1;", "action", "smartClick", "Landroid/content/res/Resources;", "resources", "", "getStatusBarHeight", "size", "increaseClickRange", ExifInterface.GPS_DIRECTION_TRUE, "getDescParent", "(Landroid/view/View;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "getDescChild", "(Landroid/view/ViewGroup;)Ljava/lang/Object;", "left", "top", "right", "bottom", "Landroid/content/Context;", "colorInt", "getResColor", "drawableId", "Landroid/graphics/drawable/Drawable;", "getResDrawable", "", "alpha", "addAlpha", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class ExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.ExtKt$setVisible$1$1", f = "Ext.kt", i = {}, l = {60, 61}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ View c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: renamed from: com.huami.femalehealth.uilib.widget.ExtKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.ExtKt$setVisible$1$1$1", f = "Ext.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0419a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ View b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0419a(View view, boolean z, Continuation<? super C0419a> continuation) {
                super(2, continuation);
                this.b = view;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0419a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0419a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                View view = this.b;
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
                ExtKt.setVisible(view, ((Boolean) tag).booleanValue(), this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, View view, boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = j;
            this.c = view;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            long j = this.b;
            this.a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0419a c0419a = new C0419a(this.c, this.d, null);
            this.a = 2;
            if (BuildersKt.withContext(main, c0419a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.ExtKt$smartClick$1$1", f = "Ext.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function1<View, Unit> c;
        public final /* synthetic */ View d;
        public final /* synthetic */ long e;
        public final /* synthetic */ View f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.widget.ExtKt$smartClick$1$1$1", f = "Ext.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ View c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, View view, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        public b(Function1<? super View, Unit> function1, View view, long j, View view2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = view;
            this.e = j;
            this.f = view2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, this.e, this.f, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            e.f(coroutineScope, null, null, new a(this.e, this.f, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final int addAlpha(@ColorInt int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(View view, int i, int i2, int i3, int i4, ViewParent viewParent) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, long j, View view, View view2) {
        view2.setClickable(false);
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new b(function1, view2, j, view, null), 2, null);
    }

    public static final float dpToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    @NotNull
    public static final Point findScreenWH(@NotNull View view) {
        Object systemService = view.getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static final /* synthetic */ <T> T getDescChild(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            T t = (T) viewGroup.getChildAt(i);
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (t instanceof Object) {
                return t;
            }
            if (i2 >= childCount) {
                return null;
            }
            i = i2;
        }
    }

    public static final /* synthetic */ <T> T getDescParent(View view) {
        T t = (T) view.getParent();
        if (t == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    public static final int getResColor(@NotNull Context context, @ColorRes int i) {
        return ContextCompat.getColor(context, i);
    }

    @Nullable
    public static final Drawable getResDrawable(@NotNull View view, @DrawableRes int i) {
        return ContextCompat.getDrawable(view.getContext(), i);
    }

    public static final int getStatusBarHeight(@NotNull Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final void increaseClickRange(@NotNull View view, int i) {
        increaseClickRange(view, i, i, i, i);
    }

    public static final boolean isInflated(@NotNull ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean isNotInflated(@NotNull ViewStub viewStub) {
        return viewStub.getParent() != null;
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(@NotNull View view, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = z2 ? 8 : 4;
        }
        view.setVisibility(i);
    }

    public static /* synthetic */ void setVisible$default(View view, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        setVisible(view, z, z2);
    }

    public static final void smartClick(@NotNull final View view, final long j, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: px1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtKt.d(function1, j, view, view2);
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

    public static final void increaseClickRange(@NotNull final View view, final int i, final int i2, final int i3, final int i4) {
        final ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof View)) {
            view.post(new Runnable() { // from class: qx1
                @Override // java.lang.Runnable
                public final void run() {
                    ExtKt.c(view, i2, i4, i, i3, parent);
                }
            });
        }
    }

    @Nullable
    public static final Unit setVisible(@NotNull View view, boolean z, boolean z2, long j) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Object tag = view.getTag();
            if (!Intrinsics.areEqual(tag instanceof Boolean ? (Boolean) tag : null, Boolean.valueOf(z))) {
                view.setTag(Boolean.valueOf(z));
                e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(j, view, z2, null), 2, null);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return null;
        }
        thM3848exceptionOrNullimpl.printStackTrace();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit setVisible$default(View view, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return setVisible(view, z, z2, j);
    }
}

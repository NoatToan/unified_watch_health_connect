package com.huami.sleep.ext;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.Constant;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b\u001a(\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u000f\u001a1\u0010\u0018\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0012\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a\u001a\u001c\u0010\u001c\u001a\u00020\u0003*\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u0016¨\u0006\u001f"}, d2 = {"Landroid/view/View;", "", "visible", "", "setVisible", "inVisible", "setInVisible", "isVisible", "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "sp", "sp2px", "", "delay", "Lkotlin/Function1;", "action", "smartClick", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "title", "subTitle", "", "rightIconRes", "setUnifyTitleStyle", "(Lcom/huami/view/basetitle/BaseTitleActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "", "alpha", "addAlpha", "Landroid/graphics/drawable/GradientDrawable;", "color", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.ext.ViewExKt$smartClick$1$1", f = "ViewEx.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function1<View, Unit> c;
        public final /* synthetic */ View d;
        public final /* synthetic */ long e;
        public final /* synthetic */ View f;

        /* JADX INFO: renamed from: com.huami.sleep.ext.ViewExKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.ext.ViewExKt$smartClick$1$1$1", f = "ViewEx.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0581a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ View c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0581a(long j, View view, Continuation<? super C0581a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0581a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0581a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            e.f(coroutineScope, null, null, new C0581a(this.e, this.f, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final int addAlpha(@ColorInt int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, long j, View view, View view2) {
        view2.setClickable(false);
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(function1, view2, j, view, null), 2, null);
    }

    public static final float dp2px(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics());
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setInVisible(@NotNull View view, boolean z) {
        view.setVisibility(!z ? 0 : 4);
    }

    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2, @Nullable Integer num) {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, i), str, !RainbowUtils.isDarkMode(baseTitleActivity));
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i2));
        if (str2 != null) {
            baseTitleActivity.getSubTitleTextView().setVisibility(0);
            baseTitleActivity.getSubTitleTextView().setText(str2);
            baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        }
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20);
        DrawableCompat.setTint(drawable, ContextCompat.getColor(baseTitleActivity, i2));
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        if (num != null) {
            baseTitleActivity.setRightImageRes(num.intValue(), i2);
        }
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(i);
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        setUnifyTitleStyle(baseTitleActivity, str, str2, num);
    }

    @TargetApi(13)
    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void smartClick(@NotNull final View view, final long j, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: gb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExKt.b(function1, j, view, view2);
            }
        });
    }

    public static /* synthetic */ void smartClick$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        smartClick(view, j, function1);
    }

    public static final float sp2px(@NotNull View view, float f) {
        return TypedValue.applyDimension(2, f, view.getContext().getResources().getDisplayMetrics());
    }

    public static final void addAlpha(@NotNull GradientDrawable gradientDrawable, double d, @ColorInt int i) {
        gradientDrawable.setColor(addAlpha(i, d));
    }
}

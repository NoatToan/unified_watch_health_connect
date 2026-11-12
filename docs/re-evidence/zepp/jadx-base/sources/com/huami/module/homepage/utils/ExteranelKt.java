package com.huami.module.homepage.utils;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.module.homepage.utils.ExteranelKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001aL\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\u000f\u001a\u00020\u0007*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u0007*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0000\u001a0\u0010\u0016\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0000\"\u0016\u0010\u0017\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "parseJson", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "action", "onMainEach", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "Landroid/view/View;", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickWithPolicyListener", "fastClickListener", "Landroid/widget/TextView;", "messageText", "Landroid/graphics/drawable/Drawable;", "icon", "iconClick", "setTextWithEndIcon", "HOME_TAG", "Ljava/lang/String;", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class ExteranelKt {

    @NotNull
    public static final String HOME_TAG = "HomePage";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.utils.ExteranelKt$onMainEach$1", f = "Exteranel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Throwable th, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!(((Throwable) this.b) instanceof CancellationException));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.utils.ExteranelKt$onMainEach$2", f = "Exteranel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.module.homepage.utils.ExteranelKt$onMainEach$2$1", f = "Exteranel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> b;
            public final /* synthetic */ T c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, T t, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function2;
                this.c = t;
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
                    Function2<T, Continuation<? super Unit>, Object> function2 = this.b;
                    T t = this.c;
                    this.a = 1;
                    if (function2.invoke(t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.b;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.c, obj2, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ref.LongRef longRef, Function0 function0, View view) {
        if (System.currentTimeMillis() - longRef.element > 600) {
            function0.invoke();
        }
        longRef.element = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0, View view) {
        if (HomeUtils.checkPolicyState()) {
            return;
        }
        function0.invoke();
    }

    public static final void fastClickListener(@NotNull View view, @NotNull final Function0<Unit> function0) {
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = System.currentTimeMillis();
        view.setOnClickListener(new View.OnClickListener() { // from class: yx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExteranelKt.c(longRef, function0, view2);
            }
        });
    }

    @NotNull
    public static final <T> Flow<T> onMainEach(@NotNull Flow<? extends T> flow, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt.onEach(FlowKt.retry(flow, 10L, new a(null)), new b(function2, null));
    }

    public static final /* synthetic */ <T> T parseJson(String str) {
        Gson gson = new Gson();
        Intrinsics.needClassReification();
        return (T) gson.fromJson(str, new TypeToken<T>() { // from class: com.huami.module.homepage.utils.ExteranelKt.parseJson.1
        }.getType());
    }

    public static final void setOnClickWithPolicyListener(@NotNull View view, @NotNull final Function0<Unit> function0) {
        view.setOnClickListener(new View.OnClickListener() { // from class: xx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExteranelKt.d(function0, view2);
            }
        });
    }

    public static final void setTextWithEndIcon(@NotNull TextView textView, @NotNull String str, @Nullable Drawable drawable, @Nullable final Function0<Unit> function0) {
        if (drawable == null) {
            textView.setText(str);
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "  ");
        spannableStringBuilder.setSpan(new CenterVerticalImageSpan(drawable), spannableStringBuilder.length() + (-1), spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huami.module.homepage.utils.ExteranelKt$setTextWithEndIcon$clickSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                Function0<Unit> function1 = function0;
                if (function1 == null) {
                    return;
                }
                function1.invoke();
            }
        }, spannableStringBuilder.length() + (-1), spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public static /* synthetic */ void setTextWithEndIcon$default(TextView textView, String str, Drawable drawable, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        setTextWithEndIcon(textView, str, drawable, function0);
    }
}

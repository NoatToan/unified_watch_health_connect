package com.huami.sky.ui.ext;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.arch.core.Fail;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.lib.rainbow.ListTile;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.sky.ui.R;
import com.huami.sky.ui.utils.ExtFuncKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.Constant;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.math.c;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001ac\u0010\u000f\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\b*\u00020\u0007\"\b\b\u0001\u0010\t*\u00020\u0007\"\b\b\u0002\u0010\n*\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u0001*\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a^\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b\"\u0004\b\u0000\u0010\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001fø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a6\u0010+\u001a\u00020\u0001*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020'2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010)\u001a\n\u0010-\u001a\u00020\u0001*\u00020,\u001a\u0012\u0010/\u001a\u00020.*\u00020.2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u00102\u001a\u00020\u0001*\u00020\u00042\u0006\u00101\u001a\u000200H\u0000\u001aM\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000104\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u00103*\b\u0012\u0004\u0012\u00028\u0000042\u0006\u00105\u001a\u00020\u001d2!\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0004\u0012\u00028\u00010\u001f\u001a\u0012\u0010=\u001a\u00020;*\u00020;2\u0006\u0010<\u001a\u00020\u0003\"\u0017\u0010@\u001a\u00020\u0003*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010?\"\u0017\u0010@\u001a\u00020$*\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010A\"\u0017\u0010C\u001a\u00020\u0003*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010?\"\u0017\u0010C\u001a\u00020$*\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010A\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006D"}, d2 = {"Landroid/view/Window;", "", "setLayoutFullScreen", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "toColorInt", "", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", TransportUri.ACTION_BLOCK, "safeLet", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Landroid/widget/TextView;", "colorRes", "", "alpha", "setTextColorRes", "(Landroid/widget/TextView;ILjava/lang/Double;)V", "setBackgroundTint", "resId", "setStyle", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "startWithLoading", "(Landroidx/lifecycle/MutableLiveData;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/MutableLiveData;", "Landroid/view/View;", "", "fromAlpha", "toAlpha", "", "duration", "Lkotlin/Function0;", "onEnd", "setAlphaAnimation", "Lcom/huami/lib/rainbow/ListTile;", "setListTileColor", "Landroid/graphics/drawable/GradientDrawable;", "skyButtonBackGround", "Landroid/content/Intent;", "service", "startServiceCatch", "M", "Lkotlinx/coroutines/flow/StateFlow;", "coroutineScope", "Lkotlin/ParameterName;", "name", "value", "mapper", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/util/Date;", "day", "nextDay", "getSp", "(I)I", "sp", "(F)F", "getDp", Constant.PAI_KEY_DAILY_PAI, "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "启动service失败：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.ext.SkyExtKt$startWithLoading$1", f = "SkyExt.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ MutableLiveData<State<T>> c;
        public final /* synthetic */ Function1<Continuation<? super State<? extends T>>, Object> d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/arch/core/State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.ext.SkyExtKt$startWithLoading$1$1$1", f = "SkyExt.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        public static final class a<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super State<? extends T>>, Object> {
            public int a;
            public final /* synthetic */ Function1<Continuation<? super State<? extends T>>, Object> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super State<? extends T>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super State<? extends T>>, Object> function1 = this.b;
                    this.a = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.ext.SkyExtKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0555b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0555b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MutableLiveData<State<T>> mutableLiveData, Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = mutableLiveData;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c.setValue(new Loading());
                    MutableLiveData mutableLiveData2 = this.c;
                    Function1<Continuation<? super State<? extends T>>, Object> function1 = this.d;
                    Result.Companion companion = Result.Companion;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(function1, null);
                    this.b = mutableLiveData2;
                    this.a = 1;
                    Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    obj = objWithContext;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.setValue(obj);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            MutableLiveData<State<T>> mutableLiveData3 = this.c;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default("startWithLoading", null, null, new C0555b(thM3848exceptionOrNullimpl), 6, null);
                mutableLiveData3.setValue(new Fail(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.ext.SkyExtKt$map$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "M", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.ext.SkyExtKt$map$1", f = "SkyExt.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ StateFlow<T> b;
        public final /* synthetic */ MutableStateFlow<M> c;
        public final /* synthetic */ Function1<T, M> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(StateFlow<? extends T> stateFlow, MutableStateFlow<M> mutableStateFlow, Function1<? super T, ? extends M> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = stateFlow;
            this.c = mutableStateFlow;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlow = this.b;
                final MutableStateFlow<M> mutableStateFlow = this.c;
                final Function1<T, M> function1 = this.d;
                Object obj2 = new FlowCollector<T>() { // from class: com.huami.sky.ui.ext.SkyExtKt$map$1$invokeSuspend$$inlined$collect$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
                        Object objEmit = mutableStateFlow.emit(function1.invoke(t), continuation);
                        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (sharedFlow.collect(obj2, this) == coroutine_suspended) {
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

    public static final int getDp(int i) {
        return c.roundToInt(getDp(i));
    }

    public static final int getSp(int i) {
        return c.roundToInt(getSp(i));
    }

    @NotNull
    public static final <T, M> StateFlow<M> map(@NotNull StateFlow<? extends T> stateFlow, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super T, ? extends M> function1) {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(function1.invoke(stateFlow.getValue()));
        e.f(coroutineScope, null, null, new AnonymousClass1(stateFlow, MutableStateFlow, function1, null), 3, null);
        return MutableStateFlow;
    }

    @NotNull
    public static final Date nextDay(@NotNull Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        return calendar.getTime();
    }

    @Nullable
    public static final <T1, T2, R> R safeLet(@Nullable T1 t1, @Nullable T2 t2, @NotNull Function2<? super T1, ? super T2, ? extends R> function2) {
        if (t1 == null || t2 == null) {
            return null;
        }
        return function2.invoke(t1, t2);
    }

    public static final void setAlphaAnimation(@NotNull View view, float f, float f2, long j, @Nullable final Function0<Unit> function0) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.sky.ui.ext.SkyExtKt$setAlphaAnimation$alphaAnimation$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation) {
                Function0<Unit> function1 = function0;
                if (function1 == null) {
                    return;
                }
                function1.invoke();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation) {
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static /* synthetic */ void setAlphaAnimation$default(View view, float f, float f2, long j, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 2000;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            function0 = null;
        }
        setAlphaAnimation(view, f, f2, j2, function0);
    }

    public static final void setBackgroundTint(@NotNull TextView textView, @ColorRes int i, @Nullable Double d) {
        Unit unit;
        if (d == null) {
            unit = null;
        } else {
            d.doubleValue();
            textView.setBackgroundTintList(ColorStateList.valueOf(ExtFuncKt.addAlpha(toColorInt(i, textView.getContext()), d.doubleValue())));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            textView.setBackgroundTintList(ColorStateList.valueOf(toColorInt(i, textView.getContext())));
        }
    }

    public static /* synthetic */ void setBackgroundTint$default(TextView textView, int i, Double d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d = null;
        }
        setBackgroundTint(textView, i, d);
    }

    public static final void setLayoutFullScreen(@NotNull Window window) {
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
    }

    public static final void setListTileColor(@NotNull ListTile listTile) {
        int color = ContextCompat.getColor(listTile.getContext(), R.color.s46);
        listTile.setTitleColor(color);
        listTile.setSubtitleColor(ExtFuncKt.addAlpha(color, 0.6d));
        listTile.setTipsColor(color);
    }

    public static final void setStyle(@NotNull TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static final void setTextColorRes(@NotNull TextView textView, @ColorRes int i, @Nullable Double d) {
        Unit unit;
        if (d == null) {
            unit = null;
        } else {
            d.doubleValue();
            textView.setTextColor(ExtFuncKt.addAlpha(toColorInt(i, textView.getContext()), d.doubleValue()));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            textView.setTextColor(toColorInt(i, textView.getContext()));
        }
    }

    public static /* synthetic */ void setTextColorRes$default(TextView textView, int i, Double d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d = null;
        }
        setTextColorRes(textView, i, d);
    }

    @NotNull
    public static final GradientDrawable skyButtonBackGround(@NotNull GradientDrawable gradientDrawable, @NotNull Context context) {
        gradientDrawable.setColor(ExtFuncKt.addAlpha(ContextCompat.getColor(context, R.color.s46), 0.3d));
        gradientDrawable.setCornerRadius(getDp(6.0f));
        return gradientDrawable;
    }

    public static final void startServiceCatch(@NotNull Context context, @NotNull Intent intent) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(context.startService(intent));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("startServiceCatch", new a(thM3848exceptionOrNullimpl));
        }
    }

    @NotNull
    public static final <T> MutableLiveData<State<T>> startWithLoading(@NotNull MutableLiveData<State<T>> mutableLiveData, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1) {
        e.f(coroutineScope, Dispatchers.getMain(), null, new b(mutableLiveData, function1, null), 2, null);
        return mutableLiveData;
    }

    @ColorInt
    public static final int toColorInt(int i, @NotNull Context context) {
        return ContextCompat.getColor(context, i);
    }

    public static final float getDp(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getSp(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }
}

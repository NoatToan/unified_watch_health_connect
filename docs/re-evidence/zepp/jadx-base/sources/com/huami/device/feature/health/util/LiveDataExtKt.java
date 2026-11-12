package com.huami.device.feature.health.util;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.device.feature.health.util.LiveDataExtKt;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u001a<\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a`\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00100\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\u001a6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0013"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "func", "Landroidx/lifecycle/MutableLiveData;", SportAnalytics.ParamValue.MapButtonType.MAP, "mapSkipNulls", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "b", "Lkotlin/Pair;", "combineLatest", "C", "a", "c", "Lkotlin/Triple;", "mapFunction", "syncMap", "health-base_release"}, k = 2, mv = {1, 5, 1})
public final class LiveDataExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.util.LiveDataExtKt$syncMap$1$1", f = "LiveDataExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MediatorLiveData<B> b;
        public final /* synthetic */ Function1<A, B> c;
        public final /* synthetic */ A d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MediatorLiveData<B> mediatorLiveData, Function1<? super A, ? extends B> function1, A a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = mediatorLiveData;
            this.c = function1;
            this.d = a;
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v4 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            /*
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.a
                if (r0 != 0) goto L1a
                kotlin.ResultKt.throwOnFailure(r3)
                androidx.lifecycle.MediatorLiveData<B> r3 = r2.b
                kotlin.jvm.functions.Function1<A, B> r0 = r2.c
                A r1 = r2.d
                java.lang.Object r0 = r0.invoke(r1)
                r3.postValue(r0)
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L1a:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.device.feature.health.util.LiveDataExtKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <A, B> LiveData<Pair<A, B>> combineLatest(@NotNull LiveData<A> liveData, @NotNull LiveData<B> liveData2) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: ep4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.o(mediatorLiveData, objectRef, objectRef2, obj);
            }
        });
        mediatorLiveData.addSource(liveData2, new Observer() { // from class: fp4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.p(mediatorLiveData, objectRef2, objectRef, obj);
            }
        });
        return mediatorLiveData;
    }

    private static final <A, B, C> Triple<A, B, C> i(Triple<? extends A, ? extends B, ? extends C> triple, A a2) {
        return triple == null ? new Triple<>(a2, null, null) : Triple.copy$default(triple, a2, null, null, 6, null);
    }

    private static final <B, A, C> Triple<A, B, C> j(Triple<? extends A, ? extends B, ? extends C> triple, B b) {
        return triple == null ? new Triple<>(null, b, null) : Triple.copy$default(triple, null, b, null, 5, null);
    }

    private static final <C, A, B> Triple<A, B, C> k(Triple<? extends A, ? extends B, ? extends C> triple, C c) {
        return triple == null ? new Triple<>(null, null, c) : Triple.copy$default(triple, null, null, c, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(i((Triple) mediatorLiveData.getValue(), obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(j((Triple) mediatorLiveData.getValue(), obj));
    }

    @NotNull
    public static final <X, Y> MutableLiveData<Y> map(@NotNull LiveData<X> liveData, @NotNull final Function1<? super X, ? extends Y> function1) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: dp4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.q(mediatorLiveData, function1, obj);
            }
        });
        return mediatorLiveData;
    }

    @NotNull
    public static final <X, Y> MutableLiveData<Y> mapSkipNulls(@NotNull LiveData<X> liveData, @NotNull final Function1<? super X, ? extends Y> function1) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: cp4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.r(mediatorLiveData, function1, obj);
            }
        });
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(k((Triple) mediatorLiveData.getValue(), obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Object obj) {
        if (obj == 0 && mediatorLiveData.getValue() != 0) {
            mediatorLiveData.setValue(null);
        }
        objectRef.element = obj;
        if (obj == 0 || objectRef2.element == 0) {
            return;
        }
        mediatorLiveData.setValue(TuplesKt.to(obj, objectRef2.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Object obj) {
        if (obj == 0 && mediatorLiveData.getValue() != 0) {
            mediatorLiveData.setValue(null);
        }
        objectRef.element = obj;
        T t = objectRef2.element;
        if (t == 0 || obj == 0) {
            return;
        }
        mediatorLiveData.setValue(TuplesKt.to(t, objectRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(MediatorLiveData mediatorLiveData, Function1 function1, Object obj) {
        mediatorLiveData.setValue(function1.invoke(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(MediatorLiveData mediatorLiveData, Function1 function1, Object obj) {
        if (obj == null) {
            return;
        }
        mediatorLiveData.setValue(function1.invoke(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MediatorLiveData mediatorLiveData, Function1 function1, Object obj) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(mediatorLiveData, function1, obj, null), 2, null);
    }

    @NotNull
    public static final <A, B> LiveData<B> syncMap(@NotNull LiveData<A> liveData, @NotNull final Function1<? super A, ? extends B> function1) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: bp4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.s(mediatorLiveData, function1, obj);
            }
        });
        return mediatorLiveData;
    }

    @NotNull
    public static final <A, B, C> LiveData<Triple<A, B, C>> combineLatest(@NotNull LiveData<A> liveData, @NotNull LiveData<B> liveData2, @NotNull LiveData<C> liveData3) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: wo4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.l(mediatorLiveData, obj);
            }
        });
        mediatorLiveData.addSource(liveData2, new Observer() { // from class: ap4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.m(mediatorLiveData, obj);
            }
        });
        mediatorLiveData.addSource(liveData3, new Observer() { // from class: zo4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtKt.n(mediatorLiveData, obj);
            }
        });
        return mediatorLiveData;
    }
}

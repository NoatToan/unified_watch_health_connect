package com.huami.bloodoxygen.core.remote.upload;

import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bloodoxygen.core.remote.upload.Uploader$collectOriginOsaEvent$1", f = "Uploader.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
public final class Uploader$collectOriginOsaEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Uploader b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OriginOsaEventObserver isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OriginOsaEventObserver list is null or empty";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader$collectOriginOsaEvent$1(Uploader uploader, Continuation<? super Uploader$collectOriginOsaEvent$1> continuation) {
        super(2, continuation);
        this.b = uploader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Uploader$collectOriginOsaEvent$1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((Uploader$collectOriginOsaEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowF = this.b.f();
            final Uploader uploader = this.b;
            FlowCollector<List<? extends OriginOsaEvent>> flowCollector = new FlowCollector<List<? extends OriginOsaEvent>>() { // from class: com.huami.bloodoxygen.core.remote.upload.Uploader$collectOriginOsaEvent$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends OriginOsaEvent> list, @NotNull Continuation continuation) {
                    List<? extends OriginOsaEvent> list2 = list;
                    if (!((Boolean) uploader.isSyncDataEnable.invoke()).booleanValue()) {
                        uploader.h(Uploader$collectOriginOsaEvent$1.a.a);
                        return Unit.INSTANCE;
                    }
                    if (list2 == null || list2.isEmpty()) {
                        uploader.h(Uploader$collectOriginOsaEvent$1.b.a);
                        return Unit.INSTANCE;
                    }
                    uploader.l(list2);
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (flowF.collect(flowCollector, this) == coroutine_suspended) {
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

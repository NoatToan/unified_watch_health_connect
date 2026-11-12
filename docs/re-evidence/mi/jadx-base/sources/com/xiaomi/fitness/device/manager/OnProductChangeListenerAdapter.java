package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/OnProductChangeListenerAdapter;", "Lcom/xiaomi/fitness/device/manager/i$a;", "", "onRemoteChange", "()V", "", "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", "mListeners", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OnProductChangeListenerAdapter extends i.a {

    @NotNull
    private final List<OnProductChangeListener> mListeners;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnProductChangeListenerAdapter$onRemoteChange$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnProductChangeListenerAdapter$onRemoteChange$1", f = "OnProductChangeListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnProductChangeListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnProductChangeListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnProductChangeListenerAdapter$onRemoteChange$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1863#2,2:19\n*S KotlinDebug\n*F\n+ 1 OnProductChangeListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnProductChangeListenerAdapter$onRemoteChange$1\n*L\n13#1:19,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnProductChangeListenerAdapter.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = OnProductChangeListenerAdapter.this.mListeners.iterator();
            while (it.hasNext()) {
                ((OnProductChangeListener) it.next()).onChange();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnProductChangeListenerAdapter(@NotNull List<? extends OnProductChangeListener> mListeners) {
        Intrinsics.checkNotNullParameter(mListeners, "mListeners");
        this.mListeners = mListeners;
    }

    @Override // com.xiaomi.fitness.device.manager.i
    public void onRemoteChange() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }
}

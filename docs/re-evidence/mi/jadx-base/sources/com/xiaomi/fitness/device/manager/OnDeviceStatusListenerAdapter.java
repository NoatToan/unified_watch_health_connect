package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b!\u0010\"J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ#\u0010\u0017\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J#\u0010\u001a\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J+\u0010\u001b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter;", "Lcom/xiaomi/fitness/device/manager/h$a;", "", "did", "", "isReadded", "", "onInIt", "(Ljava/lang/String;Z)V", "isRebind", "onBind", "isRemoved", LifecycleConstantKt.ON_DESTROY, "onConnectStart", "(Ljava/lang/String;)V", "", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "model", "onSpecificDeviceConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "onSpecificDeviceConnectSuccess", "onSpecificDeviceDisconnect", "onSpecificDeviceConnectFailure", "(Ljava/lang/String;Ljava/lang/String;I)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OnDeviceStatusListenerAdapter extends h.a {

    @NotNull
    private final CopyOnWriteArrayList<OnDeviceStatusListener> mListeners;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onBind$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onBind$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onBind$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onBind$1\n*L\n25#1:123,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $isRebind;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$isRebind = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new AnonymousClass1(this.$did, this.$isRebind, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            boolean z = this.$isRebind;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnDeviceFullStatusListener) {
                    ((OnDeviceFullStatusListener) onDeviceStatusListener).onBind(str, z);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onConnectFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onConnectFailure$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onConnectFailure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onConnectFailure$1\n*L\n53#1:123,2\n*E\n"})
    public static final class C19011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ int $errorCode;
        final /* synthetic */ int $retryTimes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19011(String str, int i, int i2, Continuation<? super C19011> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$errorCode = i;
            this.$retryTimes = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19011(this.$did, this.$errorCode, this.$retryTimes, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            int i = this.$errorCode;
            int i2 = this.$retryTimes;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                onDeviceStatusListener.onConnectFailure(str, i, i2);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 > 1000) {
                    Logger.i("OnDeviceStatusListener", "onConnectFailure() called cost = " + jCurrentTimeMillis2 + ", " + onDeviceStatusListener);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onConnectStart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onConnectStart$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onConnectStart$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onConnectStart$1\n*L\n45#1:123,2\n*E\n"})
    public static final class C19021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19021(String str, Continuation<? super C19021> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19021(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnDeviceStatusListener) it.next()).onConnectStart(str);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onConnectSuccess$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onConnectSuccess$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onConnectSuccess$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onConnectSuccess$1\n*L\n69#1:123,2\n*E\n"})
    public static final class C19031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19031(String str, Continuation<? super C19031> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19031(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnDeviceStatusListener) it.next()).onConnectSuccess(str);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onDestroy$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onDestroy$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onDestroy$1\n*L\n35#1:123,2\n*E\n"})
    public static final class C19041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $isRemoved;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19041(String str, boolean z, Continuation<? super C19041> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$isRemoved = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19041(this.$did, this.$isRemoved, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            boolean z = this.$isRemoved;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnDeviceFullStatusListener) {
                    ((OnDeviceFullStatusListener) onDeviceStatusListener).onDestroy(str, z);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onDisconnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onDisconnect$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onDisconnect$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onDisconnect$1\n*L\n77#1:123,2\n*E\n"})
    public static final class C19051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19051(String str, Continuation<? super C19051> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19051(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnDeviceStatusListener) it.next()).onDisconnect(str);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onInIt$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onInIt$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onInIt$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onInIt$1\n*L\n15#1:123,2\n*E\n"})
    public static final class C19061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $isReadded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19061(String str, boolean z, Continuation<? super C19061> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$isReadded = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19061(this.$did, this.$isReadded, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            boolean z = this.$isReadded;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnDeviceFullStatusListener) {
                    ((OnDeviceFullStatusListener) onDeviceStatusListener).onInit(str, z);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceConnectFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceConnectFailure$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceConnectFailure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceConnectFailure$1\n*L\n115#1:123,2\n*E\n"})
    public static final class C19071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ int $errorCode;
        final /* synthetic */ String $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19071(String str, String str2, int i, Continuation<? super C19071> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
            this.$errorCode = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19071(this.$did, this.$model, this.$errorCode, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$model;
            int i = this.$errorCode;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnSpecificDeviceStatusListener) {
                    ((OnSpecificDeviceStatusListener) onDeviceStatusListener).onSpecificDeviceConnectFailure(str, str2, i);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceConnectStart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceConnectStart$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceConnectStart$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceConnectStart$1\n*L\n85#1:123,2\n*E\n"})
    public static final class C19081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19081(String str, String str2, Continuation<? super C19081> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19081(this.$did, this.$model, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$model;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnSpecificDeviceStatusListener) {
                    ((OnSpecificDeviceStatusListener) onDeviceStatusListener).onSpecificDeviceConnectStart(str, str2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceConnectSuccess$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceConnectSuccess$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceConnectSuccess$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceConnectSuccess$1\n*L\n95#1:123,2\n*E\n"})
    public static final class C19091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19091(String str, String str2, Continuation<? super C19091> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19091(this.$did, this.$model, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$model;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnSpecificDeviceStatusListener) {
                    ((OnSpecificDeviceStatusListener) onDeviceStatusListener).onSpecificDeviceConnectSuccess(str, str2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceDisconnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceStatusListenerAdapter$onSpecificDeviceDisconnect$1", f = "OnDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceDisconnect$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 OnDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceStatusListenerAdapter$onSpecificDeviceDisconnect$1\n*L\n105#1:123,2\n*E\n"})
    public static final class C19101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19101(String str, String str2, Continuation<? super C19101> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceStatusListenerAdapter.this.new C19101(this.$did, this.$model, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnDeviceStatusListener> copyOnWriteArrayList = OnDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$model;
            for (OnDeviceStatusListener onDeviceStatusListener : copyOnWriteArrayList) {
                if (onDeviceStatusListener instanceof OnSpecificDeviceStatusListener) {
                    ((OnSpecificDeviceStatusListener) onDeviceStatusListener).onSpecificDeviceDisconnect(str, str2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public OnDeviceStatusListenerAdapter(@NotNull CopyOnWriteArrayList<OnDeviceStatusListener> mListeners) {
        Intrinsics.checkNotNullParameter(mListeners, "mListeners");
        this.mListeners = mListeners;
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onBind(@Nullable String did, boolean isRebind) {
        AnyExtKt.main$default(null, new AnonymousClass1(did, isRebind, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        AnyExtKt.main$default(null, new C19011(did, errorCode, retryTimes, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onConnectStart(@Nullable String did) {
        AnyExtKt.main$default(null, new C19021(did, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onConnectSuccess(@Nullable String did) {
        AnyExtKt.main$default(null, new C19031(did, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onDestroy(@Nullable String did, boolean isRemoved) {
        AnyExtKt.main$default(null, new C19041(did, isRemoved, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onDisconnect(@Nullable String did) {
        AnyExtKt.main$default(null, new C19051(did, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onInIt(@Nullable String did, boolean isReadded) {
        AnyExtKt.main$default(null, new C19061(did, isReadded, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceConnectFailure(@Nullable String did, @Nullable String model, int errorCode) {
        AnyExtKt.main$default(null, new C19071(did, model, errorCode, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceConnectStart(@Nullable String did, @Nullable String model) {
        AnyExtKt.main$default(null, new C19081(did, model, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceConnectSuccess(@Nullable String did, @Nullable String model) {
        AnyExtKt.main$default(null, new C19091(did, model, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceDisconnect(@Nullable String did, @Nullable String model) {
        AnyExtKt.main$default(null, new C19101(did, model, null), 1, null);
    }
}

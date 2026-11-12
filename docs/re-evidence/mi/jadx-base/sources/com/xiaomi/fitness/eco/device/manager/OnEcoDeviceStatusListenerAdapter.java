package com.xiaomi.fitness.eco.device.manager;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import defpackage.g8h;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter;", "Lg8h$a;", "", "did", "", "isReadded", "", "onInIt", "(Ljava/lang/String;Z)V", "isRebind", "onBind", "isRemoved", LifecycleConstantKt.ON_DESTROY, "mac", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OnEcoDeviceStatusListenerAdapter extends g8h.a {

    @NotNull
    private final CopyOnWriteArrayList<OnEcoDeviceStatusListener> mListeners;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onBind$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onBind$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onBind$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onBind$1\n*L\n27#1:77,2\n*E\n"})
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
            return OnEcoDeviceStatusListenerAdapter.this.new AnonymousClass1(this.$did, this.$isRebind, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnEcoDeviceStatusListener> copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            boolean z = this.$isRebind;
            for (OnEcoDeviceStatusListener onEcoDeviceStatusListener : copyOnWriteArrayList) {
                if (onEcoDeviceStatusListener instanceof OnEcoDeviceFullStatusListener) {
                    ((OnEcoDeviceFullStatusListener) onEcoDeviceStatusListener).onBind(str, z);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onConnectFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onConnectFailure$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onConnectFailure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onConnectFailure$1\n*L\n55#1:77,2\n*E\n"})
    public static final class C22461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ int $errorCode;
        final /* synthetic */ String $mac;
        final /* synthetic */ int $retryTimes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22461(String str, String str2, int i, int i2, Continuation<? super C22461> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$mac = str2;
            this.$errorCode = i;
            this.$retryTimes = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceStatusListenerAdapter.this.new C22461(this.$did, this.$mac, this.$errorCode, this.$retryTimes, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$mac;
            int i = this.$errorCode;
            int i2 = this.$retryTimes;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnEcoDeviceStatusListener) it.next()).onConnectFailure(str, str2, i, i2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onConnectStart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onConnectStart$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onConnectStart$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onConnectStart$1\n*L\n47#1:77,2\n*E\n"})
    public static final class C22471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $mac;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22471(String str, String str2, Continuation<? super C22471> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$mac = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceStatusListenerAdapter.this.new C22471(this.$did, this.$mac, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$mac;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnEcoDeviceStatusListener) it.next()).onConnectStart(str, str2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onConnectSuccess$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onConnectSuccess$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onConnectSuccess$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onConnectSuccess$1\n*L\n63#1:77,2\n*E\n"})
    public static final class C22481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $mac;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22481(String str, String str2, Continuation<? super C22481> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$mac = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceStatusListenerAdapter.this.new C22481(this.$did, this.$mac, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$mac;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnEcoDeviceStatusListener) it.next()).onConnectSuccess(str, str2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onDestroy$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onDestroy$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onDestroy$1\n*L\n37#1:77,2\n*E\n"})
    public static final class C22491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $isRemoved;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22491(String str, boolean z, Continuation<? super C22491> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$isRemoved = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceStatusListenerAdapter.this.new C22491(this.$did, this.$isRemoved, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnEcoDeviceStatusListener> copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            boolean z = this.$isRemoved;
            for (OnEcoDeviceStatusListener onEcoDeviceStatusListener : copyOnWriteArrayList) {
                if (onEcoDeviceStatusListener instanceof OnEcoDeviceFullStatusListener) {
                    ((OnEcoDeviceFullStatusListener) onEcoDeviceStatusListener).onDestroy(str, z);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onDisconnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onDisconnect$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onDisconnect$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onDisconnect$1\n*L\n71#1:77,2\n*E\n"})
    public static final class C22501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $mac;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22501(String str, String str2, Continuation<? super C22501> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$mac = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceStatusListenerAdapter.this.new C22501(this.$did, this.$mac, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            String str2 = this.$mac;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnEcoDeviceStatusListener) it.next()).onDisconnect(str, str2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onInIt$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceStatusListenerAdapter$onInIt$1", f = "OnEcoDeviceStatusListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceStatusListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onInIt$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceStatusListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceStatusListenerAdapter$onInIt$1\n*L\n17#1:77,2\n*E\n"})
    public static final class C22511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $isReadded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22511(String str, boolean z, Continuation<? super C22511> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$isReadded = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceStatusListenerAdapter.this.new C22511(this.$did, this.$isReadded, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<OnEcoDeviceStatusListener> copyOnWriteArrayList = OnEcoDeviceStatusListenerAdapter.this.mListeners;
            String str = this.$did;
            boolean z = this.$isReadded;
            for (OnEcoDeviceStatusListener onEcoDeviceStatusListener : copyOnWriteArrayList) {
                if (onEcoDeviceStatusListener instanceof OnEcoDeviceFullStatusListener) {
                    ((OnEcoDeviceFullStatusListener) onEcoDeviceStatusListener).onInit(str, z);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public OnEcoDeviceStatusListenerAdapter(@NotNull CopyOnWriteArrayList<OnEcoDeviceStatusListener> mListeners) {
        Intrinsics.checkNotNullParameter(mListeners, "mListeners");
        this.mListeners = mListeners;
    }

    @Override // defpackage.g8h
    public void onBind(@Nullable String did, boolean isRebind) {
        AnyExtKt.main$default(null, new AnonymousClass1(did, isRebind, null), 1, null);
    }

    @Override // defpackage.g8h
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        AnyExtKt.main$default(null, new C22461(did, mac, errorCode, retryTimes, null), 1, null);
    }

    @Override // defpackage.g8h
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        AnyExtKt.main$default(null, new C22471(did, mac, null), 1, null);
    }

    @Override // defpackage.g8h
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        AnyExtKt.main$default(null, new C22481(did, mac, null), 1, null);
    }

    @Override // defpackage.g8h
    public void onDestroy(@Nullable String did, boolean isRemoved) {
        AnyExtKt.main$default(null, new C22491(did, isRemoved, null), 1, null);
    }

    @Override // defpackage.g8h
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        AnyExtKt.main$default(null, new C22501(did, mac, null), 1, null);
    }

    @Override // defpackage.g8h
    public void onInIt(@Nullable String did, boolean isReadded) {
        AnyExtKt.main$default(null, new C22511(did, isReadded, null), 1, null);
    }
}

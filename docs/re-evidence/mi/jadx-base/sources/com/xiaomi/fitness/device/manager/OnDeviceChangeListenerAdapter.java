package com.xiaomi.fitness.device.manager;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\f\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000e\u0010\rR7\u0010\u0010\u001a%\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/OnDeviceChangeListenerAdapter;", "Lcom/xiaomi/fitness/device/manager/g$a;", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "deviceModel", "", "onChange", "(Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ParameterName;", "name", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "add", "(Lkotlin/jvm/functions/Function1;)V", "remove", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mDeviceChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/device/manager/c;", "deviceManager", "Lcom/xiaomi/fitness/device/manager/c;", "getDeviceManager", "()Lcom/xiaomi/fitness/device/manager/c;", "setDeviceManager", "(Lcom/xiaomi/fitness/device/manager/c;)V", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OnDeviceChangeListenerAdapter extends g.a {

    @Nullable
    private c deviceManager;

    @NotNull
    private final CopyOnWriteArrayList<Function1<WearableDeviceModel, Unit>> mDeviceChangeListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceChangeListenerAdapter$add$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceChangeListenerAdapter$add$1", f = "OnDeviceChangeListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<WearableDeviceModel, Unit> $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super WearableDeviceModel, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$listener = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceChangeListenerAdapter.this.new AnonymousClass1(this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DeviceModelRemote currentDeviceModel;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c deviceManager = OnDeviceChangeListenerAdapter.this.getDeviceManager();
            DeviceModelClient deviceModelClient = null;
            String did = (deviceManager == null || (currentDeviceModel = deviceManager.getCurrentDeviceModel()) == null) ? null : currentDeviceModel.getDid();
            if (did != null && did.length() != 0) {
                c deviceManager2 = OnDeviceChangeListenerAdapter.this.getDeviceManager();
                Intrinsics.checkNotNull(deviceManager2);
                deviceModelClient = new DeviceModelClient(deviceManager2, did);
            }
            this.$listener.invoke2(deviceModelClient);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnDeviceChangeListenerAdapter$onChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnDeviceChangeListenerAdapter$onChange$1", f = "OnDeviceChangeListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnDeviceChangeListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceChangeListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceChangeListenerAdapter$onChange$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1863#2,2:59\n*S KotlinDebug\n*F\n+ 1 OnDeviceChangeListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnDeviceChangeListenerAdapter$onChange$1\n*L\n24#1:59,2\n*E\n"})
    public static final class C19001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19001(String str, Continuation<? super C19001> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnDeviceChangeListenerAdapter.this.new C19001(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<Function1> copyOnWriteArrayList = OnDeviceChangeListenerAdapter.this.mDeviceChangeListeners;
            OnDeviceChangeListenerAdapter onDeviceChangeListenerAdapter = OnDeviceChangeListenerAdapter.this;
            String str = this.$did;
            for (Function1 function1 : copyOnWriteArrayList) {
                DeviceModelClient deviceModelClient = null;
                if (onDeviceChangeListenerAdapter.getDeviceManager() == null) {
                    function1.invoke2(null);
                } else {
                    if (str != null && str.length() != 0) {
                        c deviceManager = onDeviceChangeListenerAdapter.getDeviceManager();
                        Intrinsics.checkNotNull(deviceManager);
                        deviceModelClient = new DeviceModelClient(deviceManager, str);
                    }
                    function1.invoke2(deviceModelClient);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    public final void add(@NotNull Function1<? super WearableDeviceModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        c cVar = this.deviceManager;
        if (cVar == null || cVar.getRequestStatus() != 2) {
            c cVar2 = this.deviceManager;
            if ((cVar2 != null ? cVar2.getCurrentDeviceModel() : null) != null) {
                AnyExtKt.main$default(null, new AnonymousClass1(listener, null), 1, null);
            }
        } else {
            AnyExtKt.main$default(null, new AnonymousClass1(listener, null), 1, null);
        }
        this.mDeviceChangeListeners.add(listener);
    }

    @Nullable
    public final c getDeviceManager() {
        return this.deviceManager;
    }

    @Override // com.xiaomi.fitness.device.manager.g
    public void onChange(@Nullable DeviceModelRemote deviceModel) {
        String did = deviceModel != null ? deviceModel.getDid() : null;
        Logger.i("DeviceManagerImpl", "onChange: " + this.deviceManager + ">>>" + did);
        AnyExtKt.main$default(null, new C19001(did, null), 1, null);
    }

    public final void remove(@NotNull Function1<? super WearableDeviceModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceChangeListeners.remove(listener);
    }

    public final void setDeviceManager(@Nullable c cVar) {
        this.deviceManager = cVar;
    }
}

package com.xiaomi.fitness.eco.device.manager;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B2\u0012)\u0010\f\u001a%\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\b0\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R7\u0010\f\u001a%\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/OnEcoDeviceChangeListenerAdapter;", "Lcom/xiaomi/fitness/eco/device/manager/d$a;", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "deviceModel", "", "onChange", "(Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Lkotlin/ParameterName;", "name", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/eco/device/manager/a;", "deviceManager", "Lcom/xiaomi/fitness/eco/device/manager/a;", "getDeviceManager", "()Lcom/xiaomi/fitness/eco/device/manager/a;", "setDeviceManager", "(Lcom/xiaomi/fitness/eco/device/manager/a;)V", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OnEcoDeviceChangeListenerAdapter extends d.a {

    @Nullable
    private a deviceManager;

    @NotNull
    private final CopyOnWriteArrayList<Function1<EcoDeviceModel, Unit>> mListeners;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OnEcoDeviceChangeListenerAdapter$onChange$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceChangeListenerAdapter$onChange$1", f = "OnEcoDeviceChangeListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnEcoDeviceChangeListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnEcoDeviceChangeListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceChangeListenerAdapter$onChange$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1863#2,2:38\n*S KotlinDebug\n*F\n+ 1 OnEcoDeviceChangeListenerAdapter.kt\ncom/xiaomi/fitness/eco/device/manager/OnEcoDeviceChangeListenerAdapter$onChange$1\n*L\n23#1:38,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnEcoDeviceChangeListenerAdapter.this.new AnonymousClass1(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList<Function1> copyOnWriteArrayList = OnEcoDeviceChangeListenerAdapter.this.mListeners;
            OnEcoDeviceChangeListenerAdapter onEcoDeviceChangeListenerAdapter = OnEcoDeviceChangeListenerAdapter.this;
            String str = this.$did;
            for (Function1 function1 : copyOnWriteArrayList) {
                EcoDeviceModelClient ecoDeviceModelClient = null;
                if (onEcoDeviceChangeListenerAdapter.getDeviceManager() == null) {
                    function1.invoke2(null);
                } else {
                    if (str != null && str.length() != 0) {
                        a deviceManager = onEcoDeviceChangeListenerAdapter.getDeviceManager();
                        Intrinsics.checkNotNull(deviceManager);
                        ecoDeviceModelClient = new EcoDeviceModelClient(deviceManager, str);
                    }
                    function1.invoke2(ecoDeviceModelClient);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public OnEcoDeviceChangeListenerAdapter(@NotNull CopyOnWriteArrayList<Function1<EcoDeviceModel, Unit>> mListeners) {
        Intrinsics.checkNotNullParameter(mListeners, "mListeners");
        this.mListeners = mListeners;
    }

    @Nullable
    public final a getDeviceManager() {
        return this.deviceManager;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.d
    public void onChange(@Nullable EcoDeviceModelRemote deviceModel) {
        String did = deviceModel != null ? deviceModel.getDid() : null;
        Logger.i("DeviceManagerImpl", "onChange: " + this.deviceManager + ">>>" + did);
        AnyExtKt.main$default(null, new AnonymousClass1(did, null), 1, null);
    }

    public final void setDeviceManager(@Nullable a aVar) {
        this.deviceManager = aVar;
    }
}

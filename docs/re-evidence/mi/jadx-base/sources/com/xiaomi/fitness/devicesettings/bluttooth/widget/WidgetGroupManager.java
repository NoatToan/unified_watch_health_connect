package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.eu6;
import defpackage.j5h;
import defpackage.jyo;
import defpackage.kyo;
import defpackage.lyo;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.rxo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.v4h;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00052\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00100\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u001b\u0010\u0015\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002¢\u0006\u0004\b\u0015\u0010\u0007J'\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00142\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002¢\u0006\u0004\b\u001a\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManager;", "", "Leu6;", "Ljyo$b;", "callback", "", "loadWidgetGroupList", "(Leu6;)V", "list", "", "setWidgetGroupListToDevice", "(Ljyo$b;Leu6;)V", "Lo4h;", "Lkyo$a;", "getWidgetV2SupportedList", "()Lo4h;", "", "Lrxo;", "callBack", "loadSportListFromDevice", "Llyo;", "loadWidgetV3", "widgetV3", "setWidgetV3", "(Llyo;Leu6;)V", "Llyo$c;", "getWidgetV3SupportedList", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetGroupManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
public final class WidgetGroupManager {

    @NotNull
    public static final String TAG = "WidgetGroupManager";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager$setWidgetGroupListToDevice$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager$setWidgetGroupListToDevice$2", f = "WidgetGroupManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ eu6<Boolean> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(eu6<Boolean> eu6Var, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = eu6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            eu6<Boolean> eu6Var = this.$callback;
            if (eu6Var != null) {
                eu6Var.onResult(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getWidgetV2SupportedList$lambda$5(final v4h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 53;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager$getWidgetV2SupportedList$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WidgetGroupManager.TAG, "Load WidgetV2.List: error, " + code);
                it.onComplete();
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0036  */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                kyo.a aVar;
                s7r packet;
                txo txoVarE;
                if (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) {
                    aVar = new kyo.a();
                } else {
                    Logger.i(WidgetGroupManager.TAG, "Load WidgetV2.List: success, " + txoVarE);
                    aVar = txoVarE.S() ? txoVarE.N() : new kyo.a();
                    if (aVar == null) {
                        aVar = new kyo.a();
                    }
                }
                it.onNext(aVar);
                it.onComplete();
            }
        }, 0, 8, null);
    }

    @Nullable
    public final o4h<kyo.a> getWidgetV2SupportedList() {
        return o4h.f(new j5h() { // from class: iir
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                WidgetGroupManager.getWidgetV2SupportedList$lambda$5(v4hVar);
            }
        }).S(ofl.c());
    }

    public final void getWidgetV3SupportedList(@NotNull final eu6<lyo.c> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 85;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager.getWidgetV3SupportedList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                lyo.c cVar;
                s7r packet;
                txo txoVarE;
                Logger.i(WidgetGroupManager.TAG, "getWidgetV3SupportedList onSuccess");
                if (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (cVar = txoVarE.P()) == null) {
                    Logger.i(WidgetGroupManager.TAG, "loadWidgetGroupListFromDevice list is null");
                    cVar = new lyo.c();
                }
                Logger.i(WidgetGroupManager.TAG, "getWidgetV3SupportedList获取支持小部件" + cVar);
                callback.onResult(cVar);
            }
        }, 0, 8, null);
    }

    public final void loadSportListFromDevice(@NotNull final eu6<List<rxo>> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 39;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager.loadSportListFromDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callBack.onError(code);
                Logger.d(WidgetGroupManager.TAG, "getSportOptionList error " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                rxo.a aVarG;
                if (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (aVarG = txoVarE.G()) == null) {
                    onError(did, type, -1);
                    return;
                }
                eu6<List<rxo>> eu6Var = callBack;
                Logger.d("WidgetGroupManagergetSportOptionList success", new Object[0]);
                rxo[] list = aVarG.c;
                Intrinsics.checkNotNullExpressionValue(list, "list");
                eu6Var.onResult(ArraysKt___ArraysKt.toList(list));
            }
        }, 0, 8, null);
    }

    public final void loadWidgetGroupList(@NotNull final eu6<jyo.b> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 51;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager.loadWidgetGroupList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WidgetGroupManager.TAG, "loadWidgetGroupListFromDevice error " + code);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                jyo.b bVar;
                s7r packet;
                txo txoVarE;
                Logger.i(WidgetGroupManager.TAG, "loadWidgetGroupListFromDevice onSuccess");
                if (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (bVar = txoVarE.L()) == null) {
                    Logger.i(WidgetGroupManager.TAG, "loadWidgetGroupListFromDevice list is null");
                    bVar = new jyo.b();
                }
                Logger.i(WidgetGroupManager.TAG, "loadWidgetGroupListFromDevice " + bVar);
                callback.onResult(bVar);
            }
        }, 0, 8, null);
    }

    public final void loadWidgetV3(@NotNull final eu6<lyo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 83;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager.loadWidgetV3.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WidgetGroupManager.TAG, "loadWidgetV3 error " + code);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                lyo lyoVar;
                s7r packet;
                txo txoVarE;
                Logger.i(WidgetGroupManager.TAG, "loadWidgetV3 onSuccess");
                if (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (lyoVar = txoVarE.O()) == null) {
                    Logger.i(WidgetGroupManager.TAG, "loadWidgetV3 is null");
                    lyoVar = new lyo();
                }
                Logger.i(WidgetGroupManager.TAG, "loadWidgetV3 " + lyoVar);
                callback.onResult(lyoVar);
            }
        }, 0, 8, null);
    }

    public final void setWidgetGroupListToDevice(@Nullable jyo.b list, @Nullable eu6<Boolean> callback) {
        Logger.i(TAG, "setWidgetGroupListToDevice: list = " + list);
        if (list == null) {
            ScopeExtKt.scope$default(null, new AnonymousClass2(callback, null), 1, null);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 52;
        txo txoVar = new txo();
        txoVar.u0(list);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new WidgetGroupManager$setWidgetGroupListToDevice$1$1(callback), 0, 8, null);
    }

    public final void setWidgetV3(@NotNull lyo widgetV3, @Nullable final eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(widgetV3, "widgetV3");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 84;
        txo txoVar = new txo();
        txoVar.w0(widgetV3);
        s7rVar.c0(txoVar);
        Logger.i(TAG, "setWidgetV3 设置小部件，传递参数为：" + widgetV3);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager.setWidgetV3.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WidgetGroupManager.TAG, "setWidgetV3 error " + code);
                eu6<Boolean> eu6Var = callback;
                if (eu6Var != null) {
                    eu6Var.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(WidgetGroupManager.TAG, "setWidgetV3 onSuccess");
                eu6<Boolean> eu6Var = callback;
                if (eu6Var != null) {
                    eu6Var.onResult(Boolean.TRUE);
                }
            }
        }, 0, 8, null);
    }
}

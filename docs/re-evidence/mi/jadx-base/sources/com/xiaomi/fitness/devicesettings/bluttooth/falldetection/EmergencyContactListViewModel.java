package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.fg4;
import defpackage.s7r;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\t2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "sosContactSwitchOn", "fallDetectionSwitchOn", "callMedicalSwitchOn", "", "Leg4;", "list", "", "syncSosContactInfo", "(ZZZLjava/util/List;)V", "Lkotlin/Function1;", "", "callback", "supportSyncMIUISosContacts", "(Lkotlin/jvm/functions/Function1;)V", "", "name", RealNameWebViewActivity.NUMBER, "insertMIUISosContacts", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMIUISosContacts", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "setResult$delegate", "Lkotlin/Lazy;", "getSetResult", "()Landroidx/lifecycle/MutableLiveData;", "setResult", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEmergencyContactListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,95:1\n37#2:96\n36#2,3:97\n*S KotlinDebug\n*F\n+ 1 EmergencyContactListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListViewModel\n*L\n40#1:96\n40#1:97,3\n*E\n"})
public final class EmergencyContactListViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "EmergencyContactListViewModel";

    /* JADX INFO: renamed from: setResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d88
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmergencyContactListViewModel.setResult_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel$deleteMIUISosContacts$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel$deleteMIUISosContacts$2", f = "EmergencyContactListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $number;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$number = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$number, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(MIUISosManager.INSTANCE.deleteMIUISosContacts(this.$number) >= 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel$insertMIUISosContacts$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel$insertMIUISosContacts$2", f = "EmergencyContactListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ String $number;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20632(String str, String str2, Continuation<? super C20632> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$number = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20632(this.$name, this.$number, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(MIUISosManager.INSTANCE.insertMIUISosContacts(this.$name, this.$number) != null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C20632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setResult_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @Nullable
    public final Object deleteMIUISosContacts(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetResult() {
        return (MutableLiveData) this.setResult.getValue();
    }

    @Nullable
    public final Object insertMIUISosContacts(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C20632(str, str2, null), continuation);
    }

    public final void supportSyncMIUISosContacts(@NotNull Function1<? super List<eg4>, Unit> callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MIUISosManager.INSTANCE.supportSyncMIUISosContacts(callback);
    }

    public final void syncSosContactInfo(boolean sosContactSwitchOn, boolean fallDetectionSwitchOn, boolean callMedicalSwitchOn, @Nullable List<eg4> list) {
        String did;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        dg4 dg4Var = new dg4();
        fg4 fg4Var = new fg4();
        fg4Var.c = sosContactSwitchOn;
        int i = 0;
        fg4Var.d = false;
        List<eg4> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            fg4Var.e = list.get(0);
            if (list.size() > 1) {
                fg4Var.f = (eg4[]) list.subList(1, list.size()).toArray(new eg4[0]);
            }
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        if ((deviceManagerExtKt.getDeviceCapability(did) & 32768) == 32768) {
            i = fallDetectionSwitchOn ? 1 : 2;
        }
        fg4Var.h = i;
        fg4Var.i = callMedicalSwitchOn;
        dg4Var.v(fg4Var);
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 1;
        s7rVar.Q(dg4Var);
        Logger.i(TAG, "syncSosContactInfo: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel.syncSosContactInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(EmergencyContactListViewModel.TAG, "set sos fail: " + code);
                EmergencyContactListViewModel.this.getSetResult().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did2, type, 255);
                } else {
                    Logger.i(EmergencyContactListViewModel.TAG, "set sos success");
                    EmergencyContactListViewModel.this.getSetResult().postValue(Boolean.TRUE);
                }
            }
        }, 0, 8, null);
    }
}

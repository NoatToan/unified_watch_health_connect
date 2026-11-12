package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import defpackage.ayo;
import defpackage.byo;
import defpackage.eyo;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.s7r;
import defpackage.txo;
import defpackage.v4h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\bA\u0010\u0016J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001b\u0010\u0014\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "", "index", "Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;", "vibrateType", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "vibrateBean", "newID", "", "addBleVibrate", "(ILcom/xiaomi/hm/health/bt/sdk/data/VibrateType;Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;I)V", "addHuamiVibrate", "(ILcom/xiaomi/hm/health/bt/sdk/data/VibrateType;Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;)V", "", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$VibrateDataItem;", "vibrateTimes", "testBleVibrate", "(Ljava/util/List;)V", "addVibrate", "testVibrate", "stopVibrate", "()V", "", "name", "Lkotlin/Function1;", "", "isNameHas", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lna4;", "compositeDisposable", "Lna4;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$VibrateObserver;", "vibrateObserver", "Landroidx/lifecycle/MutableLiveData;", "getVibrateObserver", "()Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "vibrateData", "Ljava/util/ArrayList;", "getVibrateData", "()Ljava/util/ArrayList;", "setVibrateData", "(Ljava/util/ArrayList;)V", "", "vibrateProgress", "F", "getVibrateProgress", "()F", "setVibrateProgress", "(F)V", "vibrateEndProgress", "getVibrateEndProgress", "setVibrateEndProgress", "<init>", "VibrateObserver", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVibrateModeAddViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n29#2:301\n1557#3:302\n1628#3,3:303\n1557#3:306\n1628#3,3:307\n*S KotlinDebug\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel\n*L\n255#1:301\n156#1:302\n156#1:303,3\n162#1:306\n162#1:307,3\n*E\n"})
public final class VibrateModeAddViewModel extends BaseLoadableBindingViewModel {
    private float vibrateEndProgress;
    private float vibrateProgress;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rpq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VibrateModeAddViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final na4 compositeDisposable = new na4();

    @NotNull
    private final MutableLiveData<VibrateObserver> vibrateObserver = new MutableLiveData<>();

    @NotNull
    private ArrayList<VibrateModeProgressBar.VibrateDataItem> vibrateData = new ArrayList<>();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$VibrateObserver;", "", "success", "", "vibrateBean", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "<init>", "(ZLcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getVibrateBean", "()Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "setVibrateBean", "(Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VibrateObserver {
        private boolean success;

        @NotNull
        private VibrateBean vibrateBean;

        public VibrateObserver(boolean z, @NotNull VibrateBean vibrateBean) {
            Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
            this.success = z;
            this.vibrateBean = vibrateBean;
        }

        public static /* synthetic */ VibrateObserver copy$default(VibrateObserver vibrateObserver, boolean z, VibrateBean vibrateBean, int i, Object obj) {
            if ((i & 1) != 0) {
                z = vibrateObserver.success;
            }
            if ((i & 2) != 0) {
                vibrateBean = vibrateObserver.vibrateBean;
            }
            return vibrateObserver.copy(z, vibrateBean);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VibrateBean getVibrateBean() {
            return this.vibrateBean;
        }

        @NotNull
        public final VibrateObserver copy(boolean success, @NotNull VibrateBean vibrateBean) {
            Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
            return new VibrateObserver(success, vibrateBean);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VibrateObserver)) {
                return false;
            }
            VibrateObserver vibrateObserver = (VibrateObserver) other;
            return this.success == vibrateObserver.success && Intrinsics.areEqual(this.vibrateBean, vibrateObserver.vibrateBean);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final VibrateBean getVibrateBean() {
            return this.vibrateBean;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.success) * 31) + this.vibrateBean.hashCode();
        }

        public final void setSuccess(boolean z) {
            this.success = z;
        }

        public final void setVibrateBean(@NotNull VibrateBean vibrateBean) {
            Intrinsics.checkNotNullParameter(vibrateBean, "<set-?>");
            this.vibrateBean = vibrateBean;
        }

        @NotNull
        public String toString() {
            return "VibrateObserver(success=" + this.success + ", vibrateBean=" + this.vibrateBean + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addBleVibrate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addBleVibrate$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $newID;
        final /* synthetic */ VibrateBean $vibrateBean;
        int label;
        final /* synthetic */ VibrateModeAddViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addBleVibrate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addBleVibrate$1$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nVibrateModeAddViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$addBleVibrate$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,300:1\n1863#2,2:301\n37#3:303\n36#3,3:304\n*S KotlinDebug\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$addBleVibrate$1$1\n*L\n74#1:301,2\n86#1:303\n86#1:304,3\n*E\n"})
        public static final class C05071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $index;
            final /* synthetic */ int $newID;
            final /* synthetic */ VibrateBean $vibrateBean;
            int label;
            final /* synthetic */ VibrateModeAddViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05071(int i, VibrateBean vibrateBean, int i2, VibrateModeAddViewModel vibrateModeAddViewModel, Continuation<? super C05071> continuation) {
                super(2, continuation);
                this.$index = i;
                this.$vibrateBean = vibrateBean;
                this.$newID = i2;
                this.this$0 = vibrateModeAddViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05071(this.$index, this.$vibrateBean, this.$newID, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 58;
                final ayo ayoVar = new ayo();
                ayoVar.f = this.$index + 1;
                ayoVar.d = this.$vibrateBean.getName();
                ayoVar.c = this.$newID;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.$vibrateBean.getTimes().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        ayoVar.e = (byo.a[]) arrayList.toArray(new byo.a[0]);
                        txo txoVar = new txo();
                        txoVar.q0(ayoVar);
                        s7rVar.c0(txoVar);
                        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                        final VibrateBean vibrateBean = this.$vibrateBean;
                        final int i2 = this.$newID;
                        final VibrateModeAddViewModel vibrateModeAddViewModel = this.this$0;
                        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel.addBleVibrate.1.1.2
                            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                            public void onError(String did, int type, int code) {
                                Logger.i(VibrateModeSetViewModelKt.TAG, "addBleVibrate onError" + code);
                                vibrateModeAddViewModel.getVibrateObserver().postValue(new VibrateObserver(false, vibrateBean));
                            }

                            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                            public void onSuccess(String did, int type, SyncResult result) {
                                vibrateBean.setId(String.valueOf(i2));
                                ayo ayoVar2 = ayoVar;
                                Integer numValueOf = ayoVar2 != null ? Integer.valueOf(ayoVar2.c) : null;
                                ayo ayoVar3 = ayoVar;
                                Logger.i(VibrateModeSetViewModelKt.TAG, "addBleVibrate onSuccess id = " + numValueOf + " type = " + ayoVar3.f + " segments = " + ayoVar3.e);
                                vibrateModeAddViewModel.getVibrateObserver().postValue(new VibrateObserver(true, vibrateBean));
                            }
                        }, 0, 8, null);
                        return Unit.INSTANCE;
                    }
                    VibrateModeProgressBar.VibrateDataItem vibrateDataItem = (VibrateModeProgressBar.VibrateDataItem) it.next();
                    byo.a aVar = new byo.a();
                    aVar.d = (int) vibrateDataItem.getProgress();
                    aVar.c = vibrateDataItem.getIntensity() != 1;
                    int intensity = vibrateDataItem.getIntensity();
                    if (intensity == 2) {
                        i = 2;
                    } else if (intensity == 3) {
                        i = 1;
                    }
                    aVar.e = i;
                    arrayList.add(aVar);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, VibrateBean vibrateBean, int i2, VibrateModeAddViewModel vibrateModeAddViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$index = i;
            this.$vibrateBean = vibrateBean;
            this.$newID = i2;
            this.this$0 = vibrateModeAddViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$index, this.$vibrateBean, this.$newID, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05071 c05071 = new C05071(this.$index, this.$vibrateBean, this.$newID, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05071, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addHuamiVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addHuamiVibrate$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nVibrateModeAddViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$addHuamiVibrate$1\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,300:1\n29#2:301\n*S KotlinDebug\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$addHuamiVibrate$1\n*L\n133#1:301\n*E\n"})
    public static final class C21991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ VibrateObserver $result;
        final /* synthetic */ VibrateBean $vibrateBean;
        final /* synthetic */ VibrateType $vibrateType;
        int label;
        final /* synthetic */ VibrateModeAddViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21991(int i, VibrateBean vibrateBean, VibrateModeAddViewModel vibrateModeAddViewModel, VibrateObserver vibrateObserver, VibrateType vibrateType, Continuation<? super C21991> continuation) {
            super(2, continuation);
            this.$index = i;
            this.$vibrateBean = vibrateBean;
            this.this$0 = vibrateModeAddViewModel;
            this.$result = vibrateObserver;
            this.$vibrateType = vibrateType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21991(this.$index, this.$vibrateBean, this.this$0, this.$result, this.$vibrateType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                VibrateModeAddViewModel$addHuamiVibrate$1$success$1 vibrateModeAddViewModel$addHuamiVibrate$1$success$1 = new VibrateModeAddViewModel$addHuamiVibrate$1$success$1(this.this$0, this.$vibrateType, this.$vibrateBean, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, vibrateModeAddViewModel$addHuamiVibrate$1$success$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(VibrateModeSetViewModelKt.TAG, "setVibrate index = " + this.$index + ", time =" + this.$vibrateBean.getTimes() + ", success = " + zBooleanValue);
            this.this$0.postDataLoaded();
            if (zBooleanValue) {
                this.$result.setSuccess(true);
                ArrayList arrayList = new ArrayList();
                DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
                String vibrate_list = deviceSettingsPreference.getVIBRATE_LIST();
                if (vibrate_list != null && vibrate_list.length() != 0) {
                    arrayList = (ArrayList) new Gson().fromJson(vibrate_list, new TypeToken<ArrayList<VibrateBean>>() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addHuamiVibrate$1$invokeSuspend$$inlined$fromJson$1
                    }.getType());
                }
                arrayList.add(this.$vibrateBean);
                deviceSettingsPreference.setVIBRATE_LIST(new Gson().toJson(arrayList));
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                VibrateSpUtils.setModeName(VibrateSpUtils.getModeNameKey(mDeviceModel.getDid(), this.$index), this.$vibrateBean.getName());
                WearableDeviceModel mDeviceModel2 = this.this$0.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                VibrateSpUtils.setModeId(VibrateSpUtils.getModeIdKey(mDeviceModel2.getDid(), this.$index), this.$vibrateBean.getId());
            } else {
                this.$result.setSuccess(false);
            }
            this.this$0.getVibrateObserver().postValue(this.$result);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$isNameHas$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$isNameHas$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $hasName;
        final /* synthetic */ Function1<Boolean, Unit> $isNameHas;
        final /* synthetic */ String $name;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$isNameHas$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$isNameHas$1$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $hasName;
            final /* synthetic */ Function1<Boolean, Unit> $isNameHas;
            final /* synthetic */ String $name;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05081(Function1<? super Boolean, Unit> function1, Ref.BooleanRef booleanRef, String str, Continuation<? super C05081> continuation) {
                super(2, continuation);
                this.$isNameHas = function1;
                this.$hasName = booleanRef;
                this.$name = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05081(this.$isNameHas, this.$hasName, this.$name, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 46;
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final Function1<Boolean, Unit> function1 = this.$isNameHas;
                final Ref.BooleanRef booleanRef = this.$hasName;
                final String str = this.$name;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel.isNameHas.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "loadBLEModeSettingList onError" + code);
                        function1.invoke2(Boolean.valueOf(booleanRef.element));
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        s7r packet;
                        txo txoVarE;
                        eyo eyoVarK = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.K();
                        ayo[] ayoVarArr = eyoVarK != null ? eyoVarK.e : null;
                        if (ayoVarArr != null && ayoVarArr.length != 0) {
                            String str2 = str;
                            Ref.BooleanRef booleanRef2 = booleanRef;
                            for (ayo ayoVar : ayoVarArr) {
                                if (Intrinsics.areEqual(ayoVar.d, str2)) {
                                    booleanRef2.element = true;
                                }
                            }
                        }
                        function1.invoke2(Boolean.valueOf(booleanRef.element));
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22001(Function1<? super Boolean, Unit> function1, Ref.BooleanRef booleanRef, String str, Continuation<? super C22001> continuation) {
            super(2, continuation);
            this.$isNameHas = function1;
            this.$hasName = booleanRef;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22001(this.$isNameHas, this.$hasName, this.$name, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05081 c05081 = new C05081(this.$isNameHas, this.$hasName, this.$name, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05081, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$stopVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$stopVibrate$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C22011(Continuation<? super C22011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22011(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 103;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel.stopVibrate.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(VibrateModeSetViewModelKt.TAG, "stopVibrate onError = " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(VibrateModeSetViewModelKt.TAG, "stopVibrate onSuccess ");
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$testBleVibrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$testBleVibrate$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<VibrateModeProgressBar.VibrateDataItem> $vibrateTimes;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$testBleVibrate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$testBleVibrate$1$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nVibrateModeAddViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$testBleVibrate$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,300:1\n1863#2,2:301\n1557#2:307\n1628#2,3:308\n37#3:303\n36#3,3:304\n*S KotlinDebug\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$testBleVibrate$1$1\n*L\n188#1:301,2\n202#1:307\n202#1:308,3\n200#1:303\n200#1:304,3\n*E\n"})
        public static final class C05111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<VibrateModeProgressBar.VibrateDataItem> $vibrateTimes;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05111(List<VibrateModeProgressBar.VibrateDataItem> list, Continuation<? super C05111> continuation) {
                super(2, continuation);
                this.$vibrateTimes = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05111(this.$vibrateTimes, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 59;
                final byo byoVar = new byo();
                ArrayList<byo.a> arrayList = new ArrayList();
                Iterator<T> it = this.$vibrateTimes.iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    VibrateModeProgressBar.VibrateDataItem vibrateDataItem = (VibrateModeProgressBar.VibrateDataItem) it.next();
                    byo.a aVar = new byo.a();
                    aVar.d = (int) vibrateDataItem.getProgress();
                    aVar.c = vibrateDataItem.getIntensity() != 1;
                    int intensity = vibrateDataItem.getIntensity();
                    if (intensity == 2) {
                        i = 2;
                    } else if (intensity == 3) {
                        i = 1;
                    }
                    aVar.e = i;
                    arrayList.add(aVar);
                }
                byoVar.c = (byo.a[]) arrayList.toArray(new byo.a[0]);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (byo.a aVar2 : arrayList) {
                    arrayList2.add("on: " + aVar2.c + ", duration: " + aVar2.d + ", strength: " + aVar2.e);
                }
                Logger.i(VibrateModeSetViewModelKt.TAG, "testBleVibrate data \n " + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "\n", null, null, 0, null, null, 62, null));
                txo txoVar = new txo();
                txoVar.r0(byoVar);
                s7rVar.c0(txoVar);
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel.testBleVibrate.1.1.3
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "testBleVibrate onError = " + code + byoVar.c);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "testBleVibrate onSuccess = " + byoVar.c);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22021(List<VibrateModeProgressBar.VibrateDataItem> list, Continuation<? super C22021> continuation) {
            super(2, continuation);
            this.$vibrateTimes = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22021(this.$vibrateTimes, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05111 c05111 = new C05111(this.$vibrateTimes, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05111, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addBleVibrate(int index, VibrateType vibrateType, VibrateBean vibrateBean, int newID) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(index, vibrateBean, newID, this, null), 3, null);
    }

    private final void addHuamiVibrate(int index, VibrateType vibrateType, VibrateBean vibrateBean) {
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21991(index, vibrateBean, this, new VibrateObserver(false, vibrateBean), vibrateType, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final void testBleVibrate(List<VibrateModeProgressBar.VibrateDataItem> vibrateTimes) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22021(vibrateTimes, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void testVibrate$lambda$3(VibrateModeAddViewModel this$0, List vibrateTimes, v4h source) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vibrateTimes, "$vibrateTimes");
        Intrinsics.checkNotNullParameter(source, "source");
        WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
        if (mDeviceModel != null) {
            List list = vibrateTimes;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf((short) ((VibrateModeProgressBar.VibrateDataItem) it.next()).getProgress()));
            }
            boolValueOf = Boolean.valueOf(DeviceModelExtKt.testVibrate(mDeviceModel, CollectionsKt___CollectionsKt.toShortArray(arrayList)));
        } else {
            boolValueOf = null;
        }
        Logger.i(VibrateModeSetViewModelKt.TAG, "testVibrate vibrateTimes = " + vibrateTimes.size() + ",  result = " + boolValueOf);
        List<VibrateModeProgressBar.VibrateDataItem> list2 = vibrateTimes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (VibrateModeProgressBar.VibrateDataItem vibrateDataItem : list2) {
            arrayList2.add(vibrateDataItem.getProgress() + ", " + vibrateDataItem.getIntensity() + "\n");
        }
        Logger.i(VibrateModeSetViewModelKt.TAG, "testBleVibrate data \n " + arrayList2);
        Intrinsics.checkNotNull(boolValueOf);
        source.onNext(boolValueOf);
        source.onComplete();
    }

    public final void addVibrate(int index, @NotNull VibrateType vibrateType, @NotNull VibrateBean vibrateBean, int newID) {
        Intrinsics.checkNotNullParameter(vibrateType, "vibrateType");
        Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            addBleVibrate(index, vibrateType, vibrateBean, newID);
        } else {
            addHuamiVibrate(index, vibrateType, vibrateBean);
        }
    }

    @NotNull
    public final ArrayList<VibrateModeProgressBar.VibrateDataItem> getVibrateData() {
        return this.vibrateData;
    }

    public final float getVibrateEndProgress() {
        return this.vibrateEndProgress;
    }

    @NotNull
    public final MutableLiveData<VibrateObserver> getVibrateObserver() {
        return this.vibrateObserver;
    }

    public final float getVibrateProgress() {
        return this.vibrateProgress;
    }

    public final void isNameHas(@NotNull String name, @NotNull Function1<? super Boolean, Unit> isNameHas) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(isNameHas, "isNameHas");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22001(isNameHas, booleanRef, name, null), 3, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        if (deviceSettingsPreference.getVIBRATE_LIST().length() > 0) {
            arrayList.addAll((Collection) new Gson().fromJson(deviceSettingsPreference.getVIBRATE_LIST(), new TypeToken<Collection<? extends VibrateBean>>() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$isNameHas$$inlined$fromJson$1
            }.getType()));
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(name, ((VibrateBean) arrayList.get(i)).getName())) {
                booleanRef.element = true;
            }
        }
        isNameHas.invoke2(Boolean.valueOf(booleanRef.element));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setVibrateData(@NotNull ArrayList<VibrateModeProgressBar.VibrateDataItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.vibrateData = arrayList;
    }

    public final void setVibrateEndProgress(float f) {
        this.vibrateEndProgress = f;
    }

    public final void setVibrateProgress(float f) {
        this.vibrateProgress = f;
    }

    public final void stopVibrate() {
        Logger.i(VibrateModeSetViewModelKt.TAG, "stopVibrate");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            AnyExtKt.io$default(null, new C22011(null), 1, null);
        }
    }

    public final void testVibrate(@NotNull final List<VibrateModeProgressBar.VibrateDataItem> vibrateTimes) {
        Intrinsics.checkNotNullParameter(vibrateTimes, "vibrateTimes");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            testBleVibrate(vibrateTimes);
        } else {
            this.compositeDisposable.a(o4h.f(new j5h() { // from class: spq
                @Override // defpackage.j5h
                public final void subscribe(v4h v4hVar) {
                    VibrateModeAddViewModel.testVibrate$lambda$3(this.f33867a, vibrateTimes, v4hVar);
                }
            }).S(ofl.c()).M());
        }
    }
}

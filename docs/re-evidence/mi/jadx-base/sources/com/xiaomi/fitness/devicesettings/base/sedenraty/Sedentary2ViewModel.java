package com.xiaomi.fitness.devicesettings.base.sedenraty;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.DefaultHuamiHealthModel;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.onetrack.c.q;
import defpackage.s7r;
import defpackage.st9;
import defpackage.t64;
import defpackage.ur9;
import defpackage.wzi;
import defpackage.xc6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB\t\b\u0007¢\u0006\u0004\bJ\u0010\rJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J3\u0010'\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b*\u0010\rJ\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0015¢\u0006\u0004\b,\u0010\u0018J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010\rR\"\u0010.\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER*\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010C\u001a\u0004\bG\u0010E\"\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/sedenraty/Sedentary2ViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/DefaultHuamiHealthModel;", "", "startHour", "startMin", "endHour", "endMin", "", "isStartEndTimeError", "(IIII)Z", "", "setHuaMiSedentaryInfo", "()V", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", Feature.SEDENTARY, "Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryConfig;", "convertSedentary2Config", "(Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;)Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryConfig;", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "(Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;)Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryConfig;", "Lst9;", "bleSedentaryReminder", "setBleSedentaryInfo", "(Lst9;)V", "getBleSedentaryInfo", "getHuaMiSedentaryInfo", q.f13857a, "convertConfig2Sedentary", "(Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryConfig;)Lst9;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "isStart", "hour", "minute", "Lkotlin/Function0;", "errorCallBack", "updateTimeValue", "(ZIILkotlin/jvm/functions/Function0;)V", "updateBreakTimeValue", "syncInfo", "info", "setInfo", "getSedentaryInfo", "isSupportBreakTime", "Z", "()Z", "setSupportBreakTime", "(Z)V", "Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryModel;", "sedentaryModel", "Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryModel;", "getSedentaryModel", "()Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryModel;", "setSedentaryModel", "(Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryModel;)V", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "deviceSync", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getDeviceSync", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "setDeviceSync", "(Lcom/xiaomi/fitness/device/contact/export/DeviceContact;)V", "Landroidx/lifecycle/MutableLiveData;", "mResultData", "Landroidx/lifecycle/MutableLiveData;", "getMResultData", "()Landroidx/lifecycle/MutableLiveData;", "mInfoData", "getMInfoData", "setMInfoData", "(Landroidx/lifecycle/MutableLiveData;)V", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSedentary2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sedentary2ViewModel.kt\ncom/xiaomi/fitness/devicesettings/base/sedenraty/Sedentary2ViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class Sedentary2ViewModel extends BaseHuamiHealthMonitorViewModel<DefaultHuamiHealthModel> {
    public static final int MINUTE_OF_ONE_HOUR = 60;

    @NotNull
    public static final String TAG = "SedentaryViewModel";
    public DeviceContact deviceSync;
    private boolean isSupportBreakTime;
    public SedentaryModel sedentaryModel;

    @NotNull
    private final MutableLiveData<Boolean> mResultData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<st9> mInfoData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel$getHuaMiSedentaryInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel$getHuaMiSedentaryInfo$1", f = "Sedentary2ViewModel.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20101(Continuation<? super C20101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Sedentary2ViewModel.this.new C20101(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1 sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1 = new Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1(Sedentary2ViewModel.this, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Sedentary2ViewModel.this.postDataLoaded();
            Sedentary2ViewModel.this.getMInfoData().postValue((st9) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel$setHuaMiSedentaryInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel$setHuaMiSedentaryInfo$1", f = "Sedentary2ViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20121(Continuation<? super C20121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Sedentary2ViewModel.this.new C20121(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1 sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1 = new Sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1(Sedentary2ViewModel.this, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, sedentary2ViewModel$setHuaMiSedentaryInfo$1$result$1, this);
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
            xc6.d("setHuaMiSedentaryInfo " + zBooleanValue);
            Sedentary2ViewModel.this.postDataLoaded();
            Sedentary2ViewModel.this.getMResultData().postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final st9 convertConfig2Sedentary(SedentaryConfig config) {
        st9 st9Var = new st9();
        st9Var.c = false;
        t64 t64Var = new t64();
        t64Var.c = 8;
        t64Var.d = 0;
        st9Var.d = t64Var;
        t64 t64Var2 = new t64();
        t64Var2.c = 21;
        t64Var2.d = 0;
        st9Var.e = t64Var2;
        st9Var.f = false;
        if (this.isSupportBreakTime) {
            t64 t64Var3 = new t64();
            t64Var3.c = 12;
            t64Var3.d = 0;
            st9Var.g = t64Var3;
            t64 t64Var4 = new t64();
            t64Var4.c = 14;
            t64Var4.d = 0;
            st9Var.h = t64Var4;
        }
        if (config != null) {
            st9Var.c = config.enable;
            t64 t64Var5 = new t64();
            int i = config.workSt;
            t64Var5.c = i / 60;
            t64Var5.d = i % 60;
            st9Var.d = t64Var5;
            t64 t64Var6 = new t64();
            int i2 = config.workEd;
            t64Var6.c = i2 / 60;
            t64Var6.d = i2 % 60;
            st9Var.e = t64Var6;
            List<SedentaryConfig.a> list = config.middayRest;
            if (list == null || list.isEmpty()) {
                st9Var.f = false;
            } else {
                SedentaryConfig.a aVar = config.middayRest.get(0);
                st9Var.f = aVar.f11952a;
                if (this.isSupportBreakTime) {
                    t64 t64Var7 = new t64();
                    int i3 = aVar.f11953b;
                    t64Var7.c = i3 / 60;
                    t64Var7.d = i3 % 60;
                    st9Var.g = t64Var7;
                    t64 t64Var8 = new t64();
                    int i4 = aVar.c;
                    t64Var8.c = i4 / 60;
                    t64Var8.d = i4 % 60;
                    st9Var.h = t64Var8;
                }
            }
        }
        return st9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SedentaryConfig convertSedentary2Config(HMSedentaryConfig sedentary) {
        SedentaryConfig sedentaryConfig = new SedentaryConfig();
        sedentaryConfig.enable = sedentary.isEnable();
        sedentaryConfig.workSt = sedentary.getStartIndex();
        sedentaryConfig.workEd = sedentary.getStopIndex();
        SedentaryConfig.a aVar = new SedentaryConfig.a();
        aVar.f11952a = sedentary.isPeriodEnable();
        aVar.f11953b = (sedentary.getStartHour2() * 60) + sedentary.getStartMinutes2();
        aVar.c = (sedentary.getStopHour2() * 60) + sedentary.getStopMinutes2();
        ArrayList arrayList = new ArrayList();
        sedentaryConfig.middayRest = arrayList;
        arrayList.add(aVar);
        return sedentaryConfig;
    }

    private final void getBleSedentaryInfo() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 12;
        DeviceContact.DefaultImpls.call$default(getDeviceSync(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel.getBleSedentaryInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Sedentary2ViewModel.this.postDataLoaded();
                Logger.e(SedentaryFragment.TAG, "getBleSedentaryInfo error " + did + " " + type + " " + code);
                Sedentary2ViewModel.this.getMInfoData().postValue(null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ur9 ur9VarU;
                Sedentary2ViewModel.this.postDataLoaded();
                if (result != null) {
                    Sedentary2ViewModel sedentary2ViewModel = Sedentary2ViewModel.this;
                    st9 st9VarN = null;
                    if (!SyncResultExitKt.isSuccess(result)) {
                        sedentary2ViewModel.getMInfoData().postValue(null);
                        return;
                    }
                    MutableLiveData<st9> mInfoData = sedentary2ViewModel.getMInfoData();
                    s7r packet = result.getPacket();
                    if (packet != null && (ur9VarU = packet.u()) != null) {
                        st9VarN = ur9VarU.N();
                    }
                    mInfoData.postValue(st9VarN);
                }
            }
        }, 0, 8, null);
    }

    private final void getHuaMiSedentaryInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20101(null), 3, null);
    }

    private final boolean isStartEndTimeError(int startHour, int startMin, int endHour, int endMin) {
        return endHour < startHour || (endHour == startHour && endMin < startMin);
    }

    private final void setBleSedentaryInfo(st9 bleSedentaryReminder) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 13;
        ur9 ur9Var = new ur9();
        ur9Var.F0(bleSedentaryReminder);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(getDeviceSync(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel.setBleSedentaryInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Sedentary2ViewModel.this.postDataLoaded();
                Sedentary2ViewModel.this.getMResultData().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Sedentary2ViewModel.this.postDataLoaded();
                if (result == null || !SyncResultExitKt.isSuccess(result)) {
                    Sedentary2ViewModel.this.getMResultData().postValue(Boolean.FALSE);
                } else {
                    Sedentary2ViewModel.this.getMResultData().postValue(Boolean.TRUE);
                }
            }
        }, 0, 8, null);
    }

    private final void setHuaMiSedentaryInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20121(null), 3, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel, com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        if (getDeviceModel() != null) {
            WearableDeviceModel deviceModel = getDeviceModel();
            Intrinsics.checkNotNull(deviceModel);
            this.isSupportBreakTime = DeviceModelExtKt.isSupportFeature(deviceModel, Feature.STAND_REMINDER);
        }
    }

    @NotNull
    public final DeviceContact getDeviceSync() {
        DeviceContact deviceContact = this.deviceSync;
        if (deviceContact != null) {
            return deviceContact;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceSync");
        return null;
    }

    @NotNull
    public final MutableLiveData<st9> getMInfoData() {
        return this.mInfoData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMResultData() {
        return this.mResultData;
    }

    public final void getSedentaryInfo() {
        postDataOnLoading();
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null) {
            if (DeviceModelExtKt.isBluetooth(deviceModel) || DeviceModelExtKt.isWearOS(deviceModel)) {
                getBleSedentaryInfo();
            } else if (DeviceModelExtKt.isHuaMi(deviceModel)) {
                getHuaMiSedentaryInfo();
            } else {
                Logger.e(SedentaryFragment.TAG, "getSedentaryInfo error unsupported device");
            }
        }
    }

    @NotNull
    public final SedentaryModel getSedentaryModel() {
        SedentaryModel sedentaryModel = this.sedentaryModel;
        if (sedentaryModel != null) {
            return sedentaryModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sedentaryModel");
        return null;
    }

    /* JADX INFO: renamed from: isSupportBreakTime, reason: from getter */
    public final boolean getIsSupportBreakTime() {
        return this.isSupportBreakTime;
    }

    public final void setDeviceSync(@NotNull DeviceContact deviceContact) {
        Intrinsics.checkNotNullParameter(deviceContact, "<set-?>");
        this.deviceSync = deviceContact;
    }

    public final void setInfo(@NotNull st9 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        getSedentaryModel().setInfo(info);
    }

    public final void setMInfoData(@NotNull MutableLiveData<st9> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mInfoData = mutableLiveData;
    }

    public final void setSedentaryModel(@NotNull SedentaryModel sedentaryModel) {
        Intrinsics.checkNotNullParameter(sedentaryModel, "<set-?>");
        this.sedentaryModel = sedentaryModel;
    }

    public final void setSupportBreakTime(boolean z) {
        this.isSupportBreakTime = z;
    }

    public final void syncInfo() {
        xc6.d("SedentaryFragment deviceModel " + getDeviceModel());
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null) {
            if (DeviceModelExtKt.isHuaMi(deviceModel)) {
                xc6.d("SedentaryFragment sync huami");
                setHuaMiSedentaryInfo();
                return;
            }
            st9 bleSedentaryReminder = getSedentaryModel().getBleSedentaryReminder(this.isSupportBreakTime);
            xc6.d("isBluetooth syncInfo = " + bleSedentaryReminder);
            setBleSedentaryInfo(bleSedentaryReminder);
        }
    }

    public final void updateBreakTimeValue(boolean isStart, int hour, int minute, @NotNull Function0<Unit> errorCallBack) {
        Intrinsics.checkNotNullParameter(errorCallBack, "errorCallBack");
        if (isStart) {
            if (isStartEndTimeError(hour, minute, getSedentaryModel().getMBreakEndHourCal(), getSedentaryModel().getMBreakEndMinCal())) {
                ToastUtil.INSTANCE.showToast(wzi.n8);
                errorCallBack.invoke();
                return;
            }
        } else if (isStartEndTimeError(getSedentaryModel().getMBreakStartHourCal(), getSedentaryModel().getMBreakStartMinCal(), hour, minute)) {
            ToastUtil.INSTANCE.showToast(wzi.n8);
            errorCallBack.invoke();
            return;
        }
        getSedentaryModel().updateBreakTimeValue(isStart, hour, minute);
        syncInfo();
    }

    public final void updateTimeValue(boolean isStart, int hour, int minute, @NotNull Function0<Unit> errorCallBack) {
        Intrinsics.checkNotNullParameter(errorCallBack, "errorCallBack");
        if (isStart) {
            if (isStartEndTimeError(hour, minute, getSedentaryModel().getMEndHourCal(), getSedentaryModel().getMEndMinCal())) {
                ToastUtil.INSTANCE.showToast(wzi.n8);
                errorCallBack.invoke();
                return;
            }
        } else if (isStartEndTimeError(getSedentaryModel().getMStartHourCal(), getSedentaryModel().getMStartMinCal(), hour, minute)) {
            ToastUtil.INSTANCE.showToast(wzi.n8);
            errorCallBack.invoke();
            return;
        }
        getSedentaryModel().updateTimeValue(isStart, hour, minute);
        syncInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SedentaryConfig convertSedentary2Config(StandAlertConfig sedentary) {
        SedentaryConfig sedentaryConfig = new SedentaryConfig();
        sedentaryConfig.enable = sedentary.getEnable();
        sedentaryConfig.workSt = (sedentary.getStartTime().getHour() * 60) + sedentary.getStartTime().getMinute();
        sedentaryConfig.workEd = (sedentary.getEndTime().getHour() * 60) + sedentary.getEndTime().getMinute();
        SedentaryConfig.a aVar = new SedentaryConfig.a();
        aVar.f11952a = sedentary.getEnableDnd();
        aVar.f11953b = (sedentary.getDndStartTime().getHour() * 60) + sedentary.getDndStartTime().getMinute();
        aVar.c = (sedentary.getDndEndTime().getHour() * 60) + sedentary.getDndEndTime().getMinute();
        ArrayList arrayList = new ArrayList();
        sedentaryConfig.middayRest = arrayList;
        arrayList.add(aVar);
        return sedentaryConfig;
    }
}

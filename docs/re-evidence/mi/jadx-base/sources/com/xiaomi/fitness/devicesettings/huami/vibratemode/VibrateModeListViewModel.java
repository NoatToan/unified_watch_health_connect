package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.TodoExtKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListViewModel;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import defpackage.ayo;
import defpackage.dyo;
import defpackage.eyo;
import defpackage.lhi;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010\u0006R\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140(0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeListViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Landroid/content/Context;", "context", "", "loadBLEModeSettingList", "(Landroid/content/Context;)V", "", "type", "setBleDefault", "(I)V", "", "name", "Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;", "mode", "Ldyo;", "item", "", "Layo;", "vibrators", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "updateDefaultSet", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;Ldyo;[Layo;)Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "id", "", "isIdDefault", "(I)Z", "loadHuamiModeSettingList", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "loadModeSettingList", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Landroidx/lifecycle/MutableLiveData;", "", "modeList", "Landroidx/lifecycle/MutableLiveData;", "getModeList", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVibrateModeListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeListViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeListViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n13402#2,2:166\n1872#3,3:168\n*S KotlinDebug\n*F\n+ 1 VibrateModeListViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeListViewModel\n*L\n125#1:166,2\n152#1:168,3\n*E\n"})
public final class VibrateModeListViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: upq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VibrateModeListViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<List<VibrateModeBean>> modeList = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListViewModel$loadBLEModeSettingList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListViewModel$loadBLEModeSettingList$1", f = "VibrateModeListViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListViewModel$loadBLEModeSettingList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListViewModel$loadBLEModeSettingList$1$1", f = "VibrateModeListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ VibrateModeListViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05121(VibrateModeListViewModel vibrateModeListViewModel, Continuation<? super C05121> continuation) {
                super(2, continuation);
                this.this$0 = vibrateModeListViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05121(this.this$0, continuation);
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
                final ArrayList arrayList = new ArrayList();
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final VibrateModeListViewModel vibrateModeListViewModel = this.this$0;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeListViewModel.loadBLEModeSettingList.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.i(VibrateModeSetViewModelKt.TAG, "loadBLEModeSettingList onError" + code);
                        vibrateModeListViewModel.getModeList().postValue(arrayList);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        WearableDeviceModel mDeviceModel;
                        s7r packet;
                        txo txoVarE;
                        eyo eyoVarK = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.K();
                        dyo[] dyoVarArr = eyoVarK != null ? eyoVarK.c : null;
                        Integer numValueOf = eyoVarK != null ? Integer.valueOf(eyoVarK.d) : null;
                        ayo[] ayoVarArr = eyoVarK != null ? eyoVarK.e : null;
                        String string = Arrays.toString(ayoVarArr);
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        String string2 = Arrays.toString(dyoVarArr);
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        Logger.i(VibrateModeSetViewModelKt.TAG, "loadBLEModeSettingList onSuccess maxNumber = " + numValueOf + " vibrators = " + string + " items = " + string2);
                        List mutableList = ArraysKt___ArraysKt.toMutableList(ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), lhi.p));
                        if (dyoVarArr != null && dyoVarArr.length != 0) {
                            VibrateModeListViewModel vibrateModeListViewModel2 = vibrateModeListViewModel;
                            ArrayList<VibrateModeBean> arrayList2 = arrayList;
                            for (dyo dyoVar : dyoVarArr) {
                                VibrateType vibrateTypeIndex2Mode = VibrateSpUtils.INSTANCE.index2Mode(dyoVar.c - 1);
                                String string3 = (vibrateTypeIndex2Mode == VibrateType.LONG_SIT && (mDeviceModel = vibrateModeListViewModel2.getMDeviceModel()) != null && DeviceModelExtKt.isSupportFeature(mDeviceModel, Feature.STAND_REMINDER)) ? ApplicationExtKt.getApplication().getString(wzi.a8) : (vibrateTypeIndex2Mode == VibrateType.EVENT_REMIND && TodoExtKt.checkDeviceSupportTodoEnable()) ? ApplicationExtKt.getApplication().getString(wzi.w8) : (String) mutableList.get(dyoVar.c - 1);
                                Intrinsics.checkNotNull(string3);
                                Intrinsics.checkNotNull(dyoVar);
                                arrayList2.add(vibrateModeListViewModel2.updateDefaultSet(string3, vibrateTypeIndex2Mode, dyoVar, ayoVarArr));
                            }
                        }
                        Logger.i(VibrateModeSetViewModelKt.TAG, "update items = " + arrayList);
                        vibrateModeListViewModel.getModeList().postValue(arrayList);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VibrateModeListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05121 c05121 = new C05121(VibrateModeListViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05121, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    private final boolean isIdDefault(int id) {
        return id == 0 || id == 255 || id == 254 || id == 253 || id == 252 || id == 251 || id == 250;
    }

    private final void loadBLEModeSettingList(Context context) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void loadHuamiModeSettingList(Context context) {
        String modeId;
        WearableDeviceModel mDeviceModel;
        WearableDeviceModel mDeviceModel2;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(context);
        List mutableList = ArraysKt___ArraysKt.toMutableList(ResourceExtKt.getStringArray(context, lhi.p));
        if (!RomUtils.isXiaomi() || ((mDeviceModel2 = getMDeviceModel()) != null && !DeviceModelExtKt.isL66(mDeviceModel2))) {
            ListExtKt.remove(mutableList, mutableList.size() - 1);
        }
        int i = 0;
        for (Object obj : mutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String string = (String) obj;
            VibrateType vibrateTypeIndex2Mode = VibrateSpUtils.INSTANCE.index2Mode(i);
            String string2 = context.getString(wzi.X8);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (getMDeviceModel() != null) {
                WearableDeviceModel mDeviceModel3 = getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel3);
                String modeNameKey = VibrateSpUtils.getModeNameKey(mDeviceModel3.getDid(), i);
                String string3 = context.getString(wzi.X8);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string2 = VibrateSpUtils.getModeName(modeNameKey, string3);
                WearableDeviceModel mDeviceModel4 = getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel4);
                modeId = VibrateSpUtils.getModeId(VibrateSpUtils.getModeIdKey(mDeviceModel4.getDid(), i), "");
            } else {
                modeId = null;
            }
            String str = string2;
            String str2 = modeId;
            if (vibrateTypeIndex2Mode == VibrateType.LONG_SIT && (mDeviceModel = getMDeviceModel()) != null && DeviceModelExtKt.isSupportFeature(mDeviceModel, Feature.STAND_REMINDER)) {
                string = ApplicationExtKt.getApplication().getString(wzi.a8);
            }
            String str3 = string;
            Intrinsics.checkNotNull(str3);
            arrayList.add(new VibrateModeBean(str3, vibrateTypeIndex2Mode, i, str, str2));
            i = i2;
        }
        this.modeList.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final void setBleDefault(int type) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 47;
        dyo dyoVar = new dyo();
        dyoVar.d = 0;
        dyoVar.c = type;
        txo txoVar = new txo();
        txoVar.s0(dyoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VibrateModeBean updateDefaultSet(String name, VibrateType mode, dyo item, ayo[] vibrators) {
        if (isIdDefault(item.d)) {
            return new VibrateModeBean(name, mode, item.c - 1, VibrateSpUtils.INSTANCE.getDefaultName(item.d), String.valueOf(item.d));
        }
        if (vibrators != null && vibrators.length != 0) {
            for (ayo ayoVar : vibrators) {
                if (item.d == ayoVar.c) {
                    int i = item.c - 1;
                    String name2 = ayoVar.d;
                    Intrinsics.checkNotNullExpressionValue(name2, "name");
                    return new VibrateModeBean(name, mode, i, name2, String.valueOf(item.d));
                }
            }
        }
        setBleDefault(item.c);
        int i2 = item.c - 1;
        String string = ApplicationExtKt.getApplication().getString(wzi.X8);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new VibrateModeBean(name, mode, i2, string, "0");
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    @NotNull
    public final MutableLiveData<List<VibrateModeBean>> getModeList() {
        return this.modeList;
    }

    public final void loadModeSettingList(@Nullable Context context) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            loadBLEModeSettingList(context);
        } else {
            loadHuamiModeSettingList(context);
        }
    }
}

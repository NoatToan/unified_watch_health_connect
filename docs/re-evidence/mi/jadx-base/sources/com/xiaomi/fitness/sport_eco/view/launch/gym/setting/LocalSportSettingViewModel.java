package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_eco.bean.DeviceVersionInfo;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.ayi;
import defpackage.dvq;
import defpackage.e1j;
import defpackage.eu6;
import defpackage.fs9;
import defpackage.mcn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0013\b\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\bQ\u0010RJ3\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001c\u001a\u00020\u00072 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u00020\u00072 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00070 ¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b/\u00100R\u0019\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010.R\u0011\u0010F\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bO\u0010H¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "key", "value", "Lkotlin/Function1;", "", "", "callback", "setSettingItem", "(IILkotlin/jvm/functions/Function1;)V", "", "Lfs9;", Feature.FIND, "([Lfs9;I)Lfs9;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;", "checked", "setChecked", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;Z)Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$ArrowSettingItem;", "redPointShow", "setRedPointShow", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$ArrowSettingItem;Z)Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$ArrowSettingItem;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function2;", "readSettingConfig", "(Lkotlin/jvm/functions/Function2;)V", "getConfigValue", "(I)I", "Lkotlin/Function3;", "Lcom/xiaomi/fitness/sport_eco/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "checkForUpdate", "(Lkotlin/jvm/functions/Function3;)V", "switchOn", "setChildProtectSwitch", "(ZLkotlin/jvm/functions/Function1;)V", "speed", "", "setMaxSpeedLimit", "(ILkotlin/jvm/functions/Function1;)V", "", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "buildSettingItems", "()Ljava/util/List;", "getSpeedStr", "(I)Ljava/lang/String;", "Lmcn;", "sportDB", "Lmcn;", "getSportDB", "()Lmcn;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingRequest;", "mRequest$delegate", "Lkotlin/Lazy;", "getMRequest", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingRequest;", "mRequest", "mSettingList", "[Lfs9;", "maxSpeedRange", "Ljava/util/List;", "getMaxSpeedRange", "getCurDevice", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "curDevice", "getCurModel", "()Ljava/lang/String;", "curModel", "getCurDid", "curDid", "getCurSpeedLimit", "()I", "curSpeedLimit", "getDeviceMac", "deviceMac", "<init>", "(Lmcn;)V", "Companion", "ViewModelFactory", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLocalSportSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSportSettingViewModel.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,253:1\n13402#2,2:254\n*S KotlinDebug\n*F\n+ 1 LocalSportSettingViewModel.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingViewModel\n*L\n214#1:254,2\n*E\n"})
public final class LocalSportSettingViewModel extends AbsViewModel {
    public static final int DID_NOT_FIND = -7;
    public static final int NO_PERMISSION = -1;
    private static final int SPEED_LIMIT_MAXIMUM = 14;
    private static final int SPEED_LIMIT_MINIMUM = 0;
    public static final int SUCCEED = 0;
    public static final int SWITCH_OFF = 0;
    public static final int SWITCH_ON = 1;

    @NotNull
    public static final String TAG = "LocalSportSettingViewModel";
    private EcoDeviceModel mDeviceModel;

    /* JADX INFO: renamed from: mRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRequest;

    @Nullable
    private fs9[] mSettingList;

    @NotNull
    private final List<Integer> maxSpeedRange;

    @Nullable
    private final mcn sportDB;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingViewModel$ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ldvq;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Ldvq;", "Lmcn;", "sportDB", "Lmcn;", "<init>", "(Lmcn;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ViewModelFactory implements ViewModelProvider.Factory {

        @Nullable
        private final mcn sportDB;

        public ViewModelFactory(@Nullable mcn mcnVar) {
            this.sportDB = mcnVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends dvq> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            if (Intrinsics.areEqual(modelClass, LocalSportSettingViewModel.class)) {
                return new LocalSportSettingViewModel(this.sportDB, null);
            }
            throw new RuntimeException("unknown class :" + modelClass.getName());
        }
    }

    public /* synthetic */ LocalSportSettingViewModel(mcn mcnVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mcnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForUpdate$lambda$3(Function3 callback, DeviceVersionInfo deviceVersionInfo) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (deviceVersionInfo != null) {
            Integer numValueOf = Integer.valueOf(deviceVersionInfo.getCode());
            Boolean boolValueOf = Boolean.valueOf(deviceVersionInfo.isNeedUpdate());
            Serializable versionInfo = deviceVersionInfo.getVersionInfo();
            callback.invoke(numValueOf, boolValueOf, versionInfo instanceof LocalDeviceUpgradeModel.CheckUpgradeRequest ? (LocalDeviceUpgradeModel.CheckUpgradeRequest) versionInfo : null);
        } else {
            callback.invoke(-1, Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    private final fs9 find(fs9[] fs9VarArr, int i) {
        for (fs9 fs9Var : fs9VarArr) {
            if (fs9Var.c == i) {
                return fs9Var;
            }
        }
        return null;
    }

    private final LocalSportSettingRequest getMRequest() {
        return (LocalSportSettingRequest) this.mRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalSportSettingRequest mRequest_delegate$lambda$0() {
        return LocalSportSettingRequestKt.getInstance(LocalSportSettingRequest.INSTANCE);
    }

    private final LocalSportSettingItemAdapter.SwitchSettingItem setChecked(LocalSportSettingItemAdapter.SwitchSettingItem switchSettingItem, boolean z) {
        switchSettingItem.setChecked(z);
        return switchSettingItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setChildProtectSwitch$lambda$4(boolean z, LocalSportSettingViewModel this$0, int i, Function1 callback, boolean z2) {
        fs9 fs9VarFind;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.i("LocalSportSettingViewModel", "setChildProtectSwitch " + z + " result:" + z2);
        if (z2) {
            fs9[] fs9VarArr = this$0.mSettingList;
            if (fs9VarArr != null && (fs9VarFind = this$0.find(fs9VarArr, 0)) != null) {
                fs9VarFind.d = i;
            }
        } else {
            ToastUtil.showToast(ResourceExtKt.getString(e1j.common_set_error));
        }
        if (!z2) {
            z = !z;
        }
        callback.invoke2(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMaxSpeedLimit$lambda$5(int i, LocalSportSettingViewModel this$0, Function1 callback, boolean z) {
        fs9 fs9VarFind;
        fs9 fs9VarFind2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.i("LocalSportSettingViewModel", "setMaxSpeedLimit " + i + " result: " + z);
        if (z) {
            fs9[] fs9VarArr = this$0.mSettingList;
            if (fs9VarArr != null && (fs9VarFind2 = this$0.find(fs9VarArr, 4)) != null) {
                fs9VarFind2.d = i;
            }
            callback.invoke2(this$0.getSpeedStr(i));
        } else {
            ToastUtil.showToast(ResourceExtKt.getString(e1j.common_set_error));
            fs9[] fs9VarArr2 = this$0.mSettingList;
            callback.invoke2(this$0.getSpeedStr((fs9VarArr2 == null || (fs9VarFind = this$0.find(fs9VarArr2, 4)) == null) ? ((Number) CollectionsKt___CollectionsKt.first((List) this$0.maxSpeedRange)).intValue() : fs9VarFind.d));
        }
        return Unit.INSTANCE;
    }

    private final LocalSportSettingItemAdapter.ArrowSettingItem setRedPointShow(LocalSportSettingItemAdapter.ArrowSettingItem arrowSettingItem, boolean z) {
        arrowSettingItem.setRedPointShow(z);
        return arrowSettingItem;
    }

    private final void setSettingItem(final int key, final int value, final Function1<? super Boolean, Unit> callback) {
        fs9 fs9Var = new fs9();
        fs9Var.c = key;
        fs9Var.d = value;
        Unit unit = Unit.INSTANCE;
        fs9[] fs9VarArr = {fs9Var};
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        EcoDeviceModelExtKt.setGYMSettings(ecoDeviceModel, fs9VarArr, new eu6<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingViewModel.setSettingItem.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                ScopeExtKt.scope(Dispatchers.getMain(), new LocalSportSettingViewModel$setSettingItem$1$onError$1(key, value, errorCode, callback, null));
            }

            @Override // defpackage.eu6
            public void onResult(Boolean result) {
                ScopeExtKt.scope(Dispatchers.getMain(), new LocalSportSettingViewModel$setSettingItem$1$onResult$1(key, value, callback, null));
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null) {
            throw new IllegalStateException("local device is null");
        }
        this.mDeviceModel = localDeviceModel;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    @NotNull
    public final List<LocalSportSettingItemAdapter.SettingItem> buildSettingItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.Y), null, 2, null));
        BgPermissionSettingItem bgPermissionSettingItem = new BgPermissionSettingItem();
        LocalSportSettingHelper localSportSettingHelper = LocalSportSettingHelper.INSTANCE;
        arrayList.add(setRedPointShow(bgPermissionSettingItem, localSportSettingHelper.isShowSportBgPermission()));
        arrayList.add(setChecked(new VoiceSpeechSettingItem(), localSportSettingHelper.isSettingVoiceSpeech(this.sportDB)));
        arrayList.add(setChecked(new ScreenOnSettingItem(), localSportSettingHelper.isSettingScreenOn(this.sportDB)));
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        if (EcoDeviceModelExtKt.isSupportChildLock(ecoDeviceModel)) {
            arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.X), null, 2, null));
        } else {
            EcoDeviceModel ecoDeviceModel2 = this.mDeviceModel;
            if (ecoDeviceModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
                ecoDeviceModel2 = null;
            }
            if (EcoDeviceModelExtKt.isSupportSpeedLimit(ecoDeviceModel2)) {
                arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.X), null, 2, null));
            }
        }
        EcoDeviceModel ecoDeviceModel3 = this.mDeviceModel;
        if (ecoDeviceModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel3 = null;
        }
        if (EcoDeviceModelExtKt.isSupportChildLock(ecoDeviceModel3)) {
            arrayList.add(new ChildProtectModeSettingItem());
        }
        EcoDeviceModel ecoDeviceModel4 = this.mDeviceModel;
        if (ecoDeviceModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel4 = null;
        }
        if (EcoDeviceModelExtKt.isSupportSpeedLimit(ecoDeviceModel4)) {
            arrayList.add(new MaxSpeedModeSettingItem());
        }
        arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.g2), null, 2, null));
        arrayList.add(new OwnerlessRecordSettingItem());
        EcoDeviceModel ecoDeviceModel5 = this.mDeviceModel;
        if (ecoDeviceModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel5 = null;
        }
        if (EcoDeviceModelExtKt.isSupportDeviceDebugMode(ecoDeviceModel5)) {
            arrayList.add(new BeltAdjustmentSettingItem());
        }
        arrayList.add(new UserGuideSettingItem());
        EcoDeviceModel ecoDeviceModel6 = this.mDeviceModel;
        if (ecoDeviceModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel6 = null;
        }
        if (EcoDeviceModelExtKt.isSupportIntelligentLinkage(ecoDeviceModel6)) {
            arrayList.add(new LinkageSettingItem());
        }
        EcoDeviceModel ecoDeviceModel7 = this.mDeviceModel;
        if (ecoDeviceModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel7 = null;
        }
        if (EcoDeviceModelExtKt.isSupportInsuranceIntroduction(ecoDeviceModel7)) {
            arrayList.add(new InsuranceSettingItem());
        }
        arrayList.add(new UpgradeSettingItem());
        arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.V), null, 2, null));
        arrayList.add(new PrivacyDetailSettingItem());
        arrayList.add(new UserAgreementSettingItem());
        arrayList.add(new PrivacyRevokeSettingItem());
        return arrayList;
    }

    public final void checkForUpdate(@NotNull final Function3<? super Integer, ? super Boolean, ? super LocalDeviceUpgradeModel.CheckUpgradeRequest, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LocalSportSettingRequest mRequest = getMRequest();
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        mRequest.getDeviceVersionInfo(ecoDeviceModel.getDid(), new Function1() { // from class: qme
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingViewModel.checkForUpdate$lambda$3(callback, (DeviceVersionInfo) obj);
            }
        });
    }

    public final int getConfigValue(int key) {
        fs9 fs9VarFind;
        fs9[] fs9VarArr = this.mSettingList;
        if (fs9VarArr == null || (fs9VarFind = find(fs9VarArr, key)) == null) {
            return -1;
        }
        return fs9VarFind.d;
    }

    @NotNull
    public final EcoDeviceModel getCurDevice() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel != null) {
            return ecoDeviceModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
        return null;
    }

    @NotNull
    public final String getCurDid() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        return ecoDeviceModel.getDid();
    }

    @NotNull
    public final String getCurModel() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getModel(ecoDeviceModel);
    }

    public final int getCurSpeedLimit() {
        return getConfigValue(4);
    }

    @NotNull
    public final String getDeviceMac() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(ecoDeviceModel);
    }

    @NotNull
    public final List<Integer> getMaxSpeedRange() {
        return this.maxSpeedRange;
    }

    @NotNull
    public final String getSpeedStr(int speed) {
        if (speed == 0) {
            return ResourceExtKt.getString(e1j.n2);
        }
        String quantityString = AppUtil.getApp().getResources().getQuantityString(ayi.f3580a, speed, Integer.valueOf(speed));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Nullable
    public final mcn getSportDB() {
        return this.sportDB;
    }

    public final void readSettingConfig(@NotNull final Function2<? super Boolean, ? super fs9[], Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        EcoDeviceModelExtKt.getGYMSettings(ecoDeviceModel, new eu6<fs9[]>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingViewModel.readSettingConfig.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                ScopeExtKt.scope(Dispatchers.getMain(), new LocalSportSettingViewModel$readSettingConfig$1$onError$1(callback, null));
            }

            @Override // defpackage.eu6
            public void onResult(fs9[] result) {
                ScopeExtKt.scope(Dispatchers.getMain(), new LocalSportSettingViewModel$readSettingConfig$1$onResult$1(LocalSportSettingViewModel.this, result, callback, null));
            }
        });
    }

    public final void setChildProtectSwitch(final boolean switchOn, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final int i = switchOn ? 1 : 0;
        setSettingItem(0, switchOn ? 1 : 0, new Function1() { // from class: sme
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingViewModel.setChildProtectSwitch$lambda$4(switchOn, this, i, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setMaxSpeedLimit(final int speed, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        setSettingItem(4, speed, new Function1() { // from class: ume
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingViewModel.setMaxSpeedLimit$lambda$5(speed, this, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    private LocalSportSettingViewModel(mcn mcnVar) {
        this.sportDB = mcnVar;
        this.mRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ome
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalSportSettingViewModel.mRequest_delegate$lambda$0();
            }
        });
        this.mSettingList = new fs9[0];
        this.maxSpeedRange = CollectionsKt___CollectionsKt.toList(new IntRange(0, 14));
    }
}

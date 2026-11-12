package com.xiaomi.fitness.sport_manager.state;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.state.AccessoriesState;
import com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import defpackage.ed2;
import defpackage.f2o;
import defpackage.fv2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ)\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020(0'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010&J\u001f\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00100,j\b\u0012\u0004\u0012\u00020\u0010`-H\u0016¢\u0006\u0004\b.\u0010/R2\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020(00j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020(`18\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R&\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00100,j\b\u0012\u0004\u0012\u00020\u0010`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/AccessoriesState;", "Lcom/xiaomi/fitness/sport_manager/state/data/IAccessoriesState;", "", "getAccessoriesMap", "()V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", "sportRequestData", "buildAccessoryRequestData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;)Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", "", DailyRecordKey.sportType, "", "isNotSupportBean", "(I)Z", "isLocalSport", "()Z", "", "did", "Led2;", "getAccessorySportState", "(Ljava/lang/String;)Led2;", "getBeanAccessory", "()Led2;", "isBeanConnect", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "callback", "startAccessoriesSport", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "pauseAccessoriesSport", "(ILcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "resumeAccessoriesSport", "finishAccessoriesSport", "restartAccessoriesSport", "(Ljava/lang/String;ILcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "sportLaunchType", "passiveNotifySportState", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;I)V", "accessoriesRemove", "(Ljava/lang/String;)V", "", "Lfv2;", "accessoriesGet", "()Ljava/util/Map;", "switchMode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSwitchModeList", "()Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "accessoriesMap", "Ljava/util/HashMap;", "Landroid/os/Handler;", "handeler", "Landroid/os/Handler;", "accessoryDid", "Ljava/lang/String;", "switchDidList", "Ljava/util/ArrayList;", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAccessoriesState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessoriesState.kt\ncom/xiaomi/fitness/sport_manager/state/AccessoriesState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n774#2:212\n865#2,2:213\n*S KotlinDebug\n*F\n+ 1 AccessoriesState.kt\ncom/xiaomi/fitness/sport_manager/state/AccessoriesState\n*L\n40#1:212\n40#1:213,2\n*E\n"})
public final class AccessoriesState implements IAccessoriesState {

    @NotNull
    private static final String TAG = "AccessoriesState";

    @NotNull
    private HashMap<String, fv2> accessoriesMap = new HashMap<>();

    @NotNull
    private final Handler handeler = new Handler(Looper.getMainLooper());

    @NotNull
    private String accessoryDid = "";

    @NotNull
    private ArrayList<String> switchDidList = new ArrayList<>();

    private final SportRequestData buildAccessoryRequestData(SportRequestData sportRequestData) {
        SportRequestData sportRequestDataO = new SportRequestData.a().z(sportRequestData.sportType).C(sportRequestData.timeStamp).E(sportRequestData.timeZone).x(sportRequestData.sportState).H(sportRequestData.accessoryWearMode).t(true).o();
        Intrinsics.checkNotNullExpressionValue(sportRequestDataO, "build(...)");
        return sportRequestDataO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishAccessoriesSport$lambda$2(AccessoriesState this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.accessoriesMap.clear();
        this$0.switchDidList.clear();
    }

    private final void getAccessoriesMap() {
        List<WearableDeviceModel> acessoryDeviceModels = SportDeviceModel.INSTANCE.getAcessoryDeviceModels();
        FitnessLogUtils.d(TAG, "models:" + acessoryDeviceModels);
        for (WearableDeviceModel wearableDeviceModel : acessoryDeviceModels) {
            if (this.accessoriesMap.get(wearableDeviceModel.getDid()) == null && wearableDeviceModel.getIsDeviceConnected()) {
                FitnessLogUtils.d(TAG, "add deviceModel , did:" + wearableDeviceModel.getDid());
                this.accessoriesMap.put(wearableDeviceModel.getDid(), new fv2(wearableDeviceModel));
            }
        }
    }

    private final boolean isLocalSport() {
        return f2o.x().t() == 7 || f2o.x().t() == 6;
    }

    private final boolean isNotSupportBean(int sportType) {
        return isLocalSport() || sportType == 810 || sportType == 812;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit restartAccessoriesSport$lambda$3() {
        FitnessLogUtils.i(TAG, "sport map not has the did");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesSport
    @NotNull
    public Map<String, fv2> accessoriesGet() {
        return this.accessoriesMap;
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesSport
    public void accessoriesRemove(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(TAG, "accessoriesRemove , did:" + did);
        this.accessoriesMap.remove(did);
        if (SportDeviceModel.INSTANCE.getAcessoryDeviceModels().isEmpty()) {
            f2o.x().s0(0);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public void finishAccessoriesSport(int sportType, @Nullable SportRequestCallback callback) {
        fv2 fv2Var;
        if (isNotSupportBean(sportType)) {
            return;
        }
        for (String str : this.accessoriesMap.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            String str2 = str;
            FitnessLogUtils.i(TAG, "finishAccessoriesSport , did:" + str2);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(this.accessoryDid);
            if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && (fv2Var = this.accessoriesMap.get(str2)) != null) {
                fv2Var.d(sportType, SportDeviceModel.INSTANCE.getDeviceModelByDid(str2), null);
            }
        }
        this.handeler.postDelayed(new Runnable() { // from class: s80
            @Override // java.lang.Runnable
            public final void run() {
                AccessoriesState.finishAccessoriesSport$lambda$2(this.f33387a);
            }
        }, 1000L);
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    @Nullable
    public ed2 getAccessorySportState(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return this.accessoriesMap.get(did);
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    @Nullable
    public ed2 getBeanAccessory() {
        List<WearableDeviceModel> accessoryDeviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : accessoryDeviceModels) {
            if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryMode(((WearableDeviceModel) obj).getDid()) == 1) {
                arrayList.add(obj);
            }
        }
        String did = ((WearableDeviceModel) CollectionsKt___CollectionsKt.first((List) arrayList)).getDid();
        if (this.accessoriesMap.get(did) == null) {
            return null;
        }
        fv2 fv2Var = this.accessoriesMap.get(did);
        Intrinsics.checkNotNull(fv2Var, "null cannot be cast to non-null type com.xiaomi.fitness.sport_manager.state.BaseSportState");
        return fv2Var;
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesSport
    @NotNull
    public ArrayList<String> getSwitchModeList() {
        return this.switchDidList;
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public boolean isBeanConnect() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(this.accessoryDid);
        boolean isDeviceConnected = wearableDeviceModel != null ? wearableDeviceModel.getIsDeviceConnected() : false;
        FitnessLogUtils.i(TAG, "accessoryConnect:" + isDeviceConnected);
        return isDeviceConnected;
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public void passiveNotifySportState(@NotNull SportRequestData sportRequestData, int sportLaunchType) {
        Intrinsics.checkNotNullParameter(sportRequestData, "sportRequestData");
        FitnessLogUtils.i(TAG, "sportLaunchType:" + sportLaunchType + " , sportState:" + sportRequestData.sportState);
        if (sportLaunchType == 1 || isLocalSport()) {
            return;
        }
        int i = sportRequestData.sportState;
        if (i == 1) {
            startAccessoriesSport(buildAccessoryRequestData(sportRequestData), null);
            return;
        }
        if (i == 2) {
            pauseAccessoriesSport(sportRequestData.sportType, null);
        } else if (i == 3) {
            resumeAccessoriesSport(sportRequestData.sportType, null);
        } else {
            if (i != 4) {
                return;
            }
            finishAccessoriesSport(sportRequestData.sportType, null);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public void pauseAccessoriesSport(int sportType, @Nullable SportRequestCallback callback) {
        if (isNotSupportBean(sportType)) {
            return;
        }
        for (String str : this.accessoriesMap.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            String str2 = str;
            FitnessLogUtils.i(TAG, "pauseAccessoriesSport , did:" + str2);
            fv2 fv2Var = this.accessoriesMap.get(str2);
            if (fv2Var != null) {
                fv2Var.f(sportType, SportDeviceModel.INSTANCE.getDeviceModelByDid(str2), null);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public void restartAccessoriesSport(@NotNull String did, int sportType, @Nullable SportRequestCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (isNotSupportBean(sportType)) {
            return;
        }
        getAccessoriesMap();
        FitnessLogUtils.i(TAG, "restartAccessoriesSport , did:" + did);
        fv2 fv2Var = this.accessoriesMap.get(did);
        if (fv2Var != null) {
            fv2Var.h(sportType, SportDeviceModel.INSTANCE.getDeviceModelByDid(did), null);
        } else {
            new Function0() { // from class: t80
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccessoriesState.restartAccessoriesSport$lambda$3();
                }
            };
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public void resumeAccessoriesSport(int sportType, @Nullable SportRequestCallback callback) {
        if (isNotSupportBean(sportType)) {
            return;
        }
        for (String str : this.accessoriesMap.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            String str2 = str;
            FitnessLogUtils.i(TAG, "resumeAccessoriesSport , did:" + str2);
            fv2 fv2Var = this.accessoriesMap.get(str2);
            if (fv2Var != null) {
                fv2Var.a(sportType, SportDeviceModel.INSTANCE.getDeviceModelByDid(str2), null);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState
    public void startAccessoriesSport(@NotNull SportRequestData sportRequestData, @Nullable SportRequestCallback callback) {
        Intrinsics.checkNotNullParameter(sportRequestData, "sportRequestData");
        if (isNotSupportBean(sportRequestData.sportType)) {
            return;
        }
        getAccessoriesMap();
        SportRequestData sportRequestDataBuildAccessoryRequestData = buildAccessoryRequestData(sportRequestData);
        for (String str : this.accessoriesMap.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            String str2 = str;
            FitnessLogUtils.i(TAG, "startAccessoriesSport , did:" + str2);
            this.accessoryDid = str2;
            fv2 fv2Var = this.accessoriesMap.get(str2);
            if (fv2Var != null) {
                fv2Var.e(sportRequestDataBuildAccessoryRequestData, SportDeviceModel.INSTANCE.getDeviceModelByDid(str2), callback);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.state.data.IAccessoriesSport
    public void switchMode(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.switchDidList.add(did);
    }
}

package com.xiaomi.hm.health.device.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import com.xiaomi.hm.health.device.repos.OnSaveCallback;
import com.xiaomi.hm.health.device.repos.SportSortRepositoryKt;
import com.xiaomi.hm.health.device.viewmodel.SportSortViewModel;
import com.xiaomi.hm.health.utils.KongmingAnalytics;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0002R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u001b\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002030*8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.RI\u0010?\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u0006 :*\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u000108j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`908j\b\u0012\u0004\u0012\u00020\u0006`9078\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/device/viewmodel/SportSortViewModel;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "", "isEdited", "", "from", "to", "drop", "isNoneHidden", "position", "isDivider", "getSize", "getItem", "getType", "showNum", "isHidden", "isOneVisible", "exit", "saveSportTypeConfig", "enable", "updateBtStatusEnable", "clear", "a", LogUtil.I, "dividerIndex", "b", "Z", "edited", "Lio/reactivex/disposables/CompositeDisposable;", "c", "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "e", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Landroidx/lifecycle/MutableLiveData;", "f", "Landroidx/lifecycle/MutableLiveData;", "getSaveState", "()Landroidx/lifecycle/MutableLiveData;", "saveState", "g", "getBtStatusEnable", "btStatusEnable", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "h", "getSportTypeConfigDevice", "sportTypeConfigDevice", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "i", "Landroidx/lifecycle/LiveData;", "getSportTypeList", "()Landroidx/lifecycle/LiveData;", "sportTypeList", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportSortViewModel implements KoinComponent {
    public static final int MAX_VISIBLE_SIZE = 11;
    public static final int SAVE_STATE_DEFAULT = -1;
    public static final int SAVE_STATE_EXIT = 3;
    public static final int SAVE_STATE_FAIL = 2;
    public static final int SAVE_STATE_START = 0;
    public static final int SAVE_STATE_SUCCESS = 1;
    public static final int SPORT_ITEM_HIDDEN = 0;
    public static final int SPORT_ITEM_VISIBLE = 1;

    @NotNull
    private static final String j = "SportSortViewModel";
    private static final int k = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int dividerIndex = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean edited;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CompositeDisposable disposable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> saveState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> btStatusEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SportTypeConfig> sportTypeConfigDevice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ArrayList<Integer>> sportTypeList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "configDevice is null";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportSortViewModel() {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.disposable = compositeDisposable;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = null == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.viewmodel.SportSortViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        HMDeviceSource boundDeviceSource = b().getBoundDeviceSource(HMDeviceType.MILI);
        this.deviceSource = boundDeviceSource;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(-1);
        Unit unit = Unit.INSTANCE;
        this.saveState = mutableLiveData;
        this.btStatusEnable = new MutableLiveData<>(Boolean.TRUE);
        MutableLiveData<SportTypeConfig> mutableLiveData2 = new MutableLiveData<>();
        SportSortRepositoryKt.updateSportTypeConfig(boundDeviceSource.getType(), compositeDisposable, mutableLiveData2);
        this.sportTypeConfigDevice = mutableLiveData2;
        this.sportTypeList = Transformations.switchMap(mutableLiveData2, new Function() { // from class: wc7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SportSortViewModel.c(this.a, (SportTypeConfig) obj);
            }
        });
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(SportSortViewModel sportSortViewModel, SportTypeConfig sportTypeConfig) {
        ArrayList arrayList = new ArrayList();
        int size = sportTypeConfig.getList().size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                SportTypeItem sportTypeItem = sportTypeConfig.getList().get(i);
                if (sportSortViewModel.dividerIndex == i) {
                    arrayList.add(-1);
                }
                if (sportSortViewModel.dividerIndex == -1 && !sportTypeItem.visible()) {
                    sportSortViewModel.dividerIndex = i;
                    arrayList.add(-1);
                }
                arrayList.add(Integer.valueOf(sportTypeItem.getType()));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        if (sportSortViewModel.dividerIndex == arrayList.size()) {
            arrayList.add(-1);
        }
        if (sportSortViewModel.dividerIndex == -1) {
            sportSortViewModel.dividerIndex = arrayList.size();
            arrayList.add(-1);
        }
        return new MutableLiveData(arrayList);
    }

    private final void d() {
        if (this.sportTypeConfigDevice.getValue() != null) {
            return;
        }
        SportSortRepositoryKt.updateSportTypeConfig(this.deviceSource.getType(), this.disposable, this.sportTypeConfigDevice);
    }

    public final void clear() {
        this.disposable.clear();
    }

    public final void drop(int from, int to) {
        SportTypeConfig value = this.sportTypeConfigDevice.getValue();
        if (value == null) {
            return;
        }
        this.edited = true;
        int i = this.dividerIndex;
        if (from <= i || to <= i) {
            if (to <= i && i < from) {
                from--;
                this.dividerIndex = i + 1;
            } else {
                if (from + 1 <= i && i <= to) {
                    to--;
                    this.dividerIndex = i - 1;
                }
            }
        } else {
            from--;
            to--;
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) value.getList());
        mutableList.add(to, mutableList.remove(from));
        this.sportTypeConfigDevice.postValue(new SportTypeConfig(mutableList, value.getSupportSort(), value.getSupportItemDataSetting()));
    }

    public final void exit() {
        this.saveState.setValue(3);
    }

    @NotNull
    public final MutableLiveData<Boolean> getBtStatusEnable() {
        return this.btStatusEnable;
    }

    public final int getItem(int position) {
        ArrayList<Integer> value = this.sportTypeList.getValue();
        if (value != null) {
            return value.get(position).intValue();
        }
        return -1;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Integer> getSaveState() {
        return this.saveState;
    }

    public final int getSize() {
        ArrayList<Integer> value = this.sportTypeList.getValue();
        if (value == null) {
            return 0;
        }
        return value.size();
    }

    @NotNull
    public final MutableLiveData<SportTypeConfig> getSportTypeConfigDevice() {
        return this.sportTypeConfigDevice;
    }

    @NotNull
    public final LiveData<ArrayList<Integer>> getSportTypeList() {
        return this.sportTypeList;
    }

    public final int getType(int position) {
        Integer num;
        ArrayList<Integer> value = this.sportTypeList.getValue();
        if (value == null || (num = value.get(position)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final boolean isDivider(int position) {
        return this.dividerIndex == position;
    }

    /* JADX INFO: renamed from: isEdited, reason: from getter */
    public final boolean getEdited() {
        return this.edited;
    }

    public final boolean isHidden(int position) {
        return position > this.dividerIndex;
    }

    public final boolean isNoneHidden() {
        ArrayList<Integer> value = this.sportTypeList.getValue();
        Integer numValueOf = value == null ? null : Integer.valueOf(value.indexOf(-1));
        ArrayList<Integer> value2 = this.sportTypeList.getValue();
        return Intrinsics.areEqual(numValueOf, value2 != null ? Integer.valueOf(CollectionsKt__CollectionsKt.getLastIndex(value2)) : null);
    }

    public final boolean isOneVisible(int position) {
        return this.dividerIndex == 1 && position == 0;
    }

    public final void saveSportTypeConfig() {
        this.saveState.setValue(0);
        SportTypeConfig value = this.sportTypeConfigDevice.getValue();
        if (value == null) {
            HMLog.info(j, a.a);
            this.saveState.setValue(2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = value.getList().size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(new SportTypeItem(value.getList().get(i).getType(), i < this.dividerIndex ? 1 : 0));
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        SportSortRepositoryKt.setSportTypeConfig(this.deviceSource.getType(), this.disposable, new SportTypeConfig(arrayList, value.getSupportSort(), value.getSupportItemDataSetting()), new OnSaveCallback() { // from class: com.xiaomi.hm.health.device.viewmodel.SportSortViewModel.saveSportTypeConfig.2
            @Override // com.xiaomi.hm.health.device.repos.OnSaveCallback
            public void onResult(boolean result) {
                SportSortViewModel.this.getSaveState().setValue(result ? 1 : 2);
            }
        });
        KongmingAnalytics.kongmingSportSetNumAnalytics();
    }

    /* JADX INFO: renamed from: showNum, reason: from getter */
    public final int getDividerIndex() {
        return this.dividerIndex;
    }

    public final void updateBtStatusEnable(boolean enable) {
        this.btStatusEnable.setValue(Boolean.valueOf(enable));
        if (enable) {
            d();
        }
    }
}

package com.xiaomi.fitness.devicesettings.huami.typesort;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import com.xiaomi.onetrack.c.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0006\u0010!\u001a\u00020\"J\u0014\u0010&\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u0014\u0010*\u001a\u00020\"2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0012\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R'\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b$\u0010\u001f¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mConfig", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "getMConfig", "()Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "setMConfig", "(Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;)V", "mItemComparator", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortViewModel$ItemComparator;", "getMItemComparator", "()Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortViewModel$ItemComparator;", "mItemComparator$delegate", "Lkotlin/Lazy;", "mOriginDataList", "", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortBean;", "getMOriginDataList", "()Ljava/util/List;", "setMOriginDataList", "(Ljava/util/List;)V", "isListChanged", "", "list", "getHuamiApiCaller", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "loadRet", "Landroidx/lifecycle/MutableLiveData;", "getLoadRet", "()Landroidx/lifecycle/MutableLiveData;", "loadRet$delegate", "loadSportTypeConfig", "", "setRet", "getSetRet", "setRet$delegate", "setSportTypeSort", "sportTypeList", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "setOriginList", "buildDataList", q.f13857a, "attach", "savedInstanceState", "Landroid/os/Bundle;", "ItemComparator", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTypeSortViewModel extends AbsViewModel {

    @Nullable
    private SportTypeConfig mConfig;

    @Nullable
    private List<SportTypeSortBean> mOriginDataList;

    /* JADX INFO: renamed from: mItemComparator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mItemComparator = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l5o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportTypeSortViewModel.mItemComparator_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: loadRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m5o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportTypeSortViewModel.loadRet_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: setRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n5o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportTypeSortViewModel.setRet_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortViewModel$ItemComparator;", "Lkotlin/Comparator;", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortBean;", "Ljava/util/Comparator;", "<init>", "()V", "compare", "", "o1", "o2", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemComparator implements Comparator<SportTypeSortBean> {
        @Override // java.util.Comparator
        public int compare(@Nullable SportTypeSortBean o1, @Nullable SportTypeSortBean o2) {
            if (o1 == null || o2 == null) {
                return 0;
            }
            if (o1.getType() == 2) {
                return -1;
            }
            if (o2.getType() == 2) {
                return 1;
            }
            if (o1.getType() == 0) {
                return o2.getSportTypeSort().visible() ? 1 : -1;
            }
            if (o2.getType() == 0) {
                return o1.getSportTypeSort().visible() ? -1 : 1;
            }
            if (o1.getSportTypeSort().visible() && o2.getSportTypeSort().visible()) {
                return 0;
            }
            if (o1.getSportTypeSort().visible()) {
                return -1;
            }
            if (o2.getSportTypeSort().visible()) {
                return 1;
            }
            return o1.getTargetIndex() - o2.getTargetIndex();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$loadSportTypeConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$loadSportTypeConfig$1", f = "SportTypeSortViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$loadSportTypeConfig$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$loadSportTypeConfig$1$1", f = "SportTypeSortViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SportTypeSortViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05061(SportTypeSortViewModel sportTypeSortViewModel, Continuation<? super C05061> continuation) {
                super(2, continuation);
                this.this$0 = sportTypeSortViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05061(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huamiApiCaller = this.this$0.getHuamiApiCaller();
                SportTypeConfig sportTypeConfig = huamiApiCaller != null ? huamiApiCaller.getSportTypeConfig() : null;
                this.this$0.setMConfig(sportTypeConfig);
                SportTypeConfig mConfig = this.this$0.getMConfig();
                Logger.d("SportTypeSort " + (mConfig != null ? mConfig.getList() : null), new Object[0]);
                if (sportTypeConfig != null) {
                    this.this$0.getLoadRet().postValue(this.this$0.buildDataList(sportTypeConfig));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportTypeSortViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05061 c05061 = new C05061(SportTypeSortViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05061, this) == coroutine_suspended) {
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
    public final List<SportTypeSortBean> buildDataList(SportTypeConfig config) {
        Product product;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsPanGu = (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? false : DeviceModelExtKt.isPanGu(product);
        ArrayList arrayList = new ArrayList();
        for (SportTypeItem sportTypeItem : config.getList()) {
            arrayList.add(new SportTypeSortBean(sportTypeItem.visible() ? 1 : 3, sportTypeItem, zIsPanGu));
        }
        arrayList.add(new SportTypeSortBean(2, new SportTypeItem(-1, 0), zIsPanGu));
        arrayList.add(new SportTypeSortBean(0, new SportTypeItem(-1, 0), zIsPanGu));
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, getMItemComparator());
        setOriginList(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HuamiApiCaller getHuamiApiCaller() {
        String mac;
        WearableDeviceInfo deviceInfo;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (mac = deviceInfo.getMac()) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemComparator mItemComparator_delegate$lambda$0() {
        return new ItemComparator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setRet_delegate$lambda$2() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<List<SportTypeSortBean>> getLoadRet() {
        return (MutableLiveData) this.loadRet.getValue();
    }

    @Nullable
    public final SportTypeConfig getMConfig() {
        return this.mConfig;
    }

    @NotNull
    public final ItemComparator getMItemComparator() {
        return (ItemComparator) this.mItemComparator.getValue();
    }

    @Nullable
    public final List<SportTypeSortBean> getMOriginDataList() {
        return this.mOriginDataList;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetRet() {
        return (MutableLiveData) this.setRet.getValue();
    }

    public final boolean isListChanged(@NotNull List<SportTypeSortBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return !Intrinsics.areEqual(this.mOriginDataList, list);
    }

    public final void loadSportTypeConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setMConfig(@Nullable SportTypeConfig sportTypeConfig) {
        this.mConfig = sportTypeConfig;
    }

    public final void setMOriginDataList(@Nullable List<SportTypeSortBean> list) {
        this.mOriginDataList = list;
    }

    public final void setOriginList(@NotNull List<SportTypeSortBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Gson gson = new Gson();
        this.mOriginDataList = (List) gson.fromJson(gson.toJson(list), new TypeToken<List<SportTypeSortBean>>() { // from class: com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel.setOriginList.1
        }.getType());
    }

    public final void setSportTypeSort(@NotNull List<SportTypeItem> sportTypeList) {
        Intrinsics.checkNotNullParameter(sportTypeList, "sportTypeList");
        SportTypeConfig sportTypeConfig = this.mConfig;
        if (sportTypeConfig != null) {
            Logger.i("SportTypeSort set sportTypeList size is " + sportTypeList.size(), new Object[0]);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SportTypeSortViewModel$setSportTypeSort$1$1(this, new SportTypeConfig(sportTypeList, sportTypeConfig.getSupportSort(), sportTypeConfig.getSupportItemDataSetting()), null), 3, null);
        }
    }
}

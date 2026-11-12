package com.xiaomi.fitness.devicesettings.huami.appsort;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel;
import com.xiaomi.fitness.devicesettings.utils.LanguageHelper;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AppSort;
import com.xiaomi.fitness.settingitem.settingitem.AppSortItem;
import defpackage.h4b;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0002J\u001c\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bJ\b\u0010 \u001a\u00020\u001cH\u0002J\u0014\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0012\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001e\u0010\u0016¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "itemComparator", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel$ItemComparator;", "getItemComparator", "()Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel$ItemComparator;", "itemComparator$delegate", "Lkotlin/Lazy;", "mFilteredDataList", "", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "loadData", "", "getDefaultAppSortList", "getAppList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;", "getGetAppList", "()Landroidx/lifecycle/MutableLiveData;", "getAppList$delegate", "showAppSortList", "list", "mergeFilteredList", "isListChanged", "", "setAppSortApp", "getSetAppSortApp", "setAppSortApp$delegate", "isDeviceConnected", "filterDataListIfNecessary", "appSortBeans", "attach", "savedInstanceState", "Landroid/os/Bundle;", "ItemComparator", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuaMiAppSortViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiAppSortViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1863#2,2:178\n*S KotlinDebug\n*F\n+ 1 HuaMiAppSortViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel\n*L\n67#1:178,2\n*E\n"})
public final class HuaMiAppSortViewModel extends AbsViewModel {

    @Nullable
    private WearableDeviceModel deviceModel;

    /* JADX INFO: renamed from: itemComparator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy itemComparator = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vhc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiAppSortViewModel.itemComparator_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<HuaMiAppSortBean> mFilteredDataList = new ArrayList();

    /* JADX INFO: renamed from: getAppList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getAppList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: whc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiAppSortViewModel.getAppList_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: setAppSortApp$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setAppSortApp = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xhc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiAppSortViewModel.setAppSortApp_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel$ItemComparator;", "Lkotlin/Comparator;", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean;", "Ljava/util/Comparator;", "<init>", "()V", "compare", "", "o1", "o2", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemComparator implements Comparator<HuaMiAppSortBean> {
        @Override // java.util.Comparator
        public int compare(@Nullable HuaMiAppSortBean o1, @Nullable HuaMiAppSortBean o2) {
            if (o1 == null || o2 == null) {
                return 0;
            }
            if (o1.getType() == 2) {
                return (!o2.getAppItem().getEnable() || o2.getAppItem().getParentType() == 7) ? -1 : 1;
            }
            if (o2.getType() == 2) {
                return (!o1.getAppItem().getEnable() || o1.getAppItem().getParentType() == 7) ? 1 : -1;
            }
            if (o1.getType() == 0) {
                return o2.getAppItem().getEnable() ? 1 : -1;
            }
            if (o2.getType() == 0) {
                return o1.getAppItem().getEnable() ? -1 : 1;
            }
            if (o1.getAppItem().getEnable() && o2.getAppItem().getEnable()) {
                return 0;
            }
            if (o1.getAppItem().getEnable()) {
                return -1;
            }
            if (o2.getAppItem().getEnable()) {
                return 1;
            }
            return o1.getAppItem().getIndex() - o2.getAppItem().getIndex();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$loadData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$loadData$1", f = "HuaMiAppSortViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$loadData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$loadData$1$1", f = "HuaMiAppSortViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HuaMiAppSortViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04991(HuaMiAppSortViewModel huaMiAppSortViewModel, Continuation<? super C04991> continuation) {
                super(2, continuation);
                this.this$0 = huaMiAppSortViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04991(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
                if (wearableDeviceModel != null) {
                    HuaMiAppSortViewModel huaMiAppSortViewModel = this.this$0;
                    Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDeviceInfo().getDid(), DeviceSettingConfigKey.KEY_APPSORT).valueToObject(AppSort.class);
                    AppSort appSort = objValueToObject instanceof AppSort ? (AppSort) objValueToObject : null;
                    Logger.i("HuaMiAppSortViewModel", "loadData " + appSort);
                    if (appSort != null) {
                        List<AppSortItem> appsort = appSort.getAppsort();
                        Intrinsics.checkNotNullExpressionValue(appsort, "getAppsort(...)");
                        huaMiAppSortViewModel.showAppSortList(appsort);
                    } else {
                        huaMiAppSortViewModel.getDefaultAppSortList();
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuaMiAppSortViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04991 c04991 = new C04991(HuaMiAppSortViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04991, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$setAppSortApp$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$setAppSortApp$4", f = "HuaMiAppSortViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $apiCaller;
        final /* synthetic */ List<AppSortItem> $list;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$setAppSortApp$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortViewModel$setAppSortApp$4$1", f = "HuaMiAppSortViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HuamiApiCaller $apiCaller;
            final /* synthetic */ List<AppSortItem> $list;
            int label;
            final /* synthetic */ HuaMiAppSortViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HuaMiAppSortViewModel huaMiAppSortViewModel, HuamiApiCaller huamiApiCaller, List<AppSortItem> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = huaMiAppSortViewModel;
                this.$apiCaller = huamiApiCaller;
                this.$list = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$apiCaller, this.$list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
                Intrinsics.checkNotNull(wearableDeviceModel);
                Boolean boolBoxBoolean = null;
                if (DeviceModelExtKt.isPanGu(wearableDeviceModel.getProduct())) {
                    HuamiApiCaller huamiApiCaller = this.$apiCaller;
                    if (huamiApiCaller != null) {
                        List<AppSortItem> list = this.$list;
                        WearableDeviceModel wearableDeviceModel2 = this.this$0.deviceModel;
                        Intrinsics.checkNotNull(wearableDeviceModel2);
                        boolBoxBoolean = Boxing.boxBoolean(huamiApiCaller.setAppSort(HuamiAppSortHelperKt.convert2AppItemUnderPangu(list, wearableDeviceModel2)));
                    }
                } else {
                    WearableDeviceModel wearableDeviceModel3 = this.this$0.deviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel3);
                    if (DeviceModelExtKt.isKongMing(wearableDeviceModel3.getProduct())) {
                        HuamiApiCaller huamiApiCaller2 = this.$apiCaller;
                        if (huamiApiCaller2 != null) {
                            boolBoxBoolean = Boxing.boxBoolean(huamiApiCaller2.setAppSort(HuamiAppSortHelperKt.convertAppSortItemToAppItem(this.$list)));
                        }
                    } else {
                        HuamiApiCaller huamiApiCaller3 = this.$apiCaller;
                        if (huamiApiCaller3 != null) {
                            List<AppSortItem> list2 = this.$list;
                            WearableDeviceModel wearableDeviceModel4 = this.this$0.deviceModel;
                            Intrinsics.checkNotNull(wearableDeviceModel4);
                            boolBoxBoolean = Boxing.boxBoolean(huamiApiCaller3.setDisplayListSync(1, HuamiAppSortHelperKt.convertAppItem2DisplayBean(list2, wearableDeviceModel4)));
                        }
                    }
                }
                Logger.i("HuaMiAppSortViewModel", "setAppSortApp: " + boolBoxBoolean);
                if (boolBoxBoolean == null || !boolBoxBoolean.booleanValue() || this.this$0.deviceModel == null) {
                    this.this$0.getSetAppSortApp().postValue(Boxing.boxBoolean(false));
                } else {
                    AppSort appSort = new AppSort();
                    appSort.setAppsort(this.$list);
                    DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                    WearableDeviceModel wearableDeviceModel5 = this.this$0.deviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel5);
                    companion.sendSettingItem(wearableDeviceModel5.getDeviceInfo().getDid(), DeviceSettingConfigKey.KEY_APPSORT, appSort);
                    this.this$0.getSetAppSortApp().postValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HuamiApiCaller huamiApiCaller, List<AppSortItem> list, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$apiCaller = huamiApiCaller;
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuaMiAppSortViewModel.this.new AnonymousClass4(this.$apiCaller, this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HuaMiAppSortViewModel.this, this.$apiCaller, this.$list, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData getAppList_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getDefaultAppSortList() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null) {
            return;
        }
        Intrinsics.checkNotNull(wearableDeviceModel);
        List<AppSortItem> appsort = HuamiAppSortHelperKt.getDefaultAppSort(wearableDeviceModel).getAppsort();
        Intrinsics.checkNotNullExpressionValue(appsort, "getAppsort(...)");
        showAppSortList(appsort);
    }

    private final boolean isDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            return true;
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.u);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemComparator itemComparator_delegate$lambda$0() {
        return new ItemComparator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setAppSortApp_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAppSortList(List<AppSortItem> list) {
        Logger.i("showAppSortList:" + h4b.c(list), new Object[0]);
        getGetAppList().postValue(list);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void filterDataListIfNecessary(@NotNull List<HuaMiAppSortBean> appSortBeans) {
        Intrinsics.checkNotNullParameter(appSortBeans, "appSortBeans");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (DeviceModelExtKt.isKongMing(wearableDeviceModel.getProduct())) {
                return;
            }
            this.mFilteredDataList.clear();
            Iterator<HuaMiAppSortBean> it = appSortBeans.iterator();
            while (it.hasNext()) {
                HuaMiAppSortBean next = it.next();
                int type = next.getAppItem().getType();
                if (type == 32) {
                    LanguageHelper languageHelper = LanguageHelper.INSTANCE;
                    WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel2);
                    if (!languageHelper.isCurrentLanguageInChina(wearableDeviceModel2.getDeviceInfo().getDid())) {
                        it.remove();
                        this.mFilteredDataList.add(next);
                    }
                } else if (type == 56) {
                    WearableDeviceModel wearableDeviceModel3 = this.deviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel3);
                    HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel3);
                    Boolean boolValueOf = huamiDevice != null ? Boolean.valueOf(huamiDevice.hasSoftwareFeature(43)) : null;
                    Intrinsics.checkNotNull(boolValueOf);
                    if (!boolValueOf.booleanValue()) {
                        WearableDeviceModel wearableDeviceModel4 = this.deviceModel;
                        Intrinsics.checkNotNull(wearableDeviceModel4);
                        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isL66(wearableDeviceModel4)) {
                            it.remove();
                            this.mFilteredDataList.add(next);
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final MutableLiveData<List<AppSortItem>> getGetAppList() {
        return (MutableLiveData) this.getAppList.getValue();
    }

    @NotNull
    public final ItemComparator getItemComparator() {
        return (ItemComparator) this.itemComparator.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetAppSortApp() {
        return (MutableLiveData) this.setAppSortApp.getValue();
    }

    public final void loadData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void mergeFilteredList(@NotNull List<HuaMiAppSortBean> list, boolean isListChanged) {
        Product product;
        Intrinsics.checkNotNullParameter(list, "list");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null && (product = wearableDeviceModel.getProduct()) != null && !DeviceModelExtKt.isKongMing(product)) {
            for (HuaMiAppSortBean huaMiAppSortBean : this.mFilteredDataList) {
                if (huaMiAppSortBean.getAppItem().getType() == 32) {
                    if (isListChanged) {
                        huaMiAppSortBean.getAppItem().setEnable(false);
                    }
                    list.add(huaMiAppSortBean);
                } else {
                    list.add(huaMiAppSortBean);
                }
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(list, getItemComparator());
    }

    public final void setAppSortApp(@NotNull List<AppSortItem> list) {
        WearableDeviceModel wearableDeviceModel;
        Intrinsics.checkNotNullParameter(list, "list");
        if (!isDeviceConnected() || (wearableDeviceModel = this.deviceModel) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass4(wearableDeviceModel != null ? com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel) : null, list, null), 3, null);
    }
}

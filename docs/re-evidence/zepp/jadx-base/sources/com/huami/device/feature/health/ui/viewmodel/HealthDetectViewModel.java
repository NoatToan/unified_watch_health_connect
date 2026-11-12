package com.huami.device.feature.health.ui.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.HealthUi;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.settings.AtrialSetting;
import com.huami.device.feature.health.settings.AtrialSleepNotDisturbSetting;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.LowHrAlertSetting;
import com.huami.device.feature.health.settings.LowSpo2AlertSetting;
import com.huami.device.feature.health.settings.OsaSetting;
import com.huami.device.feature.health.settings.PressureAlertSetting;
import com.huami.device.feature.health.settings.PressureSetting;
import com.huami.device.feature.health.settings.RemSetting;
import com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting;
import com.huami.device.feature.health.settings.SmartSpo2Setting;
import com.huami.device.feature.health.settings.SportHrSetting;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.TitleItem;
import com.huami.device.feature.health.ui.item.ViewItem;
import com.huami.device.feature.health.ui.item.health.AtrialSettingItem;
import com.huami.device.feature.health.ui.item.health.AtrialSleepNotDisturbSettingItem;
import com.huami.device.feature.health.ui.item.health.BloodPressureSettingItem;
import com.huami.device.feature.health.ui.item.health.HighHrAlertSettingItem;
import com.huami.device.feature.health.ui.item.health.HrIntervalSettingItem;
import com.huami.device.feature.health.ui.item.health.LowHrAlertSettingItem;
import com.huami.device.feature.health.ui.item.health.LowSpo2AlertSettingItem;
import com.huami.device.feature.health.ui.item.health.OsaSettingItem;
import com.huami.device.feature.health.ui.item.health.PressureAlertSettingItem;
import com.huami.device.feature.health.ui.item.health.PressureSettingItem;
import com.huami.device.feature.health.ui.item.health.RemSettingItem;
import com.huami.device.feature.health.ui.item.health.SleepingBloodPressureMonitorItem;
import com.huami.device.feature.health.ui.item.health.SmartSpo2SettingItem;
import com.huami.device.feature.health.ui.item.health.SportHrSettingItem;
import com.huami.device.feature.health.ui.model.SettingStatus;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.health.util.LiveDataExtKt;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fR\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R \u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R \u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R \u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R \u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R \u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00020!8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/huami/device/feature/health/ui/viewmodel/HealthDetectViewModel;", "Lcom/huami/device/feature/health/ui/viewmodel/BaseHealthViewModel;", "", "Lcom/huami/device/feature/health/device/HealthFunc;", "", "isDeviceEnable", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "f", "", "e", "isSuccess", "c", "Lkotlin/Function0;", "func", "checkBloodPressureStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/device/feature/health/ui/model/SettingStatus;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getBloodPressureStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "bloodPressureStatusLiveData", "Ljava/util/List;", "hrItems", "atrialItems", "g", "sleepItems", "h", "pressureItems", "i", "spo2Items", z.j, "bloodPressureItems", "Landroidx/lifecycle/LiveData;", "Lcom/huami/device/feature/health/ui/item/ViewItem;", hl.k, "Landroidx/lifecycle/LiveData;", "getItems", "()Landroidx/lifecycle/LiveData;", "items", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectViewModel extends BaseHealthViewModel {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SettingStatus> bloodPressureStatusLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> hrItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> atrialItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> sleepItems;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> pressureItems;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> spo2Items;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final List<HealthFunc<?>> bloodPressureItems;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<ViewItem>> items;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.viewmodel.HealthDetectViewModel$checkBloodPressureStatus$1", f = "HealthDetectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Boolean> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthDetectViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthDetectViewModel.this.e();
            HealthDetectViewModel.this.c(this.c.getA().booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.viewmodel.HealthDetectViewModel$finishBloodPressureLoading$1", f = "HealthDetectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthDetectViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthDetectViewModel.this.getBloodPressureStatusLiveData().setValue(this.c ? SettingStatus.Success.INSTANCE : SettingStatus.Fail.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Pair<Boolean, Boolean> pair) {
            return pair.getFirst();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/huami/device/feature/health/user/HealthConfig;", "pair", "", "Lcom/huami/device/feature/health/ui/item/ViewItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Pair<? extends Boolean, ? extends HealthConfig>, List<? extends ViewItem>> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ViewItem> invoke(@NotNull Pair<Boolean, HealthConfig> pair) {
            Boolean first = pair.getFirst();
            ArrayList arrayList = new ArrayList();
            HealthDetectViewModel healthDetectViewModel = HealthDetectViewModel.this;
            List listF = healthDetectViewModel.f(healthDetectViewModel.hrItems, first.booleanValue());
            if (!(!listF.isEmpty())) {
                listF = null;
            }
            if (listF != null) {
                arrayList.add(TitleItem.HrTitleItem.INSTANCE);
                arrayList.addAll(listF);
            }
            HealthDetectViewModel healthDetectViewModel2 = HealthDetectViewModel.this;
            List listF2 = healthDetectViewModel2.f(healthDetectViewModel2.atrialItems, first.booleanValue());
            if (!(!listF2.isEmpty())) {
                listF2 = null;
            }
            if (listF2 != null) {
                arrayList.add(TitleItem.AtrialTitleItem.INSTANCE);
                arrayList.addAll(listF2);
            }
            HealthDetectViewModel healthDetectViewModel3 = HealthDetectViewModel.this;
            List listF3 = healthDetectViewModel3.f(healthDetectViewModel3.sleepItems, first.booleanValue());
            if (!(!listF3.isEmpty())) {
                listF3 = null;
            }
            if (listF3 != null) {
                arrayList.add(TitleItem.SleepTitleItem.INSTANCE);
                arrayList.addAll(listF3);
            }
            HealthDetectViewModel healthDetectViewModel4 = HealthDetectViewModel.this;
            List listF4 = healthDetectViewModel4.f(healthDetectViewModel4.pressureItems, first.booleanValue());
            if (!(!listF4.isEmpty())) {
                listF4 = null;
            }
            if (listF4 != null) {
                arrayList.add(TitleItem.PressureTitleItem.INSTANCE);
                arrayList.addAll(listF4);
            }
            HealthDetectViewModel healthDetectViewModel5 = HealthDetectViewModel.this;
            List listF5 = healthDetectViewModel5.f(healthDetectViewModel5.spo2Items, first.booleanValue());
            if (!(!listF5.isEmpty())) {
                listF5 = null;
            }
            if (listF5 != null) {
                arrayList.add(TitleItem.Spo2TitleItem.INSTANCE);
                arrayList.addAll(listF5);
            }
            HealthDetectViewModel healthDetectViewModel6 = HealthDetectViewModel.this;
            List listF6 = healthDetectViewModel6.f(healthDetectViewModel6.bloodPressureItems, first.booleanValue());
            List list = listF6.isEmpty() ^ true ? listF6 : null;
            if (list != null) {
                arrayList.add(TitleItem.BloodPressureTitleItem.INSTANCE);
                arrayList.addAll(list);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.viewmodel.HealthDetectViewModel$showBloodPressureLoading$1", f = "HealthDetectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthDetectViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthDetectViewModel.this.getBloodPressureStatusLiveData().setValue(SettingStatus.Loading.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public HealthDetectViewModel(@NotNull Application application) {
        super(application);
        this.bloodPressureStatusLiveData = new MutableLiveData<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(HealthFunc.HR_INTERVAL.INSTANCE);
        arrayList.add(HealthFunc.HIGH_HR_ALERT.INSTANCE);
        arrayList.add(HealthFunc.LOW_HR_ALERT.INSTANCE);
        arrayList.add(HealthFunc.SPORT_HR.INSTANCE);
        Unit unit = Unit.INSTANCE;
        this.hrItems = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(HealthFunc.ATRIAL.INSTANCE);
        arrayList2.add(HealthFunc.ATRIAL_ALERT_SLEEP_NOT_DISTURB.INSTANCE);
        this.atrialItems = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(HealthFunc.REM.INSTANCE);
        arrayList3.add(HealthFunc.OSA.INSTANCE);
        this.sleepItems = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(HealthFunc.PRESSURE.INSTANCE);
        arrayList4.add(HealthFunc.PRESSURE_ALERT.INSTANCE);
        this.pressureItems = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(HealthFunc.SMART_SPO2.INSTANCE);
        arrayList5.add(HealthFunc.LOW_SPO2_ALERT.INSTANCE);
        this.spo2Items = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(HealthFunc.BLOOD_PRESSURE.INSTANCE);
        arrayList6.add(HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR.INSTANCE);
        this.bloodPressureItems = arrayList6;
        this.items = LiveDataExtKt.syncMap(LiveDataExtKt.combineLatest(LiveDataExtKt.map(LiveDataExtKt.combineLatest(HealthUi.INSTANCE.getDeviceEnableLiveData(), getInvalideLiveData$health_ui_release()), c.a), HealthDetect.INSTANCE.observeHealthConfig()), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean isSuccess) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new b(isSuccess, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SettingItem> f(List<? extends HealthFunc<?>> list, boolean z) {
        SleepingBloodPressureMonitorSetting service;
        ArrayList arrayList = new ArrayList();
        HealthDevice healthDevice = (HealthDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            HealthFunc healthFunc = (HealthFunc) it2.next();
            HealthFunc.ATRIAL atrial = HealthFunc.ATRIAL.INSTANCE;
            if (Intrinsics.areEqual(healthFunc, atrial)) {
                AtrialSetting service2 = atrial.getService();
                if (service2 != null) {
                    arrayList.add(new AtrialSettingItem(service2, healthDevice, z));
                }
            } else {
                HealthFunc.ATRIAL_ALERT_SLEEP_NOT_DISTURB atrial_alert_sleep_not_disturb = HealthFunc.ATRIAL_ALERT_SLEEP_NOT_DISTURB.INSTANCE;
                if (Intrinsics.areEqual(healthFunc, atrial_alert_sleep_not_disturb)) {
                    AtrialSleepNotDisturbSetting service3 = atrial_alert_sleep_not_disturb.getService();
                    if (service3 != null) {
                        arrayList.add(new AtrialSleepNotDisturbSettingItem(service3, healthDevice, z));
                    }
                } else {
                    HealthFunc.HIGH_HR_ALERT high_hr_alert = HealthFunc.HIGH_HR_ALERT.INSTANCE;
                    if (Intrinsics.areEqual(healthFunc, high_hr_alert)) {
                        HighHrAlertSetting service4 = high_hr_alert.getService();
                        if (service4 != null) {
                            arrayList.add(new HighHrAlertSettingItem(service4, healthDevice, z));
                        }
                    } else {
                        HealthFunc.LOW_HR_ALERT low_hr_alert = HealthFunc.LOW_HR_ALERT.INSTANCE;
                        if (Intrinsics.areEqual(healthFunc, low_hr_alert)) {
                            LowHrAlertSetting service5 = low_hr_alert.getService();
                            if (service5 != null) {
                                arrayList.add(new LowHrAlertSettingItem(service5, healthDevice, z));
                            }
                        } else {
                            HealthFunc.HR_INTERVAL hr_interval = HealthFunc.HR_INTERVAL.INSTANCE;
                            if (Intrinsics.areEqual(healthFunc, hr_interval)) {
                                HrIntervalSetting service6 = hr_interval.getService();
                                if (service6 != null) {
                                    if (!(!healthDevice.isForceHrAndRemEnable())) {
                                        service6 = null;
                                    }
                                    if (service6 != null) {
                                        arrayList.add(new HrIntervalSettingItem(service6, healthDevice, z));
                                    }
                                }
                            } else {
                                HealthFunc.LOW_SPO2_ALERT low_spo2_alert = HealthFunc.LOW_SPO2_ALERT.INSTANCE;
                                if (Intrinsics.areEqual(healthFunc, low_spo2_alert)) {
                                    LowSpo2AlertSetting service7 = low_spo2_alert.getService();
                                    if (service7 != null) {
                                        arrayList.add(new LowSpo2AlertSettingItem(service7, healthDevice, z));
                                    }
                                } else {
                                    HealthFunc.OSA osa = HealthFunc.OSA.INSTANCE;
                                    if (Intrinsics.areEqual(healthFunc, osa)) {
                                        OsaSetting service8 = osa.getService();
                                        if (service8 != null) {
                                            arrayList.add(new OsaSettingItem(service8, healthDevice, z));
                                        }
                                    } else {
                                        HealthFunc.PRESSURE_ALERT pressure_alert = HealthFunc.PRESSURE_ALERT.INSTANCE;
                                        if (Intrinsics.areEqual(healthFunc, pressure_alert)) {
                                            PressureAlertSetting service9 = pressure_alert.getService();
                                            if (service9 != null) {
                                                arrayList.add(new PressureAlertSettingItem(service9, healthDevice, z));
                                            }
                                        } else {
                                            HealthFunc.PRESSURE pressure = HealthFunc.PRESSURE.INSTANCE;
                                            if (Intrinsics.areEqual(healthFunc, pressure)) {
                                                PressureSetting service10 = pressure.getService();
                                                if (service10 != null) {
                                                    arrayList.add(new PressureSettingItem(service10, healthDevice, z));
                                                }
                                            } else {
                                                HealthFunc.REM rem = HealthFunc.REM.INSTANCE;
                                                if (Intrinsics.areEqual(healthFunc, rem)) {
                                                    RemSetting service11 = rem.getService();
                                                    if (service11 != null) {
                                                        if (!(!healthDevice.isForceHrAndRemEnable())) {
                                                            service11 = null;
                                                        }
                                                        if (service11 != null) {
                                                            arrayList.add(new RemSettingItem(service11, healthDevice, z));
                                                        }
                                                    }
                                                } else {
                                                    HealthFunc.SMART_SPO2 smart_spo2 = HealthFunc.SMART_SPO2.INSTANCE;
                                                    if (Intrinsics.areEqual(healthFunc, smart_spo2)) {
                                                        SmartSpo2Setting service12 = smart_spo2.getService();
                                                        if (service12 != null) {
                                                            arrayList.add(new SmartSpo2SettingItem(service12, healthDevice, z));
                                                        }
                                                    } else {
                                                        HealthFunc.SPORT_HR sport_hr = HealthFunc.SPORT_HR.INSTANCE;
                                                        if (Intrinsics.areEqual(healthFunc, sport_hr)) {
                                                            SportHrSetting service13 = sport_hr.getService();
                                                            if (service13 != null) {
                                                                if (!(!healthDevice.isForceHrAndRemEnable())) {
                                                                    service13 = null;
                                                                }
                                                                if (service13 != null) {
                                                                    arrayList.add(new SportHrSettingItem(service13, healthDevice, z));
                                                                }
                                                            }
                                                        } else {
                                                            HealthFunc.BLOOD_PRESSURE blood_pressure = HealthFunc.BLOOD_PRESSURE.INSTANCE;
                                                            if (Intrinsics.areEqual(healthFunc, blood_pressure)) {
                                                                BloodPressureSetting service14 = blood_pressure.getService();
                                                                if (service14 != null) {
                                                                    if (!service14.getBloodPressureInit().getA()) {
                                                                        service14 = null;
                                                                    }
                                                                    if (service14 != null) {
                                                                        arrayList.add(new BloodPressureSettingItem(service14, healthDevice, z));
                                                                    }
                                                                }
                                                            } else {
                                                                HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR sleeping_blood_pressure_monitor = HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR.INSTANCE;
                                                                if (Intrinsics.areEqual(healthFunc, sleeping_blood_pressure_monitor) && (service = sleeping_blood_pressure_monitor.getService()) != null) {
                                                                    if (!(service.getInitItem().getA() && service.getInitItem().deviceSupport())) {
                                                                        service = null;
                                                                    }
                                                                    if (service != null) {
                                                                        arrayList.add(new SleepingBloodPressureMonitorItem(service, healthDevice, z));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void checkBloodPressureStatus(@NotNull Function0<Boolean> func) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(func, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<SettingStatus> getBloodPressureStatusLiveData() {
        return this.bloodPressureStatusLiveData;
    }

    @NotNull
    public final LiveData<List<ViewItem>> getItems() {
        return this.items;
    }
}

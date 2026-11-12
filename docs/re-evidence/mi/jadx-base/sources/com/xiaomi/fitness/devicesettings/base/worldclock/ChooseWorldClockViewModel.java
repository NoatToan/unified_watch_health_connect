package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.worldclock.ChooseWorldClockViewModel;
import defpackage.lhi;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0017J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0018\u0010\u0010¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/ChooseWorldClockViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "list", "", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", "loadListRet", "Landroidx/lifecycle/MutableLiveData;", "getLoadListRet", "()Landroidx/lifecycle/MutableLiveData;", "loadListRet$delegate", "loadWordCityList", "", "context", "Landroid/content/Context;", "timeZoneItems", "", "getTimeZoneItems", "timeZoneItems$delegate", "onQueryTextSubmit", "newText", "", "mSourceDateList", "attach", "savedInstanceState", "Landroid/os/Bundle;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChooseWorldClockViewModel extends AbsViewModel {

    @NotNull
    private final List<TimeZoneItem> list = new ArrayList();

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rv3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseWorldClockViewModel.deviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: loadListRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadListRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sv3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseWorldClockViewModel.loadListRet_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: timeZoneItems$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeZoneItems = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tv3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseWorldClockViewModel.timeZoneItems_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.ChooseWorldClockViewModel$onQueryTextSubmit$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.ChooseWorldClockViewModel$onQueryTextSubmit$1", f = "ChooseWorldClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<TimeZoneItem> $mSourceDateList;
        final /* synthetic */ String $newText;
        int label;
        final /* synthetic */ ChooseWorldClockViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, List<? extends TimeZoneItem> list, ChooseWorldClockViewModel chooseWorldClockViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newText = str;
            this.$mSourceDateList = list;
            this.this$0 = chooseWorldClockViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$newText, this.$mSourceDateList, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Dispatchers.getIO();
            String str = this.$newText;
            List<TimeZoneItem> list = this.$mSourceDateList;
            ChooseWorldClockViewModel chooseWorldClockViewModel = this.this$0;
            CityTimeZoneHelper companion = CityTimeZoneHelper.INSTANCE.getInstance();
            ArrayList<TimeZoneItem> arrayListQueryCityTimezoneItems = companion != null ? companion.queryCityTimezoneItems(str, list) : null;
            if (arrayListQueryCityTimezoneItems != null) {
                CollectionsKt__MutableCollectionsJVMKt.sort(arrayListQueryCityTimezoneItems);
            }
            if (arrayListQueryCityTimezoneItems != null && !arrayListQueryCityTimezoneItems.isEmpty()) {
                chooseWorldClockViewModel.getTimeZoneItems().postValue(arrayListQueryCityTimezoneItems);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadListRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData timeZoneItems_delegate$lambda$2() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    @NotNull
    public final MutableLiveData<List<TimeZoneItem>> getLoadListRet() {
        return (MutableLiveData) this.loadListRet.getValue();
    }

    @NotNull
    public final MutableLiveData<List<TimeZoneItem>> getTimeZoneItems() {
        return (MutableLiveData) this.timeZoneItems.getValue();
    }

    public final void loadWordCityList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (getDeviceModel() == null) {
            return;
        }
        CityTimeZoneHelper.Companion companion = CityTimeZoneHelper.INSTANCE;
        CityTimeZoneHelper companion2 = companion.getInstance();
        if (companion2 != null) {
            companion2.init(context);
        }
        this.list.clear();
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        String[] stringArray = DeviceModelExtKt.isHuaMi(deviceModel) ? context.getResources().getStringArray(lhi.f25080b) : context.getResources().getStringArray(lhi.f25079a);
        Intrinsics.checkNotNull(stringArray);
        List<TimeZoneItem> list = this.list;
        CityTimeZoneHelper companion3 = companion.getInstance();
        Intrinsics.checkNotNull(companion3);
        list.addAll(companion3.getCityListByCityIdList(stringArray));
        getLoadListRet().postValue(this.list);
    }

    public final void onQueryTextSubmit(@NotNull String newText, @NotNull List<? extends TimeZoneItem> mSourceDateList) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        Intrinsics.checkNotNullParameter(mSourceDateList, "mSourceDateList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(newText, mSourceDateList, this, null), 3, null);
    }
}

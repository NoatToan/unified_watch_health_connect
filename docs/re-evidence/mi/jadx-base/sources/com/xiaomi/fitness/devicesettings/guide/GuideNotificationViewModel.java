package com.xiaomi.fitness.devicesettings.guide;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.bg4;
import defpackage.eu6;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.vc0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0007¢\u0006\u0004\b2\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00022\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0004R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "", "doUploadConfig", "()V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "call", "getCallEnable", "(Lkotlin/jvm/functions/Function1;)V", "", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "itemList", "getPackageList", "", "enable", "updateInCallConfig", "(Z)V", "tryGetWifiPassword", "openCalenderSync", "closeCalenderSync", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCall", "()Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "setInCall", "(Lcom/xiaomi/fitness/settingitem/settingitem/InCall;)V", "isWearOS$delegate", "Lkotlin/Lazy;", "isWearOS", "()Z", "Ljz6;", "disposable", "Ljz6;", "getDisposable", "()Ljz6;", "setDisposable", "(Ljz6;)V", "Landroidx/lifecycle/MutableLiveData;", "syncWifiCapability$delegate", "getSyncWifiCapability", "()Landroidx/lifecycle/MutableLiveData;", "syncWifiCapability", "Ljava/util/Comparator;", "mComparator", "Ljava/util/Comparator;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideNotificationViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GuideNotificationViewModel";

    @Nullable
    private jz6 disposable;
    public InCall inCall;

    /* JADX INFO: renamed from: isWearOS$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isWearOS = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n6b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(GuideNotificationViewModel.isWearOS_delegate$lambda$0(this.f27590a));
        }
    });

    /* JADX INFO: renamed from: syncWifiCapability$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncWifiCapability = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o6b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuideNotificationViewModel.syncWifiCapability_delegate$lambda$6();
        }
    });

    @NotNull
    private final Comparator<InstallApplicationInfo> mComparator = new Comparator() { // from class: p6b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return GuideNotificationViewModel.mComparator$lambda$9((InstallApplicationInfo) obj, (InstallApplicationInfo) obj2);
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return GuideNotificationViewModel.TAG;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel$getPackageList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel$getPackageList$1", f = "GuideNotificationViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<InstallApplicationInfo> $disableList;
        final /* synthetic */ List<InstallApplicationInfo> $enableList;
        final /* synthetic */ Function1<List<InstallApplicationInfo>, Unit> $itemList;
        int label;
        final /* synthetic */ GuideNotificationViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel$getPackageList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel$getPackageList$1$1", f = "GuideNotificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<InstallApplicationInfo> $enableList;
            final /* synthetic */ Function1<List<InstallApplicationInfo>, Unit> $itemList;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04981(Function1<? super List<InstallApplicationInfo>, Unit> function1, List<InstallApplicationInfo> list, Continuation<? super C04981> continuation) {
                super(2, continuation);
                this.$itemList = function1;
                this.$enableList = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04981(this.$itemList, this.$enableList, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$itemList.invoke2(this.$enableList);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<InstallApplicationInfo> list, List<InstallApplicationInfo> list2, GuideNotificationViewModel guideNotificationViewModel, Function1<? super List<InstallApplicationInfo>, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$enableList = list;
            this.$disableList = list2;
            this.this$0 = guideNotificationViewModel;
            this.$itemList = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$enableList, this.$disableList, this.this$0, this.$itemList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
                Intent intent = new Intent();
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setAction("android.intent.action.MAIN");
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                NotifyHelperExtKt.getNotificationManagerExport().setNotifyEnableList(CollectionsKt___CollectionsKt.toMutableList((Collection) NotifyHelperExtKt.getNotificationManagerExport().defaultEnableNotificationAPPList()));
                List<String> notifyEnableList = NotifyHelperExtKt.getNotificationManagerExport().getNotifyEnableList();
                if (notifyEnableList == null) {
                    notifyEnableList = new ArrayList<>();
                }
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if (resolveInfo.activityInfo.applicationInfo.icon > 0) {
                        NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
                        String packageName = resolveInfo.activityInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                        if (!notificationManagerExport.isTelApp(packageName)) {
                            String packageName2 = resolveInfo.activityInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                            InstallApplicationInfo installApplicationInfo = new InstallApplicationInfo(packageName2, resolveInfo.activityInfo.applicationInfo.loadLabel(ApplicationExtKt.getApplication().getPackageManager()).toString(), resolveInfo.activityInfo.applicationInfo.loadIcon(ApplicationExtKt.getApplication().getPackageManager()), false, null, 0, 56, null);
                            if (NotifyHelperExtKt.getNotificationManagerExport().isNotifyEnable(installApplicationInfo.getPackageName(), notifyEnableList)) {
                                installApplicationInfo.setCheck(true);
                                this.$enableList.add(installApplicationInfo);
                            } else {
                                installApplicationInfo.setCheck(false);
                                this.$disableList.add(installApplicationInfo);
                            }
                        }
                    }
                }
                InstallApplicationInfo customerSelectAppInfo = NotifyHelperExtKt.getNotificationManagerExport().getCustomerSelectAppInfo(NotifyHelperExtKt.getNotificationManagerExport().accessibilityPackageName());
                if (customerSelectAppInfo != null) {
                    if (NotifyHelperExtKt.getNotificationManagerExport().isNotifyEnable(customerSelectAppInfo.getPackageName(), notifyEnableList)) {
                        customerSelectAppInfo.setCheck(true);
                        this.$enableList.add(customerSelectAppInfo);
                    } else {
                        customerSelectAppInfo.setCheck(false);
                        this.$disableList.add(customerSelectAppInfo);
                    }
                }
                Collections.sort(this.$enableList, this.this$0.mComparator);
                Collections.sort(this.$disableList, this.this$0.mComparator);
                this.$enableList.addAll(this.$disableList);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C04981 c04981 = new C04981(this.$itemList, this.$enableList, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c04981, this) == coroutine_suspended) {
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

    private final void doUploadConfig() {
        InCall inCall = getInCall();
        DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        companion.sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_INCALL, inCall);
        NotifyHelperExtKt.getNotificationManagerExport().setInCallResult(inCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isWearOS_delegate$lambda$0(GuideNotificationViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
        return mDeviceModel != null && DeviceModelExtKt.isWearOS(mDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mComparator$lambda$9(InstallApplicationInfo installApplicationInfo, InstallApplicationInfo installApplicationInfo2) {
        if (installApplicationInfo.getOrder() >= 0 && installApplicationInfo2.getOrder() >= 0) {
            return installApplicationInfo.getOrder() - installApplicationInfo2.getOrder();
        }
        if (installApplicationInfo.getOrder() >= 0 && installApplicationInfo2.getOrder() < 0) {
            return -1;
        }
        if (installApplicationInfo.getOrder() >= 0 || installApplicationInfo2.getOrder() < 0) {
            return installApplicationInfo.getAppNamePinYin().compareTo(installApplicationInfo2.getAppNamePinYin());
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData syncWifiCapability_delegate$lambda$6() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryGetWifiPassword$lambda$7(GuideNotificationViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSyncWifiCapability().postValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateInCallConfig$lambda$1(GuideNotificationViewModel this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doUploadConfig();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateInCallConfig$lambda$3(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$5() {
    }

    public final void closeCalenderSync() {
        DeviceSettingsPreference.INSTANCE.setNeedSyncSchedule(false);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            SyncExtKt.getInstance(SyncExportManager.INSTANCE).clearAllCalendars(mDeviceModel);
        }
    }

    public final void getCallEnable(@NotNull Function1<? super InCall, Unit> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (getMDeviceModel() == null) {
            return;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            WearableDeviceModel mDeviceModel2 = getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel2);
            SettingItemEntity settingItem = companion.readSettingItem(mDeviceModel2.getDid(), DeviceSettingConfigKey.KEY_INCALL);
            if (settingItem.getValue() != null) {
                Object objValueToObject = settingItem.valueToObject(InCall.class);
                Intrinsics.checkNotNull(objValueToObject, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.InCall");
                setInCall((InCall) objValueToObject);
            } else {
                setInCall(new InCall());
                getInCall().setIncallNotifyEnabled(false);
                getInCall().setIncallContactNotifyEnabled(false);
                getInCall().setIncallNameDisplayEnabled(false);
                getInCall().setIncomingCallReply(false);
                getInCall().setInComingCallNotifyTime(SportSummary.VERSION_103);
            }
        } else {
            InCall inCallResult = NotifyHelperExtKt.getNotificationManagerExport().getInCallResult();
            Intrinsics.checkNotNull(inCallResult);
            setInCall(inCallResult);
        }
        call.invoke2(getInCall());
    }

    @Nullable
    public final jz6 getDisposable() {
        return this.disposable;
    }

    @NotNull
    public final InCall getInCall() {
        InCall inCall = this.inCall;
        if (inCall != null) {
            return inCall;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inCall");
        return null;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void getPackageList(@NotNull Function1<? super List<InstallApplicationInfo>, Unit> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        if (getMDeviceModel() == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(new ArrayList(), new ArrayList(), this, itemList, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSyncWifiCapability() {
        return (MutableLiveData) this.syncWifiCapability.getValue();
    }

    public final boolean isWearOS() {
        return ((Boolean) this.isWearOS.getValue()).booleanValue();
    }

    public final void openCalenderSync() {
        DeviceSettingsPreference.INSTANCE.setNeedSyncSchedule(true);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null) {
            SyncExtKt.getInstance(SyncExportManager.INSTANCE).syncCalendarToDevice(mDeviceModel, true, null, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel$openCalenderSync$1$1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(GuideNotificationViewModel.INSTANCE.getTAG(), "非WearOS, 同步日历失败 errorCode is：" + errorCode);
                }

                @Override // defpackage.eu6
                public void onResult(Boolean result) {
                }
            });
        }
    }

    public final void setDisposable(@Nullable jz6 jz6Var) {
        this.disposable = jz6Var;
    }

    public final void setInCall(@NotNull InCall inCall) {
        Intrinsics.checkNotNullParameter(inCall, "<set-?>");
        this.inCall = inCall;
    }

    public final void tryGetWifiPassword() {
        SyncExtKt.getInstance(SyncExportManager.INSTANCE).getWifiPasswordCapability(new Function1() { // from class: m6b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideNotificationViewModel.tryGetWifiPassword$lambda$7(this.f25805a, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void updateInCallConfig(boolean enable) {
        if (getMDeviceModel() == null) {
            return;
        }
        getInCall().setIncallNotifyEnabled(enable);
        getInCall().setIncallNameDisplayEnabled(enable);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            o4h o4hVarG = o4h.E("").g(500L, TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: h6b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideNotificationViewModel.updateInCallConfig$lambda$1(this.f19739a, (String) obj);
                }
            };
            bg4 bg4Var = new bg4() { // from class: i6b
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    GuideNotificationViewModel.updateInCallConfig$lambda$2(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: j6b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideNotificationViewModel.updateInCallConfig$lambda$3((Throwable) obj);
                }
            };
            this.disposable = o4hVarG.P(bg4Var, new bg4() { // from class: k6b
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    GuideNotificationViewModel.updateInCallConfig$lambda$4(function2, obj);
                }
            }, new vc0() { // from class: l6b
                @Override // defpackage.vc0
                public final void run() {
                    GuideNotificationViewModel.updateInCallConfig$lambda$5();
                }
            });
        } else {
            String json = new Gson().toJson(getInCall());
            NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
            Intrinsics.checkNotNull(json);
            notificationManagerExport.setInCallNotifyConfig(json);
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.50.1.1.22819"), "name", "call_reminder_btn", "result", Boolean.valueOf(enable), "source", "initialize");
        NotifyHelperExtKt.getNotificationManagerExport().updateInCallRemindState(enable);
    }
}

package com.xiaomi.fitness.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.NotifyViewModel;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import defpackage.aje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u001a2\u0018\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020\u001a0&J\u0016\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0007J\u0085\u0001\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u00072u\u00104\u001aq\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001a05J\u0016\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020?2\u0006\u0010-\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020(0AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/notify/NotifyViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "notifyEnable", "Landroidx/lifecycle/MutableLiveData;", "", "getNotifyEnable", "()Landroidx/lifecycle/MutableLiveData;", "syncAllNotificationEnable", "getSyncAllNotificationEnable", "screenLockEnable", "getScreenLockEnable", "enabledAutoScreen", "getEnabledAutoScreen", "onlyWearLiveData", "", "getOnlyWearLiveData", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mNotificationSetReceiver", "Lcom/xiaomi/fitness/notify/NotifyViewModel$NotificationSetReceiver;", "registerReceiver", "", "context", "Landroid/content/Context;", "unregisterReceiver", "attach", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "getPackageList", "itemList", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "setAllNotifyEnable", "enable", "isChange", "updateEnableAutoScreen", "checked", "isSupportOnlyWear", "()Z", "setSupportOnlyWear", "(Z)V", "getNotificationSet", "isOpenInRemind", "callBack", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "notifyEnabled", "allEnable", "screenOnNewNotification", "isNotifyStatusOnScreenLockEnable", "isOnlyWear", "updateOnlyWearEnable", "did", "", "mComparator", "Ljava/util/Comparator;", "NotificationSetReceiver", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotifyViewModel extends BaseViewModel<BaseModel> {
    private boolean isSupportOnlyWear;

    @NotNull
    private final MutableLiveData<Boolean> notifyEnable = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> syncAllNotificationEnable = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> screenLockEnable = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> enabledAutoScreen = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> onlyWearLiveData = new MutableLiveData<>(0);

    @NotNull
    private final NotificationSetReceiver mNotificationSetReceiver = new NotificationSetReceiver();

    @NotNull
    private final Comparator<InstallApplicationInfo> mComparator = new Comparator() { // from class: u1h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return NotifyViewModel.mComparator$lambda$0((InstallApplicationInfo) obj, (InstallApplicationInfo) obj2);
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/NotifyViewModel$NotificationSetReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/NotifyViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class NotificationSetReceiver extends BroadcastReceiver {
        public NotificationSetReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null && action.hashCode() == 1496312527 && action.equals(com.xiaomi.fitness.notify.data.Constant.SYSTEM_DEVICE_SETTINGS_REPORT)) {
                int intExtra = intent.getIntExtra(com.xiaomi.fitness.notify.data.Constant.SYSTEM_DEVICE_SETTINGS_REPORT_LOCK_NOTIFICATION, 0);
                int intExtra2 = intent.getIntExtra(com.xiaomi.fitness.notify.data.Constant.SYSTEM_DEVICE_SETTINGS_REPORT_SCREEN_NOTIFICATION, 0);
                int intExtra3 = intent.getIntExtra(com.xiaomi.fitness.notify.data.Constant.SYSTEM_DEVICE_SETTINGS_REPORT_ONLY_WEAR_NOTIFICATION, 0);
                if (intExtra != 0) {
                    NotifyViewModel.this.getScreenLockEnable().postValue(Boolean.valueOf(intExtra == 1));
                }
                if (intExtra2 != 0) {
                    NotifyViewModel.this.getEnabledAutoScreen().postValue(Boolean.valueOf(intExtra2 == 1));
                }
                if (intExtra3 != 0) {
                    NotifyViewModel.this.getOnlyWearLiveData().postValue(Integer.valueOf(intExtra3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyViewModel$getNotificationSet$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyViewModel$getNotificationSet$1", f = "NotifyViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function5<Boolean, Boolean, Integer, Integer, Integer, Unit> $callBack;
        final /* synthetic */ boolean $isOpenInRemind;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyViewModel$getNotificationSet$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyViewModel$getNotificationSet$1$1", f = "NotifyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function5<Boolean, Boolean, Integer, Integer, Integer, Unit> $callBack;
            final /* synthetic */ boolean $isOpenInRemind;
            int label;
            final /* synthetic */ NotifyViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07151(NotifyViewModel notifyViewModel, Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> function5, boolean z, Continuation<? super C07151> continuation) {
                super(2, continuation);
                this.this$0 = notifyViewModel;
                this.$callBack = function5;
                this.$isOpenInRemind = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(NotifyViewModel notifyViewModel, Function5 function5, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
                notifyViewModel.setSupportOnlyWear(i3 != 0);
                if (z) {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (z) {
                    z3 = true;
                }
                function5.invoke(boolValueOf, Boolean.valueOf(z3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07151(this.this$0, this.$callBack, this.$isOpenInRemind, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                final NotifyViewModel notifyViewModel = this.this$0;
                final Function5<Boolean, Boolean, Integer, Integer, Integer, Unit> function5 = this.$callBack;
                final boolean z = this.$isOpenInRemind;
                notificationManagerImpl.getNotificationSet(new Function5() { // from class: com.xiaomi.fitness.notify.c
                    @Override // kotlin.jvm.functions.Function5
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        return NotifyViewModel.AnonymousClass1.C07151.invokeSuspend$lambda$0(notifyViewModel, function5, z, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue(), ((Integer) obj6).intValue());
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> function5, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callBack = function5;
            this.$isOpenInRemind = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotifyViewModel.this.new AnonymousClass1(this.$callBack, this.$isOpenInRemind, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07151 c07151 = new C07151(NotifyViewModel.this, this.$callBack, this.$isOpenInRemind, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07151, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyViewModel$getPackageList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyViewModel$getPackageList$1", f = "NotifyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<InstallApplicationInfo> $disableList;
        final /* synthetic */ List<InstallApplicationInfo> $enableList;
        final /* synthetic */ Function1<List<InstallApplicationInfo>, Unit> $itemList;
        final /* synthetic */ PackageManager $packageManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27201(List<InstallApplicationInfo> list, Function1<? super List<InstallApplicationInfo>, Unit> function1, PackageManager packageManager, List<InstallApplicationInfo> list2, Continuation<? super C27201> continuation) {
            super(2, continuation);
            this.$enableList = list;
            this.$itemList = function1;
            this.$packageManager = packageManager;
            this.$disableList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotifyViewModel.this.new C27201(this.$enableList, this.$itemList, this.$packageManager, this.$disableList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> arrayList;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel mDeviceModel = NotifyViewModel.this.getMDeviceModel();
            if (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel)) {
                Intent intent = new Intent();
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setAction("android.intent.action.MAIN");
                List<ResolveInfo> listQueryIntentActivities = this.$packageManager.queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                if (notificationManagerImpl == null || (arrayList = notificationManagerImpl.getNotifyEnableList()) == null) {
                    arrayList = new ArrayList<>();
                }
                Logger.i(NotifyViewModel.this.getTAG(), "notifyEnableList size = " + arrayList.size());
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if (resolveInfo.activityInfo.applicationInfo.icon > 0) {
                        NotificationManagerInter notificationManagerImpl2 = NotifyStartExtKt.getNotificationManagerImpl();
                        String packageName = resolveInfo.activityInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                        if (!notificationManagerImpl2.isTelApp(packageName)) {
                            String packageName2 = resolveInfo.activityInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                            InstallApplicationInfo installApplicationInfo = new InstallApplicationInfo(packageName2, resolveInfo.activityInfo.applicationInfo.loadLabel(ApplicationExtKt.getApplication().getPackageManager()).toString(), resolveInfo.activityInfo.applicationInfo.loadIcon(ApplicationExtKt.getApplication().getPackageManager()), false, null, 0, 56, null);
                            if (NotifyStartExtKt.getNotificationManagerImpl().isNotifyEnable(installApplicationInfo.getPackageName(), arrayList)) {
                                installApplicationInfo.setCheck(true);
                                this.$enableList.add(installApplicationInfo);
                            } else {
                                installApplicationInfo.setCheck(false);
                                this.$disableList.add(installApplicationInfo);
                            }
                        }
                    }
                }
                InstallApplicationInfo customerSelectAppInfo = NotifyStartExtKt.getNotificationManagerImpl().getCustomerSelectAppInfo(NotifyStartExtKt.getNotificationManagerImpl().accessibilityPackageName());
                if (customerSelectAppInfo != null) {
                    if (NotifyStartExtKt.getNotificationManagerImpl().isNotifyEnable(customerSelectAppInfo.getPackageName(), arrayList)) {
                        customerSelectAppInfo.setCheck(true);
                        this.$enableList.add(customerSelectAppInfo);
                    } else {
                        customerSelectAppInfo.setCheck(false);
                        this.$disableList.add(customerSelectAppInfo);
                    }
                }
                Collections.sort(this.$enableList, NotifyViewModel.this.mComparator);
                Collections.sort(this.$disableList, NotifyViewModel.this.mComparator);
                this.$enableList.addAll(this.$disableList);
                this.$itemList.invoke2(this.$enableList);
            } else {
                this.$enableList.addAll(NotifyStartExtKt.getNotificationManagerImpl().getInstallApplicationList());
                this.$itemList.invoke2(this.$enableList);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyViewModel$updateOnlyWearEnable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyViewModel$updateOnlyWearEnable$1", f = "NotifyViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.exitTime}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        final /* synthetic */ String $did;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyViewModel$updateOnlyWearEnable$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyViewModel$updateOnlyWearEnable$1$1", f = "NotifyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $checked;
            final /* synthetic */ String $did;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07161(String str, boolean z, Continuation<? super C07161> continuation) {
                super(2, continuation);
                this.$did = str;
                this.$checked = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07161(this.$did, this.$checked, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                if (notificationManagerImpl != null) {
                    notificationManagerImpl.updateOnlyWearEnable(this.$did, this.$checked);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27211(String str, boolean z, Continuation<? super C27211> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27211(this.$did, this.$checked, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07161 c07161 = new C07161(this.$did, this.$checked, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07161, this) == coroutine_suspended) {
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
            return ((C27211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mComparator$lambda$0(InstallApplicationInfo installApplicationInfo, InstallApplicationInfo installApplicationInfo2) {
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

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel)) {
            return;
        }
        NotifyStartExtKt.getNotificationManagerImpl().getAllAppMuteStates();
        NotifyStartExtKt.getNotificationManagerImpl().loadSilenceWhileUsingPhone();
    }

    @NotNull
    public final MutableLiveData<Boolean> getEnabledAutoScreen() {
        return this.enabledAutoScreen;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void getNotificationSet(boolean isOpenInRemind, @NotNull Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(callBack, isOpenInRemind, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getNotifyEnable() {
        return this.notifyEnable;
    }

    @NotNull
    public final MutableLiveData<Integer> getOnlyWearLiveData() {
        return this.onlyWearLiveData;
    }

    public final void getPackageList(@NotNull Function1<? super List<InstallApplicationInfo>, Unit> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C27201(arrayList, itemList, ApplicationExtKt.getApplication().getPackageManager(), arrayList2, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getScreenLockEnable() {
        return this.screenLockEnable;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSyncAllNotificationEnable() {
        return this.syncAllNotificationEnable;
    }

    /* JADX INFO: renamed from: isSupportOnlyWear, reason: from getter */
    public final boolean getIsSupportOnlyWear() {
        return this.isSupportOnlyWear;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel)) {
            return;
        }
        NotifyStartExtKt.getNotificationManagerImpl().deAttachNotify();
    }

    public final void registerReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.xiaomi.fitness.notify.data.Constant.SYSTEM_DEVICE_SETTINGS_REPORT);
        aje.b(context).c(this.mNotificationSetReceiver, intentFilter);
    }

    public final void setAllNotifyEnable(boolean enable, boolean isChange) {
        NotificationManagerInter notificationManagerImpl;
        if (isChange && getMDeviceModel() != null && (notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl()) != null) {
            notificationManagerImpl.setSyncAllNotifySwitchStatusEnable(enable);
        }
        this.syncAllNotificationEnable.postValue(Boolean.valueOf(enable));
    }

    public final void setSupportOnlyWear(boolean z) {
        this.isSupportOnlyWear = z;
    }

    public final void unregisterReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        aje.b(context).e(this.mNotificationSetReceiver);
    }

    public final void updateEnableAutoScreen(boolean checked) {
        NotificationManagerInter notificationManagerImpl;
        if (getMDeviceModel() == null || (notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl()) == null) {
            return;
        }
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        notificationManagerImpl.setScreenOnByNewNotificationSwitch(mDeviceModel.getDid(), checked);
    }

    public final void updateOnlyWearEnable(@NotNull String did, boolean checked) {
        Intrinsics.checkNotNullParameter(did, "did");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27211(did, checked, null), 3, null);
    }
}

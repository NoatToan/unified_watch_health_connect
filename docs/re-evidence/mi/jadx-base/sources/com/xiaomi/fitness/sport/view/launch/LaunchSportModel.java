package com.xiaomi.fitness.sport.view.launch;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.sport.model.SendFocusNotification;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.SportPermissionsUtil;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport.view.sporting.CommonSportActivity;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sync.init.SyncComponent;
import com.xiaomi.fitness.user.info.export.CollectReportManagerExtKt;
import com.xiaomi.fitness.user.info.export.ICollectReportManager;
import defpackage.av6;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoe;
import defpackage.xri;
import defpackage.yyc;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b4\u0010\u0014JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0014J7\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fRB\u0010!\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000b0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", DailyRecordKey.sportType, "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "callBack", "startSport", "(Landroidx/fragment/app/FragmentActivity;ILandroid/os/Bundle;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "layout", "launchSport", "showLocationTipDialog", "(Landroidx/fragment/app/FragmentActivity;ILkotlin/jvm/functions/Function0;)V", "refreshGpsStatus", "()V", "stopRefreshGpsStatus", "(Landroidx/fragment/app/FragmentActivity;Landroid/os/Bundle;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "", "isShowProposal", "()Z", "context", "proposal", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "isShowCtaDialog", "(Landroid/content/Context;)Z", "Lkotlin/Function5;", "launch", "Lkotlin/jvm/functions/Function5;", "gpsAccuracyStatus", "I", "getGpsAccuracyStatus", "()I", "setGpsAccuracyStatus", "(I)V", "Leoe;", "locationSignalManager$delegate", "Lkotlin/Lazy;", "getLocationSignalManager", "()Leoe;", "locationSignalManager", "Lyyc;", "iSportLocationListener$delegate", "getISportLocationListener", "()Lyyc;", "iSportLocationListener", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LaunchSportModel {

    @NotNull
    public static final String TAG = "LaunchSportModel";
    private int gpsAccuracyStatus;

    @NotNull
    private Function5<? super FragmentActivity, ? super Integer, ? super Bundle, ? super View, ? super Function0<Unit>, Unit> launch = new Function5() { // from class: p4e
        @Override // kotlin.jvm.functions.Function5
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return LaunchSportModel.launch$lambda$4(this.f29987a, (FragmentActivity) obj, ((Integer) obj2).intValue(), (Bundle) obj3, (View) obj4, (Function0) obj5);
        }
    };

    /* JADX INFO: renamed from: locationSignalManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationSignalManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r4e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LaunchSportModel.locationSignalManager_delegate$lambda$5(this.f32174a);
        }
    });

    /* JADX INFO: renamed from: iSportLocationListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iSportLocationListener = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s4e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LaunchSportModel.iSportLocationListener_delegate$lambda$7(this.f33270a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.LaunchSportModel$startSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.LaunchSportModel$startSport$1", f = "LaunchSportModel.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ int $sportType;
        final /* synthetic */ View $view;
        int label;
        final /* synthetic */ LaunchSportModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30001(FragmentActivity fragmentActivity, int i, LaunchSportModel launchSportModel, Bundle bundle, View view, Function0<Unit> function0, Continuation<? super C30001> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$sportType = i;
            this.this$0 = launchSportModel;
            this.$bundle = bundle;
            this.$view = view;
            this.$callBack = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(final FragmentActivity fragmentActivity, final LaunchSportModel launchSportModel, final int i, final Bundle bundle, final View view, final Function0 function0) {
            SendFocusNotification.INSTANCE.createDialogToNotifySetting(fragmentActivity, new Function0() { // from class: com.xiaomi.fitness.sport.view.launch.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchSportModel.C30001.invokeSuspend$lambda$1$lambda$0(launchSportModel, fragmentActivity, i, bundle, view, function0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(LaunchSportModel launchSportModel, FragmentActivity fragmentActivity, int i, Bundle bundle, View view, Function0 function0) {
            launchSportModel.launch.invoke(fragmentActivity, Integer.valueOf(i), bundle, view, function0);
            CollectReportManagerExtKt.getInstance(ICollectReportManager.INSTANCE).collectGps();
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30001(this.$activity, this.$sportType, this.this$0, this.$bundle, this.$view, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                LaunchSportModel$startSport$1$isCanLaunchSport$1 launchSportModel$startSport$1$isCanLaunchSport$1 = new LaunchSportModel$startSport$1$isCanLaunchSport$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, launchSportModel$startSport$1$isCanLaunchSport$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                SportPermissionsUtil sportPermissionsUtil = SportPermissionsUtil.INSTANCE;
                final FragmentActivity fragmentActivity = this.$activity;
                final int i2 = this.$sportType;
                final LaunchSportModel launchSportModel = this.this$0;
                final Bundle bundle = this.$bundle;
                final View view = this.$view;
                final Function0<Unit> function0 = this.$callBack;
                sportPermissionsUtil.getSportPermissions(fragmentActivity, i2, new Function0() { // from class: com.xiaomi.fitness.sport.view.launch.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchSportModel.C30001.invokeSuspend$lambda$1(fragmentActivity, launchSportModel, i2, bundle, view, function0);
                    }
                });
            } else {
                ToastUtil.INSTANCE.showToast(c1j.D5);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final yyc getISportLocationListener() {
        return (yyc) this.iSportLocationListener.getValue();
    }

    private final eoe getLocationSignalManager() {
        return (eoe) this.locationSignalManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yyc iSportLocationListener_delegate$lambda$7(final LaunchSportModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new yyc() { // from class: u3e
            @Override // defpackage.yyc
            public final void onLocationChanged(SportLocationResult sportLocationResult) {
                LaunchSportModel.iSportLocationListener_delegate$lambda$7$lambda$6(this.f35334a, sportLocationResult);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iSportLocationListener_delegate$lambda$7$lambda$6(LaunchSportModel this$0, SportLocationResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int gpsAccuracyStatus = it.getGpsAccuracyStatus();
        this$0.gpsAccuracyStatus = gpsAccuracyStatus;
        FitnessLogUtils.i(TAG, "gpsAccuracyStatus:" + gpsAccuracyStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4(LaunchSportModel launchSportModel, final FragmentActivity fragmentActivity, int i, final Bundle bundle, final View view, final Function0<Unit> function0) {
        FitnessLogUtils.i(TAG, "launch , sportType:" + i + " , view:" + view + " , gpsAccuracyStatus:" + launchSportModel.gpsAccuracyStatus);
        if (i == 3) {
            launchSportModel.proposal(fragmentActivity, new Function0() { // from class: j4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchSportModel.launch$lambda$4$lambda$2(view, fragmentActivity, function0, bundle);
                }
            });
        } else if (i != 6) {
            if (view == null) {
                FitnessLogUtils.i(TAG, "launch sportType:" + i + " ,no with animate");
                LaunchExtensionKt.startActivity(fragmentActivity, (Class<?>) CommonSportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: m4e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LaunchSportModel.launch$lambda$4$lambda$3(bundle, (Intent) obj);
                    }
                });
            } else {
                new LaunchSportModel$launch$1$5(fragmentActivity, view, i, bundle).setRadius((int) ExtensionsKt.getPx(15));
            }
            function0.invoke();
        } else if (launchSportModel.gpsAccuracyStatus != 0) {
            if (view == null) {
                LaunchExtensionKt.startActivity(fragmentActivity, (Class<?>) CommonSportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: g4e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LaunchSportModel.launch$lambda$4$lambda$0(bundle, (Intent) obj);
                    }
                });
            } else {
                new LaunchSportModel$launch$1$2(fragmentActivity, view, bundle).setRadius((int) ExtensionsKt.getPx(15));
            }
            function0.invoke();
        } else {
            ToastUtil.showLongToast(fragmentActivity.getResources().getString(c1j.L2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$2(View view, FragmentActivity activity, Function0 callBack, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (view == null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: y3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportModel.launch$lambda$4$lambda$2$lambda$1(bundle, (Intent) obj);
                }
            });
        } else {
            new LaunchSportModel$launch$1$3$2(activity, view, bundle).setRadius((int) ExtensionsKt.getPx(15));
        }
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$2$lambda$1(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$3(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void launchSport$default(LaunchSportModel launchSportModel, FragmentActivity fragmentActivity, Bundle bundle, View view, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            view = null;
        }
        launchSportModel.launchSport(fragmentActivity, bundle, view, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eoe locationSignalManager_delegate$lambda$5(LaunchSportModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new eoe(AppUtil.getApp(), 1000L, (yyc) new WeakReference(this$0.getISportLocationListener()).get(), SyncComponent.SYNC_WIFI_TIME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void proposal$lambda$8(Function0 function0, CommonDialog commonDialog, View view) {
        if (function0 != null) {
            function0.invoke();
        }
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    private final void showLocationTipDialog(FragmentActivity activity, int layout, final Function0<Unit> launchSport) {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(c1j.g3).setCustomLayoutId(layout).setCanceledOnTouchOutside(true).setPositiveText(c1j.common_known).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.LaunchSportModel.showLocationTipDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function0<Unit> function0 = launchSport;
                if (function0 != null) {
                    function0.invoke();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSport(FragmentActivity activity, int sportType, Bundle bundle, View view, Function0<Unit> callBack) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.i(TAG, "deviceConnected : " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null));
        if (SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).isBackgroundProcessAlive()) {
            ScopeExtKt.scope$default(null, new C30001(activity, sportType, this, bundle, view, callBack, null), 1, null);
        } else {
            FitnessLogUtils.i(TAG, "background process is die");
        }
    }

    public static /* synthetic */ void startSport$default(LaunchSportModel launchSportModel, FragmentActivity fragmentActivity, int i, Bundle bundle, View view, Function0 function0, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            view = null;
        }
        launchSportModel.startSport(fragmentActivity, i, bundle, view, function0);
    }

    public final int getGpsAccuracyStatus() {
        return this.gpsAccuracyStatus;
    }

    public final boolean isShowCtaDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (!regionPreference.getPRIVACY_AGREE()) {
            PrivacyExtKt.showPrivacyActivity$default(context, null, null, 6, null);
        }
        return !regionPreference.getPRIVACY_AGREE();
    }

    public final boolean isShowProposal() {
        WearableDeviceModel wearableDeviceModel;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Product product = wearableDeviceModel2 != null ? wearableDeviceModel2.getProduct() : null;
        return !((wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected() || product == null || DeviceModelExtKt.isMuLan(product) || DeviceModelExtKt.isZiLong(product) || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) == null || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) ? false : true);
    }

    public final void launchSport(@NotNull final FragmentActivity activity, @NotNull final Bundle bundle, @Nullable final View view, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        FitnessLogUtils.i(TAG, "launchSport()");
        if (isShowCtaDialog(activity)) {
            return;
        }
        final int i = bundle.getInt("KEY_SPORT_TYPE", 1);
        FitnessLogUtils.i(TAG, "launchSport , sportType:" + i);
        if (i == 3) {
            startSport(activity, i, bundle, view, callBack);
        } else {
            PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).showPrivacySensitiveDialogIfNeed(activity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.sport.view.launch.LaunchSportModel.launchSport.1
                @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
                public void onPrivacyAccepted() {
                    LaunchSportModel.this.startSport(activity, i, bundle, view, callBack);
                }
            });
        }
    }

    public final void proposal(@NotNull FragmentActivity context, @Nullable final Function0<Unit> launchSport) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isShowProposal()) {
            if (launchSport != null) {
                launchSport.invoke();
                return;
            }
            return;
        }
        Object systemService = AppUtil.getApp().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        if (((SensorManager) systemService).getDefaultSensor(33171041) != null) {
            showLocationTipDialog(context, dvi.q1, launchSport);
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(dvi.r0, (ViewGroup) null);
        final CommonDialog commonDialogCreate = new CommonDialog.c("location").setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
        ((TextView) viewInflate.findViewById(xri.U2)).setOnClickListener(new View.OnClickListener() { // from class: c4e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaunchSportModel.proposal$lambda$8(launchSport, commonDialogCreate, view);
            }
        });
        commonDialogCreate.showIfNeed(context.getSupportFragmentManager());
    }

    public final void refreshGpsStatus() {
        if (LocationExtKt.isGpsEnable(AppUtil.getApp()) && PermissionExtKt.isPermissionGranted(AppUtil.getApp(), "android.permission.ACCESS_FINE_LOCATION")) {
            getLocationSignalManager().j();
        }
    }

    public final void setGpsAccuracyStatus(int i) {
        this.gpsAccuracyStatus = i;
    }

    public final void stopRefreshGpsStatus() {
        getLocationSignalManager().k();
    }
}

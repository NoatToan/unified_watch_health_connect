package com.xiaomi.fitness.sport_eco.view.launch;

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
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.sport_eco.utils.ExtensionsKt;
import com.xiaomi.fitness.sport_eco.utils.SportPermissionsUtil;
import com.xiaomi.fitness.sport_eco.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import defpackage.av6;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.zri;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fJ:\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ(\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R:\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/LaunchSportModel;", "", "<init>", "()V", "TAG", "", "launch", "Lkotlin/Function5;", "Landroidx/fragment/app/FragmentActivity;", "", "Landroid/os/Bundle;", "Landroid/view/View;", "Lkotlin/Function0;", "", "launchSport", LifecycleConstantKt.TYPE_ACTIVITY, SdkContants.KEY_BUNDLE, "view", "callBack", "startSport", DailyRecordKey.sportType, "isShowProposal", "", "proposal", "context", "showLocationTipDialog", "layout", "isShowCtaDialog", "Landroid/content/Context;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchSportModel {

    @NotNull
    private final String TAG = com.xiaomi.fitness.sport.view.launch.LaunchSportModel.TAG;

    @NotNull
    private Function5<? super FragmentActivity, ? super Integer, ? super Bundle, ? super View, ? super Function0<Unit>, Unit> launch = new Function5() { // from class: k4e
        @Override // kotlin.jvm.functions.Function5
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return LaunchSportModel.launch$lambda$4(this.f23419a, (FragmentActivity) obj, ((Integer) obj2).intValue(), (Bundle) obj3, (View) obj4, (Function0) obj5);
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.LaunchSportModel$startSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.LaunchSportModel$startSport$1", f = "LaunchSportModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ int $sportType;
        final /* synthetic */ View $view;
        int label;
        final /* synthetic */ LaunchSportModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31271(FragmentActivity fragmentActivity, int i, LaunchSportModel launchSportModel, Bundle bundle, View view, Function0<Unit> function0, Continuation<? super C31271> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$sportType = i;
            this.this$0 = launchSportModel;
            this.$bundle = bundle;
            this.$view = view;
            this.$callBack = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(LaunchSportModel launchSportModel, FragmentActivity fragmentActivity, int i, Bundle bundle, View view, Function0 function0) {
            launchSportModel.launch.invoke(fragmentActivity, Integer.valueOf(i), bundle, view, function0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31271(this.$activity, this.$sportType, this.this$0, this.$bundle, this.$view, this.$callBack, continuation);
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
                sportPermissionsUtil.getSportPermissions(fragmentActivity, i2, new Function0() { // from class: com.xiaomi.fitness.sport_eco.view.launch.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchSportModel.C31271.invokeSuspend$lambda$0(launchSportModel, fragmentActivity, i2, bundle, view, function0);
                    }
                });
            } else {
                ToastUtil.INSTANCE.showToast(e1j.U4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4(LaunchSportModel launchSportModel, final FragmentActivity fragmentActivity, int i, final Bundle bundle, final View view, final Function0<Unit> function0) {
        if (i == 3) {
            launchSportModel.proposal(fragmentActivity, new Function0() { // from class: e4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchSportModel.launch$lambda$4$lambda$1(view, fragmentActivity, function0, bundle);
                }
            });
        } else if (i != 7) {
            function0.invoke();
        } else {
            launchSportModel.proposal(fragmentActivity, new Function0() { // from class: h4e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchSportModel.launch$lambda$4$lambda$3(view, fragmentActivity, function0, bundle);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$1(View view, FragmentActivity activity, Function0 callBack, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (view == null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: a4e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportModel.launch$lambda$4$lambda$1$lambda$0(bundle, (Intent) obj);
                }
            });
        } else {
            new LaunchSportModel$launch$1$1$2(activity, view, bundle).setRadius((int) ExtensionsKt.getPx(15));
        }
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$1$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$3(View view, FragmentActivity activity, Function0 callBack, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (view == null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) IndoorRidingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: n4e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportModel.launch$lambda$4$lambda$3$lambda$2(bundle, (Intent) obj);
                }
            });
        } else {
            new LaunchSportModel$launch$1$2$2(activity, view, bundle).setRadius((int) ExtensionsKt.getPx(15));
        }
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$4$lambda$3$lambda$2(Bundle bundle, Intent it) {
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
    public static final void proposal$lambda$5(Function0 function0, CommonDialog commonDialog, View view) {
        if (function0 != null) {
            function0.invoke();
        }
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    private final void showLocationTipDialog(FragmentActivity activity, int layout, final Function0<Unit> launchSport) {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(e1j.D2).setCustomLayoutId(layout).setCanceledOnTouchOutside(true).setPositiveText(e1j.common_known).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.LaunchSportModel.showLocationTipDialog.1
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
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        Boolean boolValueOf = ecoDeviceModel != null ? Boolean.valueOf(ecoDeviceModel.getIsDeviceConnected()) : null;
        FitnessLogUtils.d(this.TAG, "deviceConnected : " + boolValueOf);
        if (SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).isBackgroundProcessAlive()) {
            ScopeExtKt.scope$default(null, new C31271(activity, sportType, this, bundle, view, callBack, null), 1, null);
        } else {
            FitnessLogUtils.d(this.TAG, "background process is die");
        }
    }

    public static /* synthetic */ void startSport$default(LaunchSportModel launchSportModel, FragmentActivity fragmentActivity, int i, Bundle bundle, View view, Function0 function0, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            view = null;
        }
        launchSportModel.startSport(fragmentActivity, i, bundle, view, function0);
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
        EcoDeviceModel ecoDeviceModel;
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Product product = ecoDeviceModel2 != null ? ecoDeviceModel2.getProduct() : null;
        return !((ecoDeviceModel2 == null || !ecoDeviceModel2.getIsDeviceConnected() || product == null || DeviceModelExtKt.isMuLan(product) || DeviceModelExtKt.isZiLong(product) || (ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) == null || EcoDeviceModelExtKt.isLocalDevice(ecoDeviceModel)) ? false : true);
    }

    public final void launchSport(@NotNull final FragmentActivity activity, @NotNull final Bundle bundle, @Nullable final View view, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (isShowCtaDialog(activity)) {
            return;
        }
        final int i = bundle.getInt("KEY_SPORT_TYPE", 1);
        if (i == 3 || i == 7) {
            startSport(activity, i, bundle, view, callBack);
        } else {
            PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).showPrivacySensitiveDialogIfNeed(activity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.sport_eco.view.launch.LaunchSportModel.launchSport.1
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
            showLocationTipDialog(context, fvi.N, launchSport);
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(fvi.A, (ViewGroup) null);
        final CommonDialog commonDialogCreate = new CommonDialog.c("location").setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
        ((TextView) viewInflate.findViewById(zri.O0)).setOnClickListener(new View.OnClickListener() { // from class: w3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaunchSportModel.proposal$lambda$5(launchSport, commonDialogCreate, view);
            }
        });
        commonDialogCreate.showIfNeed(context.getSupportFragmentManager());
    }
}

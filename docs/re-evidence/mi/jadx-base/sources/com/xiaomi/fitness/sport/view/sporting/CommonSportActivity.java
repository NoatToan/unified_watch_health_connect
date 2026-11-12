package com.xiaomi.fitness.sport.view.sporting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mi.health.sport.MapMode;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.SportConstants;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.AbilityTrainingTargetViewUtils;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.model.utils.HabitTrainingTargetViewUtils;
import com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport.view.sporting.CommonSportActivity;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import com.xiaomi.fitness.sport.view.widget.ButtonsClickListener;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import com.xiaomi.fitness.sport.viewmodel.CommonSportVM;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_manager_export.data.RouteMatchResultKt;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.sport_manager_export.utils.SportStateUtilsKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.o7h;
import defpackage.q8p;
import defpackage.yh0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.COMMON_SPORTING)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001SB\u0007¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010\u0011J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b#\u0010\u0011J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010/\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/xiaomi/fitness/sport/view/sporting/CommonSportActivity;", "Lcom/xiaomi/fitness/sport/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/CommonSportVM;", "Lyh0;", "", "initRunningMusic", "()V", "playCountdown", DialWidgetType.COUNT_DOWN, "initData", "configRunningPosture", "", "isRTLDirection", "()Z", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "routeConfig", "(Landroid/os/Bundle;)V", "initBehavior", "setListener", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "savedInstanceState", "onCreate", "hideRunningMusic", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onBackPressed", "outState", "onSaveInstanceState", "onRestoreInstanceState", "Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "", StepsInfo.KEY_DISTANCE, "", "length", "getRouteMatchResult", "(ID)I", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getRouteInfo", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "Lkotlin/Lazy;", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "isHasReegisterReceiver", "Z", "isFirstLocation", "setFirstLocation", "(Z)V", "route", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getRoute", "setRoute", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "", "fileUrl", "Ljava/lang/String;", "getFileUrl", "()Ljava/lang/String;", "setFileUrl", "(Ljava/lang/String;)V", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "createRoute", "Ljava/util/List;", "getCreateRoute", "()Ljava/util/List;", "setCreateRoute", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "targetViewUtils", "Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCommonSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSportActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/CommonSportActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,547:1\n774#2:548\n865#2,2:549\n*S KotlinDebug\n*F\n+ 1 CommonSportActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/CommonSportActivity\n*L\n302#1:548\n302#1:549,2\n*E\n"})
public final class CommonSportActivity extends Hilt_CommonSportActivity<CommonSportVM, yh0> {

    @NotNull
    private static final String TAG = "CommonSportActivity";

    @Nullable
    private List<CommonTrackData> createRoute;

    @Nullable
    private String fileUrl;
    private boolean isFirstLocation;
    private boolean isHasReegisterReceiver;

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver;

    @Nullable
    private RouteInfo route;

    @Nullable
    private ITargetTitleViewUtils targetViewUtils;

    public CommonSportActivity() {
        super(dvi.f15970b, 0);
        this.lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e74
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonSportActivity.lockScreenReceiver_delegate$lambda$0(this.f16341a);
            }
        });
        this.isFirstLocation = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ yh0 access$getMBinding(CommonSportActivity commonSportActivity) {
        return (yh0) commonSportActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CommonSportVM access$getMViewModel(CommonSportActivity commonSportActivity) {
        return (CommonSportVM) commonSportActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void configRunningPosture() {
        if (isRTLDirection()) {
            ((yh0) getMBinding()).M.setBackgroundResource(eoi.i0);
            ((yh0) getMBinding()).N.setCompoundDrawables(null, null, null, null);
        } else {
            ((yh0) getMBinding()).M.setBackgroundResource(eoi.h0);
        }
        boolean zIsSportBeanWearModeAndHasRunningPosture = isSportBeanWearModeAndHasRunningPosture();
        ConstraintLayout runningPosture = ((yh0) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(runningPosture, "runningPosture");
        ViewExtKt.setVisible(runningPosture, zIsSportBeanWearModeAndHasRunningPosture);
        if (zIsSportBeanWearModeAndHasRunningPosture || SportStateUtilsKt.isSupportWristPosture(getSportType())) {
            ((yh0) getMBinding()).K.w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void countdown() {
        setCountdownMode(((yh0) getMBinding()).B);
        ((yh0) getMBinding()).B.w();
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).countDownStart(3, 900, false);
        getHandler().postDelayed(new Runnable() { // from class: k74
            @Override // java.lang.Runnable
            public final void run() {
                CommonSportActivity.countdown$lambda$6(this.f23542a);
            }
        }, 2700L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void countdown$lambda$6(CommonSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CommonSportVM) this$0.getMViewModel()).startSport();
        ((yh0) this$0.getMBinding()).B.setVisibility(8);
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBehavior() {
        ((yh0) getMBinding()).F.setFocusable(true);
        ((yh0) getMBinding()).F.setClickable(true);
        ((yh0) getMBinding()).A.setFocusable(false);
        ((yh0) getMBinding()).A.setClickable(false);
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(((yh0) getMBinding()).F);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
        bottomSheetBehaviorB.setState(4);
        UIUtils uIUtils = UIUtils.INSTANCE;
        bottomSheetBehaviorB.W((int) (uIUtils.getScreenHeight(this) * 0.25f));
        ViewGroup.LayoutParams layoutParams = ((yh0) getMBinding()).H.A.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = bottomSheetBehaviorB.F() - ExtUtilsKt.getDp(54);
        }
        ((yh0) getMBinding()).H.A.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = ((yh0) getMBinding()).F.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = (uIUtils.isTablet() && uIUtils.isPortrait(this)) ? uIUtils.getScreenHeight(this) / 2 : (uIUtils.getScreenHeight(this) * 4) / 5;
        }
        ((yh0) getMBinding()).F.setLayoutParams(layoutParams2);
        if (uIUtils.isTablet()) {
            ((yh0) getMBinding()).H.F.getVisibility();
        } else {
            TextView bThreeData = ((yh0) getMBinding()).H.F;
            Intrinsics.checkNotNullExpressionValue(bThreeData, "bThreeData");
            ViewExtKt.gone(bThreeData);
        }
        bottomSheetBehaviorB.s(new BottomSheetBehavior.f() { // from class: com.xiaomi.fitness.sport.view.sporting.CommonSportActivity.initBehavior.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                CommonSportActivity.access$getMBinding(CommonSportActivity.this).H.A.setAlpha(1 - slideOffset);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }
        });
        ((yh0) getMBinding()).getRoot().invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    private final void initData() {
        ITargetTitleViewUtils iTargetTitleViewUtils;
        ((CommonSportVM) getMViewModel()).syncRecoverGps();
        ((yh0) getMBinding()).H.L.D.setClick(false);
        if (UIUtils.isNightMode(this)) {
            ((yh0) getMBinding()).A.setMapMode(MapMode.night);
        } else {
            ((yh0) getMBinding()).A.setMapMode(MapMode.day);
        }
        if (getAbilityPlanCourse() != null) {
            this.targetViewUtils = new AbilityTrainingTargetViewUtils(getAbilityPlanCourse());
        } else if (getHabitDayPlan() != null) {
            this.targetViewUtils = new HabitTrainingTargetViewUtils(getHabitDayPlan());
        }
        ((CommonSportVM) getMViewModel()).setSportType(getSportType());
        Logger.i(TAG, "sportType " + getSportType());
        int goalType = getGoalType();
        if (goalType != -1 || ((iTargetTitleViewUtils = this.targetViewUtils) != null && (iTargetTitleViewUtils == null || iTargetTitleViewUtils.needShowTargetView()))) {
            ((CommonSportVM) getMViewModel()).setSportGoalType(getGoalType());
            ((CommonSportVM) getMViewModel()).setSportGoalValue(getGoalValue());
        } else {
            ((yh0) getMBinding()).H.Q.setVisibility(8);
            Logger.i(TAG, "sport goal " + goalType);
        }
        routeConfig(getIntent().getExtras());
        MutableLiveData<SportingData> mData = ((CommonSportVM) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new CommonSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f74
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CommonSportActivity.initData$lambda$10(this.f17484a, (SportingData) obj);
                }
            }));
        }
        configRunningPosture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$10(CommonSportActivity this$0, SportingData sportingData) {
        int iValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportingData == null) {
            return Unit.INSTANCE;
        }
        if (sportingData.getList().size() > 0) {
            ((yh0) this$0.getMBinding()).B0(sportingData.getList());
        }
        if (SportBeanHelperExtKt.getSupportsSportBeanAccessoryWithNoPrimaryDevice()) {
            sportingData.getMap().put(CommonSportModel.SportTitle.connectDevice, this$0.getString(c1j.f4));
        }
        ((yh0) this$0.getMBinding()).C0(sportingData.getMap());
        CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
        commonSportModelUtil.getUiDataListModel(((yh0) this$0.getMBinding()).A0(), true).getLandingImageResId();
        Map<CommonSportModel.SportTitle, String> map = sportingData.getMap();
        CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.progressValue;
        String str = map.get(sportTitle);
        if (str == null || StringsKt__StringsKt.isBlank(str)) {
            iValueOf = 0;
        } else {
            String str2 = sportingData.getMap().get(sportTitle);
            Intrinsics.checkNotNull(str2);
            iValueOf = Integer.valueOf(str2);
        }
        Logger.d(TAG, "titleData goal percentage " + iValueOf);
        if (sportingData.getLocationResult().size() >= 1) {
            ((yh0) this$0.getMBinding()).H.L.D.setSignal(sportingData.getLocationResult().get(0).getGpsAccuracyStatus(), false);
        }
        if (this$0.isSportBeanMode()) {
            SportBeanUiDataModel uiDataListModel$default = CommonSportModelUtil.getUiDataListModel$default(commonSportModelUtil, sportingData.getList(), false, 2, null);
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            this$0.analyzeLowBatteryCommandAndShowDialogOnceIfNeed(uiDataListModel$default, supportFragmentManager);
        }
        List<WearableDeviceModel> accessoryDeviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : accessoryDeviceModels) {
            if (DeviceModelExtKt.isAccessoryConnected((WearableDeviceModel) obj)) {
                arrayList.add(obj);
            }
        }
        if ((!(!arrayList.isEmpty()) || this$0.getSportType() == 6) && !SportStateUtilsKt.isSupportWristPosture(this$0.getSportType())) {
            ((yh0) this$0.getMBinding()).M.setVisibility(8);
        } else {
            ((yh0) this$0.getMBinding()).M.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRunningMusic() {
        ImageView dataLine = ((yh0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(dataLine, "dataLine");
        ViewExtKt.visible(dataLine);
        if (!Intrinsics.areEqual(SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isShowMusicPlyer(), Boolean.TRUE)) {
            hideRunningMusic();
            return;
        }
        ((CommonSportVM) getMViewModel()).getSportMusicData().observe(this, new CommonSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonSportActivity.initRunningMusic$lambda$3(this.f3876a, (MusicData) obj);
            }
        }));
        ((yh0) getMBinding()).L.setOnButtonsClickListener(new ButtonsClickListener() { // from class: com.xiaomi.fitness.sport.view.sporting.CommonSportActivity.initRunningMusic.2
            @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
            public void onNextButtonClick() {
                CommonSportActivity.access$getMViewModel(CommonSportActivity.this).nextSong();
            }

            @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
            public void onPauseOrPlayButtonClick() {
                CommonSportActivity.access$getMViewModel(CommonSportActivity.this).toggleMusic();
            }

            @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
            public void onPlayListButtonClick() {
                CommonSportActivity.access$getMViewModel(CommonSportActivity.this).toMusicZone(CommonSportActivity.this);
            }

            @Override // com.xiaomi.fitness.sport.view.widget.ButtonsClickListener
            public void onPreButtonClick() {
                CommonSportActivity.access$getMViewModel(CommonSportActivity.this).preSong();
            }
        });
        ((CommonSportVM) getMViewModel()).getUpdateMusicInfo().observe(this, new CommonSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonSportActivity.initRunningMusic$lambda$4(this.f20853a, (MusicData) obj);
            }
        }));
        ((CommonSportVM) getMViewModel()).getUpdateMusicState().observe(this, new CommonSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonSportActivity.initRunningMusic$lambda$5(this.f22479a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRunningMusic$lambda$3(CommonSportActivity this$0, MusicData musicData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((musicData != null ? musicData.getName() : null) != null && musicData.getUrl() != null) {
            ((yh0) this$0.getMBinding()).G.setVisibility(8);
            ImageView dataLine = ((yh0) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(dataLine, "dataLine");
            ViewExtKt.gone(dataLine);
        }
        RunningSportMusicView runningSportMusicView = ((yh0) this$0.getMBinding()).L;
        Intrinsics.checkNotNull(runningSportMusicView);
        runningSportMusicView.setVisibility(0);
        View view = ((yh0) this$0.getMBinding()).J;
        Intrinsics.checkNotNull(view);
        view.setVisibility(0);
        ImageView line = ((yh0) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        ViewExtKt.visible(line);
        RunningSportMusicView runningSportMusicView2 = ((yh0) this$0.getMBinding()).L;
        if (runningSportMusicView2 != null) {
            runningSportMusicView2.bindData(musicData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRunningMusic$lambda$4(CommonSportActivity this$0, MusicData musicData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((yh0) this$0.getMBinding()).L.bindData(musicData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRunningMusic$lambda$5(CommonSportActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((yh0) this$0.getMBinding()).L.updateMusicPlayState(bool);
        return Unit.INSTANCE;
    }

    private final boolean isRTLDirection() {
        return q8p.a(Locale.getDefault()) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockScreenReceiver lockScreenReceiver_delegate$lambda$0(CommonSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new LockScreenReceiver(this$0.getWearMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreate$lambda$2(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return WindowInsetsCompat.f2098b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playCountdown() {
        if (getIsRecoverySport()) {
            ((CommonSportVM) getMViewModel()).startSport();
            ((yh0) getMBinding()).B.setVisibility(8);
            return;
        }
        if (getIsRebootSport()) {
            ((yh0) getMBinding()).B.setVisibility(8);
            return;
        }
        ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
        FitnessLogUtils.i(TAG, "hasOngoingSport:" + SportManagerExtKt.getInstance(companion).hasOngoingSport());
        if (!SportManagerExtKt.getInstance(companion).hasOngoingSport()) {
            countdown();
        } else {
            ((CommonSportVM) getMViewModel()).restartActivity();
            ((yh0) getMBinding()).B.setVisibility(8);
        }
    }

    private final void registerLockScreenReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(getLockScreenReceiver(), intentFilter);
        this.isHasReegisterReceiver = true;
        Logger.d(TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void routeConfig(Bundle bundle) {
        this.route = (RouteInfo) (bundle != null ? bundle.getSerializable("key_item_data") : null);
        this.fileUrl = bundle != null ? bundle.getString(SportConstants.KEY_CREATE_ROUTE_DATA) : null;
        Logger.i(TAG, "route=" + this.route);
        RouteInfo routeInfo = this.route;
        if (routeInfo != null) {
            ((CommonSportVM) getMViewModel()).loadRouteList(routeInfo, new Function1() { // from class: g74
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CommonSportActivity.routeConfig$lambda$12$lambda$11(this.f18673a, (List) obj);
                }
            });
            return;
        }
        String str = this.fileUrl;
        if (str == null || str.length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CommonSportActivity$routeConfig$2$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit routeConfig$lambda$12$lambda$11(CommonSportActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CommonSportVM) this$0.getMViewModel()).setHasPreRoute(true);
        ((yh0) this$0.getMBinding()).A.drawPreLine(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setListener() {
        ((CommonSportVM) getMViewModel()).setLocationChangedListener(new Function1() { // from class: l74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonSportActivity.setListener$lambda$15(this.f24733a, (Location) obj);
            }
        });
        ((yh0) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: m74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonSportActivity.setListener$lambda$17(this.f25834a, view);
            }
        });
        ((yh0) getMBinding()).I.A.setOnClickListener(new View.OnClickListener() { // from class: n74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonSportActivity.setListener$lambda$18(this.f27613a, view);
            }
        });
        ((yh0) getMBinding()).I.B.setOnClickListener(new View.OnClickListener() { // from class: o74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonSportActivity.setListener$lambda$19(this.f28811a, view);
            }
        });
        ((yh0) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: p74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonSportActivity.setListener$lambda$20(this.f30077a, view);
            }
        });
        ((yh0) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: q74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonSportActivity.setListener$lambda$21(this.f31190a, view);
            }
        });
        ((CommonSportVM) getMViewModel()).getSportStateLiveData().observe(this, new CommonSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonSportActivity.setListener$lambda$22(this.f5008a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15(final CommonSportActivity this$0, final Location it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getHandler().post(new Runnable() { // from class: d74
            @Override // java.lang.Runnable
            public final void run() {
                CommonSportActivity.setListener$lambda$15$lambda$14(this.f15170a, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$15$lambda$14(CommonSportActivity this$0, Location it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        ((yh0) this$0.getMBinding()).A.m(it, this$0.isFirstLocation);
        this$0.isFirstLocation = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$17(CommonSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) RunningPostureActivity.class);
        intent.putExtra("KEY_SPORT_TYPE", this$0.getSportType());
        intent.putExtra("GOAL_TYPE", this$0.getGoalType());
        intent.putExtra("GOAL_VALUE", this$0.getGoalValue());
        intent.putExtra("WEAR_MODE", this$0.getWearMode());
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$18(CommonSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$19(CommonSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoSportConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$20(CommonSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((yh0) this$0.getMBinding()).A.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$21(CommonSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CommonSportVM) this$0.getMViewModel()).toMusicZone(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$22(CommonSportActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 3) {
            ((yh0) this$0.getMBinding()).A.o();
        } else if (num != null && num.intValue() == 2) {
            ((yh0) this$0.getMBinding()).A.n();
        }
        return Unit.INSTANCE;
    }

    private final void unregisterLockScreenReceiver() {
        if (this.isHasReegisterReceiver) {
            LockScreenReceiver.INSTANCE.unregisterPhoneListener();
            unregisterReceiver(getLockScreenReceiver());
            this.isHasReegisterReceiver = false;
            Logger.d(TAG, "lockScreenReceiver successfully unregistered!!!");
        }
    }

    @Nullable
    public final List<CommonTrackData> getCreateRoute() {
        return this.createRoute;
    }

    @Nullable
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @Nullable
    public final RouteInfo getRoute() {
        return this.route;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    @Nullable
    public RouteInfo getRouteInfo() {
        return this.route;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    public int getRouteMatchResult(int dis, double length) {
        double d = length * ((double) 1000) * ((double) 0.9f);
        Logger.i(TAG, "getRouteMatchResult , route:" + this.route + " , dis:" + dis + ", length:" + d);
        if (this.route == null) {
            return 0;
        }
        int routeMatchResult = ((double) dis) >= d ? ((CommonSportVM) getMViewModel()).getSportStateCaller().getRouteMatchResult() : 0;
        ((CommonSportVM) getMViewModel()).routeClockIn(RouteMatchResultKt.convertRouteMatch(routeMatchResult));
        return RouteMatchResultKt.convertRouteMatch(routeMatchResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    @NotNull
    public SportCommandView getSportCommandView() {
        SportCommandView sportCommandView = ((yh0) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(sportCommandView, "sportCommandView");
        return sportCommandView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    public void hideRunningMusic() {
        if (!Intrinsics.areEqual(SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isShowMusicPlyer(), Boolean.TRUE)) {
            RunningSportMusicView runningMusicView = ((yh0) getMBinding()).L;
            Intrinsics.checkNotNullExpressionValue(runningMusicView, "runningMusicView");
            ViewExtKt.gone(runningMusicView);
            ImageView noPlaylist = ((yh0) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(noPlaylist, "noPlaylist");
            ViewExtKt.gone(noPlaylist);
            return;
        }
        ((yh0) getMBinding()).L.setVisibility(8);
        ((yh0) getMBinding()).G.setVisibility(0);
        ImageView line = ((yh0) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        ViewExtKt.gone(line);
        ImageView dataLine = ((yh0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(dataLine, "dataLine");
        ViewExtKt.visible(dataLine);
    }

    /* JADX INFO: renamed from: isFirstLocation, reason: from getter */
    public final boolean getIsFirstLocation() {
        return this.isFirstLocation;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        initBehavior();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.Hilt_CommonSportActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).getMapboxInstance();
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        } else {
            Window window = getWindow();
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        c.H0(getWindow().getDecorView(), new o7h() { // from class: h74
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return CommonSportActivity.onCreate$lambda$2(view, windowInsetsCompat);
            }
        });
        if (getIsBackgroundProcessAlive()) {
            setActionBarDisplayable(false);
            setListener();
            initData();
            initBehavior();
            initRunningMusic();
            registerLockScreenReceiver();
            ((yh0) getMBinding()).A.onCreate(savedInstanceState);
            if (!((CommonSportVM) getMViewModel()).getIsFirstInit()) {
                ((yh0) getMBinding()).B.setVisibility(8);
            } else {
                playCountdown();
                ((CommonSportVM) getMViewModel()).setFirstInit(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.Hilt_CommonSportActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((yh0) getMBinding()).A.onDestroy();
        ((yh0) getMBinding()).O.onDestroy();
        ((yh0) getMBinding()).L.onDestroy();
        ((yh0) getMBinding()).B.x();
        ((yh0) getMBinding()).K.x();
        unregisterLockScreenReceiver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((yh0) getMBinding()).A.onPause();
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, miuix.appcompat.app.AppCompatActivity, android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((yh0) getMBinding()).A.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ((yh0) getMBinding()).A.onSaveInstanceState(outState);
    }

    public final void setCreateRoute(@Nullable List<CommonTrackData> list) {
        this.createRoute = list;
    }

    public final void setFileUrl(@Nullable String str) {
        this.fileUrl = str;
    }

    public final void setFirstLocation(boolean z) {
        this.isFirstLocation = z;
    }

    public final void setRoute(@Nullable RouteInfo routeInfo) {
        this.route = routeInfo;
    }
}

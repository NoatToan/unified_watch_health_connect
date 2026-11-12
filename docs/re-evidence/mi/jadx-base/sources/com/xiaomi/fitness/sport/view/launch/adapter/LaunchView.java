package com.xiaomi.fitness.sport.view.launch.adapter;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.gson.Gson;
import com.mi.health.sport.SportLaunchMapView;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.TrainingPlanCallback;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;
import com.xiaomi.fitness.sport.interfaces.ILifecycle;
import com.xiaomi.fitness.sport.service.SportDataStoreManagerKt;
import com.xiaomi.fitness.sport.sporttab.SupportCityManager;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.RecursionDataModel;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.utils.TransitionUtil;
import com.xiaomi.fitness.sport.utils.WearModeGuideExtKt;
import com.xiaomi.fitness.sport.utils.WearModeWrapper;
import com.xiaomi.fitness.sport.view.BaseSportItemView;
import com.xiaomi.fitness.sport.view.ISportTabItemData;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigFragment;
import com.xiaomi.fitness.sport.view.goal.SportGoalSettingActivity;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport.view.launch.adapter.LaunchView;
import com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity;
import com.xiaomi.fitness.sport.view.route.CreateRouteActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteListActivity;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import com.xiaomi.fitness.sport.view.widget.SportMusicView;
import com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicServiceListener;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanEntranceInfo;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.utils.DialogUtils;
import defpackage.av6;
import defpackage.c1j;
import defpackage.clb;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.gak;
import defpackage.nuf;
import defpackage.nuq;
import defpackage.quq;
import defpackage.suq;
import defpackage.xri;
import defpackage.zr3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0082\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u00042\u00020\u00052\u00020\u0006:\u0002\u0082\u0001Bt\u0012\u0006\u0010\u007f\u001a\u00020~\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010L\u001a\u0004\u0018\u00010K\u0012O\u0010\u0019\u001aK\u0012\u0015\u0012\u0013\u0018\u00010@¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(T\u0012\u0015\u0012\u0013\u0018\u00010U¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020\u000e0P¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u0012J\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u0012J\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b0\u0010\u0012J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u0010\u0012J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u0010\u0012J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0012J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020*H\u0016¢\u0006\u0004\b7\u0010-J\u0015\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\u0016J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010\u0012J\u0015\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b?\u0010)J\u0019\u0010B\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u000e¢\u0006\u0004\bH\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010ORk\u0010\u0019\u001aK\u0012\u0015\u0012\u0013\u0018\u00010@¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(S\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(T\u0012\u0015\u0012\u0013\u0018\u00010U¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020\u000e0P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b\\\u0010^\"\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010]R\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010qR\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010m\u001a\u0004\bt\u0010uR\"\u0010w\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010]\u001a\u0004\bw\u0010^\"\u0004\bx\u0010`R\"\u0010y\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010I\u001a\u0004\bz\u0010&\"\u0004\b{\u0010\u0016R\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006\u0083\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;", "Lcom/xiaomi/fitness/sport/view/BaseSportItemView;", "Lnuq;", "Lcom/xiaomi/fitness/sport/bean/LaunchViewBean;", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "Lcom/xiaomi/fitness/sport/interfaces/ILifecycle;", "Landroid/view/View$OnClickListener;", "", DailyRecordKey.sportType, "", "supportCreateRoute", "(I)Z", "shouldShowStartPointNotice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "setStartPointNoticeShown", "showCreateRouteNotice", "goToTreadmillLaunchPage", "()V", "initConnectedDeviceBadgeAdapter", "viewId", "setViewRatio", "(I)V", "setViewClick", "Lkotlin/Function0;", "launchSport", "proposal", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "layout", "showLocationTipDialog", "(Landroidx/fragment/app/FragmentActivity;ILkotlin/jvm/functions/Function0;)V", "getTemperatureInt", "()Ljava/lang/Integer;", "doPreChecksAndStartSportIfNeed", "doPreChecksAndStartSportWithGoalIfNeed", "getLayoutId", "()I", "data", "setDataToView", "(Lcom/xiaomi/fitness/sport/bean/LaunchViewBean;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "switchMode", LifecycleConstantKt.ON_START, "startLocation", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_STOP, "touch", LifecycleConstantKt.ON_DESTROY, "outState", "onSaveInstanceState", "signal", "setGpsSignal", "setLocationPermission", "", "hr", "setHr", "(Ljava/lang/String;)V", "setWeather", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "it", "setMusicData", "(Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;)V", "hideSportMusic", "I", "getSportType", "Lcom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "view", "wearMode", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "abilityRunningCourse", "Lkotlin/jvm/functions/Function3;", "getLaunchSport", "()Lkotlin/jvm/functions/Function3;", "setLaunchSport", "(Lkotlin/jvm/functions/Function3;)V", "isLoadData", "Z", "()Z", "setLoadData", "(Z)V", "isShowMap", "Lcom/mi/health/sport/SportLaunchMapView;", "sportLaunchMapView", "Lcom/mi/health/sport/SportLaunchMapView;", "Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter;", "deviceBadgeAdapter", "Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter;", "Lcom/xiaomi/fitness/sport/utils/WearModeWrapper;", "wearModeWrapper", "Lcom/xiaomi/fitness/sport/utils/WearModeWrapper;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "Lcom/google/gson/Gson;", "gson$delegate", "getGson", "()Lcom/google/gson/Gson;", "gson", "isBind", "setBind", "curGpsSignal", "getCurGpsSignal", "setCurGpsSignal", "startSport", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;ILcom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel;Lkotlin/jvm/functions/Function3;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLaunchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchView.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/LaunchView\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,646:1\n53#2:647\n55#2:651\n50#3:648\n55#3:650\n107#4:649\n*S KotlinDebug\n*F\n+ 1 LaunchView.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/LaunchView\n*L\n182#1:647\n182#1:651\n182#1:648\n182#1:650\n182#1:649\n*E\n"})
public final class LaunchView extends BaseSportItemView<nuq, LaunchViewBean> implements ISportTabItemData<LaunchViewBean>, ILifecycle, View.OnClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Preferences.Key<Boolean> HAS_SHOWN_AI_NOTICE = PreferencesKeys.booleanKey("OutDoorAiRouteNoticeShownFlag");

    @NotNull
    public static final String TAG = "LaunchView";
    private static boolean isGoRoutePage;

    @Nullable
    private AbilityPlanRunningCourse abilityRunningCourse;
    private int curGpsSignal;

    @Nullable
    private ConnectedDeviceBadgeAdapter deviceBadgeAdapter;

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;
    private boolean isBind;
    private boolean isLoadData;
    private boolean isShowMap;

    @NotNull
    private Function3<? super View, ? super Integer, ? super AbilityPlanRunningCourse, Unit> launchSport;

    @Nullable
    private final LaunchSportViewModel mViewModel;

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer;

    @Nullable
    private SportLaunchMapView sportLaunchMapView;
    private final int sportType;

    @NotNull
    private final Function0<Unit> startSport;

    @NotNull
    private WearModeWrapper wearModeWrapper;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView$Companion;", "", "<init>", "()V", "TAG", "", "isGoRoutePage", "", "()Z", "setGoRoutePage", "(Z)V", "HAS_SHOWN_AI_NOTICE", "Landroidx/datastore/preferences/core/Preferences$Key;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isGoRoutePage() {
            return LaunchView.isGoRoutePage;
        }

        public final void setGoRoutePage(boolean z) {
            LaunchView.isGoRoutePage = z;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$doPreChecksAndStartSportIfNeed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/fitness/sport/view/launch/adapter/LaunchView$doPreChecksAndStartSportIfNeed$1", "Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;", "onResult", "", "type", "", "result", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLaunchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchView.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/LaunchView$doPreChecksAndStartSportIfNeed$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n1863#2,2:647\n*S KotlinDebug\n*F\n+ 1 LaunchView.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/LaunchView$doPreChecksAndStartSportIfNeed$1\n*L\n572#1:647,2\n*E\n"})
    public static final class AnonymousClass1 implements TrainingPlanCallback {
        final /* synthetic */ RecursionDataModel $recursionDataModel;

        public AnonymousClass1(RecursionDataModel recursionDataModel) {
            this.$recursionDataModel = recursionDataModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onResult$lambda$5$lambda$3(RecursionDataModel recursionDataModel, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(recursionDataModel, "$recursionDataModel");
            WearModeGuideExtKt.performOperationAndChooseNextOperationType(recursionDataModel);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onResult$lambda$5$lambda$4(LaunchView this$0, RecursionDataModel recursionDataModel, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(recursionDataModel, "$recursionDataModel");
            this$0.abilityRunningCourse = null;
            Logger.d(LaunchView.TAG, "ignore ability plan!!");
            WearModeGuideExtKt.performOperationAndChooseNextOperationType(recursionDataModel);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.fit.fitness.export.api.TrainingPlanCallback
        public void onResult(int type, String result) {
            List<AbilityDayPlanCourse> courseList;
            if (type != 2 || TextUtils.isEmpty(result)) {
                WearModeGuideExtKt.performOperationAndChooseNextOperationType(this.$recursionDataModel);
                return;
            }
            try {
                AbilityPlanEntranceInfo abilityPlanEntranceInfo = (AbilityPlanEntranceInfo) LaunchView.this.getGson().fromJson(result, AbilityPlanEntranceInfo.class);
                long planId = abilityPlanEntranceInfo.getPlanId();
                AbilityDayPlan abilityDayPlan = abilityPlanEntranceInfo.getAbilityDayPlan();
                LaunchView launchView = LaunchView.this;
                if (abilityDayPlan != null && (courseList = abilityDayPlan.getCourseList()) != null) {
                    Iterator<T> it = courseList.iterator();
                    Object[] objArr = false;
                    while (true) {
                        AbilityPlanRunningCourse abilityPlanRunningCourse = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        AbilityDayPlanCourse abilityDayPlanCourse = (AbilityDayPlanCourse) it.next();
                        if (!PlanModelsKt.isFinished(abilityDayPlanCourse) && abilityDayPlanCourse.getCourseContent().getRunningCourse() != null) {
                            AbilityPlanRunningCourse runningCourse = abilityDayPlanCourse.getCourseContent().getRunningCourse();
                            if (runningCourse != null) {
                                runningCourse.setPlanId(planId);
                                runningCourse.setName(abilityDayPlanCourse.getName());
                                runningCourse.setCourseId(abilityDayPlanCourse.getCourseId());
                                abilityPlanRunningCourse = runningCourse;
                            }
                            launchView.abilityRunningCourse = abilityPlanRunningCourse;
                            objArr = true;
                        }
                    }
                    if (objArr != false && LaunchView.this.abilityRunningCourse != null) {
                        DialogUtils dialogUtils = DialogUtils.INSTANCE;
                        Context context = LaunchView.this.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        FragmentActivity fragmentActivity = (FragmentActivity) context;
                        DialogUtils.DialogBuilder dialogBuilder = new DialogUtils.DialogBuilder();
                        final LaunchView launchView2 = LaunchView.this;
                        final RecursionDataModel recursionDataModel = this.$recursionDataModel;
                        dialogBuilder.setTitleRes(Integer.valueOf(c1j.X5));
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String string = ResourceExtKt.getString(c1j.O5);
                        Object[] objArr2 = new Object[1];
                        AbilityPlanRunningCourse abilityPlanRunningCourse2 = launchView2.abilityRunningCourse;
                        objArr2[0] = abilityPlanRunningCourse2 != null ? abilityPlanRunningCourse2.getName() : null;
                        String str = String.format(string, Arrays.copyOf(objArr2, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        dialogBuilder.setMessage(str);
                        dialogBuilder.setPositiveRes(Integer.valueOf(c1j.Q5));
                        dialogBuilder.setNegativeRes(Integer.valueOf(c1j.U5));
                        dialogBuilder.setPositiveClickListener(new Function1() { // from class: n6e
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return LaunchView.AnonymousClass1.onResult$lambda$5$lambda$3(recursionDataModel, (DialogInterface) obj);
                            }
                        });
                        dialogBuilder.setNegativeClickListener(new Function1() { // from class: o6e
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return LaunchView.AnonymousClass1.onResult$lambda$5$lambda$4(launchView2, recursionDataModel, (DialogInterface) obj);
                            }
                        });
                        Unit unit = Unit.INSTANCE;
                        dialogUtils.showTipDialog(fragmentActivity, dialogBuilder);
                        return;
                    }
                }
                WearModeGuideExtKt.performOperationAndChooseNextOperationType(this.$recursionDataModel);
            } catch (Exception unused) {
                WearModeGuideExtKt.performOperationAndChooseNextOperationType(this.$recursionDataModel);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$setStartPointNoticeShown$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$setStartPointNoticeShown$2", f = "LaunchView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(LaunchView.HAS_SHOWN_AI_NOTICE, Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$setViewClick$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport/view/launch/adapter/LaunchView$setViewClick$2", "Lzr3;", "Landroid/app/ActivityOptions;", "activityOptions", "", "onCardZoomTriggered", "(Landroid/app/ActivityOptions;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C30032 extends zr3 {
        public C30032(Context context, ImageView imageView) {
            super(context, imageView, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCardZoomTriggered$lambda$0(LaunchView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.doPreChecksAndStartSportWithGoalIfNeed();
            return Unit.INSTANCE;
        }

        @Override // defpackage.zr3
        public void onCardZoomTriggered(ActivityOptions activityOptions) {
            WearModeWrapper wearModeWrapper = LaunchView.this.wearModeWrapper;
            final LaunchView launchView = LaunchView.this;
            SportBeanHelperExtKt.checkAllConnectedDevicesAndSetWearMode(wearModeWrapper, new Function0() { // from class: p6e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchView.C30032.onCardZoomTriggered$lambda$0(launchView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$setViewClick$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport/view/launch/adapter/LaunchView$setViewClick$3", "Lzr3;", "Landroid/app/ActivityOptions;", "activityOptions", "", "onCardZoomTriggered", "(Landroid/app/ActivityOptions;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass3 extends zr3 {
        public AnonymousClass3(Context context, TextView textView) {
            super(context, textView, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCardZoomTriggered$lambda$0(LaunchView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.doPreChecksAndStartSportIfNeed();
            return Unit.INSTANCE;
        }

        @Override // defpackage.zr3
        public void onCardZoomTriggered(ActivityOptions activityOptions) {
            clb.a(LaunchView.this.getContext());
            WearModeWrapper wearModeWrapper = LaunchView.this.wearModeWrapper;
            final LaunchView launchView = LaunchView.this;
            SportBeanHelperExtKt.checkAllConnectedDevicesAndSetWearMode(wearModeWrapper, new Function0() { // from class: q6e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchView.AnonymousClass3.onCardZoomTriggered$lambda$0(launchView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$showCreateRouteNotice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.adapter.LaunchView", f = "LaunchView.kt", i = {0, 0, 0}, l = {201, 202}, m = "showCreateRouteNotice", n = {"this", "createNoticeArrow", "createNoticeText"}, s = {"L$0", "L$1", "L$2"})
    public static final class C30041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C30041(Continuation<? super C30041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LaunchView.this.showCreateRouteNotice(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$showCreateRouteNotice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$showCreateRouteNotice$2", f = "LaunchView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ ImageView $createNoticeArrow;
        final /* synthetic */ CardView $createNoticeText;
        int label;
        final /* synthetic */ LaunchView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30052(ImageView imageView, CardView cardView, LaunchView launchView, Continuation<? super C30052> continuation) {
            super(2, continuation);
            this.$createNoticeArrow = imageView;
            this.$createNoticeText = cardView;
            this.this$0 = launchView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(CardView cardView, ImageView imageView, LaunchView launchView, View view) {
            CoroutineScope viewModelScope;
            cardView.setVisibility(8);
            imageView.setVisibility(8);
            LaunchSportViewModel mViewModel = launchView.getMViewModel();
            if (mViewModel == null || (viewModelScope = ViewModelKt.getViewModelScope(mViewModel)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(viewModelScope, null, null, new LaunchView$showCreateRouteNotice$2$1$1(launchView, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(ImageView imageView, CardView cardView, LaunchView launchView) {
            CoroutineScope viewModelScope;
            imageView.setVisibility(8);
            cardView.setVisibility(8);
            LaunchSportViewModel mViewModel = launchView.getMViewModel();
            if (mViewModel == null || (viewModelScope = ViewModelKt.getViewModelScope(mViewModel)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(viewModelScope, null, null, new LaunchView$showCreateRouteNotice$2$2$1(launchView, null), 3, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30052(this.$createNoticeArrow, this.$createNoticeText, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$createNoticeArrow.setVisibility(0);
            this.$createNoticeText.setVisibility(0);
            ViewExtKt.preventParentHorizontalOverflow(this.$createNoticeText, ExtUtilsKt.getDp(Boxing.boxInt(1)));
            final CardView cardView = this.$createNoticeText;
            final ImageView imageView = this.$createNoticeArrow;
            final LaunchView launchView = this.this$0;
            cardView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.launch.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LaunchView.C30052.invokeSuspend$lambda$0(cardView, imageView, launchView, view);
                }
            });
            final ImageView imageView2 = this.$createNoticeArrow;
            final CardView cardView2 = this.$createNoticeText;
            final LaunchView launchView2 = this.this$0;
            return Boxing.boxBoolean(imageView2.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.sport.view.launch.adapter.b
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchView.C30052.invokeSuspend$lambda$1(imageView2, cardView2, launchView2);
                }
            }, 3000L));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C30052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchView(@NotNull Context context, int i, @Nullable LaunchSportViewModel launchSportViewModel, @NotNull Function3<? super View, ? super Integer, ? super AbilityPlanRunningCourse, Unit> launchSport) {
        ImageView imageView;
        CardView cardView;
        View view;
        TextView textView;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        CardView cardView2;
        CardView cardView3;
        View view2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        GpsSignalView gpsSignalView;
        suq suqVar;
        ShapeableImageView shapeableImageView;
        FrameLayout frameLayout3;
        CardView cardView4;
        View view3;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchSport, "launchSport");
        this.sportType = i;
        this.mViewModel = launchSportViewModel;
        this.launchSport = launchSport;
        this.wearModeWrapper = new WearModeWrapper(0);
        this.serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k6e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchView.serverSyncer_delegate$lambda$0();
            }
        });
        this.gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l6e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchView.gson_delegate$lambda$1();
            }
        });
        if (i == 3) {
            nuq binding = getBinding();
            if (binding != null && (view3 = binding.P) != null) {
                ViewExtKt.setVisible(view3, true);
            }
            nuq binding2 = getBinding();
            imageView = binding2 != null ? binding2.R : null;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            nuq binding3 = getBinding();
            if (binding3 != null && (cardView4 = binding3.F) != null) {
                ViewExtKt.setVisible(cardView4, false);
            }
            nuq binding4 = getBinding();
            if (binding4 != null && (frameLayout3 = binding4.O) != null) {
                frameLayout3.setVisibility(0);
            }
            int i2 = UIUtils.isNightMode(context) ? eoi.N : eoi.O;
            nuq binding5 = getBinding();
            if (binding5 != null && (suqVar = binding5.M) != null && (shapeableImageView = suqVar.C) != null) {
                shapeableImageView.setImageResource(i2);
            }
            nuq binding6 = getBinding();
            if (binding6 != null && (gpsSignalView = binding6.K) != null) {
                gpsSignalView.setVisibility(8);
            }
            this.isShowMap = false;
            nuq binding7 = getBinding();
            if (binding7 != null && (textView4 = binding7.B) != null) {
                ViewExtKt.visible(textView4);
            }
            nuq binding8 = getBinding();
            if (binding8 != null && (textView3 = binding8.B) != null) {
                textView3.setText(c1j.M0);
            }
            nuq binding9 = getBinding();
            if (binding9 != null && (textView2 = binding9.B) != null) {
                ViewExtKt.clickWithTrigger$default(textView2, 0L, new Function1() { // from class: m6e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LaunchView._init_$lambda$2(this.f25808a, (TextView) obj);
                    }
                }, 1, null);
            }
        } else {
            if (supportCreateRoute(i)) {
                nuq binding10 = getBinding();
                imageView = binding10 != null ? binding10.R : null;
                Intrinsics.checkNotNull(imageView);
                imageView.setVisibility(8);
                nuq binding11 = getBinding();
                if (binding11 != null && (view2 = binding11.P) != null) {
                    ViewExtKt.setVisible(view2, false);
                }
                nuq binding12 = getBinding();
                if (binding12 != null && (cardView3 = binding12.F) != null) {
                    ViewExtKt.setVisible(cardView3, true);
                }
                nuq binding13 = getBinding();
                if (binding13 != null && (cardView2 = binding13.F) != null) {
                    cardView2.post(new Runnable() { // from class: b6e
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchView._init_$lambda$3(this.f3858a);
                        }
                    });
                }
            } else {
                nuq binding14 = getBinding();
                if (binding14 != null && (view = binding14.P) != null) {
                    ViewExtKt.setVisible(view, true);
                }
                nuq binding15 = getBinding();
                imageView = binding15 != null ? binding15.R : null;
                Intrinsics.checkNotNull(imageView);
                imageView.setVisibility(0);
                nuq binding16 = getBinding();
                if (binding16 != null && (cardView = binding16.F) != null) {
                    ViewExtKt.setVisible(cardView, false);
                }
            }
            nuq binding17 = getBinding();
            if (binding17 != null && (frameLayout2 = binding17.O) != null) {
                frameLayout2.setVisibility(8);
            }
            this.isShowMap = true;
            this.sportLaunchMapView = new SportLaunchMapView(context);
            SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
            if (settingsPropertiesUtil.isFoldDisplayAndExpand() || settingsPropertiesUtil.getPosture(ApplicationExtKt.getApplication()) == 2) {
                setViewRatio(xri.u3);
            }
            nuq binding18 = getBinding();
            if (binding18 != null && (frameLayout = binding18.N) != null) {
                frameLayout.addView(this.sportLaunchMapView);
            }
            nuq binding19 = getBinding();
            if (binding19 != null && (textView = binding19.B) != null) {
                ViewExtKt.gone(textView);
            }
        }
        if (launchSportViewModel != null) {
            launchSportViewModel.loadPrimaryAndAccessoryConnectedDevice();
        }
        initConnectedDeviceBadgeAdapter();
        setViewClick();
        this.startSport = new Function0() { // from class: c6e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchView.startSport$lambda$12(this.f4981a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(LaunchView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.goToTreadmillLaunchPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(LaunchView this$0) {
        CoroutineScope viewModelScope;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchSportViewModel launchSportViewModel = this$0.mViewModel;
        if (launchSportViewModel == null || (viewModelScope = ViewModelKt.getViewModelScope(launchSportViewModel)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(viewModelScope, null, null, new LaunchView$2$1(this$0, null), 3, null);
    }

    public static final /* synthetic */ Object access$setStartPointNoticeShown(LaunchView launchView, Continuation continuation) {
        return launchView.setStartPointNoticeShown(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doPreChecksAndStartSportIfNeed() {
        Logger.d(TAG, "doPreChecksAndStartSportIfNeed wearMode=" + this.wearModeWrapper.getWearMode());
        int wearMode = this.wearModeWrapper.getWearMode();
        Integer temperatureInt = getTemperatureInt();
        int i = this.sportType;
        Function0<Unit> function0 = this.startSport;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        RecursionDataModel recursionDataModel = new RecursionDataModel(wearMode, 0, temperatureInt, i, function0, (FragmentActivity) context, 2, null);
        if (this.sportType == 1) {
            getServerSyncer().getLocalCurDatePlanInfo(new AnonymousClass1(recursionDataModel));
        } else {
            WearModeGuideExtKt.performOperationAndChooseNextOperationType(recursionDataModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doPreChecksAndStartSportWithGoalIfNeed() {
        Logger.d(TAG, "doPreChecksAndStartSportWithGoalIfNeed wearMode=" + this.wearModeWrapper.getWearMode());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LaunchExtensionKt.startActivity(context, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: i6e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchView.doPreChecksAndStartSportWithGoalIfNeed$lambda$13(this.f20832a, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doPreChecksAndStartSportWithGoalIfNeed$lambda$13(LaunchView this$0, Intent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("KEY_SPORT_TYPE", this$0.sportType);
        it.putExtra("WEAR_MODE", this$0.wearModeWrapper.getWearMode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    private final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    private final Integer getTemperatureInt() {
        String string;
        LaunchViewBean launchViewBeanA0;
        nuq binding = getBinding();
        String weatherTemperature = (binding == null || (launchViewBeanA0 = binding.A0()) == null) ? null : launchViewBeanA0.getWeatherTemperature();
        if (weatherTemperature == null || weatherTemperature.length() == 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            char[] charArray = weatherTemperature.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            for (char c : charArray) {
                if (Character.isDigit(c) || c == '-') {
                    sb.append(c);
                }
            }
            string = sb.toString();
        }
        if (string != null) {
            return Integer.valueOf(Integer.parseInt(string));
        }
        return null;
    }

    private final void goToTreadmillLaunchPage() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        String str = "ksmb.treadmill.m1v1";
        WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m1v1");
        Boolean boolValueOf = localDeviceModel != null ? Boolean.valueOf(localDeviceModel.getIsDeviceConnected()) : null;
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(boolValueOf, bool)) {
            str = "ksmb.treadmill.m2";
            WearableDeviceModel localDeviceModel2 = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m2");
            if (!Intrinsics.areEqual(localDeviceModel2 != null ? Boolean.valueOf(localDeviceModel2.getIsDeviceConnected()) : null, bool)) {
                str = "";
            }
        }
        SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE(str);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LaunchExtensionKt.startActivity(context, GymLaunchSportActivity.class, null, new Function1() { // from class: g6e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchView.goToTreadmillLaunchPage$lambda$5((Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToTreadmillLaunchPage$lambda$5(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$1() {
        return new Gson();
    }

    private final void initConnectedDeviceBadgeAdapter() {
        MutableLiveData<List<ConnectedDeviceBadgeModel>> connectedDeviceBadgeModelListLiveData;
        nuq binding = getBinding();
        final RecyclerView recyclerView = binding != null ? binding.C : null;
        ConnectedDeviceBadgeAdapter connectedDeviceBadgeAdapter = new ConnectedDeviceBadgeAdapter();
        this.deviceBadgeAdapter = connectedDeviceBadgeAdapter;
        if (recyclerView != null) {
            recyclerView.setAdapter(connectedDeviceBadgeAdapter);
        }
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new gak(ExtUtilsKt.getDp(Double.valueOf(6.67d))));
        }
        LaunchSportViewModel launchSportViewModel = this.mViewModel;
        if (launchSportViewModel == null || (connectedDeviceBadgeModelListLiveData = launchSportViewModel.getConnectedDeviceBadgeModelListLiveData()) == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        connectedDeviceBadgeModelListLiveData.observe((BaseActivity) context, new LaunchView$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h6e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchView.initConnectedDeviceBadgeAdapter$lambda$6(recyclerView, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initConnectedDeviceBadgeAdapter$lambda$6(RecyclerView recyclerView, LaunchView this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            if (recyclerView != null) {
                ViewExtKt.visible(recyclerView);
            }
            ConnectedDeviceBadgeAdapter connectedDeviceBadgeAdapter = this$0.deviceBadgeAdapter;
            if (connectedDeviceBadgeAdapter != null) {
                connectedDeviceBadgeAdapter.updateBadgeModelList(list);
            }
        } else if (recyclerView != null) {
            ViewExtKt.gone(recyclerView);
        }
        return Unit.INSTANCE;
    }

    private final void proposal(final Function0<Unit> launchSport) {
        Object systemService = AppUtil.getApp().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        if (((SensorManager) systemService).getDefaultSensor(33171041) != null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            showLocationTipDialog((FragmentActivity) context, dvi.q1, launchSport);
        } else {
            View viewInflate = LayoutInflater.from(getContext()).inflate(dvi.r0, (ViewGroup) null);
            final CommonDialog commonDialogCreate = new CommonDialog.c("location").setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
            ((TextView) viewInflate.findViewById(xri.U2)).setOnClickListener(new View.OnClickListener() { // from class: j6e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LaunchView.proposal$lambda$9(launchSport, commonDialogCreate, view);
                }
            });
            Context context2 = getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            commonDialogCreate.showIfNeed(((FragmentActivity) context2).getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void proposal$lambda$9(Function0 function0, CommonDialog commonDialog, View view) {
        if (function0 != null) {
            function0.invoke();
        }
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setStartPointNoticeShown(Continuation<? super Unit> continuation) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object objEdit = PreferencesKt.edit(SportDataStoreManagerKt.getSportDataStore(context), new AnonymousClass2(null), continuation);
        return objEdit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    private final void setViewClick() {
        suq suqVar;
        TextView textView;
        suq suqVar2;
        TextView textView2;
        CardView cardView;
        SportLaunchMapView sportLaunchMapView;
        quq quqVar;
        TextView textView3;
        suq suqVar3;
        TextView textView4;
        suq suqVar4;
        Context context = getContext();
        nuq binding = getBinding();
        ImageView imageView = binding != null ? binding.R : null;
        Intrinsics.checkNotNull(imageView);
        new zr3(context, imageView) { // from class: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView.setViewClick.1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                Bundle bundle = new Bundle();
                bundle.putInt("KEY_SPORT_TYPE", LaunchView.this.getSportType());
                TransitionUtil transitionUtil = TransitionUtil.INSTANCE;
                Context context2 = LaunchView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                transitionUtil.gotoPage(context2, SportRemindConfigFragment.class, bundle, true, activityOptions);
            }
        }.setRadius((int) ExtensionsKt.getPx(15));
        Context context2 = getContext();
        nuq binding2 = getBinding();
        ImageView imageView2 = binding2 != null ? binding2.J : null;
        Intrinsics.checkNotNull(imageView2);
        new C30032(context2, imageView2).setRadius((int) ExtensionsKt.getPx(15));
        Context context3 = getContext();
        nuq binding3 = getBinding();
        TextView textView5 = binding3 != null ? binding3.A : null;
        Intrinsics.checkNotNull(textView5);
        new AnonymousClass3(context3, textView5).setRadius((int) ExtensionsKt.getPx(15));
        nuq binding4 = getBinding();
        TextView textView6 = (binding4 == null || (suqVar4 = binding4.M) == null) ? null : suqVar4.B;
        Intrinsics.checkNotNull(textView6);
        nuf.f(textView6);
        if (new LaunchSportModel().isShowProposal()) {
            nuq binding5 = getBinding();
            if (binding5 != null && (suqVar2 = binding5.M) != null && (textView2 = suqVar2.B) != null) {
                textView2.setVisibility(0);
            }
            nuq binding6 = getBinding();
            if (binding6 != null && (suqVar = binding6.M) != null && (textView = suqVar.B) != null) {
                textView.setOnClickListener(this);
            }
        } else {
            nuq binding7 = getBinding();
            if (binding7 != null && (suqVar3 = binding7.M) != null && (textView4 = suqVar3.B) != null) {
                textView4.setVisibility(8);
            }
        }
        nuq binding8 = getBinding();
        if (binding8 != null && (quqVar = binding8.L) != null && (textView3 = quqVar.C) != null) {
            textView3.setOnClickListener(this);
        }
        if (this.sportType == 1 && isGoRoutePage && (sportLaunchMapView = this.sportLaunchMapView) != null) {
            sportLaunchMapView.setLocationMarkerClick(new SportLaunchMapView.c() { // from class: a6e
                @Override // com.mi.health.sport.SportLaunchMapView.c
                public final void a() {
                    LaunchView.setViewClick$lambda$7(this.f684a);
                }
            });
        }
        nuq binding9 = getBinding();
        SportMusicView sportMusicView = binding9 != null ? binding9.Q : null;
        Intrinsics.checkNotNull(sportMusicView);
        sportMusicView.setOnClickListener(this);
        nuq binding10 = getBinding();
        if (binding10 == null || (cardView = binding10.F) == null) {
            return;
        }
        cardView.setOnClickListener(new View.OnClickListener() { // from class: e6e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaunchView.setViewClick$lambda$8(this.f16310a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewClick$lambda$7(LaunchView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getContext().startActivity(new Intent(this$0.getContext(), (Class<?>) RunningRouteListActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewClick$lambda$8(LaunchView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity.Companion companion = CreateRouteActivity.INSTANCE;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.start(context);
    }

    private final void setViewRatio(int viewId) {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        nuq binding = getBinding();
        aVar.s(binding != null ? binding.D : null);
        aVar.Z(viewId, "h,1.54:1");
        nuq binding2 = getBinding();
        aVar.i(binding2 != null ? binding2.D : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shouldShowStartPointNotice(Continuation<? super Boolean> continuation) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final Flow<Preferences> data = SportDataStoreManagerKt.getSportDataStore(context).getData();
        return FlowKt.first(new Flow<Boolean>() { // from class: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$shouldShowStartPointNotice$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$shouldShowStartPointNotice$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LaunchView.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/LaunchView\n*L\n1#1,222:1\n54#2:223\n183#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$shouldShowStartPointNotice$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$shouldShowStartPointNotice$$inlined$map$1$2", f = "LaunchView.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(!Intrinsics.areEqual(((Preferences) obj).get(LaunchView.HAS_SHOWN_AI_NOTICE), Boxing.boxBoolean(false)));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showCreateRouteNotice(Continuation<? super Unit> continuation) {
        C30041 c30041;
        CardView cardView;
        LaunchView launchView;
        ImageView imageView;
        if (continuation instanceof C30041) {
            c30041 = (C30041) continuation;
            int i = c30041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30041.label = i - Integer.MIN_VALUE;
            } else {
                c30041 = new C30041(continuation);
            }
        } else {
            c30041 = new C30041(continuation);
        }
        Object obj = c30041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c30041.label;
        if (i2 != 0) {
            if (i2 == 1) {
                cardView = (CardView) c30041.L$2;
                imageView = (ImageView) c30041.L$1;
                launchView = (LaunchView) c30041.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        nuq nuqVar = (nuq) getBinding();
        ImageView imageView2 = nuqVar != null ? nuqVar.G : null;
        nuq nuqVar2 = (nuq) getBinding();
        cardView = nuqVar2 != null ? nuqVar2.H : null;
        c30041.L$0 = this;
        c30041.L$1 = imageView2;
        c30041.L$2 = cardView;
        c30041.label = 1;
        Object objShouldShowStartPointNotice = shouldShowStartPointNotice(c30041);
        if (objShouldShowStartPointNotice == coroutine_suspended) {
            return coroutine_suspended;
        }
        launchView = this;
        imageView = imageView2;
        obj = objShouldShowStartPointNotice;
        if (!((Boolean) obj).booleanValue() || imageView == null || cardView == null) {
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C30052 c30052 = new C30052(imageView, cardView, launchView, null);
        c30041.L$0 = null;
        c30041.L$1 = null;
        c30041.L$2 = null;
        c30041.label = 2;
        if (BuildersKt.withContext(main, c30052, c30041) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final void showLocationTipDialog(FragmentActivity activity, int layout, final Function0<Unit> launchSport) {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(c1j.g3).setCustomLayoutId(layout).setCanceledOnTouchOutside(true).setPositiveText(c1j.common_known).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView.showLocationTipDialog.1
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
    public static final Unit startSport$lambda$12(LaunchView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "startSport wearMode=" + this$0.wearModeWrapper.getWearMode());
        this$0.launchSport.invoke(null, Integer.valueOf(this$0.wearModeWrapper.getWearMode()), this$0.abilityRunningCourse);
        return Unit.INSTANCE;
    }

    private final boolean supportCreateRoute(int sportType) {
        return (sportType == 1 || sportType == 2) && SupportCityManager.INSTANCE.isAIOpen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchMode$lambda$10(LaunchView this$0) {
        View view;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        nuq binding = this$0.getBinding();
        if (binding == null || (view = binding.I) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final int getCurGpsSignal() {
        return this.curGpsSignal;
    }

    @NotNull
    public final Function3<View, Integer, AbilityPlanRunningCourse, Unit> getLaunchSport() {
        return this.launchSport;
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public int getLayoutId() {
        return dvi.y1;
    }

    @Nullable
    public final LaunchSportViewModel getMViewModel() {
        return this.mViewModel;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final void hideSportMusic() {
        nuq binding = getBinding();
        SportMusicView sportMusicView = binding != null ? binding.Q : null;
        Intrinsics.checkNotNull(sportMusicView);
        sportMusicView.setVisibility(8);
    }

    /* JADX INFO: renamed from: isBind, reason: from getter */
    public final boolean getIsBind() {
        return this.isBind;
    }

    /* JADX INFO: renamed from: isLoadData, reason: from getter */
    public final boolean getIsLoadData() {
        return this.isLoadData;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        int i = xri.x4;
        if (numValueOf != null && numValueOf.intValue() == i) {
            LaunchSportModel launchSportModel = new LaunchSportModel();
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            launchSportModel.proposal((FragmentActivity) context, new Function0() { // from class: f6e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        int i2 = xri.t5;
        if (numValueOf == null || numValueOf.intValue() != i2) {
            int i3 = xri.J6;
            if (numValueOf != null && numValueOf.intValue() == i3) {
                LaunchSportViewModel launchSportViewModel = this.mViewModel;
                Intrinsics.checkNotNull(launchSportViewModel);
                Context context2 = getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                launchSportViewModel.toMusicZone((FragmentActivity) context2);
                return;
            }
            return;
        }
        int i4 = this.sportType;
        String str = "running";
        if (i4 != 1) {
            if (i4 == 2) {
                str = "walking";
            } else if (i4 != 3 && i4 == 6) {
                str = "outdoor_riding";
            }
        }
        String str2 = str;
        SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        SportRecordApi.DefaultImpls.goSportRecordList$default(sportRecordApi, context3, null, str2, null, 8, null);
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (this.isShowMap) {
            switchMode();
            SportLaunchMapView sportLaunchMapView = this.sportLaunchMapView;
            if (sportLaunchMapView != null) {
                sportLaunchMapView.onCreate(savedInstanceState);
            }
        }
        int i = this.curGpsSignal;
        if (i == 0) {
            FitnessLogUtils.i(TAG, "curGpsSignal : " + i);
            setGpsSignal(0);
        }
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onDestroy() {
        SportMusicView sportMusicView;
        GpsSignalView gpsSignalView;
        FrameLayout frameLayout;
        SportLaunchMapView sportLaunchMapView;
        if (this.isShowMap && (sportLaunchMapView = this.sportLaunchMapView) != null) {
            sportLaunchMapView.onDestroy();
        }
        nuq binding = getBinding();
        if (binding != null && (frameLayout = binding.N) != null) {
            frameLayout.removeAllViews();
        }
        nuq binding2 = getBinding();
        if (binding2 != null && (gpsSignalView = binding2.K) != null) {
            gpsSignalView.onDestroy();
        }
        this.sportLaunchMapView = null;
        nuq binding3 = getBinding();
        if (binding3 != null && (sportMusicView = binding3.Q) != null) {
            sportMusicView.clear();
        }
        IMusicPlayer launchInstance = SportManagerExtKt.getLaunchInstance(IMusicPlayer.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        launchInstance.unBindXiaomiPlayerService(context);
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onPause() {
        SportLaunchMapView sportLaunchMapView;
        if (!this.isShowMap || (sportLaunchMapView = this.sportLaunchMapView) == null) {
            return;
        }
        sportLaunchMapView.onPause();
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onResume() {
        View view;
        SportLaunchMapView sportLaunchMapView;
        if (this.isShowMap && (sportLaunchMapView = this.sportLaunchMapView) != null) {
            sportLaunchMapView.onResume();
        }
        boolean key_bg_permission = SportPreference.INSTANCE.getKEY_BG_PERMISSION();
        if (this.sportType != 1) {
            if (key_bg_permission) {
                nuq binding = getBinding();
                view = binding != null ? binding.P : null;
                Intrinsics.checkNotNull(view);
                view.setVisibility(0);
            } else {
                nuq binding2 = getBinding();
                view = binding2 != null ? binding2.P : null;
                Intrinsics.checkNotNull(view);
                view.setVisibility(8);
            }
        }
        if (this.isBind) {
            return;
        }
        IMusicPlayer launchInstance = SportManagerExtKt.getLaunchInstance(IMusicPlayer.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        launchInstance.bindXiaomiPlayerService(context, new IMusicServiceListener() { // from class: com.xiaomi.fitness.sport.view.launch.adapter.LaunchView.onResume.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicServiceListener
            public void onServiceConnect(boolean isConnect) {
                LaunchView.this.setBind(isConnect);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onSaveInstanceState(@NotNull Bundle outState) {
        SportLaunchMapView sportLaunchMapView;
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (!this.isShowMap || (sportLaunchMapView = this.sportLaunchMapView) == null) {
            return;
        }
        sportLaunchMapView.onSaveInstanceState(outState);
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onStart() {
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ILifecycle
    public void onStop() {
        GpsSignalView gpsSignalView;
        nuq binding = getBinding();
        if (binding == null || (gpsSignalView = binding.K) == null) {
            return;
        }
        gpsSignalView.onStop();
    }

    public final void setBind(boolean z) {
        this.isBind = z;
    }

    public final void setCurGpsSignal(int i) {
        this.curGpsSignal = i;
    }

    public final void setGpsSignal(int signal) {
        GpsSignalView gpsSignalView;
        nuq binding = getBinding();
        if (binding != null && (gpsSignalView = binding.K) != null) {
            gpsSignalView.setSignal(signal, true);
        }
        this.curGpsSignal = signal;
    }

    public final void setHr(@NotNull String hr) {
        quq quqVar;
        TextView textView;
        quq quqVar2;
        TextView textView2;
        quq quqVar3;
        TextView textView3;
        Intrinsics.checkNotNullParameter(hr, "hr");
        if (StringsKt__StringsKt.isBlank(hr)) {
            nuq binding = getBinding();
            if (binding != null && (quqVar3 = binding.L) != null && (textView3 = quqVar3.B) != null) {
                textView3.setVisibility(4);
            }
        } else {
            nuq binding2 = getBinding();
            if (binding2 != null && (quqVar = binding2.L) != null && (textView = quqVar.B) != null) {
                textView.setVisibility(0);
            }
        }
        nuq binding3 = getBinding();
        if (binding3 == null || (quqVar2 = binding3.L) == null || (textView2 = quqVar2.B) == null) {
            return;
        }
        textView2.setText(hr);
    }

    public final void setLaunchSport(@NotNull Function3<? super View, ? super Integer, ? super AbilityPlanRunningCourse, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.launchSport = function3;
    }

    public final void setLoadData(boolean z) {
        this.isLoadData = z;
    }

    public final void setLocationPermission() {
        GpsSignalView gpsSignalView;
        nuq binding = getBinding();
        if (binding == null || (gpsSignalView = binding.K) == null) {
            return;
        }
        gpsSignalView.setLocationPermission();
    }

    public final void setMusicData(@Nullable MusicData it) {
        SportMusicView sportMusicView;
        String name;
        if (it == null || (name = it.getName()) == null || name.length() <= 0) {
            nuq binding = getBinding();
            sportMusicView = binding != null ? binding.Q : null;
            Intrinsics.checkNotNull(sportMusicView);
            sportMusicView.bindData(SportMusicView.State.MUSIC_NO_SELECT, it);
            return;
        }
        nuq binding2 = getBinding();
        sportMusicView = binding2 != null ? binding2.Q : null;
        Intrinsics.checkNotNull(sportMusicView);
        sportMusicView.bindData(SportMusicView.State.MUSIC_SELECT_PLAYLIST, it);
    }

    public final void setWeather(@NotNull LaunchViewBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        nuq binding = getBinding();
        if (binding != null) {
            binding.B0(data);
        }
    }

    public final void startLocation() {
        FitnessLogUtils.i(TAG, "launchView , startLocation");
        SportLaunchMapView sportLaunchMapView = this.sportLaunchMapView;
        if (sportLaunchMapView != null) {
            sportLaunchMapView.startLocation();
        }
    }

    public final void switchMode() {
        View view;
        View view2;
        View view3;
        if (this.isShowMap) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!UIUtils.isNightMode(context)) {
                nuq binding = getBinding();
                if (binding == null || (view = binding.I) == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            nuq binding2 = getBinding();
            if (binding2 != null && (view3 = binding2.I) != null) {
                view3.setVisibility(0);
            }
            nuq binding3 = getBinding();
            if (binding3 == null || (view2 = binding3.I) == null) {
                return;
            }
            view2.postDelayed(new Runnable() { // from class: d6e
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchView.switchMode$lambda$10(this.f15133a);
                }
            }, 500L);
        }
    }

    public final void touch() {
        GpsSignalView gpsSignalView;
        nuq binding = getBinding();
        if (binding == null || (gpsSignalView = binding.K) == null) {
            return;
        }
        gpsSignalView.onTouch();
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public void setDataToView(@NotNull LaunchViewBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.isLoadData = true;
        nuq binding = getBinding();
        if (binding != null) {
            binding.B0(data);
        }
    }
}

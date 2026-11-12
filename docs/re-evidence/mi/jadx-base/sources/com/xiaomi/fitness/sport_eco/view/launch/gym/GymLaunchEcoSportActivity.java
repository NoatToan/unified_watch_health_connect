package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.eco.activity.EcoCourseAudioActivity;
import com.mi.health.course.eco.activity.EcoCourseVideoActivity;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.common.app.ActivityStack;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.sport_eco.bean.DeviceVersionInfo;
import com.xiaomi.fitness.sport_eco.course.CourseMoreData;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestIntroduceActivity;
import com.xiaomi.fitness.sport_eco.ftp.utils.DeviceExceptionUtil;
import com.xiaomi.fitness.sport_eco.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport_eco.utils.MijiaHelper;
import com.xiaomi.fitness.sport_eco.utils.SportPreference;
import com.xiaomi.fitness.sport_eco.utils.ViewUtil;
import com.xiaomi.fitness.sport_eco.view.environmental.EcoEnvironmentalActivity;
import com.xiaomi.fitness.sport_eco.view.environmental.model.EcoEnvrionmentalBean;
import com.xiaomi.fitness.sport_eco.view.environmental.model.EnvironmentalVO;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.data.CourseFirstPageData;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportBikeConnectionFailDialog;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportDeviceExceptionDialog;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportSwitchExceptionDialog;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceUpdateFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequestKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.state.GymContext;
import com.xiaomi.fitness.sport_eco.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.a8r;
import defpackage.av6;
import defpackage.cki;
import defpackage.dih;
import defpackage.e1j;
import defpackage.foi;
import defpackage.fvi;
import defpackage.gki;
import defpackage.pi0;
import defpackage.wc0;
import defpackage.zri;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.GYM_LAUNCH)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\b\u0017\u0018\u0000 \u009a\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002\u009a\u0001B\b¢\u0006\u0005\b\u0099\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\bJ\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\bJ\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\bJ\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u000eJ'\u0010,\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\bJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b/\u0010\u001dJ\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\bJ\u0017\u00104\u001a\u00020*2\u0006\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\bJ\u000f\u00107\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010\bJ\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u0010\bJ\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\bJ\u0019\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0014¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0006¢\u0006\u0004\b>\u0010\bJ\u0015\u0010?\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b?\u0010\u001dJ\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010\u0019J\u000f\u0010B\u001a\u00020\u0006H\u0014¢\u0006\u0004\bB\u0010\bJ\u000f\u0010C\u001a\u00020\u0006H\u0014¢\u0006\u0004\bC\u0010\bJ\u000f\u0010D\u001a\u00020\u0006H\u0014¢\u0006\u0004\bD\u0010\bJ\u000f\u0010E\u001a\u00020\u0006H\u0007¢\u0006\u0004\bE\u0010\bJ\u000f\u0010F\u001a\u00020\u0006H\u0014¢\u0006\u0004\bF\u0010\bJ!\u0010I\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010\n2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010\u000eJ1\u0010L\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020*H\u0016¢\u0006\u0004\bL\u0010MJ!\u0010N\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010\n2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\u000eJ!\u0010O\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010\n2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\u000eJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020*H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00062\u0006\u0010T\u001a\u00020*H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0016H\u0016¢\u0006\u0004\bX\u0010\u0019J\r\u0010Y\u001a\u00020\u0006¢\u0006\u0004\bY\u0010\bJ\u000f\u0010Z\u001a\u00020\u0006H\u0014¢\u0006\u0004\bZ\u0010\bJ\r\u0010[\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\bJ\r\u0010\\\u001a\u00020\u0006¢\u0006\u0004\b\\\u0010\bJ\r\u0010]\u001a\u00020\u0006¢\u0006\u0004\b]\u0010\bJ\r\u0010^\u001a\u00020\u0006¢\u0006\u0004\b^\u0010\bR\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010bR\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010bR\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010bR\u001b\u0010j\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010xR\u0016\u0010}\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010xR\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0082\u0001\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010{R \u0010\u0087\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010g\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R%\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b \u0010x\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b\u008a\u0001\u0010\u0019R\u001e\u0010\u008b\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010bR.\u0010\u008c\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0098\u0001\u001a\u00020*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001¨\u0006\u009b\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM;", "Lpi0;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "", "upFtpValue", "()V", "initDialog", "", "title", "des", "showDeviceExceptionDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "observeViewModel", "updateRopeSkippingBg", "initRecyclerView", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "getFunctionListHolder", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "initTitle", "", "connectStatus", "updateTitleContent", "(Z)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "showCannotUpdateDialog", "(Landroidx/fragment/app/FragmentActivity;)V", "Lcom/xiaomi/fitness/sport_eco/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "versionInfo", "showUpdateDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport_eco/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;)V", "checkInfo", "checkGymOfflineReport", "syncFtpValueToMachine", "getJumpGymState", "getGymState", "refreshConnectState", "disconnectRopeSkipping", "initSelfGenerationFailureDialog", "", "detail", "showLockDialog", "(Landroidx/fragment/app/FragmentActivity;II)V", "hideLockDialog", "showSwitchModeDialog", "hideSwitchModeDialog", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "localSportType", "getFitnessSportType", "(Ljava/lang/String;)I", "switchBikeModeAction", "checkJumpInfo", "connectRopeSuccess", "syncRopeUserInfo", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "checkUpdate", "hasFocus", "onWindowFocusChanged", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onRestart", "setListener", LifecycleConstantKt.ON_DESTROY, "did", "mac", "onConnectStart", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "isHasLock", "lockCode", "onLock", "(ZI)V", "code", "ecoDeviceFault", "(I)V", "isDynamicMode", "onModeSwitch", "showSportBikeConnectionExceptionDialog", LifecycleConstantKt.ON_STOP, "setOpenFtpTest", "switchBikeMode", "gotoRopeSportHistory", "gotoEnvironmental", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "mSportSwitchExceptionDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mSportDeviceExceptionDialog", "mSelfGenerationFailureDialog", "mSportBikeConnectionExceptionDialog", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/LaunchSportVM;", "viewModel", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportAdapter;", "adapter$delegate", "getAdapter", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportAdapter;", "adapter", "productOrder", "I", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder;", "controlHolder", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder;", "functionListHolder", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "isFront", "Z", "Landroid/widget/TextView;", "titleConnect", "Landroid/widget/TextView;", "isCheckOfflineData", "isCheckEcoUpdateData", "Ljava/lang/String;", "Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EnvironmentalVO;", "mEnvironmental", "Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EnvironmentalVO;", "gymTitle", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "getShowUpdateDialog", "()Z", "setShowUpdateDialog", "lockDialog", "switchModeDialog", "getSwitchModeDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setSwitchModeDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "startMills", "J", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class GymLaunchEcoSportActivity extends Hilt_GymLaunchEcoSportActivity<LaunchSportVM, pi0> implements ILockListener, OnEcoDeviceStatusListener {
    public static final int CTRL_COMMUNICATION_FAILURE = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODE_CHANGE_FAILURE = 3;
    public static final int NO_FAULT = 0;
    public static final int RESISTANCE_FAILURE = 1;

    @NotNull
    public static final String TAG = "GymLaunchEcoSportActivity";

    @Nullable
    private ControlHolder controlHolder;

    @Nullable
    private FunctionListHolder functionListHolder;
    private TextView gymTitle;
    private boolean isCheckEcoUpdateData;
    private boolean isCheckOfflineData;
    private boolean isFront;

    @Nullable
    private CommonDialog<?> lockDialog;

    @Nullable
    private EnvironmentalVO mEnvironmental;

    @Nullable
    private CommonDialog<DialogParams> mSelfGenerationFailureDialog;

    @Nullable
    private CommonDialog<DialogParams> mSportBikeConnectionExceptionDialog;

    @Nullable
    private CommonDialog<DialogParams> mSportDeviceExceptionDialog;

    @Nullable
    private CommonDialog<DialogParams> mSportSwitchExceptionDialog;
    private int productOrder;
    private boolean showUpdateDialog;

    @Nullable
    private CommonDialog<?> switchModeDialog;

    @Nullable
    private TextView titleConnect;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kbb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GymLaunchEcoSportActivity.viewModel_delegate$lambda$0(this.f23680a);
        }
    });

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lbb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GymLaunchEcoSportActivity.adapter_delegate$lambda$1(this.f24857a);
        }
    });

    @NotNull
    private String localSportType = "ksmb.treadmill.m1v1";

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mbb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GymLaunchEcoSportActivity.lockScreenReceiver_delegate$lambda$2();
        }
    });
    private long startMills = System.currentTimeMillis();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity$Companion;", "", "<init>", "()V", "TAG", "", "NO_FAULT", "", "RESISTANCE_FAILURE", "CTRL_COMMUNICATION_FAILURE", "MODE_CHANGE_FAILURE", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymLaunchEcoSportAdapter adapter_delegate$lambda$1(GymLaunchEcoSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new GymLaunchEcoSportAdapter(this$0);
    }

    private final void checkGymOfflineReport() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i(TAG, "checkGymOfflineReport but device is wait connect");
        } else {
            if (!SportPreference.INSTANCE.getGYM_REPORT_REMIND() || this.isCheckOfflineData) {
                return;
            }
            GymDeviceModel.checkGymOfflineReport$default(GymDeviceModel.INSTANCE, this, false, null, 6, null);
            this.isCheckOfflineData = true;
        }
    }

    private final void checkInfo() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i(TAG, "device is wait connect");
            return;
        }
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isSupportLockMachine()) {
            GymContext.INSTANCE.checkLock(this);
            GymDeviceModel.INSTANCE.syncGymData();
        } else {
            GymDeviceModel.INSTANCE.syncGymData();
        }
        if (!this.isCheckEcoUpdateData && sportDeviceModel.isSupportCheckUploadMachine()) {
            checkUpdate(this);
        }
        if (this.isCheckOfflineData) {
            return;
        }
        checkGymOfflineReport();
    }

    private final void checkJumpInfo() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            return;
        }
        Activity topActivity = ActivityStack.INSTANCE.getTopActivity();
        if ((topActivity instanceof GymLaunchEcoSportActivity) || (topActivity instanceof BindLocalDeviceActivity)) {
            if (SportPreference.INSTANCE.getGYM_JUMP_REPORT_REMIND()) {
                GymDeviceModel.checkEcoJumpOfflineReport$default(GymDeviceModel.INSTANCE, this.localSportType, this, false, new Function1() { // from class: obb
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GymLaunchEcoSportActivity.checkJumpInfo$lambda$21(this.f28967a, ((Boolean) obj).booleanValue());
                    }
                }, 4, null);
            } else {
                GymDeviceModel.INSTANCE.checkUpdateRope(this, this.localSportType);
            }
        }
        GymDeviceModel.INSTANCE.syncRopeSkippingData(this.localSportType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkJumpInfo$lambda$21(GymLaunchEcoSportActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            GymDeviceModel.INSTANCE.checkUpdateRope(this$0, this$0.localSportType);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$10$lambda$9(GymLaunchEcoSportActivity this$0, FragmentActivity activity, DeviceVersionInfo deviceVersionInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (deviceVersionInfo != null && deviceVersionInfo.isNeedUpdate()) {
            Serializable versionInfo = deviceVersionInfo.getVersionInfo();
            Intrinsics.checkNotNull(versionInfo, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
            this$0.showUpdateDialog(activity, (LocalDeviceUpgradeModel.CheckUpgradeRequest) versionInfo);
            this$0.isCheckEcoUpdateData = true;
        }
        return Unit.INSTANCE;
    }

    private final void connectRopeSuccess() {
        syncRopeUserInfo();
        checkJumpInfo();
        Activity topActivity = ActivityStack.INSTANCE.getTopActivity();
        if ((topActivity instanceof EcoCourseVideoActivity) || (topActivity instanceof EcoCourseAudioActivity) || (topActivity instanceof JumpingActivity)) {
            FitnessLogUtils.i(TAG, "运动中页面断开重连,不获取运动状态");
        } else {
            FitnessLogUtils.i(TAG, "非运动中页面断开重连,获取运动状态");
            getJumpGymState();
        }
    }

    private final void disconnectRopeSkipping() {
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            return;
        }
        EcoDeviceManagerExtKt.getInstance(companion).disconnectDevice(localDeviceModel.getDid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GymLaunchEcoSportAdapter getAdapter() {
        return (GymLaunchEcoSportAdapter) this.adapter.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[ORIG_RETURN, RETURN] */
    private final int getFitnessSportType(String localSportType) {
        switch (localSportType) {
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr804":
            case "yunmai.jmprope.sr805":
                return 14;
            default:
                return 0;
        }
    }

    private final FunctionListHolder getFunctionListHolder() {
        if (this.functionListHolder == null) {
            this.functionListHolder = getAdapter().getFunctionListHolder();
        }
        return this.functionListHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getGymState() {
        ((pi0) getMBinding()).getRoot().postDelayed(new Runnable() { // from class: rbb
            @Override // java.lang.Runnable
            public final void run() {
                GymLaunchEcoSportActivity.getGymState$lambda$13(this.f32375a);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGymState$lambda$13(final GymLaunchEcoSportActivity this$0) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this$0.localSportType);
        if (localDeviceModel != null) {
            EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this$0.localSportType);
            if (localDeviceModel2 == null || (did = localDeviceModel2.getDid()) == null) {
                did = "";
            }
            EcoDeviceModelExtKt.syncDeviceSportStatus(localDeviceModel, did, new SportStateSyncCallback<a8r>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity$getGymState$1$1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback
                public void onError(int errorCode) {
                }

                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback
                public void onResult(a8r result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result.a()) {
                        GymDeviceModel.launchGym$default(GymDeviceModel.INSTANCE, this.this$0, true, false, 0L, 0L, 24, null);
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getJumpGymState() {
        ((pi0) getMBinding()).getRoot().postDelayed(new Runnable() { // from class: ubb
            @Override // java.lang.Runnable
            public final void run() {
                GymLaunchEcoSportActivity.getJumpGymState$lambda$12(this.f35595a);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getJumpGymState$lambda$12(final GymLaunchEcoSportActivity this$0) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this$0.localSportType);
        if (localDeviceModel != null) {
            EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this$0.localSportType);
            if (localDeviceModel2 == null || (did = localDeviceModel2.getDid()) == null) {
                did = "";
            }
            EcoDeviceModelExtKt.syncDeviceSportStatus(localDeviceModel, did, new SportStateSyncCallback<a8r>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity$getJumpGymState$1$1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback
                public void onError(int errorCode) {
                    FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "GYM is not sport , code : " + errorCode);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback
                public void onResult(a8r result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (!result.a() || result.d) {
                        FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "GYM is not sport");
                        return;
                    }
                    FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "GYM is sporting ");
                    GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                    GymLaunchEcoSportActivity gymLaunchEcoSportActivity = this.this$0;
                    gymDeviceModel.startJumping(gymLaunchEcoSportActivity, true, false, gymLaunchEcoSportActivity.localSportType, result.f779a, result.f780b);
                }
            });
        }
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaunchSportVM getViewModel() {
        return (LaunchSportVM) this.viewModel.getValue();
    }

    private final void hideLockDialog() {
        CommonDialog<?> commonDialog = this.lockDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
    }

    private final void hideSwitchModeDialog() {
        CommonDialog<?> commonDialog = this.switchModeDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
    }

    private final void initDialog() {
        CommonDialog<DialogParams> commonDialogAddDialogCallback = new SportBikeConnectionFailDialog.Builder().setDialogDescription(Intrinsics.areEqual(this.localSportType, "yunmai.jmprope.sr803") ? e1j.n4 : e1j.z0).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.initDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        this.mSportBikeConnectionExceptionDialog = commonDialogAddDialogCallback;
        if (commonDialogAddDialogCallback != null) {
            commonDialogAddDialogCallback.setCancelable(false);
        }
        CommonDialog<DialogParams> commonDialogAddDialogCallback2 = new SportSwitchExceptionDialog.Builder().create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.initDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        this.mSportSwitchExceptionDialog = commonDialogAddDialogCallback2;
        if (commonDialogAddDialogCallback2 != null) {
            commonDialogAddDialogCallback2.setCancelable(false);
        }
        initSelfGenerationFailureDialog(DeviceExceptionUtil.getExceptionTitleByCode(4), DeviceExceptionUtil.getExceptionDesByCode(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecyclerView() {
        ((pi0) getMBinding()).B.showFooterDesc(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 6, 1, false);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.initRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || GymLaunchEcoSportActivity.this.getAdapter().getItemViewType(position) == 505 || position <= 3) ? 6 : 2;
            }
        });
        ((pi0) getMBinding()).B.setLayoutManager(gridLayoutManager);
        ((pi0) getMBinding()).B.setAdapter(getAdapter());
        ((pi0) getMBinding()).B.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.initRecyclerView.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                GymLaunchEcoSportActivity.this.getViewModel().reqData(GymLaunchEcoSportActivity.this.localSportType);
            }
        });
    }

    private final void initSelfGenerationFailureDialog(String title, String des) {
        this.mSelfGenerationFailureDialog = new SportDeviceExceptionDialog.Builder(title, des).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.initSelfGenerationFailureDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        CommonDialog<DialogParams> commonDialog = this.mSportDeviceExceptionDialog;
        if (commonDialog != null) {
            commonDialog.setCancelable(false);
        }
    }

    @SuppressLint({"ResourceAsColor"})
    private final void initTitle() {
        wc0 miuiActionBar;
        View viewInflate = LayoutInflater.from(this).inflate(fvi.t0, (ViewGroup) null);
        if (UIUtils.isNightMode(this) && (miuiActionBar = getMiuiActionBar()) != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, gki.f19084a)));
        }
        Intrinsics.checkNotNull(viewInflate);
        setCustomView(viewInflate, new ActionBar.LayoutParams(-1, -1));
        ((ImageView) viewInflate.findViewById(zri.j)).setOnClickListener(new View.OnClickListener() { // from class: nbb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GymLaunchEcoSportActivity.initTitle$lambda$8(this.f27749a, view);
            }
        });
        this.titleConnect = (TextView) viewInflate.findViewById(zri.I2);
        this.gymTitle = (TextView) viewInflate.findViewById(zri.h1);
        updateTitleContent(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$8(GymLaunchEcoSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockScreenReceiver lockScreenReceiver_delegate$lambda$2() {
        return new LockScreenReceiver();
    }

    private final void observeViewModel() {
        getViewModel().isDynamicModel().observe(this, new GymLaunchEcoSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vbb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchEcoSportActivity.observeViewModel$lambda$5(this.f36712a, (Boolean) obj);
            }
        }));
        getViewModel().getEnvironmentalValue().observe(this, new GymLaunchEcoSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wbb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchEcoSportActivity.observeViewModel$lambda$6(this.f37805a, (EnvironmentalVO) obj);
            }
        }));
        if (SportDeviceModel.INSTANCE.isSupportFtpMachine()) {
            getViewModel().getFtpValue().observe(this, new GymLaunchEcoSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xbb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymLaunchEcoSportActivity.observeViewModel$lambda$7(this.f38941a, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeViewModel$lambda$5(GymLaunchEcoSportActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FunctionListHolder functionListHolder = this$0.getFunctionListHolder();
        if (functionListHolder != null) {
            Intrinsics.checkNotNull(bool);
            functionListHolder.setSportDynamic(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeViewModel$lambda$6(GymLaunchEcoSportActivity this$0, EnvironmentalVO environmentalVO) {
        FunctionListHolder functionListHolder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mEnvironmental = environmentalVO;
        FitnessLogUtils.i(TAG, " mEnvironmental : " + environmentalVO);
        if (SportDeviceModel.INSTANCE.isSupportEnvironmentalMachine()) {
            EnvironmentalVO environmentalVO2 = this$0.mEnvironmental;
            String currentLevelDes = environmentalVO2 != null ? environmentalVO2.getCurrentLevelDes() : null;
            Intrinsics.checkNotNull(currentLevelDes);
            if (currentLevelDes.length() > 0 && (functionListHolder = this$0.getFunctionListHolder()) != null) {
                EnvironmentalVO environmentalVO3 = this$0.mEnvironmental;
                Integer currentLevelDesResId = environmentalVO3 != null ? environmentalVO3.getCurrentLevelDesResId() : null;
                Intrinsics.checkNotNull(currentLevelDesResId);
                functionListHolder.setEnvironmental(new EcoEnvrionmentalBean(currentLevelDesResId.intValue(), foi.c, e1j.j));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeViewModel$lambda$7(GymLaunchEcoSportActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, " ftpValue : " + num);
        FunctionListHolder functionListHolder = this$0.getFunctionListHolder();
        if (functionListHolder != null) {
            Intrinsics.checkNotNull(num);
            functionListHolder.setFtpTest(num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3(GymLaunchEcoSportActivity this$0, CourseFirstPageData courseFirstPageData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GymLaunchEcoSportAdapter adapter = this$0.getAdapter();
        Intrinsics.checkNotNull(courseFirstPageData);
        adapter.setFirstPage(courseFirstPageData);
        MoreRecyclerView.setStatus$default(((pi0) this$0.getMBinding()).B, courseFirstPageData.getStatus(), false, 2, null);
        if (!Intrinsics.areEqual(this$0.localSportType, "yunmai.jmprope.sr804")) {
            ((pi0) this$0.getMBinding()).B.showFooterDesc(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(GymLaunchEcoSportActivity this$0, CourseMoreData courseMoreData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<CourseModel.CourseData> list = courseMoreData.getList();
        if (list != null && !list.isEmpty()) {
            this$0.getAdapter().addVideoData(courseMoreData.getList());
        }
        MoreRecyclerView.setStatus$default(((pi0) this$0.getMBinding()).B, courseMoreData.getStatus(), false, 2, null);
        return Unit.INSTANCE;
    }

    private final void refreshConnectState() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            updateTitleContent(false);
        } else {
            SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setLocalReceiveListener(this);
            if (!SportDeviceModel.INSTANCE.isJump()) {
                checkInfo();
            }
            updateTitleContent(true);
        }
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.refreshConnectState();
        }
    }

    private final void registerLockScreenReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(getLockScreenReceiver(), intentFilter);
        FitnessLogUtils.d(TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCannotUpdateDialog(FragmentActivity activity) {
        CommonDialog commonDialogCreate = new CommonDialog.c("cannot").setDialogTitle(e1j.c2).setDialogDescription(e1j.b2).setPositiveText(e1j.d).setNegativeText(e1j.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.showCannotUpdateDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    MijiaHelper.INSTANCE.goMijia(GymDeviceModel.INSTANCE.curGymDeviceModel());
                }
            }
        });
        FragmentActivity fragmentActivity = (FragmentActivity) new WeakReference(activity).get();
        commonDialogCreate.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
    }

    private final void showDeviceExceptionDialog(String title, String des) {
        CommonDialog<DialogParams> commonDialogAddDialogCallback = new SportDeviceExceptionDialog.Builder(title, des).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.showDeviceExceptionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        this.mSportDeviceExceptionDialog = commonDialogAddDialogCallback;
        if (commonDialogAddDialogCallback != null) {
            commonDialogAddDialogCallback.setCancelable(false);
        }
        CommonDialog<DialogParams> commonDialog = this.mSportDeviceExceptionDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void showLockDialog(FragmentActivity activity, int title, int detail) {
        CommonDialog<?> commonDialog = this.lockDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(title).setDialogDescription(detail).setPositiveText(e1j.S).create();
            this.lockDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.lockDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.showLockDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which != -1 || dialog == null) {
                            return;
                        }
                        dialog.dismiss();
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.lockDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(activity.getSupportFragmentManager());
            }
        }
    }

    private final void showSwitchModeDialog(FragmentActivity activity) {
        CommonDialog<?> commonDialog = this.switchModeDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            View viewInflate = getLayoutInflater().inflate(fvi.i0, (ViewGroup) null, false);
            final TextView textView = (TextView) viewInflate.findViewById(zri.S);
            final ImageView imageView = (ImageView) viewInflate.findViewById(zri.R);
            final RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(zri.Q);
            final TextView textView2 = (TextView) viewInflate.findViewById(zri.a0);
            final ImageView imageView2 = (ImageView) viewInflate.findViewById(zri.Z);
            final RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(zri.Y);
            Boolean value = getViewModel().isDynamicModel().getValue();
            if (value != null) {
                boolean zBooleanValue = value.booleanValue();
                relativeLayout.setSelected(zBooleanValue);
                textView.setSelected(zBooleanValue);
                imageView.setSelected(zBooleanValue);
                relativeLayout2.setSelected(!zBooleanValue);
                textView2.setSelected(!zBooleanValue);
                imageView2.setSelected(true ^ zBooleanValue);
            }
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: hbb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GymLaunchEcoSportActivity.showSwitchModeDialog$lambda$15(relativeLayout, textView, imageView, relativeLayout2, textView2, imageView2, view);
                }
            });
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: pbb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GymLaunchEcoSportActivity.showSwitchModeDialog$lambda$16(relativeLayout, textView, imageView, relativeLayout2, textView2, imageView2, view);
                }
            });
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(e1j.y4).setPositiveText(e1j.S).setNegativeText(e1j.Q).setCustomView(viewInflate).create();
            this.switchModeDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.switchModeDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.showSwitchModeDialog.4
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            Boolean value2 = GymLaunchEcoSportActivity.this.getViewModel().isDynamicModel().getValue();
                            if (value2 != null) {
                                RelativeLayout relativeLayout3 = relativeLayout;
                                GymLaunchEcoSportActivity gymLaunchEcoSportActivity = GymLaunchEcoSportActivity.this;
                                if (value2.booleanValue() != relativeLayout3.isSelected()) {
                                    gymLaunchEcoSportActivity.switchBikeModeAction();
                                }
                            }
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                        }
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.switchModeDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(activity.getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSwitchModeDialog$lambda$15(RelativeLayout relativeLayout, TextView textView, ImageView imageView, RelativeLayout relativeLayout2, TextView textView2, ImageView imageView2, View view) {
        relativeLayout.setSelected(true);
        textView.setSelected(true);
        imageView.setSelected(true);
        relativeLayout2.setSelected(false);
        textView2.setSelected(false);
        imageView2.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSwitchModeDialog$lambda$16(RelativeLayout relativeLayout, TextView textView, ImageView imageView, RelativeLayout relativeLayout2, TextView textView2, ImageView imageView2, View view) {
        relativeLayout.setSelected(false);
        textView.setSelected(false);
        imageView.setSelected(false);
        relativeLayout2.setSelected(true);
        textView2.setSelected(true);
        imageView2.setSelected(true);
    }

    private final void showUpdateDialog(final FragmentActivity activity, final LocalDeviceUpgradeModel.CheckUpgradeRequest versionInfo) {
        EcoDeviceInfo deviceInfo;
        if (this.showUpdateDialog) {
            return;
        }
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        CommonDialog commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(e1j.w3).setDialogDescriptionString(new DialogParams.DialogDescriptionString(e1j.v3, (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getName())).setNegativeText(e1j.Q).setPositiveText(e1j.S).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.showUpdateDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    EcoDeviceInfo deviceInfo2;
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        SportPreference.INSTANCE.setKEY_BG_PERMISSION(true);
                        ControlHolder controlHolder = this.controlHolder;
                        if (controlHolder != null) {
                            controlHolder.refreshConnectState();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (!versionInfo.isOwner) {
                        this.showCannotUpdateDialog(activity);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_param1", versionInfo);
                    GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                    EcoDeviceModel ecoDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
                    String mac = null;
                    bundle.putString("key_param2", ecoDeviceModelCurGymDeviceModel != null ? ecoDeviceModelCurGymDeviceModel.getDid() : null);
                    EcoDeviceModel ecoDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
                    if (ecoDeviceModelCurGymDeviceModel2 != null && (deviceInfo2 = ecoDeviceModelCurGymDeviceModel2.getDeviceInfo()) != null) {
                        mac = deviceInfo2.getMac();
                    }
                    bundle.putString("mac", mac);
                    FragmentParams fragmentParamsB = new FragmentParams.b().e(LocalDeviceUpdateFragment.class).c(bundle).a(true).b();
                    Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
                    dih.a().e((Context) new WeakReference(activity).get(), fragmentParamsB);
                }
            });
        }
        WeakReference weakReference = new WeakReference(activity);
        if (commonDialogCreate != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
            commonDialogCreate.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
        }
        this.showUpdateDialog = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchBikeModeAction() {
        if (!isLoadingShowing()) {
            showLoading(e1j.g, false);
        }
        getViewModel().setEcoSettingItem(5, !Intrinsics.areEqual(getViewModel().isDynamicModel().getValue(), Boolean.TRUE) ? 1 : 0, new Function2() { // from class: tbb
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GymLaunchEcoSportActivity.switchBikeModeAction$lambda$19(this.f34535a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchBikeModeAction$lambda$19(GymLaunchEcoSportActivity this$0, boolean z, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new GymLaunchEcoSportActivity$switchBikeModeAction$1$1(this$0, i, null), 3, null);
        } else {
            CommonDialog<DialogParams> commonDialog = this$0.mSportSwitchExceptionDialog;
            if (commonDialog != null && !commonDialog.isShowing()) {
                CommonDialog<DialogParams> commonDialog2 = this$0.mSportSwitchExceptionDialog;
                Intrinsics.checkNotNull(commonDialog2);
                commonDialog2.showIfNeed(this$0.getSupportFragmentManager());
            }
            this$0.dismissDialog();
        }
        return Unit.INSTANCE;
    }

    private final void syncFtpValueToMachine() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            return;
        }
        if (!SportDeviceModel.INSTANCE.isSupportFtpMachine()) {
            FitnessLogUtils.i(TAG, "不支持同步给设备FTP");
            return;
        }
        int key_gym_local_last_ftp_result = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_LAST_FTP_RESULT();
        if (key_gym_local_last_ftp_result < 100) {
            key_gym_local_last_ftp_result = 100;
        }
        getViewModel().setFtpResult(key_gym_local_last_ftp_result, new Function1() { // from class: qbb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchEcoSportActivity.syncFtpValueToMachine$lambda$11(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncFtpValueToMachine$lambda$11(int i) {
        FitnessLogUtils.i(TAG, "同步给设备FTP值结果：" + i);
        return Unit.INSTANCE;
    }

    private final void syncRopeUserInfo() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            return;
        }
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        gymDeviceModel.syncTime(this.localSportType);
        gymDeviceModel.setUserProfile(this.localSportType);
    }

    private final void unregisterLockScreenReceiver() {
        LockScreenReceiver.INSTANCE.unregisterPhoneListener();
        unregisterReceiver(getLockScreenReceiver());
        FitnessLogUtils.d(TAG, "lockScreenReceiver successfully unregistered!!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void upFtpValue() {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isSupportFtpMachine()) {
            int key_gym_local_ftp_result = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_FTP_RESULT();
            if (key_gym_local_ftp_result > 0) {
                ((LaunchSportVM) getMViewModel()).uploadFtpValue(key_gym_local_ftp_result);
                return;
            }
            return;
        }
        FitnessLogUtils.i(TAG, "upFtpValue isSupportFtpMachine : " + sportDeviceModel.isSupportFtpMachine());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateRopeSkippingBg() {
        ((pi0) getMBinding()).A.setBackgroundResource(cki.j);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, gki.f19086k)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    private final void updateTitleContent(boolean r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.updateTitleContent(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LaunchSportVM viewModel_delegate$lambda$0(GymLaunchEcoSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LaunchSportVM) new ViewModelProvider(this$0).get(LaunchSportVM.class);
    }

    public final void checkUpdate(@NotNull final FragmentActivity activity) {
        String did;
        Intrinsics.checkNotNullParameter(activity, "activity");
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (ecoDeviceModelCurGymDeviceModel == null || (did = ecoDeviceModelCurGymDeviceModel.getDid()) == null) {
            return;
        }
        LocalSportSettingRequestKt.getInstance(LocalSportSettingRequest.INSTANCE).getDeviceVersionInfo(did, new Function1() { // from class: sbb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchEcoSportActivity.checkUpdate$lambda$10$lambda$9(this.f33480a, activity, (DeviceVersionInfo) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void ecoDeviceFault(int code) {
        FitnessLogUtils.i(TAG, "故障处理" + code);
        if (code != 4) {
            showDeviceExceptionDialog(DeviceExceptionUtil.getExceptionTitleByCode(code), DeviceExceptionUtil.getExceptionDesByCode(code));
            return;
        }
        FitnessLogUtils.i(TAG, "ecoDeviceFault >>> code = " + code);
        if (this.mSelfGenerationFailureDialog == null) {
            initSelfGenerationFailureDialog(DeviceExceptionUtil.getExceptionTitleByCode(4), DeviceExceptionUtil.getExceptionDesByCode(4));
        }
        CommonDialog<DialogParams> commonDialog = this.mSelfGenerationFailureDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.f18290a;
    }

    public final boolean getShowUpdateDialog() {
        return this.showUpdateDialog;
    }

    @Nullable
    public final CommonDialog<?> getSwitchModeDialog() {
        return this.switchModeDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    public final void gotoEnvironmental() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(e1j.y0);
            return;
        }
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) EcoEnvironmentalActivity.class);
        intent.addFlags(268435456);
        EnvironmentalVO environmentalVO = this.mEnvironmental;
        intent.putExtra(EcoEnvironmentalActivity.TOTAL, environmentalVO != null ? environmentalVO.getTotal() : null);
        app.startActivity(intent);
    }

    public final void gotoRopeSportHistory() {
        Application app = AppUtil.getApp();
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(getFitnessSportType(this.localSportType));
        Intrinsics.checkNotNull(sportReportKey);
        String category = sportReportKey.getCategory();
        Logger.i(TAG, "sportCategory " + category);
        SportRecordApi.DefaultImpls.goSportRecordList$default(SportRecordApiKt.getSportRecordApi(), app, null, category, null, 8, null);
    }

    public final void initView() {
        initTitle();
        initDialog();
        initRecyclerView();
        if (!SportDeviceModel.INSTANCE.isJump()) {
            checkInfo();
            return;
        }
        updateRopeSkippingBg();
        syncRopeUserInfo();
        checkJumpInfo();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(TAG, "did : " + did + " , onConnectFailure");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        if (did == null) {
            did = "";
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(did);
        if (ecoDeviceModel == null || !com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isLocalDevice(ecoDeviceModel)) {
            return;
        }
        updateTitleContent(false);
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.disconnect();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.d(TAG, "did : " + did + " ,onConnectStart");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(TAG, "did : " + did + " ,onConnectSuccess");
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isJump()) {
            this.localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
            TextView textView = this.titleConnect;
            if (textView != null) {
                textView.setText(getResources().getString(e1j.c0));
            }
            ControlHolder controlHolder = this.controlHolder;
            if (controlHolder != null) {
                controlHolder.connect();
            }
            ControlHolder controlHolder2 = this.controlHolder;
            if (controlHolder2 != null) {
                controlHolder2.updateGoalGymBg();
            }
            connectRopeSuccess();
            return;
        }
        this.isCheckOfflineData = false;
        this.isCheckEcoUpdateData = false;
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion);
        if (did == null) {
            did = "";
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(did);
        if (ecoDeviceModel != null && com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isLocalDevice(ecoDeviceModel)) {
            updateTitleContent(true);
            FitnessLogUtils.d(TAG, "SportState=" + getViewModel().getSportState());
            ControlHolder controlHolder3 = this.controlHolder;
            if (controlHolder3 != null) {
                controlHolder3.connect();
            }
            getViewModel().syncDeviceDynamicModeData();
        }
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected() && sportDeviceModel.isSupportCheckUploadMachine()) {
            checkUpdate(this);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.Hilt_GymLaunchEcoSportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        this.localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        initView();
        setListener();
        registerLockScreenReceiver();
        getViewModel().getFirstEmitter().observe(this, new GymLaunchEcoSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ibb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchEcoSportActivity.onCreate$lambda$3(this.f20966a, (CourseFirstPageData) obj);
            }
        }));
        getViewModel().getMoreEmitter().observe(this, new GymLaunchEcoSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jbb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchEcoSportActivity.onCreate$lambda$4(this.f22614a, (CourseMoreData) obj);
            }
        }));
        getViewModel().reqData(this.localSportType);
        if (SportDeviceModel.INSTANCE.isJump()) {
            getJumpGymState();
            return;
        }
        getGymState();
        observeViewModel();
        upFtpValue();
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.Hilt_GymLaunchEcoSportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (SportDeviceModel.INSTANCE.isJump(this.localSportType)) {
            Logger.i(TAG, "disconnectRopeSkipping model = " + this.localSportType);
            disconnectRopeSkipping();
        }
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this);
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setLocalReceiveListener(null);
        this.isCheckOfflineData = false;
        this.isCheckEcoUpdateData = false;
        unregisterLockScreenReceiver();
        CoroutineScopeKt.cancel$default(LifecycleOwnerKt.getLifecycleScope(this), null, 1, null);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.d(TAG, "did : " + did + " ,onDisconnect");
        this.isCheckOfflineData = false;
        this.isCheckEcoUpdateData = false;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        if (did == null) {
            did = "";
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(did);
        if (ecoDeviceModel == null || !com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isLocalDevice(ecoDeviceModel)) {
            return;
        }
        updateTitleContent(false);
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.disconnect();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void onLock(boolean isHasLock, int lockCode) {
        if (!isHasLock) {
            hideLockDialog();
        } else if (lockCode == 0) {
            showLockDialog(this, e1j.b4, e1j.a4);
        } else {
            if (lockCode != 1) {
                return;
            }
            showLockDialog(this, e1j.I1, e1j.H1);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void onModeSwitch(boolean isDynamicMode) {
        getViewModel().isDynamicModel().postValue(Boolean.valueOf(isDynamicMode));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isFront = false;
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (Intrinsics.areEqual(this.localSportType, "runmi.exbike.jscrm1")) {
            getViewModel().syncDeviceDynamicModeData();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
        this.isFront = true;
        refreshConnectState();
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isSupportFtpMachine()) {
            ((LaunchSportVM) getMViewModel()).getFtpHistoryList();
            FunctionListHolder functionListHolder = getFunctionListHolder();
            if (functionListHolder != null) {
                functionListHolder.setFtpTest(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_LAST_FTP_RESULT());
            }
            syncFtpValueToMachine();
        }
        if (sportDeviceModel.isSupportEnvironmentalMachine()) {
            ((LaunchSportVM) getMViewModel()).fetchEnvironmental();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        CommonDialog<DialogParams> commonDialog;
        CommonDialog<DialogParams> commonDialog2;
        super.onStop();
        CommonDialog<DialogParams> commonDialog3 = this.mSportSwitchExceptionDialog;
        if (commonDialog3 != null && commonDialog3.isShowing() && (commonDialog2 = this.mSportSwitchExceptionDialog) != null) {
            commonDialog2.dismiss();
        }
        CommonDialog<DialogParams> commonDialog4 = this.mSportDeviceExceptionDialog;
        if (commonDialog4 != null && commonDialog4.isShowing() && (commonDialog = this.mSportDeviceExceptionDialog) != null) {
            commonDialog.dismiss();
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        Logger.d("CourseGym", "onStop: mijia_treadmill_home_page, " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "mijia_treadmill_home_page"), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("tip", "56.2.2.1.19564")));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (this.controlHolder == null) {
            ControlHolder controlHolder = getAdapter().getControlHolder();
            this.controlHolder = controlHolder;
            if (controlHolder != null) {
                controlHolder.setProductOrder(this.productOrder);
            }
            refreshConnectState();
        }
        if (this.functionListHolder == null) {
            this.functionListHolder = getAdapter().getFunctionListHolder();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void setListener() {
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this);
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setLocalReceiveListener(this);
        getViewModel().addGymSportStartListener(new LaunchSportVM.GymSportStartListener() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity.setListener.1
            @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM.GymSportStartListener
            public void onStart() {
                if (!SportDeviceModel.INSTANCE.isJump()) {
                    GymDeviceModel.INSTANCE.preLaunchGym(GymLaunchEcoSportActivity.this, true, true);
                } else {
                    if (ViewUtil.INSTANCE.isFastStart()) {
                        return;
                    }
                    GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                    gymDeviceModel.dismissAllJumpDialog();
                    GymLaunchEcoSportActivity gymLaunchEcoSportActivity = GymLaunchEcoSportActivity.this;
                    gymDeviceModel.startJumping(gymLaunchEcoSportActivity, true, true, gymLaunchEcoSportActivity.localSportType, 0L, 0L);
                }
            }
        });
    }

    public final void setOpenFtpTest() {
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(e1j.y0);
            return;
        }
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) FtpTestIntroduceActivity.class);
        intent.addFlags(268435456);
        app.startActivity(intent);
    }

    public final void setShowUpdateDialog(boolean z) {
        this.showUpdateDialog = z;
    }

    public final void setSwitchModeDialog(@Nullable CommonDialog<?> commonDialog) {
        this.switchModeDialog = commonDialog;
    }

    public final void showSportBikeConnectionExceptionDialog() {
        CommonDialog<DialogParams> commonDialog = this.mSportBikeConnectionExceptionDialog;
        if (commonDialog == null || commonDialog.isShowing()) {
            return;
        }
        CommonDialog<DialogParams> commonDialog2 = this.mSportBikeConnectionExceptionDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    public final void switchBikeMode() {
        showSwitchModeDialog(this);
    }
}

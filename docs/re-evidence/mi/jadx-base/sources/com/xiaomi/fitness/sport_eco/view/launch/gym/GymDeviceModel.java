package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.mi.fitness.checkupdate.eco.EcoUpdateHelper;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fit.fitness.eco.sync.export.di.EcoFitnessSyncExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.ActivityStack;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.EcoDevicePreference;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.request.EnvironmentalRequest;
import com.xiaomi.fitness.sport_eco.utils.Constants;
import com.xiaomi.fitness.sport_eco.utils.SportPreference;
import com.xiaomi.fitness.sport_eco.utils.StringUtils;
import com.xiaomi.fitness.sport_eco.utils.WebViewUtilKt;
import com.xiaomi.fitness.sport_eco.view.goal.SportGoalSettingActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.data.GymReport;
import com.xiaomi.fitness.sport_eco.view.launch.gym.report.ReceiveSportReportActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.GuideWebViewActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco.view.widget.SportSubTitleDialog;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.av6;
import defpackage.bt7;
import defpackage.e1j;
import defpackage.fs9;
import defpackage.ft9;
import defpackage.fz7;
import defpackage.two;
import defpackage.u7r;
import defpackage.vr9;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bz\u0010\u0017J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\tJ)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010$\u001a\u00020\r2\u0016\u0010#\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!0 ¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110 ¢\u0006\u0004\b'\u0010(J7\u0010+\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\u00112\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010*¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b-\u0010\u0015J=\u00101\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.¢\u0006\u0004\b1\u00102JG\u00103\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b5\u00106J)\u00108\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u00107\u001a\f\u0012\u0006\b\u0001\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b8\u00109J'\u0010=\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010\u0017J\u0015\u0010@\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b@\u00106J\r\u0010A\u001a\u00020\r¢\u0006\u0004\bA\u0010\u0017J\u0015\u0010B\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bD\u0010EJ)\u0010G\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\r0*¢\u0006\u0004\bG\u0010HJ=\u0010L\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00112\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0J¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\r¢\u0006\u0004\bN\u0010\u0017J5\u0010O\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00192\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0J¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\r¢\u0006\u0004\bQ\u0010\u0017J\u0015\u0010R\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bR\u0010CJ\u0015\u0010S\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bS\u0010CJ?\u0010T\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\u00112\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010*¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\r¢\u0006\u0004\bV\u0010\u0017J\r\u0010W\u001a\u00020\r¢\u0006\u0004\bW\u0010\u0017J\u000f\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020:8\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR(\u0010g\u001a\b\u0012\u0002\b\u0003\u0018\u00010f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR.\u0010n\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030f\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR.\u0010t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030f\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010o\u001a\u0004\bu\u0010q\"\u0004\bv\u0010sR.\u0010w\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030f\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010o\u001a\u0004\bx\u0010q\"\u0004\by\u0010s¨\u0006{"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymDeviceModel;", "", "Lu7r;", "wearPacket", "Lfs9$a;", "handleGymSettingRequestResponse", "(Lu7r;)Lfs9$a;", "Lft9$a;", "handleGymSportReportList", "(Lu7r;)Lft9$a;", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "list", "", "showReportDialog", "(Landroidx/fragment/app/FragmentActivity;Lft9$a;)V", "getReportsFromGYM", "", "isDeviceLaunch", "isShowAnimation", "preLaunchJump", "(Landroidx/fragment/app/FragmentActivity;ZZ)V", "startGuide", "()V", "handleEcoGymSportReportList", "", "localSportType", "showEcoJumpReportDialog", "(Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lft9$a;)V", "getEcoReportsFromGYM", "isIdle", "()Z", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;", "", "Lfs9;", "callBack", "isGymUpdating", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "callback", "getGymLock", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "showDialog", "Lkotlin/Function1;", "checkGymOfflineReport", "(Landroidx/fragment/app/FragmentActivity;ZLkotlin/jvm/functions/Function1;)V", "preLaunchGym", "", SportConstants.KEY_TIMESTAMP, "timeZone", "launchGym", "(Landroidx/fragment/app/FragmentActivity;ZZJJ)V", "startJumping", "(Landroidx/fragment/app/FragmentActivity;ZZLjava/lang/String;JJ)V", "gotoGoal", "(Landroidx/fragment/app/FragmentActivity;)V", "gymSettingsList", "triggerGymLock", "(Landroidx/fragment/app/FragmentActivity;[Lfs9;)Z", "", "title", "detail", "showLockDialog", "(Landroidx/fragment/app/FragmentActivity;II)V", "hideLockDialog", "checkUpdate", "syncGymData", "syncRopeSkippingData", "(Ljava/lang/String;)V", "checkUpdateRope", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V", "success", "getBattery", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isForce", "Lkotlin/Function0;", "update", "showCheckUpdateDialog", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "dismissCheckUpdateDialog", "showLowRemindDialog", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "dismissLowRemindDialog", "syncTime", "setUserProfile", "checkEcoJumpOfflineReport", "(Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;ZLkotlin/jvm/functions/Function1;)V", "dissmissReportDialog", "dismissAllJumpDialog", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "curGymDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "GYM_UPDATING", "I", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "lockDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getLockDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setLockDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "Ljava/lang/ref/WeakReference;", "checkUpdateDialog", "Ljava/lang/ref/WeakReference;", "getCheckUpdateDialog", "()Ljava/lang/ref/WeakReference;", "setCheckUpdateDialog", "(Ljava/lang/ref/WeakReference;)V", "lowRemindDialog", "getLowRemindDialog", "setLowRemindDialog", "jumpReportDialog", "getJumpReportDialog", "setJumpReportDialog", "<init>", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGymDeviceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GymDeviceModel.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/GymDeviceModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1064:1\n13402#2,2:1065\n13402#2,2:1067\n13402#2,2:1069\n*S KotlinDebug\n*F\n+ 1 GymDeviceModel.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/GymDeviceModel\n*L\n329#1:1065,2\n575#1:1067,2\n1035#1:1069,2\n*E\n"})
public final class GymDeviceModel {
    public static final int GYM_UPDATING = 5;

    @NotNull
    public static final String TAG = "GymDeviceModel";

    @Nullable
    private static WeakReference<CommonDialog<?>> checkUpdateDialog;

    @Nullable
    private static WeakReference<CommonDialog<?>> jumpReportDialog;

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static CommonDialog<?> lockDialog;

    @Nullable
    private static WeakReference<CommonDialog<?>> lowRemindDialog;

    @NotNull
    public static final GymDeviceModel INSTANCE = new GymDeviceModel();

    @NotNull
    private static IEcoSportRemoteState sportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel$checkUpdateRope$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport_eco/view/launch/gym/GymDeviceModel$checkUpdateRope$1", "Lbt7;", "Ltwo;", "result", "", "onResult", "(Ltwo;)V", "", "errorCode", "onError", "(I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C31291 implements bt7<two> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ EcoDeviceModel $deviceModel;
        final /* synthetic */ String $localSportType;

        public C31291(EcoDeviceModel ecoDeviceModel, String str, FragmentActivity fragmentActivity) {
            this.$deviceModel = ecoDeviceModel;
            this.$localSportType = str;
            this.$activity = fragmentActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onResult$lambda$2(final FragmentActivity activity, final String localSportType, final Serializable result) {
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
            Intrinsics.checkNotNullParameter(result, "result");
            if (result instanceof LatestVersion) {
                LatestVersion latestVersion = (LatestVersion) result;
                if (latestVersion.getIsNeedUpdate()) {
                    GymDeviceModel.INSTANCE.showCheckUpdateDialog(activity, e1j.w3, ResourceExtKt.getString(e1j.v3, ResourceExtKt.getString(e1j.Y2)), latestVersion.getForce(), new Function0() { // from class: gbb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GymDeviceModel.C31291.onResult$lambda$2$lambda$1(localSportType, activity, result);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onResult$lambda$2$lambda$1(final String localSportType, final FragmentActivity activity, final Serializable result) {
            Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(result, "$result");
            GymDeviceModel.INSTANCE.getBattery(localSportType, new Function1() { // from class: dbb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.C31291.onResult$lambda$2$lambda$1$lambda$0(activity, result, localSportType, ((Integer) obj).intValue());
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onResult$lambda$2$lambda$1$lambda$0(FragmentActivity activity, Serializable result, String localSportType, int i) {
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(result, "$result");
            Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
            if (i <= 2) {
                EcoUpdateHelper.INSTANCE.showToast(activity, e1j.F3);
            } else {
                EcoUpdateHelper.INSTANCE.goRopeUpgradeFragment(activity, result, localSportType);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onResult$lambda$3(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        @Override // defpackage.bt7
        public void onError(int errorCode) {
            Logger.e("GymDeviceModel", "onError " + errorCode);
        }

        @Override // defpackage.bt7
        public void onResult(two result) {
            Intrinsics.checkNotNullParameter(result, "result");
            EcoUpdateHelper ecoUpdateHelper = EcoUpdateHelper.INSTANCE;
            EcoDeviceModel ecoDeviceModel = this.$deviceModel;
            final String str = this.$localSportType;
            final FragmentActivity fragmentActivity = this.$activity;
            ecoUpdateHelper.doCheckRopeUpdate(ecoDeviceModel, result, str, new Function1() { // from class: ebb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.C31291.onResult$lambda$2(fragmentActivity, str, (Serializable) obj);
                }
            }, new Function1() { // from class: fbb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.C31291.onResult$lambda$3((ApiException) obj);
                }
            });
        }
    }

    private GymDeviceModel() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkEcoJumpOfflineReport$default(GymDeviceModel gymDeviceModel, String str, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        gymDeviceModel.checkEcoJumpOfflineReport(str, fragmentActivity, z, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkGymOfflineReport$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        gymDeviceModel.checkGymOfflineReport(fragmentActivity, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getEcoReportsFromGYM(String localSportType, FragmentActivity activity, ft9.a list) {
        ArrayList arrayList = new ArrayList();
        ft9[] list2 = list.c;
        Intrinsics.checkNotNullExpressionValue(list2, "list");
        for (ft9 ft9Var : list2) {
            GymReport gymReport = new GymReport();
            gymReport.setIds(ft9Var.c);
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(ft9Var.c).order(ByteOrder.LITTLE_ENDIAN);
            int i = byteBufferOrder.getInt();
            byteBufferOrder.get();
            byteBufferOrder.get();
            int i2 = (byteBufferOrder.get() >> 2) & 15;
            gymReport.setStartTime(i);
            gymReport.setSportType(i2);
            gymReport.setDuration(ft9Var.f);
            gymReport.setDistance(ft9Var.g);
            arrayList.add(gymReport);
        }
        final Bundle bundle = new Bundle();
        bundle.putSerializable("GYM_REPORT", arrayList);
        bundle.putString(SportConstants.KEY_GYM_MODE_TYPE, localSportType);
        if (activity != null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) ReceiveSportReportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: abb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.getEcoReportsFromGYM$lambda$17(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEcoReportsFromGYM$lambda$17(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getReportsFromGYM(FragmentActivity activity, ft9.a list) {
        ArrayList arrayList = new ArrayList();
        ft9[] list2 = list.c;
        Intrinsics.checkNotNullExpressionValue(list2, "list");
        for (ft9 ft9Var : list2) {
            GymReport gymReport = new GymReport();
            gymReport.setIds(ft9Var.c);
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(ft9Var.c).order(ByteOrder.LITTLE_ENDIAN);
            int i = byteBufferOrder.getInt();
            byteBufferOrder.get();
            byteBufferOrder.get();
            int i2 = (byteBufferOrder.get() >> 2) & 15;
            gymReport.setStartTime(i);
            gymReport.setSportType(i2);
            gymReport.setDuration(ft9Var.f);
            gymReport.setDistance(ft9Var.g);
            arrayList.add(gymReport);
        }
        final Bundle bundle = new Bundle();
        bundle.putSerializable("GYM_REPORT", arrayList);
        if (activity != null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) ReceiveSportReportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: zab
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.getReportsFromGYM$lambda$1(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReportsFromGYM$lambda$1(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoGoal$lambda$11(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("DEVICE_TYPE", 1);
        it.putExtra("KEY_SPORT_TYPE", 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoGoal$lambda$12(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("DEVICE_TYPE", 1);
        it.putExtra("KEY_SPORT_TYPE", 7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoGoal$lambda$13(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("DEVICE_TYPE", 1);
        it.putExtra("KEY_SPORT_TYPE", 14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ft9.a handleEcoGymSportReportList(u7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w("GymDeviceModel", "ecoPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w("GymDeviceModel", "handleEcoGymSportReportList not fitness response type");
            return null;
        }
        vr9 vr9VarR = wearPacket.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("GymDeviceModel", "handleEcoGymSportReportList no fitness proto");
            return null;
        }
        ft9.a aVarA = vr9VarR.A();
        if (aVarA != null) {
            return aVarA;
        }
        FitnessLogUtils.w("GymDeviceModel", "handleEcoGymSportReportList no fitness sport response proto");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fs9.a handleGymSettingRequestResponse(u7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w("GymDeviceModel", "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w("GymDeviceModel", "not fitness response type");
            return null;
        }
        vr9 vr9VarR = wearPacket.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("GymDeviceModel", "no fitness proto");
            return null;
        }
        fs9.a aVarW = vr9VarR.w();
        if (aVarW != null) {
            return aVarW;
        }
        FitnessLogUtils.w("GymDeviceModel", "no fitness sport response proto");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ft9.a handleGymSportReportList(u7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w("GymDeviceModel", "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w("GymDeviceModel", "not fitness response type");
            return null;
        }
        vr9 vr9VarR = wearPacket.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("GymDeviceModel", "no fitness proto");
            return null;
        }
        ft9.a aVarA = vr9VarR.A();
        if (aVarA != null) {
            return aVarA;
        }
        FitnessLogUtils.w("GymDeviceModel", "no fitness sport response proto");
        return null;
    }

    public static /* synthetic */ void launchGym$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, boolean z2, long j, long j2, int i, Object obj) {
        gymDeviceModel.launchGym(fragmentActivity, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$5(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$6(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$9(final FragmentActivity activity, final boolean z, final boolean z2, final String localSportType, final long j, final long j2, int i) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
        if (i == 0 || i == 1) {
            INSTANCE.showLowRemindDialog(activity, e1j.C3, ResourceExtKt.getString(e1j.E3), new Function0() { // from class: wab
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else if (i != 2) {
            INSTANCE.startJumping(activity, z, z2, localSportType, j, j2);
        } else {
            INSTANCE.showLowRemindDialog(activity, e1j.C3, ResourceExtKt.getString(e1j.D3), new Function0() { // from class: xab
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GymDeviceModel.launchGym$lambda$9$lambda$8(activity, z, z2, localSportType, j, j2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$9$lambda$8(FragmentActivity activity, boolean z, boolean z2, String localSportType, long j, long j2) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
        INSTANCE.startJumping(activity, z, z2, localSportType, j, j2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void preLaunchGym$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        gymDeviceModel.preLaunchGym(fragmentActivity, z, z2);
    }

    private final void preLaunchJump(final FragmentActivity activity, boolean isDeviceLaunch, boolean isShowAnimation) {
        if (!SportPreference.INSTANCE.getUSE_JUMP_BEFORE() && !isDeviceLaunch) {
            getBattery(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), new Function1() { // from class: yab
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.preLaunchJump$lambda$4(activity, ((Integer) obj).intValue());
                }
            });
        } else {
            if (GuideWebViewActivity.INSTANCE.isWelcome()) {
                return;
            }
            launchGym$default(this, activity, isDeviceLaunch, isShowAnimation, 0L, 0L, 24, null);
        }
    }

    public static /* synthetic */ void preLaunchJump$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        gymDeviceModel.preLaunchJump(fragmentActivity, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preLaunchJump$lambda$4(FragmentActivity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (i == 0 || i == 1) {
            INSTANCE.showLowRemindDialog(activity, e1j.C3, ResourceExtKt.getString(e1j.E3), new Function0() { // from class: bbb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else if (i != 2) {
            INSTANCE.startGuide();
        } else {
            INSTANCE.showLowRemindDialog(activity, e1j.C3, ResourceExtKt.getString(e1j.D3), new Function0() { // from class: cbb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GymDeviceModel.preLaunchJump$lambda$4$lambda$3();
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preLaunchJump$lambda$4$lambda$3() {
        INSTANCE.startGuide();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEcoJumpReportDialog(final String localSportType, final FragmentActivity activity, final ft9.a list) {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2;
        CommonDialog<?> commonDialog3;
        if (ActivityStack.INSTANCE.getTopActivity() instanceof JumpingActivity) {
            Logger.i("GymDeviceModel", "showEcoJumpReportDialog topActivity is JumpingActivity");
            return;
        }
        WeakReference<CommonDialog<?>> weakReference = jumpReportDialog;
        if (weakReference == null || (commonDialog3 = weakReference.get()) == null || !commonDialog3.isShowing()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(ResourceExtKt.getString(e1j.O2), Arrays.copyOf(new Object[]{ApplicationExtKt.getApplication().getResources().getString(e1j.Y2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = String.format(ResourceExtKt.getString(e1j.H3), Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            WeakReference<CommonDialog<?>> weakReference2 = new WeakReference<>(SportSubTitleDialog.INSTANCE.defaultBuilder("jump_report").setDialogTitle(e1j.N2).setSubTitle(str + "\n" + str2).setPositiveText(e1j.S).setNegativeText(e1j.Q).setItems(new String[]{"  " + ApplicationExtKt.getApplication().getResources().getString(e1j.y)}).setItemsChoices(new boolean[]{false}).create());
            jumpReportDialog = weakReference2;
            CommonDialog<?> commonDialog4 = weakReference2.get();
            if (commonDialog4 != null) {
                commonDialog4.setCancelable(true);
            }
            WeakReference<CommonDialog<?>> weakReference3 = jumpReportDialog;
            if (weakReference3 != null && (commonDialog2 = weakReference3.get()) != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.showEcoJumpReportDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            GymDeviceModel.INSTANCE.getEcoReportsFromGYM(localSportType, activity, list);
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                        }
                        if (which != -2 || dialog == null) {
                            return;
                        }
                        dialog.dismiss();
                    }

                    @Override // defpackage.av6
                    public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                        super.onDialogMultiClick(dialogName, which, isChecked);
                        SportPreference.INSTANCE.setGYM_JUMP_REPORT_REMIND(!isChecked);
                    }
                });
            }
            WeakReference<CommonDialog<?>> weakReference4 = jumpReportDialog;
            if (weakReference4 == null || (commonDialog = weakReference4.get()) == null) {
                return;
            }
            commonDialog.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showReportDialog(final FragmentActivity activity, final ft9.a list) {
        EcoDevicePreference ecoDevicePreference = EcoDevicePreference.INSTANCE;
        String eco_connected_device_name = StringUtils.isNotBlank(ecoDevicePreference.getECO_CONNECTED_DEVICE_NAME()) ? ecoDevicePreference.getECO_CONNECTED_DEVICE_NAME() : ResourceExtKt.getString(e1j.F0);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(ResourceExtKt.getString(e1j.O2), Arrays.copyOf(new Object[]{eco_connected_device_name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format(ResourceExtKt.getString(e1j.q4), Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        SportSubTitleDialog sportSubTitleDialogCreate = SportSubTitleDialog.INSTANCE.defaultBuilder("gym_report").setDialogTitle(e1j.N2).setSubTitle(str + "\n" + str2).setPositiveText(e1j.S).setNegativeText(e1j.Q).setItems(new String[]{"  " + ApplicationExtKt.getApplication().getResources().getString(e1j.y)}).setItemsChoices(new boolean[]{false}).create();
        if (sportSubTitleDialogCreate != null) {
            sportSubTitleDialogCreate.setCancelable(true);
        }
        if (sportSubTitleDialogCreate != null) {
            sportSubTitleDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.showReportDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        GymDeviceModel.INSTANCE.getReportsFromGYM(activity, list);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                    if (which != -2 || dialog == null) {
                        return;
                    }
                    dialog.dismiss();
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    super.onDialogMultiClick(dialogName, which, isChecked);
                    SportPreference.INSTANCE.setGYM_REPORT_REMIND(!isChecked);
                }
            });
        }
        if (sportSubTitleDialogCreate != null) {
            sportSubTitleDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
        }
    }

    private final void startGuide() {
        String model;
        Constants constants = Constants.INSTANCE;
        String currentLocale = LocaleUtil.getCurrentLocale();
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(localDeviceModel)) == null) {
            model = "";
        }
        WebViewUtilKt.startWebView$default(constants.getUserGuideUrl(currentLocale, model), null, false, false, 10, null);
        SportPreference.INSTANCE.setUSE_JUMP_BEFORE(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startJumping$lambda$10(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    public final void checkEcoJumpOfflineReport(@NotNull final String localSportType, @NotNull FragmentActivity activity, final boolean showDialog, @Nullable final Function1<? super Boolean, Unit> callback) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        Intrinsics.checkNotNullParameter(activity, "activity");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 6;
        final WeakReference weakReference = new WeakReference(activity);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.checkEcoJumpOfflineReport.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.d("GymDeviceModel", "checkEcoJumpOfflineReport onError " + code);
                Function1<Boolean, Unit> function1 = callback;
                if (function1 != null) {
                    function1.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.d("GymDeviceModel", "checkEcoJumpOfflineReport onSuccess " + result);
                AnyExtKt.main$default(null, new GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1(GymDeviceModel.INSTANCE.handleEcoGymSportReportList(result != null ? result.getPacket() : null), showDialog, localSportType, weakReference, callback, null), 1, null);
            }
        }, 0, 16, null);
    }

    public final void checkGymOfflineReport(@NotNull FragmentActivity activity, final boolean showDialog, @Nullable final Function1<? super Boolean, Unit> callback) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 6;
        final WeakReference weakReference = new WeakReference(activity);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.checkGymOfflineReport.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.d("GymDeviceModel", "checkGymOfflineReport onError code = " + code);
                AnyExtKt.main$default(null, new GymDeviceModel$checkGymOfflineReport$1$onError$1(callback, null), 1, null);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                FitnessLogUtils.d("GymDeviceModel", "checkGymOfflineReport onSuccess result = " + new Gson().toJson(result));
                ft9.a aVarHandleGymSportReportList = GymDeviceModel.INSTANCE.handleGymSportReportList(result != null ? result.getPacket() : null);
                FitnessLogUtils.d("GymDeviceModel", "handleGymSportReportList = " + aVarHandleGymSportReportList);
                AnyExtKt.main$default(null, new GymDeviceModel$checkGymOfflineReport$1$onSuccess$1(aVarHandleGymSportReportList, showDialog, weakReference, callback, null), 1, null);
            }
        }, 0, 16, null);
    }

    public final void checkUpdate(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void checkUpdateRope(@NotNull FragmentActivity activity, @NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            Logger.d("GymDeviceModel", "checkUpdateRope no network");
            return;
        }
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        if (localDeviceModel != null) {
            com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getRopeInfo(localDeviceModel, new C31291(localDeviceModel, localSportType, activity));
        }
    }

    @Nullable
    public final EcoDeviceModel curGymDeviceModel() {
        return EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
    }

    public final void dismissAllJumpDialog() {
        dismissCheckUpdateDialog();
        dismissLowRemindDialog();
        dissmissReportDialog();
    }

    public final void dismissCheckUpdateDialog() {
        CommonDialog<?> commonDialog;
        WeakReference<CommonDialog<?>> weakReference;
        CommonDialog<?> commonDialog2;
        WeakReference<CommonDialog<?>> weakReference2 = checkUpdateDialog;
        if (weakReference2 == null || (commonDialog = weakReference2.get()) == null || !commonDialog.isShowing() || (weakReference = checkUpdateDialog) == null || (commonDialog2 = weakReference.get()) == null) {
            return;
        }
        commonDialog2.dismissAllowingStateLoss();
    }

    public final void dismissLowRemindDialog() {
        CommonDialog<?> commonDialog;
        WeakReference<CommonDialog<?>> weakReference;
        CommonDialog<?> commonDialog2;
        WeakReference<CommonDialog<?>> weakReference2 = lowRemindDialog;
        if (weakReference2 == null || (commonDialog = weakReference2.get()) == null || !commonDialog.isShowing() || (weakReference = lowRemindDialog) == null || (commonDialog2 = weakReference.get()) == null) {
            return;
        }
        commonDialog2.dismissAllowingStateLoss();
    }

    public final void dissmissReportDialog() {
        CommonDialog<?> commonDialog;
        WeakReference<CommonDialog<?>> weakReference;
        CommonDialog<?> commonDialog2;
        WeakReference<CommonDialog<?>> weakReference2 = jumpReportDialog;
        if (weakReference2 == null || (commonDialog = weakReference2.get()) == null || !commonDialog.isShowing() || (weakReference = jumpReportDialog) == null || (commonDialog2 = weakReference.get()) == null) {
            return;
        }
        commonDialog2.dismissAllowingStateLoss();
    }

    public final void getBattery(@NotNull String localSportType, @NotNull final Function1<? super Integer, Unit> success) {
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        Intrinsics.checkNotNullParameter(success, "success");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        if (localDeviceModel != null) {
            com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getBattery(localDeviceModel, new bt7<fz7>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.getBattery.1
                @Override // defpackage.bt7
                public void onError(int errorCode) {
                    Logger.e("GymDeviceModel", "getBattery onError " + errorCode);
                    success.invoke2(-1);
                }

                @Override // defpackage.bt7
                public void onResult(fz7 result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Logger.d("GymDeviceModel", "getBattery battery = " + result.c);
                    success.invoke2(Integer.valueOf(result.c));
                }
            });
        }
    }

    @Nullable
    public final WeakReference<CommonDialog<?>> getCheckUpdateDialog() {
        return checkUpdateDialog;
    }

    public final void getGymLock(@NotNull FragmentActivity activity, @NotNull final DeviceTaskCallBack<Boolean> callback) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 67;
        final WeakReference weakReference = new WeakReference(activity);
        vr9 vr9Var = new vr9();
        fs9.a aVar = new fs9.a();
        aVar.c = fs9.n();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact ecoDeviceSyncExtKt = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        EcoDeviceContact.DefaultImpls.call$default(ecoDeviceSyncExtKt, (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.getGymLock.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                callback.onResult(Boolean.FALSE);
                FitnessLogUtils.i("GymDeviceModel", "get gym lock error , did : " + did + " , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                fs9.a aVarHandleGymSettingRequestResponse = gymDeviceModel.handleGymSettingRequestResponse(result != null ? result.getPacket() : null);
                Intrinsics.checkNotNull(aVarHandleGymSettingRequestResponse);
                callback.onResult(Boolean.valueOf(gymDeviceModel.triggerGymLock(weakReference.get(), aVarHandleGymSettingRequestResponse.c)));
            }
        }, 0, 16, null);
    }

    @Nullable
    public final WeakReference<CommonDialog<?>> getJumpReportDialog() {
        return jumpReportDialog;
    }

    @Nullable
    public final CommonDialog<?> getLockDialog() {
        return lockDialog;
    }

    @Nullable
    public final WeakReference<CommonDialog<?>> getLowRemindDialog() {
        return lowRemindDialog;
    }

    @NotNull
    public final IEcoSportRemoteState getSportStateCaller() {
        return sportStateCaller;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void gotoGoal(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        String key_gym_local_sport_type = sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE();
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(e1j.y0);
        }
        switch (key_gym_local_sport_type.hashCode()) {
            case -1798122615:
                if (!key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
                }
                LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: pab
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GymDeviceModel.gotoGoal$lambda$12((Intent) obj);
                    }
                });
                break;
            case -1454035281:
                if (!key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                }
                LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: pab
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GymDeviceModel.gotoGoal$lambda$12((Intent) obj);
                    }
                });
                break;
            case 405899618:
                if (!key_gym_local_sport_type.equals("yunmai.jmprope.sr803")) {
                }
                LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: qab
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GymDeviceModel.gotoGoal$lambda$13((Intent) obj);
                    }
                });
                break;
            case 405899619:
                if (!key_gym_local_sport_type.equals("yunmai.jmprope.sr804")) {
                }
                LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: qab
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GymDeviceModel.gotoGoal$lambda$13((Intent) obj);
                    }
                });
                break;
            case 405899620:
                if (!key_gym_local_sport_type.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                }
                LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: qab
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GymDeviceModel.gotoGoal$lambda$13((Intent) obj);
                    }
                });
                break;
            case 1396900280:
                if (key_gym_local_sport_type.equals("ksmb.treadmill.m1v1")) {
                    LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: oab
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return GymDeviceModel.gotoGoal$lambda$11((Intent) obj);
                        }
                    });
                    break;
                }
                break;
        }
    }

    public final void hideLockDialog() {
        CommonDialog<?> commonDialog = lockDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    public final void isGymUpdating(@NotNull final DeviceTaskCallBack<fs9[]> callBack) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 67;
        vr9 vr9Var = new vr9();
        fs9.a aVar = new fs9.a();
        aVar.c = fs9.n();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact ecoDeviceSyncExtKt = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        EcoDeviceContact.DefaultImpls.call$default(ecoDeviceSyncExtKt, (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.isGymUpdating.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                callBack.onError(code);
                FitnessLogUtils.i("GymDeviceModel", "gym isUpdating error , did : " + did + " , code : " + code);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                vr9 vr9VarR;
                fs9.a aVarW;
                vr9 vr9VarR2;
                fs9VarArr = null;
                fs9VarArr = null;
                fs9[] fs9VarArr = null;
                if ((result != null ? result.getPacket() : null) != null) {
                    u7r packet = result.getPacket();
                    if ((packet != null ? packet.r() : null) != null) {
                        u7r packet2 = result.getPacket();
                        if (((packet2 == null || (vr9VarR2 = packet2.r()) == null) ? null : vr9VarR2.w()) != null) {
                            u7r packet3 = result.getPacket();
                            if (packet3 != null && (vr9VarR = packet3.r()) != null && (aVarW = vr9VarR.w()) != null) {
                                fs9VarArr = aVarW.c;
                            }
                            Intrinsics.checkNotNull(fs9VarArr);
                            callBack.onResult(fs9VarArr);
                            String string = Arrays.toString(fs9VarArr);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            FitnessLogUtils.i("GymDeviceModel", string);
                            return;
                        }
                    }
                }
                FitnessLogUtils.i("GymDeviceModel", "getGYMSettings failure:" + (result != null ? Integer.valueOf(result.getCode()) : null));
                callBack.onError(result != null ? result.getCode() : -1);
            }
        }, 0, 16, null);
    }

    public final boolean isIdle() {
        return sportStateCaller.getSportState() == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if (r9.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r9.equals("yunmai.jmprope.sr804") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r9.equals("yunmai.jmprope.sr803") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        getBattery(r9, new defpackage.uab(r13, r14, r15, r9, r16, r18));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void launchGym(@org.jetbrains.annotations.NotNull final androidx.fragment.app.FragmentActivity r13, final boolean r14, final boolean r15, final long r16, final long r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.launchGym(androidx.fragment.app.FragmentActivity, boolean, boolean, long, long):void");
    }

    public final void preLaunchGym(@NotNull FragmentActivity activity, boolean isDeviceLaunch, boolean isShowAnimation) {
        String model;
        Intrinsics.checkNotNullParameter(activity, "activity");
        FitnessLogUtils.i("GymDeviceModel", "preLaunchGym");
        if (SportDeviceModel.INSTANCE.isJump()) {
            preLaunchJump(activity, isDeviceLaunch, isShowAnimation);
            return;
        }
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (sportPreference.getUSE_TREADMILL_BEFORE() || isDeviceLaunch) {
            if (GuideWebViewActivity.INSTANCE.isWelcome()) {
                return;
            }
            launchGym$default(this, activity, isDeviceLaunch, isShowAnimation, 0L, 0L, 24, null);
            return;
        }
        Constants constants = Constants.INSTANCE;
        String currentLocale = LocaleUtil.getCurrentLocale();
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(localDeviceModel)) == null) {
            model = "";
        }
        String userGuideUrl = constants.getUserGuideUrl(currentLocale, model);
        FitnessLogUtils.d("GymDeviceModel", "guide url = " + userGuideUrl);
        WebViewUtilKt.startWebView$default(userGuideUrl, null, false, false, 10, null);
        sportPreference.setUSE_TREADMILL_BEFORE(true);
    }

    public final void setCheckUpdateDialog(@Nullable WeakReference<CommonDialog<?>> weakReference) {
        checkUpdateDialog = weakReference;
    }

    public final void setJumpReportDialog(@Nullable WeakReference<CommonDialog<?>> weakReference) {
        jumpReportDialog = weakReference;
    }

    public final void setLockDialog(@Nullable CommonDialog<?> commonDialog) {
        lockDialog = commonDialog;
    }

    public final void setLowRemindDialog(@Nullable WeakReference<CommonDialog<?>> weakReference) {
        lowRemindDialog = weakReference;
    }

    public final void setSportStateCaller(@NotNull IEcoSportRemoteState iEcoSportRemoteState) {
        Intrinsics.checkNotNullParameter(iEcoSportRemoteState, "<set-?>");
        sportStateCaller = iEcoSportRemoteState;
    }

    public final void setUserProfile(@NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        if (localDeviceModel != null) {
            com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.setUserProfile(localDeviceModel, UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getWeight());
        }
    }

    public final void showCheckUpdateDialog(@Nullable FragmentActivity activity, int title, @NotNull String detail, boolean isForce, @NotNull final Function0<Unit> update) {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2;
        CommonDialog<?> commonDialog3;
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(update, "update");
        if (ActivityStack.INSTANCE.getTopActivity() instanceof JumpingActivity) {
            Logger.i("GymDeviceModel", "showCheckUpdateDialog topActivity is JumpingActivity");
            return;
        }
        WeakReference<CommonDialog<?>> weakReference = checkUpdateDialog;
        if (weakReference == null || (commonDialog3 = weakReference.get()) == null || !commonDialog3.isShowing()) {
            CommonDialog.c positiveText = new CommonDialog.c("checkUpdate").setDialogTitle(title).setDialogDescriptionString(new DialogParams.DialogDescriptionString(detail)).setPositiveText(e1j.common_update);
            if (!isForce) {
                positiveText.setNegativeText(e1j.Z4);
            }
            WeakReference<CommonDialog<?>> weakReference2 = new WeakReference<>(positiveText.create());
            checkUpdateDialog = weakReference2;
            CommonDialog<?> commonDialog4 = weakReference2.get();
            if (commonDialog4 != null) {
                commonDialog4.setCancelable(false);
            }
            WeakReference<CommonDialog<?>> weakReference3 = checkUpdateDialog;
            if (weakReference3 != null && (commonDialog2 = weakReference3.get()) != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.showCheckUpdateDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            update.invoke();
                        }
                    }
                });
            }
            WeakReference weakReference4 = new WeakReference(activity);
            WeakReference<CommonDialog<?>> weakReference5 = checkUpdateDialog;
            if (weakReference5 == null || (commonDialog = weakReference5.get()) == null) {
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) weakReference4.get();
            commonDialog.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
        }
    }

    public final void showLockDialog(@Nullable FragmentActivity activity, int title, int detail) {
        CommonDialog<?> commonDialog = lockDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(title).setDialogDescription(detail).setPositiveText(e1j.S).create();
            lockDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = lockDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.showLockDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which != -1 || dialog == null) {
                            return;
                        }
                        dialog.dismiss();
                    }
                });
            }
            WeakReference weakReference = new WeakReference(activity);
            CommonDialog<?> commonDialog3 = lockDialog;
            if (commonDialog3 != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                commonDialog3.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
            }
        }
    }

    public final void showLowRemindDialog(@Nullable FragmentActivity activity, int title, @NotNull String detail, @NotNull final Function0<Unit> success) {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2;
        CommonDialog<?> commonDialog3;
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(success, "success");
        WeakReference<CommonDialog<?>> weakReference = lowRemindDialog;
        if (weakReference == null || (commonDialog3 = weakReference.get()) == null || !commonDialog3.isShowing()) {
            WeakReference<CommonDialog<?>> weakReference2 = new WeakReference<>(new CommonDialog.c("lowRemind").setDialogTitle(title).setDialogDescriptionString(new DialogParams.DialogDescriptionString(detail)).setPositiveText(e1j.T1).create());
            lowRemindDialog = weakReference2;
            CommonDialog<?> commonDialog4 = weakReference2.get();
            if (commonDialog4 != null) {
                commonDialog4.setCancelable(false);
            }
            WeakReference<CommonDialog<?>> weakReference3 = lowRemindDialog;
            if (weakReference3 != null && (commonDialog2 = weakReference3.get()) != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.showLowRemindDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
                            if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
                                return;
                            }
                            success.invoke();
                        }
                    }
                });
            }
            WeakReference weakReference4 = new WeakReference(activity);
            WeakReference<CommonDialog<?>> weakReference5 = lowRemindDialog;
            if (weakReference5 == null || (commonDialog = weakReference5.get()) == null) {
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) weakReference4.get();
            commonDialog.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
        }
    }

    public final void startJumping(@NotNull FragmentActivity activity, boolean isDeviceLaunch, boolean isShowAnimation, @NotNull String localSportType, long timeStamp, long timeZone) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        final Bundle bundle = new Bundle();
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", isDeviceLaunch);
        bundle.putInt("DEVICE_TYPE", 1);
        bundle.putBoolean("IS_SHOW_ANIMATION", isShowAnimation);
        bundle.putInt("KEY_SPORT_TYPE", 14);
        bundle.putString(SportConstants.KEY_GYM_MODE_TYPE, localSportType);
        bundle.putInt(SportConstants.TRAINING_MODE, 0);
        bundle.putLong(SportConstants.KEY_TIMESTAMP, timeStamp);
        bundle.putLong("timeZone", timeZone);
        LaunchExtensionKt.startActivity(activity, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: rab
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymDeviceModel.startJumping$lambda$10(bundle, (Intent) obj);
            }
        });
    }

    public final void syncGymData() {
        String did;
        EcoDeviceInfo deviceInfo;
        FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "连接后开始同步");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
            did = "";
        }
        if (did.length() == 0) {
            FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "拒绝同步本地设备数据,因did为空");
        } else {
            EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE).syncData(did, new EcoDeviceSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel.syncGymData.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
                public void onSyncError(String did2, int type, String errorInfo) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "did= (" + did2 + "),连接后同步失败，errorInfo is ：" + errorInfo);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
                public void onSyncSuccess(String did2, int type, Object result) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    FitnessLogUtils.i(GymLaunchEcoSportActivity.TAG, "did= (" + did2 + "),连接后同步成功");
                    EnvironmentalRequest environmentalRequest = new EnvironmentalRequest();
                    SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
                    int key_gym_environmental_value = sportManagerExportPreference.getKEY_GYM_ENVIRONMENTAL_VALUE();
                    long key_gym_environmental_time = sportManagerExportPreference.getKEY_GYM_ENVIRONMENTAL_TIME();
                    long key_gym_environmental_update_time = sportManagerExportPreference.getKEY_GYM_ENVIRONMENTAL_UPDATE_TIME();
                    if (key_gym_environmental_value == -1 || key_gym_environmental_time == key_gym_environmental_update_time) {
                        return;
                    }
                    ScopeExtKt.scopeNet$default(null, new GymDeviceModel$syncGymData$1$onSyncSuccess$1(environmentalRequest, key_gym_environmental_value, key_gym_environmental_time, null), 1, null);
                }
            });
        }
    }

    public final void syncRopeSkippingData(@NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        Logger.i("GymDeviceModel", "syncRopeSkippingData");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        if (localDeviceModel != null) {
            EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE).syncData(localDeviceModel.getDid(), new EcoDeviceSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel$syncRopeSkippingData$1$1
                @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
                public void onSyncError(String did, int type, String errorInfo) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    Logger.i("GymDeviceModel", "syncRopeSkippingData onSyncError");
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
                public void onSyncSuccess(String did, int type, Object result) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    Logger.i("GymDeviceModel", "syncRopeSkippingData onSyncSuccess");
                }
            });
        }
    }

    public final void syncTime(@NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        if (localDeviceModel != null) {
            com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.syncTime(localDeviceModel);
        }
    }

    public final boolean triggerGymLock(@Nullable FragmentActivity activity, @Nullable fs9[] gymSettingsList) {
        if (gymSettingsList == null) {
            return false;
        }
        for (fs9 fs9Var : gymSettingsList) {
            int i = fs9Var.c;
            if (i != 1) {
                if (i == 2 && fs9Var.d == 1) {
                    INSTANCE.showLockDialog(activity, e1j.I1, e1j.H1);
                    return true;
                }
            } else if (fs9Var.d == 1) {
                INSTANCE.showLockDialog(activity, e1j.b4, e1j.a4);
                return true;
            }
        }
        return false;
    }
}

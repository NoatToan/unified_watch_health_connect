package com.xiaomi.fitness.sport_eco.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.sport_eco.bean.LaunchSportTrackBean;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.data.UISportState;
import com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.model.SportModel;
import com.xiaomi.fitness.sport_eco.utils.AppSportTracker;
import com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.e1j;
import defpackage.j7r;
import defpackage.m0d;
import defpackage.mcn;
import defpackage.oe4;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 ³\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u0007:\u0002³\u0001B\b¢\u0006\u0005\b²\u0001\u0010\u000eJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J/\u0010-\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u0010\u000eJ\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u000eJ!\u00106\u001a\u00020\n2\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u0010\u000eJ\u001f\u0010<\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010;\u001a\u000202¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u00192\u0006\u0010C\u001a\u00020\u0019H\u0016¢\u0006\u0004\bD\u0010EJ1\u0010H\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u00192\u0006\u0010C\u001a\u00020\u00192\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020(H\u0016¢\u0006\u0004\bH\u0010IJ!\u0010J\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u00192\u0006\u0010C\u001a\u00020\u0019H\u0016¢\u0006\u0004\bJ\u0010EJ!\u0010K\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u00192\u0006\u0010C\u001a\u00020\u0019H\u0016¢\u0006\u0004\bK\u0010EJ\r\u0010L\u001a\u00020\n¢\u0006\u0004\bL\u0010\u000eJ\r\u0010M\u001a\u00020\n¢\u0006\u0004\bM\u0010\u000eJ\r\u0010N\u001a\u000202¢\u0006\u0004\bN\u0010OR\"\u0010B\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010P\u001a\u0004\bQ\u0010\u001b\"\u0004\bR\u0010'R*\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010 R*\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010U\u001a\u0004\ba\u0010W\"\u0004\bb\u0010YR$\u0010:\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010$R\"\u0010g\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bg\u0010O\"\u0004\bi\u0010jR\"\u0010k\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010h\u001a\u0004\bk\u0010O\"\u0004\bl\u0010jR$\u0010n\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010t\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010h\u001a\u0004\bt\u0010O\"\u0004\bu\u0010jR\"\u0010v\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\"\u0010|\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010h\u001a\u0004\b|\u0010O\"\u0004\b}\u0010jR&\u0010)\u001a\u00020~8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b)\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R/\u0010\u0085\u0001\u001a\u00020\u00192\u0007\u0010\u0084\u0001\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010P\u001a\u0005\b\u0086\u0001\u0010\u001b\"\u0005\b\u0087\u0001\u0010'R&\u0010\u0088\u0001\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010h\u001a\u0005\b\u0089\u0001\u0010O\"\u0005\b\u008a\u0001\u0010jR&\u0010\u008b\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010P\u001a\u0005\b\u008c\u0001\u0010\u001b\"\u0005\b\u008d\u0001\u0010'R/\u0010\u008e\u0001\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010w\u001a\u0005\b\u008f\u0001\u0010y\"\u0005\b\u0090\u0001\u0010{R\u001d\u0010\u0091\u0001\u001a\u00020\u00198\u0016X\u0096D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010P\u001a\u0005\b\u0092\u0001\u0010\u001bR*\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R-\u0010+\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b+\u0010w\u001a\u0005\b\u009a\u0001\u0010y\"\u0005\b\u009b\u0001\u0010{R4\u0010\u009d\u0001\u001a\u00030\u009c\u00012\b\u0010\u0084\u0001\u001a\u00030\u009c\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R/\u0010£\u0001\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010w\u001a\u0005\b¤\u0001\u0010y\"\u0005\b¥\u0001\u0010{R/\u0010¦\u0001\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010w\u001a\u0005\b§\u0001\u0010y\"\u0005\b¨\u0001\u0010{R/\u0010©\u0001\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010w\u001a\u0005\bª\u0001\u0010y\"\u0005\b«\u0001\u0010{R!\u0010±\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001¨\u0006´\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel;", "M", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/sport_eco/interfaces/ISportDataListener;", "Lcom/xiaomi/fitness/sport_eco/bean/SportingData;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "setSportRemind", "()V", "startSport", "accidentFinishSport", "restartSport", "Lm0d;", "callback", "onViewRestart", "(Lm0d;)V", "onViewPaused", "resumeSport", "finishSport", "", "getDeviceDid", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "state", "setUISportStateChange", "(Lkotlin/jvm/functions/Function1;)V", "onCleared", "data", "onSuccess", "(Lcom/xiaomi/fitness/sport_eco/bean/SportingData;)V", "message", "onFail", "(Ljava/lang/String;)V", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "onSportRested", "", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "startTrack", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;", "sportData", "disconnect", "finishTrack", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;Z)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "did", "mac", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "disconnectOperate", "getReportData", "isValidSport", "()Z", "Ljava/lang/String;", "getDid", "setDid", "Landroidx/lifecycle/MutableLiveData;", "mData", "Landroidx/lifecycle/MutableLiveData;", "getMData", "()Landroidx/lifecycle/MutableLiveData;", "setMData", "(Landroidx/lifecycle/MutableLiveData;)V", "uiSportState", "Lkotlin/jvm/functions/Function1;", "getUiSportState", "()Lkotlin/jvm/functions/Function1;", "setUiSportState", "Loe4;", "connectState", "getConnectState", "setConnectState", "Lcom/xiaomi/fitness/sport_eco/bean/SportingData;", "getSportData", "()Lcom/xiaomi/fitness/sport_eco/bean/SportingData;", "setSportData", "isActivityFirstInit", "Z", "setActivityFirstInit", "(Z)V", "isCurWearDeviceSupportLaunchSport", "setCurWearDeviceSupportLaunchSport", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;", "goalRemind", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;", "getGoalRemind", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;", "setGoalRemind", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;)V", "isFinishRegular", "setFinishRegular", "pause", "I", "getPause", "()I", "setPause", "(I)V", "isLocalLaunch", "setLocalLaunch", "", "J", "getStartTime", "()J", "setStartTime", "(J)V", "value", "curDeviceDid", "getCurDeviceDid", "setCurDeviceDid", "disconnectFinishSport", "getDisconnectFinishSport", "setDisconnectFinishSport", "localSportType", "getLocalSportType", "setLocalSportType", "deviceType", "getDeviceType", "setDeviceType", "TAG", "getTAG", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;)V", "getSportType", "setSportType", "", "sportGoalValue", "F", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "sportGoalType", "getSportGoalType", "setSportGoalType", "trainingMode", "getTrainingMode", "setTrainingMode", "ecoDeviceFaultCode", "getEcoDeviceFaultCode", "setEcoDeviceFaultCode", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "scmDao", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BaseSportVM<M extends CommonSportModel> extends BaseViewModel<M> implements ISportDataListener<SportingData>, ISportStateChangedListener, OnEcoDeviceStatusListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int curState = 1;
    private int deviceType;
    private boolean disconnectFinishSport;

    @Nullable
    private GoalRemindData goalRemind;
    private boolean isFinishRegular;
    private boolean isLocalLaunch;
    private int pause;

    @Nullable
    private SportingData sportData;
    private float sportGoalValue;
    private int sportType;
    private long startTime;

    @Nullable
    private Function1<? super UISportState, Unit> uiSportState;

    @NotNull
    private String did = "xiaomiwear_app";

    @Nullable
    private MutableLiveData<SportingData> mData = new MutableLiveData<>();

    @Nullable
    private MutableLiveData<oe4> connectState = new MutableLiveData<>();
    private boolean isActivityFirstInit = true;
    private boolean isCurWearDeviceSupportLaunchSport = true;

    @NotNull
    private String curDeviceDid = "xiaomiwear_app";

    @NotNull
    private String localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();

    @NotNull
    private final String TAG = "EcoBaseSportVM";

    @NotNull
    private IEcoSportRemoteState sportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
    private int sportGoalType = -1;
    private int trainingMode = -1;
    private int ecoDeviceFaultCode = -1;

    /* JADX INFO: renamed from: scmDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fd2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseSportVM.scmDao_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/viewmodel/BaseSportVM$Companion;", "", "<init>", "()V", "curState", "", "getCurState", "()I", "setCurState", "(I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCurState() {
            return BaseSportVM.curState;
        }

        public final void setCurState(int i) {
            BaseSportVM.curState = i;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM$onSportStarted$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM$onSportStarted$1", f = "BaseSportVM.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $sportType;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM$onSportStarted$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM$onSportStarted$1$1", f = "BaseSportVM.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $sportType;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07891(int i, Continuation<? super C07891> continuation) {
                super(2, continuation);
                this.$sportType = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07891(this.$sportType, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                mcn sportRemindTable = SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getSportRemindTable(this.$sportType);
                Boolean boolBoxBoolean = sportRemindTable != null ? Boxing.boxBoolean(sportRemindTable.o) : null;
                SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setAutoPase(boolBoxBoolean != null ? boolBoxBoolean.booleanValue() : false);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31721(int i, Continuation<? super C31721> continuation) {
            super(2, continuation);
            this.$sportType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31721(this.$sportType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07891 c07891 = new C07891(this.$sportType, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07891, this) == coroutine_suspended) {
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
            return ((C31721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final SCMDao getScmDao() {
        return (SCMDao) this.scmDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$1(BaseSportVM this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isCurWearDeviceSupportLaunchSport = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    public final void accidentFinishSport() {
        FitnessLogUtils.i(getTAG(), "onDestroy , is stop the sporting : " + this.isFinishRegular);
        if (this.isFinishRegular) {
            return;
        }
        this.sportStateCaller.accidentFinishSport(this.curDeviceDid, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM.accidentFinishSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        FitnessLogUtils.i(getTAG(), "attach");
        getMModel().register(this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this);
        this.sportStateCaller.addSportStateChangedListener(getClass(), this);
        getMModel().refresh();
    }

    public final void disconnectOperate() {
        this.sportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final void finishSport() {
        this.sportStateCaller.finishSport(this.curDeviceDid, this.sportType, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM.finishSport.1
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(this.this$0.getTAG(), "onViewFinish");
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    public final void finishTrack(@Nullable SportData sportData, boolean disconnect) {
        String str;
        Integer numValueOf;
        String name;
        String strValueOf;
        String str2;
        LaunchSportTrackBean launchSportTrackBean = new LaunchSportTrackBean();
        launchSportTrackBean.setName("workout_finish");
        launchSportTrackBean.setExerciseResultPage(Boolean.valueOf(sportData != null));
        launchSportTrackBean.setResult(Boolean.valueOf(sportData != null && sportData.distance >= 100));
        String str3 = "";
        if (disconnect) {
            str = "连接断开";
        } else if (sportData == null) {
            str = "其他";
        } else {
            str = sportData.distance >= 100 ? "" : "数据太少";
        }
        launchSportTrackBean.setErrorInfo(str);
        int i = this.sportType;
        if (i == 1) {
            str3 = "outdoor_running";
        } else if (i == 2) {
            str3 = "outdoor_walking";
        } else if (i == 3) {
            str3 = this.deviceType == 1 ? "mijia_treadmill" : "indoor_running";
        } else if (i == 6) {
            str3 = "outdoor_cycling";
        } else if (i == 7) {
            str3 = "indoor_cycling";
        }
        launchSportTrackBean.setExerciseTypeDetail(str3);
        launchSportTrackBean.setDurationMin(Integer.valueOf(sportData != null ? sportData.totalTime / 60 : 0));
        launchSportTrackBean.setDistance(Float.valueOf(sportData != null ? sportData.distance / 1000 : 0.0f));
        int i2 = this.sportGoalType;
        String name2 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    numValueOf = 0;
                } else if (sportData != null) {
                    numValueOf = Integer.valueOf((int) ((sportData.cal / this.sportGoalValue) * 100));
                } else {
                    numValueOf = null;
                }
            } else if (sportData != null) {
                numValueOf = Integer.valueOf((int) ((sportData.totalTime / (this.sportGoalValue * 60)) * 100));
            } else {
                numValueOf = null;
            }
        } else if (sportData != null) {
            numValueOf = Integer.valueOf((int) (((sportData.distance / 1000.0f) / this.sportGoalValue) * 100));
        } else {
            numValueOf = null;
        }
        launchSportTrackBean.setTargetCompleteness(numValueOf);
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            name = ecoDeviceModel2 != null ? EcoDeviceModelExtKt.getName(ecoDeviceModel2) : null;
        }
        launchSportTrackBean.setDeviceModel(name);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            name2 = AbstractJsonLexerKt.NULL;
        } else {
            EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
            if (localDeviceModel2 != null) {
                name2 = EcoDeviceModelExtKt.getName(localDeviceModel2);
            }
        }
        launchSportTrackBean.setInstrumentModel(name2);
        launchSportTrackBean.setCount(Integer.valueOf(this.pause));
        mcn sportConfigModel = getScmDao().getSportConfigModel(this.sportType);
        if (sportConfigModel == null) {
            sportConfigModel = new mcn();
        }
        launchSportTrackBean.setTempoAvg(Integer.valueOf(sportConfigModel.i ? sportConfigModel.j : 0));
        launchSportTrackBean.setDisplay(Boolean.valueOf(sportConfigModel.f26020k));
        launchSportTrackBean.setLighten(Boolean.valueOf(sportConfigModel.f26019b));
        launchSportTrackBean.setAuto(Boolean.valueOf(sportConfigModel.o));
        launchSportTrackBean.setVoice(Boolean.valueOf(sportConfigModel.m));
        launchSportTrackBean.setRemind(Boolean.valueOf(sportConfigModel.m ? sportConfigModel.h : false));
        if (sportConfigModel.m) {
            strValueOf = sportConfigModel.f26018a == 6 ? String.valueOf(3600 / sportConfigModel.g) : TimeDateUtil.getSportPaceStrWithSecDef(sportConfigModel.f);
        } else {
            strValueOf = "0";
        }
        launchSportTrackBean.setSpeedRemind(strValueOf);
        boolean z = sportConfigModel.m;
        String str4 = Constants.EXTRA_CLOSE_TAI;
        if (z && (str2 = sportConfigModel.l) != null) {
            str4 = str2;
        }
        launchSportTrackBean.setTypeStr(str4);
        AppSportTracker.INSTANCE.getInstance().appFinishSportTrack(launchSportTrackBean);
    }

    @Nullable
    public final MutableLiveData<oe4> getConnectState() {
        return this.connectState;
    }

    @NotNull
    public final String getCurDeviceDid() {
        return this.curDeviceDid;
    }

    @NotNull
    public final String getDeviceDid() {
        EcoDeviceModel localDeviceModel;
        String did;
        int i = this.deviceType;
        if (i != 0) {
            return (i != 1 || (localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType)) == null || (did = localDeviceModel.getDid()) == null) ? "xiaomiwear_app" : did;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) ? "xiaomiwear_app" : ecoDeviceModel.getDid();
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final boolean getDisconnectFinishSport() {
        return this.disconnectFinishSport;
    }

    public final int getEcoDeviceFaultCode() {
        return this.ecoDeviceFaultCode;
    }

    @Nullable
    public final GoalRemindData getGoalRemind() {
        return this.goalRemind;
    }

    @NotNull
    public final String getLocalSportType() {
        return this.localSportType;
    }

    @Nullable
    public final MutableLiveData<SportingData> getMData() {
        return this.mData;
    }

    public final int getPause() {
        return this.pause;
    }

    public final void getReportData() {
        this.sportStateCaller.getSportState();
    }

    @Nullable
    public final SportingData getSportData() {
        return this.sportData;
    }

    public final int getSportGoalType() {
        return this.sportGoalType;
    }

    public final float getSportGoalValue() {
        return this.sportGoalValue;
    }

    @NotNull
    public final IEcoSportRemoteState getSportStateCaller() {
        return this.sportStateCaller;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final int getTrainingMode() {
        return this.trainingMode;
    }

    @Nullable
    public final Function1<UISportState, Unit> getUiSportState() {
        return this.uiSportState;
    }

    /* JADX INFO: renamed from: isActivityFirstInit, reason: from getter */
    public final boolean getIsActivityFirstInit() {
        return this.isActivityFirstInit;
    }

    /* JADX INFO: renamed from: isCurWearDeviceSupportLaunchSport, reason: from getter */
    public final boolean getIsCurWearDeviceSupportLaunchSport() {
        return this.isCurWearDeviceSupportLaunchSport;
    }

    /* JADX INFO: renamed from: isFinishRegular, reason: from getter */
    public final boolean getIsFinishRegular() {
        return this.isFinishRegular;
    }

    /* JADX INFO: renamed from: isLocalLaunch, reason: from getter */
    public final boolean getIsLocalLaunch() {
        return this.isLocalLaunch;
    }

    public final boolean isValidSport() {
        return getMModel().isValidSport();
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        this.uiSportState = null;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(getTAG(), "onConnectFailure");
    }

    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(getTAG(), "onConnectStart");
    }

    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(getTAG(), "onConnectSuccess");
        oe4 oe4Var = new oe4(did, true);
        MutableLiveData<oe4> mutableLiveData = this.connectState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        FitnessLogUtils.i(getTAG(), LifecycleConstantKt.ON_DESTROY);
        this.sportStateCaller.removeSportStateChangedListener(getClass(), this);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this);
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
        getMModel().onDestroy();
        super.onDestroy(owner);
    }

    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Map<CommonSportModel.SportTitle, String> map;
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(getTAG(), "onDisconnect , isCurWearDeviceSupportLaunchSport :" + this.isCurWearDeviceSupportLaunchSport);
        oe4 oe4Var = new oe4(did, false);
        MutableLiveData<oe4> mutableLiveData = this.connectState;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(oe4Var);
        }
        SportingData sportingData = this.sportData;
        if (sportingData != null && (map = sportingData.getMap()) != null) {
            CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.connectDevice;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = AppUtil.getApp().getResources().getString(e1j.L);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Object[] objArr = new Object[1];
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            objArr[0] = (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getName();
            String str = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            map.put(sportTitle, str);
        }
        MutableLiveData<SportingData> mutableLiveData2 = this.mData;
        if (mutableLiveData2 != null) {
            mutableLiveData2.postValue(this.sportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener
    public void onFail(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        this.isFinishRegular = true;
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(new UISportState.Finish(validSport));
        }
        SportModel.Companion companion = SportModel.INSTANCE;
        companion.setGOAL_VALUE(0.0f);
        companion.setGOAL_TYPE(-1);
        companion.setSPORT_TYPE(0);
    }

    public void onSportPaused() {
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Pause.INSTANCE);
        }
        this.pause++;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Restart.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Rest.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        Function1<? super UISportState, Unit> function1 = this.uiSportState;
        if (function1 != null) {
            function1.invoke2(UISportState.Start.INSTANCE);
        }
        FitnessLogUtils.i(getTAG(), "deviceType : " + this.deviceType);
        if (this.deviceType == 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31721(sportType, null), 3, null);
        }
    }

    public void onViewPaused(@NotNull final m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.sportStateCaller.pauseSport(this.curDeviceDid, this.sportType, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM.onViewPaused.1
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(this.this$0.getTAG(), "onViewPaused");
                if (responseCode == 0) {
                    callback.a();
                }
            }
        });
    }

    public void onViewRestart(@NotNull m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        resumeSport(callback);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    public final void restartSport() {
        this.sportStateCaller.restartSport(this.curDeviceDid, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM.restartSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    public final void resumeSport(@NotNull final m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.sportStateCaller.resumeSport(this.curDeviceDid, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM.resumeSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                if (responseCode == 0) {
                    callback.a();
                }
            }
        });
    }

    public final void setActivityFirstInit(boolean z) {
        this.isActivityFirstInit = z;
    }

    public final void setConnectState(@Nullable MutableLiveData<oe4> mutableLiveData) {
        this.connectState = mutableLiveData;
    }

    public final void setCurDeviceDid(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.curDeviceDid = value;
        getMModel().setDeviceDid(value);
    }

    public final void setCurWearDeviceSupportLaunchSport(boolean z) {
        this.isCurWearDeviceSupportLaunchSport = z;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
        getMModel().setDeviceType(i);
        setCurDeviceDid(getDeviceDid());
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setDisconnectFinishSport(boolean z) {
        this.disconnectFinishSport = z;
    }

    public final void setEcoDeviceFaultCode(int i) {
        this.ecoDeviceFaultCode = i;
        getMModel().setEcoDeviceFaultCode(i);
    }

    public final void setFinishRegular(boolean z) {
        this.isFinishRegular = z;
    }

    public final void setGoalRemind(@Nullable GoalRemindData goalRemindData) {
        this.goalRemind = goalRemindData;
    }

    public final void setLocalLaunch(boolean z) {
        this.isLocalLaunch = z;
    }

    public final void setLocalSportType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localSportType = str;
    }

    public final void setMData(@Nullable MutableLiveData<SportingData> mutableLiveData) {
        this.mData = mutableLiveData;
    }

    public final void setPause(int i) {
        this.pause = i;
    }

    public final void setSportData(@Nullable SportingData sportingData) {
        this.sportData = sportingData;
    }

    public final void setSportGoalType(int i) {
        this.sportGoalType = i;
        getMModel().setSportGoalType(i);
    }

    public final void setSportGoalValue(float f) {
        this.sportGoalValue = f;
        getMModel().setSportGoalValue(f);
    }

    public final void setSportRemind() {
        int i = this.sportGoalType;
        if (i != -1) {
            this.goalRemind = new GoalRemindData(i, this.sportGoalValue, this.sportType, 0, 8, null);
        }
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).refreshSportRemind(this.sportType, this.goalRemind);
    }

    public final void setSportStateCaller(@NotNull IEcoSportRemoteState iEcoSportRemoteState) {
        Intrinsics.checkNotNullParameter(iEcoSportRemoteState, "<set-?>");
        this.sportStateCaller = iEcoSportRemoteState;
    }

    public final void setSportType(int i) {
        this.sportType = i;
        getMModel().setSportType(i);
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTrainingMode(int i) {
        this.trainingMode = i;
        getMModel().setTrainingMode(i);
    }

    public final void setUISportStateChange(@NotNull Function1<? super UISportState, Unit> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.uiSportState = state;
    }

    public final void setUiSportState(@Nullable Function1<? super UISportState, Unit> function1) {
        this.uiSportState = function1;
    }

    public void startSport() {
        SportTarget sportTarget;
        FitnessLogUtils.i("BaseSportVM", "startSport");
        setCurDeviceDid(getDeviceDid());
        if (this.sportGoalType != -1) {
            sportTarget = new SportTarget();
            int i = this.sportGoalType;
            if (i == 0) {
                sportTarget.setType(3);
                sportTarget.setValue((int) (this.sportGoalValue * 1000));
            } else if (i == 1) {
                sportTarget.setType(1);
                sportTarget.setValue((int) (this.sportGoalValue * 60));
            } else if (i == 2) {
                sportTarget.setType(2);
                sportTarget.setValue((int) this.sportGoalValue);
            }
        } else {
            sportTarget = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SportRequestData sportRequestDataJ = aVar.u(jCurrentTimeMillis, timeUnit).w(tZOffsetInMilli, timeUnit).s(this.sportType).q(sportTarget).p(1).j();
        this.startTime = sportRequestDataJ.timeStamp;
        IEcoSportRemoteState iEcoSportRemoteState = this.sportStateCaller;
        String str = this.curDeviceDid;
        Intrinsics.checkNotNull(sportRequestDataJ);
        iEcoSportRemoteState.startSport(str, sportRequestDataJ, new RequestCallback(this) { // from class: com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM.startSport.1
            final /* synthetic */ BaseSportVM<M> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(this.this$0.getTAG(), "start sport responseCode : " + responseCode);
            }
        });
        startTrack();
    }

    public final void startTrack() {
        String str;
        String str2;
        String name;
        String str3;
        String strValueOf;
        String str4;
        LaunchSportTrackBean launchSportTrackBean = new LaunchSportTrackBean();
        launchSportTrackBean.setName("workout_start");
        int i = this.sportType;
        if (i == 1) {
            str = "outdoor_running";
        } else if (i == 2) {
            str = "outdoor_walking";
        } else if (i == 3) {
            str = this.deviceType == 1 ? "mijia_treadmill" : "indoor_running";
        } else if (i != 6) {
            str = i != 7 ? "" : "indoor_cycling";
        } else {
            str = "outdoor_cycling";
        }
        launchSportTrackBean.setExerciseTypeDetail(str);
        if (this.isLocalLaunch) {
            str2 = "instrument_to_phone";
        } else {
            EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
                EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
                str2 = (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) ? "phone" : "phone_to_instrument";
            } else {
                str2 = "phone_to_device";
            }
        }
        launchSportTrackBean.setSource(str2);
        EcoDeviceManager.Companion companion2 = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion2).getCurrentDeviceModel();
        String name2 = AbstractJsonLexerKt.NULL;
        if (ecoDeviceModel2 == null || !ecoDeviceModel2.getIsDeviceConnected()) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            EcoDeviceModel ecoDeviceModel3 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion2).getCurrentDeviceModel();
            name = ecoDeviceModel3 != null ? EcoDeviceModelExtKt.getName(ecoDeviceModel3) : null;
        }
        launchSportTrackBean.setDeviceModel(name);
        EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion2).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel2 != null && localDeviceModel2.getIsDeviceConnected()) {
            EcoDeviceModel localDeviceModel3 = EcoDeviceManagerExtKt.getInstance(companion2).getLocalDeviceModel(this.localSportType);
            name2 = localDeviceModel3 != null ? EcoDeviceModelExtKt.getName(localDeviceModel3) : null;
        }
        launchSportTrackBean.setInstrumentModel(name2);
        int i2 = this.sportGoalType;
        if (i2 == 0) {
            str3 = "distance";
        } else if (i2 != 1) {
            str3 = i2 != 2 ? "unknown" : "calories";
        } else {
            str3 = "duration";
        }
        launchSportTrackBean.setTargetType(str3);
        launchSportTrackBean.setTargetValue(Float.valueOf(this.sportGoalValue));
        mcn sportConfigModel = getScmDao().getSportConfigModel(this.sportType);
        if (sportConfigModel == null) {
            sportConfigModel = new mcn();
        }
        launchSportTrackBean.setTempoAvg(Integer.valueOf(sportConfigModel.i ? sportConfigModel.j : 0));
        launchSportTrackBean.setDisplay(Boolean.valueOf(sportConfigModel.f26020k));
        launchSportTrackBean.setLighten(Boolean.valueOf(sportConfigModel.f26019b));
        launchSportTrackBean.setAuto(Boolean.valueOf(sportConfigModel.o));
        launchSportTrackBean.setVoice(Boolean.valueOf(sportConfigModel.m));
        launchSportTrackBean.setRemind(Boolean.valueOf(sportConfigModel.m ? sportConfigModel.h : false));
        if (sportConfigModel.m) {
            strValueOf = sportConfigModel.f26018a == 6 ? String.valueOf((int) (3600 / sportConfigModel.g)) : TimeDateUtil.getSportPaceStrWithSecDef(sportConfigModel.f);
        } else {
            strValueOf = "0";
        }
        launchSportTrackBean.setSpeedRemind(strValueOf);
        boolean z = sportConfigModel.m;
        String str5 = Constants.EXTRA_CLOSE_TAI;
        if (z && (str4 = sportConfigModel.l) != null) {
            str5 = str4;
        }
        launchSportTrackBean.setTypeStr(str5);
        AppSportTracker.INSTANCE.getInstance().appLaunchSportTrack(launchSportTrackBean);
    }

    @Override // com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener
    public void onSuccess(@NotNull SportingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.sportData = data;
        MutableLiveData<SportingData> mutableLiveData = this.mData;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(data);
        }
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).isSupportLaunchSport(1, new j7r() { // from class: hd2
            @Override // defpackage.j7r
            public final void a(Boolean bool) {
                BaseSportVM.onSuccess$lambda$1(this.f19943a, bool);
            }
        });
    }
}

package com.xiaomi.fitness.sport_manager.server;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.remind.GoalRemind;
import com.xiaomi.fitness.sport_manager.remind.a;
import com.xiaomi.fitness.sport_manager.state.RouteMatchManager;
import com.xiaomi.fitness.sport_manager.state.device.AppAndDeviceSportStateServer;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapper;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import defpackage.czc;
import defpackage.f2o;
import defpackage.hxc;
import defpackage.ipc;
import defpackage.ixc;
import defpackage.jdn;
import defpackage.jxc;
import defpackage.ndn;
import defpackage.nkk;
import defpackage.ptc;
import defpackage.ywc;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0099\u00012\u00020\u0001:\b\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001B\n\b\u0007¢\u0006\u0005\b\u0098\u0001\u0010)J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ-\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ+\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ+\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ-\u0010\u0016\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ#\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010)J\u001f\u00100\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010)J\u000f\u00103\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010!J\u0019\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010\u001eJ\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u001eJ\u000f\u0010;\u001a\u00020\u0002H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020%H\u0016¢\u0006\u0004\b=\u0010'J\u0019\u0010?\u001a\u00020\u001f2\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\u001eJ\u000f\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bB\u0010)J!\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020C2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010)J\u000f\u0010N\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010)J\u0019\u0010P\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u001fH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bY\u0010ZJ!\u0010\\\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010[\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\\\u0010]J'\u0010a\u001a\u00020\b2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u001fH\u0016¢\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u000bH\u0016¢\u0006\u0004\bh\u0010\u001eJ#\u0010i\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bi\u0010\u001bJ#\u0010j\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bj\u0010\u001bJ\u0017\u0010l\u001a\u00020\b2\u0006\u0010k\u001a\u00020\u000bH\u0016¢\u0006\u0004\bl\u0010gJ\u0017\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\u000bH\u0016¢\u0006\u0004\bn\u0010gJ\u0017\u0010p\u001a\u00020\b2\u0006\u0010o\u001a\u00020\u000bH\u0016¢\u0006\u0004\bp\u0010gJ\u000f\u0010q\u001a\u00020\u000bH\u0016¢\u0006\u0004\bq\u0010\u001eJ\u0017\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0rH\u0016¢\u0006\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR0\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00182\b\u0010y\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R5\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010y\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010{\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R4\u0010\u008e\u0001\u001a\u0004\u0018\u00010O2\b\u0010y\u001a\u0004\u0018\u00010O8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u008a\u0001\u0010{\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0005\b\u008d\u0001\u0010QR\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R5\u0010\u0097\u0001\u001a\u0004\u0018\u00010c2\b\u0010y\u001a\u0004\u0018\u00010c8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0005\b\u0096\u0001\u0010e¨\u0006\u009d\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/server/SportStateServer;", "Lczc$a;", "", "did", "Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;", "sportRequestData", "Lnkk;", "callback", "", "startSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;Lnkk;)V", "", DailyRecordKey.sportType, "pauseSport", "(Ljava/lang/String;ILnkk;)V", "resumeSport", "finishSport", "finishSportData", "finishSportWithData", "deviceModelDid", "accidentFinishSport", "restartSport", "startLocalSport", "clazz", "Lixc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportStateChangedListener", "(Ljava/lang/String;Lixc;)V", "removeSportStateChangedListener", "getAppLaunchType", "()I", "", "checkSportDoing", "()Z", "hasOngoingSport", "getSportLaunchType", "getSportType", "", "getSportTotalDuration", "()J", "syncWearSportStatus", "()V", "syncLocalDeviceSportStatus", LifecycleConstantKt.ON_DESTROY, "(Ljava/lang/String;)V", "onStopSport", FitnessRecordKey.segmentType, "nextSegmentType", "segmentSport", "(II)V", "removeRecoverSport", "isAppAloneLaunch", "Lywc;", "IRemoteDataChangedListener", "stopSportHr", "(Lywc;)V", "startSportHr", "getSportState", "getLocalSportState", "getPhoneDid", "()Ljava/lang/String;", "getSportDurationInSec", "model", "isEcgDevice", "(Ljava/lang/String;)Z", "getMinValidDistance", "syncRecoverSport", "", "speed", "setGymSpeed", "(FLnkk;)V", "pace", "setGymPace", "(ILnkk;)V", "getSportReportData", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;", "getRecoverSport", "abnormalChangeSportStateToFinish", "abnormalChangeSportStateToPause", "Lhxc;", "setSportReportDataListener", "(Lhxc;)V", "bool", "setAutoPause", "(Z)V", "Ljxc;", "setSportSyncDataListener", "(Ljxc;)V", "Lptc;", "setLocalReceiveListener", "(Lptc;)V", "goalRemindData", "refreshSportRemind", "(ILcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;)V", "num", "interval", "isNeedStart", "countDownStart", "(IIZ)V", "Lipc;", "addBackgroundLocationPermissionListener", "(Lipc;)V", "startSportRemind", "(I)V", "getSportStateFromAppAndDevice", "addAppAndDeviceSportStateListener", "removeAppAndDeviceSportStateListener", "appLaunchType", "setGymAppLaunchType", "adujustmentDis", "hadAdjustmentDistance", "vibrateLevel", "shake", "getRouteMatchResult", "", "", "getWholeKiloPaceList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "stateChangedListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "<set-?>", "iRemoteDataChangedListener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getIRemoteDataChangedListener", "()Lixc;", "setIRemoteDataChangedListener", "(Lixc;)V", "iRemoteDataChangedListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "sportRequestCallback", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "remoteSportRequestCallback$delegate", "getRemoteSportRequestCallback", "()Lnkk;", "setRemoteSportRequestCallback", "(Lnkk;)V", "remoteSportRequestCallback", "iRemoteSportReportDataListener$delegate", "getIRemoteSportReportDataListener", "()Lhxc;", "setIRemoteSportReportDataListener", "iRemoteSportReportDataListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "sportReportDataListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "iBgLocationPermissionListener$delegate", "Lcom/xiaomi/fitness/sport_manager/server/BgLocationBinderDelegate;", "getIBgLocationPermissionListener", "()Lipc;", "setIBgLocationPermissionListener", "iBgLocationPermissionListener", "<init>", "Companion", "StateChangedListener", "SportRequestCallbackImpl", "SportReportDataListenerImpl", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStateServer extends czc.a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportStateServer.class, "iRemoteDataChangedListener", "getIRemoteDataChangedListener()Lcom/xiaomi/fitness/sport_manager_export/listener/IRemoteSportStateChangedListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportStateServer.class, "remoteSportRequestCallback", "getRemoteSportRequestCallback()Lcom/xiaomi/fitness/sport_manager_export/listener/RemoteSportRequestCallback;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportStateServer.class, "iRemoteSportReportDataListener", "getIRemoteSportReportDataListener()Lcom/xiaomi/fitness/sport_manager_export/listener/IRemoteSportReportDataListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportStateServer.class, "iBgLocationPermissionListener", "getIBgLocationPermissionListener()Lcom/xiaomi/fitness/sport_manager_export/listener/IBgLocationPermissionListener;", 0))};
    public static final int KEY_SPORT_STATE_BINDER = 22;

    @NotNull
    public static final String TAG = "SportStateServer";

    @NotNull
    private ISportStateChangedListener stateChangedListener = new StateChangedListener();

    /* JADX INFO: renamed from: iRemoteDataChangedListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate iRemoteDataChangedListener = new BinderDelegate("RemoteDataChangedListener");

    @Nullable
    private SportRequestCallback sportRequestCallback = new SportRequestCallbackImpl();

    /* JADX INFO: renamed from: remoteSportRequestCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate remoteSportRequestCallback = new BinderDelegate("RemoteSportRequestCallback");

    /* JADX INFO: renamed from: iRemoteSportReportDataListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate iRemoteSportReportDataListener = new BinderDelegate("IRemoteSportReportDataListener");

    @NotNull
    private ISportReportDataListener sportReportDataListener = new SportReportDataListenerImpl();

    /* JADX INFO: renamed from: iBgLocationPermissionListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BgLocationBinderDelegate iBgLocationPermissionListener = new BgLocationBinderDelegate("IBgLocationPermissionListener");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/server/SportStateServer$SportReportDataListenerImpl;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "<init>", "(Lcom/xiaomi/fitness/sport_manager/server/SportStateServer;)V", "onSportReportData", "", "data", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SportReportDataListenerImpl implements ISportReportDataListener {
        public SportReportDataListenerImpl() {
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener
        public void onSportReportData(@NotNull SportData data) throws RemoteException {
            Intrinsics.checkNotNullParameter(data, "data");
            FitnessLogUtils.i(SportStateServer.TAG, "data:" + data);
            hxc iRemoteSportReportDataListener = SportStateServer.this.getIRemoteSportReportDataListener();
            if (iRemoteSportReportDataListener != null) {
                iRemoteSportReportDataListener.onSportReportData(SportWrapperKt.wrap(data));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/server/SportStateServer$SportRequestCallbackImpl;", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "<init>", "(Lcom/xiaomi/fitness/sport_manager/server/SportStateServer;)V", "call", "", "sportState", "", "sportResponseData", "Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseData;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SportRequestCallbackImpl implements SportRequestCallback {
        public SportRequestCallbackImpl() {
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
        public void call(int sportState, @NotNull SportResponseData sportResponseData) throws RemoteException {
            Intrinsics.checkNotNullParameter(sportResponseData, "sportResponseData");
            FitnessLogUtils.i(SportStateServer.TAG, "sportState callback , sportState : " + sportState + " , sportResponseCode : " + sportResponseData.responseCode);
            nkk remoteSportRequestCallback = SportStateServer.this.getRemoteSportRequestCallback();
            if (remoteSportRequestCallback != null) {
                remoteSportRequestCallback.call(sportResponseData.responseCode);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/server/SportStateServer$StateChangedListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "<init>", "(Lcom/xiaomi/fitness/sport_manager/server/SportStateServer;)V", "onSportStarted", "", "code", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportRestarted", "onSportPaused", "onSportFinished", "validSport", "", "ids", "", "finishSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class StateChangedListener implements ISportStateChangedListener {
        public StateChangedListener() {
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
            if (SportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(SportStateServer.TAG, "finish iRemoteDataChangedListener");
            }
            try {
                ixc iRemoteDataChangedListener = SportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportFinished(validSport);
                }
                FitnessLogUtils.i(SportStateServer.TAG, "onSportFinished callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(SportStateServer.TAG, "onSportFinished callback fail e " + e);
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportPaused() {
            if (SportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(SportStateServer.TAG, "pause iRemoteDataChangedListener");
            }
            try {
                ixc iRemoteDataChangedListener = SportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportPaused();
                }
                FitnessLogUtils.i(SportStateServer.TAG, "onSportPaused callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(SportStateServer.TAG, "onSportPaused callback fail e " + e);
            }
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportRestarted() {
            if (SportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(SportStateServer.TAG, "restart iRemoteDataChangedListener");
            }
            try {
                ixc iRemoteDataChangedListener = SportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportRestarted();
                }
                FitnessLogUtils.i(SportStateServer.TAG, "onSportRestarted callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(SportStateServer.TAG, "onSportRestarted callback fail e " + e);
            }
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportSegment(int i, int i2) {
            ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
            if (SportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(SportStateServer.TAG, "start iRemoteDataChangedListener");
            }
            try {
                FitnessLogUtils.i(SportStateServer.TAG, "onSportStarted callback success, startTime:" + startTime + " , timeZone : " + timeZone + " , sportType : " + sportType + " , sportLaunchType : " + sportLaunchType);
                ixc iRemoteDataChangedListener = SportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportStarted(code, startTime, timeZone, sportType, sportLaunchType);
                }
            } catch (Exception e) {
                FitnessLogUtils.i(SportStateServer.TAG, "onSportStarted callback fail e " + e);
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void preSport() {
            ISportStateChangedListener.DefaultImpls.preSport(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ixc getIRemoteDataChangedListener() {
        return (ixc) this.iRemoteDataChangedListener.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hxc getIRemoteSportReportDataListener() {
        return (hxc) this.iRemoteSportReportDataListener.getValue((Object) this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nkk getRemoteSportRequestCallback() {
        return (nkk) this.remoteSportRequestCallback.getValue((Object) this, $$delegatedProperties[1]);
    }

    private final void setIRemoteDataChangedListener(ixc ixcVar) {
        this.iRemoteDataChangedListener.setValue((Object) this, $$delegatedProperties[0], ixcVar);
    }

    private final void setIRemoteSportReportDataListener(hxc hxcVar) {
        this.iRemoteSportReportDataListener.setValue((Object) this, $$delegatedProperties[2], hxcVar);
    }

    private final void setRemoteSportRequestCallback(nkk nkkVar) {
        this.remoteSportRequestCallback.setValue((Object) this, $$delegatedProperties[1], nkkVar);
    }

    @Override // defpackage.czc
    public void abnormalChangeSportStateToFinish() {
        f2o.x().d();
    }

    @Override // defpackage.czc
    public void abnormalChangeSportStateToPause() {
        f2o.x().e();
    }

    @Override // defpackage.czc
    public void accidentFinishSport(@Nullable String deviceModelDid, int sportType, @Nullable nkk callback) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (deviceModelDid == null) {
            deviceModelDid = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(deviceModelDid);
        setRemoteSportRequestCallback(callback);
        f2o.x().f(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void addAppAndDeviceSportStateListener(@Nullable String clazz, @Nullable ixc listener) {
        AppAndDeviceSportStateServer.INSTANCE.getInstance().addAppAndDeviceSportStateListener(listener);
    }

    @Override // defpackage.czc
    public void addBackgroundLocationPermissionListener(@Nullable ipc listener) {
        FitnessLogUtils.i(TAG, "addBackgroundLocationPermissionListener");
        setIBgLocationPermissionListener(listener);
        f2o.x().g(getIBgLocationPermissionListener());
    }

    @Override // defpackage.czc
    public void addSportStateChangedListener(@Nullable String clazz, @Nullable ixc listener) {
        FitnessLogUtils.i(TAG, "addSportStateChangedListener, class:" + clazz + " , listener : " + listener);
        setIRemoteDataChangedListener(listener);
        f2o.x().h(SportStateServer.class, this.stateChangedListener);
        f2o.x().h(a.v().getClass(), a.v());
        jdn.h().e(a.v().getClass(), a.v());
    }

    @Override // defpackage.czc
    public boolean checkSportDoing() {
        return f2o.x().l();
    }

    @Override // defpackage.czc
    public void countDownStart(int num, int interval, boolean isNeedStart) {
        a.v().t(num, interval, isNeedStart);
    }

    @Override // defpackage.czc
    public void finishSport(@Nullable String did, int sportType, @Nullable nkk callback) {
        FitnessLogUtils.i(TAG, "finishSport , did : " + did + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        f2o.x().p(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void finishSportWithData(@Nullable String did, @Nullable SportWrapper finishSportData, @Nullable nkk callback) {
        FitnessLogUtils.i(TAG, "finishSportWithData , did : " + did + " , sportType : " + getSportType());
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        f2o.x().q(deviceModelByDid, (FinishSportData) SportWrapperKt.asData(finishSportData), this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public int getAppLaunchType() {
        return f2o.x().t();
    }

    @Nullable
    public final ipc getIBgLocationPermissionListener() {
        return (ipc) this.iBgLocationPermissionListener.getValue((Object) this, $$delegatedProperties[3]);
    }

    @Override // defpackage.czc
    public int getLocalSportState() {
        return f2o.x().z();
    }

    @Override // defpackage.czc
    public int getMinValidDistance() {
        return f2o.x().C();
    }

    @Override // defpackage.czc
    @NotNull
    public String getPhoneDid() {
        String strD = f2o.x().D();
        Intrinsics.checkNotNullExpressionValue(strD, "getPhoneDid(...)");
        return strD;
    }

    @Override // defpackage.czc
    @Nullable
    public SportWrapper getRecoverSport() {
        SportRecoverData sportRecoverData;
        SportData sportDataE = f2o.x().E();
        if (sportDataE != null) {
            sportRecoverData = new SportRecoverData();
            sportRecoverData.setCacheTime(sportDataE.cacheTime);
            sportRecoverData.setSportType(sportDataE.sportType);
            sportRecoverData.setDuration(sportDataE.totalTime);
        } else {
            sportRecoverData = null;
        }
        FitnessLogUtils.i(TAG, "recoverSport : " + sportDataE);
        return SportWrapperKt.wrap(sportRecoverData);
    }

    @Override // defpackage.czc
    public int getRouteMatchResult() {
        return RouteMatchManager.INSTANCE.getRouteMatchResult();
    }

    @Override // defpackage.czc
    public long getSportDurationInSec() {
        return f2o.x().J();
    }

    @Override // defpackage.czc
    public int getSportLaunchType() {
        return f2o.x().K();
    }

    @Override // defpackage.czc
    @Nullable
    public SportWrapper getSportReportData() {
        return SportWrapperKt.wrap(f2o.x().M());
    }

    @Override // defpackage.czc
    public int getSportState() {
        return f2o.x().P();
    }

    @Override // defpackage.czc
    public int getSportStateFromAppAndDevice() {
        return f2o.x().R();
    }

    @Override // defpackage.czc
    public long getSportTotalDuration() {
        return f2o.x().S();
    }

    @Override // defpackage.czc
    public int getSportType() {
        return f2o.x().T();
    }

    @Override // defpackage.czc
    @NotNull
    public List<Object> getWholeKiloPaceList() {
        List<Integer> listK = ndn.i().k();
        Intrinsics.checkNotNullExpressionValue(listK, "getWholeKiloPaceList(...)");
        return CollectionsKt___CollectionsKt.toMutableList((Collection) listK);
    }

    @Override // defpackage.czc
    public void hadAdjustmentDistance(int adujustmentDis) {
        ndn.i().l(adujustmentDis);
    }

    @Override // defpackage.czc
    public boolean hasOngoingSport() {
        return f2o.x().W();
    }

    @Override // defpackage.czc
    public boolean isAppAloneLaunch() {
        return f2o.x().Y();
    }

    @Override // defpackage.czc
    public boolean isEcgDevice(@Nullable String model) {
        return f2o.x().Z(model);
    }

    @Override // defpackage.czc
    public void onDestroy(@Nullable String deviceModelDid) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (deviceModelDid == null) {
            deviceModelDid = "";
        }
        f2o.x().e0(sportDeviceModel.getDeviceModelByDid(deviceModelDid));
    }

    @Override // defpackage.czc
    public void onStopSport() {
        f2o.x().g0();
    }

    @Override // defpackage.czc
    public void pauseSport(@Nullable String did, int sportType, @Nullable nkk callback) {
        FitnessLogUtils.i(TAG, "pauseSport , did : " + did + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        f2o.x().h0(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void refreshSportRemind(int sportType, @Nullable SportWrapper goalRemindData) {
        GoalRemindData goalRemindData2 = (GoalRemindData) SportWrapperKt.asData(goalRemindData);
        a.v().X(sportType, goalRemindData2 != null ? new GoalRemind(goalRemindData2.getGoalType(), goalRemindData2.getSportGoalValue(), goalRemindData2.getSportType()) : null);
    }

    @Override // defpackage.czc
    public void removeAppAndDeviceSportStateListener(@Nullable String clazz, @Nullable ixc listener) {
        AppAndDeviceSportStateServer.INSTANCE.getInstance().removeAppAndDeviceSportStateListener(listener);
    }

    @Override // defpackage.czc
    public void removeRecoverSport() {
        f2o.x().i0();
    }

    @Override // defpackage.czc
    public void removeSportStateChangedListener(@Nullable String clazz, @Nullable ixc listener) {
        FitnessLogUtils.i(TAG, "removeSportStateChangedListener, class:" + clazz + " , listener : " + listener);
        setIRemoteDataChangedListener(listener);
        setIRemoteDataChangedListener(null);
        f2o.x().j0(SportStateServer.class, this.stateChangedListener);
    }

    @Override // defpackage.czc
    public void restartSport(@Nullable String deviceModelDid, int sportType, @Nullable nkk callback) {
        FitnessLogUtils.i(TAG, "restartSport , did :" + deviceModelDid + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (deviceModelDid == null) {
            deviceModelDid = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(deviceModelDid);
        setRemoteSportRequestCallback(callback);
        f2o.x().l0(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void resumeSport(@Nullable String did, int sportType, @Nullable nkk callback) {
        FitnessLogUtils.i(TAG, "resumeSport , did : " + did + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        WearableDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        f2o.x().m0(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void segmentSport(int segmentType, int nextSegmentType) {
        f2o.x().f0(segmentType, nextSegmentType);
    }

    @Override // defpackage.czc
    public void setAutoPause(boolean bool) {
        FitnessLogUtils.i(TAG, "setAutoPause : " + bool);
        f2o.x().n0(bool);
    }

    @Override // defpackage.czc
    public void setGymAppLaunchType(int appLaunchType) {
        f2o.x().o0(appLaunchType);
    }

    @Override // defpackage.czc
    public void setGymPace(int pace, @Nullable nkk callback) {
        setRemoteSportRequestCallback(callback);
        f2o.x().p0(pace, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void setGymSpeed(float speed, @Nullable nkk callback) {
        setRemoteSportRequestCallback(callback);
        f2o.x().q0(speed, this.sportRequestCallback);
    }

    public final void setIBgLocationPermissionListener(@Nullable ipc ipcVar) {
        this.iBgLocationPermissionListener.setValue((Object) this, $$delegatedProperties[3], ipcVar);
    }

    @Override // defpackage.czc
    public void setLocalReceiveListener(@Nullable ptc listener) {
        f2o.x().r0(listener);
    }

    @Override // defpackage.czc
    public void setSportReportDataListener(@Nullable hxc listener) {
        if (listener != null) {
            setIRemoteSportReportDataListener(listener);
            FitnessLogUtils.i(TAG, "setSportReportDataListener , listener:" + listener);
            f2o.x().t0(this.sportReportDataListener);
        }
    }

    @Override // defpackage.czc
    public void setSportSyncDataListener(@Nullable jxc listener) {
        jdn.h().t(listener);
    }

    @Override // defpackage.czc
    public void shake(int vibrateLevel) {
        Logger.i(TAG, "shake,vibrateLevel:" + vibrateLevel);
        f2o.x().u0(vibrateLevel);
    }

    @Override // defpackage.czc
    public void startLocalSport(@Nullable String did, @Nullable SportWrapper sportRequestData, @Nullable nkk callback) {
        WearableDeviceModel deviceModelByDid = SportDeviceModel.INSTANCE.getDeviceModelByDid(did == null ? "" : did);
        FitnessLogUtils.i(TAG, "startSport , did : " + did + " , deviceModel : " + deviceModelByDid);
        setRemoteSportRequestCallback(callback);
        f2o.x().v0((SportRequestData) SportWrapperKt.asData(sportRequestData), deviceModelByDid, this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void startSport(@Nullable String did, @Nullable SportWrapper sportRequestData, @Nullable nkk callback) {
        WearableDeviceModel deviceModelByDid = SportDeviceModel.INSTANCE.getDeviceModelByDid(did == null ? "" : did);
        FitnessLogUtils.i(TAG, "startSport , did : " + did + ", deviceModel : " + deviceModelByDid);
        setRemoteSportRequestCallback(callback);
        f2o.x().x0(deviceModelByDid, (SportRequestData) SportWrapperKt.asData(sportRequestData), this.sportRequestCallback);
    }

    @Override // defpackage.czc
    public void startSportHr(@Nullable ywc IRemoteDataChangedListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.czc
    public void startSportRemind(int sportType) {
        a.v().W(sportType);
    }

    @Override // defpackage.czc
    public void stopSportHr(@Nullable ywc IRemoteDataChangedListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.czc
    public void syncLocalDeviceSportStatus() {
        f2o.x().A0();
    }

    @Override // defpackage.czc
    public void syncRecoverSport() {
        f2o.x().B0();
    }

    @Override // defpackage.czc
    public void syncWearSportStatus() {
        f2o.x().C0();
    }
}

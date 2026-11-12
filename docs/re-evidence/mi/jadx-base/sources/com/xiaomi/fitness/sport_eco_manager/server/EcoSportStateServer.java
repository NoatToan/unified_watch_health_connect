package com.xiaomi.fitness.sport_eco_manager.server;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.remind.GoalRemind;
import com.xiaomi.fitness.sport_eco_manager.remind.a;
import com.xiaomi.fitness.sport_eco_manager.state.device.AppAndDeviceSportStateServer;
import com.xiaomi.fitness.sport_eco_manager_export.data.EcoSportWrapper;
import com.xiaomi.fitness.sport_eco_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import defpackage.bsc;
import defpackage.dsc;
import defpackage.esc;
import defpackage.ew7;
import defpackage.fsc;
import defpackage.g2o;
import defpackage.isc;
import defpackage.kdn;
import defpackage.psc;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u007f2\u00020\u0001:\u0005\u007f\u0080\u0001\u0081\u0001B\t\b\u0007¢\u0006\u0004\b~\u0010'J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0013\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ-\u0010\u0014\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ#\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010'J\u0019\u0010)\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010'J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010'J\u000f\u0010-\u001a\u00020\u001dH\u0016¢\u0006\u0004\b-\u0010\u001fJ\u0019\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\u001cJ\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u001cJ\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020#H\u0016¢\u0006\u0004\b7\u0010%J\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010\u001cJ\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010'J!\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u001d2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bE\u0010CJ\u0011\u0010F\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010'J\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u001dH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bT\u0010UJ!\u0010W\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bW\u0010XJ'\u0010\\\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u000bH\u0016¢\u0006\u0004\b`\u0010\u001cJ#\u0010a\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\ba\u0010\u0019J#\u0010b\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\bb\u0010\u0019J\u0017\u0010d\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bd\u0010_J\u0017\u0010f\u001a\u00020\b2\u0006\u0010e\u001a\u00020\u0004H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\b2\u0006\u0010h\u001a\u00020\u001dH\u0016¢\u0006\u0004\bi\u0010LR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR/\u0010t\u001a\u0004\u0018\u00010\u00162\b\u0010m\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR/\u0010}\u001a\u0004\u0018\u00010\u00062\b\u0010m\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010o\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u0082\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/server/EcoSportStateServer;", "Lisc$a;", "", "did", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;", "sportRequestData", "Lew7;", "callback", "", "startSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;Lew7;)V", "", DailyRecordKey.sportType, "pauseSport", "(Ljava/lang/String;ILew7;)V", "resumeSport", "finishSport", "deviceModelDid", "accidentFinishSport", "restartSport", "startLocalSport", "clazz", "Lesc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportStateChangedListener", "(Ljava/lang/String;Lesc;)V", "removeSportStateChangedListener", "getAppLaunchType", "()I", "", "checkSportDoing", "()Z", "hasOngoingSport", "getSportLaunchType", "getSportType", "", "getSportTotalDuration", "()J", "syncWearSportStatus", "()V", "syncLocalDeviceSportStatus", LifecycleConstantKt.ON_DESTROY, "(Ljava/lang/String;)V", "onStopSport", "removeRecoverSport", "isAppAloneLaunch", "Ldsc;", "IEcoRemoteDataChangedListener", "stopSportHr", "(Ldsc;)V", "startSportHr", "getSportState", "getLocalSportState", "getPhoneDid", "()Ljava/lang/String;", "getSportDurationInSec", "getMinValidDistance", "syncRecoverSport", "", "speed", "setGymSpeed", "(FLew7;)V", "ftpTest", "setGymFtpTest", "(ZLew7;)V", "ftpPercentRpm", "setGymFtpPercentRpm", "(ILew7;)V", "pace", "setGymPace", "getSportReportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;", "getRecoverSport", "abnormalChangeSportStateToFinish", "bool", "setAutoPause", "(Z)V", "Lfsc;", "setSportSyncDataListener", "(Lfsc;)V", "Lbsc;", "setLocalReceiveListener", "(Lbsc;)V", "Lpsc;", "setFtpStateReceiveListener", "(Lpsc;)V", "goalRemindData", "refreshSportRemind", "(ILcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;)V", "num", "interval", "isNeedStart", "countDownStart", "(IIZ)V", "startSportRemind", "(I)V", "getSportStateFromAppAndDevice", "addAppAndDeviceSportStateListener", "removeAppAndDeviceSportStateListener", "appLaunchType", "setGymAppLaunchType", Constants.KEY_REQUEST_DATA, "updateSportStateData", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;)V", "isConnected", "connectChanged", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "stateChangedListener", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "<set-?>", "iRemoteDataChangedListener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getIRemoteDataChangedListener", "()Lesc;", "setIRemoteDataChangedListener", "(Lesc;)V", "iRemoteDataChangedListener", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;", "sportRequestCallback", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;", "remoteSportRequestCallback$delegate", "getRemoteSportRequestCallback", "()Lew7;", "setRemoteSportRequestCallback", "(Lew7;)V", "remoteSportRequestCallback", "<init>", "Companion", "StateChangedListener", "SportRequestCallbackImpl", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoSportStateServer extends isc.a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoSportStateServer.class, "iRemoteDataChangedListener", "getIRemoteDataChangedListener()Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoRemoteSportStateChangedListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoSportStateServer.class, "remoteSportRequestCallback", "getRemoteSportRequestCallback()Lcom/xiaomi/fitness/sport_eco_manager_export/listener/EcoRemoteSportRequestCallback;", 0))};
    public static final int KEY_SPORT_STATE_BINDER = 122;

    @NotNull
    public static final String TAG = "EcoSportStateServer";

    @NotNull
    private ISportStateChangedListener stateChangedListener = new StateChangedListener();

    /* JADX INFO: renamed from: iRemoteDataChangedListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate iRemoteDataChangedListener = new BinderDelegate("RemoteDataChangedListener");

    @Nullable
    private SportRequestCallback sportRequestCallback = new SportRequestCallbackImpl();

    /* JADX INFO: renamed from: remoteSportRequestCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate remoteSportRequestCallback = new BinderDelegate("EcoRemoteSportRequestCallback");

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/server/EcoSportStateServer$SportRequestCallbackImpl;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/server/EcoSportStateServer;)V", "call", "", "sportState", "", "sportResponseData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportResponseData;", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SportRequestCallbackImpl implements SportRequestCallback {
        public SportRequestCallbackImpl() {
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
        public void call(int sportState, @NotNull SportResponseData sportResponseData) throws RemoteException {
            Intrinsics.checkNotNullParameter(sportResponseData, "sportResponseData");
            FitnessLogUtils.i(EcoSportStateServer.TAG, "sportState callback , sportState : " + sportState + " , sportResponseCode : " + sportResponseData.responseCode);
            ew7 remoteSportRequestCallback = EcoSportStateServer.this.getRemoteSportRequestCallback();
            if (remoteSportRequestCallback != null) {
                remoteSportRequestCallback.call(sportResponseData.responseCode);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/server/EcoSportStateServer$StateChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/server/EcoSportStateServer;)V", "onSportStarted", "", "startTime", "", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportRestarted", "onSportPaused", "onSportFinished", "validSport", "", "ids", "", "onSportRested", "onSportShutdown", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class StateChangedListener implements ISportStateChangedListener {
        public StateChangedListener() {
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
            if (EcoSportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "finish iRemoteDataChangedListener");
            }
            try {
                esc iRemoteDataChangedListener = EcoSportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportFinished(validSport);
                }
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportFinished callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportFinished callback fail e " + e);
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void onSportPaused() {
            if (EcoSportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "pause iRemoteDataChangedListener");
            }
            try {
                esc iRemoteDataChangedListener = EcoSportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportPaused();
                }
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportPaused callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportPaused callback fail e " + e);
            }
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void onSportRestarted() {
            if (EcoSportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "restart iRemoteDataChangedListener");
            }
            try {
                esc iRemoteDataChangedListener = EcoSportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportRestarted();
                }
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportRestarted callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportRestarted callback fail e " + e);
            }
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void onSportRested() {
            if (EcoSportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "rest iRemoteDataChangedListener");
            }
            try {
                esc iRemoteDataChangedListener = EcoSportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportRested();
                }
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportRested callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportRested callback fail e " + e);
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void onSportShutdown() {
            if (EcoSportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "shutdown iRemoteDataChangedListener");
            }
            try {
                esc iRemoteDataChangedListener = EcoSportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportShutdown();
                }
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportShutdown callback success");
            } catch (Exception e) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportShutdown callback fail e " + e);
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
            if (EcoSportStateServer.this.getIRemoteDataChangedListener() == null) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "start iRemoteDataChangedListener");
            }
            try {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportStarted callback success, startTime:" + startTime + " , timeZone : " + timeZone + " , sportType : " + sportType + " , sportLaunchType : " + sportLaunchType);
                esc iRemoteDataChangedListener = EcoSportStateServer.this.getIRemoteDataChangedListener();
                if (iRemoteDataChangedListener != null) {
                    iRemoteDataChangedListener.onSportStarted(startTime, timeZone, sportType, sportLaunchType);
                }
            } catch (Exception e) {
                FitnessLogUtils.i(EcoSportStateServer.TAG, "onSportStarted callback fail e " + e);
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
        public void preSport() {
            ISportStateChangedListener.DefaultImpls.preSport(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final esc getIRemoteDataChangedListener() {
        return (esc) this.iRemoteDataChangedListener.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ew7 getRemoteSportRequestCallback() {
        return (ew7) this.remoteSportRequestCallback.getValue((Object) this, $$delegatedProperties[1]);
    }

    private final void setIRemoteDataChangedListener(esc escVar) {
        this.iRemoteDataChangedListener.setValue((Object) this, $$delegatedProperties[0], escVar);
    }

    private final void setRemoteSportRequestCallback(ew7 ew7Var) {
        this.remoteSportRequestCallback.setValue((Object) this, $$delegatedProperties[1], ew7Var);
    }

    @Override // defpackage.isc
    public void abnormalChangeSportStateToFinish() {
        g2o.s().c();
    }

    @Override // defpackage.isc
    public void accidentFinishSport(@Nullable String deviceModelDid, int sportType, @Nullable ew7 callback) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (deviceModelDid == null) {
            deviceModelDid = "";
        }
        EcoDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(deviceModelDid);
        setRemoteSportRequestCallback(callback);
        g2o.s().d(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void addAppAndDeviceSportStateListener(@Nullable String clazz, @Nullable esc listener) {
        AppAndDeviceSportStateServer.INSTANCE.getInstance().addAppAndDeviceSportStateListener(listener);
    }

    @Override // defpackage.isc
    public void addSportStateChangedListener(@Nullable String clazz, @Nullable esc listener) {
        FitnessLogUtils.i(TAG, "addSportStateChangedListener, class:" + clazz + " , listener : " + listener);
        setIRemoteDataChangedListener(listener);
        g2o.s().e(EcoSportStateServer.class, this.stateChangedListener);
        g2o.s().e(a.n().getClass(), a.n());
        kdn.f().d(a.n().getClass(), a.n());
    }

    @Override // defpackage.isc
    public boolean checkSportDoing() {
        return g2o.s().i();
    }

    @Override // defpackage.isc
    public void connectChanged(boolean isConnected) {
        a.n().k(Boolean.valueOf(isConnected));
    }

    @Override // defpackage.isc
    public void countDownStart(int num, int interval, boolean isNeedStart) {
        a.n().l(num, interval, isNeedStart);
    }

    @Override // defpackage.isc
    public void finishSport(@Nullable String did, int sportType, @Nullable ew7 callback) {
        FitnessLogUtils.i(TAG, "finishSport , did : " + did + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        EcoDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        g2o.s().m(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public int getAppLaunchType() {
        return g2o.s().n();
    }

    @Override // defpackage.isc
    public int getLocalSportState() {
        return g2o.s().u();
    }

    @Override // defpackage.isc
    public int getMinValidDistance() {
        return g2o.s().x();
    }

    @Override // defpackage.isc
    @NotNull
    public String getPhoneDid() {
        String strY = g2o.s().y();
        Intrinsics.checkNotNullExpressionValue(strY, "getPhoneDid(...)");
        return strY;
    }

    @Override // defpackage.isc
    @Nullable
    public EcoSportWrapper getRecoverSport() {
        SportRecoverData sportRecoverData;
        SportData sportDataZ = g2o.s().z();
        if (sportDataZ != null) {
            sportRecoverData = new SportRecoverData();
            sportRecoverData.setCacheTime(sportDataZ.cacheTime);
            sportRecoverData.setSportType(sportDataZ.sportType);
        } else {
            sportRecoverData = null;
        }
        FitnessLogUtils.i(TAG, "recoverSport : " + sportDataZ);
        return SportWrapperKt.wrap(sportRecoverData);
    }

    @Override // defpackage.isc
    public long getSportDurationInSec() {
        return g2o.s().E();
    }

    @Override // defpackage.isc
    public int getSportLaunchType() {
        return g2o.s().F();
    }

    @Override // defpackage.isc
    @Nullable
    public EcoSportWrapper getSportReportData() {
        return SportWrapperKt.wrap(g2o.s().G());
    }

    @Override // defpackage.isc
    public int getSportState() {
        return g2o.s().H();
    }

    @Override // defpackage.isc
    public int getSportStateFromAppAndDevice() {
        return g2o.s().J();
    }

    @Override // defpackage.isc
    public long getSportTotalDuration() {
        return g2o.s().K();
    }

    @Override // defpackage.isc
    public int getSportType() {
        return g2o.s().L();
    }

    @Override // defpackage.isc
    public boolean hasOngoingSport() {
        return g2o.s().O();
    }

    @Override // defpackage.isc
    public boolean isAppAloneLaunch() {
        return g2o.s().P();
    }

    @Override // defpackage.isc
    public void onDestroy(@Nullable String deviceModelDid) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (deviceModelDid == null) {
            deviceModelDid = "";
        }
        g2o.s().S(sportDeviceModel.getDeviceModelByDid(deviceModelDid));
    }

    @Override // defpackage.isc
    public void onStopSport() {
        g2o.s().T();
    }

    @Override // defpackage.isc
    public void pauseSport(@Nullable String did, int sportType, @Nullable ew7 callback) {
        FitnessLogUtils.i(TAG, "pauseSport , did : " + did + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        EcoDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        g2o.s().U(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void refreshSportRemind(int sportType, @Nullable EcoSportWrapper goalRemindData) {
        GoalRemindData goalRemindData2 = (GoalRemindData) SportWrapperKt.asData(goalRemindData);
        a.n().P(sportType, goalRemindData2 != null ? new GoalRemind(goalRemindData2.getGoalType(), goalRemindData2.getSportGoalValue(), goalRemindData2.getSportType(), goalRemindData2.getTrainingMode()) : null);
    }

    @Override // defpackage.isc
    public void removeAppAndDeviceSportStateListener(@Nullable String clazz, @Nullable esc listener) {
        AppAndDeviceSportStateServer.INSTANCE.getInstance().removeAppAndDeviceSportStateListener(listener);
    }

    @Override // defpackage.isc
    public void removeRecoverSport() {
        g2o.s().V();
    }

    @Override // defpackage.isc
    public void removeSportStateChangedListener(@Nullable String clazz, @Nullable esc listener) {
        FitnessLogUtils.i(TAG, "removeSportStateChangedListener, class:" + clazz + " , listener : " + listener);
        setIRemoteDataChangedListener(listener);
        setIRemoteDataChangedListener(null);
        g2o.s().W(EcoSportStateServer.class, this.stateChangedListener);
    }

    @Override // defpackage.isc
    public void restartSport(@Nullable String deviceModelDid, int sportType, @Nullable ew7 callback) {
        FitnessLogUtils.i(TAG, "restartSport , did :" + deviceModelDid + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (deviceModelDid == null) {
            deviceModelDid = "";
        }
        EcoDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(deviceModelDid);
        setRemoteSportRequestCallback(callback);
        g2o.s().X(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void resumeSport(@Nullable String did, int sportType, @Nullable ew7 callback) {
        FitnessLogUtils.i(TAG, "resumeSport , did : " + did + " , sportType : " + sportType);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did == null) {
            did = "";
        }
        EcoDeviceModel deviceModelByDid = sportDeviceModel.getDeviceModelByDid(did);
        setRemoteSportRequestCallback(callback);
        g2o.s().Y(deviceModelByDid, sportType, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void setAutoPause(boolean bool) {
        FitnessLogUtils.i(TAG, "setAutoPause : " + bool);
        g2o.s().Z(bool);
    }

    @Override // defpackage.isc
    public void setFtpStateReceiveListener(@Nullable psc listener) {
        g2o.s().a0(listener);
    }

    @Override // defpackage.isc
    public void setGymAppLaunchType(int appLaunchType) {
        g2o.s().b0(appLaunchType);
    }

    @Override // defpackage.isc
    public void setGymFtpPercentRpm(int ftpPercentRpm, @Nullable ew7 callback) {
        FitnessLogUtils.i(TAG, "setGymFtpPercentRpm=========01");
        setRemoteSportRequestCallback(callback);
        g2o.s().c0(ftpPercentRpm, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void setGymFtpTest(boolean ftpTest, @Nullable ew7 callback) {
        FitnessLogUtils.i(TAG, "setGymFtpTest=========01");
        setRemoteSportRequestCallback(callback);
        g2o.s().d0(ftpTest, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void setGymPace(int pace, @Nullable ew7 callback) {
        setRemoteSportRequestCallback(callback);
        g2o.s().e0(pace, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void setGymSpeed(float speed, @Nullable ew7 callback) {
        setRemoteSportRequestCallback(callback);
        g2o.s().f0(speed, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void setLocalReceiveListener(@Nullable bsc listener) {
        g2o.s().g0(listener);
    }

    @Override // defpackage.isc
    public void setSportSyncDataListener(@Nullable fsc listener) {
        kdn.f().p(listener);
    }

    @Override // defpackage.isc
    public void startLocalSport(@Nullable String did, @Nullable EcoSportWrapper sportRequestData, @Nullable ew7 callback) {
        EcoDeviceModel deviceModelByDid = SportDeviceModel.INSTANCE.getDeviceModelByDid(did == null ? "" : did);
        FitnessLogUtils.i(TAG, "startSport , did : " + did + " , deviceModel : " + deviceModelByDid);
        setRemoteSportRequestCallback(callback);
        g2o.s().h0((SportRequestData) SportWrapperKt.asData(sportRequestData), deviceModelByDid, this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void startSport(@Nullable String did, @Nullable EcoSportWrapper sportRequestData, @Nullable ew7 callback) {
        EcoDeviceModel deviceModelByDid = SportDeviceModel.INSTANCE.getDeviceModelByDid(did == null ? "" : did);
        FitnessLogUtils.i(TAG, "startSport , did : " + did + ", deviceModel : " + deviceModelByDid);
        setRemoteSportRequestCallback(callback);
        g2o.s().j0(deviceModelByDid, (SportRequestData) SportWrapperKt.asData(sportRequestData), this.sportRequestCallback);
    }

    @Override // defpackage.isc
    public void startSportHr(@Nullable dsc IEcoRemoteDataChangedListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.isc
    public void startSportRemind(int sportType) {
        a.n().O(sportType);
    }

    @Override // defpackage.isc
    public void stopSportHr(@Nullable dsc IEcoRemoteDataChangedListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.isc
    public void syncLocalDeviceSportStatus() {
        g2o.s().l0();
    }

    @Override // defpackage.isc
    public void syncRecoverSport() {
        g2o.s().m0();
    }

    @Override // defpackage.isc
    public void syncWearSportStatus() {
        g2o.s().n0();
    }

    @Override // defpackage.isc
    public void updateSportStateData(@NotNull EcoSportWrapper requestData) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        g2o.s().o0((SportRequestData) SportWrapperKt.asData(requestData));
    }
}

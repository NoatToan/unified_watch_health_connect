package com.xiaomi.fitness.sport_manager_export.launch;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import defpackage.i7r;
import defpackage.ntc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001J+\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ)\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010!\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H&¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b$\u0010\nJ+\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H&¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0004H&¢\u0006\u0004\b,\u0010'J\u000f\u0010-\u001a\u00020\u0004H&¢\u0006\u0004\b-\u0010'J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b3\u00102J\u001b\u00104\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b6\u00102J\u0011\u00107\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b7\u00102J\u000f\u00108\u001a\u00020(H&¢\u0006\u0004\b8\u0010*J\u000f\u00109\u001a\u00020\u0004H&¢\u0006\u0004\b9\u0010'J\u000f\u0010:\u001a\u00020\u0004H&¢\u0006\u0004\b:\u0010'J\u000f\u0010;\u001a\u00020\u0002H&¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020.H&¢\u0006\u0004\b=\u00100J\u0019\u0010?\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0004H&¢\u0006\u0004\bA\u0010'J!\u0010D\u001a\u0004\u0018\u00010\b2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\bD\u0010EJ!\u0010G\u001a\u0004\u0018\u00010\b2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\bG\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010IH&¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020LH&¢\u0006\u0004\bM\u0010NJ\u0011\u0010P\u001a\u0004\u0018\u00010OH&¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\bH&¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\bH&¢\u0006\u0004\bT\u0010SJ\u001f\u0010V\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020UH&¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010X\u001a\u00020(H&¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010[H&¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010^H&¢\u0006\u0004\b_\u0010`J!\u0010c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010b\u001a\u0004\u0018\u00010aH&¢\u0006\u0004\bc\u0010dJ\u0017\u0010c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\bc\u0010eJ'\u0010i\u001a\u00020\b2\u0006\u0010f\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u00042\u0006\u0010h\u001a\u00020(H&¢\u0006\u0004\bi\u0010jJ\u0017\u0010m\u001a\u00020(2\u0006\u0010l\u001a\u00020kH&¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020(H&¢\u0006\u0004\bo\u0010*J\u0017\u0010p\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\bp\u0010eJ\u000f\u0010q\u001a\u00020\u0004H&¢\u0006\u0004\bq\u0010'J#\u0010r\u001a\u00020\b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\br\u0010\u001dJ#\u0010s\u001a\u00020\b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\bs\u0010\u001dJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u0004H&¢\u0006\u0004\bu\u0010eJ\u000f\u0010v\u001a\u00020\bH&¢\u0006\u0004\bv\u0010SJ\u000f\u0010w\u001a\u00020\bH&¢\u0006\u0004\bw\u0010SJ\u0017\u0010y\u001a\u00020\b2\u0006\u0010x\u001a\u00020\u0004H&¢\u0006\u0004\by\u0010eJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020\u0004H&¢\u0006\u0004\b{\u0010eJ\u000f\u0010|\u001a\u00020\u0004H&¢\u0006\u0004\b|\u0010'J\u0015\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00040}H&¢\u0006\u0004\b~\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "", "", "did", "", DailyRecordKey.sportType, "Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;", "callback", "", "pauseSport", "(Ljava/lang/String;ILcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "resumeSport", "finishSport", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", "sportRequestData", "startSport", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)V", FitnessRecordKey.segmentType, "nextSegmentType", "segmentSport", "(II)V", "Ljava/lang/Class;", "clazz", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportStateChangedListener", "(Ljava/lang/Class;Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;", "setSportReportDataListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ISportReportDataListener;)V", "removeSportStateChangedListener", "(Ljava/lang/Class;)V", "deviceModelDid", "accidentFinishSport", "restartSport", "getAppLaunchType", "()I", "", "checkSportDoing", "()Z", "hasOngoingSport", "getSportLaunchType", "getSportType", "", "getSportTotalDuration", "()J", "syncWearSportStatus", "()Lkotlin/Unit;", "syncLocalDeviceSportStatus", LifecycleConstantKt.ON_DESTROY, "(Ljava/lang/String;)Lkotlin/Unit;", "onStopSport", "removeRecoverSport", "isAppAloneLaunch", "getSportState", "getLocalSportState", "getPhoneDid", "()Ljava/lang/String;", "getSportDurationInSec", "model", "isEcgDevice", "(Ljava/lang/String;)Z", "getMinValidDistance", "", "speed", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "pace", "setGymPace", "(ILcom/xiaomi/fitness/sport_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "getSportReportData", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "Lntc;", "setLocalLaunchSportListener", "(Lntc;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRecoverData;", "getRecoverSport", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportRecoverData;", "syncRecoverSport", "()V", "abnormalChangeSportStateToFinish", "Li7r;", "isSupportLaunchSport", "(ILi7r;)V", "bool", "setAutoPase", "(Z)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;", "setSportSyncDataListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/ILockListener;", "setLocalReceiveListener", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ILockListener;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;", "goalRemindData", "refreshSportRemind", "(ILcom/xiaomi/fitness/sport_manager_export/data/GoalRemindData;)V", "(I)V", "num", "interval", "isNeedStart", "countDownStart", "(IIZ)V", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "sportData", "isSportValid", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)Z", "isBackgroundProcessAlive", "startSportRemind", "getSportStateFromAppAndDevice", "addAppAndDeviceSportStateListener", "removeAppAndDeviceSportStateListener", "appLaunchType", "setGymAppLaunchType", "checkBbLocationPermission", "abnormalChangeSportStateToPause", "adujustmentDis", "hadAdjustmentDistance", "vibrateLevel", "shake", "getRouteMatchResult", "", "getWholeKiloPaceList", "()Ljava/util/List;", "Companion", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0})
public interface ISportRemoteState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState$Companion;", "", "<init>", "()V", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void abnormalChangeSportStateToFinish();

    void abnormalChangeSportStateToPause();

    @Nullable
    Unit accidentFinishSport(@Nullable String deviceModelDid, int sportType, @NotNull RequestCallback callback);

    void addAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener);

    void addSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener);

    void checkBbLocationPermission();

    boolean checkSportDoing();

    void countDownStart(int num, int interval, boolean isNeedStart);

    @Nullable
    Unit finishSport(@Nullable String did, int sportType, @NotNull RequestCallback callback);

    void finishSport(@Nullable String did, @NotNull FinishSportData finishSportData, @NotNull RequestCallback callback);

    int getAppLaunchType();

    int getLocalSportState();

    int getMinValidDistance();

    @NotNull
    String getPhoneDid();

    @Nullable
    SportRecoverData getRecoverSport();

    int getRouteMatchResult();

    long getSportDurationInSec();

    int getSportLaunchType();

    @Nullable
    SportData getSportReportData();

    int getSportState();

    int getSportStateFromAppAndDevice();

    long getSportTotalDuration();

    int getSportType();

    @NotNull
    List<Integer> getWholeKiloPaceList();

    void hadAdjustmentDistance(int adujustmentDis);

    boolean hasOngoingSport();

    boolean isAppAloneLaunch();

    boolean isBackgroundProcessAlive();

    boolean isEcgDevice(@Nullable String model);

    boolean isSportValid(@NotNull PhoneSportData sportData);

    void isSupportLaunchSport(int sportType, @NotNull i7r callback);

    @Nullable
    Unit onDestroy(@Nullable String deviceModelDid);

    @Nullable
    Unit onStopSport();

    @Nullable
    Unit pauseSport(@Nullable String did, int sportType, @NotNull RequestCallback callback);

    void refreshSportRemind(int sportType);

    void refreshSportRemind(int sportType, @Nullable GoalRemindData goalRemindData);

    void removeAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener);

    @Nullable
    Unit removeRecoverSport();

    void removeSportStateChangedListener(@Nullable Class<?> clazz);

    void removeSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener);

    @Nullable
    Unit restartSport(@Nullable String deviceModelDid, int sportType, @NotNull RequestCallback callback);

    @Nullable
    Unit resumeSport(@Nullable String did, int sportType, @NotNull RequestCallback callback);

    void segmentSport(int segmentType, int nextSegmentType);

    void setAutoPase(boolean bool);

    void setGymAppLaunchType(int appLaunchType);

    @Nullable
    Unit setGymPace(int pace, @NotNull RequestCallback callback);

    @Nullable
    Unit setGymSpeed(float speed, @NotNull RequestCallback callback);

    void setLocalLaunchSportListener(@NotNull ntc listener);

    void setLocalReceiveListener(@Nullable ILockListener listener);

    void setSportReportDataListener(@Nullable ISportReportDataListener listener);

    void setSportSyncDataListener(@Nullable ISportSyncDataListener listener);

    void shake(int vibrateLevel);

    void startSport(@Nullable String did, @NotNull SportRequestData sportRequestData, @NotNull RequestCallback callback);

    void startSportRemind(int sportType);

    @Nullable
    Unit syncLocalDeviceSportStatus();

    void syncRecoverSport();

    @Nullable
    Unit syncWearSportStatus();
}

package com.xiaomi.fitness.sport_eco_manager_export.launch;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.GoalRemindData;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRecoverData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import defpackage.j7r;
import defpackage.otc;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u0000 v2\u00020\u0001:\u0001vJ+\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ+\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0010J'\u0010\u0015\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H&¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\nJ+\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH&¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b)\u0010(J\u001b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b,\u0010(J\u0011\u0010-\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b-\u0010(J\u000f\u0010.\u001a\u00020\u001eH&¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u00020\u0004H&¢\u0006\u0004\b/\u0010\u001dJ\u000f\u00100\u001a\u00020\u0004H&¢\u0006\u0004\b0\u0010\u001dJ\u000f\u00101\u001a\u00020\u0002H&¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020$H&¢\u0006\u0004\b3\u0010&J\u000f\u00104\u001a\u00020\u0004H&¢\u0006\u0004\b4\u0010\u001dJ!\u00107\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u0002052\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u0004\u0018\u00010\b2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u0004\u0018\u00010\b2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b@\u0010>J\u0011\u0010B\u001a\u0004\u0018\u00010AH&¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020DH&¢\u0006\u0004\bE\u0010FJ\u0011\u0010H\u001a\u0004\u0018\u00010GH&¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\bH&¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\bH&¢\u0006\u0004\bL\u0010KJ\u001f\u0010N\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020MH&¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u001eH&¢\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010SH&¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010VH&¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010YH&¢\u0006\u0004\bZ\u0010[J!\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010]\u001a\u0004\u0018\u00010\\H&¢\u0006\u0004\b^\u0010_J\u0017\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b^\u0010`J'\u0010d\u001a\u00020\b2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u001eH&¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020fH&¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u001eH&¢\u0006\u0004\bj\u0010 J\u0017\u0010k\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\bk\u0010`J\u000f\u0010l\u001a\u00020\u0004H&¢\u0006\u0004\bl\u0010\u001dJ#\u0010m\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bm\u0010\u0016J#\u0010n\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bn\u0010\u0016J\u0017\u0010p\u001a\u00020\b2\u0006\u0010o\u001a\u00020\u0004H&¢\u0006\u0004\bp\u0010`J\u0017\u0010r\u001a\u00020\b2\u0006\u0010q\u001a\u00020\u000eH&¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u001eH&¢\u0006\u0004\bu\u0010R¨\u0006w"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "", "", "did", "", DailyRecordKey.sportType, "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "callback", "", "startSport", "(Ljava/lang/String;ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "pauseSport", "resumeSport", "finishSport", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;", "sportRequestData", "(Ljava/lang/String;Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)V", "Ljava/lang/Class;", "clazz", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportStateChangedListener", "(Ljava/lang/Class;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;)V", "removeSportStateChangedListener", "(Ljava/lang/Class;)V", "deviceModelDid", "accidentFinishSport", "restartSport", "getAppLaunchType", "()I", "", "checkSportDoing", "()Z", "hasOngoingSport", "getSportLaunchType", "getSportType", "", "getSportTotalDuration", "()J", "syncWearSportStatus", "()Lkotlin/Unit;", "syncLocalDeviceSportStatus", LifecycleConstantKt.ON_DESTROY, "(Ljava/lang/String;)Lkotlin/Unit;", "onStopSport", "removeRecoverSport", "isAppAloneLaunch", "getSportState", "getLocalSportState", "getPhoneDid", "()Ljava/lang/String;", "getSportDurationInSec", "getMinValidDistance", "", "speed", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "ftpTest", "setGymFtpTest", "(ZLcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "ftpPercentRpm", "setGymFtpPercentRpm", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;)Lkotlin/Unit;", "pace", "setGymPace", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;", "getSportReportData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;", "Lotc;", "setLocalLaunchSportListener", "(Lotc;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRecoverData;", "getRecoverSport", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRecoverData;", "syncRecoverSport", "()V", "abnormalChangeSportStateToFinish", "Lj7r;", "isSupportLaunchSport", "(ILj7r;)V", "bool", "setAutoPase", "(Z)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "setSportSyncDataListener", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;", "setLocalReceiveListener", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IFtpStateListener;", "setFtpStateReceiveListener", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IFtpStateListener;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;", "goalRemindData", "refreshSportRemind", "(ILcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;)V", "(I)V", "num", "interval", "isNeedStart", "countDownStart", "(IIZ)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "sportData", "isSportValid", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)Z", "isBackgroundProcessAlive", "startSportRemind", "getSportStateFromAppAndDevice", "addAppAndDeviceSportStateListener", "removeAppAndDeviceSportStateListener", "appLaunchType", "setGymAppLaunchType", Constants.KEY_REQUEST_DATA, "updateSportStateData", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;)V", "isConnected", "connectChanged", "Companion", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0})
public interface IEcoSportRemoteState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState$Companion;", "", "<init>", "()V", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void abnormalChangeSportStateToFinish();

    @Nullable
    Unit accidentFinishSport(@Nullable String deviceModelDid, int sportType, @NotNull RequestCallback callback);

    void addAppAndDeviceSportStateListener(@NotNull Class<?> clazz, @NotNull ISportStateChangedListener listener);

    void addSportStateChangedListener(@Nullable Class<?> clazz, @Nullable ISportStateChangedListener listener);

    boolean checkSportDoing();

    void connectChanged(boolean isConnected);

    void countDownStart(int num, int interval, boolean isNeedStart);

    @Nullable
    Unit finishSport(@Nullable String did, int sportType, @NotNull RequestCallback callback);

    int getAppLaunchType();

    int getLocalSportState();

    int getMinValidDistance();

    @NotNull
    String getPhoneDid();

    @Nullable
    SportRecoverData getRecoverSport();

    long getSportDurationInSec();

    int getSportLaunchType();

    @Nullable
    SportData getSportReportData();

    int getSportState();

    int getSportStateFromAppAndDevice();

    long getSportTotalDuration();

    int getSportType();

    boolean hasOngoingSport();

    boolean isAppAloneLaunch();

    boolean isBackgroundProcessAlive();

    boolean isSportValid(@NotNull PhoneSportData sportData);

    void isSupportLaunchSport(int sportType, @NotNull j7r callback);

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

    void setAutoPase(boolean bool);

    void setFtpStateReceiveListener(@Nullable IFtpStateListener listener);

    void setGymAppLaunchType(int appLaunchType);

    @Nullable
    Unit setGymFtpPercentRpm(int ftpPercentRpm, @NotNull RequestCallback callback);

    @Nullable
    Unit setGymFtpTest(boolean ftpTest, @NotNull RequestCallback callback);

    @Nullable
    Unit setGymPace(int pace, @NotNull RequestCallback callback);

    @Nullable
    Unit setGymSpeed(float speed, @NotNull RequestCallback callback);

    void setLocalLaunchSportListener(@NotNull otc listener);

    void setLocalReceiveListener(@Nullable ILockListener listener);

    void setSportSyncDataListener(@Nullable ISportSyncDataListener listener);

    @Nullable
    Unit startSport(@Nullable String did, int sportType, @NotNull RequestCallback callback);

    void startSport(@Nullable String did, @NotNull SportRequestData sportRequestData, @NotNull RequestCallback callback);

    void startSportRemind(int sportType);

    @Nullable
    Unit syncLocalDeviceSportStatus();

    void syncRecoverSport();

    @Nullable
    Unit syncWearSportStatus();

    void updateSportStateData(@NotNull SportRequestData requestData);
}

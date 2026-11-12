package com.xiaomi.fitness.sport_eco.view.lockscreen.entity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport_eco.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport_eco.view.lockscreen.view.SportLockScreenActivity;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao;
import defpackage.mcn;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "", DailyRecordKey.sportType, "", "startLockScreenActivity", "(Landroid/content/Context;I)V", "Lmcn;", "getSportModelFromDB", "(I)Lmcn;", "", "getLockScreenFeatureEnabled", "()Z", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "scmDao", "", "lastReceiverTime", "J", "I", "<init>", "()V", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LockScreenReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "LockScreenReceiver";

    @Nullable
    private static TelephonyManager telephonyManager;
    private long lastReceiverTime;

    /* JADX INFO: renamed from: scmDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: goe
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LockScreenReceiver.scmDao_delegate$lambda$0();
        }
    });
    private int sportType = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static PhoneListener phoneListener = new PhoneListener();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver$Companion;", "", "<init>", "()V", "TAG", "", "telephonyManager", "Landroid/telephony/TelephonyManager;", "phoneListener", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/PhoneListener;", "registerPhoneListener", "", "context", "Landroid/content/Context;", "unregisterPhoneListener", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void registerPhoneListener(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                LockScreenReceiver.telephonyManager = (TelephonyManager) systemService;
                TelephonyManager telephonyManager = LockScreenReceiver.telephonyManager;
                if (telephonyManager != null) {
                    telephonyManager.listen(LockScreenReceiver.phoneListener, 32);
                }
            } catch (Exception unused) {
            }
        }

        public final void unregisterPhoneListener() {
            if (LockScreenReceiver.telephonyManager == null) {
                return;
            }
            try {
                TelephonyManager telephonyManager = LockScreenReceiver.telephonyManager;
                if (telephonyManager != null) {
                    telephonyManager.listen(LockScreenReceiver.phoneListener, 0);
                }
            } catch (Exception unused) {
            }
            LockScreenReceiver.phoneListener = null;
            LockScreenReceiver.telephonyManager = null;
        }
    }

    private final boolean getLockScreenFeatureEnabled() {
        FitnessLogUtils.d(TAG, "getLockScreenFeatureEnabled sportType=" + this.sportType);
        mcn sportModelFromDB = getSportModelFromDB(this.sportType);
        if (sportModelFromDB != null) {
            return sportModelFromDB.f26020k;
        }
        return false;
    }

    private final SCMDao getScmDao() {
        return (SCMDao) this.scmDao.getValue();
    }

    private final mcn getSportModelFromDB(int sportType) {
        return getScmDao().getSportConfigModel(sportType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    private final void startLockScreenActivity(Context context, int sportType) {
        getSportModelFromDB(sportType);
        Intent intent = new Intent(context, (Class<?>) SportLockScreenActivity.class);
        intent.addFlags(276824064);
        context.startActivity(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        FitnessLogUtils.d(TAG, "action = " + (intent != null ? intent.getAction() : null));
        IEcoSportRemoteState.Companion companion = IEcoSportRemoteState.INSTANCE;
        this.sportType = SportEcoManagerExtKt.getInstance(companion).getSportType();
        if (getLockScreenFeatureEnabled()) {
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -2128145023) {
                    if (iHashCode == -1326089125) {
                        if (action.equals("android.intent.action.PHONE_STATE")) {
                            INSTANCE.registerPhoneListener(ApplicationExtKt.getApplication());
                            return;
                        }
                        return;
                    } else {
                        if (iHashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                            this.lastReceiverTime = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.lastReceiverTime;
                    if (j <= 0 || jCurrentTimeMillis - j >= 1500) {
                        SportDataInstance sportDataInstance = SportDataInstance.INSTANCE;
                        if (!sportDataInstance.getRunLockScreen()) {
                            sportDataInstance.setRunLockScreen(true);
                            return;
                        }
                        int sportState = SportEcoManagerExtKt.getInstance(companion).getSportState();
                        FitnessLogUtils.d(TAG, "sportType " + this.sportType);
                        if (this.sportType != 0) {
                            FitnessLogUtils.d(TAG, "sportState " + sportState);
                            if (sportState != 4) {
                                startLockScreenActivity(ApplicationExtKt.getApplication(), this.sportType);
                            }
                        }
                    }
                }
            }
        }
    }
}

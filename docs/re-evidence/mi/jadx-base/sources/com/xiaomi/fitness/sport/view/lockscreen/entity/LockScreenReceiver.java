package com.xiaomi.fitness.sport.view.lockscreen.entity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.view.lockscreen.SportLockScreenShowUtil;
import com.xiaomi.fitness.sport.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport.view.lockscreen.view.SportLockScreenActivity;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import defpackage.lcn;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "", DailyRecordKey.sportType, "wearMode", "", "startLockScreenActivity", "(Landroid/content/Context;II)V", "Llcn;", "getSportModelFromDB", "(I)Llcn;", "", "getLockScreenFeatureEnabled", "()Z", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "I", "getWearMode", "()I", "Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao$delegate", "Lkotlin/Lazy;", "getScmDao", "()Lcom/xiaomi/fitness/sport_manager_export/listener/SCMDao;", "scmDao", "", "lastReceiverTime", "J", "<init>", "(I)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LockScreenReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "LockScreenReceiver";

    @Nullable
    private static TelephonyManager telephonyManager;
    private long lastReceiverTime;

    /* JADX INFO: renamed from: scmDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scmDao;
    private int sportType;
    private final int wearMode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static PhoneListener phoneListener = new PhoneListener();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver$Companion;", "", "<init>", "()V", "TAG", "", "telephonyManager", "Landroid/telephony/TelephonyManager;", "phoneListener", "Lcom/xiaomi/fitness/sport/view/lockscreen/entity/PhoneListener;", "registerPhoneListener", "", "context", "Landroid/content/Context;", "unregisterPhoneListener", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public LockScreenReceiver() {
        this(0, 1, null);
    }

    private final boolean getLockScreenFeatureEnabled() {
        Logger.d(TAG, "getLockScreenFeatureEnabled sportType=" + this.sportType);
        lcn sportModelFromDB = getSportModelFromDB(this.sportType);
        if (sportModelFromDB != null) {
            return sportModelFromDB.f24910k;
        }
        return false;
    }

    private final SCMDao getScmDao() {
        return (SCMDao) this.scmDao.getValue();
    }

    private final lcn getSportModelFromDB(int sportType) {
        return getScmDao().getSportConfigModel(sportType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SCMDao scmDao_delegate$lambda$0() {
        return SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao();
    }

    private final void startLockScreenActivity(Context context, int sportType, int wearMode) {
        if (SportLockScreenShowUtil.INSTANCE.shouldShowDataWhenLockScreen(context)) {
            getSportModelFromDB(sportType);
            Intent intent = new Intent(context, (Class<?>) SportLockScreenActivity.class);
            intent.putExtra("WEAR_MODE", wearMode);
            intent.addFlags(276824064);
            context.startActivity(intent);
        }
    }

    public final int getWearMode() {
        return this.wearMode;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        Object[] objArr = new Object[1];
        objArr[0] = intent != null ? intent.getAction() : null;
        Logger.d(TAG, objArr);
        ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
        this.sportType = SportManagerExtKt.getInstance(companion).getSportType();
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
                        int sportState = SportManagerExtKt.getInstance(companion).getSportState();
                        Logger.d(TAG, "sportType " + this.sportType);
                        if (this.sportType != 0) {
                            Logger.d(TAG, "sportState " + sportState);
                            if (sportState != 4) {
                                startLockScreenActivity(ApplicationExtKt.getApplication(), this.sportType, this.wearMode);
                            }
                        }
                    }
                }
            }
        }
    }

    public LockScreenReceiver(int i) {
        this.wearMode = i;
        this.scmDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hoe
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LockScreenReceiver.scmDao_delegate$lambda$0();
            }
        });
        this.sportType = 1;
    }

    public /* synthetic */ LockScreenReceiver(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

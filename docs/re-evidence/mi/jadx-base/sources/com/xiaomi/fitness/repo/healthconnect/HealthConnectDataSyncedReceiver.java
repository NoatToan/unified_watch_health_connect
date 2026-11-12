package com.xiaomi.fitness.repo.healthconnect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.aje;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/HealthConnectDataSyncedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectDataSyncedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "HealthConnectDataSyncedReceiver";

    @Nullable
    private static HealthConnectDataSyncedReceiver receiver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/HealthConnectDataSyncedReceiver$Companion;", "", "<init>", "()V", "TAG", "", "receiver", "Lcom/xiaomi/fitness/repo/healthconnect/HealthConnectDataSyncedReceiver;", LoginPreferenceConfig.TYPE_REGISTER, "", "unregister", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void register() {
            Logger.i(HealthConnectDataSyncedReceiver.TAG, "register HealthConnectDataSyncedReceiver");
            HealthConnectDataSyncedReceiver healthConnectDataSyncedReceiver = new HealthConnectDataSyncedReceiver();
            aje ajeVarB = aje.b(ApplicationExtKt.getApplication());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("fitness.action.SUMMARY_SYNCED");
            intentFilter.addAction(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON);
            intentFilter.addAction("recent_data_changed_broadcast");
            Unit unit = Unit.INSTANCE;
            ajeVarB.c(healthConnectDataSyncedReceiver, intentFilter);
            HealthConnectDataSyncedReceiver.receiver = healthConnectDataSyncedReceiver;
        }

        public final void unregister() {
            HealthConnectDataSyncedReceiver healthConnectDataSyncedReceiver = HealthConnectDataSyncedReceiver.receiver;
            if (healthConnectDataSyncedReceiver != null) {
                aje.b(ApplicationExtKt.getApplication()).e(healthConnectDataSyncedReceiver);
            }
            Logger.i(HealthConnectDataSyncedReceiver.TAG, "unregister HealthConnectDataSyncedReceiver " + (HealthConnectDataSyncedReceiver.receiver == null));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action;
        Logger.i(TAG, "data change event!!:" + (intent != null ? intent.getAction() : null));
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1841474246) {
            if (iHashCode != 1840168581 || !action.equals("fitness.action.SUMMARY_SYNCED")) {
                return;
            }
        } else if (!action.equals(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON)) {
            return;
        }
        HealthConnectSyncUtils healthConnectSyncUtils = HealthConnectSyncUtils.INSTANCE;
        healthConnectSyncUtils.syncDailyRecords(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"step", "hr", "spo2", "calorie", "sleep"}));
        healthConnectSyncUtils.syncReport();
    }
}

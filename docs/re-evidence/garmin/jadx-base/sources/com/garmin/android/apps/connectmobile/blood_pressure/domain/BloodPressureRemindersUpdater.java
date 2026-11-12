package com.garmin.android.apps.connectmobile.blood_pressure.domain;

import android.content.Context;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.BloodPressureReminderNetwork;
import com.garmin.android.apps.connectmobile.reminders.domain.updater.strategy.CacheRemindersUpdater;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import nd1.a;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/domain/BloodPressureRemindersUpdater;", "Lnd1/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "BloodPressureCacheReminderUpdater", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BloodPressureRemindersUpdater extends a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/domain/BloodPressureRemindersUpdater$BloodPressureCacheReminderUpdater;", "Lcom/garmin/android/apps/connectmobile/reminders/domain/updater/strategy/CacheRemindersUpdater;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BloodPressureCacheReminderUpdater extends CacheRemindersUpdater {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloodPressureCacheReminderUpdater(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.reminders.domain.updater.strategy.CacheRemindersUpdater
        public final ud1.a d() {
            return new xw.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodPressureRemindersUpdater(Context context) {
        super(context, pd1.a.BLOOD_PRESSURE);
        context.getClass();
    }

    @Override // nd1.a
    public final Class<? extends CacheRemindersUpdater> d() {
        return BloodPressureCacheReminderUpdater.class;
    }

    @Override // nd1.a
    public final Class<? extends RemindersNetwork> e() {
        return BloodPressureReminderNetwork.class;
    }
}

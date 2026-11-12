package com.garmin.android.apps.connectmobile.reminders.domain.updater.strategy;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import pd1.c;
import ud1.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/reminders/domain/updater/strategy/CacheRemindersUpdater;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class CacheRemindersUpdater extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheRemindersUpdater(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        a aVarD = d();
        Context context = this.f11469a;
        context.getClass();
        a2 a2Var = a2.USER_REMINDERS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", "scheduleAllRemindersFromCache: ");
        c cVarG = aVarD.g();
        if (cVarG == null) {
            i2.a.b(a2Var, "ReminderNotificationHelper", "scheduleAllRemindersFromCache: no cached reminders found, not scheduling anything");
        } else {
            i2.a.b(a2Var, "ReminderNotificationHelper", "scheduleAllRemindersFromCache: cached reminders found, scheduling them");
            aVarD.j(context, cVarG);
        }
        return new d.a.c();
    }

    public abstract a d();
}

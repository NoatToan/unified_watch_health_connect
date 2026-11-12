package com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders;

import android.content.Context;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import p005kotlin.Metadata;
import pd1.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/BloodPressureReminderNetwork;", "Lcom/garmin/android/apps/connectmobile/reminders/network/RemindersNetwork;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BloodPressureReminderNetwork extends RemindersNetwork {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f30926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodPressureReminderNetwork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f30926f = context;
    }

    @Override // com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork
    public final pd1.a d() {
        return pd1.a.BLOOD_PRESSURE;
    }

    @Override // com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork
    public final void e(c cVar) {
        cVar.getClass();
        new xw.a().o(this.f30926f, cVar);
    }
}

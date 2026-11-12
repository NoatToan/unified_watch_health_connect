package com.garmin.android.apps.connectmobile.pregnancytracking.network;

import android.content.Context;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/PregnancyReminderNetwork;", "Lcom/garmin/android/apps/connectmobile/reminders/network/RemindersNetwork;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyReminderNetwork extends RemindersNetwork {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f40425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PregnancyReminderNetwork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f40425f = context;
    }

    @Override // com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork
    public final pd1.a d() {
        return pd1.a.PREGNANCY;
    }

    @Override // com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork
    public final void e(pd1.c cVar) {
        cVar.getClass();
        new nb1.a().o(this.f40425f, cVar);
    }
}

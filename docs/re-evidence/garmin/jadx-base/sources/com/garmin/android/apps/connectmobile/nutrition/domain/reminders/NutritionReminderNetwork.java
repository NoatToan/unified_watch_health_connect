package com.garmin.android.apps.connectmobile.nutrition.domain.reminders;

import android.content.Context;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pd1.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/domain/reminders/NutritionReminderNetwork;", "Lcom/garmin/android/apps/connectmobile/reminders/network/RemindersNetwork;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NutritionReminderNetwork extends RemindersNetwork {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f39576f;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NutritionReminderNetwork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f39576f = context;
    }

    @Override // com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork
    public final pd1.a d() {
        return pd1.a.GCNT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork
    public final void e(c cVar) {
        cVar.getClass();
        i2.f36769a.getClass();
        i2.a.b(a2.USER_REMINDERS, "NutritionReminderNetwork", "[onRemindersObtained] remindersList: " + cVar);
        new t01.a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0).o(this.f39576f, cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/domain/reminders/NutritionReminderNetwork$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

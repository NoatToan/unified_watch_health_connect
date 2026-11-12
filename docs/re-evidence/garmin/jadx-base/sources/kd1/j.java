package kd1;

import android.app.AlarmManager;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkd1/j;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkd1/k;", "updateAllReminders", "<init>", "(Landroid/content/Context;Lkd1/k;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f104518b;

    static {
        new a(null);
    }

    public j(Context context, k kVar) {
        context.getClass();
        kVar.getClass();
        this.f104517a = context;
        this.f104518b = kVar;
    }

    public final void a() {
        j22.b.f96736a.getClass();
        if (j22.b.l()) {
            Object systemService = this.f104517a.getSystemService("alarm");
            systemService.getClass();
            if (!((AlarmManager) systemService).canScheduleExactAlarms()) {
                a2 a2Var = a2.USER_REMINDERS;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "UpdateAllRemindersOnStartupFromCacheUseCase", "Not updating reminders on startup - exact alarms permission not granted");
                return;
            }
        }
        a2 a2Var2 = a2.USER_REMINDERS;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "UpdateAllRemindersOnStartupFromCacheUseCase", "Updating all reminders on startup");
        this.f104518b.a(nd1.c.CACHE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd1/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

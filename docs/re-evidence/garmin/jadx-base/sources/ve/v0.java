package ve;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve/v0;", "Lkd/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 extends kd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f177618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context) {
        super(9, 10);
        context.getClass();
        this.f177618a = context;
    }

    @Override // kd.a
    public final void migrate(vd.c cVar) {
        cVar.getClass();
        cVar.k3("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f177618a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j8 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j14 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.F();
            try {
                cVar.I1(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j8)});
                cVar.I1(new Object[]{"reschedule_needed", Long.valueOf(j14)});
                sharedPreferences.edit().clear().apply();
                cVar.t3();
                cVar.y3();
            } catch (Throwable th3) {
                cVar.y3();
                throw th3;
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i14 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i15 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            cVar.F();
            try {
                cVar.I1(new Object[]{"next_job_scheduler_id", Integer.valueOf(i14)});
                cVar.I1(new Object[]{"next_alarm_manager_id", Integer.valueOf(i15)});
                sharedPreferences2.edit().clear().apply();
                cVar.t3();
            } finally {
                cVar.y3();
            }
        }
    }
}

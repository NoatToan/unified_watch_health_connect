package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class f7i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f17502a;

    public f7i(WorkDatabase workDatabase) {
        this.f17502a = workDatabase;
    }

    public static /* synthetic */ Long f(Long l) {
        return Long.valueOf(l != null ? l.longValue() : 0L);
    }

    public static void g(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    public long b() {
        Long longValue = this.f17502a.preferenceDao().getLongValue("last_cancel_all_time_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public LiveData<Long> c() {
        return Transformations.map(this.f17502a.preferenceDao().getObservableLongValue("last_cancel_all_time_ms"), new Function1() { // from class: e7i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return f7i.f((Long) obj);
            }
        });
    }

    public long d() {
        Long longValue = this.f17502a.preferenceDao().getLongValue("last_force_stop_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public boolean e() {
        Long longValue = this.f17502a.preferenceDao().getLongValue("reschedule_needed");
        return longValue != null && longValue.longValue() == 1;
    }

    public void h(long j) {
        this.f17502a.preferenceDao().insertPreference(new Preference("last_cancel_all_time_ms", Long.valueOf(j)));
    }

    public void i(long j) {
        this.f17502a.preferenceDao().insertPreference(new Preference("last_force_stop_ms", Long.valueOf(j)));
    }

    public void j(boolean z) {
        this.f17502a.preferenceDao().insertPreference(new Preference("reschedule_needed", z));
    }
}

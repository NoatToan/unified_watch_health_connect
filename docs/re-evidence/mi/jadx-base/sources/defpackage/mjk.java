package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.facebook.react.modules.appstate.AppStateModule;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckSettingConfig;

/* JADX INFO: loaded from: classes3.dex */
@Entity(tableName = HealthCheckSettingConfig.KEY_REMINDER)
public class mjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "reminder_id")
    public String f26934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "type")
    public int f26935b;

    @ColumnInfo(name = "event_value")
    public String c;

    @ColumnInfo(name = "timed_value")
    public int d;

    @ColumnInfo(name = "remind_cb")
    public String e;

    @ColumnInfo(name = "def_notice_id")
    public String f;

    @ColumnInfo(name = AppStateModule.APP_STATE_ACTIVE)
    public boolean g = true;

    @ColumnInfo(name = "remind_interval")
    public long h = 0;

    @ColumnInfo(name = "last_remind_time")
    public long i = 0;
    public transient owg j;

    public owg a() {
        return this.j;
    }

    public void b(owg owgVar) {
        this.j = owgVar;
    }
}

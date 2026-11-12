package defpackage;

import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.facebook.react.modules.appstate.AppStateModule;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckSettingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yjk implements njk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f40245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<mjk> f40246b = new a();
    public final EntityDeleteOrUpdateAdapter<mjk> c = new b();

    public class a extends EntityInsertAdapter<mjk> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, mjk mjkVar) {
            String str = mjkVar.f26934a;
            if (str == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, str);
            }
            sQLiteStatement.mo50bindLong(2, mjkVar.f26935b);
            String str2 = mjkVar.c;
            if (str2 == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, str2);
            }
            sQLiteStatement.mo50bindLong(4, mjkVar.d);
            String str3 = mjkVar.e;
            if (str3 == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, str3);
            }
            String str4 = mjkVar.f;
            if (str4 == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, str4);
            }
            sQLiteStatement.mo50bindLong(7, mjkVar.g ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, mjkVar.h);
            sQLiteStatement.mo50bindLong(9, mjkVar.i);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `reminder` (`reminder_id`,`type`,`event_value`,`timed_value`,`remind_cb`,`def_notice_id`,`active`,`remind_interval`,`last_remind_time`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<mjk> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, mjk mjkVar) {
            String str = mjkVar.f26934a;
            if (str == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, str);
            }
            sQLiteStatement.mo50bindLong(2, mjkVar.f26935b);
            String str2 = mjkVar.c;
            if (str2 == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, str2);
            }
            sQLiteStatement.mo50bindLong(4, mjkVar.d);
            String str3 = mjkVar.e;
            if (str3 == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, str3);
            }
            String str4 = mjkVar.f;
            if (str4 == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, str4);
            }
            sQLiteStatement.mo50bindLong(7, mjkVar.g ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, mjkVar.h);
            sQLiteStatement.mo50bindLong(9, mjkVar.i);
            String str5 = mjkVar.f26934a;
            if (str5 == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, str5);
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `reminder` SET `reminder_id` = ?,`type` = ?,`event_value` = ?,`timed_value` = ?,`remind_cb` = ?,`def_notice_id` = ?,`active` = ?,`remind_interval` = ?,`last_remind_time` = ? WHERE `reminder_id` = ?";
        }
    }

    public yjk(RoomDatabase roomDatabase) {
        this.f40245a = roomDatabase;
    }

    public static /* synthetic */ List A(String str, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder WHERE active = 1 AND type = 1 AND event_value = ? AND (? - last_remind_time >= remind_interval)");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                mjk mjkVar = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar.f26934a = null;
                } else {
                    mjkVar.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar.c = null;
                } else {
                    mjkVar.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar.e = null;
                } else {
                    mjkVar.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar.f = null;
                } else {
                    mjkVar.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                mjkVar.g = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                mjkVar.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                arrayList.add(mjkVar);
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List B(int i, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value = ? AND (? - last_remind_time >= remind_interval)");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                mjk mjkVar = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar.f26934a = null;
                } else {
                    mjkVar.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar.c = null;
                } else {
                    mjkVar.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar.e = null;
                } else {
                    mjkVar.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar.f = null;
                } else {
                    mjkVar.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                mjkVar.g = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                mjkVar.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                arrayList.add(mjkVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ mjk C(int i, String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value = ? AND reminder_id = ?");
        long j = i;
        boolean z = true;
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            mjk mjkVar = null;
            if (sQLiteStatementPrepare.step()) {
                mjk mjkVar2 = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar2.f26934a = null;
                } else {
                    mjkVar2.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar2.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar2.c = null;
                } else {
                    mjkVar2.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar2.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar2.e = null;
                } else {
                    mjkVar2.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar2.f = null;
                } else {
                    mjkVar2.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) == 0) {
                    z = false;
                }
                mjkVar2.g = z;
                mjkVar2.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar2.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                mjkVar = mjkVar2;
            }
            return mjkVar;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List D(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value >= ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                mjk mjkVar = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar.f26934a = null;
                } else {
                    mjkVar.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar.c = null;
                } else {
                    mjkVar.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar.e = null;
                } else {
                    mjkVar.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar.f = null;
                } else {
                    mjkVar.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                mjkVar.g = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                mjkVar.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                arrayList.add(mjkVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static List<Class<?>> u() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object v(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM reminder WHERE reminder_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ mjk w(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM REMINDER WHERE reminder_id = ?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            mjk mjkVar = null;
            if (sQLiteStatementPrepare.step()) {
                mjk mjkVar2 = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar2.f26934a = null;
                } else {
                    mjkVar2.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar2.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar2.c = null;
                } else {
                    mjkVar2.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar2.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar2.e = null;
                } else {
                    mjkVar2.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar2.f = null;
                } else {
                    mjkVar2.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) == 0) {
                    z = false;
                }
                mjkVar2.g = z;
                mjkVar2.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar2.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                mjkVar = mjkVar2;
            }
            sQLiteStatementPrepare.close();
            return mjkVar;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List y(int i, int i2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value > ? ORDER BY timed_value LIMIT ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                mjk mjkVar = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar.f26934a = null;
                } else {
                    mjkVar.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar.c = null;
                } else {
                    mjkVar.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar.e = null;
                } else {
                    mjkVar.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar.f = null;
                } else {
                    mjkVar.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                mjkVar.g = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                mjkVar.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                arrayList.add(mjkVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ mjk z(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder WHERE active = 1 AND type = 1 AND event_value = ? AND reminder_id = ?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reminder_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event_value");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timed_value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_cb");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "def_notice_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AppStateModule.APP_STATE_ACTIVE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_interval");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_remind_time");
            mjk mjkVar = null;
            if (sQLiteStatementPrepare.step()) {
                mjk mjkVar2 = new mjk();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    mjkVar2.f26934a = null;
                } else {
                    mjkVar2.f26934a = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                mjkVar2.f26935b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    mjkVar2.c = null;
                } else {
                    mjkVar2.c = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                mjkVar2.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    mjkVar2.e = null;
                } else {
                    mjkVar2.e = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    mjkVar2.f = null;
                } else {
                    mjkVar2.f = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) == 0) {
                    z = false;
                }
                mjkVar2.g = z;
                mjkVar2.h = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                mjkVar2.i = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                mjkVar = mjkVar2;
            }
            sQLiteStatementPrepare.close();
            return mjkVar;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Object E(mjk mjkVar, SQLiteConnection sQLiteConnection) {
        this.c.handle(sQLiteConnection, mjkVar);
        return null;
    }

    @Override // defpackage.njk
    public void a(final String str) {
        DBUtil.performBlocking(this.f40245a, false, true, new Function1() { // from class: ojk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.v(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public void b(final mjk... mjkVarArr) {
        DBUtil.performBlocking(this.f40245a, false, true, new Function1() { // from class: wjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f38032a.x(mjkVarArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public List<mjk> c(final int i, final long j) {
        return (List) DBUtil.performBlocking(this.f40245a, true, false, new Function1() { // from class: vjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.B(i, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public void d(final mjk mjkVar) {
        DBUtil.performBlocking(this.f40245a, false, true, new Function1() { // from class: qjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31572a.E(mjkVar, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public mjk e(final String str) {
        return (mjk) DBUtil.performBlocking(this.f40245a, true, false, new Function1() { // from class: rjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.w(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public mjk f(final int i, final String str) {
        return (mjk) DBUtil.performBlocking(this.f40245a, true, false, new Function1() { // from class: xjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.C(i, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public LiveData<List<mjk>> g(final int i) {
        return this.f40245a.getInvalidationTracker().createLiveData(new String[]{HealthCheckSettingConfig.KEY_REMINDER}, false, new Function1() { // from class: sjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.D(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public List<mjk> h(final int i, final int i2) {
        return (List) DBUtil.performBlocking(this.f40245a, true, false, new Function1() { // from class: pjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.y(i, i2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public List<mjk> i(final String str, final long j) {
        return (List) DBUtil.performBlocking(this.f40245a, true, false, new Function1() { // from class: tjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.A(str, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.njk
    public mjk j(final String str, final String str2) {
        return (mjk) DBUtil.performBlocking(this.f40245a, true, false, new Function1() { // from class: ujk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return yjk.z(str, str2, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object x(mjk[] mjkVarArr, SQLiteConnection sQLiteConnection) {
        this.f40246b.insert(sQLiteConnection, mjkVarArr);
        return null;
    }
}

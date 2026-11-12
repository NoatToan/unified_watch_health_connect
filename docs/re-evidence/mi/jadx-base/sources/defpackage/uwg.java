package defpackage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uwg implements qwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f36220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<owg> f36221b = new a();

    public class a extends EntityInsertAdapter<owg> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, owg owgVar) {
            sQLiteStatement.mo50bindLong(1, owgVar.k());
            String str = owgVar.f29762b;
            if (str == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, str);
            }
            sQLiteStatement.mo50bindLong(3, owgVar.d);
            sQLiteStatement.mo50bindLong(4, owgVar.e);
            sQLiteStatement.mo50bindLong(5, owgVar.f);
            String str2 = owgVar.g;
            if (str2 == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, str2);
            }
            String str3 = owgVar.h;
            if (str3 == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, str3);
            }
            if (owgVar.b() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, owgVar.b());
            }
            String str4 = owgVar.j;
            if (str4 == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, str4);
            }
            String str5 = owgVar.f29763k;
            if (str5 == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, str5);
            }
            sQLiteStatement.mo50bindLong(11, owgVar.l);
            sQLiteStatement.mo50bindLong(12, owgVar.m);
            String str6 = owgVar.n;
            if (str6 == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, str6);
            }
            if (owgVar.i() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo52bindText(14, owgVar.i());
            }
            if (owgVar.f() == null) {
                sQLiteStatement.mo51bindNull(15);
            } else {
                sQLiteStatement.mo52bindText(15, owgVar.f());
            }
            String strA = pwg.a(owgVar.a());
            if (strA == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, strA);
            }
            owg.b bVar = owgVar.c;
            if (bVar == null) {
                sQLiteStatement.mo51bindNull(17);
                sQLiteStatement.mo51bindNull(18);
                return;
            }
            String str7 = bVar.f29767a;
            if (str7 == null) {
                sQLiteStatement.mo51bindNull(17);
            } else {
                sQLiteStatement.mo52bindText(17, str7);
            }
            String str8 = bVar.f29768b;
            if (str8 == null) {
                sQLiteStatement.mo51bindNull(18);
            } else {
                sQLiteStatement.mo52bindText(18, str8);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `notice` (`template`,`notice_id`,`notify_id`,`priority`,`importance`,`title`,`content`,`big_pic_url`,`intent_uri`,`delete_intent_uri`,`small_icon`,`icon`,`vibration_pattern`,`message_producer`,`group_key`,`actions`,`channel_id`,`channel_name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public uwg(RoomDatabase roomDatabase) {
        this.f36220a = roomDatabase;
    }

    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object h(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM notice WHERE notice_id = ?");
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

    public static /* synthetic */ owg i(String str, SQLiteConnection sQLiteConnection) {
        owg owgVar;
        owg.b bVar;
        String str2;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM notice WHERE notice_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "template");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "notice_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "notify_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "priority");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "importance");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MiuiCursorConstants.CONTENT);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "big_pic_url");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "intent_uri");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "delete_intent_uri");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "small_icon");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "vibration_pattern");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "message_producer");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_key");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "actions");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "channel_id");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "channel_name");
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow17) && sQLiteStatementPrepare.isNull(columnIndexOrThrow18)) {
                    columnIndexOrThrow12 = columnIndexOrThrow12;
                    bVar = null;
                } else {
                    bVar = new owg.b();
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow17)) {
                        bVar.f29767a = null;
                    } else {
                        bVar.f29767a = sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow18)) {
                        bVar.f29768b = null;
                    } else {
                        bVar.f29768b = sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                    }
                }
                owg owgVar2 = new owg();
                owgVar2.t((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    owgVar2.f29762b = null;
                } else {
                    owgVar2.f29762b = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                owgVar2.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                owgVar2.e = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                owgVar2.f = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    owgVar2.g = null;
                } else {
                    owgVar2.g = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    owgVar2.h = null;
                } else {
                    owgVar2.h = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                }
                owgVar2.p(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    owgVar2.j = null;
                } else {
                    owgVar2.j = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    owgVar2.f29763k = null;
                } else {
                    owgVar2.f29763k = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                }
                owgVar2.l = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                owgVar2.m = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    str2 = null;
                    owgVar2.n = null;
                } else {
                    str2 = null;
                    owgVar2.n = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                }
                owgVar2.s(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                owgVar2.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                owgVar2.o(pwg.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow16)));
                owgVar2.c = bVar;
                owgVar = owgVar2;
            } else {
                owgVar = null;
            }
            sQLiteStatementPrepare.close();
            return owgVar;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // defpackage.qwg
    public void a(final String str) {
        DBUtil.performBlocking(this.f36220a, false, true, new Function1() { // from class: swg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return uwg.h(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.qwg
    public void b(final owg... owgVarArr) {
        DBUtil.performBlocking(this.f36220a, false, true, new Function1() { // from class: twg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35135a.j(owgVarArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.qwg
    public owg c(final String str) {
        return (owg) DBUtil.performBlocking(this.f36220a, true, false, new Function1() { // from class: rwg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return uwg.i(str, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object j(owg[] owgVarArr, SQLiteConnection sQLiteConnection) {
        this.f36221b.insert(sQLiteConnection, owgVarArr);
        return null;
    }
}

package com.xiaomi.fitness.aggregation.summary;

import androidx.sqlite.db.SupportSQLiteDatabase;
import defpackage.a8l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ6\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J>\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J>\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0014\u001a\u00020\fH\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/TriggerFactory;", "", "<init>", "()V", "registerSyncTrigger", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "mapper", "Lcom/xiaomi/fitness/aggregation/summary/TableMapping;", "createHardDelTrigger", "tableName", "", "draftTable", "columns", "", "hardDelTriggerName", "createUpdateDelTrigger", "updateDelTrigger", "createInsertTrigger", "insertTriggerName", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriggerFactory {

    @NotNull
    public static final TriggerFactory INSTANCE = new TriggerFactory();

    private TriggerFactory() {
    }

    private final void createHardDelTrigger(SupportSQLiteDatabase db, String tableName, String draftTable, List<String> columns, String hardDelTriggerName) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS ");
        sb.append(hardDelTriggerName);
        sb.append(" AFTER DELETE ");
        sb.append(" ON ");
        sb.append(tableName);
        sb.append(" BEGIN INSERT OR REPLACE INTO ");
        sb.append(draftTable);
        sb.append("(");
        a8l.b(sb, null, columns);
        sb.append(") VALUES (");
        a8l.b(sb, "old.", columns);
        sb.append("); END");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        db.execSQL(string);
    }

    private final void createInsertTrigger(SupportSQLiteDatabase db, TableMapping mapper, String tableName, String draftTable, List<String> columns, String insertTriggerName) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS ");
        sb.append(insertTriggerName);
        sb.append(" AFTER INSERT ON ");
        sb.append(tableName);
        sb.append(" FOR EACH ROW WHEN new.");
        sb.append(mapper.getColumnDeleted());
        sb.append(" = 0 ");
        List<String> supportKeys = mapper.getSupportKeys();
        List<String> list = supportKeys;
        if (list != null && !list.isEmpty()) {
            sb.append(" AND new.");
            sb.append(mapper.getColumnKey());
            sb.append(" IN (");
            int size = supportKeys.size();
            for (int i = 0; i < size; i++) {
                sb.append("'");
                sb.append(supportKeys.get(i));
                sb.append("'");
                if (i < size - 1) {
                    sb.append(",");
                }
            }
            sb.append(") ");
        }
        sb.append(" BEGIN INSERT OR REPLACE INTO ");
        sb.append(draftTable);
        sb.append("(");
        a8l.b(sb, null, columns);
        sb.append(") VALUES (");
        a8l.b(sb, "new.", columns);
        sb.append("); END");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        db.execSQL(string);
    }

    private final void createUpdateDelTrigger(SupportSQLiteDatabase db, TableMapping mapper, String tableName, String draftTable, List<String> columns, String updateDelTrigger) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS ");
        sb.append(updateDelTrigger);
        sb.append(" AFTER UPDATE OF ");
        sb.append(mapper.getColumnDeleted());
        sb.append(" ON ");
        sb.append(tableName);
        sb.append(" FOR EACH ROW WHEN new.");
        sb.append(mapper.getColumnDeleted());
        sb.append("!=0");
        List<String> supportKeys = mapper.getSupportKeys();
        List<String> list = supportKeys;
        if (list != null && !list.isEmpty()) {
            sb.append(" AND new.");
            sb.append(mapper.getColumnKey());
            sb.append(" IN (");
            int size = supportKeys.size();
            for (int i = 0; i < size; i++) {
                sb.append("'");
                sb.append(supportKeys.get(i));
                sb.append("'");
                if (i < size - 1) {
                    sb.append(",");
                }
            }
            sb.append(") ");
        }
        sb.append(" BEGIN INSERT OR REPLACE INTO ");
        sb.append(draftTable);
        sb.append("(");
        a8l.b(sb, null, columns);
        sb.append(") VALUES (");
        a8l.b(sb, "new.", columns);
        sb.append("); END");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        db.execSQL(string);
    }

    public final void registerSyncTrigger(@NotNull SupportSQLiteDatabase db, @NotNull TableMapping mapper) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String tableName = mapper.getTableName();
        String draftTableName = mapper.getDraftTableName();
        List<String> listD = a8l.d(db, draftTableName, false);
        Intrinsics.checkNotNullExpressionValue(listD, "getColumns(...)");
        String str = "_trigger_" + tableName + "_insert";
        db.execSQL("DROP TRIGGER IF EXISTS " + str);
        createInsertTrigger(db, mapper, tableName, draftTableName, listD, str);
        String str2 = "_trigger_" + tableName + "_update_del";
        db.execSQL("DROP TRIGGER IF EXISTS " + str2);
        createUpdateDelTrigger(db, mapper, tableName, draftTableName, listD, str2);
        String str3 = "_trigger_" + tableName + "_hard_del";
        db.execSQL("DROP TRIGGER IF EXISTS " + str3);
        createHardDelTrigger(db, tableName, draftTableName, listD, str3);
    }
}

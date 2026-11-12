package com.xiaomi.fitness.aggregation.summary;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.a8l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fJ\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SummaryTable;", "", "<init>", "()V", "TABLE_VERSION", "", "COL_TABLE_NAME", "COL_VERSION", "CREATE_VERSION_TABLE", "QUERY_TABLE_VERSION", "initVersionTable", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getTableVersion", "", "tableName", "insertTable", "version", "upgradeTable", "newVersion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SummaryTable {

    @NotNull
    private static final String COL_TABLE_NAME = "table_name";

    @NotNull
    private static final String COL_VERSION = "version";

    @NotNull
    private static final String CREATE_VERSION_TABLE = "CREATE TABLE IF NOT EXISTS _version_table_ (table_name TEXT PRIMARY KEY NOT NULL, version INTEGER DEFAULT 0)";

    @NotNull
    public static final SummaryTable INSTANCE = new SummaryTable();

    @NotNull
    private static final String QUERY_TABLE_VERSION = "select version from _version_table_ where table_name = ?";

    @NotNull
    private static final String TABLE_VERSION = "_version_table_";

    private SummaryTable() {
    }

    public final int getTableVersion(@NotNull SupportSQLiteDatabase db, @NotNull String tableName) {
        int i;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor cursorQuery = null;
        try {
            cursorQuery = db.query(QUERY_TABLE_VERSION, new String[]{tableName});
            if (cursorQuery.getCount() != 0) {
                cursorQuery.moveToNext();
                i = cursorQuery.getInt(0);
            } else {
                i = -1;
            }
            return i;
        } finally {
            a8l.f(cursorQuery);
        }
    }

    public final void initVersionTable(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL(CREATE_VERSION_TABLE);
    }

    public final void insertTable(@NotNull SupportSQLiteDatabase db, @NotNull String tableName, int version) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TABLE_NAME, tableName);
        contentValues.put("version", Integer.valueOf(version));
        db.insert(TABLE_VERSION, 5, contentValues);
        FitnessLogUtils.i(SummarySyncManager.TAG_SYNC, "insert table version, table:" + tableName + ", version:" + version);
    }

    public final void upgradeTable(@NotNull SupportSQLiteDatabase db, @NotNull String tableName, int newVersion) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        ContentValues contentValues = new ContentValues();
        contentValues.put("version", Integer.valueOf(newVersion));
        db.update(TABLE_VERSION, 5, contentValues, "table_name = ?", new String[]{tableName});
        FitnessLogUtils.i(SummarySyncManager.TAG_SYNC, "update table version, table:" + tableName + ", version:" + newVersion);
    }
}

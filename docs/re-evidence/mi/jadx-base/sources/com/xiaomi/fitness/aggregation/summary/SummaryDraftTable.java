package com.xiaomi.fitness.aggregation.summary;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.a8l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\u000b\u001a\u00020\fH\u0002J.\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tJ$\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SummaryDraftTable;", "", "<init>", "()V", "createTable", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "mapper", "Lcom/xiaomi/fitness/aggregation/summary/TableMapping;", "upgrade", "getColumnId", "", "queryTimeList", "Lkotlin/Pair;", "", "", "dbHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "deleteOnID", "idList", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSummaryDraftTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummaryDraftTable.kt\ncom/xiaomi/fitness/aggregation/summary/SummaryDraftTable\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n216#2,2:148\n1872#3,3:150\n*S KotlinDebug\n*F\n+ 1 SummaryDraftTable.kt\ncom/xiaomi/fitness/aggregation/summary/SummaryDraftTable\n*L\n33#1:148,2\n131#1:150,3\n*E\n"})
public final class SummaryDraftTable {

    @NotNull
    public static final SummaryDraftTable INSTANCE = new SummaryDraftTable();

    private SummaryDraftTable() {
    }

    private final String getColumnId() {
        return "_id";
    }

    public final void createTable(@NotNull SupportSQLiteDatabase db, @NotNull TableMapping mapper) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        StringBuilder sb = new StringBuilder();
        String draftTableName = mapper.getDraftTableName();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(draftTableName);
        sb.append("(");
        a8l.a(sb, getColumnId(), "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL", false);
        a8l.a(sb, mapper.getColumnKey(), "TEXT", false);
        a8l.a(sb, mapper.getColumnSid(), "TEXT", false);
        a8l.a(sb, mapper.getColumnTime(), "INTEGER", false);
        for (Map.Entry<String, Class<?>> entry : mapper.getOtherColumns().entrySet()) {
            a8l.a(sb, entry.getKey(), a8l.e(entry.getValue()), false);
        }
        a8l.a(sb, mapper.getColumnDeleted(), "INTEGER DEFAULT 0", true);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        db.execSQL(string);
        FitnessLogUtils.i(SummarySyncManager.TAG_SYNC, "create draft table " + draftTableName);
    }

    public final void deleteOnID(@NotNull SupportSQLiteOpenHelper dbHelper, @NotNull TableMapping mapper, @NotNull List<Long> idList) {
        Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(idList, "idList");
        String draftTableName = mapper.getDraftTableName();
        SupportSQLiteDatabase readableDatabase = dbHelper.getReadableDatabase();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            if (idList.isEmpty()) {
                sb.append("-1");
            } else {
                int i = 0;
                for (Object obj : idList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    sb.append(((Number) obj).longValue());
                    if (i < idList.size() - 1) {
                        sb.append(",");
                    }
                    i = i2;
                }
            }
            sb.append(")");
            String string = sb.toString();
            readableDatabase.execSQL("delete from " + draftTableName + " where " + getColumnId() + " in " + string);
            int size = idList.size();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delete ");
            sb2.append(size);
            sb2.append(" items from ");
            sb2.append(draftTableName);
            FitnessLogUtils.i(SummarySyncManager.TAG_SYNC, sb2.toString());
        } catch (Exception e) {
            FitnessLogUtils.e(SummarySyncManager.TAG_SYNC, "delete draft table time list error", e);
        }
    }

    @NotNull
    public final Pair<List<Long>, List<Long>> queryTimeList(@NotNull SupportSQLiteOpenHelper dbHelper, @NotNull TableMapping mapper) {
        Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String draftTableName = mapper.getDraftTableName();
        String columnId = getColumnId();
        String columnTimInZero = mapper.getColumnTimInZero();
        String str = "select " + columnId + ", " + columnTimInZero + " from " + draftTableName + " where " + columnTimInZero + " >= 0 order by " + columnTimInZero + " desc limit 1000";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = dbHelper.getReadableDatabase().query(str);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndex(columnId));
                        arrayList.add(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex(columnTimInZero))));
                        arrayList2.add(Long.valueOf(j));
                    } while (cursorQuery.moveToNext());
                }
            } catch (Exception e) {
                FitnessLogUtils.e(SummarySyncManager.TAG_SYNC, "query time list error", e);
            }
            a8l.f(cursorQuery);
            if (!arrayList.isEmpty()) {
                FitnessLogUtils.d(SummarySyncManager.TAG_SYNC, draftTableName + ":queryTimeList range [" + CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList) + "-" + CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList) + "], size = " + arrayList.size());
            } else {
                FitnessLogUtils.d(SummarySyncManager.TAG_SYNC, draftTableName + ":queryTimeList range is empty");
            }
            return new Pair<>(arrayList, arrayList2);
        } catch (Throwable th) {
            a8l.f(cursorQuery);
            throw th;
        }
    }

    public final void upgrade(@NotNull SupportSQLiteDatabase db, @NotNull TableMapping mapper) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String draftTableName = mapper.getDraftTableName();
        List<String> listD = a8l.d(db, draftTableName, false);
        Intrinsics.checkNotNullExpressionValue(listD, "getColumns(...)");
        Map<String, Class<?>> otherColumns = mapper.getOtherColumns();
        Set<String> mutableSet = CollectionsKt___CollectionsKt.toMutableSet(otherColumns.keySet());
        mutableSet.removeAll(listD);
        if (mutableSet.isEmpty()) {
            return;
        }
        for (String str : mutableSet) {
            Class<?> cls = otherColumns.get(str);
            if (cls == null) {
                throw new IllegalStateException("not found column type: " + str);
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("ALTER TABLE %s ADD COLUMN %s %s", Arrays.copyOf(new Object[]{draftTableName, str, a8l.e(cls)}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            String columnDefault = mapper.getColumnDefault(str);
            if (columnDefault != null) {
                str2 = ((Object) str2) + " default " + columnDefault;
            }
            db.execSQL(str2);
            FitnessLogUtils.INSTANCE.v(SummarySyncManager.TAG_SYNC, "Upgrade: " + ((Object) str2));
        }
        FitnessLogUtils.i(SummarySyncManager.TAG_SYNC, "upgrade draft table " + draftTableName);
    }
}

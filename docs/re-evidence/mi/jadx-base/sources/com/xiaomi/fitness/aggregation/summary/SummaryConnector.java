package com.xiaomi.fitness.aggregation.summary;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.a8l;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH$J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SummaryConnector;", "", "<init>", "()V", "initLock", "isInited", "", "tableMapperList", "", "Lcom/xiaomi/fitness/aggregation/summary/TableMapping;", "getDatabaseOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "createSummaryTableMappings", "initSummaryConnector", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "initSummaryTable", "mapper", "initVersionTable", "getValidateTableMapper", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSummaryConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummaryConnector.kt\ncom/xiaomi/fitness/aggregation/summary/SummaryConnector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1863#2,2:81\n*S KotlinDebug\n*F\n+ 1 SummaryConnector.kt\ncom/xiaomi/fitness/aggregation/summary/SummaryConnector\n*L\n34#1:81,2\n*E\n"})
public abstract class SummaryConnector {

    @NotNull
    private final Object initLock = new Object();
    private volatile boolean isInited;

    @Nullable
    private List<? extends TableMapping> tableMapperList;

    private final void initSummaryTable(SupportSQLiteDatabase db, TableMapping mapper) {
        String tableName = mapper.getTableName();
        int version = mapper.getVersion();
        SummaryTable summaryTable = SummaryTable.INSTANCE;
        int tableVersion = summaryTable.getTableVersion(db, tableName);
        if (tableVersion < 0) {
            SummaryDraftTable.INSTANCE.createTable(db, mapper);
            summaryTable.insertTable(db, tableName, version);
            TriggerFactory.INSTANCE.registerSyncTrigger(db, mapper);
        } else {
            if (version <= tableVersion) {
                TriggerFactory.INSTANCE.registerSyncTrigger(db, mapper);
                return;
            }
            SummaryDraftTable.INSTANCE.upgrade(db, mapper);
            summaryTable.upgradeTable(db, tableName, version);
            TriggerFactory.INSTANCE.registerSyncTrigger(db, mapper);
        }
    }

    private final void initVersionTable(SupportSQLiteDatabase db) {
        SummaryTable.INSTANCE.initVersionTable(db);
    }

    @NotNull
    public abstract List<TableMapping> createSummaryTableMappings();

    @NotNull
    public abstract SupportSQLiteOpenHelper getDatabaseOpenHelper();

    @NotNull
    public final List<TableMapping> getValidateTableMapper() {
        List<TableMapping> listUnmodifiableList;
        List list = this.tableMapperList;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            return list;
        }
        synchronized (this) {
            listUnmodifiableList = Collections.unmodifiableList(createSummaryTableMappings());
            this.tableMapperList = listUnmodifiableList;
            Unit unit = Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final void initSummaryConnector(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (this.isInited) {
            return;
        }
        synchronized (this.initLock) {
            try {
                if (this.isInited) {
                    return;
                }
                try {
                    initVersionTable(db);
                    for (TableMapping tableMapping : getValidateTableMapper()) {
                        String tableName = tableMapping.getTableName();
                        if (!a8l.c(db, tableName)) {
                            throw new IllegalStateException("can't find table " + tableName + " in db " + db.getPath());
                        }
                        initSummaryTable(db, tableMapping);
                    }
                    this.isInited = true;
                } catch (Exception e) {
                    FitnessLogUtils.e(SummarySyncManager.TAG_SYNC, "initSummaryConnector error", e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

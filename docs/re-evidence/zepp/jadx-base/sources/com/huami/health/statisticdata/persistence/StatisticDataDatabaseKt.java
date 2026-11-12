package com.huami.health.statisticdata.persistence;

import android.content.Context;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.tools.analytics.DbUtils;
import io.netty.util.internal.StringUtil;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\b\u0005*\u0002\u0004\t\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001d\u0010\b\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u001d\u0010\f\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;", "getStatisticDataDatabase", "com/huami/health/statisticdata/persistence/StatisticDataDatabaseKt$migrations1to2$2$1", "a", "Lkotlin/Lazy;", "()Lcom/huami/health/statisticdata/persistence/StatisticDataDatabaseKt$migrations1to2$2$1;", "migrations1to2", "com/huami/health/statisticdata/persistence/StatisticDataDatabaseKt$migrations2to3$2$1", "b", "()Lcom/huami/health/statisticdata/persistence/StatisticDataDatabaseKt$migrations2to3$2$1;", "migrations2to3", "statisticdata_release"}, k = 2, mv = {1, 4, 0})
public final class StatisticDataDatabaseKt {
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(new Function0<StatisticDataDatabaseKt$migrations1to2$2.AnonymousClass1>() { // from class: com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations1to2$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations1to2$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new Migration(1, 2) { // from class: com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations1to2$2.1

                /* JADX INFO: renamed from: com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations1to2$2$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
                public static final class a extends Lambda implements Function0<Object> {
                    public final /* synthetic */ Exception a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Exception exc) {
                        super(0);
                        this.a = exc;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final Object invoke() {
                        return "Statistic database migration error fromv1 > v2. Exception is " + this.a + StringUtil.SPACE;
                    }
                }

                @Override // androidx.room.migration.Migration
                public void migrate(@NotNull SupportSQLiteDatabase database) {
                    try {
                        database.execSQL("ALTER TABLE 'statistic_data_entity_table' ADD COLUMN 'time_group' INTEGER");
                    } catch (Exception e) {
                        LogcatKt.error$default(Logcat.INSTANCE, null, new a(e), 1, null);
                    }
                }
            };
        }
    });
    private static final Lazy b = LazyKt__LazyJVMKt.lazy(new Function0<StatisticDataDatabaseKt$migrations2to3$2.AnonymousClass1>() { // from class: com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations2to3$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations2to3$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new Migration(2, 3) { // from class: com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt$migrations2to3$2.1
                @Override // androidx.room.migration.Migration
                public void migrate(@NotNull SupportSQLiteDatabase database) {
                    database.execSQL("CREATE TABLE new_statistic_data_entity_table (\n    id INTEGER PRIMARY KEY NOT NULL,\n    version INTEGER NOT NULL,\n    age_group INTEGER NOT NULL,\n    time_group INTEGER,\n    item_type TEXT NOT NULL,\n    gender INTEGER NOT NULL,\n    category FLOAT NOT NULL,\n    count INTEGER NOT NULL,\n    location TEXT NOT NULL,\n    category_count INTEGER NOT NULL\n)");
                    database.execSQL("DROP TABLE statistic_data_entity_table");
                    database.execSQL("ALTER TABLE new_statistic_data_entity_table RENAME TO statistic_data_entity_table");
                }
            };
        }
    });

    private static final StatisticDataDatabaseKt$migrations1to2$2.AnonymousClass1 a() {
        return (StatisticDataDatabaseKt$migrations1to2$2.AnonymousClass1) a.getValue();
    }

    private static final StatisticDataDatabaseKt$migrations2to3$2.AnonymousClass1 b() {
        return (StatisticDataDatabaseKt$migrations2to3$2.AnonymousClass1) b.getValue();
    }

    @NotNull
    public static final StatisticDataDatabase getStatisticDataDatabase(@NotNull Context context) {
        return (StatisticDataDatabase) Room.databaseBuilder(context, StatisticDataDatabase.class, "statisticDataDb").addMigrations(a()).addMigrations(b()).build();
    }
}

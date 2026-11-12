package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.repo.summary.SportSummaryRepoKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Entity(tableName = SportReportObserverKt.TABLE_SPORT_REPORT_OBSERVER)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserver;", "", "id", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportReportObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @PrimaryKey
    private final int id;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserver$Companion;", "", "<init>", "()V", "observeReport", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportReportObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportObserver.kt\ncom/xiaomi/fit/fitness/persist/db/internal/SportReportObserver$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,54:1\n13402#2,2:55\n*S KotlinDebug\n*F\n+ 1 SportReportObserver.kt\ncom/xiaomi/fit/fitness/persist/db/internal/SportReportObserver$Companion\n*L\n23#1:55,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean observeReport(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                if (db.isReadOnly()) {
                    FitnessLogUtils.i("SRecordObserver", "observeReport: read only");
                    return false;
                }
                for (String str : SportSummaryRepoKt.getTRIGGERS()) {
                    db.execSQL("create trigger if not exists " + ("summary_trigger_" + str) + " before " + str + " on sport_report begin insert into sport_report_observer (name) values ('trigger'); end;");
                }
                return true;
            } catch (Exception e) {
                FitnessLogUtils.i("SRecordObserver", "observeReport: " + e.getMessage());
                return false;
            }
        }
    }

    public SportReportObserver(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ SportReportObserver(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }
}

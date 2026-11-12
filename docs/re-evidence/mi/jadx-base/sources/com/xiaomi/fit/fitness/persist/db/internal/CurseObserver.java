package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Entity(tableName = "curse_observer")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/CurseObserver;", "", "id", "", "<init>", "(I)V", "getId", "()I", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @PrimaryKey
    private final int id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/CurseObserver$Companion;", "", "<init>", "()V", "createTrigger", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCurseObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseObserver.kt\ncom/xiaomi/fit/fitness/persist/db/internal/CurseObserver$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n13402#2,2:63\n*S KotlinDebug\n*F\n+ 1 CurseObserver.kt\ncom/xiaomi/fit/fitness/persist/db/internal/CurseObserver$Companion\n*L\n27#1:63,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean createTrigger(@NotNull SupportSQLiteDatabase db) {
            StringBuilder sb;
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                if (db.isReadOnly()) {
                    FitnessLogUtils.i("CurseObserver", "observeReport: read only");
                    return false;
                }
                String[] strArr = {"delete", "insert"};
                for (int i = 0; i < 2; i++) {
                    String str = strArr[i];
                    String str2 = "curse_trigger_" + str;
                    if (Intrinsics.areEqual(str, "delete")) {
                        sb = new StringBuilder();
                        sb.append("when (old.key='");
                        sb.append(FitnessPersistKey.WomenHealthStatus);
                        sb.append("' and old.isDeleted=0)");
                    } else {
                        sb = new StringBuilder();
                        sb.append("when (new.key='");
                        sb.append(FitnessPersistKey.WomenHealthStatus);
                        sb.append("' and new.isUpload=1)");
                    }
                    db.execSQL("create trigger if not exists " + str2 + " before " + str + " on menstruation_record " + sb.toString() + "begin insert into curse_observer (id) values (null); end;");
                }
                return true;
            } catch (Exception e) {
                FitnessLogUtils.i("CurseObserver", "createTrigger: " + e.getMessage());
                return false;
            }
        }
    }

    public CurseObserver() {
        this(0, 1, null);
    }

    public final int getId() {
        return this.id;
    }

    public CurseObserver(int i) {
        this.id = i;
    }

    public /* synthetic */ CurseObserver(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

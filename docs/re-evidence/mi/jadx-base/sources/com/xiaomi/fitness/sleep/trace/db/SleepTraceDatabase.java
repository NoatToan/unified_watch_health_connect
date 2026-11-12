package com.xiaomi.fitness.sleep.trace.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Database(entities = {SleepTraceLog.class}, version = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "sleepTraceDao", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceDao;", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SleepTraceDatabase extends BaseDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String SLEEP_DB = "sleep_trace_db";

    @Nullable
    private static volatile SleepTraceDatabase mDB = null;
    public static final int version = 1;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceDatabase$Companion;", "", "<init>", "()V", "SLEEP_DB", "", "version", "", "mDB", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceDatabase;", "get", "context", "Landroid/content/Context;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSleepTraceDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTraceDatabase.kt\ncom/xiaomi/fitness/sleep/trace/db/SleepTraceDatabase$Companion\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,39:1\n20#2,8:40\n*S KotlinDebug\n*F\n+ 1 SleepTraceDatabase.kt\ncom/xiaomi/fitness/sleep/trace/db/SleepTraceDatabase$Companion\n*L\n30#1:40,8\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepTraceDatabase get(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (SleepTraceDatabase.mDB == null) {
                synchronized (this) {
                    try {
                        if (SleepTraceDatabase.mDB == null) {
                            BaseDatabase.Companion companion = BaseDatabase.INSTANCE;
                            final String str = SleepTraceDatabase.SLEEP_DB;
                            SleepTraceDatabase.mDB = (SleepTraceDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, SleepTraceDatabase>() { // from class: com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase$Companion$get$lambda$1$$inlined$getInstance$1
                                /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase] */
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final SleepTraceDatabase invoke2(Context it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), SleepTraceDatabase.class, str);
                                    builderDatabaseBuilder.setJournalMode(RoomDatabase.JournalMode.TRUNCATE);
                                    return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
                                }
                            }).getInstance(context));
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            SleepTraceDatabase sleepTraceDatabase = SleepTraceDatabase.mDB;
            Intrinsics.checkNotNull(sleepTraceDatabase);
            return sleepTraceDatabase;
        }
    }

    @NotNull
    public abstract SleepTraceDao sleepTraceDao();
}

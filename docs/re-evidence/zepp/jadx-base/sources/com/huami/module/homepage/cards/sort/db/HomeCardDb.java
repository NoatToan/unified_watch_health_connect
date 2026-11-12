package com.huami.module.homepage.cards.sort.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Database(entities = {CardSequence.class, CardExpand.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/module/homepage/cards/sort/db/HomeCardDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/module/homepage/cards/sort/db/CardSequenceDao;", "cardSequenceDao", "Lcom/huami/module/homepage/cards/sort/db/CardExpandDao;", "cardExpandDao", "<init>", "()V", "Companion", "homePage_release"}, k = 1, mv = {1, 5, 1})
public abstract class HomeCardDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/module/homepage/cards/sort/db/HomeCardDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/module/homepage/cards/sort/db/HomeCardDb;", "create", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HomeCardDb create(@NotNull Context context, @NotNull String dbName) {
            return (HomeCardDb) Room.databaseBuilder(context, HomeCardDb.class, dbName).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract CardExpandDao cardExpandDao();

    @NotNull
    public abstract CardSequenceDao cardSequenceDao();
}

package com.huami.sky.lib.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.entity.UserMusicTag;
import com.huami.sky.lib.entity.UserRelaxScore;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@TypeConverters({RelaxInfoListConverter.class, MusicTagsConverter.class})
@Database(entities = {UserRelaxScore.class, UserMusicTag.class, MusicEntity.class}, exportSchema = false, version = 6)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/room/SkyDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/sky/lib/room/RelaxScoreDao;", "getRelaxScoreDao", "Lcom/huami/sky/lib/room/MusicTagDao;", "getMusicTagDao", "Lcom/huami/sky/lib/room/MusicInfoDao;", "getMusicInfoDao", "<init>", "()V", "Companion", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class SkyDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "sky_data.db";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/room/SkyDatabase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sky/lib/room/SkyDatabase;", "createDb", "", "DB_NAME", "Ljava/lang/String;", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SkyDatabase createDb(@NotNull Context context) {
            return (SkyDatabase) Room.databaseBuilder(context, SkyDatabase.class, SkyDatabase.a).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract MusicInfoDao getMusicInfoDao();

    @NotNull
    public abstract MusicTagDao getMusicTagDao();

    @NotNull
    public abstract RelaxScoreDao getRelaxScoreDao();
}

package com.huami.training.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.db.dao.EntranceDao;
import com.huami.training.db.dao.FilterDao;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.PlanDao;
import com.huami.training.db.dao.PromotionDao;
import com.huami.training.db.dao.SearchDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.dao.UserCourseDao;
import com.huami.training.db.po.CardPlace;
import com.huami.training.db.po.EntranceKing;
import com.huami.training.db.po.FilterMode;
import com.huami.training.db.po.FilterTraining;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.db.po.LookAround;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.Promotion;
import com.huami.training.db.po.SearchResult;
import com.huami.training.db.po.Subject;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.TodayTraining;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.TrainingPlan;
import com.huami.training.db.po.UserCourse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@TypeConverters({AdConverter.class, PrimitiveListConverter.class, GenderPairConverter.class, PlanConverters.class, PromotePlaceConverter.class, DifficultyConverter.class, TrainingTypeConverter.class})
@Database(entities = {Training.class, Promotion.class, FilterTraining.class, SearchResult.class, Participation.class, Tag.class, TodayTraining.class, LookAround.class, FilterMode.class, Subject.class, EntranceKing.class, CardPlace.class, TrainingPlan.class, PlanTraining.class, UserCourse.class}, exportSchema = true, version = 5, views = {JoinedTraining.class})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0015"}, d2 = {"Lcom/huami/training/db/TrainingDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/training/db/dao/TrainingDao;", "trainingDao", "Lcom/huami/training/db/dao/PromotionDao;", "promotionDao", "Lcom/huami/training/db/dao/ParticipationDao;", "participationDao", "Lcom/huami/training/db/dao/FilterDao;", "filterDao", "Lcom/huami/training/db/dao/SearchDao;", "getSearchDao", "Lcom/huami/training/db/dao/EntranceDao;", "entranceDao", "Lcom/huami/training/db/dao/PlanDao;", "planDao", "Lcom/huami/training/db/dao/UserCourseDao;", "userCourseDao", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class TrainingDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/training/db/TrainingDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/training/db/TrainingDb;", "create", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrainingDb create(@NotNull Context context, @NotNull String dbName) {
            return (TrainingDb) Room.databaseBuilder(context, TrainingDb.class, dbName).fallbackToDestructiveMigration().addMigrations(MigrationsKt.getMIGRATION_1_2(), MigrationsKt.getMIGRATION_2_3()).build();
        }
    }

    @NotNull
    public abstract EntranceDao entranceDao();

    @NotNull
    public abstract FilterDao filterDao();

    @NotNull
    public abstract SearchDao getSearchDao();

    @NotNull
    public abstract ParticipationDao participationDao();

    @NotNull
    public abstract PlanDao planDao();

    @NotNull
    public abstract PromotionDao promotionDao();

    @NotNull
    public abstract TrainingDao trainingDao();

    @NotNull
    public abstract UserCourseDao userCourseDao();
}

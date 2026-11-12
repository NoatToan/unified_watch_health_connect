package com.huami.training.db.dao;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.UserCourse;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H'¨\u0006\u000f"}, d2 = {"Lcom/huami/training/db/dao/UserCourseDao;", "", "", "Lcom/huami/training/db/po/UserCourse;", "userCourses", "", "insertUserCourses", "", "userId", "Landroidx/paging/DataSource$Factory;", "", "Lcom/huami/training/db/po/Training;", "queryFullUserCoursesForPaging", "", "deleteUserCoursesByUser", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface UserCourseDao {
    @Query("DELETE FROM UserCourse WHERE userId = :userId")
    void deleteUserCoursesByUser(@NotNull String userId);

    @Insert(onConflict = 1)
    @NotNull
    List<Long> insertUserCourses(@NotNull List<UserCourse> userCourses);

    @Query("\n        SELECT Training.*\n        FROM UserCourse INNER JOIN Training\n        WHERE UserCourse.courseId = Training.id\n            AND UserCourse.userId = :userId\n    ")
    @NotNull
    DataSource.Factory<Integer, Training> queryFullUserCoursesForPaging(@NotNull String userId);
}

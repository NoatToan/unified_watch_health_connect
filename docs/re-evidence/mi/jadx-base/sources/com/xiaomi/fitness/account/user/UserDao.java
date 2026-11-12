package com.xiaomi.fitness.account.user;

import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "getUserInfoProfileByName", "name", "", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserDao extends BaseDao<UserInfoProfile> {
    @Query("SELECT * FROM USER_INFO_PROFILE WHERE name = :name limit 1")
    @Nullable
    UserInfoProfile getUserInfoProfileByName(@Nullable String name);
}

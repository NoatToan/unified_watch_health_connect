package com.xiaomi.hm.health.healthdata.core;

import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H&J#\u0010\f\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\t2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u000b\"\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "", "", "next", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "syncUserData", "(Ljava/lang/Long;)Ljava/util/List;", "userDataEntity", "", "delete", "", "create", "([Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)Z", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "healthEntity", "upHhHearingData", "([Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;)Z", "from", "to", "syncHhHearingData", "(JJLjava/lang/Long;)Ljava/util/List;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface UserDataRemoteAPI {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ List syncHhHearingData$default(UserDataRemoteAPI userDataRemoteAPI, long j, long j2, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncHhHearingData");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            return userDataRemoteAPI.syncHhHearingData(j, j2, l);
        }

        public static /* synthetic */ List syncUserData$default(UserDataRemoteAPI userDataRemoteAPI, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncUserData");
            }
            if ((i & 1) != 0) {
                l = null;
            }
            return userDataRemoteAPI.syncUserData(l);
        }
    }

    boolean create(@NotNull UserDataEntity... userDataEntity);

    boolean delete(@NotNull UserDataEntity userDataEntity);

    @NotNull
    List<HearingHealthEntity> syncHhHearingData(long from, long to, @Nullable Long next);

    @NotNull
    List<UserDataEntity> syncUserData(@Nullable Long next);

    boolean upHhHearingData(@NotNull HearingHealthEntity... healthEntity);
}

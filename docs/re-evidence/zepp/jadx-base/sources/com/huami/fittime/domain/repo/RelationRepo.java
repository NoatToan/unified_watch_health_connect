package com.huami.fittime.domain.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.android.vo.Resource;
import com.huami.fittime.domain.model.Friend;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/huami/fittime/domain/repo/RelationRepo;", "", "", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "Lcom/huami/fittime/domain/model/Friend;", "postFollowStatus", "postBlockStatus", "", "postIgnoreStatus", "domain_release"}, k = 1, mv = {1, 4, 0})
public interface RelationRepo {
    @NotNull
    LiveData<Resource<Friend>> postBlockStatus(@NotNull String userId);

    @NotNull
    LiveData<Resource<Friend>> postFollowStatus(@NotNull String userId);

    @NotNull
    LiveData<Resource<Integer>> postIgnoreStatus(@NotNull String userId);
}

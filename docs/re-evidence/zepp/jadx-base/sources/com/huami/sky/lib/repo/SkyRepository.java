package com.huami.sky.lib.repo;

import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.entity.UserRelaxScore;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/lib/repo/SkyRepository;", "", "", WebConstant.QueryParam.LAUNCH, "", WebConstant.QueryParam.SWITCH, "Lcom/huami/sky/lib/entity/MusicEntity;", "recommendMusic", "(ZLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "", "saveRelaxScoreFromServer", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sky/lib/entity/UserRelaxScore;", "getRelaxScoreFromLocal", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface SkyRepository {
    @NotNull
    Flow<List<UserRelaxScore>> getRelaxScoreFromLocal(long startTime);

    @Nullable
    Object recommendMusic(boolean z, @Nullable Integer num, @NotNull Continuation<? super MusicEntity> continuation);

    void saveRelaxScoreFromServer(long startTime, long endTime);
}

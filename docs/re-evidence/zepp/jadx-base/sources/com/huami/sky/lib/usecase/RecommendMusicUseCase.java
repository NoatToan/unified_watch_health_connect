package com.huami.sky.lib.usecase;

import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.repo.SkyRepository;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/sky/lib/usecase/RecommendMusicUseCase;", "", "", WebConstant.QueryParam.LAUNCH, "", WebConstant.QueryParam.SWITCH, "Lcom/huami/sky/lib/entity/MusicEntity;", Constant.METHOD_EXECUTE, "(ZLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/repo/SkyRepository;", "a", "Lcom/huami/sky/lib/repo/SkyRepository;", "repository", "<init>", "(Lcom/huami/sky/lib/repo/SkyRepository;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class RecommendMusicUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyRepository repository;

    public RecommendMusicUseCase(@NotNull SkyRepository skyRepository) {
        this.repository = skyRepository;
    }

    public static /* synthetic */ Object execute$default(RecommendMusicUseCase recommendMusicUseCase, boolean z, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return recommendMusicUseCase.execute(z, num, continuation);
    }

    @Nullable
    public final Object execute(boolean z, @Nullable Integer num, @NotNull Continuation<? super MusicEntity> continuation) {
        return this.repository.recommendMusic(z, num, continuation);
    }
}

package com.huami.stress.domain.usecase;

import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import io.netty.util.internal.StringUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/stress/domain/usecase/DeleteSingleStressUseCase;", "", "", "userId", "", "timestamp", "", Constant.METHOD_EXECUTE, "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "a", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "mSingleStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class DeleteSingleStressUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository mSingleStressRepository;

    public DeleteSingleStressUseCase(@NotNull SingleStressRepository singleStressRepository) {
        this.mSingleStressRepository = singleStressRepository;
    }

    @Nullable
    public final Object execute(@NotNull String str, long j, @NotNull Continuation<? super Unit> continuation) {
        HMLog.i(LogTagUtilsKt.getTAG(this), "DeleteSingleStressUseCase execute " + str + StringUtil.SPACE + j, new Object[0]);
        Object objDeleteSingleStress = this.mSingleStressRepository.deleteSingleStress(str, j, continuation);
        return objDeleteSingleStress == a.getCOROUTINE_SUSPENDED() ? objDeleteSingleStress : Unit.INSTANCE;
    }
}

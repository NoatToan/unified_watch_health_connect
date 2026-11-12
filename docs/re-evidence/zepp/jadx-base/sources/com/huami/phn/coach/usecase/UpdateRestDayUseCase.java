package com.huami.phn.coach.usecase;

import com.huami.phn.util.Result;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/phn/coach/usecase/UpdateRestDayUseCase;", "", "", "rest", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/coach/usecase/UseCaseException;", "update", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface UpdateRestDayUseCase {
    @NotNull
    Result<Boolean, UseCaseException> update(@NotNull int[] rest);
}

package com.huami.stress.domain.data;

import com.huami.stress.domain.model.SingleStress;
import com.huami.stress_service.StressEntry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/stress/domain/model/SingleStress;", "Lcom/huami/stress_service/StressEntry;", "toStressEntry", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class StressServiceImplKt {
    @NotNull
    public static final StressEntry toStressEntry(@NotNull SingleStress singleStress) {
        return new StressEntry(singleStress.getTimestamp(), singleStress.getValue());
    }
}

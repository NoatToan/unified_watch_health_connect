package com.huami.respiratoryrate.core.usecase;

import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.repo.IRespRateRepo;
import com.huami.respiratoryrate.core.utils.TimeUtilsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/respiratoryrate/core/usecase/GetDataFlowUseCase;", "", "", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", Constant.METHOD_EXECUTE, "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "a", "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetDataFlowUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRespRateRepo repo;

    public GetDataFlowUseCase(@NotNull IRespRateRepo iRespRateRepo) {
        this.repo = iRespRateRepo;
    }

    @NotNull
    public final Flow<List<RespRateEntity>> execute(long from, long to) {
        return this.repo.getRespRateListFlow(TimeUtilsKt.toSecond(from), TimeUtilsKt.toSecond(to));
    }
}

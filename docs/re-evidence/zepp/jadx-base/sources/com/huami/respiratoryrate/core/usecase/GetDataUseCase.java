package com.huami.respiratoryrate.core.usecase;

import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.repo.IRespRateRepo;
import com.huami.respiratoryrate.core.utils.TimeUtilsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/respiratoryrate/core/usecase/GetDataUseCase;", "", "", "from", "to", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", Constant.METHOD_EXECUTE, "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "a", "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRespRateRepo repo;

    public GetDataUseCase(@NotNull IRespRateRepo iRespRateRepo) {
        this.repo = iRespRateRepo;
    }

    @NotNull
    public final List<RespRateEntity> execute(long from, long to) {
        return this.repo.getRespRateList(TimeUtilsKt.toSecond(from), TimeUtilsKt.toSecond(to));
    }
}

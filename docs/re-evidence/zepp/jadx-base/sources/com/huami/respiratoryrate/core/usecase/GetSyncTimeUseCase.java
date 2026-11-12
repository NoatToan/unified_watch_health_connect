package com.huami.respiratoryrate.core.usecase;

import com.huami.respiratoryrate.core.repo.ISyncTimeRepo;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/respiratoryrate/core/usecase/GetSyncTimeUseCase;", "", "", Constant.METHOD_EXECUTE, "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", "a", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetSyncTimeUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISyncTimeRepo repo;

    public GetSyncTimeUseCase(@NotNull ISyncTimeRepo iSyncTimeRepo) {
        this.repo = iSyncTimeRepo;
    }

    public final long execute() {
        return this.repo.getSyncTime();
    }
}

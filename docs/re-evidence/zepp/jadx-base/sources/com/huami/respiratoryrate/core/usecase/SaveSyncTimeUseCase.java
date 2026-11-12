package com.huami.respiratoryrate.core.usecase;

import com.huami.respiratoryrate.core.repo.ISyncTimeRepo;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/respiratoryrate/core/usecase/SaveSyncTimeUseCase;", "", "", "timeInMillis", "", Constant.METHOD_EXECUTE, "(Ljava/lang/Long;)V", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", "a", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class SaveSyncTimeUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISyncTimeRepo repo;

    public SaveSyncTimeUseCase(@NotNull ISyncTimeRepo iSyncTimeRepo) {
        this.repo = iSyncTimeRepo;
    }

    public final void execute(@Nullable Long timeInMillis) {
        if (timeInMillis == null || timeInMillis.longValue() <= this.repo.getSyncTime()) {
            return;
        }
        this.repo.saveSyncTime(timeInMillis.longValue());
    }
}

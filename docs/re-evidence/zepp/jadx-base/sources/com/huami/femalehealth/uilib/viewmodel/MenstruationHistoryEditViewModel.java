package com.huami.femalehealth.uilib.viewmodel;

import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.repo.HistoryRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00028P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryEditViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/MenstruationHistoryViewModel;", "", "getShowCurrentMenstruation$uilib_release", "()Z", "showCurrentMenstruation", "Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationHistoryEditViewModel extends MenstruationHistoryViewModel {
    public MenstruationHistoryEditViewModel(@NotNull HistoryRepo historyRepo, @NotNull MenstruationDataManager menstruationDataManager) {
        super(historyRepo, menstruationDataManager);
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.MenstruationHistoryViewModel
    /* JADX INFO: renamed from: getShowCurrentMenstruation$uilib_release */
    public boolean getShowCurrentMenstruation() {
        return false;
    }
}

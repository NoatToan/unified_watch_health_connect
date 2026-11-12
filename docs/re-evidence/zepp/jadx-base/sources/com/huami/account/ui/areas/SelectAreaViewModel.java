package com.huami.account.ui.areas;

import androidx.p008lifecycle.SavedStateHandle;
import androidx.p008lifecycle.ViewModel;
import com.huami.account.selectArea.entity.RegionIndexBean;
import com.huami.account.selectArea.repository.SelectAreaRepo;
import com.huami.account.service.model.Area;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/account/ui/areas/SelectAreaViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "a", "Landroidx/lifecycle/SavedStateHandle;", "handle", "Lcom/huami/account/selectArea/repository/SelectAreaRepo;", "b", "Lcom/huami/account/selectArea/repository/SelectAreaRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/account/service/model/Area;", "value", "getSelectedArea", "()Lcom/huami/account/service/model/Area;", "setSelectedArea", "(Lcom/huami/account/service/model/Area;)V", "selectedArea", "", "Lcom/huami/account/selectArea/entity/RegionIndexBean;", "getRegions", "()Ljava/util/List;", "regions", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectAreaViewModel extends ViewModel {

    @NotNull
    public static final String SELECTED_AREA = "selectedArea";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandle handle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SelectAreaRepo repo = new SelectAreaRepo();

    public SelectAreaViewModel(@NotNull SavedStateHandle savedStateHandle) {
        this.handle = savedStateHandle;
    }

    @NotNull
    public final List<RegionIndexBean> getRegions() {
        return this.repo.getAllRegionIndex();
    }

    @Nullable
    public final Area getSelectedArea() {
        return (Area) this.handle.get("selectedArea");
    }

    public final void setSelectedArea(@Nullable Area area) {
        this.handle.set("selectedArea", area);
    }
}

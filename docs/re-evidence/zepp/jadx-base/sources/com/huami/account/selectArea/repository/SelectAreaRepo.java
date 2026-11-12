package com.huami.account.selectArea.repository;

import com.huami.account.selectArea.datasource.AreaMapper;
import com.huami.account.selectArea.entity.RegionIndexBean;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/account/selectArea/repository/SelectAreaRepo;", "", "", "Lcom/huami/account/selectArea/entity/RegionIndexBean;", "getAllRegionIndex", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectAreaRepo {
    @NotNull
    public final List<RegionIndexBean> getAllRegionIndex() {
        ArrayList arrayList = new ArrayList();
        for (Area area : SelectAreaManager.INSTANCE.getAll()) {
            RegionIndexBean regionIndexBean = new RegionIndexBean(area);
            regionIndexBean.setDataToSort(AreaMapper.INSTANCE.exec(area.getValue()));
            arrayList.add(regionIndexBean);
        }
        return arrayList;
    }
}

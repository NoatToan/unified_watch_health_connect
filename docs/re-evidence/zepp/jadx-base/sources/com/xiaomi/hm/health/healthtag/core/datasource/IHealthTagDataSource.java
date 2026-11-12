package com.xiaomi.hm.health.healthtag.core.datasource;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/core/datasource/IHealthTagDataSource;", "", "", "uid", "type", "subType", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "loadAllTagData", "infoDto", "", "addTagInfos", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IHealthTagDataSource {
    void addTagInfos(@NotNull List<TagInfoDto> infoDto);

    @NotNull
    MutableLiveData<List<TagInfoDto>> loadAllTagData(@NotNull String uid, @NotNull String type, @NotNull String subType);
}

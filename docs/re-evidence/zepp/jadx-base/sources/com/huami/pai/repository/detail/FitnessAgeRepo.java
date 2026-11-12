package com.huami.pai.repository.detail;

import androidx.p008lifecycle.LiveData;
import com.huami.pai.db.po.Pai;
import com.huami.pai.repository.Resource;
import com.huami.pai.vo.FitnessAgeVo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/pai/repository/detail/FitnessAgeRepo;", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/pai/db/po/Pai;", "loadTodayPai", "Lcom/huami/pai/repository/Resource;", "", "Lcom/huami/pai/vo/FitnessAgeVo;", "loadFitnessAges", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface FitnessAgeRepo {
    @NotNull
    LiveData<Resource<List<FitnessAgeVo>>> loadFitnessAges();

    @NotNull
    LiveData<Pai> loadTodayPai();
}

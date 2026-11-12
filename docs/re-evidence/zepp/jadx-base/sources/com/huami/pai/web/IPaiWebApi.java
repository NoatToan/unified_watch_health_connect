package com.huami.pai.web;

import com.huami.pai.web.bean.FitnessAgeBean;
import com.huami.pai.web.bean.Items;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/pai/web/IPaiWebApi;", "", "Ljava/util/Date;", "startDate", "endDate", "Lcom/huami/pai/web/ApiResponse;", "Lcom/huami/pai/web/bean/Items;", "Lcom/huami/pai/web/bean/FitnessAgeBean;", "loadFitnessAges", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IPaiWebApi {
    @NotNull
    ApiResponse<Items<FitnessAgeBean>> loadFitnessAges(@NotNull Date startDate, @NotNull Date endDate);
}

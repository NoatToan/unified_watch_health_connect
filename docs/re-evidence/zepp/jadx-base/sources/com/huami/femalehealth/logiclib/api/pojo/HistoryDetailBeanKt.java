package com.huami.femalehealth.logiclib.api.pojo;

import com.huami.femalehealth.logiclib.dto.Degree;
import kotlin.Metadata;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "Lkotlin/Triple;", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "toTriple", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class HistoryDetailBeanKt {
    @NotNull
    public static final Triple<Degree, Degree, Degree> toTriple(@NotNull HistoryDetailBean historyDetailBean) {
        Degree.Companion companion = Degree.INSTANCE;
        return new Triple<>(companion.covertByWebBeanIntType(historyDetailBean.getPain()), companion.covertByWebBeanIntType(historyDetailBean.getBlood()), companion.covertByWebBeanIntType(historyDetailBean.getMood()));
    }
}

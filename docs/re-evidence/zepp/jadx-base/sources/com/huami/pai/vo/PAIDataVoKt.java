package com.huami.pai.vo;

import com.huami.pai.db.po.Pai;
import com.huami.pai.ext.DateExKt;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", "Lcom/huami/pai/db/po/Pai;", "toPai", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PAIDataVoKt {
    @NotNull
    public static final Pai toPai(@NotNull PAIDataVo pAIDataVo) {
        Date date = DateExKt.toDate(pAIDataVo.getDate(), "yyyy-MM-dd");
        if (date == null) {
            date = new Date();
        }
        return new Pai(date, (int) pAIDataVo.getLp(), (int) pAIDataVo.getMp(), (int) pAIDataVo.getHp(), pAIDataVo.getLm(), pAIDataVo.getMm(), pAIDataVo.getHm(), (int) pAIDataVo.getDp(), (int) pAIDataVo.getTp(), pAIDataVo.getActivityScore(), pAIDataVo.getNextActivityScore(), pAIDataVo.getMaxHr(), pAIDataVo.getRestHr(), pAIDataVo.getGd(), pAIDataVo.getLhr(), pAIDataVo.getMhr(), pAIDataVo.getHhr());
    }
}

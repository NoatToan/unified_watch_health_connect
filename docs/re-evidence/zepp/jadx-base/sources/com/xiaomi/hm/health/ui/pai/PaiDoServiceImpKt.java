package com.xiaomi.hm.health.ui.pai;

import com.huami.pai.vo.PAIDataVo;
import com.huami.pai_service.PaiDo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", "Lcom/huami/pai_service/PaiDo;", "toPaiDo", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class PaiDoServiceImpKt {
    @NotNull
    public static final PaiDo toPaiDo(@NotNull PAIDataVo pAIDataVo) {
        return new PaiDo(pAIDataVo.getTimestamp(), pAIDataVo.getTimeZone(), pAIDataVo.getTp(), pAIDataVo.getDp(), pAIDataVo.getIndex(), pAIDataVo.getActivityScore(), pAIDataVo.getGd(), pAIDataVo.getMaxHr(), pAIDataVo.getAge(), pAIDataVo.getRestHr(), pAIDataVo.getLp(), pAIDataVo.getMp(), pAIDataVo.getHp(), pAIDataVo.getLm(), pAIDataVo.getMm(), pAIDataVo.getHm(), pAIDataVo.getNextActivityScore());
    }
}

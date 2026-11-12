package com.xiaomi.hm.health.ui.pai;

import com.huami.pai.db.po.Pai;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/model/summery/Pai;", "Lcom/huami/pai/db/po/Pai;", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class PaiHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pai a(com.xiaomi.hm.health.model.summery.Pai pai) {
        return new Pai(new Date(), pai.lp, pai.mp, pai.hp, pai.lm, pai.mm, pai.hm, pai.dp, pai.tp, pai.as, pai.nas, pai.maxHr, pai.rhr, pai.gender, pai.hrLowLimit, pai.hrMediumLimit, pai.hrHighLimit);
    }
}

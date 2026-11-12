package com.xiaomi.hm.health.play.card.sport;

import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.play.bean.SportDataBean;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "Lcom/xiaomi/hm/health/play/bean/SportDataBean;", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ISportDataManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SportDataBean a(Trackrecord trackrecord) {
        return new SportDataBean(trackrecord.getTrackid().longValue(), trackrecord.getType().intValue(), trackrecord.getDate(), TimeUtils.getDeltaDayCount(new Date(trackrecord.getTrackid().longValue() * ((long) 1000)), new Date()), trackrecord.getDistance().intValue(), trackrecord.getPace().floatValue(), trackrecord.getCosttime().intValue(), trackrecord.getCal().intValue(), trackrecord.getAvghr().intValue());
    }
}

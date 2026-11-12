package com.xiaomi.hm.health.running;

import android.app.Activity;
import android.content.Context;
import com.huami.module.homepage.cards.business.sportrecord.ISportRecord;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/running/SportRecordImp;", "Lcom/huami/module/homepage/cards/business/sportrecord/ISportRecord;", "Lcom/huami/sport/service/model/HistoryRecord;", "historyRecord", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "goToSportDetail", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportRecordImp implements ISportRecord {
    @Override // com.huami.module.homepage.cards.business.sportrecord.ISportRecord
    public void goToSportDetail(@NotNull HistoryRecord historyRecord, @NotNull Context context) {
        new SportDetailPageNavigator(context).jump2DetailPage(historyRecord, (Activity) context);
    }
}

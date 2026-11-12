package com.huami.moving.ui.sport;

import android.content.Context;
import android.content.Intent;
import com.huami.moving.sport.ui.activity.SportDetailPageActivity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JH\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u0010"}, d2 = {"Lcom/huami/moving/ui/sport/OpenSportDetailPage;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "", "sportType", "source", "", "overSea", "amap", "from", SportDetailPageActivity.HAS_TRACK, "Landroid/content/Intent;", "startSportDetailPageIntent", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface OpenSportDetailPage {
    @NotNull
    Intent startSportDetailPageIntent(@NotNull Context context, long trackId, int sportType, int source, boolean overSea, boolean amap, int from, boolean hasTrack);
}

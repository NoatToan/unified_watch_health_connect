package com.huami.moving.ui.offcut;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "", "", "sportType", "getSportTimesByType", "", "getTopActivtyName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "mills", "getFullTimeFormatString", "", "shouldShowEndPage", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface SportEndPageBusiness {
    @NotNull
    String getFullTimeFormatString(@NotNull Context context, long mills);

    int getSportTimesByType(int sportType);

    @NotNull
    String getTopActivtyName();

    boolean shouldShowEndPage();
}

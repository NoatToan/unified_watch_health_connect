package com.xiaomi.hm.health.play.card;

import android.content.Context;
import com.huami.dragview.draglist.DragEntry;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.play.PlayTool;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/play/PlayTool;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/dragview/draglist/DragEntry;", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class EditCardRenderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DragEntry a(PlayTool playTool, Context context) {
        if (playTool.getToolNameRes() == null || playTool.getToolIconRes() == null) {
            return null;
        }
        return new DragEntry(playTool.isShow(), false, context.getString(playTool.getToolNameRes().intValue()), playTool.getToolIconRes().intValue(), null, playTool.getTool().getKey(), 18, null);
    }
}

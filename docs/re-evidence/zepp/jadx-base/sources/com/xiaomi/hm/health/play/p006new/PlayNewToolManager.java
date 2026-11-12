package com.xiaomi.hm.health.play.p006new;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/play/new/PlayNewToolManager;", "", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "playToolList", "", "hasNewPlayTool", "playTool", "", "a", "Ljava/util/List;", "newPlayTool", "", "CURRENT_VERSION", LogUtil.I, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayNewToolManager {
    public static final int CURRENT_VERSION = 600;

    @NotNull
    public static final PlayNewToolManager INSTANCE = new PlayNewToolManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<Tool> newPlayTool = new ArrayList();

    private PlayNewToolManager() {
    }

    public final boolean hasNewPlayTool(@NotNull List<? extends Tool> playToolList) {
        Iterator<T> it2 = newPlayTool.iterator();
        while (it2.hasNext()) {
            if (playToolList.contains((Tool) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasNewPlayTool(@NotNull Tool playTool) {
        Iterator<T> it2 = newPlayTool.iterator();
        while (it2.hasNext()) {
            if (((Tool) it2.next()) == playTool) {
                return true;
            }
        }
        return false;
    }
}

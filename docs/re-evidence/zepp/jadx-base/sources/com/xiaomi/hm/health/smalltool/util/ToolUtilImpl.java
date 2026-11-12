package com.xiaomi.hm.health.smalltool.util;

import com.huami.devicex.injection.action.ToolUtilApi;
import com.xiaomi.hm.health.smalltool.model.Tool;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/util/ToolUtilImpl;", "Lcom/huami/devicex/injection/action/ToolUtilApi;", "", "toolName", "", "addToMyTools", "addReminderToMyTools", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolUtilImpl implements ToolUtilApi {

    @NotNull
    public static final ToolUtilImpl INSTANCE = new ToolUtilImpl();

    private ToolUtilImpl() {
    }

    @Override // com.huami.devicex.injection.action.ToolUtilApi
    public void addReminderToMyTools() {
        ToolUtil.addToMyTools(Tool.REMINDER);
    }

    @Override // com.huami.devicex.injection.action.ToolUtilApi
    public void addToMyTools(@NotNull String toolName) {
        ToolUtil.addToMyTools(toolName);
    }
}

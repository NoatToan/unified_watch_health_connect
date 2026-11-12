package com.xiaomi.hm.health.navigation.delegate;

import com.huami.assistant.delegate.AssistantToolUtilsDelegate;
import com.xiaomi.hm.health.smalltool.util.ToolUtil;

/* JADX INFO: loaded from: classes21.dex */
public class AssistantModuleToolUtils implements AssistantToolUtilsDelegate.ToolUtil {

    public static class a {
        private static final AssistantModuleToolUtils a = new AssistantModuleToolUtils();

        private a() {
        }
    }

    public static AssistantModuleToolUtils getInstance() {
        return a.a;
    }

    @Override // com.huami.assistant.delegate.AssistantToolUtilsDelegate.ToolUtil
    public void addToMyTools(String toolName) {
        ToolUtil.addToMyTools(toolName);
    }

    @Override // com.huami.assistant.delegate.AssistantToolUtilsDelegate.ToolUtil
    public boolean canAddToMyTools(String toolName) {
        return ToolUtil.canAddToMyTools(toolName);
    }
}

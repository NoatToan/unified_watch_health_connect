package com.xiaomi.hm.health.navigation.delegate;

import com.huami.watch.companion.delegate.CompanionToolUtilsDelegate;
import com.xiaomi.hm.health.smalltool.util.ToolUtil;

/* JADX INFO: loaded from: classes21.dex */
public class WearCompanionModuleToolUtils implements CompanionToolUtilsDelegate.ToolUtil {

    public static class a {
        private static final WearCompanionModuleToolUtils a = new WearCompanionModuleToolUtils();

        private a() {
        }
    }

    public static WearCompanionModuleToolUtils getInstance() {
        return a.a;
    }

    @Override // com.huami.watch.companion.delegate.CompanionToolUtilsDelegate.ToolUtil
    public void addToMyTools(String toolName) {
        ToolUtil.addToMyTools(toolName);
    }

    @Override // com.huami.watch.companion.delegate.CompanionToolUtilsDelegate.ToolUtil
    public boolean canAddToMyTools(String toolName) {
        return ToolUtil.canAddToMyTools(toolName);
    }
}

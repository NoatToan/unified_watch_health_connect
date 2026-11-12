package com.xiaomi.hm.health.navigation.delegate;

import com.xiaomi.hm.health.bodyfat.delegate.ScaleToolUtilsDelegate;
import com.xiaomi.hm.health.smalltool.util.ToolUtil;

/* JADX INFO: loaded from: classes21.dex */
public class ScaleModuleToolUtils implements ScaleToolUtilsDelegate.ToolUtil {

    public static class a {
        private static final ScaleModuleToolUtils a = new ScaleModuleToolUtils();

        private a() {
        }
    }

    public static ScaleModuleToolUtils getInstance() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.bodyfat.delegate.ScaleToolUtilsDelegate.ToolUtil
    public void addToMyTools(String toolName) {
        ToolUtil.addToMyTools(toolName);
    }

    @Override // com.xiaomi.hm.health.bodyfat.delegate.ScaleToolUtilsDelegate.ToolUtil
    public boolean canAddToMyTools(String toolName) {
        return ToolUtil.canAddToMyTools(toolName);
    }
}

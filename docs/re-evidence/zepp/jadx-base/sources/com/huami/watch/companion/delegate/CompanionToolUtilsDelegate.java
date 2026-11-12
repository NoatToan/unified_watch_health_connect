package com.huami.watch.companion.delegate;

/* JADX INFO: loaded from: classes16.dex */
public class CompanionToolUtilsDelegate {
    private ToolUtil a;

    public interface ToolUtil {
        void addToMyTools(String str);

        boolean canAddToMyTools(String str);
    }

    public static class a {
        private static final CompanionToolUtilsDelegate a = new CompanionToolUtilsDelegate();

        private a() {
        }
    }

    public static CompanionToolUtilsDelegate getInstance() {
        return a.a;
    }

    public ToolUtil getToolUtil() {
        return this.a;
    }

    public void setToolUtil(ToolUtil toolUtil) {
        this.a = toolUtil;
    }
}

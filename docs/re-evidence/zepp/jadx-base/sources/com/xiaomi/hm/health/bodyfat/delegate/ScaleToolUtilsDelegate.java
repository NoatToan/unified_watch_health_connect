package com.xiaomi.hm.health.bodyfat.delegate;

/* JADX INFO: loaded from: classes19.dex */
public class ScaleToolUtilsDelegate {
    private ToolUtil a;

    public interface ToolUtil {
        void addToMyTools(String str);

        boolean canAddToMyTools(String str);
    }

    public static class a {
        private static final ScaleToolUtilsDelegate a = new ScaleToolUtilsDelegate();

        private a() {
        }
    }

    public static ScaleToolUtilsDelegate getInstance() {
        return a.a;
    }

    public ToolUtil getToolUtil() {
        return this.a;
    }

    public void setToolUtil(ToolUtil toolUtil) {
        this.a = toolUtil;
    }
}

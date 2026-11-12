package com.huami.assistant.delegate;

/* JADX INFO: loaded from: classes5.dex */
public class AssistantToolUtilsDelegate {
    private ToolUtil a;

    public interface ToolUtil {
        void addToMyTools(String toolName);

        boolean canAddToMyTools(String toolName);
    }

    public static class a {
        private static final AssistantToolUtilsDelegate a = new AssistantToolUtilsDelegate();

        private a() {
        }
    }

    public static AssistantToolUtilsDelegate getInstance() {
        return a.a;
    }

    public ToolUtil getToolUtil() {
        return this.a;
    }

    public void setToolUtil(ToolUtil toolUtilInstance) {
        this.a = toolUtilInstance;
    }
}

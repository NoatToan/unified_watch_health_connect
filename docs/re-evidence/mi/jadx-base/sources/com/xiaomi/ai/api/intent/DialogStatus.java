package com.xiaomi.ai.api.intent;

/* JADX INFO: loaded from: classes7.dex */
public enum DialogStatus {
    PROCESSING(0, "PROCESSING"),
    FINISH(1, "FINISH"),
    FOLLOWUP(2, "FOLLOWUP"),
    TOPIC_SWITCH(3, "TOPIC_SWITCH"),
    SESSION_FINISH(4, "SESSION_FINISH"),
    SKIP_FOLLOWUP(5, "SKIP_FOLLOWUP"),
    CONTEXT_JUDGE_PAGE_ITEM(6, "CONTEXT_JUDGE_PAGE_ITEM"),
    CONTEXT_JUDGE(7, "CONTEXT_JUDGE"),
    INVOKE_NEW_TASK(8, "INVOKE_NEW_TASK");

    private int id;
    private String name;

    DialogStatus(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static DialogStatus find(String str) {
        for (DialogStatus dialogStatus : values()) {
            if (dialogStatus.name.equals(str)) {
                return dialogStatus;
            }
        }
        return FINISH;
    }

    public static DialogStatus read(String str) {
        return find(str);
    }

    public static String write(DialogStatus dialogStatus) {
        return dialogStatus.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

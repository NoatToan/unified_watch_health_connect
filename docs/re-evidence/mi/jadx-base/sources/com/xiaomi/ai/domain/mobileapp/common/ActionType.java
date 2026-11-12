package com.xiaomi.ai.domain.mobileapp.common;

/* JADX INFO: loaded from: classes7.dex */
public enum ActionType {
    QUERY("QUERY", " . . . "),
    OPEN("OPEN", "app_management.common.default.open"),
    OPEN_NAME("OPEN_NAME", "app_management.common.default.open"),
    CLOSE("CLOSE", "app_management.common.default.close"),
    CLOSE_CURRENT("CLOSE_CURRENT", "app_management.common.default.close"),
    INSTALL("INSTALL", "app_management.common.default.install"),
    UNINSTALL("UNINSTALL", "app_management.common.default.uninstall"),
    GUIDE("GUIDE", "app_management.common.default.noncomplete"),
    SEARCH("SEARCH", "app_management.common.default.search");

    private String action;
    private String func;

    ActionType(String str, String str2) {
        this.action = str;
        this.func = str2;
    }

    public static ActionType fromString(String str) {
        for (ActionType actionType : values()) {
            if (actionType.getAction().equals(str)) {
                return actionType;
            }
        }
        return QUERY;
    }

    public String getAction() {
        return this.action;
    }

    public String getFunc() {
        return this.func;
    }

    public boolean isEqual(String str) {
        return this.action.equals(str);
    }
}

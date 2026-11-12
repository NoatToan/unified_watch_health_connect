package com.xiaomi.idm.bean;

/* JADX INFO: loaded from: classes11.dex */
public enum ConnParam$LinkRole {
    MC_LINK_ROLE_NONE(0),
    MC_LINK_ROLE_INITIATOR(1),
    MC_LINK_ROLE_RESPONDER(2);

    public int value;

    ConnParam$LinkRole(int i) {
        this.value = i;
    }

    public static ConnParam$LinkRole fromValue(int i) {
        for (ConnParam$LinkRole connParam$LinkRole : values()) {
            if (connParam$LinkRole.value == i) {
                return connParam$LinkRole;
            }
        }
        return MC_LINK_ROLE_NONE;
    }
}

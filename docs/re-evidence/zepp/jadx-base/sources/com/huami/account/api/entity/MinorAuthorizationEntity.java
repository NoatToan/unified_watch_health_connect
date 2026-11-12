package com.huami.account.api.entity;

/* JADX INFO: loaded from: classes4.dex */
public class MinorAuthorizationEntity {
    public boolean requireAuthorization = false;
    public int remainDays = -1;
    public boolean isReauthorize = false;

    public boolean needAuthorize() {
        if (this.remainDays == -1) {
            return false;
        }
        return this.requireAuthorization || this.isReauthorize;
    }
}

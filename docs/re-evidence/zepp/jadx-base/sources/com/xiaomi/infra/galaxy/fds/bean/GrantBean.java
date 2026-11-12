package com.xiaomi.infra.galaxy.fds.bean;

import com.xiaomi.infra.galaxy.fds.model.AccessControlList;

/* JADX INFO: loaded from: classes22.dex */
public class GrantBean {
    private GranteeBean a;
    private AccessControlList.Permission b;
    private AccessControlList.GrantType c;

    public GrantBean() {
    }

    public GranteeBean getGrantee() {
        return this.a;
    }

    public AccessControlList.Permission getPermission() {
        return this.b;
    }

    public AccessControlList.GrantType getType() {
        return this.c;
    }

    public void setGrantee(GranteeBean granteeBean) {
        this.a = granteeBean;
    }

    public void setPermission(AccessControlList.Permission permission) {
        this.b = permission;
    }

    public void setType(AccessControlList.GrantType grantType) {
        this.c = grantType;
    }

    public GrantBean(GranteeBean granteeBean, AccessControlList.Permission permission) {
        this(granteeBean, permission, AccessControlList.GrantType.USER);
    }

    public GrantBean(GranteeBean granteeBean, AccessControlList.Permission permission, AccessControlList.GrantType grantType) {
        this.a = granteeBean;
        this.b = permission;
        this.c = grantType;
    }
}

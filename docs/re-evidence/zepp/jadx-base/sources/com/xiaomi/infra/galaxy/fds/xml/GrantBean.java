package com.xiaomi.infra.galaxy.fds.xml;

import com.xiaomi.infra.galaxy.fds.model.AccessControlList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Grant")
public class GrantBean {

    @XmlElement(name = "Grantee")
    private GranteeBean a;

    @XmlElement(name = "Permission")
    private AccessControlList.Permission b;

    public GrantBean() {
    }

    public GranteeBean getGrantee() {
        return this.a;
    }

    public AccessControlList.Permission getPermission() {
        return this.b;
    }

    public void setGrantee(GranteeBean granteeBean) {
        this.a = granteeBean;
    }

    public void setPermission(AccessControlList.Permission permission) {
        this.b = permission;
    }

    public GrantBean(GranteeBean granteeBean, AccessControlList.Permission permission) {
        this.a = granteeBean;
        this.b = permission;
    }
}

package com.xiaomi.infra.galaxy.fds.xml;

import com.xiaomi.infra.galaxy.fds.model.AccessControlList;
import com.xiaomi.infra.galaxy.fds.result.AccessControlPolicy;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "AccessControlPolicy", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class S3AccessControlPolicy {

    @XmlElement(name = "Owner")
    private OwnerBean a;

    @XmlElement(name = "Grant")
    @XmlElementWrapper(name = "AccessControlList")
    private List<GrantBean> b;

    public S3AccessControlPolicy() {
    }

    public static S3AccessControlPolicy from(String str) throws Exception {
        return (S3AccessControlPolicy) JAXBContext.newInstance(new Class[]{S3AccessControlPolicy.class}).createUnmarshaller().unmarshal(new StringReader(str));
    }

    public AccessControlPolicy generateAccessControlPolicy() {
        AccessControlPolicy accessControlPolicy = new AccessControlPolicy();
        com.xiaomi.infra.galaxy.fds.bean.OwnerBean ownerBean = new com.xiaomi.infra.galaxy.fds.bean.OwnerBean();
        OwnerBean ownerBean2 = this.a;
        if (ownerBean2 != null) {
            ownerBean.setId(ownerBean2.getId());
            ownerBean.setDisplayName(this.a.getDisplayName());
            accessControlPolicy.setOwner(ownerBean);
        }
        if (this.b != null) {
            ArrayList arrayList = new ArrayList();
            for (GrantBean grantBean : this.b) {
                com.xiaomi.infra.galaxy.fds.bean.GrantBean grantBean2 = new com.xiaomi.infra.galaxy.fds.bean.GrantBean();
                com.xiaomi.infra.galaxy.fds.bean.GranteeBean granteeBean = new com.xiaomi.infra.galaxy.fds.bean.GranteeBean();
                if (grantBean.getGrantee() != null) {
                    granteeBean.setId(grantBean.getGrantee().getId());
                    granteeBean.setDisplayName(grantBean.getGrantee().getDisplayName());
                    grantBean2.setType(AccessControlList.GrantType.USER);
                }
                grantBean2.setGrantee(granteeBean);
                grantBean2.setPermission(grantBean.getPermission());
                arrayList.add(grantBean2);
            }
            accessControlPolicy.setAccessControlList(arrayList);
        }
        return accessControlPolicy;
    }

    public List<GrantBean> getAccessControlList() {
        return this.b;
    }

    public OwnerBean getOwner() {
        return this.a;
    }

    public void setAccessControlList(List<GrantBean> list) {
        this.b = list;
    }

    public void setOwner(OwnerBean ownerBean) {
        this.a = ownerBean;
    }

    public S3AccessControlPolicy(OwnerBean ownerBean, List<GrantBean> list) {
        this.a = ownerBean;
        this.b = list;
    }

    public S3AccessControlPolicy(AccessControlPolicy accessControlPolicy) {
        OwnerBean ownerBean = new OwnerBean();
        this.a = ownerBean;
        ownerBean.setId(accessControlPolicy.getOwner().getId());
        this.a.setDisplayName(accessControlPolicy.getOwner().getDisplayName());
        this.b = new ArrayList();
        for (com.xiaomi.infra.galaxy.fds.bean.GrantBean grantBean : accessControlPolicy.getAccessControlList()) {
            if (grantBean.getType() != AccessControlList.GrantType.GROUP) {
                GrantBean grantBean2 = new GrantBean();
                GranteeBean granteeBean = new GranteeBean();
                if (grantBean.getGrantee() != null) {
                    granteeBean.setId(grantBean.getGrantee().getId());
                    granteeBean.setDisplayName(grantBean.getGrantee().getDisplayName());
                }
                grantBean2.setGrantee(granteeBean);
                grantBean2.setPermission(grantBean.getPermission());
                this.b.add(grantBean2);
            }
        }
    }
}

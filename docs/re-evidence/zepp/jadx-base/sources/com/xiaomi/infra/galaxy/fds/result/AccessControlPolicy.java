package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.bean.GrantBean;
import com.xiaomi.infra.galaxy.fds.bean.OwnerBean;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class AccessControlPolicy {
    private OwnerBean a;
    private List<GrantBean> b;

    public AccessControlPolicy() {
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

    public AccessControlPolicy(OwnerBean ownerBean, List<GrantBean> list) {
        this.a = ownerBean;
        this.b = list;
    }
}

package com.xiaomi.infra.galaxy.fds.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Owner")
public class OwnerBean {

    @XmlElement(name = "ID")
    private String a;

    @XmlElement(name = "DisplayName")
    private String b;

    public OwnerBean() {
    }

    public String getDisplayName() {
        return this.b;
    }

    public String getId() {
        return this.a;
    }

    public void setDisplayName(String str) {
        this.b = str;
    }

    public void setId(String str) {
        this.a = str;
    }

    public OwnerBean(String str) {
        this.a = str;
    }

    public OwnerBean(String str, String str2) {
        this.a = str;
        setDisplayName(str2);
    }
}

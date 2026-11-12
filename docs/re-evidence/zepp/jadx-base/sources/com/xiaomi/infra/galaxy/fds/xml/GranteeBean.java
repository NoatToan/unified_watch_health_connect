package com.xiaomi.infra.galaxy.fds.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Grantee")
public class GranteeBean {

    @XmlElement(name = "ID")
    private String a;

    @XmlElement(name = "DisplayName")
    private String b;

    @XmlAttribute(name = "type", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private String c = "CanonicalUser";

    public GranteeBean() {
    }

    public String getDisplayName() {
        return this.b;
    }

    public String getId() {
        return this.a;
    }

    public String getType() {
        return this.c;
    }

    public void setDisplayName(String str) {
        this.b = str;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setType(String str) {
        this.c = str;
    }

    public GranteeBean(String str) {
        this.a = str;
    }

    public GranteeBean(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

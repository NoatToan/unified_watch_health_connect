package com.xiaomi.infra.galaxy.fds.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonPrefix {

    @XmlElement(name = "Prefix")
    private String a;

    public CommonPrefix(String str) {
        this.a = str;
    }

    public String getPrefix() {
        return this.a;
    }

    public void setPrefix(String str) {
        this.a = str;
    }

    public CommonPrefix() {
    }
}

package com.xiaomi.infra.galaxy.fds.xml;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
public class BucketMetadata {

    @XmlElement(name = MAPCookie.KEY_NAME)
    private String a;

    @XmlElement(name = "CreationDate")
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    private Date b;

    public Date getCreationDate() {
        return this.b;
    }

    public String getName() {
        return this.a;
    }

    public void setCreationDate(Date date) {
        this.b = date;
    }

    public void setName(String str) {
        this.a = str;
    }
}

package com.xiaomi.infra.galaxy.fds.xml;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class IsoDateAdapter extends XmlAdapter<String, Date> {
    public final String DATA_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public SimpleDateFormat iso8601DateParser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    public String marshal(Date date) throws Exception {
        return this.iso8601DateParser.format(date);
    }

    public Date unmarshal(String str) throws Exception {
        return this.iso8601DateParser.parse(str);
    }
}

package com.huami.assistant.sms.bean;

import com.google.gson.annotations.Expose;
import com.huami.assistant.sms.parse.SmsType;
import com.huami.watch.util.TimeUtil;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class Sms {
    public String content;
    public long date;

    @Expose
    public SmsType type;

    public String toString() {
        return SearchCriteria.LT + this.type + ", Date : " + TimeUtil.formatDateTime(this.date) + ", Content : " + this.content + SearchCriteria.GT;
    }
}

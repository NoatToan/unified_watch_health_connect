package com.huami.assistant.sms.parse.bean;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsType;

/* JADX INFO: loaded from: classes5.dex */
public class CinemaTicket extends Sms {
    public String checkCode;
    public String movieName;
    public long startTime;

    public CinemaTicket() {
        this.type = SmsType.CINEMA_TICKET;
    }

    public static CinemaTicket from(String jsonStr) {
        if (TextUtils.isEmpty(jsonStr)) {
            return null;
        }
        return (CinemaTicket) new Gson().fromJson(jsonStr, CinemaTicket.class);
    }

    @Override // com.huami.assistant.sms.bean.Sms
    public String toString() {
        return "CinemaTicket{type=" + this.type + ", content='" + this.content + "', movieName='" + this.movieName + "', startTime='" + this.startTime + "', checkCode='" + this.checkCode + "'}";
    }
}

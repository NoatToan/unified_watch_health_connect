package com.huami.assistant.sms.parse.bean;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.google.gson.Gson;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsType;

/* JADX INFO: loaded from: classes5.dex */
public class Flight extends Sms {
    public String arriveAirport;
    public long arriveTime;
    public String fightNumber;
    public String takeoffAirport;
    public long takeoffTime;

    public Flight() {
        this.type = SmsType.FLIGHT;
    }

    public static Flight from(String json) {
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        return (Flight) new Gson().fromJson(json, Flight.class);
    }

    @Override // com.huami.assistant.sms.bean.Sms
    public String toString() {
        return "Flight{type=" + this.type + " ,fightNumber=" + this.fightNumber + " ,takeoffAirport=" + this.takeoffAirport + " ,takeoffTime=" + this.takeoffTime + " ,arriveAirport=" + this.arriveAirport + " ,arriveTime=" + this.arriveTime + i.d;
    }
}

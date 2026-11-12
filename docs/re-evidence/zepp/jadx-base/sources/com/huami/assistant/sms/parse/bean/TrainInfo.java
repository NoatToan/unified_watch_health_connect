package com.huami.assistant.sms.parse.bean;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsType;

/* JADX INFO: loaded from: classes5.dex */
public class TrainInfo extends Sms {
    public String departureDate;
    public String departureTime;
    public String number;
    public String seat;
    public String startingStation;
    public String ticketEntrance;
    public String title;

    public TrainInfo() {
        this.type = SmsType.TRAININFO;
    }

    public static TrainInfo from(String jsonStr) {
        if (TextUtils.isEmpty(jsonStr)) {
            return null;
        }
        return (TrainInfo) new Gson().fromJson(jsonStr, TrainInfo.class);
    }
}

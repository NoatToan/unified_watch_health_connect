package com.huami.assistant.sms.parse.bean;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsType;

/* JADX INFO: loaded from: classes5.dex */
public class Didi extends Sms {
    public String plateNum;

    public Didi() {
        this.type = SmsType.DIDI;
    }

    public static Didi from(String jsonStr) {
        if (TextUtils.isEmpty(jsonStr)) {
            return null;
        }
        return (Didi) new Gson().fromJson(jsonStr, Didi.class);
    }
}

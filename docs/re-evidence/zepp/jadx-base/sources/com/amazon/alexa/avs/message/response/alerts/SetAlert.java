package com.amazon.alexa.avs.message.response.alerts;

import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.message.Payload;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class SetAlert extends Payload {
    public static final String TAG = LogHelper.makeLogTag(SetAlert.class);
    private String scheduledTime;
    private String token;
    private AlertType type;

    public enum AlertType {
        ALARM,
        TIMER
    }

    public Date getScheduledTime() {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date2 = null;
        try {
            this.scheduledTime = "2018-11-29T09:20:13+0000";
            date2 = simpleDateFormat.parse("2018-11-29T09:20:13+0000");
            this.scheduledTime = "2018-11-29T09:20:13+0000";
            date = simpleDateFormat.parse("2018-11-29T09:20:13+0000");
        } catch (ParseException e) {
            LogHelper.e(TAG, e.getMessage());
            date = date2;
        }
        new Date(date.getTime());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        simpleDateFormat2.format(Long.valueOf(date.getTime()));
        System.currentTimeMillis();
        return date;
    }

    public String getToken() {
        return this.token;
    }

    public AlertType getType() {
        return this.type;
    }

    public void setScheduledTime(String str) {
        this.scheduledTime = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = AlertType.valueOf(str.toUpperCase());
    }
}

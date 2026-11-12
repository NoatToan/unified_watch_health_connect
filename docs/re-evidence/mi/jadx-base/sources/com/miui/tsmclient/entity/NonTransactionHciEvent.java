package com.miui.tsmclient.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class NonTransactionHciEvent {

    @SerializedName("aid")
    private String mAid;

    @SerializedName("events")
    private List<Event> mEvents;

    public static class Event {

        @SerializedName("isSuccess")
        private boolean isSuccess;

        @SerializedName("cnDesc")
        private String mCnDesc;

        @SerializedName("data")
        private String mData;

        @SerializedName("defaultDesc")
        private String mDefaultDesc;

        @SerializedName("eventList")
        private List<Event> mEventList;

        @SerializedName("type")
        private String mType;

        public String getDesc() {
            return ("zh".equalsIgnoreCase(Locale.getDefault().getLanguage()) || "cn".equalsIgnoreCase(Locale.getDefault().getCountry())) ? this.mCnDesc : this.mDefaultDesc;
        }

        public List<Event> getEventList() {
            return this.mEventList;
        }

        public String getType() {
            return this.mType;
        }

        public boolean isSuccess() {
            return this.isSuccess;
        }
    }

    public String getAid() {
        return this.mAid;
    }

    public Event getEvent(String str) {
        if (this.mEvents != null && !TextUtils.isEmpty(str)) {
            for (Event event : this.mEvents) {
                if (!TextUtils.isEmpty(event.mData) && Pattern.compile(event.mData).matcher(str).matches()) {
                    return event;
                }
            }
        }
        return null;
    }

    public List<Event> getEvents() {
        return this.mEvents;
    }

    public boolean isSupport(String str, String str2) {
        String str3 = this.mAid;
        return (str3 == null || !Pattern.compile(str3).matcher(str).matches() || getEvent(str2) == null) ? false : true;
    }

    public Event getEvent(String str, List<Event> list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (Event event : list) {
                if (!TextUtils.isEmpty(event.mData) && Pattern.compile(event.mData).matcher(str).matches()) {
                    return event;
                }
            }
        }
        return null;
    }
}

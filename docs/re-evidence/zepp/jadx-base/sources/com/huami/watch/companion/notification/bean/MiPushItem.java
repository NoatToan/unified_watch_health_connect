package com.huami.watch.companion.notification.bean;

/* JADX INFO: loaded from: classes16.dex */
public class MiPushItem<T> {
    public static final String KEY_ITEM_TYPE = "type";
    public static final String TYPE_WATCH_NOTIFICATION = "watch_notification";
    private T data;
    private String type = TYPE_WATCH_NOTIFICATION;

    public T getData() {
        return this.data;
    }

    public String getType() {
        return this.type;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[type=" + this.type);
        if (this.data != null) {
            stringBuffer.append(",data=[");
            stringBuffer.append(this.data.toString());
            stringBuffer.append("]");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}

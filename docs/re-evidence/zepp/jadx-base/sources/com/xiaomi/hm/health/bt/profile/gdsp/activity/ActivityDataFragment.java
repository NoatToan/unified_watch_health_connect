package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityDataFragment<T> {
    private boolean a;
    private int b;
    private int c;
    public final List<T> data;
    public final Calendar timestamp;

    public ActivityDataFragment(Calendar timestamp, int dataLen) {
        this.a = false;
        this.b = -1;
        this.c = -1;
        this.timestamp = timestamp;
        this.c = dataLen;
        this.data = new ArrayList(dataLen);
    }

    public void addAll(List<T> list) {
        this.data.addAll(list);
    }

    public void addData(T data) {
        this.data.add(data);
    }

    public int getDataLen() {
        return this.c;
    }

    public int getTotalLen() {
        return this.b;
    }

    public boolean isEnd() {
        return this.a;
    }

    public void setTotalLen(int totalLen) {
        this.b = totalLen;
    }

    public int size() {
        List<T> list = this.data;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public String toString() {
        return "[[[ " + getClass().getSimpleName() + " ]]]\n    timestamp: " + DateFormat.getDateTimeInstance().format(this.timestamp.getTime()) + "\n      dataLen: " + this.c + "\n     totalLen: " + this.b;
    }

    public ActivityDataFragment(Calendar timestamp, List<T> data) {
        this.a = false;
        this.b = -1;
        this.c = -1;
        this.timestamp = timestamp;
        this.c = data.size();
        this.data = data;
    }

    public ActivityDataFragment(Calendar timestamp, boolean isEnd) {
        this.a = false;
        this.b = -1;
        this.c = -1;
        this.timestamp = timestamp;
        this.data = new ArrayList();
        this.a = isEnd;
    }
}

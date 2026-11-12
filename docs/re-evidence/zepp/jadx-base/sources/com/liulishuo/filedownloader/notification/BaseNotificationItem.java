package com.liulishuo.filedownloader.notification;

import android.app.NotificationManager;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.liulishuo.filedownloader.util.FileDownloadHelper;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseNotificationItem {
    private int a;
    private int b;
    private int c;
    private String d;
    private String e;
    private int f = 0;
    private int g = 0;
    private NotificationManager h;

    public BaseNotificationItem(int i, String str, String str2) {
        this.a = i;
        this.d = str;
        this.e = str2;
    }

    public void cancel() {
        getManager().cancel(this.a);
    }

    public String getDesc() {
        return this.e;
    }

    public int getId() {
        return this.a;
    }

    public int getLastStatus() {
        return this.g;
    }

    public NotificationManager getManager() {
        if (this.h == null) {
            this.h = (NotificationManager) FileDownloadHelper.getAppContext().getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        }
        return this.h;
    }

    public int getSofar() {
        return this.b;
    }

    public int getStatus() {
        int i = this.f;
        this.g = i;
        return i;
    }

    public String getTitle() {
        return this.d;
    }

    public int getTotal() {
        return this.c;
    }

    public boolean isChanged() {
        return this.g != this.f;
    }

    public void setDesc(String str) {
        this.e = str;
    }

    public void setId(int i) {
        this.a = i;
    }

    public void setSofar(int i) {
        this.b = i;
    }

    public void setStatus(int i) {
        this.f = i;
    }

    public void setTitle(String str) {
        this.d = str;
    }

    public void setTotal(int i) {
        this.c = i;
    }

    public void show(boolean z) {
        show(isChanged(), getStatus(), z);
    }

    public abstract void show(boolean z, int i, boolean z2);

    public void update(int i, int i2) {
        this.b = i;
        this.c = i2;
        show(true);
    }

    public void updateStatus(int i) {
        this.f = i;
    }
}

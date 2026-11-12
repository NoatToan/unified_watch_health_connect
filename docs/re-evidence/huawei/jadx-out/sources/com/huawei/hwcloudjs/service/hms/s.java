package com.huawei.hwcloudjs.service.hms;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f17197a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Parcelable> f17198b = new HashMap();

    public PendingIntent b(String str) {
        synchronized (this.f17198b) {
            Parcelable parcelable = this.f17198b.get(str);
            if (!(parcelable instanceof PendingIntent)) {
                return null;
            }
            return (PendingIntent) parcelable;
        }
    }

    public void a(String str, Intent intent) {
        synchronized (this.f17198b) {
            this.f17198b.put(str, intent);
        }
    }

    public void a(String str, PendingIntent pendingIntent) {
        synchronized (this.f17198b) {
            this.f17198b.put(str, pendingIntent);
        }
    }

    public Intent a(String str) {
        synchronized (this.f17198b) {
            Parcelable parcelable = this.f17198b.get(str);
            if (!(parcelable instanceof Intent)) {
                return null;
            }
            return (Intent) parcelable;
        }
    }

    public static s a() {
        return f17197a;
    }
}

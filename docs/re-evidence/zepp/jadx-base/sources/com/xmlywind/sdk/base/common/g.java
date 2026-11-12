package com.xmlywind.sdk.base.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public abstract class g {
    public String a;
    public Context b;
    public Context c;
    public WeakReference<Activity> d;
    public RelativeLayout e;
    public h f;

    public g(Activity activity, String str, h hVar) {
        this.c = activity;
        this.b = activity.getApplicationContext();
        this.d = new WeakReference<>(activity);
        this.a = str;
        this.f = hVar;
        this.e = new RelativeLayout(this.b);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public void a(String str) {
        String str2 = this.a;
        if (str2 != null) {
            BaseBroadcastReceiver.a(this.b, str2, str);
        } else {
            SigmobLog.w("Tried to broadcast a video event without a broadcast identifier to send to.");
        }
    }

    public void a(String str, int i) {
        String str2 = this.a;
        if (str2 != null) {
            BaseBroadcastReceiver.a(this.b, str2, str, i);
        } else {
            SigmobLog.w("Tried to broadcast a video event without a broadcast identifier to send to.");
        }
    }

    public void a(String str, Map<String, Object> map) {
        String str2 = this.a;
        if (str2 != null) {
            BaseBroadcastReceiver.a(this.b, str2, map, str, 0);
        } else {
            SigmobLog.w("Tried to broadcast a video event without a broadcast identifier to send to.");
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public boolean g() {
        return true;
    }

    public h h() {
        return this.f;
    }

    public Context i() {
        return this.b;
    }

    public ViewGroup j() {
        return this.e;
    }

    public Activity k() {
        WeakReference<Activity> weakReference = this.d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}

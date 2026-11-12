package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.dq;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public abstract class al {
    public abstract com.xiaomi.push.ay a(Context context, int i, String str, Map<String, String> map);

    public abstract void b(dq dqVar, Map<String, String> map, int i, Notification notification);

    public abstract boolean c(Context context, int i, String str, Map<String, String> map);

    public abstract boolean d(Map<String, String> map, int i, Notification notification);
}

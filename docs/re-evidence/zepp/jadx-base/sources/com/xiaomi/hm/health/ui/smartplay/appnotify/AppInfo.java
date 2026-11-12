package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.graphics.drawable.Drawable;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes22.dex */
public class AppInfo {
    public Drawable icon;
    public boolean isChecked;
    public String name;
    public String packageName;

    public String toString() {
        return "AppInfo{packageName:" + this.packageName + ", name:" + this.name + ", isChecked:" + this.isChecked + i.d;
    }
}

package com.xiaomi.hm.health.ui.smartplay.appnotify;

import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public class AppComparator implements Comparator<AppInfo> {
    private int a(String str, String str2) {
        return CharacterParser.getInstance().getSellingIgnoreCase(str).compareTo(CharacterParser.getInstance().getSellingIgnoreCase(str2));
    }

    @Override // java.util.Comparator
    public int compare(AppInfo appInfo, AppInfo appInfo2) {
        return a(appInfo.name, appInfo2.name);
    }
}

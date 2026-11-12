package com.miui.tsmclient.util;

import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public interface IStartActivityForResult {
    void launchStartActivityForResult(Intent intent, int i);

    void onActivityForResult(int i, int i2, Intent intent);
}

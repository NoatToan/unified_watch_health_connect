package com.xiaomi.onetrack.b;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13804a;

    public b(String str) {
        this.f13804a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f13804a)) {
            return;
        }
        a.b(this.f13804a);
    }
}

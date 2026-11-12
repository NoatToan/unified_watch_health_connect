package com.huawei.hwcloudjs.e.a;

import android.content.Context;

/* JADX INFO: loaded from: classes37.dex */
final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f17101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f17102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f17103c;

    @Override // java.lang.Runnable
    public void run() {
        for (String str : this.f17101a) {
            if (c.d().d(str) == null) {
                com.huawei.hwcloudjs.f.d.c("CacheRequestManager", "enter into preload requestBean " + str, false);
                com.huawei.hwcloudjs.e.a.a.b bVar = (com.huawei.hwcloudjs.e.a.a.b) com.huawei.hwcloudjs.d.b.b.a(new com.huawei.hwcloudjs.e.a.a.a(str), this.f17102b);
                if (bVar.c() == 1) {
                    com.huawei.hwcloudjs.f.d.c("CacheRequestManager", "getcache url success:" + str, false);
                    c.d().a(str, new a(str, bVar.d(), bVar.d().length(), this.f17103c));
                } else {
                    com.huawei.hwcloudjs.f.d.b("CacheRequestManager", "getcache url failed!", true);
                }
            }
        }
    }

    d(String[] strArr, Context context, int i) {
        this.f17101a = strArr;
        this.f17102b = context;
        this.f17103c = i;
    }
}

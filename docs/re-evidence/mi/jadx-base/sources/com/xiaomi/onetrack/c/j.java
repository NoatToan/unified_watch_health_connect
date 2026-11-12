package com.xiaomi.onetrack.c;

/* JADX INFO: loaded from: classes11.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13848b;

    public j(String str, String str2) {
        this.f13847a = str;
        this.f13848b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.c(this.f13847a, this.f13848b);
    }
}

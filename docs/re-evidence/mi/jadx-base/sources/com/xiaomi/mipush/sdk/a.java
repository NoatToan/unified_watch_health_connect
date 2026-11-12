package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes11.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13633b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b.a d;

    public a(String str, String str2, String str3, b.a aVar) {
        this.f13632a = str;
        this.f13633b = str2;
        this.c = str3;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.F(b.f13638a, this.f13632a, this.f13633b, null, this.c, this.d);
    }
}

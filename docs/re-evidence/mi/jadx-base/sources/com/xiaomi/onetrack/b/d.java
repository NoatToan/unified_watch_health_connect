package com.xiaomi.onetrack.b;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.HandlerC0831a f13807b;

    public d(a.HandlerC0831a handlerC0831a, String str) {
        this.f13807b = handlerC0831a;
        this.f13806a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.b((List<String>) Arrays.asList(this.f13806a));
        a.A.put(this.f13806a, Boolean.FALSE);
    }
}

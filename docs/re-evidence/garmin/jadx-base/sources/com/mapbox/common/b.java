package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f54347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Expected f54348c;

    public /* synthetic */ b(Map.Entry entry, Expected expected, int i14) {
        this.f54346a = i14;
        this.f54347b = entry;
        this.f54348c = expected;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54346a) {
            case 0:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(this.f54347b, this.f54348c);
                break;
            default:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(this.f54347b, this.f54348c);
                break;
        }
    }
}

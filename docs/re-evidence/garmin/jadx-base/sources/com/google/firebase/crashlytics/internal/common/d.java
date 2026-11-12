package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f53698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettingsProvider f53699c;

    public /* synthetic */ d(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i14) {
        this.f53697a = i14;
        this.f53698b = crashlyticsCore;
        this.f53699c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53697a) {
            case 0:
                this.f53698b.lambda$doBackgroundInitializationAsync$0(this.f53699c);
                break;
            default:
                this.f53698b.lambda$finishInitSynchronously$9(this.f53699c);
                break;
        }
    }
}

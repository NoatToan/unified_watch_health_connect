package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53819b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f53818a = i14;
        this.f53819b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f53818a) {
            case 0:
                return ((FirebaseRemoteConfig) this.f53819b).lambda$reset$6();
            case 1:
                return ((FirebaseRemoteConfig) this.f53819b).getInfo();
            default:
                return ((RemoteConfigComponent) this.f53819b).getDefault();
        }
    }
}

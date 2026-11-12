package com.google.firebase.sessions;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53841b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f53840a = i14;
        this.f53841b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f53840a) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$2((Context) this.f53841b);
            case 1:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$5((Context) this.f53841b);
            default:
                return ProcessDataManagerImpl.myUuid_delegate$lambda$1((UuidGenerator) this.f53841b);
        }
    }
}

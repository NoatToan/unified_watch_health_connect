package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53714b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53713a = i14;
        this.f53714b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53713a) {
            case 0:
                ((UserMetadata.SerializeableKeysMap) this.f53714b).lambda$scheduleSerializationTaskIfNeeded$0();
                break;
            default:
                ((UserMetadata) this.f53714b).serializeUserDataIfNeeded();
                break;
        }
    }
}

package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53696c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f53694a = i14;
        this.f53695b = obj;
        this.f53696c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53694a) {
            case 0:
                ((CrashlyticsController) this.f53695b).lambda$openSession$1((String) this.f53696c);
                break;
            case 1:
                ((CrashlyticsCore) this.f53695b).lambda$setCustomKeys$6((Map) this.f53696c);
                break;
            case 2:
                ((CrashlyticsCore) this.f53695b).lambda$logFatalException$8((Throwable) this.f53696c);
                break;
            default:
                ((CrashlyticsCore) this.f53695b).lambda$setUserId$4((String) this.f53696c);
                break;
        }
    }
}

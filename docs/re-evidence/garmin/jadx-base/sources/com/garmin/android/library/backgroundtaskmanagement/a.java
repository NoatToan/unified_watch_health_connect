package com.garmin.android.library.backgroundtaskmanagement;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements com.garmin.android.library.backgroundtaskmanagement.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f50084a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.garmin.android.library.backgroundtaskmanagement.a$a, reason: collision with other inner class name */
    public class RunnableC0994a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b f50085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b f50086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b.e f50087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f50088d;

        public RunnableC0994a(a aVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b, com.garmin.android.library.backgroundtaskmanagement.b bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            this.f50085a = interfaceC0995b;
            this.f50086b = bVar;
            this.f50087c = eVar;
            this.f50088d = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f50085a.onResults(this.f50086b.f50096f, this.f50087c, this.f50088d);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b f50089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b f50090b;

        public b(a aVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b, com.garmin.android.library.backgroundtaskmanagement.b bVar) {
            this.f50089a = interfaceC0995b;
            this.f50090b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.garmin.android.library.backgroundtaskmanagement.b bVar = this.f50090b;
            this.f50089a.onComplete(bVar.f50096f, bVar.f());
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
    public final void E(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
        if (bVar.f50098h.get()) {
            return;
        }
        SoftReference<com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b> softReference = bVar.f50100j;
        com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = softReference != null ? softReference.get() : null;
        if (interfaceC0995b != null) {
            this.f50084a.post(new b(this, interfaceC0995b, bVar));
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
    public final void J(com.garmin.android.library.backgroundtaskmanagement.b bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        if (bVar != null && !bVar.f50098h.get()) {
            SoftReference<com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b> softReference = bVar.f50100j;
            com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = softReference != null ? softReference.get() : null;
            if (interfaceC0995b != null) {
                this.f50084a.post(new RunnableC0994a(this, interfaceC0995b, bVar, eVar, obj));
            }
        }
    }
}

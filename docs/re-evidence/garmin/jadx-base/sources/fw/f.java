package fw;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.SoftReference;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfw/f;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements com.garmin.android.library.backgroundtaskmanagement.b.a, Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f73766a = new Handler(Looper.getMainLooper());

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
    public final void E(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
        SoftReference<com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b> softReference = bVar.f50100j;
        com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = softReference != null ? softReference.get() : null;
        if (interfaceC0995b != null) {
            this.f73766a.post(new df.d(10, interfaceC0995b, bVar));
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
    public final void J(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        bVar.getClass();
        eVar.getClass();
        obj.getClass();
        SoftReference<com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b> softReference = bVar.f50100j;
        com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b = softReference != null ? softReference.get() : null;
        if (interfaceC0995b != null) {
            this.f73766a.post(new at0.c(interfaceC0995b, bVar, eVar, obj));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f73766a.post(runnable);
    }
}

package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class p6r extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<a> f30073a;

    public interface a {
        void handleMessage(Message message);
    }

    public p6r(a aVar) {
        this.f30073a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        WeakReference<a> weakReference = this.f30073a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f30073a.get().handleMessage(message);
    }
}

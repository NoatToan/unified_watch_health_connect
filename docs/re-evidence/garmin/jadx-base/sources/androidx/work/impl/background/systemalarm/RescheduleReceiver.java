package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import ue.u;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        u.b("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u uVarA = u.a();
        Objects.toString(intent);
        uVarA.getClass();
        try {
            t0 t0VarG = t0.g(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            t0VarG.getClass();
            synchronized (t0.f177603n) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = t0VarG.f177612j;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    t0VarG.f177612j = pendingResultGoAsync;
                    if (t0VarG.f177611i) {
                        pendingResultGoAsync.finish();
                        t0VarG.f177612j = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (IllegalStateException unused) {
            u.a().getClass();
        }
    }
}

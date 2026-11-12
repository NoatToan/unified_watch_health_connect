package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.d;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
import p13.w;
import ue.i0;
import ue.u;
import ue.x;
import ve.c0;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        u.b("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        u.a().getClass();
        try {
            i0.f170088a.getClass();
            t0 t0VarA = i0.a.a(context);
            x.f170131e.getClass();
            List listC = w.c(new x.a((Class<? extends d>) DiagnosticsWorker.class).a());
            if (listC.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new c0(t0VarA, listC).a();
        } catch (IllegalStateException unused) {
            u.a().getClass();
        }
    }
}

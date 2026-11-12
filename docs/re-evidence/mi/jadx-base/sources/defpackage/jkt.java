package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.splitinstall.zzo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class jkt extends dkt {
    public static jkt j;
    public final Handler g;
    public final ejt h;
    public final Set i;

    @VisibleForTesting
    public jkt(Context context, ejt ejtVar) {
        super(new gkt("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.h = ejtVar;
    }

    public static synchronized jkt f(Context context) {
        try {
            if (j == null) {
                j = new jkt(context, zzo.INSTANCE);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    @Override // defpackage.dkt
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        h7n h7nVarJ = h7n.j(bundleExtra);
        this.f15641a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", h7nVarJ);
        hjt hjtVarZza = this.h.zza();
        if (h7nVarJ.e() != 3 || hjtVarZza == null) {
            h(h7nVarJ);
        } else {
            hjtVarZza.a(h7nVarJ.i(), new hkt(this, h7nVarJ, intent, context));
        }
    }

    public final synchronized void h(h7n h7nVar) {
        try {
            Iterator it = new LinkedHashSet(this.i).iterator();
            while (it.hasNext()) {
                ((i7n) it.next()).a(h7nVar);
            }
            super.c(h7nVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}

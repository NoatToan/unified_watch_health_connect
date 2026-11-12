package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class was extends s8t {
    public final eks g;
    public final xgs h;
    public final tds i;
    public final ihs j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xns f37788k;
    public final Handler l;
    public final i7s m;
    public final i7s n;
    public final i7s o;

    public was(Context context, eks eksVar, xgs xgsVar, i7s i7sVar, ihs ihsVar, tds tdsVar, i7s i7sVar2, i7s i7sVar3, xns xnsVar) {
        super(new pbt("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.l = new Handler(Looper.getMainLooper());
        this.g = eksVar;
        this.h = xgsVar;
        this.m = i7sVar;
        this.j = ihsVar;
        this.i = tdsVar;
        this.n = i7sVar2;
        this.o = i7sVar3;
        this.f37788k = xnsVar;
    }

    @Override // defpackage.s8t
    public final void b(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f33421a.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f33421a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateC = AssetPackState.c(bundleExtra, stringArrayList.get(0), this.j, this.f37788k, new jbs() { // from class: ebs
            @Override // defpackage.jbs
            public final int a(int i, String str) {
                return i;
            }
        });
        this.f33421a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateC);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.i.a(pendingIntent);
        }
        ((Executor) this.o.a()).execute(new Runnable() { // from class: v8s
            @Override // java.lang.Runnable
            public final void run() {
                this.f36630a.g(bundleExtra, assetPackStateC);
            }
        });
        ((Executor) this.n.a()).execute(new Runnable() { // from class: tas
            @Override // java.lang.Runnable
            public final void run() {
                this.f34523a.f(bundleExtra);
            }
        });
    }

    public final /* synthetic */ void f(Bundle bundle) {
        if (this.g.n(bundle)) {
            this.h.a();
        }
    }

    public final /* synthetic */ void g(Bundle bundle, AssetPackState assetPackState) {
        if (this.g.m(bundle)) {
            h(assetPackState);
            ((vgt) this.m.a()).f();
        }
    }

    public final void h(final AssetPackState assetPackState) {
        this.l.post(new Runnable() { // from class: q8s
            @Override // java.lang.Runnable
            public final void run() {
                this.f31239a.d(assetPackState);
            }
        });
    }
}

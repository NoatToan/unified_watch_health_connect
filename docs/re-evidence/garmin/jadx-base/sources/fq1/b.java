package fq1;

import android.content.Context;
import android.content.IntentFilter;
import com.garmin.android.apps.connectmobile.p0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq1/b;", "Lfq1/s;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yz0.a f73234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p0 f73235b;

    @Override // fq1.s
    public final z a() {
        x53.c cVar = s0.f129406a;
        return u53.o.f168762a;
    }

    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        yz0.a aVar = this.f73234a;
        if (aVar != null && aVar.f200228a) {
            aVar.f200229b.unregisterReceiver(aVar);
            da2.d.b().f58886a.i(aVar.f200230c);
            aVar.f200228a = false;
        }
        yz0.a aVar2 = new yz0.a(context);
        if (!aVar2.f200228a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.PROVIDERS_CHANGED");
            intentFilter.addAction("android.location.MODE_CHANGED");
            aVar2.f200229b.registerReceiver(aVar2, intentFilter);
            da2.d.b().f58886a.b(aVar2.f200230c);
            aVar2.f200228a = true;
        }
        this.f73234a = aVar2;
        p0 p0Var = this.f73235b;
        if (p0Var != null) {
            context.getClass();
            if (p0Var.f39754a) {
                context.unregisterReceiver(p0Var);
                p0Var.f39754a = false;
            }
        }
        p0 p0Var2 = new p0();
        context.getClass();
        if (!p0Var2.f39754a) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            context.registerReceiver(p0Var2, intentFilter2);
            p0Var2.f39754a = true;
        }
        this.f73235b = p0Var2;
        return Unit.INSTANCE;
    }
}

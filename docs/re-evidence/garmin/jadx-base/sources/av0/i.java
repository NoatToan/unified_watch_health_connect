package av0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lav0/i;", "Landroid/content/BroadcastReceiver;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f13218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f13219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f13220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f13221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f13222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q<Intent, f.a> f13225i;

    public i(p0 p0Var, p0 p0Var2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, String str, String str2, q<Intent, f.a> qVar) {
        this.f13218b = p0Var;
        this.f13219c = p0Var2;
        this.f13220d = aVar;
        this.f13221e = aVar2;
        this.f13222f = aVar3;
        this.f13223g = str;
        this.f13224h = str2;
        this.f13225i = qVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p0 p0Var = this.f13218b;
        int i14 = p0Var.f105807a;
        if (i14 != this.f13219c.f105807a) {
            p0Var.f105807a = i14 + 1;
            return;
        }
        p0Var.f105807a = 1;
        int resultCode = getResultCode();
        if (resultCode == -1) {
            if (this.f13217a) {
                if (context != null) {
                    context.unregisterReceiver(this);
                }
                this.f13217a = false;
            }
            this.f13220d.invoke();
            this.f13221e.invoke();
            this.f13222f.invoke();
            return;
        }
        q<Intent, f.a> qVar = this.f13225i;
        String str = this.f13224h;
        String str2 = this.f13223g;
        if (resultCode == 0 || resultCode == 1 || resultCode == 11 || resultCode == 14 || resultCode == 32 || resultCode == 23 || resultCode == 24) {
            context.getClass();
            h.d(context, str2, str, qVar);
        } else {
            context.getClass();
            h.d(context, str2, str, qVar);
        }
    }
}

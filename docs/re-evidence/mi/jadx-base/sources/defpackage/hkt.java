package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class hkt implements cjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h7n f20177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f20178b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ jkt d;

    public hkt(jkt jktVar, h7n h7nVar, Intent intent, Context context) {
        this.d = jktVar;
        this.f20177a = h7nVar;
        this.f20178b = intent;
        this.c = context;
    }

    @Override // defpackage.cjt
    public final void a(int i) {
        jkt jktVar = this.d;
        jktVar.g.post(new ikt(jktVar, this.f20177a, 6, i));
    }

    @Override // defpackage.cjt
    public final void zza() {
        jkt jktVar = this.d;
        jktVar.g.post(new ikt(jktVar, this.f20177a, 5, 0));
    }

    @Override // defpackage.cjt
    public final void zzc() {
        if (this.f20178b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.d.f15641a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f20178b.putExtra("triggered_from_app_after_verification", true);
            this.c.sendBroadcast(this.f20178b);
        }
    }
}

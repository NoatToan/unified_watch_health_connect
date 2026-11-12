package nh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f126119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f126121c;

    public h(i iVar, Intent intent, Object obj) {
        this.f126121c = iVar;
        this.f126119a = intent;
        this.f126120b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVar = this.f126121c;
            Activity activity = iVar.f126122a;
            if (activity != null) {
                activity.startActivity(this.f126119a);
                return;
            }
            wg.a.g(iVar.f126126e, "biz", "ErrActNull2", "");
            Context context = this.f126121c.f126126e.f112378c;
            if (context != null) {
                context.startActivity(this.f126119a);
            }
        } catch (Throwable th3) {
            wg.a.d(this.f126121c.f126126e, "biz", "ErrActEx2", th3);
            i iVar2 = this.f126121c;
            n.g(iVar2.f126122a, "startActivityEx", iVar2.f126126e);
            synchronized (this.f126120b) {
                try {
                    this.f126121c.f126128g = "scheme_failed";
                    this.f126120b.notify();
                } catch (Throwable th4) {
                    wg.a.d(this.f126121c.f126126e, "biz", "BSAResultEx", th4);
                }
            }
        }
    }
}

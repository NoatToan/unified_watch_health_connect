package wb2;

import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f184157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f184158b;

    public u(r rVar, a aVar, Intent intent) {
        this.f184157a = aVar;
        this.f184158b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f184157a.n(this.f184158b);
    }
}

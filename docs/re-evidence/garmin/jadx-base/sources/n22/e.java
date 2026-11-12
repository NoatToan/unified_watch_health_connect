package n22;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class e extends c.a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f122379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f122380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f122381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f122382d = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.f122379a.f122376a.remove(eVar);
            eVar.f122379a.hideProgressOverlay();
        }
    }

    public e(c cVar, Runnable runnable, Handler handler) {
        this.f122379a = cVar;
        this.f122380b = runnable;
        ArrayList<c.b> arrayList = cVar.f122376a;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.f122381c = handler;
    }

    @Override // n22.c.a, n22.c.b
    public final void a() {
        this.f122379a.hideProgressOverlay();
    }

    @Override // n22.c.a, n22.c.b
    public final void b() {
        a aVar = this.f122382d;
        aVar.run();
        this.f122381c.removeCallbacks(aVar);
    }

    @Override // n22.c.a, n22.c.b
    public final void c() {
        this.f122379a.showProgressOverlay();
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f122382d;
        Handler handler = this.f122381c;
        try {
            this.f122380b.run();
        } finally {
            handler.post(aVar);
        }
    }
}

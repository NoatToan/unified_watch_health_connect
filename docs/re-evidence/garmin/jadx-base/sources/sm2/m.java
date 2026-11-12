package sm2;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class m extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f160327a;

    public m(o oVar) {
        this.f160327a = oVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        o oVar = this.f160327a;
        oVar.f160340f.debug("connectDevice after delay");
        super/*sm2.a*/.j();
    }
}

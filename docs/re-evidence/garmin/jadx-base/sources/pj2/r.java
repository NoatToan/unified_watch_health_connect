package pj2;

import android.os.Message;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class r extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f138109a;

    public r(v vVar) {
        this.f138109a = vVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1004;
        this.f138109a.handleMessage(messageObtain);
    }
}

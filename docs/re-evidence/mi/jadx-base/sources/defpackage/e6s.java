package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public class e6s extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z5s f16333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6s(z5s z5sVar, Looper looper) {
        super(looper);
        this.f16333a = z5sVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        z5s.b bVar = (z5s.b) message.obj;
        int i = message.what;
        if (i == 0) {
            bVar.a();
        } else if (i == 1) {
            bVar.c();
        }
        super.handleMessage(message);
    }
}

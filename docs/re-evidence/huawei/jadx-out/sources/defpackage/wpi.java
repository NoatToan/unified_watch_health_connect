package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wpi extends Handler {
    wpi() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 4097) {
            int i = message.arg1;
            List<dlo> listA = wpp.a().a(i);
            wpq.a().b();
            wpq.a().a(i, listA);
        }
    }
}

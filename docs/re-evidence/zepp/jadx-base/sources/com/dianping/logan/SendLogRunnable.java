package com.dianping.logan;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SendLogRunnable implements Runnable {
    public static final int FINISH = 10002;
    public static final int SENDING = 10001;
    private e a;
    private a b;

    public interface a {
        void a(int i);
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void b(e eVar) {
        this.a = eVar;
    }

    public void finish() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(10002);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVar = this.a;
        if (eVar == null || TextUtils.isEmpty(eVar.b)) {
            finish();
        } else if (TextUtils.isEmpty(this.a.c)) {
            finish();
        } else {
            sendLog(new File(this.a.c));
        }
    }

    public abstract void sendLog(File file);
}

package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes2.dex */
class p {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public static final int a = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).recycle();
            return true;
        }
    }

    public void a(Resource<?> resource) {
        Util.assertMainThread();
        if (this.a) {
            this.b.obtainMessage(1, resource).sendToTarget();
            return;
        }
        this.a = true;
        resource.recycle();
        this.a = false;
    }
}

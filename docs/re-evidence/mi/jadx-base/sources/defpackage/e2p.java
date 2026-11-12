package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e2p<T> extends t6r<T> {
    private static final long DEFAULT_KEEP_TIME = TimeUnit.SECONDS.toMillis(30);
    private static final int MSG_TIMEOUT = 1;
    private final AtomicReference<T> mData;
    private final Handler mHandler;
    private final long mKeepTime;

    public e2p(long j) {
        this.mData = new AtomicReference<>();
        this.mKeepTime = j;
        this.mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: d2p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f15012a.lambda$new$0(message);
            }
        });
    }

    private void flushTimeout(T t) {
        if (t == null) {
            this.mHandler.removeMessages(1);
            return;
        }
        this.mData.set(t);
        this.mHandler.removeMessages(1);
        this.mHandler.sendEmptyMessageDelayed(1, this.mKeepTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.mData.set(null);
        return true;
    }

    @Override // defpackage.t6r, defpackage.xak, defpackage.unq
    public T onConstructor() {
        T t = (T) super.onConstructor();
        flushTimeout(t);
        return t;
    }

    @Override // defpackage.t6r, defpackage.xak, defpackage.unq
    public T peek() {
        T t = (T) super.peek();
        flushTimeout(t);
        return t;
    }

    public e2p() {
        this(DEFAULT_KEEP_TIME);
    }
}

package defpackage;

import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.callback.StatusCallback;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class cnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArraySet<FrameReceiver> f1864a;
    private CopyOnWriteArraySet<StatusCallback> d;

    public CopyOnWriteArraySet<StatusCallback> a() {
        return this.d;
    }

    public CopyOnWriteArraySet<FrameReceiver> d() {
        return this.f1864a;
    }

    private cnq() {
        this.d = new CopyOnWriteArraySet<>();
        this.f1864a = new CopyOnWriteArraySet<>();
    }

    public static cnq b() {
        return c.f1865b;
    }

    public void a(StatusCallback statusCallback) {
        this.d.add(statusCallback);
    }

    public void c(StatusCallback statusCallback) {
        this.d.remove(statusCallback);
    }

    public void c(FrameReceiver frameReceiver) {
        this.f1864a.add(frameReceiver);
    }

    public void d(FrameReceiver frameReceiver) {
        this.f1864a.remove(frameReceiver);
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cnq f1865b = new cnq();
    }
}

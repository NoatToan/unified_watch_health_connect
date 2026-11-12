package vd2;

import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvd2/d;", "Landroid/os/Handler;", "Landroid/media/ImageReader$OnImageAvailableListener;", "Landroid/os/HandlerThread;", "thread", "<init>", "(Landroid/os/HandlerThread;)V", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d extends Handler implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f177503a;

    public /* synthetic */ d(HandlerThread handlerThread, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            handlerThread = new HandlerThread("CameraFrameHandler");
            handlerThread.start();
        }
        this(handlerThread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        handlerThread.getClass();
        this.f177503a = handlerThread;
    }
}

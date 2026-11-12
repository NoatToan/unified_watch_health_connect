package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ SafeCloseImageReaderProxy a;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.safeClose();
    }
}

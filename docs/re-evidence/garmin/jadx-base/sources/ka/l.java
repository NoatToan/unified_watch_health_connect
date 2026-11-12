package ka;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f103701b;

    public /* synthetic */ l(Object obj, int i14) {
        this.f103700a = i14;
        this.f103701b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f103700a) {
            case 0:
                ((Handler) this.f103701b).post(runnable);
                break;
            case 1:
                ((Choreographer) this.f103701b).postFrameCallback(new com.mapbox.maps.renderer.b(runnable, 3));
                break;
            default:
                ((fa.i) this.f103701b).post(runnable);
                break;
        }
    }
}

package c22;

import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f23113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitInstallStateUpdatedListener f23114b;

    public k1(h1 h1Var, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f23113a = h1Var;
        this.f23114b = splitInstallStateUpdatedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23113a.f23067a.unregisterListener(this.f23114b);
    }
}

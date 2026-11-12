package xg0;

import android.animation.Animator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f190766a;

    public g(Animator animator) {
        this.f190766a = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f190766a.start();
    }
}

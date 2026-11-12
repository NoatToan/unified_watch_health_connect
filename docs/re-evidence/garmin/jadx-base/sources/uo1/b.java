package uo1;

import android.animation.Animator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f172119a;

    public b(Animator animator) {
        this.f172119a = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f172119a.start();
    }
}

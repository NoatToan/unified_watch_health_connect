package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f11199a;

    public d(c cVar) {
        this.f11199a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c cVar = this.f11199a;
        ArrayList arrayList = new ArrayList(cVar.f11191e);
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((b) arrayList.get(i14)).onAnimationEnd(cVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        c cVar = this.f11199a;
        ArrayList arrayList = new ArrayList(cVar.f11191e);
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((b) arrayList.get(i14)).onAnimationStart(cVar);
        }
    }
}

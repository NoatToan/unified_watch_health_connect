package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class uco {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f35627a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f35628b = null;
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            uco ucoVar = uco.this;
            if (ucoVar.c == animator) {
                ucoVar.c = null;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f35630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueAnimator f35631b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f35630a = iArr;
            this.f35631b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f35627a.add(bVar);
    }
}

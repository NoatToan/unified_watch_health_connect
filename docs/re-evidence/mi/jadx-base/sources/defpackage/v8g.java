package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class v8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36617b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public v8g(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.f36616a = j;
        this.f36617b = j2;
    }

    public static v8g b(ValueAnimator valueAnimator) {
        v8g v8gVar = new v8g(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        v8gVar.d = valueAnimator.getRepeatCount();
        v8gVar.e = valueAnimator.getRepeatMode();
        return v8gVar;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return wc1.f37827b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return wc1.c;
        }
        return interpolator instanceof DecelerateInterpolator ? wc1.d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f36616a;
    }

    public long d() {
        return this.f36617b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : wc1.f37827b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8g)) {
            return false;
        }
        v8g v8gVar = (v8g) obj;
        if (c() == v8gVar.c() && d() == v8gVar.d() && g() == v8gVar.g() && h() == v8gVar.h()) {
            return e().getClass().equals(v8gVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public v8g(long j, long j2, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.f36616a = j;
        this.f36617b = j2;
        this.c = timeInterpolator;
    }
}

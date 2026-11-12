package kotlin;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/u0;", "Li5/a4;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 implements a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f91582a;

    public u0(ViewConfiguration viewConfiguration) {
        this.f91582a = viewConfiguration;
    }

    @Override // kotlin.a4
    public final float a() {
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        v0.f91598a.getClass();
        return this.f91582a.getScaledHandwritingGestureLineMargin();
    }

    @Override // kotlin.a4
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // kotlin.a4
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // kotlin.a4
    public final float d() {
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        v0.f91598a.getClass();
        return this.f91582a.getScaledHandwritingSlop();
    }

    @Override // kotlin.a4
    public final float e() {
        return this.f91582a.getScaledTouchSlop();
    }

    @Override // kotlin.a4
    public final float f() {
        return this.f91582a.getScaledMinimumFlingVelocity();
    }

    @Override // kotlin.a4
    public final float h() {
        return this.f91582a.getScaledMaximumFlingVelocity();
    }
}

package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q82 extends c10 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31214a;

        static {
            int[] iArr = new int[fc1.values().length];
            f31214a = iArr;
            try {
                iArr[fc1.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31214a[fc1.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31214a[fc1.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31214a[fc1.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // defpackage.c10
    public Animation b(View view, int i, int i2, int i3, int i4) {
        fc1 fc1Var = this.c;
        if (fc1Var == null) {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
        int i5 = a.f31214a[fc1Var.ordinal()];
        if (i5 == 1) {
            return new vah(view, g() ? view.getAlpha() : 0.0f, g() ? 0.0f : view.getAlpha());
        }
        if (i5 == 2) {
            float f = g() ? 1.0f : 0.0f;
            float f2 = g() ? 0.0f : 1.0f;
            return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        }
        if (i5 == 3) {
            return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i5 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new IllegalViewOperationException("Missing animation for property : " + this.c);
    }

    @Override // defpackage.c10
    public boolean e() {
        return this.d > 0 && this.c != null;
    }

    public abstract boolean g();
}

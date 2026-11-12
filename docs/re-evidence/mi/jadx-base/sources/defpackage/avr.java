package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class avr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f3498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3499b = 0;
    public FrameLayout.LayoutParams c;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            avr.this.e();
        }
    }

    public avr(Activity activity) {
        FrameLayout frameLayout;
        this.f3498a = null;
        this.c = null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || (frameLayout = (FrameLayout) activity.findViewById(R.id.content)) == null) {
            return;
        }
        View childAt = frameLayout.getChildAt(0);
        this.f3498a = childAt;
        if (childAt != null) {
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new a());
            this.c = (FrameLayout.LayoutParams) this.f3498a.getLayoutParams();
        }
    }

    public static void b(Activity activity) {
        new avr(activity);
    }

    public final int c() {
        Rect rect = new Rect();
        View view = this.f3498a;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        return rect.bottom - rect.top;
    }

    public final boolean d(View view) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z = false;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            z = z || d(childAt);
        }
        return z;
    }

    public final void e() {
        int iC;
        if (d(this.f3498a) && (iC = c()) != this.f3499b) {
            int height = this.f3498a.getRootView().getHeight();
            int i = height - iC;
            if (i > height / 4) {
                this.c.height = height - i;
            } else {
                this.c.height = -1;
            }
            this.f3498a.requestLayout();
            this.f3499b = iC;
        }
    }
}

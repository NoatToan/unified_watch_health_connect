package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes4.dex */
public class bdj extends DrawerLayout {
    public int Q;
    public int R;

    public bdj(ReactContext reactContext) {
        super(reactContext);
        this.Q = 8388611;
        this.R = -1;
    }

    public void W() {
        d(this.Q);
    }

    public void X() {
        I(this.Q);
    }

    public void Y(int i) {
        this.Q = i;
        Z();
    }

    public void Z() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.f2270a = this.Q;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = this.R;
            childAt.setLayoutParams(layoutParams);
            childAt.setClickable(true);
        }
    }

    public void a0(int i) {
        this.R = i;
        Z();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            phg.a(this, motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}

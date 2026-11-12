package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes42.dex */
public class plm implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45607c;
    private int d;
    private HealthScrollView e;

    public plm(HealthScrollView healthScrollView, int i, int i2) {
        this.e = healthScrollView;
        this.f45606b = i;
        this.d = i2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e.requestDisallowInterceptTouchEvent(true);
            this.f45607c = (int) motionEvent.getRawX();
            this.f45605a = (int) motionEvent.getRawY();
        } else if (action == 1) {
            b(view);
        } else if (action == 2) {
            this.e.requestDisallowInterceptTouchEvent(true);
            int rawX = ((int) motionEvent.getRawX()) - this.f45607c;
            int rawY = ((int) motionEvent.getRawY()) - this.f45605a;
            int left = view.getLeft() + rawX;
            int top = view.getTop() + rawY;
            int right = view.getRight() + rawX;
            int bottom = view.getBottom() + rawY;
            if (left < 0) {
                right = view.getWidth();
                left = 0;
            }
            int i = this.f45606b;
            if (right > i) {
                left = i - view.getWidth();
                right = i;
            }
            if (top < 0) {
                bottom = view.getHeight();
                top = 0;
            }
            int i2 = this.d;
            if (bottom > i2) {
                top = i2 - view.getHeight();
                bottom = i2;
            }
            view.layout(left, top, right, bottom);
            this.f45607c = (int) motionEvent.getRawX();
            this.f45605a = (int) motionEvent.getRawY();
        }
        return true;
    }

    private void b(View view) {
        this.e.requestDisallowInterceptTouchEvent(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            layoutParams.setMargins(0, view.getTop(), (this.f45606b - view.getWidth()) - view.getLeft(), 0);
        } else {
            layoutParams.setMargins(view.getLeft(), view.getTop(), 0, 0);
        }
        view.setLayoutParams(layoutParams);
    }
}

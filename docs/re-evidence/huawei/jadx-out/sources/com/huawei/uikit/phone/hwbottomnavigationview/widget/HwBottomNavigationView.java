package com.huawei.uikit.phone.hwbottomnavigationview.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.phone.hwbottomnavigationview.R;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwKeyEventDetector;
import defpackage.xfu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HwBottomNavigationView extends com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView {
    private int aa;
    private boolean ab;
    private com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView ac;
    private int ad;
    private PopupWindow o;
    private View p;
    private int q;
    private ImageView r;
    private TextView s;
    private View t;
    private List<Rect> u;
    private int v;
    private int w;
    private int x;
    private Rect y;
    private Drawable[] z;

    class b implements ViewTreeObserver.OnPreDrawListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            HwBottomNavigationView.this.p.getViewTreeObserver().removeOnPreDrawListener(this);
            HwBottomNavigationView.this.o.dismiss();
            if (Float.compare(xfu.d(HwBottomNavigationView.this.f29263c), 3.2f) >= 0) {
                HwBottomNavigationView hwBottomNavigationView = HwBottomNavigationView.this;
                hwBottomNavigationView.setPopupHeight(hwBottomNavigationView.q);
            } else {
                HwBottomNavigationView hwBottomNavigationView2 = HwBottomNavigationView.this;
                hwBottomNavigationView2.setPopupHeight(hwBottomNavigationView2.v);
            }
            HwBottomNavigationView.this.o.showAtLocation(HwBottomNavigationView.this.getRootView(), 17, 0, 0);
            return true;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwBottomNavigationView.this.y = new Rect(HwBottomNavigationView.this.getLeft(), HwBottomNavigationView.this.getTop(), HwBottomNavigationView.this.getRight(), HwBottomNavigationView.this.getBottom());
            int childCount = HwBottomNavigationView.this.getChildCount();
            HwBottomNavigationView.this.u.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = HwBottomNavigationView.this.getChildAt(i);
                HwBottomNavigationView.this.u.add(new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
            HwBottomNavigationView.this.x = -1;
            HwBottomNavigationView.this.ad = -1;
        }
    }

    public HwBottomNavigationView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupHeight(int i) {
        this.o.setHeight(Math.max(this.p.getHeight(), i));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (Float.compare(xfu.d(this.f29263c), 1.75f) == -1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            setLongClickEnable(false);
            if (this.o != null && this.ac != null) {
                n();
            }
        } else if (action == 2) {
            if (this.u == null || !getLongClickEnable()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = 0; i < this.u.size(); i++) {
                if (this.u.get(i).contains((int) x, (int) y)) {
                    this.x = i;
                }
                g();
                int i2 = this.x;
                if (i2 != -1 && this.ad != i2) {
                    View childAt = getChildAt(i2);
                    if (!(childAt instanceof com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    d(childAt);
                }
            }
            a(x, y);
        } else if (action == 3) {
            setLongClickEnable(false);
            if (this.o != null) {
                n();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable[] getPopupIconSet() {
        return this.z;
    }

    public boolean j() {
        return this.ab;
    }

    @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
    }

    @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h();
    }

    public void setPopupIconSet(Drawable[] drawableArr) {
        this.z = drawableArr;
    }

    public void setTintPopupEnable(boolean z) {
        this.ab = z;
    }

    public HwBottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwBottomNavigationViewStyle);
    }

    private void g() {
        int i;
        com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView;
        int i2 = this.x;
        if (i2 == -1 || (i = this.ad) == -1 || i2 != i || this.o != null || (bottomNavigationItemView = this.ac) == null) {
            return;
        }
        bottomNavigationItemView.setPressed(true);
        i();
    }

    private void k() {
        if (!xfu.e(this.f29263c) || xfu.a(this.f29263c)) {
            this.s.setSingleLine();
        } else {
            this.s.setMaxLines(4);
        }
        this.p.getViewTreeObserver().addOnPreDrawListener(new b());
    }

    private void n() {
        this.ac.setPressed(false);
        this.ac.performClick();
        this.o.dismiss();
        this.o = null;
        this.s = null;
        this.r = null;
        this.p = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HwKeyEventDetector c() {
        return new HwKeyEventDetector(getContext());
    }

    public HwBottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = -1;
        this.ad = -1;
        f();
    }

    private void h() {
        post(new d());
    }

    private void i() {
        Drawable originalDrawable;
        Drawable.ConstantState constantState;
        Drawable[] popupIconSet = getPopupIconSet();
        if (popupIconSet == null) {
            originalDrawable = this.ac.getOriginalDrawable();
        } else {
            int length = popupIconSet.length;
            int i = this.x;
            if (i <= -1 || i >= length || (originalDrawable = popupIconSet[i]) == null) {
                originalDrawable = this.ac.getOriginalDrawable();
            }
        }
        if (originalDrawable == null || (constantState = originalDrawable.getConstantState()) == null) {
            return;
        }
        Drawable drawableNewDrawable = constantState.newDrawable();
        if (this.ac.isEnabled()) {
            com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView = this.ac;
            d(bottomNavigationItemView, bottomNavigationItemView.getContent().getText().toString(), drawableNewDrawable);
        }
    }

    private void f() {
        this.v = getResources().getDimensionPixelSize(R.dimen.auxiliary_height_normal);
        this.q = getResources().getDimensionPixelSize(R.dimen.auxiliary_height_large);
        this.aa = ContextCompat.getColor(this.f29263c, R.color.emui_primary_inverse);
        this.ab = true;
        this.u = new ArrayList();
        h();
    }

    private void d(View view) {
        com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView = this.ac;
        if (bottomNavigationItemView != null) {
            bottomNavigationItemView.setPressed(false);
            PopupWindow popupWindow = this.o;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.o = null;
            }
        }
        com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView2 = (com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView) view;
        this.ac = bottomNavigationItemView2;
        if (this.o == null) {
            bottomNavigationItemView2.setPressed(true);
            i();
            this.ad = this.x;
        }
    }

    private void a(float f, float f2) {
        if (xfu.c(this.y, f, f2)) {
            return;
        }
        setLongClickEnable(false);
        com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView = this.ac;
        if (bottomNavigationItemView != null) {
            bottomNavigationItemView.setPressed(false);
        }
        PopupWindow popupWindow = this.o;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.o = null;
            this.s = null;
            this.r = null;
            this.p = null;
        }
    }

    private void d(com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView, String str, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (Float.compare(xfu.d(this.f29263c), 3.2f) >= 0) {
            this.w = this.q;
        } else {
            this.w = this.v;
        }
        if (this.o == null) {
            View viewInflate = LayoutInflater.from(this.f29263c).inflate(R.layout.hwbottomnavigationview_auxiliary_popup_layout, (ViewGroup) null, false);
            this.t = viewInflate;
            this.s = (TextView) viewInflate.findViewById(R.id.popup_window_text_view);
            this.r = (ImageView) this.t.findViewById(R.id.popup_window_image_view);
            this.p = this.t.findViewById(R.id.popup_window_content);
            if (this.r != null && this.s != null) {
                a(drawable);
                if (str != null) {
                    b(bottomNavigationItemView, str);
                }
            }
            this.o = new PopupWindow(this.t, this.w, -2);
            k();
            this.o.showAtLocation(getRootView(), 17, 0, 0);
        }
    }

    private void a(Drawable drawable) {
        if (j()) {
            drawable.setTint(this.aa);
        }
        this.r.setImageDrawable(drawable);
    }

    private void b(com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView, String str) {
        if (bottomNavigationItemView.e()) {
            this.s.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(15);
                this.p.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        this.s.setText(str);
        this.s.setVisibility(0);
    }
}

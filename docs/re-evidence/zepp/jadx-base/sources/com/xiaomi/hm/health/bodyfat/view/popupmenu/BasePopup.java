package com.xiaomi.hm.health.bodyfat.view.popupmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.core.widget.PopupWindowCompat;
import com.xiaomi.hm.health.bodyfat.view.popupmenu.BasePopup;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BasePopup<T extends BasePopup> implements PopupWindow.OnDismissListener {
    private static final String C = "EasyPopup";
    private static final float D = 0.7f;
    private OnRealWHAlreadyListener B;
    private PopupWindow a;
    private Context b;
    private View c;
    private int d;
    private int i;
    private PopupWindow.OnDismissListener j;
    private boolean k;

    @NonNull
    private ViewGroup n;
    private Transition o;
    private Transition p;
    private View r;
    private int u;
    private int v;
    private boolean e = true;
    private boolean f = true;
    private int g = -2;
    private int h = -2;
    private float l = 0.7f;

    @ColorInt
    private int m = -16777216;
    private boolean q = true;
    private int s = 2;
    private int t = 1;
    private int w = 0;
    private int x = 1;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;

    public interface OnRealWHAlreadyListener {
        void onRealWHAlready(BasePopup basePopup, int i, int i2, int i3, int i4);
    }

    public class a implements View.OnKeyListener {
        public a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            BasePopup.this.a.dismiss();
            return true;
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0 && (x < 0 || x >= BasePopup.this.g || y < 0 || y >= BasePopup.this.h)) {
                Log.d(BasePopup.C, "onTouch outside:mWidth=" + BasePopup.this.g + ",mHeight=" + BasePopup.this.h);
                return true;
            }
            if (motionEvent.getAction() != 4) {
                return false;
            }
            Log.d(BasePopup.C, "onTouch outside event:mWidth=" + BasePopup.this.g + ",mHeight=" + BasePopup.this.h);
            return true;
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BasePopup.this.getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePopup basePopup = BasePopup.this;
            basePopup.g = basePopup.getContentView().getWidth();
            BasePopup basePopup2 = BasePopup.this;
            basePopup2.h = basePopup2.getContentView().getHeight();
            BasePopup.this.z = true;
            BasePopup.this.y = false;
            if (BasePopup.this.B != null) {
                OnRealWHAlreadyListener onRealWHAlreadyListener = BasePopup.this.B;
                BasePopup basePopup3 = BasePopup.this;
                onRealWHAlreadyListener.onRealWHAlready(basePopup3, basePopup3.g, BasePopup.this.h, BasePopup.this.r == null ? 0 : BasePopup.this.r.getWidth(), BasePopup.this.r == null ? 0 : BasePopup.this.r.getHeight());
            }
            if (BasePopup.this.isShowing() && BasePopup.this.A) {
                BasePopup basePopup4 = BasePopup.this;
                basePopup4.D(basePopup4.g, BasePopup.this.h, BasePopup.this.r, BasePopup.this.s, BasePopup.this.t, BasePopup.this.u, BasePopup.this.v);
            }
        }
    }

    private void A() {
        if (this.q) {
            this.a.setFocusable(this.e);
            this.a.setOutsideTouchable(this.f);
            this.a.setBackgroundDrawable(new ColorDrawable(0));
            return;
        }
        this.a.setFocusable(true);
        this.a.setOutsideTouchable(false);
        this.a.setBackgroundDrawable(null);
        this.a.getContentView().setFocusable(true);
        this.a.getContentView().setFocusableInTouchMode(true);
        this.a.getContentView().setOnKeyListener(new a());
        this.a.setTouchInterceptor(new b());
    }

    private void B() {
        View contentView = getContentView();
        if (this.g <= 0 || this.h <= 0) {
            contentView.measure(0, 0);
            if (this.g <= 0) {
                this.g = contentView.getMeasuredWidth();
            }
            if (this.h <= 0) {
                this.h = contentView.getMeasuredHeight();
            }
        }
    }

    private void C() {
        getContentView().getViewTreeObserver().addOnGlobalLayoutListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i, int i2, @NonNull View view, int i3, int i4, int i5, int i6) {
        if (this.a == null) {
            return;
        }
        this.a.update(view, r(view, i4, i, i5), s(view, i3, i2, i6), i, i2);
    }

    @RequiresApi(api = 18)
    private void p(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.m);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.l * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    @RequiresApi(api = 18)
    private void q(ViewGroup viewGroup) {
        ColorDrawable colorDrawable = new ColorDrawable(this.m);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.l * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    private int r(View view, int i, int i2, int i3) {
        int width;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    width = view.getWidth();
                } else {
                    if (i != 4) {
                        return i3;
                    }
                    i2 -= view.getWidth();
                }
            }
            return i3 - i2;
        }
        width = (view.getWidth() / 2) - (i2 / 2);
        return i3 + width;
    }

    private int s(View view, int i, int i2, int i3) {
        int height;
        if (i != 0) {
            if (i == 1) {
                i2 += view.getHeight();
            } else if (i == 3) {
                height = view.getHeight();
            } else if (i != 4) {
                return i3;
            }
            return i3 - i2;
        }
        height = (view.getHeight() / 2) + (i2 / 2);
        return i3 - height;
    }

    private void t(boolean z) {
        if (this.A != z) {
            this.A = z;
        }
        if (this.a == null) {
            apply();
        }
    }

    private void u() {
        Activity activity;
        if (Build.VERSION.SDK_INT < 18 || !this.k) {
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            w(viewGroup);
        } else {
            if (getContentView() == null || (activity = (Activity) getContentView().getContext()) == null) {
                return;
            }
            v(activity);
        }
    }

    @RequiresApi(api = 18)
    private void v(Activity activity) {
        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
    }

    @RequiresApi(api = 18)
    private void w(ViewGroup viewGroup) {
        viewGroup.getOverlay().clear();
    }

    private void x() {
        if (Build.VERSION.SDK_INT < 18 || !this.k) {
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            q(viewGroup);
        } else {
            if (getContentView() == null || getContentView().getContext() == null || !(getContentView().getContext() instanceof Activity)) {
                return;
            }
            p((Activity) getContentView().getContext());
        }
    }

    private void y() {
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        u();
        PopupWindow popupWindow = this.a;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.a.dismiss();
        }
        onPopupWindowDismiss();
    }

    private void z() {
        Context context;
        if (this.c == null) {
            if (this.d == 0 || (context = this.b) == null) {
                throw new IllegalArgumentException("The content view is null,the layoutId=" + this.d + ",context=" + this.b);
            }
            this.c = LayoutInflater.from(context).inflate(this.d, (ViewGroup) null);
        }
        this.a.setContentView(this.c);
        int i = this.g;
        if (i > 0 || i == -2 || i == -1) {
            this.a.setWidth(i);
        } else {
            this.a.setWidth(-2);
        }
        int i2 = this.h;
        if (i2 > 0 || i2 == -2 || i2 == -1) {
            this.a.setHeight(i2);
        } else {
            this.a.setHeight(-2);
        }
        B();
        C();
        this.a.setInputMethodMode(this.w);
        this.a.setSoftInputMode(this.x);
    }

    public T apply() {
        if (this.a == null) {
            this.a = new PopupWindow();
        }
        onPopupWindowCreated();
        z();
        onPopupWindowViewCreated(this.c);
        int i = this.i;
        if (i != 0) {
            this.a.setAnimationStyle(i);
        }
        A();
        this.a.setOnDismissListener(this);
        if (Build.VERSION.SDK_INT >= 23) {
            Transition transition = this.o;
            if (transition != null) {
                this.a.setEnterTransition(transition);
            }
            Transition transition2 = this.p;
            if (transition2 != null) {
                this.a.setExitTransition(transition2);
            }
        }
        return (T) self();
    }

    public void dismiss() {
        PopupWindow popupWindow = this.a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
    public View findViewById(@IdRes int i) {
        if (getContentView() != null) {
            return getContentView().findViewById(i);
        }
        return null;
    }

    public View getContentView() {
        PopupWindow popupWindow = this.a;
        if (popupWindow != null) {
            return popupWindow.getContentView();
        }
        return null;
    }

    public int getHeight() {
        return this.h;
    }

    public int getOffsetX() {
        return this.u;
    }

    public int getOffsetY() {
        return this.v;
    }

    public PopupWindow getPopupWindow() {
        return this.a;
    }

    public int getWidth() {
        return this.g;
    }

    public int getXGravity() {
        return this.t;
    }

    public int getYGravity() {
        return this.s;
    }

    public abstract void initAttributes();

    public abstract void initViews(View view, T t);

    public boolean isRealWHAlready() {
        return this.z;
    }

    public boolean isShowing() {
        PopupWindow popupWindow = this.a;
        return popupWindow != null && popupWindow.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        y();
    }

    public void onPopupWindowCreated() {
        initAttributes();
    }

    public void onPopupWindowDismiss() {
    }

    public void onPopupWindowViewCreated(View view) {
        initViews(view, self());
    }

    public T self() {
        return this;
    }

    public T setAnchorView(View view) {
        this.r = view;
        return (T) self();
    }

    public T setAnimationStyle(@StyleRes int i) {
        this.i = i;
        return (T) self();
    }

    public T setBackgroundDimEnable(boolean z) {
        this.k = z;
        return (T) self();
    }

    public T setContentView(View view) {
        this.c = view;
        this.d = 0;
        return (T) self();
    }

    public T setContext(Context context) {
        this.b = context;
        return (T) self();
    }

    public T setDimColor(@ColorInt int i) {
        this.m = i;
        return (T) self();
    }

    public T setDimValue(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.l = f;
        return (T) self();
    }

    public T setDimView(@NonNull ViewGroup viewGroup) {
        this.n = viewGroup;
        return (T) self();
    }

    @RequiresApi(api = 23)
    public T setEnterTransition(Transition transition) {
        this.o = transition;
        return (T) self();
    }

    @RequiresApi(api = 23)
    public T setExitTransition(Transition transition) {
        this.p = transition;
        return (T) self();
    }

    public T setFocusAndOutsideEnable(boolean z) {
        this.q = z;
        return (T) self();
    }

    public T setFocusable(boolean z) {
        this.e = z;
        return (T) self();
    }

    public T setHeight(int i) {
        this.h = i;
        return (T) self();
    }

    public T setInputMethodMode(int i) {
        this.w = i;
        return (T) self();
    }

    public T setNeedReMeasureWH(boolean z) {
        this.y = z;
        return (T) self();
    }

    public T setOffsetX(int i) {
        this.u = i;
        return (T) self();
    }

    public T setOffsetY(int i) {
        this.v = i;
        return (T) self();
    }

    public T setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.j = onDismissListener;
        return (T) self();
    }

    public T setOnRealWHAlreadyListener(OnRealWHAlreadyListener onRealWHAlreadyListener) {
        this.B = onRealWHAlreadyListener;
        return (T) self();
    }

    public T setOutsideTouchable(boolean z) {
        this.f = z;
        return (T) self();
    }

    public T setSoftInputMode(int i) {
        this.x = i;
        return (T) self();
    }

    public T setWidth(int i) {
        this.g = i;
        return (T) self();
    }

    public T setXGravity(int i) {
        this.t = i;
        return (T) self();
    }

    public T setYGravity(int i) {
        this.s = i;
        return (T) self();
    }

    public void showAsDropDown() {
        View view = this.r;
        if (view == null) {
            return;
        }
        showAsDropDown(view, this.u, this.v);
    }

    public void showAtAnchorView() {
        View view = this.r;
        if (view == null) {
            return;
        }
        showAtAnchorView(view, this.s, this.t);
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        t(false);
        x();
        this.r = view;
        this.u = i2;
        this.v = i3;
        if (this.y) {
            C();
        }
        this.a.showAtLocation(view, i, this.u, this.v);
    }

    public void showAsDropDown(View view, int i, int i2) {
        t(false);
        x();
        this.r = view;
        this.u = i;
        this.v = i2;
        if (this.y) {
            C();
        }
        this.a.showAsDropDown(view, this.u, this.v);
    }

    public void showAtAnchorView(@NonNull View view, int i, int i2) {
        showAtAnchorView(view, i, i2, 0, 0);
    }

    public T setContentView(@LayoutRes int i) {
        this.c = null;
        this.d = i;
        return (T) self();
    }

    public void showAtAnchorView(@NonNull View view, int i, int i2, int i3, int i4) {
        t(true);
        this.r = view;
        this.u = i3;
        this.v = i4;
        this.s = i;
        this.t = i2;
        x();
        int iR = r(view, i2, this.g, this.u);
        int iS = s(view, i, this.h, this.v);
        if (this.y) {
            C();
        }
        PopupWindowCompat.showAsDropDown(this.a, view, iR, iS, 0);
    }

    public T setContentView(Context context, @LayoutRes int i) {
        this.b = context;
        this.c = null;
        this.d = i;
        return (T) self();
    }

    public T setContentView(View view, int i, int i2) {
        this.c = view;
        this.d = 0;
        this.g = i;
        this.h = i2;
        return (T) self();
    }

    public void showAsDropDown(View view) {
        t(false);
        x();
        this.r = view;
        if (this.y) {
            C();
        }
        this.a.showAsDropDown(view);
    }

    public T setContentView(@LayoutRes int i, int i2, int i3) {
        this.c = null;
        this.d = i;
        this.g = i2;
        this.h = i3;
        return (T) self();
    }

    @RequiresApi(api = 19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        t(false);
        x();
        this.r = view;
        this.u = i;
        this.v = i2;
        if (this.y) {
            C();
        }
        PopupWindowCompat.showAsDropDown(this.a, view, this.u, this.v, i3);
    }

    public T setContentView(Context context, @LayoutRes int i, int i2, int i3) {
        this.b = context;
        this.c = null;
        this.d = i;
        this.g = i2;
        this.h = i3;
        return (T) self();
    }
}

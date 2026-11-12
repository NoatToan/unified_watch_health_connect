package miuix.popupwidget.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;
import defpackage.fwi;
import defpackage.hmi;
import miuix.popupwidget.internal.widget.ArrowPopupView;

/* JADX INFO: loaded from: classes3.dex */
public class ArrowPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrowPopupView f26773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f26774b;
    public int c;
    public boolean d;
    public int e;
    public int f;

    public ArrowPopupWindow(Context context) {
        this(context, null);
    }

    public void a(boolean z) {
        if (z) {
            this.f26773a.u();
        } else {
            dismiss();
        }
    }

    public int b() {
        return this.f26773a.getArrowMode();
    }

    public boolean c() {
        return this.d;
    }

    public int d() {
        View contentView = getContentView();
        if (contentView != null) {
            return contentView.getHeight();
        }
        return 0;
    }

    public int e() {
        View contentView = getContentView();
        if (contentView != null) {
            return contentView.getWidth();
        }
        return 0;
    }

    public Context f() {
        return this.f26774b;
    }

    public View.OnTouchListener g() {
        return this.f26773a;
    }

    @Override // android.widget.PopupWindow
    public View getContentView() {
        return this.f26773a.getContentView();
    }

    @Override // android.widget.PopupWindow
    public int getHeight() {
        return d();
    }

    @Override // android.widget.PopupWindow
    public int getWidth() {
        return e();
    }

    public LayoutInflater h() {
        return LayoutInflater.from(this.f26774b);
    }

    public int i(int i, int i2) {
        int iB = b();
        switch (iB) {
            case 8:
            case 9:
            case 10:
                break;
            default:
                switch (iB) {
                    case 16:
                    case 17:
                    case 18:
                        i = i2;
                        break;
                    default:
                        i = Math.max(i, i2);
                        break;
                }
                break;
        }
        this.f = i;
        return i;
    }

    public void j() {
    }

    public void k(int i) {
        this.f26773a.setArrowMode(i);
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(int i) {
        int i2;
        if (i == this.f) {
            i -= this.f26773a.getContentFrameWrapperBottomPadding() + this.f26773a.getContentFrameWrapperTopPadding();
        }
        if (!this.f26773a.H()) {
            i -= this.f26773a.getTitleHeight();
        }
        View contentView = getContentView();
        if ((contentView instanceof ListView) && i > (i2 = this.c)) {
            i = i2;
        }
        if (contentView != null) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            layoutParams.height = i;
            contentView.setLayoutParams(layoutParams);
        }
    }

    public final void n(View view, ViewGroup.LayoutParams layoutParams) {
        this.f26773a.K(view, layoutParams);
    }

    public void o(int i) {
        View contentView = getContentView();
        if (contentView != null) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            layoutParams.width = i;
            contentView.setLayoutParams(layoutParams);
        }
    }

    public void p(int i) {
        super.setHeight(i);
    }

    public void q(int i) {
        super.setWidth(i);
    }

    public final void r() {
        this.c = this.f26774b.getResources().getDimensionPixelOffset(hmi.f);
        ArrowPopupView arrowPopupView = (ArrowPopupView) h().inflate(fwi.f18318a, (ViewGroup) null, false);
        this.f26773a = arrowPopupView;
        super.setContentView(arrowPopupView);
        super.setWidth(-1);
        super.setHeight(-1);
        setSoftInputMode(3);
        this.f26773a.setArrowPopupWindow(this);
        super.setTouchInterceptor(g());
        this.f26773a.q();
        j();
        update();
    }

    public void s(View view, int i, int i2) {
        this.f26773a.setAnchor(view);
        this.f26773a.L(i, i2);
        showAtLocation(view, 8388659, 0, 0);
        this.f26773a.setAutoDismiss(this.d);
        this.f26773a.v();
    }

    @Override // android.widget.PopupWindow
    public final void setContentView(View view) {
        this.f26773a.setContentView(view);
    }

    @Override // android.widget.PopupWindow
    public void setHeight(int i) {
        m(i);
    }

    @Override // android.widget.PopupWindow
    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f26773a.setTouchInterceptor(onTouchListener);
    }

    @Override // android.widget.PopupWindow
    public void setWidth(int i) {
        o(i);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        s(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2, int i3, int i4, boolean z) {
        super.update(0, 0, -2, -2, z);
        m(i4);
    }

    public ArrowPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        s(view, i, i2);
    }

    public ArrowPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ArrowPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = 2;
        this.f26774b = context;
        this.d = true;
        r();
        this.f26773a.setLayoutRtlMode(this.e);
    }
}

package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public interface b {
        void a();
    }

    @Deprecated
    public interface c {
        void m2(int i14);
    }

    @Deprecated
    public static abstract class d {
        public abstract int a();

        public abstract void b();
    }

    @Deprecated
    public abstract void A(int i14);

    public void B(boolean z14) {
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence) {
    }

    public abstract void E();

    public m.b F(f.e eVar) {
        return null;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z14) {
    }

    public abstract int d();

    public Context e() {
        return null;
    }

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract boolean i();

    public void j() {
    }

    public void k() {
    }

    public boolean l(int i14, KeyEvent keyEvent) {
        return false;
    }

    public boolean m(KeyEvent keyEvent) {
        return false;
    }

    public boolean n() {
        return false;
    }

    public abstract void o(ColorDrawable colorDrawable);

    public void p(boolean z14) {
    }

    public abstract void q(boolean z14);

    public abstract void r(int i14);

    public abstract void s(boolean z14);

    public void t() {
    }

    public void u(int i14) {
    }

    public void v(int i14) {
    }

    public void w(Drawable drawable) {
    }

    public void x(boolean z14) {
    }

    @Deprecated
    public abstract void y(SpinnerAdapter spinnerAdapter, ConnectIQAppStoreActivity connectIQAppStoreActivity);

    @Deprecated
    public abstract void z();

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    public static class C1716a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86545a;

        public C1716a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f86545a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f80422b);
            this.f86545a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C1716a(int i14, int i15) {
            super(i14, i15);
            this.f86545a = 8388627;
        }

        public C1716a(int i14, int i15, int i16) {
            super(i14, i15);
            this.f86545a = i16;
        }

        public C1716a(int i14) {
            this(-2, -1, i14);
        }

        public C1716a(C1716a c1716a) {
            super((ViewGroup.MarginLayoutParams) c1716a);
            this.f86545a = 0;
            this.f86545a = c1716a.f86545a;
        }

        public C1716a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f86545a = 0;
        }
    }
}

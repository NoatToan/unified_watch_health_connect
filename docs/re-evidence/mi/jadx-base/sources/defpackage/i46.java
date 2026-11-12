package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.ImageViewBindingAdapter;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;

/* JADX INFO: loaded from: classes8.dex */
public class i46 extends h46 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N = null;
    public final LinearLayout H;
    public final TextView I;
    public final TextView J;
    public a K;
    public long L;

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnClickListener f20765a;

        public a a(View.OnClickListener onClickListener) {
            this.f20765a = onClickListener;
            if (onClickListener == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20765a.onClick(view);
        }
    }

    public i46(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[4], (ImageView) objArr[5], (ConstraintLayout) objArr[1], (ImageView) objArr[2]);
        this.L = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.I = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.J = textView2;
        textView2.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.h46
    public void C0(DeviceInfo deviceInfo) {
        this.F = deviceInfo;
        synchronized (this) {
            this.L |= 4;
        }
        notifyPropertyChanged(zv1.f41706b);
        super.e0();
    }

    @Override // defpackage.h46
    public void D0(DeviceInfo deviceInfo) {
        this.E = deviceInfo;
        synchronized (this) {
            this.L |= 2;
        }
        notifyPropertyChanged(zv1.c);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        a aVarA;
        Drawable drawableB;
        String name;
        Drawable drawableB2;
        boolean zIsWatch;
        Context context;
        int i;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        View.OnClickListener onClickListener = this.G;
        DeviceInfo deviceInfo = this.E;
        DeviceInfo deviceInfo2 = this.F;
        String name2 = null;
        if ((j & 9) == 0 || onClickListener == null) {
            aVarA = null;
        } else {
            a aVar = this.K;
            if (aVar == null) {
                aVar = new a();
                this.K = aVar;
            }
            aVarA = aVar.a(onClickListener);
        }
        long j2 = j & 10;
        boolean zIsWatch2 = false;
        if (j2 != 0) {
            if (deviceInfo != null) {
                name = deviceInfo.getName();
                zIsWatch = deviceInfo.isWatch();
            } else {
                name = null;
                zIsWatch = false;
            }
            if (j2 != 0) {
                j |= zIsWatch ? 128L : 64L;
            }
            if (zIsWatch) {
                context = this.D.getContext();
                i = hni.B;
            } else {
                context = this.D.getContext();
                i = hni.e;
            }
            drawableB = of1.b(context, i);
        } else {
            drawableB = null;
            name = null;
        }
        long j3 = j & 12;
        if (j3 != 0) {
            if (deviceInfo2 != null) {
                zIsWatch2 = deviceInfo2.isWatch();
                name2 = deviceInfo2.getName();
            }
            if (j3 != 0) {
                j |= zIsWatch2 ? 32L : 16L;
            }
            drawableB2 = of1.b(this.B.getContext(), zIsWatch2 ? hni.B : hni.e);
        } else {
            drawableB2 = null;
        }
        if ((10 & j) != 0) {
            r8p.b(this.I, name);
            ImageViewBindingAdapter.setIcon(this.D, drawableB);
        }
        if ((j & 12) != 0) {
            r8p.b(this.J, name2);
            ImageViewBindingAdapter.setIcon(this.B, drawableB2);
        }
        if ((j & 9) != 0) {
            this.A.setOnClickListener(aVarA);
            this.C.setOnClickListener(aVarA);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.h == i) {
            setListener((View.OnClickListener) obj);
        } else if (zv1.c == i) {
            D0((DeviceInfo) obj);
        } else {
            if (zv1.f41706b != i) {
                return false;
            }
            C0((DeviceInfo) obj);
        }
        return true;
    }

    @Override // defpackage.h46
    public void setListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        synchronized (this) {
            this.L |= 1;
        }
        notifyPropertyChanged(zv1.h);
        super.e0();
    }

    public i46(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, M, N));
    }
}

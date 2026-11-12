package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h46 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final ConstraintLayout C;
    public final ImageView D;
    public DeviceInfo E;
    public DeviceInfo F;
    public View.OnClickListener G;

    public h46(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = constraintLayout2;
        this.D = imageView2;
    }

    public static h46 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static h46 B0(LayoutInflater layoutInflater, Object obj) {
        return (h46) ViewDataBinding.G(layoutInflater, dui.o, null, false, obj);
    }

    public abstract void C0(DeviceInfo deviceInfo);

    public abstract void D0(DeviceInfo deviceInfo);

    public abstract void setListener(View.OnClickListener onClickListener);
}

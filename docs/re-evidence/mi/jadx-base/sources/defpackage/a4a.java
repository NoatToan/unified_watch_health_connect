package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.calendar.view.DataTitleBarView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a4a extends ViewDataBinding {
    public final FrameLayout A;
    public final DataTitleBarView B;

    public a4a(Object obj, View view, int i, FrameLayout frameLayout, DataTitleBarView dataTitleBarView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = dataTitleBarView;
    }

    public static a4a A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static a4a B0(LayoutInflater layoutInflater, Object obj) {
        return (a4a) ViewDataBinding.G(layoutInflater, jui.G, null, false, obj);
    }
}

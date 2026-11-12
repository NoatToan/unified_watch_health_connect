package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h39 extends ViewDataBinding {
    public final ImageView A;
    public final ClearEditText B;
    public final TextView C;

    public h39(Object obj, View view, int i, ImageView imageView, ClearEditText clearEditText, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = clearEditText;
        this.C = textView;
    }

    public static h39 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static h39 B0(LayoutInflater layoutInflater, Object obj) {
        return (h39) ViewDataBinding.G(layoutInflater, ovi.U, null, false, obj);
    }
}

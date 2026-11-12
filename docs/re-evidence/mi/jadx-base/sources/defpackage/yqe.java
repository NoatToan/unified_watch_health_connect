package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.account.api.bean.CountryInfo;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yqe extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final LinearLayout C;
    public CountryInfo D;

    public yqe(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = linearLayout;
    }
}

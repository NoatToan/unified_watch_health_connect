package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l36 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public TabContentItem C;

    public l36(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
    }
}

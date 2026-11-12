package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h86 extends ViewDataBinding {
    public final TextView A;
    public TabContentItem B;

    public h86(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }
}

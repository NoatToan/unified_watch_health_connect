package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.history.DialogueInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xi9 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public DialogueInfo E;

    public xi9(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = view2;
    }
}

package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f9a extends ViewDataBinding {
    public final SwitchButtonBindingSingleLineTextView A;
    public final NestedScrollView B;

    public f9a(Object obj, View view, int i, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = switchButtonBindingSingleLineTextView;
        this.B = nestedScrollView;
    }
}

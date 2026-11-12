package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lng extends ViewDataBinding {
    public final RelativeLayout A;
    public final RecyclerView B;
    public final MarqueeTextView C;

    public lng(Object obj, View view, int i, RelativeLayout relativeLayout, RecyclerView recyclerView, MarqueeTextView marqueeTextView) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = recyclerView;
        this.C = marqueeTextView;
    }
}

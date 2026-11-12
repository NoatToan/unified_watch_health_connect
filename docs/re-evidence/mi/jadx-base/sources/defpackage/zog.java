package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.nfc.widget.CardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zog extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final CardImageView C;

    public zog(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, CardImageView cardImageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = cardImageView;
    }
}

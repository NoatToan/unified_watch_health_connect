package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryViewModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nl0 extends ViewDataBinding {
    public final RecyclerView A;
    public final ImageView B;
    public final TextView C;
    public FtpTestHistoryViewModel D;

    public nl0(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = imageView;
        this.C = textView;
    }
}

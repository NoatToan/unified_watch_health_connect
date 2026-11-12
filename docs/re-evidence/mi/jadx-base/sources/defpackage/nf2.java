package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;

/* JADX INFO: loaded from: classes9.dex */
public class nf2 extends RecyclerView.d0 {
    public View baseCharView;
    public View itemView;
    public OnLoadDataListener onLoadDataListener;

    public nf2(View view) {
        super(view);
        this.itemView = view;
    }

    public void setBaseCharView(View view) {
        this.baseCharView = view;
    }
}

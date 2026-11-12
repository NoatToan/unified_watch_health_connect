package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ehe<T> extends RecyclerView.Adapter<RecyclerView.d0> {
    protected List<T> mList;

    public ehe(List<T> list) {
        this.mList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.mList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}

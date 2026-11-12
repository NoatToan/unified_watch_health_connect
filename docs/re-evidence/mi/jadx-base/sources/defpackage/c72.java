package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.distribute.IDataAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c72 extends RecyclerView.Adapter<RecyclerView.d0> implements IDataAdapter {
    protected static final int ITEM_TYPE_CONTENT = 1;
    protected static final int ITEM_TYPE_FOOTER = 102;
    protected static final int ITEM_TYPE_HEADER = 101;
    public int mHeaderCount = 1;
    public int mFooterCount = 0;

    public abstract int getContentItemCount();

    public abstract List<uz6> getDataList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.mHeaderCount;
        if (i2 == 0 || i >= i2) {
            return (this.mFooterCount == 0 || i < i2 + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    @Override // com.xiaomi.fitness.widget.distribute.IDataAdapter
    public boolean isFooterView(int i) {
        int i2 = this.mFooterCount;
        return i2 != 0 && i < i2;
    }

    @Override // com.xiaomi.fitness.widget.distribute.IDataAdapter
    public boolean isHeaderView(int i) {
        int i2 = this.mHeaderCount;
        return i2 != 0 && i < i2;
    }

    public void setFooterViewCount(int i) {
        this.mFooterCount = i;
    }
}

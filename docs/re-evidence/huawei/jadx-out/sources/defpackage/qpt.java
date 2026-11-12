package defpackage;

import android.util.SparseArray;
import com.huawei.ui.commonui.tablewidget.ViewHolder;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes16.dex */
public class qpt {
    private SparseArray<Deque<ViewHolder>> e = new SparseArray<>(6);

    public void d(ViewHolder viewHolder) {
        Deque<ViewHolder> arrayDeque = this.e.get(viewHolder.getItemType());
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.e.put(viewHolder.getItemType(), arrayDeque);
        }
        arrayDeque.push(viewHolder);
    }

    public ViewHolder d(int i) {
        Deque<ViewHolder> deque = this.e.get(i);
        if (deque == null || deque.isEmpty()) {
            return null;
        }
        return deque.pop();
    }
}

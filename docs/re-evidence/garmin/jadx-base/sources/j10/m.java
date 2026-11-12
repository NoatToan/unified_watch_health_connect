package j10;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m<T> extends ArrayAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f96386a;

    public m(Context context, int i14) {
        super(context, i14);
        this.f96386a = new ArrayList();
    }

    public final void a(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        ArrayList arrayList = this.f96386a;
        if (arrayList.contains(numValueOf)) {
            arrayList.remove(Integer.valueOf(i14));
        } else {
            arrayList.add(Integer.valueOf(i14));
        }
        notifyDataSetChanged();
    }

    public final void c(List<Integer> list) {
        ArrayList arrayList = this.f96386a;
        arrayList.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        arrayList.addAll(list);
    }
}

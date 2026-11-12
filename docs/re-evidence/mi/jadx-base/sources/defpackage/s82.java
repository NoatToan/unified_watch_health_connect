package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s82<T> extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<T> f33391b = new ArrayList();

    public static class a<T extends View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f33392a;
    }

    public s82(Context context) {
        this.f33390a = context;
    }

    public abstract void a(View view, int i, T t);

    public abstract View b(Context context, T t, ViewGroup viewGroup);

    public void c(List<T> list) {
        if (list == null) {
            return;
        }
        this.f33391b.clear();
        this.f33391b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f33391b.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        return this.f33391b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T extends android.view.View, android.view.View] */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            aVar = new a();
            ?? B = b(this.f33390a, getItem(i), viewGroup);
            aVar.f33392a = B;
            B.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        a(aVar.f33392a, i, getItem(i));
        return aVar.f33392a;
    }
}

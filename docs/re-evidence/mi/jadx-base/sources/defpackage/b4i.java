package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class b4i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f3788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<MenuItem> f3789b;
    public Context c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f3790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f3791b;

        public b() {
        }
    }

    public b4i(Context context) {
        this(context, null);
    }

    public final void a(Menu menu, ArrayList<MenuItem> arrayList) {
        arrayList.clear();
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                if (b(item)) {
                    arrayList.add(item);
                }
            }
        }
    }

    public boolean b(MenuItem menuItem) {
        return menuItem.isVisible();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MenuItem getItem(int i) {
        return this.f3789b.get(i);
    }

    public void d(Menu menu) {
        a(menu, this.f3789b);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3789b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3788a.inflate(awi.G, viewGroup, false);
            b bVar = new b();
            bVar.f3790a = (ImageView) view.findViewById(R.id.icon);
            bVar.f3791b = (TextView) view.findViewById(R.id.text1);
            view.setTag(vsi.j0, bVar);
            bb1.b(view);
        }
        wzo.c(view, i, getCount());
        Object tag = view.getTag(vsi.j0);
        if (tag != null) {
            b bVar2 = (b) tag;
            MenuItem item = getItem(i);
            if (item.getIcon() != null) {
                bVar2.f3790a.setImageDrawable(item.getIcon());
                bVar2.f3790a.setVisibility(0);
            } else {
                bVar2.f3790a.setVisibility(8);
            }
            bVar2.f3791b.setText(item.getTitle());
        }
        return view;
    }

    public b4i(Context context, Menu menu) {
        this.f3788a = LayoutInflater.from(context);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        this.f3789b = arrayList;
        if (menu != null) {
            a(menu, arrayList);
        }
        this.c = context;
    }
}

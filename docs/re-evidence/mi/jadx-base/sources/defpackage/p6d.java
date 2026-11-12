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
public class p6d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f30055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<MenuItem> f30056b;
    public Context c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f30057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30058b;

        public b() {
        }
    }

    public p6d(Context context, Menu menu) {
        this.f30055a = LayoutInflater.from(context);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        this.f30056b = arrayList;
        a(menu, arrayList);
        this.c = context;
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
        return this.f30056b.get(i);
    }

    public void d(Menu menu) {
        a(menu, this.f30056b);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f30056b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f30055a.inflate(awi.z, viewGroup, false);
            b bVar = new b();
            bVar.f30057a = (ImageView) view.findViewById(R.id.icon);
            bVar.f30058b = (TextView) view.findViewById(R.id.text1);
            view.setTag(bVar);
            bb1.b(view);
        }
        wzo.d(view, i, getCount());
        Object tag = view.getTag();
        if (tag != null) {
            b bVar2 = (b) tag;
            MenuItem item = getItem(i);
            if (item.getIcon() != null) {
                bVar2.f30057a.setImageDrawable(item.getIcon());
                bVar2.f30057a.setVisibility(0);
            } else {
                bVar2.f30057a.setVisibility(8);
            }
            bVar2.f30058b.setText(item.getTitle());
        }
        return view;
    }
}

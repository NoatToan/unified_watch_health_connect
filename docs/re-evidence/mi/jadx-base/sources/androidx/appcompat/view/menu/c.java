package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import defpackage.mwi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class c implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f1497b;
    public e c;
    public ExpandedMenuView d;
    public int e;
    public int f;
    public int g;
    public i.a h;
    public a i;
    public int j;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1498a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarX = c.this.c.x();
            if (gVarX != null) {
                ArrayList<g> arrayListB = c.this.c.B();
                int size = arrayListB.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListB.get(i) == gVarX) {
                        this.f1498a = i;
                        return;
                    }
                }
            }
            this.f1498a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i) {
            ArrayList<g> arrayListB = c.this.c.B();
            int i2 = i + c.this.e;
            int i3 = this.f1498a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayListB.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.c.B().size() - c.this.e;
            return this.f1498a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1497b.inflate(cVar.g, viewGroup, false);
            }
            ((MenuView.ItemView) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i) {
        this(i, 0);
        this.f1496a = context;
        this.f1497b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.h;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, e eVar) {
        if (this.f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f);
            this.f1496a = contextThemeWrapper;
            this.f1497b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1496a != null) {
            this.f1496a = context;
            if (this.f1497b == null) {
                this.f1497b = LayoutInflater.from(context);
            }
        }
        this.c = eVar;
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(i.a aVar) {
        this.h = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(k kVar) {
        if (!kVar.hasVisibleItems()) {
            return false;
        }
        new f(kVar).d(null);
        i.a aVar = this.h;
        if (aVar == null) {
            return true;
        }
        aVar.c(kVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.j;
    }

    public MenuView h(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.f1497b.inflate(mwi.i, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.d.setAdapter((ListAdapter) this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public void i(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void j(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.O(this.i.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        i((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        j(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public c(int i, int i2) {
        this.g = i;
        this.f = i2;
    }
}

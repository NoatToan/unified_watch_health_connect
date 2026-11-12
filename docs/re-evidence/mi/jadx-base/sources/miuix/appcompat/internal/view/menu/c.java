package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import defpackage.awi;
import defpackage.bb1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class c implements h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f26534b;
    public d c;
    public ExpandedMenuView d;
    public int e;
    public int f;
    public int g;
    public int h;
    public h.a i;
    public a j;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26535a = -1;

        public a() {
            a();
        }

        public void a() {
            f fVarT = c.this.c.t();
            if (fVarT != null) {
                ArrayList<f> arrayListX = c.this.c.x();
                int size = arrayListX.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListX.get(i) == fVarT) {
                        this.f26535a = i;
                        return;
                    }
                }
            }
            this.f26535a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f getItem(int i) {
            ArrayList<f> arrayListX = c.this.c.x();
            int i2 = i + c.this.e;
            int i3 = this.f26535a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayListX.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.c.x().size() - c.this.e;
            return this.f26535a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f26534b.inflate(cVar.g, viewGroup, false);
                bb1.e(view);
            }
            ((i.a) view).b(getItem(i), 0);
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
        this.f26533a = context;
        this.f26534b = LayoutInflater.from(context);
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void b(d dVar, boolean z) {
        h.a aVar = this.i;
        if (aVar != null) {
            aVar.b(dVar, z);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void c(Context context, d dVar) {
        if (this.f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f);
            this.f26533a = contextThemeWrapper;
            this.f26534b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f26533a != null) {
            this.f26533a = context;
            if (this.f26534b == null) {
                this.f26534b = LayoutInflater.from(context);
            }
        }
        d dVar2 = this.c;
        if (dVar2 != null) {
            dVar2.M(this);
        }
        this.c = dVar;
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean d(d dVar, f fVar) {
        return false;
    }

    public ListAdapter e() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean f(d dVar, f fVar) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean flagActionItems() {
        return false;
    }

    public i g(ViewGroup viewGroup) {
        if (this.j == null) {
            this.j = new a();
        }
        if (this.j.isEmpty()) {
            return null;
        }
        if (this.d == null) {
            ExpandedMenuView expandedMenuView = (ExpandedMenuView) this.f26534b.inflate(this.h, viewGroup, false);
            this.d = expandedMenuView;
            expandedMenuView.setAdapter((ListAdapter) this.j);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean h(j jVar) {
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        new e(jVar).e(null);
        h.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.c(jVar);
        return true;
    }

    public void i(h.a aVar) {
        this.i = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.I(this.j.getItem(i), 0);
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void updateMenuView(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public c(Context context, int i, int i2) {
        this(i, i2, 0);
        this.f26533a = context;
        this.f26534b = LayoutInflater.from(context);
    }

    public c(int i, int i2) {
        this(awi.w, i, i2);
    }

    public c(int i, int i2, int i3) {
        this.g = i2;
        this.h = i;
        this.f = i3;
    }
}

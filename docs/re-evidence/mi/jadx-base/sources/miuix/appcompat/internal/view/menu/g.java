package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.PopupWindow;
import defpackage.awi;
import defpackage.bb1;
import defpackage.k4i;
import defpackage.wzo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class g implements AdapterView.OnItemClickListener, View.OnKeyListener, PopupWindow.OnDismissListener, h {
    public static final int p = awi.I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f26549b;
    public LayoutInflater c;
    public k4i d;
    public d e;
    public View f;
    public View g;
    public boolean h;
    public a i;
    public h.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26550k;
    public int l = p;
    public int m = 0;
    public int n = -1;
    public int o = 0;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f26551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26552b = -1;

        public a(d dVar) {
            this.f26551a = dVar;
            b();
        }

        public void b() {
            f fVarT = g.this.e.t();
            if (fVarT != null) {
                ArrayList<f> arrayListX = g.this.e.x();
                int size = arrayListX.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListX.get(i) == fVarT) {
                        this.f26552b = i;
                        return;
                    }
                }
            }
            this.f26552b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public f getItem(int i) {
            ArrayList<f> arrayListX = g.this.h ? this.f26551a.x() : this.f26551a.C();
            int i2 = this.f26552b;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayListX.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ArrayList<f> arrayListX = g.this.h ? this.f26551a.x() : this.f26551a.C();
            return this.f26552b < 0 ? arrayListX.size() : arrayListX.size() - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = g.this.c.inflate(g.this.l, viewGroup, false);
                bb1.b(view);
            }
            wzo.d(view, i, getCount());
            i.a aVar = (i.a) view;
            if (g.this.f26548a) {
                ((ListMenuItemView) view).setForceShowIcon(true);
            }
            aVar.b(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public g(Context context, d dVar, View view, View view2, boolean z) {
        this.f26549b = context;
        this.c = LayoutInflater.from(context);
        this.e = dVar;
        this.h = z;
        this.g = view;
        this.f = view2;
        dVar.c(this);
    }

    public void a(boolean z) {
        if (isShowing()) {
            this.d.dismiss();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void b(d dVar, boolean z) {
        if (dVar != this.e) {
            return;
        }
        a(true);
        h.a aVar = this.j;
        if (aVar != null) {
            aVar.b(dVar, z);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void c(Context context, d dVar) {
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean d(d dVar, f fVar) {
        return false;
    }

    public boolean e() {
        k4i k4iVar = new k4i(this.f26549b, this.f);
        this.d = k4iVar;
        k4iVar.n(81);
        this.d.setOnDismissListener(this);
        this.d.setOnItemClickListener(this);
        a aVar = new a(this.e);
        this.i = aVar;
        this.d.j(aVar);
        this.d.g(this.m);
        this.d.b(this.f26550k);
        int i = this.o;
        if (i > 0) {
            this.d.Z(i);
        }
        if (!this.d.R(this.g)) {
            return true;
        }
        this.d.e0(this.g, 81);
        this.d.K().setOnKeyListener(this);
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean f(d dVar, f fVar) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean flagActionItems() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean h(j jVar) {
        boolean z;
        if (jVar.hasVisibleItems()) {
            g gVar = new g(this.f26549b, jVar, this.g, this.f, false);
            gVar.n(this.j);
            int size = jVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = jVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            gVar.o(z);
            if (gVar.e()) {
                h.a aVar = this.j;
                if (aVar != null) {
                    aVar.c(jVar);
                }
                return true;
            }
        }
        return false;
    }

    public boolean isShowing() {
        k4i k4iVar = this.d;
        return k4iVar != null && k4iVar.isShowing();
    }

    public void m(int i) {
        this.n = i;
    }

    public void n(h.a aVar) {
        this.j = aVar;
    }

    public void o(boolean z) {
        this.f26548a = z;
    }

    public void onDismiss() {
        this.d = null;
        this.e.close();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        a aVar = this.i;
        aVar.f26551a.I(aVar.getItem(i), 0);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        a(false);
        return true;
    }

    public void p(int i) {
        this.l = i;
    }

    public void q(int i) {
        this.o = i;
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public void updateMenuView(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        if (isShowing()) {
            this.d.g(this.m);
            this.d.b(this.f26550k);
            this.d.m(this.g, null);
        }
    }
}

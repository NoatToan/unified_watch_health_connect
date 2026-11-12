package defpackage;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.List;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.appcompat.view.menu.HyperMenuContract$CheckableType;

/* JADX INFO: loaded from: classes3.dex */
public class znc extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<eoc> f41486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f41487b;
    public boolean c;

    public class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CheckedTextView f41488a;

        public a(CheckedTextView checkedTextView) {
            this.f41488a = checkedTextView;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(true);
            m80Var.h0(this.f41488a.isChecked());
            String string = this.f41488a.getText().toString();
            if (!TextUtils.isEmpty(string)) {
                m80Var.m0(string);
            }
            if (this.f41488a.isChecked()) {
                return;
            }
            m80Var.b(m80.a.i);
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(false);
        }
    }

    public class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ foc f41491a;

        public c(foc focVar) {
            this.f41491a = focVar;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.j0(true);
            foc focVar = this.f41491a;
            if (focVar != null) {
                String string = focVar.b() != null ? this.f41491a.b().getTitle().toString() : null;
                if (!TextUtils.isEmpty(string)) {
                    m80Var.m0(string);
                }
                foc focVar2 = this.f41491a;
                if (focVar2.c && !focVar2.f) {
                    m80Var.K0(view.getContext().getResources().getString(z1j.d));
                } else if (focVar2.f) {
                    m80Var.K0(view.getContext().getResources().getString(z1j.e));
                }
            }
        }
    }

    public class d {
        public d() {
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CheckedTextView f41494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f41495b;
        public ImageView c;

        public e() {
        }
    }

    public znc() {
    }

    public static void h(View view, int i, int i2) {
        if (view == null || i2 == 0) {
            return;
        }
        Context context = view.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(dmi.g0);
        if (i2 > 1) {
            if (i == 0) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(dmi.f0);
            } else if (i == i2 - 1) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(dmi.h0);
            }
        }
        view.setMinimumHeight(dimensionPixelSize);
    }

    public eoc a(int i) {
        return this.f41486a.get(i);
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MenuItem getItem(int i) {
        return this.f41486a.get(i).b();
    }

    public final View c(View view, ViewGroup viewGroup) {
        if (view != null && view.getTag().getClass() == d.class) {
            return view;
        }
        d dVar = new d();
        View viewInflate = this.f41487b.inflate(awi.F, viewGroup, false);
        viewInflate.setTag(dVar);
        return viewInflate;
    }

    public final View d(int i, View view, ViewGroup viewGroup) {
        e eVar;
        if (view == null || view.getTag().getClass() != e.class) {
            e eVar2 = new e();
            View viewInflate = this.f41487b.inflate(awi.y, viewGroup, false);
            eVar2.f41494a = (CheckedTextView) viewInflate.findViewById(R.id.text1);
            eVar2.f41495b = (ImageView) viewInflate.findViewById(R.id.icon);
            eVar2.c = (ImageView) viewInflate.findViewById(vsi.u);
            viewInflate.setTag(eVar2);
            bb1.b(viewInflate);
            eVar = eVar2;
            view = viewInflate;
        } else {
            eVar = (e) view.getTag();
        }
        foc focVar = (foc) this.f41486a.get(i);
        eVar.f41494a.setText(focVar.b().getTitle());
        eVar.f41494a.setChecked(focVar.c());
        if (!this.c || focVar.b().getIcon() == null) {
            eVar.f41495b.setVisibility(8);
        } else {
            eVar.f41495b.setImageDrawable(focVar.b().getIcon());
            eVar.f41495b.setVisibility(0);
        }
        eVar.c.setVisibility((focVar.c || focVar.f) ? 0 : 8);
        h(view, i, this.f41486a.size());
        if (HyperMenuContract$CheckableType.NON_SUPPORT.equals(focVar.d)) {
            f(view, focVar);
        } else {
            e(view, eVar.f41494a);
        }
        return view;
    }

    public final void e(View view, CheckedTextView checkedTextView) {
        androidx.core.view.c.r0(view, new a(checkedTextView));
        androidx.core.view.c.r0(checkedTextView, new b());
    }

    public final void f(View view, foc focVar) {
        androidx.core.view.c.r0(view, new c(focVar));
    }

    public void g(boolean z) {
        this.c = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f41486a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.f41486a.get(i).a();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.f41486a.get(i) instanceof doc ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return d(i, view, viewGroup);
        }
        if (itemViewType == 1) {
            return c(view, viewGroup);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItemViewType(i) == 0;
    }

    public znc(LayoutInflater layoutInflater, List<eoc> list) {
        this.f41487b = layoutInflater;
        this.f41486a = list;
    }
}

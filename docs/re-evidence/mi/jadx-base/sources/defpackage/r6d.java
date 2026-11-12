package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public class r6d extends k4i implements q6d {
    public fd0 H;
    public p6d I;
    public View J;
    public ViewGroup K;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: r6d$a$a, reason: collision with other inner class name */
        public class C1095a implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SubMenu f32238a;

            public C1095a(SubMenu subMenu) {
                this.f32238a = subMenu;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                r6d.this.setOnDismissListener(null);
                r6d.this.k(this.f32238a);
                r6d r6dVar = r6d.this;
                r6dVar.d0(r6dVar.J);
            }
        }

        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MenuItem item = r6d.this.I.getItem(i);
            if (item.hasSubMenu()) {
                r6d.this.setOnDismissListener(new C1095a(item.getSubMenu()));
            } else {
                r6d.this.H.F(0, item);
            }
            r6d.this.a(true);
        }
    }

    public r6d(fd0 fd0Var, Menu menu, View view) {
        super(fd0Var.getThemedContext(), view);
        Context themedContext = fd0Var.getThemedContext();
        this.H = fd0Var;
        p6d p6dVar = new p6d(themedContext, menu);
        this.I = p6dVar;
        j(p6dVar);
        setOnItemClickListener(new a());
    }

    @Override // defpackage.q6d
    public void a(boolean z) {
        dismiss();
    }

    @Override // defpackage.k4i
    public void d0(View view) {
        this.J = view;
        super.d0(view);
    }

    @Override // defpackage.q6d
    public void k(Menu menu) {
        this.I.d(menu);
    }

    @Override // defpackage.k4i
    public void m(View view, ViewGroup viewGroup) {
        this.J = view;
        super.m(view, viewGroup);
    }

    public View n0() {
        return this.J;
    }

    public ViewGroup o0() {
        return this.K;
    }
}

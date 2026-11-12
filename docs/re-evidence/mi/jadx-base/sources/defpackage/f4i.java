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
public class f4i extends k4i {
    public b4i H;
    public View I;

    public f4i(Context context) {
        super(context);
        b4i b4iVar = new b4i(context);
        this.H = b4iVar;
        j(b4iVar);
        setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: c4i
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f4913a.n0(adapterView, view, i, j);
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: d4i
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f15076a.o0();
            }
        });
    }

    public void k(Menu menu) {
        this.H.d(menu);
    }

    @Override // defpackage.k4i
    @Deprecated
    public void m(View view, ViewGroup viewGroup) {
        showAsDropDown(view);
    }

    public final /* synthetic */ void m0(SubMenu subMenu) {
        setOnDismissListener(null);
        k(subMenu);
        showAsDropDown(this.I);
    }

    public final /* synthetic */ void n0(AdapterView adapterView, View view, int i, long j) {
        MenuItem item = this.H.getItem(i);
        if (item.hasSubMenu()) {
            final SubMenu subMenu = item.getSubMenu();
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: e4i
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f16258a.m0(subMenu);
                }
            });
        } else {
            p0(item);
        }
        dismiss();
    }

    public void o0() {
    }

    public void p0(MenuItem menuItem) {
    }

    @Override // defpackage.k4i, android.widget.PopupWindow
    public void showAsDropDown(View view) {
        this.I = view;
        if (R(view)) {
            super.showAsDropDown(view);
        }
    }

    @Override // defpackage.k4i, android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        if (R(view)) {
            super.showAtLocation(view.getRootView(), i, i2, i3);
        }
    }
}

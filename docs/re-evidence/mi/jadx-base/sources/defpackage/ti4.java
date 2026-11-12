package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import miuix.appcompat.internal.view.menu.d;

/* JADX INFO: loaded from: classes3.dex */
public class ti4 extends che implements ri4 {
    public LinearLayout D;
    public View E;
    public View F;
    public pi4 G;
    public View H;
    public ViewGroup I;
    public float J;
    public float K;
    public d L;
    public MenuItem M;
    public int N;
    public int O;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: ti4$a$a, reason: collision with other inner class name */
        public class C1111a implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SubMenu f34730a;

            public C1111a(SubMenu subMenu) {
                this.f34730a = subMenu;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ti4.this.setOnDismissListener(null);
                ti4.this.e0(this.f34730a);
                ti4 ti4Var = ti4.this;
                ti4Var.Z(ti4Var.H, ti4.this.J, ti4.this.K);
            }
        }

        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MenuItem item = ti4.this.G.getItem(i);
            ti4.this.L.I(item, 0);
            if (item.hasSubMenu()) {
                ti4.this.setOnDismissListener(new C1111a(item.getSubMenu()));
            }
            ti4.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ti4.this.L.I(ti4.this.M, 0);
            ti4.this.dismiss();
        }
    }

    public ti4(Context context, d dVar, PopupWindow.OnDismissListener onDismissListener, View view) {
        super(context, view);
        this.L = dVar;
        pi4 pi4Var = new pi4(context, this.L);
        this.G = pi4Var;
        this.M = pi4Var.e();
        c0(context);
        K(this.G);
        setOnItemClickListener(new a());
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        this.N = context.getResources().getDimensionPixelSize(dmi.F);
    }

    @Override // defpackage.che
    public void H(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(1);
        this.D.setClipChildren(false);
        this.D.setClipToPadding(false);
        View viewInflate = LayoutInflater.from(context).inflate(awi.H, (ViewGroup) null, false);
        this.E = viewInflate;
        if (viewInflate instanceof ViewGroup) {
            this.F = viewInflate.findViewById(vsi.c0);
        }
        Drawable drawableH = hm1.h(context, zhi.E);
        if (drawableH != null) {
            drawableH.getPadding(this.e);
            this.E.setBackground(drawableH.getConstantState().newDrawable());
            J(this.E, this.v + this.w);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(dmi.E), 0, 0);
        this.D.addView(this.h, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.D.addView(this.E, layoutParams);
        setBackgroundDrawable(null);
        O(this.D);
    }

    public final void Z(View view, float f, float f2) {
        View rootView = view.getRootView();
        Rect rect = new Rect();
        dyq.b(rootView, rect);
        this.O = u(rect);
        setWidth(w(rect));
        setHeight(-2);
        this.E.setVisibility(8);
        d0(view, f, f2, rect);
        this.i.forceLayout();
    }

    @Override // defpackage.ri4
    public void a(View view, ViewGroup viewGroup, float f, float f2) {
        if (view == null && (view = this.H) == null) {
            view = null;
        }
        if (viewGroup == null && (viewGroup = this.I) == null) {
            viewGroup = null;
        }
        b(view, viewGroup, f, f2);
    }

    public final int a0() {
        ListView listView = (ListView) this.i.findViewById(R.id.list);
        if (listView == null) {
            this.i.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            return this.i.getMeasuredHeight();
        }
        ListAdapter adapter = listView.getAdapter();
        int measuredHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++) {
            View view = adapter.getView(i, null, listView);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.O, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight;
    }

    @Override // defpackage.ri4
    public void b(View view, ViewGroup viewGroup, float f, float f2) {
        this.H = view;
        this.I = viewGroup;
        this.J = f;
        this.K = f2;
        View rootView = view.getRootView();
        Rect rect = new Rect();
        dyq.b(rootView, rect);
        this.O = u(rect);
        if (I(view, viewGroup, rect)) {
            d0(view, f, f2, rect);
        }
    }

    public final int b0() {
        if (this.E.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = this.E.getLayoutParams();
        int i = (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).topMargin;
        View view = this.F;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), 0, this.F.getPaddingRight(), 0);
        }
        this.E.measure(View.MeasureSpec.makeMeasureSpec(this.O, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        View view2 = this.F;
        if (view2 != null) {
            wzo.c(view2, 0, 1);
            this.E.measure(View.MeasureSpec.makeMeasureSpec(this.O, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        return this.E.getMeasuredHeight() + i;
    }

    public final void c0(Context context) {
        if (this.M == null) {
            this.E.setVisibility(8);
            return;
        }
        ((TextView) this.E.findViewById(R.id.text1)).setText(this.M.getTitle());
        this.E.setOnClickListener(new b());
        bb1.b(this.E);
    }

    public final void d0(View view, float f, float f2, Rect rect) {
        Rect rect2 = new Rect();
        dyq.b(view, rect2);
        int iWidth = rect2.left + ((int) f);
        int i = rect2.top + ((int) f2);
        boolean z = iWidth <= getWidth();
        boolean z2 = iWidth >= rect.width() - getWidth();
        int iA0 = a0();
        float fA0 = i - (a0() / 2);
        if (fA0 < rect.height() * 0.1f) {
            fA0 = rect.height() * 0.1f;
        }
        int iB0 = iA0 + b0();
        setHeight(iB0);
        M(iB0);
        float f3 = iB0;
        if (fA0 + f3 > rect.height() * 0.9f) {
            fA0 = (rect.height() * 0.9f) - f3;
        }
        if (fA0 < rect.height() * 0.1f) {
            fA0 = rect.height() * 0.1f;
            setHeight((int) (rect.height() * 0.79999995f));
        }
        if (z) {
            iWidth = this.N;
        } else if (z2) {
            iWidth = (rect.width() - this.N) - getWidth();
        }
        showAtLocation(view, 0, iWidth, (int) fA0);
        che.s(this.h.getRootView());
    }

    public void e0(Menu menu) {
        this.G.d(menu);
    }
}

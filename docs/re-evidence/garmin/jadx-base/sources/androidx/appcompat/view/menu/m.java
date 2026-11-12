package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f4812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f4816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n.a f4819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f4820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f4822l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            m.this.c();
        }
    }

    public m(Context context, h hVar, View view2, boolean z14, int i14, int i15) {
        this.f4817g = 8388611;
        this.f4822l = new a();
        this.f4811a = context;
        this.f4812b = hVar;
        this.f4816f = view2;
        this.f4813c = z14;
        this.f4814d = i14;
        this.f4815e = i15;
    }

    public final l a() {
        l rVar;
        if (this.f4820j == null) {
            Context context = this.f4811a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f4811a;
            if (iMin >= dimensionPixelSize) {
                rVar = new d(context2, this.f4816f, this.f4814d, this.f4815e, this.f4813c);
            } else {
                rVar = new r(context2, this.f4812b, this.f4816f, this.f4814d, this.f4815e, this.f4813c);
            }
            rVar.b(this.f4812b);
            rVar.i(this.f4822l);
            rVar.d(this.f4816f);
            rVar.setCallback(this.f4819i);
            rVar.f(this.f4818h);
            rVar.g(this.f4817g);
            this.f4820j = rVar;
        }
        return this.f4820j;
    }

    public final boolean b() {
        l lVar = this.f4820j;
        return lVar != null && lVar.a();
    }

    public void c() {
        this.f4820j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4821k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i14, int i15, boolean z14, boolean z15) {
        l lVarA = a();
        lVarA.j(z15);
        if (z14) {
            if ((Gravity.getAbsoluteGravity(this.f4817g, this.f4816f.getLayoutDirection()) & 7) == 5) {
                i14 -= this.f4816f.getWidth();
            }
            lVarA.h(i14);
            lVarA.k(i15);
            int i16 = (int) ((this.f4811a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarA.f4810a = new Rect(i14 - i16, i15 - i16, i14 + i16, i15 + i16);
        }
        lVarA.show();
    }

    public m(Context context, h hVar, View view2) {
        this(context, hVar, view2, false, R.attr.popupMenuStyle, 0);
    }

    public m(Context context, h hVar, View view2, boolean z14, int i14) {
        this(context, hVar, view2, z14, i14, 0);
    }

    public m(Context context, h hVar) {
        this(context, hVar, null, false, R.attr.popupMenuStyle, 0);
    }
}

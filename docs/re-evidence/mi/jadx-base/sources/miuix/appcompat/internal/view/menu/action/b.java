package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import defpackage.hm1;
import defpackage.zhi;
import java.util.HashMap;
import java.util.Map;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.d;

/* JADX INFO: loaded from: classes3.dex */
public class b extends miuix.appcompat.internal.view.menu.action.a {
    public Map<Integer, Boolean> H;
    public Map<Integer, Boolean[]> I;

    public class a extends miuix.appcompat.internal.view.menu.b implements ActionMenuPresenter.e {
        public a(Context context, d dVar, View view, View view2, boolean z) {
            super(context, dVar, view, view2, z);
            TypedValue typedValueK = hm1.k(context, zhi.N);
            int dimensionPixelSize = (typedValueK == null || typedValueK.type != 5) ? 0 : typedValueK.resourceId > 0 ? context.getResources().getDimensionPixelSize(typedValueK.resourceId) : TypedValue.complexToDimensionPixelSize(typedValueK.data, context.getResources().getDisplayMetrics());
            if (dimensionPixelSize > 0) {
                p(dimensionPixelSize);
            }
            o(b.this.D);
            int iS = b.this.S(view);
            if (iS != -1) {
                n(iS);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.b, miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void a(boolean z) {
            super.a(z);
            View view = b.this.f26501k;
            if (view != null) {
                view.setSelected(false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void g(d dVar) {
        }

        @Override // miuix.appcompat.internal.view.menu.b, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            b.this.c.close();
            b.this.x = null;
        }
    }

    public b(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, int i4) {
        super(context, actionBarOverlayLayout, i, i2, i3, i4);
        this.H = new HashMap();
        this.I = new HashMap();
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    public ActionMenuPresenter.e R() {
        if (!i0()) {
            return super.R();
        }
        a aVar = new a(this.f26498b, this.c, this.f26501k, this.C, true);
        aVar.k(this.H);
        aVar.l(this.I);
        return aVar;
    }

    public Map<Integer, Boolean> t0() {
        return this.H;
    }

    public Map<Integer, Boolean[]> u0() {
        return this.I;
    }

    public void v0(Map<Integer, Boolean> map) {
        if (map == null) {
            return;
        }
        for (Integer num : map.keySet()) {
            num.intValue();
            Boolean bool = map.get(num);
            if (bool != null) {
                this.H.put(num, bool);
            }
        }
    }

    public void w0(Map<Integer, Boolean[]> map) {
        if (map == null) {
            return;
        }
        for (Integer num : map.keySet()) {
            num.intValue();
            Boolean[] boolArr = map.get(num);
            Boolean[] boolArr2 = new Boolean[boolArr.length];
            System.arraycopy(boolArr, 0, boolArr2, 0, boolArr.length);
            this.I.put(num, boolArr2);
        }
    }
}

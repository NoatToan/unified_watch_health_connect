package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import huawei.android.widget.HwSafeInsetsShareable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xgl implements HwSafeInsetsShareable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<View, a> f52880a = new HashMap();

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Rect f52881a = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f52882c;
        View d;

        a(View view, int i) {
            this.f52882c = 1;
            this.d = view;
            if (i == 2) {
                this.f52882c = i;
            }
            c();
        }

        private void c() {
            View view = this.d;
            if (this.f52882c == 2) {
                this.f52881a.set(xgl.this.a(view));
            } else {
                this.f52881a.set(xgl.this.e(view));
            }
        }
    }

    private boolean b(a aVar, xgo xgoVar) {
        View view = aVar.d;
        Rect rectE = xgoVar.e(view, aVar.f52881a);
        if (rectE.equals(a(view))) {
            return false;
        }
        view.setPadding(rectE.left, rectE.top, rectE.right, rectE.bottom);
        return true;
    }

    @Override // huawei.android.widget.HwSafeInsetsShareable
    public void addSharedView(View view, int i) {
        if (view == null || this.f52880a.containsKey(view)) {
            return;
        }
        this.f52880a.put(view, new a(view, i));
    }

    public void d(xgo xgoVar) {
        Iterator<a> it = this.f52880a.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (d(it.next(), xgoVar)) {
                z = true;
            }
        }
        if (z) {
            xgoVar.b();
        }
    }

    public void e(Configuration configuration) {
        c();
    }

    @Override // huawei.android.widget.HwSafeInsetsShareable
    public void removeSharedView(View view) {
        this.f52880a.remove(view);
    }

    private boolean a(a aVar, xgo xgoVar) {
        View view = aVar.d;
        boolean z = false;
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return false;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rectE = xgoVar.e();
            Rect rect = aVar.f52881a;
            Rect rectE2 = xgoVar.e(view, rect);
            Rect rectE3 = e(view);
            int i = rectE.left;
            if (i != 0 || rectE.right != 0) {
                if (i > 0) {
                    int i2 = rectE2.left;
                    if (i2 > rectE3.left) {
                        marginLayoutParams.leftMargin = i2;
                        z = true;
                    }
                } else {
                    int i3 = rectE3.left;
                    int i4 = rect.left;
                    if (i3 > i4) {
                        marginLayoutParams.leftMargin = i4;
                        z = true;
                    }
                }
                if (rectE.right > 0) {
                    int i5 = rectE2.right;
                    if (i5 > rectE3.right) {
                        marginLayoutParams.rightMargin = i5;
                        z = true;
                    }
                } else {
                    int i6 = rectE3.right;
                    int i7 = rect.right;
                    if (i6 > i7) {
                        marginLayoutParams.rightMargin = i7;
                        z = true;
                    }
                }
            } else if (!rect.equals(rectE3)) {
                marginLayoutParams.leftMargin = rect.left;
                marginLayoutParams.rightMargin = rect.right;
                z = true;
            }
            if (z) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
        return z;
    }

    private boolean d(a aVar, xgo xgoVar) {
        int i = aVar.f52882c;
        if (i == 1) {
            return a(aVar, xgoVar);
        }
        if (i != 2) {
            return false;
        }
        return b(aVar, xgoVar);
    }

    private void c() {
        Iterator<a> it = this.f52880a.values().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    private void b(a aVar) {
        View view = aVar.d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = aVar.f52881a;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.rightMargin = rect.right;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public void c(View view, xgo xgoVar) {
        a aVar = this.f52880a.get(view);
        if (aVar != null) {
            d(aVar, xgoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect e(View view) {
        Rect rect = new Rect();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect a(View view) {
        Rect rect = new Rect();
        if (view != null) {
            rect.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        return rect;
    }
}

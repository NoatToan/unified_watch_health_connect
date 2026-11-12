package i;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c1;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.z;
import com.garmin.android.apps.connectmobile.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f86633a;

    public g(f fVar) {
        this.f86633a = fVar;
    }

    @Override // androidx.core.view.z
    public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
        boolean z14;
        m1 m1VarB;
        boolean z15;
        int iD = m1Var.d();
        f fVar = this.f86633a;
        Context context = fVar.f86582k;
        int iD2 = m1Var.d();
        ActionBarContextView actionBarContextView = fVar.f86594x;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z14 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f86594x.getLayoutParams();
            boolean z16 = true;
            if (fVar.f86594x.isShown()) {
                if (fVar.Z0 == null) {
                    fVar.Z0 = new Rect();
                    fVar.f86577a1 = new Rect();
                }
                Rect rect = fVar.Z0;
                Rect rect2 = fVar.f86577a1;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = fVar.D;
                if (Build.VERSION.SDK_INT >= 29) {
                    c1.a.a(viewGroup, rect, rect2);
                } else {
                    if (!c1.f5071a) {
                        c1.f5071a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            c1.f5072b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                c1.f5072b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = c1.f5072b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i14 = rect.top;
                int i15 = rect.left;
                int i16 = rect.right;
                ViewGroup viewGroup2 = fVar.D;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                m1 m1VarA = s0.e.a(viewGroup2);
                int iB = m1VarA == null ? 0 : m1VarA.b();
                int iC = m1VarA == null ? 0 : m1VarA.c();
                if (marginLayoutParams.topMargin == i14 && marginLayoutParams.leftMargin == i15 && marginLayoutParams.rightMargin == i16) {
                    z15 = false;
                } else {
                    marginLayoutParams.topMargin = i14;
                    marginLayoutParams.leftMargin = i15;
                    marginLayoutParams.rightMargin = i16;
                    z15 = true;
                }
                if (i14 <= 0 || fVar.F != null) {
                    View view3 = fVar.F;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i17 = marginLayoutParams2.height;
                        int i18 = marginLayoutParams.topMargin;
                        if (i17 != i18 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i18;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            fVar.F.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view4 = new View(context);
                    fVar.F = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    fVar.D.addView(fVar.F, -1, layoutParams);
                }
                View view5 = fVar.F;
                z16 = view5 != null;
                if (z16 && view5.getVisibility() != 0) {
                    View view6 = fVar.F;
                    view6.setBackgroundColor((view6.getWindowSystemUiVisibility() & 8192) != 0 ? a7.b.getColor(context, R.color.abc_decor_view_status_guard_light) : a7.b.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!fVar.Y && z16) {
                    iD2 = 0;
                }
                z14 = z16;
                z16 = z15;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z14 = false;
            } else {
                z14 = false;
                z16 = false;
            }
            if (z16) {
                fVar.f86594x.setLayoutParams(marginLayoutParams);
            }
        }
        View view7 = fVar.F;
        if (view7 != null) {
            view7.setVisibility(z14 ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = m1Var.b();
            int iC2 = m1Var.c();
            int iA = m1Var.a();
            m1.a aVar = new m1.a(m1Var);
            c7.e eVarC = c7.e.c(iB2, iD2, iC2, iA);
            m1.i iVar = aVar.f6509a;
            iVar.h(eVarC);
            m1VarB = iVar.b();
        } else {
            m1VarB = m1Var;
        }
        return s0.k(view2, m1VarB);
    }
}

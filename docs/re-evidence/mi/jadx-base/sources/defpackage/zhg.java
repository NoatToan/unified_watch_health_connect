package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NoSuchNativeViewException;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.f;
import com.facebook.systrace.Systrace;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class zhg {
    public static final String n = "zhg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<View> f41279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<ViewManager> f41280b;
    public final SparseBooleanArray c;
    public final f d;
    public final aqd e;
    public final RootViewManager f;
    public final u6e g;
    public final SparseArray<SparseIntArray> h;
    public final int[] i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41281k;
    public PopupMenu l;
    public int m;

    public class a implements v6e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroupManager f41282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f41283b;
        public final /* synthetic */ View c;
        public final /* synthetic */ SparseIntArray d;
        public final /* synthetic */ int e;

        public a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, SparseIntArray sparseIntArray, int i) {
            this.f41282a = viewGroupManager;
            this.f41283b = viewGroup;
            this.c = view;
            this.d = sparseIntArray;
            this.e = i;
        }

        @Override // defpackage.v6e
        public void onAnimationEnd() {
            this.f41282a.removeView(this.f41283b, this.c);
            zhg.this.n(this.c);
            this.d.put(this.e, Math.max(0, this.d.get(this.e, 0) - 1));
        }
    }

    public static class b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f41284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41285b;

        public /* synthetic */ b(Callback callback, a aVar) {
            this(callback);
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (this.f41285b) {
                return;
            }
            this.f41284a.invoke("dismissed");
            this.f41285b = true;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f41285b) {
                return false;
            }
            this.f41284a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.f41285b = true;
            return true;
        }

        public b(Callback callback) {
            this.f41285b = false;
            this.f41284a = callback;
        }
    }

    public zhg(f fVar) {
        this(fVar, new RootViewManager());
    }

    public static String i(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, asq[] asqVarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 >= viewGroupManager.getChildCount(viewGroup) || i2 >= 16) {
                        break;
                    }
                    sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                    i2++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        break;
                    }
                    sb.append(iArr[i6] + ",");
                    i5++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (asqVarArr != null) {
            sb.append("  viewsToAdd(" + asqVarArr.length + "): [\n");
            for (int i7 = 0; i7 < asqVarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= asqVarArr.length || i8 >= 16) {
                        break;
                    }
                    sb.append("[" + asqVarArr[i9].f3423b + "," + asqVarArr[i9].f3422a + "],");
                    i8++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        break;
                    }
                    sb.append(iArr2[i12] + ",");
                    i11++;
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void A(int i, int i2, boolean z) {
        try {
            if (!z) {
                this.e.d(i2, null);
                return;
            }
            View view = this.f41279a.get(i);
            if (i2 != i && (view instanceof ViewParent)) {
                this.e.d(i2, (ViewParent) view);
                return;
            }
            if (this.c.get(i)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
            }
            this.e.d(i2, view.getParent());
        } catch (Throwable th) {
            throw th;
        }
    }

    public void B(boolean z) {
        this.f41281k = z;
    }

    public synchronized void C(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f41279a.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(q(i), view);
        this.l = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        b bVar = new b(callback, null);
        this.l.setOnMenuItemClickListener(bVar);
        this.l.setOnDismissListener(bVar);
        this.l.show();
    }

    public synchronized void D(int i, int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        pyo.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i).a("tag", i2).c();
        try {
            View viewX = x(i2);
            viewX.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            ViewParent parent = viewX.getParent();
            if (parent instanceof exk) {
                parent.requestLayout();
            }
            if (this.c.get(i)) {
                E(viewX, i3, i4, i5, i6);
            } else {
                NativeModule nativeModule = (ViewManager) this.f41280b.get(i);
                if (!(nativeModule instanceof o0d)) {
                    throw new IllegalViewOperationException("Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                }
                o0d o0dVar = (o0d) nativeModule;
                if (o0dVar != null && !o0dVar.needsCustomLayoutForChildren()) {
                    E(viewX, i3, i4, i5, i6);
                }
            }
            Systrace.g(0L);
        } catch (Throwable th) {
            Systrace.g(0L);
            throw th;
        }
    }

    public final void E(View view, int i, int i2, int i3, int i4) {
        if (this.f41281k && this.g.h(view)) {
            this.g.b(view, i, i2, i3, i4);
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    public synchronized void F(int i, yej yejVar) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager viewManagerY = y(i);
            View viewX = x(i);
            if (yejVar != null) {
                viewManagerY.updateProperties(viewX, yejVar);
            }
        } catch (IllegalViewOperationException e) {
            cm8.j(n, "Unable to update properties for view tag " + i, e);
        }
    }

    public synchronized void G(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        y(i).updateExtraData(x(i), obj);
    }

    public synchronized void a(int i, View view) {
        b(i, view);
    }

    public final synchronized void b(int i, View view) {
        try {
            if (view.getId() != -1) {
                cm8.i(n, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.f41279a.put(i, view);
            this.f41280b.put(i, this.f);
            this.c.put(i, true);
            view.setId(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean c(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        int[] iArr = this.i;
        int i2 = this.m;
        iArr[i2] = i;
        this.m = (i2 + 1) % 100;
    }

    public void e() {
        this.e.b();
    }

    public void f() {
        this.g.f();
    }

    public final void g(View view, int[] iArr) {
        this.j.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        s(view, this.j);
        iArr[0] = Math.round(this.j.left);
        iArr[1] = Math.round(this.j.top);
        RectF rectF = this.j;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.j;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    public void h(ReadableMap readableMap, Callback callback) {
        this.g.e(readableMap, callback);
    }

    public synchronized void j(g9p g9pVar, int i, String str, yej yejVar) {
        UiThreadUtil.assertOnUiThread();
        pyo.a(0L, "NativeViewHierarchyManager_createView").a("tag", i).b("className", str).c();
        try {
            ViewManager viewManagerA = this.d.a(str);
            View viewCreateView = viewManagerA.createView(g9pVar, null, null, this.e);
            this.f41279a.put(i, viewCreateView);
            this.f41280b.put(i, viewManagerA);
            viewCreateView.setId(i);
            if (yejVar != null) {
                viewManagerA.updateProperties(viewCreateView, yejVar);
            }
            Systrace.g(0L);
        } catch (Throwable th) {
            Systrace.g(0L);
            throw th;
        }
    }

    public void k() {
        PopupMenu popupMenu = this.l;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    @Deprecated
    public synchronized void l(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f41279a.get(i);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to send command to a non-existing view with tag " + i);
        }
        y(i).receiveCommand(view, i2, readableArray);
    }

    public synchronized void m(int i, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f41279a.get(i);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to send command to a non-existing view with tag " + i);
        }
        y(i).receiveCommand(view, str, readableArray);
    }

    public synchronized void n(View view) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (edj.c) {
                d(view.getId());
            }
            if (this.f41280b.get(view.getId()) == null) {
                return;
            }
            if (!this.c.get(view.getId())) {
                y(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.f41280b.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        cm8.i(n, "Unable to drop null child view");
                    } else if (this.f41279a.get(childAt.getId()) != null) {
                        n(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.h.remove(view.getId());
            this.f41279a.remove(view.getId());
            this.f41280b.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int o(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.f41279a.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return yjp.c(f, f2, (ViewGroup) view);
    }

    public final SparseIntArray p(int i) {
        SparseIntArray sparseIntArray = this.h.get(i);
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        this.h.put(i, sparseIntArray2);
        return sparseIntArray2;
    }

    public final g9p q(int i) {
        View view = this.f41279a.get(i);
        if (view != null) {
            return (g9p) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public synchronized void r(int i, int[] iArr, asq[] asqVarArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        asq[] asqVarArr2 = asqVarArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            SparseIntArray sparseIntArrayP = p(i);
            ViewGroup viewGroup = (ViewGroup) this.f41279a.get(i);
            ViewGroupManager viewGroupManager = (ViewGroupManager) y(i);
            if (viewGroup == null) {
                throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + i(viewGroup, viewGroupManager, iArr4, asqVarArr2, iArr2));
            }
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr4 != null) {
                int length = iArr4.length - 1;
                while (length >= 0) {
                    int i2 = iArr4[length];
                    if (i2 < 0) {
                        throw new IllegalViewOperationException("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + i(viewGroup, viewGroupManager, iArr4, asqVarArr2, iArr2));
                    }
                    if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                        if (this.c.get(i) && viewGroupManager.getChildCount(viewGroup) == 0) {
                            return;
                        }
                        throw new IllegalViewOperationException("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + i(viewGroup, viewGroupManager, iArr4, asqVarArr2, iArr2));
                    }
                    if (i2 >= childCount) {
                        throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + i(viewGroup, viewGroupManager, iArr4, asqVarArr2, iArr2));
                    }
                    int iV = v(i2, sparseIntArrayP);
                    View childAt = viewGroupManager.getChildAt(viewGroup, iV);
                    if (!this.f41281k || !this.g.h(childAt) || !c(iArr2, childAt.getId())) {
                        viewGroupManager.removeViewAt(viewGroup, iV);
                    }
                    length--;
                    childCount = i2;
                }
            }
            int i3 = 0;
            if (iArr2 != null) {
                int i4 = 0;
                while (i4 < iArr2.length) {
                    int i5 = iArr2[i4];
                    int i6 = iArr3[i4];
                    View view = this.f41279a.get(i5);
                    if (view == null) {
                        throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i5 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, asqVarArr, iArr2));
                    }
                    if (this.f41281k && this.g.h(view)) {
                        sparseIntArrayP.put(i6, sparseIntArrayP.get(i6, i3) + 1);
                        this.g.c(view, new a(viewGroupManager, viewGroup, view, sparseIntArrayP, i6));
                    } else {
                        n(view);
                    }
                    i4++;
                    iArr4 = iArr;
                    asqVarArr2 = asqVarArr;
                    i3 = 0;
                }
            }
            int[] iArr5 = iArr4;
            asq[] asqVarArr3 = asqVarArr2;
            if (asqVarArr3 != null) {
                for (asq asqVar : asqVarArr3) {
                    View view2 = this.f41279a.get(asqVar.f3422a);
                    if (view2 == null) {
                        throw new IllegalViewOperationException("Trying to add unknown view tag: " + asqVar.f3422a + "\n detail: " + i(viewGroup, viewGroupManager, iArr5, asqVarArr3, iArr2));
                    }
                    viewGroupManager.addView(viewGroup, view2, v(asqVar.f3423b, sparseIntArrayP));
                }
            }
        }
    }

    public final void s(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void t(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f41279a.get(i);
        if (view == null) {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
        View view2 = (View) fxk.a(view);
        if (view2 == null) {
            throw new NoSuchNativeViewException("Native view " + i + " is no longer on screen");
        }
        g(view2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        g(view, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
    }

    public synchronized void u(int i, int[] iArr) {
        try {
            UiThreadUtil.assertOnUiThread();
            View view = this.f41279a.get(i);
            if (view == null) {
                throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int v(int i, SparseIntArray sparseIntArray) {
        int i2 = i;
        for (int i3 = 0; i3 <= i; i3++) {
            i2 += sparseIntArray.get(i3);
        }
        return i2;
    }

    public synchronized void w(int i) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (!this.c.get(i)) {
                SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
            }
            n(this.f41279a.get(i));
            this.c.delete(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View x(int i) {
        View view;
        view = this.f41279a.get(i);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager y(int i) {
        ViewManager viewManager;
        viewManager = this.f41280b.get(i);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i + " could not be found.\n View already dropped? " + Arrays.asList(this.i).contains(Integer.valueOf(i)) + ".\nLast index " + this.m + " in last 100 views" + this.i.toString());
        }
        return viewManager;
    }

    public void z(int i, int i2) {
        View view = this.f41279a.get(i);
        if (view != null) {
            view.sendAccessibilityEvent(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public zhg(f fVar, RootViewManager rootViewManager) {
        this.e = new aqd();
        this.g = new u6e();
        this.h = new SparseArray<>();
        this.i = new int[100];
        this.j = new RectF();
        this.m = 0;
        this.d = fVar;
        this.f41279a = new SparseArray<>();
        this.f41280b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.f = rootViewManager;
    }
}

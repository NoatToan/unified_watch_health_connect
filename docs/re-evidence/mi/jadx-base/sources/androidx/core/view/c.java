package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.c;
import defpackage.ct1;
import defpackage.ih4;
import defpackage.lwq;
import defpackage.m80;
import defpackage.n9h;
import defpackage.o7h;
import defpackage.o9h;
import defpackage.q80;
import defpackage.t2i;
import defpackage.tkr;
import defpackage.yqi;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, lwq> f2112a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f2113b = null;
    public static boolean c = false;
    public static final int[] d = {yqi.f40432b, yqi.c, yqi.n, yqi.y, yqi.B, yqi.C, yqi.D, yqi.E, yqi.F, yqi.G, yqi.d, yqi.e, yqi.f, yqi.g, yqi.h, yqi.i, yqi.j, yqi.f40433k, yqi.l, yqi.m, yqi.o, yqi.p, yqi.q, yqi.f40434r, yqi.s, yqi.t, yqi.u, yqi.v, yqi.w, yqi.x, yqi.z, yqi.A};
    public static final o9h e = new o9h() { // from class: fsq
        @Override // defpackage.o9h
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            return c.Y(contentInfoCompat);
        }
    };
    public static final e f = new e();

    public class a extends f<Boolean> {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        @Override // androidx.core.view.c.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f<CharSequence> {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        @Override // androidx.core.view.c.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.c$c, reason: collision with other inner class name */
    public class C0026c extends f<CharSequence> {
        public C0026c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(30)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        @Override // androidx.core.view.c.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f<Boolean> {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        @Override // androidx.core.view.c.f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.c.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f2114a = new WeakHashMap<>();

        public void a(View view) {
            this.f2114a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                c.Z(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f2114a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f2114a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f2116b;
        public final int c;
        public final int d;

        public f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public abstract T c(View view);

        public abstract void d(View view, T t);

        public T e(View view) {
            if (b()) {
                return c(view);
            }
            T t = (T) view.getTag(this.f2115a);
            if (this.f2116b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void f(View view, T t) {
            if (b()) {
                d(view, t);
            } else if (g(e(view), t)) {
                c.j(view);
                view.setTag(this.f2115a, t);
                c.Z(view, this.d);
            }
        }

        public abstract boolean g(T t, T t2);

        public f(int i, Class<T> cls, int i2, int i3) {
            this.f2115a = i;
            this.f2116b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    @RequiresApi(20)
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi(21)
    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WindowInsetsCompat f2117a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f2118b;
            public final /* synthetic */ o7h c;

            public a(View view, o7h o7hVar) {
                this.f2118b = view;
                this.c = o7hVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatY = WindowInsetsCompat.y(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.f2118b);
                    if (windowInsetsCompatY.equals(this.f2117a)) {
                        return this.c.a(view, windowInsetsCompatY).w();
                    }
                }
                this.f2117a = windowInsetsCompatY;
                WindowInsetsCompat windowInsetsCompatA = this.c.a(view, windowInsetsCompatY);
                if (i >= 30) {
                    return windowInsetsCompatA.w();
                }
                c.n0(view);
                return windowInsetsCompatA.w();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(yqi.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsW = windowInsetsCompat.w();
            if (windowInsetsW != null) {
                return WindowInsetsCompat.y(view.computeSystemWindowInsets(windowInsetsW, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static WindowInsetsCompat j(View view) {
            return WindowInsetsCompat.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, o7h o7hVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(yqi.L, o7hVar);
            }
            if (o7hVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(yqi.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, o7hVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    @RequiresApi(23)
    public static class i {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatX = WindowInsetsCompat.x(rootWindowInsets);
            windowInsetsCompatX.u(windowInsetsCompatX);
            windowInsetsCompatX.d(view.getRootView());
            return windowInsetsCompatX;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @RequiresApi(24)
    public static class j {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @RequiresApi(26)
    public static class k {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @RequiresApi(28)
    public static class l {
        public static void a(View view, final q qVar) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(yqi.R);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(yqi.R, simpleArrayMap);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: gsq
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return qVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(yqi.R);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, ct1 ct1Var) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    @RequiresApi(29)
    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void e(View view, ih4 ih4Var) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @RequiresApi(30)
    public static class n {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static androidx.core.view.d c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return androidx.core.view.d.d(windowInsetsController);
            }
            return null;
        }

        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        public static void e(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi(31)
    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat b(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoF = contentInfoCompat.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? contentInfoCompat : ContentInfoCompat.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, n9h n9hVar) {
            if (n9hVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(n9hVar));
            }
        }
    }

    @RequiresApi(31)
    public static final class p implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n9h f2119a;

        public p(n9h n9hVar) {
            this.f2119a = n9hVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompatG = ContentInfoCompat.g(contentInfo);
            ContentInfoCompat contentInfoCompatA = this.f2119a.a(view, contentInfoCompatG);
            if (contentInfoCompatA == null) {
                return null;
            }
            return contentInfoCompatA == contentInfoCompatG ? contentInfo : contentInfoCompatA.f();
        }
    }

    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class r {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f2120a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f2121b = null;
        public WeakReference<KeyEvent> c = null;

        public static r a(View view) {
            r rVar = (r) view.getTag(yqi.Q);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(yqi.Q, rVar2);
            return rVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2120a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f2121b == null) {
                this.f2121b = new SparseArray<>();
            }
            return this.f2121b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(yqi.R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2120a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f2120a == null) {
                        this.f2120a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2120a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2120a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static void A0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static void B0(View view, boolean z) {
        view.setHasTransientState(z);
    }

    @Deprecated
    public static int C(View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    public static void C0(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static String[] D(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(yqi.N);
    }

    public static void D0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingEnd();
    }

    public static void E0(View view, int i2) {
        k.m(view, i2);
    }

    @Deprecated
    public static int F(View view) {
        return view.getPaddingStart();
    }

    @Deprecated
    public static void F0(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static ViewParent G(View view) {
        return view.getParentForAccessibility();
    }

    public static void G0(View view, boolean z) {
        h.t(view, z);
    }

    public static WindowInsetsCompat H(View view) {
        return i.a(view);
    }

    public static void H0(View view, o7h o7hVar) {
        h.u(view, o7hVar);
    }

    public static CharSequence I(View view) {
        return R0().e(view);
    }

    @Deprecated
    public static void I0(View view, int i2) {
        view.setOverScrollMode(i2);
    }

    public static String J(View view) {
        return h.k(view);
    }

    @Deprecated
    public static void J0(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static float K(View view) {
        return h.l(view);
    }

    public static void K0(View view, t2i t2iVar) {
        j.d(view, (PointerIcon) (t2iVar != null ? t2iVar.a() : null));
    }

    @Deprecated
    public static androidx.core.view.d L(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return tkr.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void L0(View view, boolean z) {
        q0().f(view, Boolean.valueOf(z));
    }

    @Deprecated
    public static int M(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void M0(View view, int i2, int i3) {
        i.d(view, i2, i3);
    }

    public static float N(View view) {
        return h.m(view);
    }

    public static void N0(View view, CharSequence charSequence) {
        R0().f(view, charSequence);
    }

    public static boolean O(View view) {
        return m(view) != null;
    }

    public static void O0(View view, String str) {
        h.v(view, str);
    }

    @Deprecated
    public static boolean P(View view) {
        return view.hasOnClickListeners();
    }

    public static void P0(View view, float f2) {
        h.w(view, f2);
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.hasOverlappingRendering();
    }

    public static void Q0(View view, float f2) {
        h.x(view, f2);
    }

    @Deprecated
    public static boolean R(View view) {
        return view.hasTransientState();
    }

    public static f<CharSequence> R0() {
        return new C0026c(yqi.P, CharSequence.class, 64, 30);
    }

    public static boolean S(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    public static void S0(View view) {
        h.z(view);
    }

    @Deprecated
    public static boolean T(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean U(View view) {
        return view.isLaidOut();
    }

    public static boolean V(View view) {
        return h.p(view);
    }

    @Deprecated
    public static boolean W(View view) {
        return view.isPaddingRelative();
    }

    public static boolean X(View view) {
        Boolean boolE = q0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    public static /* synthetic */ ContentInfoCompat Y(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    public static void Z(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(o(view));
                    D0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(view.getParent().getClass().getSimpleName());
                        sb.append(" does not fully implement ViewParent");
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(o(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void a0(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static f<Boolean> b() {
        return new d(yqi.J, Boolean.class, 28);
    }

    public static void b0(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static int c(View view, CharSequence charSequence, q80 q80Var) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new m80.a(iQ, charSequence, q80Var));
        }
        return iQ;
    }

    public static WindowInsetsCompat c0(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsW = windowInsetsCompat.w();
        if (windowInsetsW != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsW);
            if (!windowInsetsB.equals(windowInsetsW)) {
                return WindowInsetsCompat.y(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void d(View view, m80.a aVar) {
        j(view);
        l0(aVar.b(), view);
        p(view).add(aVar);
        Z(view, 0);
    }

    @Deprecated
    public static void d0(View view, m80 m80Var) {
        view.onInitializeAccessibilityNodeInfo(m80Var.O0());
    }

    @Deprecated
    public static lwq e(View view) {
        if (f2112a == null) {
            f2112a = new WeakHashMap<>();
        }
        lwq lwqVar = f2112a.get(view);
        if (lwqVar != null) {
            return lwqVar;
        }
        lwq lwqVar2 = new lwq(view);
        f2112a.put(view, lwqVar2);
        return lwqVar2;
    }

    public static f<CharSequence> e0() {
        return new b(yqi.K, CharSequence.class, 8, 28);
    }

    public static WindowInsetsCompat f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    @Deprecated
    public static boolean f0(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static WindowInsetsCompat g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsW = windowInsetsCompat.w();
        if (windowInsetsW != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsW);
            if (!windowInsetsA.equals(windowInsetsW)) {
                return WindowInsetsCompat.y(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    public static ContentInfoCompat g0(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(contentInfoCompat);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, contentInfoCompat);
        }
        n9h n9hVar = (n9h) view.getTag(yqi.M);
        if (n9hVar == null) {
            return w(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = n9hVar.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        return w(view).onReceiveContent(contentInfoCompatA);
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static void h0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    @Deprecated
    public static void i0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void j(View view) {
        androidx.core.view.a aVarL = l(view);
        if (aVarL == null) {
            aVarL = new androidx.core.view.a();
        }
        r0(view, aVarL);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void j0(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    @Deprecated
    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, int i2) {
        l0(i2, view);
        Z(view, 0);
    }

    public static androidx.core.view.a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof androidx.core.view.a.C0024a ? ((androidx.core.view.a.C0024a) accessibilityDelegateM).f2108a : new androidx.core.view.a(accessibilityDelegateM);
    }

    public static void l0(int i2, View view) {
        List<m80.a> listP = p(view);
        for (int i3 = 0; i3 < listP.size(); i3++) {
            if (listP.get(i3).b() == i2) {
                listP.remove(i3);
                return;
            }
        }
    }

    public static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static void m0(View view, m80.a aVar, CharSequence charSequence, q80 q80Var) {
        if (q80Var == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, q80Var));
        }
    }

    public static View.AccessibilityDelegate n(View view) {
        if (c) {
            return null;
        }
        if (f2113b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2113b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f2113b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static void n0(View view) {
        g.c(view);
    }

    public static CharSequence o(View view) {
        return e0().e(view);
    }

    public static <T extends View> T o0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) l.f(view, i2);
        }
        T t = (T) view.findViewById(i2);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static List<m80.a> p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(yqi.H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(yqi.H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static int q(View view, CharSequence charSequence) {
        List<m80.a> listP = p(view);
        for (int i2 = 0; i2 < listP.size(); i2++) {
            if (TextUtils.equals(charSequence, listP.get(i2).c())) {
                return listP.get(i2).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = d;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z = true;
            for (int i6 = 0; i6 < listP.size(); i6++) {
                z &= listP.get(i6).b() != i5;
            }
            if (z) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    public static f<Boolean> q0() {
        return new a(yqi.O, Boolean.class, 28);
    }

    public static ColorStateList r(View view) {
        return h.g(view);
    }

    public static void r0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (m(view) instanceof androidx.core.view.a.C0024a)) {
            aVar = new androidx.core.view.a();
        }
        D0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static PorterDuff.Mode s(View view) {
        return h.h(view);
    }

    public static void s0(View view, boolean z) {
        b().f(view, Boolean.valueOf(z));
    }

    @Deprecated
    public static Rect t(View view) {
        return view.getClipBounds();
    }

    @Deprecated
    public static void t0(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    @Deprecated
    public static Display u(View view) {
        return view.getDisplay();
    }

    public static void u0(View view, CharSequence charSequence) {
        e0().f(view, charSequence);
        if (charSequence != null) {
            f.a(view);
        } else {
            f.d(view);
        }
    }

    public static float v(View view) {
        return h.i(view);
    }

    @Deprecated
    public static void v0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o9h w(View view) {
        return view instanceof o9h ? (o9h) view : e;
    }

    public static void w0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    @Deprecated
    public static boolean x(View view) {
        return view.getFitsSystemWindows();
    }

    public static void x0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    @Deprecated
    public static int y(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static void y0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    @SuppressLint({"InlinedApi"})
    public static int z(View view) {
        return k.c(view);
    }

    public static void z0(View view, float f2) {
        h.s(view, f2);
    }
}

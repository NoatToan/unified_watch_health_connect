package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import com.garmin.android.apps.connectmobile.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, g1> f6563a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f6564b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f6565c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6566d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f6567e = new n0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f6568f = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f6569a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
        }
    }

    public static class c {
        private c() {
        }

        public static WindowInsets a(View view2, WindowInsets windowInsets) {
            return w0.f6585b ? w0.a(view2, windowInsets) : view2.dispatchApplyWindowInsets(windowInsets);
        }
    }

    public static class d {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public m1 f6574a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f6575b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f6576c;

            public a(View view2, z zVar) {
                this.f6575b = view2;
                this.f6576c = zVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                m1 m1VarG = m1.g(view2, windowInsets);
                int i14 = Build.VERSION.SDK_INT;
                z zVar = this.f6576c;
                if (i14 < 30) {
                    d.a(windowInsets, this.f6575b);
                    if (m1VarG.equals(this.f6574a)) {
                        return zVar.onApplyWindowInsets(view2, m1VarG).f();
                    }
                }
                this.f6574a = m1VarG;
                m1 m1VarOnApplyWindowInsets = zVar.onApplyWindowInsets(view2, m1VarG);
                if (i14 >= 30) {
                    return m1VarOnApplyWindowInsets.f();
                }
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.requestApplyInsets();
                return m1VarOnApplyWindowInsets.f();
            }
        }

        private d() {
        }

        public static void a(WindowInsets windowInsets, View view2) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view2.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsets);
            }
        }

        public static m1 b(View view2, m1 m1Var, Rect rect) {
            WindowInsets windowInsetsF = m1Var.f();
            if (windowInsetsF != null) {
                return m1.g(view2, view2.computeSystemWindowInsets(windowInsetsF, rect));
            }
            rect.setEmpty();
            return m1Var;
        }

        public static void c(View view2, z zVar) {
            a aVar = zVar != null ? new a(view2, zVar) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view2.setTag(R.id.tag_on_apply_window_listener, aVar);
            }
            if (view2.getTag(R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (aVar != null) {
                view2.setOnApplyWindowInsetsListener(aVar);
            } else {
                view2.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view2.getTag(R.id.tag_window_insets_animation_callback));
            }
        }
    }

    public static class e {
        private e() {
        }

        public static m1 a(View view2) {
            WindowInsets rootWindowInsets = view2.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            m1 m1VarG = m1.g(null, rootWindowInsets);
            m1.r rVar = m1VarG.f6508a;
            rVar.y(m1VarG);
            View rootView = view2.getRootView();
            rVar.d(rootView);
            rVar.p(rootView);
            rVar.q();
            return m1VarG;
        }
    }

    public static class f {
        private f() {
        }

        public static void a(View view2, PointerIcon pointerIcon) {
            view2.setPointerIcon(pointerIcon);
        }
    }

    public static class g {
        private g() {
        }

        public static int a(View view2) {
            return view2.getImportantForAutofill();
        }

        public static void b(View view2, int i14) {
            view2.setImportantForAutofill(i14);
        }
    }

    public static class h {
        private h() {
        }

        public static CharSequence a(View view2) {
            return view2.getAccessibilityPaneTitle();
        }

        public static boolean b(View view2) {
            return view2.isAccessibilityHeading();
        }

        public static boolean c(View view2) {
            return view2.isScreenReaderFocusable();
        }

        public static void d(View view2, boolean z14) {
            view2.setAccessibilityHeading(z14);
        }

        public static void e(View view2, CharSequence charSequence) {
            view2.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view2, boolean z14) {
            view2.setScreenReaderFocusable(z14);
        }
    }

    public static class i {
        private i() {
        }

        public static View.AccessibilityDelegate a(View view2) {
            return view2.getAccessibilityDelegate();
        }

        public static void b(View view2, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i14, int i15) {
            view2.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i14, i15);
        }
    }

    public static class j {
        private j() {
        }

        public static WindowInsets a(View view2, WindowInsets windowInsets) {
            return view2.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view2) {
            return view2.getStateDescription();
        }

        public static o1 c(View view2) {
            WindowInsetsController windowInsetsController = view2.getWindowInsetsController();
            if (windowInsetsController != null) {
                return o1.c(windowInsetsController);
            }
            return null;
        }

        public static void d(View view2, CharSequence charSequence) {
            view2.setStateDescription(charSequence);
        }
    }

    public static final class k {
        private k() {
        }

        public static String[] a(View view2) {
            return view2.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.e b(View view2, androidx.core.view.e eVar) {
            ContentInfo contentInfoA = eVar.f6414a.a();
            Objects.requireNonNull(contentInfoA);
            ContentInfo contentInfoS = androidx.core.view.d.s(contentInfoA);
            ContentInfo contentInfoPerformReceiveContent = view2.performReceiveContent(contentInfoS);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoS ? eVar : new androidx.core.view.e(new androidx.core.view.e.C0087e(contentInfoPerformReceiveContent));
        }
    }

    @Deprecated
    public s0() {
    }

    public static int a(View view2, CharSequence charSequence, l7.h hVar) {
        int iA;
        ArrayList arrayListG = g(view2);
        int i14 = 0;
        while (true) {
            if (i14 >= arrayListG.size()) {
                int i15 = -1;
                for (int i16 = 0; i16 < 32 && i15 == -1; i16++) {
                    int i17 = f6566d[i16];
                    boolean z14 = true;
                    for (int i18 = 0; i18 < arrayListG.size(); i18++) {
                        z14 &= ((l7.f.a) arrayListG.get(i18)).a() != i17;
                    }
                    if (z14) {
                        i15 = i17;
                    }
                }
                iA = i15;
                break;
            }
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfo.AccessibilityAction) ((l7.f.a) arrayListG.get(i14)).f110581a).getLabel())) {
                iA = ((l7.f.a) arrayListG.get(i14)).a();
                break;
            }
            i14++;
        }
        if (iA != -1) {
            l7.f.a aVar = new l7.f.a(iA, charSequence, hVar);
            View.AccessibilityDelegate accessibilityDelegateE = e(view2);
            androidx.core.view.a aVar2 = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof androidx.core.view.a.C0086a ? ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a : new androidx.core.view.a(accessibilityDelegateE);
            if (aVar2 == null) {
                aVar2 = new androidx.core.view.a();
            }
            r(view2, aVar2);
            o(aVar.a(), view2);
            g(view2).add(aVar);
            j(0, view2);
        }
        return iA;
    }

    public static void b(View view2, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view2);
        View view3 = (View) view2.getParent();
        view3.getClass();
        view3.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    @Deprecated
    public static g1 c(View view2) {
        if (f6563a == null) {
            f6563a = new WeakHashMap<>();
        }
        g1 g1Var = f6563a.get(view2);
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(view2);
        f6563a.put(view2, g1Var2);
        return g1Var2;
    }

    public static m1 d(View view2, m1 m1Var) {
        WindowInsets windowInsetsF = m1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? j.a(view2, windowInsetsF) : c.a(view2, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return m1.g(view2, windowInsetsA);
            }
        }
        return m1Var;
    }

    public static View.AccessibilityDelegate e(View view2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view2);
        }
        if (f6565c) {
            return null;
        }
        if (f6564b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6564b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6565c = true;
                return null;
            }
        }
        try {
            Object obj = f6564b.get(view2);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6565c = true;
            return null;
        }
    }

    public static CharSequence f(View view2) {
        return new p0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view2);
    }

    public static ArrayList g(View view2) {
        ArrayList arrayList = (ArrayList) view2.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view2.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static o1 i(View view2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j.c(view2);
        }
        for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new o1(window, view2);
                }
                return null;
            }
        }
        return null;
    }

    public static void j(int i14, View view2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z14 = f(view2) != null && view2.isShown() && view2.getWindowVisibility() == 0;
            if (view2.getAccessibilityLiveRegion() != 0 || z14) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z14 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i14);
                if (z14) {
                    accessibilityEventObtain.getText().add(f(view2));
                    if (view2.getImportantForAccessibility() == 0) {
                        view2.setImportantForAccessibility(1);
                    }
                }
                view2.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i14 != 32) {
                if (view2.getParent() != null) {
                    try {
                        view2.getParent().notifySubtreeAccessibilityStateChanged(view2, view2, i14);
                        return;
                    } catch (AbstractMethodError unused) {
                        view2.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view2.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i14);
            accessibilityEventObtain2.setSource(view2);
            view2.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view2));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static m1 k(View view2, m1 m1Var) {
        WindowInsets windowInsetsF = m1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view2.onApplyWindowInsets(windowInsetsF);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsF)) {
                return m1.g(view2, windowInsetsOnApplyWindowInsets);
            }
        }
        return m1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002d  */
    /* JADX WARN: Code duplicated, block: B:25:0x002f  */
    public static void l(int i14, View view2) {
        int i15;
        if (i14 == -1) {
            i15 = -1;
        } else {
            int i16 = Build.VERSION.SDK_INT;
            i15 = 6;
            if (i16 < 34) {
                switch (i14) {
                    case 21:
                    case 23:
                    case 26:
                        i14 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i14 = 4;
                        break;
                    case 25:
                        i14 = 0;
                        break;
                }
            }
            if (i16 >= 30) {
                i15 = i14;
            } else if (i14 == 12) {
                i15 = 1;
            } else if (i14 != 13) {
                if (i14 == 16) {
                    i15 = 1;
                } else if (i14 != 17) {
                    i15 = i14;
                } else {
                    i15 = 0;
                }
            }
        }
        if (i15 == -1) {
            return;
        }
        view2.performHapticFeedback(i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.core.view.e m(View view2, androidx.core.view.e eVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(eVar);
            view2.getClass();
            view2.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view2, eVar);
        }
        a0 a0Var = (a0) view2.getTag(R.id.tag_on_receive_content_listener);
        b0 b0Var = f6567e;
        if (a0Var == null) {
            if (view2 instanceof b0) {
                b0Var = (b0) view2;
            }
            return b0Var.onReceiveContent(eVar);
        }
        androidx.core.view.e eVarA = a0Var.a(view2, eVar);
        if (eVarA == null) {
            return null;
        }
        if (view2 instanceof b0) {
            b0Var = (b0) view2;
        }
        return b0Var.onReceiveContent(eVarA);
    }

    public static void n(int i14, View view2) {
        o(i14, view2);
        j(0, view2);
    }

    public static void o(int i14, View view2) {
        ArrayList arrayListG = g(view2);
        for (int i15 = 0; i15 < arrayListG.size(); i15++) {
            if (((l7.f.a) arrayListG.get(i15)).a() == i14) {
                arrayListG.remove(i15);
                return;
            }
        }
    }

    public static void p(View view2, l7.f.a aVar, String str, l7.h hVar) {
        androidx.core.view.a aVar2;
        if (hVar == null && str == null) {
            n(aVar.a(), view2);
            return;
        }
        l7.f.a aVar3 = new l7.f.a(null, aVar.f110582b, str, hVar, aVar.f110583c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view2);
        if (accessibilityDelegateE == null) {
            aVar2 = null;
        } else {
            aVar2 = accessibilityDelegateE instanceof androidx.core.view.a.C0086a ? ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a : new androidx.core.view.a(accessibilityDelegateE);
        }
        if (aVar2 == null) {
            aVar2 = new androidx.core.view.a();
        }
        r(view2, aVar2);
        o(aVar3.a(), view2);
        g(view2).add(aVar3);
        j(0, view2);
    }

    public static void q(View view2, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i14, int i15) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.b(view2, context, iArr, attributeSet, typedArray, i14, i15);
        }
    }

    public static void r(View view2, androidx.core.view.a aVar) {
        if (aVar == null && (e(view2) instanceof androidx.core.view.a.C0086a)) {
            aVar = new androidx.core.view.a();
        }
        if (view2.getImportantForAccessibility() == 0) {
            view2.setImportantForAccessibility(1);
        }
        view2.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static void s(View view2, CharSequence charSequence) {
        new p0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view2, charSequence);
        a aVar = f6568f;
        if (charSequence == null) {
            aVar.f6569a.remove(view2);
            view2.removeOnAttachStateChangeListener(aVar);
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.f6569a.put(view2, Boolean.valueOf(view2.isShown() && view2.getWindowVisibility() == 0));
            view2.addOnAttachStateChangeListener(aVar);
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static void t(View view2, l1.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view2.setWindowInsetsAnimationCallback(bVar != null ? new l1.d.a(bVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = l1.c.f6475e;
        View.OnApplyWindowInsetsListener aVar = bVar != null ? new l1.c.a(view2, bVar) : null;
        view2.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (view2.getTag(R.id.tag_compat_insets_dispatch) == null && view2.getTag(R.id.tag_on_apply_window_listener) == null) {
            view2.setOnApplyWindowInsetsListener(aVar);
        }
    }

    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f6571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6573d;

        public b(int i14, Class<T> cls, int i15, int i16) {
            this.f6570a = i14;
            this.f6571b = cls;
            this.f6573d = i15;
            this.f6572c = i16;
        }

        public abstract T a(View view2);

        public abstract void b(View view2, T t7);

        public final T c(View view2) {
            if (Build.VERSION.SDK_INT >= this.f6572c) {
                return a(view2);
            }
            T t7 = (T) view2.getTag(this.f6570a);
            if (this.f6571b.isInstance(t7)) {
                return t7;
            }
            return null;
        }

        public final void d(View view2, T t7) {
            androidx.core.view.a aVar;
            if (Build.VERSION.SDK_INT >= this.f6572c) {
                b(view2, t7);
                return;
            }
            if (e(c(view2), t7)) {
                View.AccessibilityDelegate accessibilityDelegateE = s0.e(view2);
                if (accessibilityDelegateE == null) {
                    aVar = null;
                } else {
                    aVar = accessibilityDelegateE instanceof androidx.core.view.a.C0086a ? ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a : new androidx.core.view.a(accessibilityDelegateE);
                }
                if (aVar == null) {
                    aVar = new androidx.core.view.a();
                }
                s0.r(view2, aVar);
                view2.setTag(this.f6570a, t7);
                s0.j(this.f6573d, view2);
            }
        }

        public boolean e(T t7, T t14) {
            return !t14.equals(t7);
        }

        public b(int i14, Class<T> cls, int i15) {
            this(i14, cls, 0, i15);
        }
    }
}

package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class m80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f25861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f25862b = -1;
    public int c = -1;

    @RequiresApi(30)
    public static class b {
        public static Object a(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    @RequiresApi(33)
    public static class c {
        public static f a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static m80 b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return m80.Q0(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static m80 f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return m80.Q0(accessibilityNodeInfo.getParent(i));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    @RequiresApi(34)
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f25867a;

        public e(Object obj) {
            this.f25867a = obj;
        }

        public static e a(int i, int i2, boolean z) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static e b(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f25868a;

        public f(Object obj) {
            this.f25868a = obj;
        }

        public static f a(int i, int i2, int i3, int i4, boolean z) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        public static f b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f25869a;

        public g(Object obj) {
            this.f25869a = obj;
        }

        public static g a(int i, float f, float f2, float f3) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    @Deprecated
    public m80(Object obj) {
        this.f25861a = (AccessibilityNodeInfo) obj;
    }

    public static m80 P0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new m80(accessibilityNodeInfo);
    }

    public static m80 Q0(Object obj) {
        if (obj != null) {
            return new m80(obj);
        }
        return null;
    }

    public static m80 V() {
        return P0(AccessibilityNodeInfo.obtain());
    }

    public static m80 W(m80 m80Var) {
        return P0(AccessibilityNodeInfo.obtain(m80Var.f25861a));
    }

    public static m80 X(View view) {
        return P0(AccessibilityNodeInfo.obtain(view));
    }

    public static String h(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f25861a) : this.f25861a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(View view) {
        this.f25862b = -1;
        this.f25861a.setParent(view);
    }

    public String B() {
        return this.f25861a.getViewIdResourceName();
    }

    public void B0(View view, int i) {
        this.f25862b = i;
        this.f25861a.setParent(view, i);
    }

    public final boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void C0(g gVar) {
        this.f25861a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f25869a);
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f25861a) : j(64);
    }

    public void D0(CharSequence charSequence) {
        this.f25861a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean E() {
        return this.f25861a.isAccessibilityFocused();
    }

    public void E0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25861a.setScreenReaderFocusable(z);
        } else {
            c0(1, z);
        }
    }

    public boolean F() {
        return this.f25861a.isCheckable();
    }

    public void F0(boolean z) {
        this.f25861a.setScrollable(z);
    }

    public boolean G() {
        return this.f25861a.isChecked();
    }

    public void G0(boolean z) {
        this.f25861a.setSelected(z);
    }

    public boolean H() {
        return this.f25861a.isClickable();
    }

    public void H0(boolean z) {
        this.f25861a.setShowingHintText(z);
    }

    public boolean I() {
        return this.f25861a.isContextClickable();
    }

    public void I0(View view) {
        this.c = -1;
        this.f25861a.setSource(view);
    }

    public boolean J() {
        return this.f25861a.isEnabled();
    }

    public void J0(View view, int i) {
        this.c = i;
        this.f25861a.setSource(view, i);
    }

    public boolean K() {
        return this.f25861a.isFocusable();
    }

    public void K0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f25861a, charSequence);
        } else {
            this.f25861a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean L() {
        return this.f25861a.isFocused();
    }

    public void L0(CharSequence charSequence) {
        this.f25861a.setText(charSequence);
    }

    public boolean M() {
        return j(67108864);
    }

    public void M0(View view) {
        this.f25861a.setTraversalAfter(view);
    }

    public boolean N() {
        return this.f25861a.isImportantForAccessibility();
    }

    public void N0(boolean z) {
        this.f25861a.setVisibleToUser(z);
    }

    public boolean O() {
        return this.f25861a.isLongClickable();
    }

    public AccessibilityNodeInfo O0() {
        return this.f25861a;
    }

    public boolean P() {
        return this.f25861a.isPassword();
    }

    public boolean Q() {
        return this.f25861a.isScrollable();
    }

    public boolean R() {
        return this.f25861a.isSelected();
    }

    public boolean S() {
        return this.f25861a.isShowingHintText();
    }

    public boolean T() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f25861a) : j(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
    }

    public boolean U() {
        return this.f25861a.isVisibleToUser();
    }

    public boolean Y(int i, Bundle bundle) {
        return this.f25861a.performAction(i, bundle);
    }

    @Deprecated
    public void Z() {
    }

    public void a(int i) {
        this.f25861a.addAction(i);
    }

    public boolean a0(a aVar) {
        return this.f25861a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f25865a);
    }

    public void b(a aVar) {
        this.f25861a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f25865a);
    }

    public void b0(boolean z) {
        this.f25861a.setAccessibilityFocused(z);
    }

    public void c(View view) {
        this.f25861a.addChild(view);
    }

    public final void c0(int i, boolean z) {
        Bundle bundleT = t();
        if (bundleT != null) {
            int i2 = bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleT.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void d(View view, int i) {
        this.f25861a.addChild(view, i);
    }

    @Deprecated
    public void d0(Rect rect) {
        this.f25861a.setBoundsInParent(rect);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void e(CharSequence charSequence, View view) {
    }

    public void e0(Rect rect) {
        this.f25861a.setBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f25861a;
        if (accessibilityNodeInfo == null) {
            if (m80Var.f25861a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(m80Var.f25861a)) {
            return false;
        }
        return this.c == m80Var.c && this.f25862b == m80Var.f25862b;
    }

    public final List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = this.f25861a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f25861a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void f0(boolean z) {
        this.f25861a.setCanOpenPopup(z);
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f25861a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void g0(boolean z) {
        this.f25861a.setCheckable(z);
    }

    public void h0(boolean z) {
        this.f25861a.setChecked(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f25861a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f25861a.getActions();
    }

    public void i0(CharSequence charSequence) {
        this.f25861a.setClassName(charSequence);
    }

    public final boolean j(int i) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public void j0(boolean z) {
        this.f25861a.setClickable(z);
    }

    @Deprecated
    public void k(Rect rect) {
        this.f25861a.getBoundsInParent(rect);
    }

    public void k0(Object obj) {
        this.f25861a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f25867a);
    }

    public void l(Rect rect) {
        this.f25861a.getBoundsInScreen(rect);
    }

    public void l0(Object obj) {
        this.f25861a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f25868a);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f25861a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f25861a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(CharSequence charSequence) {
        this.f25861a.setContentDescription(charSequence);
    }

    public int n() {
        return this.f25861a.getChildCount();
    }

    public void n0(boolean z) {
        this.f25861a.setDismissable(z);
    }

    public CharSequence o() {
        return this.f25861a.getClassName();
    }

    public void o0(boolean z) {
        this.f25861a.setEnabled(z);
    }

    public void p0(CharSequence charSequence) {
        this.f25861a.setError(charSequence);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f25861a) : this.f25861a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z) {
        this.f25861a.setFocusable(z);
    }

    public CharSequence r() {
        return this.f25861a.getContentDescription();
    }

    public void r0(boolean z) {
        this.f25861a.setFocused(z);
    }

    public CharSequence s() {
        return this.f25861a.getError();
    }

    public void s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25861a.setHeading(z);
        } else {
            c0(2, z);
        }
    }

    public Bundle t() {
        return this.f25861a.getExtras();
    }

    public void t0(CharSequence charSequence) {
        this.f25861a.setHintText(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(w());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(y());
        sb.append("; error: ");
        sb.append(s());
        sb.append("; maxTextLength: ");
        sb.append(u());
        sb.append("; stateDescription: ");
        sb.append(x());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; tooltipText: ");
        sb.append(z());
        sb.append("; viewIdResName: ");
        sb.append(B());
        sb.append("; uniqueId: ");
        sb.append(A());
        sb.append("; checkable: ");
        sb.append(F());
        sb.append("; checked: ");
        sb.append(G());
        sb.append("; focusable: ");
        sb.append(K());
        sb.append("; focused: ");
        sb.append(L());
        sb.append("; selected: ");
        sb.append(R());
        sb.append("; clickable: ");
        sb.append(H());
        sb.append("; longClickable: ");
        sb.append(O());
        sb.append("; contextClickable: ");
        sb.append(I());
        sb.append("; enabled: ");
        sb.append(J());
        sb.append("; password: ");
        sb.append(P());
        sb.append("; scrollable: " + Q());
        sb.append("; containerTitle: ");
        sb.append(q());
        sb.append("; granularScrollingSupported: ");
        sb.append(M());
        sb.append("; importantForAccessibility: ");
        sb.append(N());
        sb.append("; visible: ");
        sb.append(U());
        sb.append("; isTextSelectable: ");
        sb.append(T());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(D());
        sb.append("; [");
        List<a> listG = g();
        for (int i = 0; i < listG.size(); i++) {
            a aVar = listG.get(i);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb.append(strH);
            if (i != listG.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f25861a.getMaxTextLength();
    }

    public void u0(View view) {
        this.f25861a.setLabelFor(view);
    }

    public int v() {
        return this.f25861a.getMovementGranularities();
    }

    public void v0(boolean z) {
        this.f25861a.setLongClickable(z);
    }

    public CharSequence w() {
        return this.f25861a.getPackageName();
    }

    public void w0(int i) {
        this.f25861a.setMaxTextLength(i);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f25861a) : this.f25861a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(int i) {
        this.f25861a.setMovementGranularities(i);
    }

    public CharSequence y() {
        if (!C()) {
            return this.f25861a.getText();
        }
        List<Integer> listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f25861a.getText(), 0, this.f25861a.getText().length()));
        for (int i = 0; i < listF.size(); i++) {
            spannableString.setSpan(new r70(listF4.get(i).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listF.get(i).intValue(), listF2.get(i).intValue(), listF3.get(i).intValue());
        }
        return spannableString;
    }

    public void y0(CharSequence charSequence) {
        this.f25861a.setPackageName(charSequence);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f25861a.getTooltipText() : this.f25861a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25861a.setPaneTitle(charSequence);
        } else {
            this.f25861a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        @OptIn(markerClass = {BuildCompat.a.class})
        public static final a V;
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f25863k = new a(64, null);
        public static final a l = new a(128, null);
        public static final a m = new a(256, (CharSequence) null, (Class<? extends q80.a>) q80.b.class);
        public static final a n = new a(512, (CharSequence) null, (Class<? extends q80.a>) q80.b.class);
        public static final a o = new a(1024, (CharSequence) null, (Class<? extends q80.a>) q80.c.class);
        public static final a p = new a(2048, (CharSequence) null, (Class<? extends q80.a>) q80.c.class);
        public static final a q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f25864r = new a(8192, null);
        public static final a s = new a(16384, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, (Class<? extends q80.a>) q80.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(EventRecurrence.TH, null);
        public static final a z = new a(2097152, (CharSequence) null, (Class<? extends q80.a>) q80.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f25865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25866b;
        public final Class<? extends q80.a> c;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final q80 d;

        static {
            int i2 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, q80.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q80.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, q80.d.class);
            N = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i2 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, q80 q80Var) {
            return new a(null, this.f25866b, charSequence, q80Var, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f25865a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f25865a).getLabel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            if (this.d == null) {
                return false;
            }
            Class<? extends q80.a> cls = this.c;
            q80.a aVar = null;
            if (cls != null) {
                try {
                    q80.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception unused) {
                        aVar = aVarNewInstance;
                        Class<? extends q80.a> cls2 = this.c;
                        String name = cls2 == null ? AbstractJsonLexerKt.NULL : cls2.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                        sb.append(name);
                    }
                } catch (Exception unused2) {
                }
            }
            return this.d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f25865a;
            if (obj2 == null) {
                return aVar.f25865a == null;
            }
            return obj2.equals(aVar.f25865a);
        }

        public int hashCode() {
            Object obj = this.f25865a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strH = m80.h(this.f25866b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb.append(strH);
            return sb.toString();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a(int i2, CharSequence charSequence, q80 q80Var) {
            this(null, i2, charSequence, q80Var, null);
        }

        public a(int i2, CharSequence charSequence, Class<? extends q80.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i2, CharSequence charSequence, q80 q80Var, Class<? extends q80.a> cls) {
            this.f25866b = i2;
            this.d = q80Var;
            if (obj == null) {
                this.f25865a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.f25865a = obj;
            }
            this.c = cls;
        }
    }

    public m80(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f25861a = accessibilityNodeInfo;
    }
}

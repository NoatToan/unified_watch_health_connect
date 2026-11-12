package l7;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f110563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110564b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110565c = -1;

    public static class b {
        private b() {
        }

        public static AccessibilityNodeInfo.RangeInfo a(int i14, float f14, float f15, float f16) {
            return new AccessibilityNodeInfo.RangeInfo(i14, f14, f15, f16);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        private c() {
        }

        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static class d {
        private d() {
        }

        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z14) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z14);
        }
    }

    public static class e {
        private e() {
        }

        public static int a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: renamed from: l7.f$f, reason: collision with other inner class name */
    public static class C2111f {
        private C2111f() {
        }

        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110585a;

        public g(Object obj) {
            this.f110585a = obj;
        }

        public static g a(int i14, int i15, int i16, boolean z14) {
            return new g(AccessibilityNodeInfo.CollectionInfo.obtain(i14, i15, z14, i16));
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110586a;

        public h(Object obj) {
            this.f110586a = obj;
        }

        public static h a(int i14, int i15, int i16, int i17, boolean z14, boolean z15) {
            return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i14, i15, i16, i17, z14, z15));
        }
    }

    @Deprecated
    public f(Object obj) {
        this.f110563a = (AccessibilityNodeInfo) obj;
    }

    public static String d(int i14) {
        if (i14 == 1) {
            return "ACTION_FOCUS";
        }
        if (i14 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i14) {
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
            case PLAN_CHANGE_VALUE:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i14) {
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
                        switch (i14) {
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
                                switch (i14) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i14) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public static f h() {
        return new f(AccessibilityNodeInfo.obtain());
    }

    public static f i(View view2) {
        return new f(AccessibilityNodeInfo.obtain(view2));
    }

    public static f j(f fVar) {
        return new f(AccessibilityNodeInfo.obtain(fVar.f110563a));
    }

    public static f v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new f(accessibilityNodeInfo);
    }

    public final void a(int i14) {
        this.f110563a.addAction(i14);
    }

    public final void b(a aVar) {
        this.f110563a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f110581a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f110563a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i14) {
        Bundle extras = this.f110563a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i14) == i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f110563a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f110563a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f110565c == fVar.f110565c && this.f110564b == fVar.f110564b;
    }

    @Deprecated
    public final void f(Rect rect) {
        this.f110563a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean zIsEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f110563a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListC = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListC2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListC3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListC4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i14 = 0; i14 < arrayListC.size(); i14++) {
            spannableString.setSpan(new l7.a(((Integer) arrayListC4.get(i14)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListC.get(i14)).intValue(), ((Integer) arrayListC2.get(i14)).intValue(), ((Integer) arrayListC3.get(i14)).intValue());
        }
        return spannableString;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f110563a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void k(a aVar) {
        this.f110563a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f110581a);
    }

    public final void l(boolean z14) {
        this.f110563a.setCheckable(z14);
    }

    @Deprecated
    public final void m(boolean z14) {
        this.f110563a.setChecked(z14);
    }

    public final void n(CharSequence charSequence) {
        this.f110563a.setClassName(charSequence);
    }

    public final void o(boolean z14) {
        this.f110563a.setClickable(z14);
    }

    public final void p(g gVar) {
        this.f110563a.setCollectionInfo(gVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) gVar.f110585a);
    }

    public final void q(h hVar) {
        this.f110563a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) hVar.f110586a);
    }

    public final void r(CharSequence charSequence) {
        this.f110563a.setContentDescription(charSequence);
    }

    public final void s(boolean z14) {
        this.f110563a.setScrollable(z14);
    }

    public final void t(boolean z14) {
        this.f110563a.setSelected(z14);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb3.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f110563a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb3.append("; boundsInScreen: " + rect);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            d.b(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb3.append("; boundsInWindow: " + rect);
        sb3.append("; packageName: ");
        sb3.append(accessibilityNodeInfo.getPackageName());
        sb3.append("; className: ");
        sb3.append(accessibilityNodeInfo.getClassName());
        sb3.append("; text: ");
        sb3.append(g());
        sb3.append("; error: ");
        sb3.append(accessibilityNodeInfo.getError());
        sb3.append("; maxTextLength: ");
        sb3.append(accessibilityNodeInfo.getMaxTextLength());
        sb3.append("; stateDescription: ");
        sb3.append(i14 >= 30 ? b.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb3.append("; contentDescription: ");
        sb3.append(accessibilityNodeInfo.getContentDescription());
        sb3.append("; supplementalDescription: ");
        sb3.append(i14 >= 36 ? e.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb3.append("; tooltipText: ");
        sb3.append(accessibilityNodeInfo.getTooltipText());
        sb3.append("; viewIdResName: ");
        sb3.append(accessibilityNodeInfo.getViewIdResourceName());
        sb3.append("; uniqueId: ");
        sb3.append(i14 >= 33 ? c.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb3.append("; checkable: ");
        sb3.append(accessibilityNodeInfo.isCheckable());
        sb3.append("; checked: ");
        int iA = i14 >= 36 ? e.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb3.append(iA == 1 ? "TRUE" : iA == 2 ? "PARTIAL" : "FALSE");
        sb3.append("; fieldRequired: ");
        sb3.append(i14 >= 36 ? e.d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb3.append("; focusable: ");
        sb3.append(accessibilityNodeInfo.isFocusable());
        sb3.append("; focused: ");
        sb3.append(accessibilityNodeInfo.isFocused());
        sb3.append("; selected: ");
        sb3.append(accessibilityNodeInfo.isSelected());
        sb3.append("; clickable: ");
        sb3.append(accessibilityNodeInfo.isClickable());
        sb3.append("; longClickable: ");
        sb3.append(accessibilityNodeInfo.isLongClickable());
        sb3.append("; contextClickable: ");
        sb3.append(accessibilityNodeInfo.isContextClickable());
        sb3.append("; expandedState: ");
        int iB = i14 >= 36 ? e.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (iB == 0) {
            str = "UNDEFINED";
        } else if (iB == 1) {
            str = "COLLAPSED";
        } else if (iB != 2) {
            str = iB != 3 ? "UNKNOWN" : "FULL";
        }
        sb3.append(str);
        sb3.append("; enabled: ");
        sb3.append(accessibilityNodeInfo.isEnabled());
        sb3.append("; password: ");
        sb3.append(accessibilityNodeInfo.isPassword());
        sb3.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb3.append("; containerTitle: ");
        sb3.append(i14 >= 34 ? d.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb3.append("; granularScrollingSupported: ");
        sb3.append(e(67108864));
        sb3.append("; importantForAccessibility: ");
        sb3.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb3.append("; visible: ");
        sb3.append(accessibilityNodeInfo.isVisibleToUser());
        sb3.append("; isTextSelectable: ");
        sb3.append(i14 >= 33 ? c.b(accessibilityNodeInfo) : e(8388608));
        sb3.append("; accessibilityDataSensitive: ");
        sb3.append(i14 >= 34 ? d.d(accessibilityNodeInfo) : e(64));
        sb3.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new a(actionList.get(i15)));
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            a aVar = (a) arrayList.get(i16);
            int iA2 = aVar.a();
            Object obj = aVar.f110581a;
            String strD = d(iA2);
            if (strD.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb3.append(strD);
            if (i16 != arrayList.size() - 1) {
                sb3.append(", ");
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    public final void u(CharSequence charSequence) {
        this.f110563a.setText(charSequence);
    }

    private f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f110563a = accessibilityNodeInfo;
    }

    public static class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f110566e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f110567f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f110568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f110569h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f110570i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f110571j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f110572k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f110573l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f110574m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f110575n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f110576o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f110577p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f110578q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f110579r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f110580s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f110582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<? extends l7.h.a> f110583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l7.h f110584d;

        /* JADX WARN: Code duplicated, block: B:54:0x0247  */
        static {
            boolean z14;
            new a(4, null);
            new a(8, null);
            f110568g = new a(16, null);
            new a(32, null);
            f110569h = new a(64, null);
            f110570i = new a(128, null);
            new a(256, (CharSequence) null, (Class<? extends l7.h.a>) l7.h.b.class);
            new a(512, (CharSequence) null, (Class<? extends l7.h.a>) l7.h.b.class);
            new a(1024, (CharSequence) null, (Class<? extends l7.h.a>) l7.h.c.class);
            new a(2048, (CharSequence) null, (Class<? extends l7.h.a>) l7.h.c.class);
            f110571j = new a(4096, null);
            f110572k = new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, (CharSequence) null, (Class<? extends l7.h.a>) l7.h.g.class);
            f110573l = new a(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, null);
            f110574m = new a(524288, null);
            f110575n = new a(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
            new a(2097152, (CharSequence) null, (Class<? extends l7.h.a>) l7.h.C2112h.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l7.h.e.class);
            f110576o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f110577p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f110578q = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f110579r = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            int i14 = Build.VERSION.SDK_INT;
            new a(i14 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new a(i14 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new a(i14 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new a(i14 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f110580s = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l7.h.f.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, l7.h.d.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i14 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new a(i14 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new a(i14 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new a(i14 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new a(i14 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new a(i14 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            new a(i14 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
            int i15 = h7.a.f82320a;
            if (i14 >= 36) {
                z14 = (i14 < 36 ? i14 * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001;
            }
            new a(z14 ? C2111f.a() : null, R.id.ALT, null, null, null);
        }

        public a(Object obj, int i14, CharSequence charSequence, l7.h hVar, Class<? extends l7.h.a> cls) {
            this.f110582b = i14;
            this.f110584d = hVar;
            if (obj == null) {
                this.f110581a = new AccessibilityNodeInfo.AccessibilityAction(i14, charSequence);
            } else {
                this.f110581a = obj;
            }
            this.f110583c = cls;
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f110581a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f110581a;
            Object obj3 = this.f110581a;
            if (obj3 == null) {
                return obj2 == null;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f110581a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AccessibilityActionCompat: ");
            String strD = f.d(this.f110582b);
            if (strD.equals("ACTION_UNKNOWN")) {
                Object obj = this.f110581a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb3.append(strD);
            return sb3.toString();
        }

        public a(int i14, CharSequence charSequence, l7.h hVar) {
            this(null, i14, charSequence, hVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i14, CharSequence charSequence, Class<? extends l7.h.a> cls) {
            this(null, i14, charSequence, null, cls);
        }

        public a(int i14, CharSequence charSequence) {
            this(null, i14, charSequence, null, null);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110587a;

        public i(int i14, float f14, float f15, float f16) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f110587a = b.a(i14, f14, f15, f16);
            } else {
                this.f110587a = AccessibilityNodeInfo.RangeInfo.obtain(i14, f14, f15, f16);
            }
        }

        public i(Object obj) {
            this.f110587a = obj;
        }
    }
}

package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    public static final class C0086a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f6402a;

        public C0086a(a aVar) {
            this.f6402a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            return this.f6402a.dispatchPopulateAccessibilityEvent(view2, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view2) {
            l7.g accessibilityNodeProvider = this.f6402a.getAccessibilityNodeProvider(view2);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f110588a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            this.f6402a.onInitializeAccessibilityEvent(view2, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfo accessibilityNodeInfo) {
            l7.f fVarV = l7.f.v(accessibilityNodeInfo);
            AccessibilityNodeInfo accessibilityNodeInfo2 = fVarV.f110563a;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            Boolean boolC = new o0(R.id.tag_screen_reader_focusable, Boolean.class, 28).c(view2);
            accessibilityNodeInfo2.setScreenReaderFocusable(boolC != null && boolC.booleanValue());
            Boolean boolC2 = new r0(R.id.tag_accessibility_heading, Boolean.class, 28).c(view2);
            accessibilityNodeInfo2.setHeading(boolC2 != null && boolC2.booleanValue());
            accessibilityNodeInfo2.setPaneTitle(s0.f(view2));
            CharSequence charSequenceC = new q0(R.id.tag_state_description, CharSequence.class, 64, 30).c(view2);
            if (Build.VERSION.SDK_INT >= 30) {
                l7.f.b.c(accessibilityNodeInfo2, charSequenceC);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequenceC);
            }
            this.f6402a.onInitializeAccessibilityNodeInfo(view2, fVarV);
            accessibilityNodeInfo.getText();
            List<l7.f.a> actionList = a.getActionList(view2);
            for (int i14 = 0; i14 < actionList.size(); i14++) {
                fVarV.b(actionList.get(i14));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            this.f6402a.onPopulateAccessibilityEvent(view2, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
            return this.f6402a.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view2, int i14, Bundle bundle) {
            return this.f6402a.performAccessibilityAction(view2, i14, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view2, int i14) {
            this.f6402a.sendAccessibilityEvent(view2, i14);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view2, AccessibilityEvent accessibilityEvent) {
            this.f6402a.sendAccessibilityEventUnchecked(view2, accessibilityEvent);
        }
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0086a(this);
    }

    public static List<l7.f.a> getActionList(View view2) {
        List<l7.f.a> list = (List) view2.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view2) {
        if (clickableSpan != null) {
            CharSequence text = view2.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i14 = 0; clickableSpanArr != null && i14 < clickableSpanArr.length; i14++) {
                if (clickableSpan.equals(clickableSpanArr[i14])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i14, View view2) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i14)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view2)) {
            return false;
        }
        clickableSpan.onClick(view2);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view2, accessibilityEvent);
    }

    public l7.g getAccessibilityNodeProvider(View view2) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view2);
        if (accessibilityNodeProvider != null) {
            return new l7.g(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view2, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view2, fVar.f110563a);
    }

    public void onPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view2, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view2, int i14, Bundle bundle) {
        List<l7.f.a> actionList = getActionList(view2);
        boolean zPerformAccessibilityAction = false;
        for (int i15 = 0; i15 < actionList.size(); i15++) {
            l7.f.a aVar = actionList.get(i15);
            if (aVar.a() == i14) {
                Class<? extends l7.h.a> cls = aVar.f110583c;
                l7.h hVar = aVar.f110584d;
                if (hVar == null) {
                    break;
                }
                l7.h.a aVar2 = null;
                if (cls != null) {
                    try {
                        l7.h.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                        try {
                            aVarNewInstance.getClass();
                        } catch (Exception unused) {
                        }
                        aVar2 = aVarNewInstance;
                    } catch (Exception unused2) {
                    }
                }
                zPerformAccessibilityAction = hVar.perform(view2, aVar2);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view2, i14, bundle);
        }
        return (zPerformAccessibilityAction || i14 != R.id.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view2);
    }

    public void sendAccessibilityEvent(View view2, int i14) {
        this.mOriginalDelegate.sendAccessibilityEvent(view2, i14);
    }

    public void sendAccessibilityEventUnchecked(View view2, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view2, accessibilityEvent);
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }
}

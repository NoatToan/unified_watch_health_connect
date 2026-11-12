package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.m80;
import defpackage.n80;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f2961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2962b;

    public static class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f2963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<View, androidx.core.view.a> f2964b = new WeakHashMap();

        public a(u uVar) {
            this.f2963a = uVar;
        }

        public androidx.core.view.a a(View view) {
            return this.f2964b.remove(view);
        }

        public void b(View view) {
            androidx.core.view.a aVarL = androidx.core.view.c.l(view);
            if (aVarL == null || aVarL == this) {
                return;
            }
            this.f2964b.put(view, aVarL);
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f2964b.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public n80 getAccessibilityNodeProvider(View view) {
            androidx.core.view.a aVar = this.f2964b.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f2964b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) m80 m80Var) {
            if (this.f2963a.b() || this.f2963a.f2961a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
                return;
            }
            this.f2963a.f2961a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, m80Var);
            androidx.core.view.a aVar = this.f2964b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, m80Var);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f2964b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f2964b.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f2963a.b() || this.f2963a.f2961a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            androidx.core.view.a aVar = this.f2964b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f2963a.f2961a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEvent(View view, int i) {
            androidx.core.view.a aVar = this.f2964b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f2964b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public u(RecyclerView recyclerView) {
        this.f2961a = recyclerView;
        androidx.core.view.a aVarA = a();
        if (aVarA == null || !(aVarA instanceof a)) {
            this.f2962b = new a(this);
        } else {
            this.f2962b = (a) aVarA;
        }
    }

    public androidx.core.view.a a() {
        return this.f2962b;
    }

    public boolean b() {
        return this.f2961a.hasPendingAdapterUpdates();
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || b()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) m80 m80Var) {
        super.onInitializeAccessibilityNodeInfo(view, m80Var);
        if (b() || this.f2961a.getLayoutManager() == null) {
            return;
        }
        this.f2961a.getLayoutManager().onInitializeAccessibilityNodeInfo(m80Var);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (b() || this.f2961a.getLayoutManager() == null) {
            return false;
        }
        return this.f2961a.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}

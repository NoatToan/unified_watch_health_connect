package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends androidx.core.view.a {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    public static class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f10455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakHashMap f10456b = new WeakHashMap();

        public a(f0 f0Var) {
            this.f10455a = f0Var;
        }

        @Override // androidx.core.view.a
        public final boolean dispatchPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view2, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view2, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public final l7.g getAccessibilityNodeProvider(View view2) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view2) : super.getAccessibilityNodeProvider(view2);
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view2, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view2, @SuppressLint({"InvalidNullabilityOverride"}) l7.f fVar) {
            f0 f0Var = this.f10455a;
            if (f0Var.shouldIgnore() || f0Var.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view2, fVar);
                return;
            }
            f0Var.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view2, fVar);
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view2, fVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view2, fVar);
            }
        }

        @Override // androidx.core.view.a
        public final void onPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view2, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view2, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public final boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view2, int i14, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            f0 f0Var = this.f10455a;
            if (f0Var.shouldIgnore() || f0Var.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view2, i14, bundle);
            }
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view2, i14, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view2, i14, bundle)) {
                return true;
            }
            return f0Var.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view2, i14, bundle);
        }

        @Override // androidx.core.view.a
        public final void sendAccessibilityEvent(View view2, int i14) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view2, i14);
            } else {
                super.sendAccessibilityEvent(view2, i14);
            }
        }

        @Override // androidx.core.view.a
        public final void sendAccessibilityEventUnchecked(View view2, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f10456b.get(view2);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view2, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view2, accessibilityEvent);
            }
        }
    }

    public f0(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        androidx.core.view.a itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    public androidx.core.view.a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view2, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
        if (!(view2 instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view2;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view2, @SuppressLint({"InvalidNullabilityOverride"}) l7.f fVar) {
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(fVar);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view2, int i14, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view2, i14, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i14, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}

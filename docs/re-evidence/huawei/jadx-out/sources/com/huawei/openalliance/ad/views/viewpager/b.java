package com.huawei.openalliance.ad.views.viewpager;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes41.dex */
class b extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f21373a;

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        e eVar;
        int i2;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.f21373a.canScrollHorizontally(-1)) {
                return false;
            }
            eVar = this.f21373a;
            i2 = eVar.f21377a - 1;
        } else {
            if (!this.f21373a.canScrollHorizontally(1)) {
                return false;
            }
            eVar = this.f21373a;
            i2 = eVar.f21377a + 1;
        }
        eVar.setCurrentItem(i2);
        return true;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(e.class.getName());
        accessibilityNodeInfo.setScrollable(a());
        if (this.f21373a.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (this.f21373a.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(e.class.getName());
        accessibilityEvent.setScrollable(a());
        if (accessibilityEvent.getEventType() != 4096 || this.f21373a.f21378b == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.f21373a.f21378b.a());
        accessibilityEvent.setFromIndex(this.f21373a.f21377a);
        accessibilityEvent.setToIndex(this.f21373a.f21377a);
    }

    private boolean a() {
        return this.f21373a.f21378b != null && this.f21373a.f21378b.a() > 1;
    }

    public b(e eVar) {
        this.f21373a = eVar;
    }
}

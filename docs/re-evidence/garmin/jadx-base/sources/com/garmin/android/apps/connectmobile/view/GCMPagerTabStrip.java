package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import d53.u;
import l7.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/GCMPagerTabStrip;", "Lfe/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMPagerTabStrip extends fe.b {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/GCMPagerTabStrip$a", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f47454b;

        public a(String str, String str2) {
            this.f47453a = str;
            this.f47454b = str2;
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.t(u.q(this.f47453a, this.f47454b, true));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GCMPagerTabStrip(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestSendAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
        if ((view2 instanceof TextView) && (getParent() instanceof ViewPager)) {
            String string = ((TextView) view2).getText().toString();
            ViewParent parent = getParent();
            parent.getClass();
            ViewPager viewPager = (ViewPager) parent;
            int currentItem = viewPager.getCurrentItem();
            fe.a adapter = viewPager.getAdapter();
            s0.r(view2, new a(string, String.valueOf(adapter != null ? adapter.getPageTitle(currentItem) : null)));
        }
        return super.onRequestSendAccessibilityEvent(view2, accessibilityEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMPagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ GCMPagerTabStrip(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}

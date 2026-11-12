package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/d;", "Landroidx/core/view/a;", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f40566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40567b;

    public d(c cVar, int i14) {
        this.f40566a = cVar;
        this.f40567b = i14;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        fVar.l(true);
        c cVar = this.f40566a;
        fVar.m(p005kotlin.jvm.internal.s.g(cVar.f40563d.get(cVar.f40561b.get(this.f40567b)), Boolean.TRUE));
    }
}

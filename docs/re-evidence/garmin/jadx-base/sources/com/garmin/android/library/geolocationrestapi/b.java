package com.garmin.android.library.geolocationrestapi;

import android.view.View;
import l7.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/library/geolocationrestapi/b;", "Landroidx/core/view/a;", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.C0996a f50153a;

    public b(a.C0996a c0996a) {
        this.f50153a = c0996a;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        fVar.t(this.f50153a.f50152a.isSelected());
    }
}

package com.garmin.android.apps.connectmobile.contacts;

import android.view.View;
import f20.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/f;", "Landroidx/core/view/a;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f32709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f32710b;

    public f(o oVar, g.a aVar) {
        this.f32709a = oVar;
        this.f32710b = aVar;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        if (!this.f32709a.f68410f) {
            fVar.l(false);
        } else {
            fVar.l(true);
            fVar.m(this.f32710b.f32719d.isChecked());
        }
    }
}

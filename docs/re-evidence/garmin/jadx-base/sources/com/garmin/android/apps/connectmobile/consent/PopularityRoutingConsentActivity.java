package com.garmin.android.apps.connectmobile.consent;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import e23.l;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.y;
import wd2.h0;
import z10.e1;
import z10.h1;
import z10.k1;
import z10.l1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/PopularityRoutingConsentActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PopularityRoutingConsentActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32209d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f32210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f32211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f32212c = new w1(s0.f105811a.b(e1.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32213a;

        public b(l lVar) {
            lVar.getClass();
            this.f32213a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32213a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32213a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32214a;

        public c(g gVar) {
            this.f32214a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32214a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32215a;

        public d(g gVar) {
            this.f32215a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32215a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f32217b;

        public e(e23.a aVar, g gVar) {
            this.f32216a = aVar;
            this.f32217b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32216a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32217b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f32211b;
        if (gCMComplexOneLineButton == null) {
            s.m("mConsentToggle");
            throw null;
        }
        if (gCMComplexOneLineButton.f47771k.isChecked() == (this.f32210a == y.OPT_IN)) {
            super.onBackPressed();
            return;
        }
        showProgressOverlay();
        h0 h0Var = new h0(this, 15);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f32211b;
        if (gCMComplexOneLineButton2 == null) {
            s.m("mConsentToggle");
            throw null;
        }
        boolean zIsChecked = gCMComplexOneLineButton2.f47771k.isChecked();
        w1 w1Var = this.f32212c;
        if (zIsChecked) {
            e1 e1Var = (e1) w1Var.getValue();
            q92.d dVar = q92.d.POPULARITY_ROUTING;
            dVar.getClass();
            y0 y0Var = new y0();
            ge1.b.T(v1.a(e1Var), null, null, new k1(y0Var, dVar, null), 3);
            y0Var.f(this, h0Var);
            return;
        }
        e1 e1Var2 = (e1) w1Var.getValue();
        q92.d dVar2 = q92.d.POPULARITY_ROUTING;
        dVar2.getClass();
        y0 y0Var2 = new y0();
        ge1.b.T(v1.a(e1Var2), null, null, new l1(y0Var2, dVar2, null), 3);
        y0Var2.f(this, h0Var);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.consent_popularity_layout);
        initActionBar(true, getString(R.string.popularity_routing));
        View viewFindViewById = findViewById(R.id.popularity_routing_btn);
        viewFindViewById.getClass();
        this.f32211b = (GCMComplexOneLineButton) viewFindViewById;
        showProgressOverlay();
        e1 e1Var = (e1) this.f32212c.getValue();
        q92.d dVar = q92.d.POPULARITY_ROUTING;
        dVar.getClass();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(e1Var), null, null, new h1(y0Var, dVar, null), 3);
        y0Var.f(this, new b(new yw2.h(this, 2)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/PopularityRoutingConsentActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

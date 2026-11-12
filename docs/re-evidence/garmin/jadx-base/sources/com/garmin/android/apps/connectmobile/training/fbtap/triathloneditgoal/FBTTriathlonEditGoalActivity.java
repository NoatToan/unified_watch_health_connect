package com.garmin.android.apps.connectmobile.training.fbtap.triathloneditgoal;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import fg0.j;
import fg0.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/triathloneditgoal/FBTTriathlonEditGoalActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTTriathlonEditGoalActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45524b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45525a = new w1(s0.f105811a.b(xv1.d.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45526a;

        public b(g gVar) {
            this.f45526a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45526a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45527a;

        public c(g gVar) {
            this.f45527a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45527a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45529b;

        public d(e23.a aVar, g gVar) {
            this.f45528a = aVar;
            this.f45529b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45528a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45529b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if ((i14 == 204 || i14 == 206 || i14 == 207) && i15 == -1 && intent != null) {
            l2.f37135b.getClass();
            Bundle bundleA = l2.a.a(intent);
            if (bundleA != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_sharable_event_dto", k.class);
                } else {
                    Parcelable parcelable2 = bundleA.getParcelable("GCM_extra_sharable_event_dto");
                    if (!(parcelable2 instanceof k)) {
                        parcelable2 = null;
                    }
                    parcelable = (k) parcelable2;
                }
                k kVar = (k) parcelable;
                if (kVar != null) {
                    p2 p2Var = ((xv1.d) this.f45525a.getValue()).I;
                    j eventCustomization = kVar.getEventCustomization();
                    k kVar2 = (k) p2Var.getValue();
                    if (kVar2 != null) {
                        p2Var.k(null, k.d(kVar2, null, null, null, null, null, null, eventCustomization, -16777217));
                    }
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView();
        Intent intent = getIntent();
        intent.getClass();
        l2.f37135b.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundleA != null ? (Parcelable) bundleA.getParcelable("GCM_extra_event", k.class) : null;
        } else {
            Parcelable parcelable2 = bundleA != null ? bundleA.getParcelable("GCM_extra_event") : null;
            if (!(parcelable2 instanceof k)) {
                parcelable2 = null;
            }
            parcelable = (k) parcelable2;
        }
        k kVar = (k) parcelable;
        if (kVar != null) {
            w1 w1Var = this.f45525a;
            ((xv1.d) w1Var.getValue()).I.k(null, kVar);
            ((xv1.d) w1Var.getValue()).T = kVar.getEventCustomization();
        }
        initActionBar(R.string.lbl_edit_goals, 3);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        yv1.b.f199840d.getClass();
        aVar.l(R.id.content_frame, new yv1.b(null, 1, null), "FBTTriathlonEditGoalFragment");
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/triathloneditgoal/FBTTriathlonEditGoalActivity$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

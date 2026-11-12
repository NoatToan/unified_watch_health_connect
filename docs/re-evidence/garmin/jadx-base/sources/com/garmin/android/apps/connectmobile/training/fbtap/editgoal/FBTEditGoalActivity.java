package com.garmin.android.apps.connectmobile.training.fbtap.editgoal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import fg0.k;
import gg0.h;
import jv1.m;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import vt1.f;
import vt1.n;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/editgoal/FBTEditGoalActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTEditGoalActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45493c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45494a = new w1(s0.f105811a.b(ev1.b.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f45495b = new a4.b(this, 16);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45496a;

        public b(g gVar) {
            this.f45496a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45496a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45497a;

        public c(g gVar) {
            this.f45497a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45497a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45499b;

        public d(e23.a aVar, g gVar) {
            this.f45498a = aVar;
            this.f45499b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45498a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45499b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @SuppressLint({"CommitTransaction"})
    public final void ca(Fragment fragment, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        f fVar;
        String string;
        super.onCreate(bundle);
        setContentView();
        Intent intent = getIntent();
        intent.getClass();
        l2.f37135b.getClass();
        Bundle bundleA = l2.a.a(intent);
        w1 w1Var = this.f45494a;
        ((ev1.b) w1Var.getValue()).I = (bundleA == null || (string = bundleA.getString("EXTRA_PLAN_TYPE")) == null) ? null : o.valueOf(string);
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
            ev1.b bVar = (ev1.b) w1Var.getValue();
            fg0.j eventCustomization = kVar.getEventCustomization();
            fg0.d completionTarget = kVar.getCompletionTarget();
            fg0.d customGoal = eventCustomization != null ? eventCustomization.getCustomGoal() : null;
            m mVar = new m(customGoal != null ? customGoal.getValue() : null, customGoal != null ? customGoal.getUnit() : null, customGoal != null ? customGoal.getUnitType() : null);
            h hVar = h.TIME;
            h hVar2 = mVar.f101078c;
            if (hVar2 == hVar) {
                fVar = n.FIVE_K == null ? vt1.c.RUN_WITH_GOAL_TIME : vt1.g.FINISH_GOAL_TIME;
            } else {
                fVar = hVar2 == h.DISTANCE ? vt1.g.FINISH_GOAL_TIME : null;
            }
            gv1.a aVar = new gv1.a(fVar, mVar, completionTarget != null ? new m(completionTarget.getValue(), completionTarget.getUnit(), completionTarget.getUnitType()) : null, kVar);
            bVar.Z = aVar;
            bVar.P.k(null, aVar);
        }
        initActionBar(R.string.lbl_edit_goals, 3);
        ((ev1.b) w1Var.getValue()).Y.f(this, this.f45495b);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/editgoal/FBTEditGoalActivity$a;", "", "<init>", "()V", "", "EXTRA_PLAN_TYPE", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

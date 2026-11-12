package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.NewCreateChallengeActivity;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/NewCreateChallengeActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewCreateChallengeActivity extends p3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37257f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f37258c = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hi0.a f37259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f37260e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37261a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f37261a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37261a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37261a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37262a;

        public c(b.g gVar) {
            this.f37262a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37262a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37263a;

        public d(b.g gVar) {
            this.f37263a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37263a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f37265b;

        public e(e23.a aVar, b.g gVar) {
            this.f37264a = aVar;
            this.f37265b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37264a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37265b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // z10.p3
    public final Fragment ca() {
        i0.a aVar = i0.f37604i;
        hi0.a aVar2 = this.f37259d;
        Boolean bool = this.f37260e;
        aVar.getClass();
        i0 i0Var = new i0();
        Bundle bundle = new Bundle();
        if (aVar2 != null) {
            bundle.putParcelable("ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER", aVar2);
            bundle.putBoolean("ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER_WHEELCHAIR_MODE", p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
        }
        i0Var.setArguments(bundle);
        return i0Var;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.social_new_challenge);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final void ga() {
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        hi0.a aVar = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_ad_hoc_challenge_selected_follower", hi0.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_ad_hoc_challenge_selected_follower");
                parcelable = (hi0.a) (parcelable2 instanceof hi0.a ? parcelable2 : null);
            }
            aVar = (hi0.a) parcelable;
        }
        this.f37259d = aVar;
        if (extras == null || !extras.containsKey("GCM_ad_hoc_challenge_selected_follower_wheelchair_mode")) {
            return;
        }
        this.f37260e = Boolean.valueOf(extras.getBoolean("GCM_ad_hoc_challenge_selected_follower_wheelchair_mode"));
    }

    public final void ka(Fragment fragment) {
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, "FEATURE_FRAGMENT");
        aVarC.d(null);
        aVarC.e();
    }

    public final zt0.a la() {
        return (zt0.a) this.f37258c.getValue();
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zt0.a aVarLa = la();
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(aVarLa.f206932c.d());
        AdHocChallengeDTO adHocChallengeDTO = aVarLa.f206931b;
        if (sVarB != null) {
            adHocChallengeDTO.f37989c = sVarB.f38319a;
            adHocChallengeDTO.f37990d = getString(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(sVarB));
            adHocChallengeDTO.f37991e = getString(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(sVarB));
        }
        final int i14 = 0;
        la().f206937h.f(this, new b(new e23.l(this) { // from class: mt0.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCreateChallengeActivity f120587b;

            {
                this.f120587b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                NewCreateChallengeActivity newCreateChallengeActivity = this.f120587b;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(newCreateChallengeActivity.la().f206931b.f37989c);
                        if (sVarB2 != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                            String string = newCreateChallengeActivity.getString(R.string.lbl_next);
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            boolean z14 = !bool.booleanValue();
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVarA = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a.a(null, false, string, 0, sVarB2, zBooleanValue, z14);
                            newCreateChallengeActivity.updateActionBarNavigation(2);
                            newCreateChallengeActivity.ka(gVarA);
                        }
                        break;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar3 = NewCreateChallengeActivity.f37257f;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.d.f37401h;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", zBooleanValue2);
                        dVar.setArguments(bundle2);
                        newCreateChallengeActivity.ka(dVar);
                        break;
                    case 2:
                        zt0.a.b bVar = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar5 = NewCreateChallengeActivity.f37257f;
                        boolean z15 = bVar.f206945a;
                        boolean z16 = bVar.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        newCreateChallengeActivity.ka(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b.a(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h, null, null, z15, z16, 3));
                        break;
                    case 3:
                        NewCreateChallengeActivity.a aVar6 = NewCreateChallengeActivity.f37257f;
                        ((Unit) obj).getClass();
                        newCreateChallengeActivity.updateActionBarNavigation(1);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d.getClass();
                        newCreateChallengeActivity.ka(new com.garmin.android.apps.connectmobile.leaderboard.challenges.a());
                        break;
                    case 4:
                        AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) obj;
                        NewCreateChallengeActivity.a aVar7 = NewCreateChallengeActivity.f37257f;
                        AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                        adHocChallengeDTO2.getClass();
                        aVar8.getClass();
                        Intent intent = new Intent(newCreateChallengeActivity, (Class<?>) AdHocChallengeDetailsActivity.class);
                        intent.putExtra("GCM_ad_hoc_challenge", adHocChallengeDTO2);
                        newCreateChallengeActivity.startActivity(intent);
                        newCreateChallengeActivity.finish();
                        break;
                    default:
                        zt0.a.b bVar2 = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar9 = NewCreateChallengeActivity.f37257f;
                        boolean z17 = bVar2.f206945a;
                        boolean z18 = bVar2.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z17);
                        bundle3.putBoolean("ARGS_IS_DURATION_TYPE_CHANGED", z18);
                        iVar.setArguments(bundle3);
                        newCreateChallengeActivity.ka(iVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        la().f206939j.f(this, new b(new e23.l(this) { // from class: mt0.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCreateChallengeActivity f120587b;

            {
                this.f120587b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                NewCreateChallengeActivity newCreateChallengeActivity = this.f120587b;
                switch (i16) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(newCreateChallengeActivity.la().f206931b.f37989c);
                        if (sVarB2 != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                            String string = newCreateChallengeActivity.getString(R.string.lbl_next);
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            boolean z14 = !bool.booleanValue();
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVarA = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a.a(null, false, string, 0, sVarB2, zBooleanValue, z14);
                            newCreateChallengeActivity.updateActionBarNavigation(2);
                            newCreateChallengeActivity.ka(gVarA);
                        }
                        break;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar3 = NewCreateChallengeActivity.f37257f;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.d.f37401h;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", zBooleanValue2);
                        dVar.setArguments(bundle2);
                        newCreateChallengeActivity.ka(dVar);
                        break;
                    case 2:
                        zt0.a.b bVar = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar5 = NewCreateChallengeActivity.f37257f;
                        boolean z15 = bVar.f206945a;
                        boolean z16 = bVar.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        newCreateChallengeActivity.ka(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b.a(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h, null, null, z15, z16, 3));
                        break;
                    case 3:
                        NewCreateChallengeActivity.a aVar6 = NewCreateChallengeActivity.f37257f;
                        ((Unit) obj).getClass();
                        newCreateChallengeActivity.updateActionBarNavigation(1);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d.getClass();
                        newCreateChallengeActivity.ka(new com.garmin.android.apps.connectmobile.leaderboard.challenges.a());
                        break;
                    case 4:
                        AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) obj;
                        NewCreateChallengeActivity.a aVar7 = NewCreateChallengeActivity.f37257f;
                        AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                        adHocChallengeDTO2.getClass();
                        aVar8.getClass();
                        Intent intent = new Intent(newCreateChallengeActivity, (Class<?>) AdHocChallengeDetailsActivity.class);
                        intent.putExtra("GCM_ad_hoc_challenge", adHocChallengeDTO2);
                        newCreateChallengeActivity.startActivity(intent);
                        newCreateChallengeActivity.finish();
                        break;
                    default:
                        zt0.a.b bVar2 = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar9 = NewCreateChallengeActivity.f37257f;
                        boolean z17 = bVar2.f206945a;
                        boolean z18 = bVar2.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z17);
                        bundle3.putBoolean("ARGS_IS_DURATION_TYPE_CHANGED", z18);
                        iVar.setArguments(bundle3);
                        newCreateChallengeActivity.ka(iVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i16 = 2;
        la().f206938i.f(this, new b(new e23.l(this) { // from class: mt0.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCreateChallengeActivity f120587b;

            {
                this.f120587b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                NewCreateChallengeActivity newCreateChallengeActivity = this.f120587b;
                switch (i17) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(newCreateChallengeActivity.la().f206931b.f37989c);
                        if (sVarB2 != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                            String string = newCreateChallengeActivity.getString(R.string.lbl_next);
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            boolean z14 = !bool.booleanValue();
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVarA = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a.a(null, false, string, 0, sVarB2, zBooleanValue, z14);
                            newCreateChallengeActivity.updateActionBarNavigation(2);
                            newCreateChallengeActivity.ka(gVarA);
                        }
                        break;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar3 = NewCreateChallengeActivity.f37257f;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.d.f37401h;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", zBooleanValue2);
                        dVar.setArguments(bundle2);
                        newCreateChallengeActivity.ka(dVar);
                        break;
                    case 2:
                        zt0.a.b bVar = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar5 = NewCreateChallengeActivity.f37257f;
                        boolean z15 = bVar.f206945a;
                        boolean z16 = bVar.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        newCreateChallengeActivity.ka(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b.a(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h, null, null, z15, z16, 3));
                        break;
                    case 3:
                        NewCreateChallengeActivity.a aVar6 = NewCreateChallengeActivity.f37257f;
                        ((Unit) obj).getClass();
                        newCreateChallengeActivity.updateActionBarNavigation(1);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d.getClass();
                        newCreateChallengeActivity.ka(new com.garmin.android.apps.connectmobile.leaderboard.challenges.a());
                        break;
                    case 4:
                        AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) obj;
                        NewCreateChallengeActivity.a aVar7 = NewCreateChallengeActivity.f37257f;
                        AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                        adHocChallengeDTO2.getClass();
                        aVar8.getClass();
                        Intent intent = new Intent(newCreateChallengeActivity, (Class<?>) AdHocChallengeDetailsActivity.class);
                        intent.putExtra("GCM_ad_hoc_challenge", adHocChallengeDTO2);
                        newCreateChallengeActivity.startActivity(intent);
                        newCreateChallengeActivity.finish();
                        break;
                    default:
                        zt0.a.b bVar2 = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar9 = NewCreateChallengeActivity.f37257f;
                        boolean z17 = bVar2.f206945a;
                        boolean z18 = bVar2.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z17);
                        bundle3.putBoolean("ARGS_IS_DURATION_TYPE_CHANGED", z18);
                        iVar.setArguments(bundle3);
                        newCreateChallengeActivity.ka(iVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i17 = 3;
        la().f206941l.f(this, new b(new e23.l(this) { // from class: mt0.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCreateChallengeActivity f120587b;

            {
                this.f120587b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                NewCreateChallengeActivity newCreateChallengeActivity = this.f120587b;
                switch (i18) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(newCreateChallengeActivity.la().f206931b.f37989c);
                        if (sVarB2 != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                            String string = newCreateChallengeActivity.getString(R.string.lbl_next);
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            boolean z14 = !bool.booleanValue();
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVarA = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a.a(null, false, string, 0, sVarB2, zBooleanValue, z14);
                            newCreateChallengeActivity.updateActionBarNavigation(2);
                            newCreateChallengeActivity.ka(gVarA);
                        }
                        break;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar3 = NewCreateChallengeActivity.f37257f;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.d.f37401h;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", zBooleanValue2);
                        dVar.setArguments(bundle2);
                        newCreateChallengeActivity.ka(dVar);
                        break;
                    case 2:
                        zt0.a.b bVar = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar5 = NewCreateChallengeActivity.f37257f;
                        boolean z15 = bVar.f206945a;
                        boolean z16 = bVar.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        newCreateChallengeActivity.ka(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b.a(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h, null, null, z15, z16, 3));
                        break;
                    case 3:
                        NewCreateChallengeActivity.a aVar6 = NewCreateChallengeActivity.f37257f;
                        ((Unit) obj).getClass();
                        newCreateChallengeActivity.updateActionBarNavigation(1);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d.getClass();
                        newCreateChallengeActivity.ka(new com.garmin.android.apps.connectmobile.leaderboard.challenges.a());
                        break;
                    case 4:
                        AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) obj;
                        NewCreateChallengeActivity.a aVar7 = NewCreateChallengeActivity.f37257f;
                        AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                        adHocChallengeDTO2.getClass();
                        aVar8.getClass();
                        Intent intent = new Intent(newCreateChallengeActivity, (Class<?>) AdHocChallengeDetailsActivity.class);
                        intent.putExtra("GCM_ad_hoc_challenge", adHocChallengeDTO2);
                        newCreateChallengeActivity.startActivity(intent);
                        newCreateChallengeActivity.finish();
                        break;
                    default:
                        zt0.a.b bVar2 = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar9 = NewCreateChallengeActivity.f37257f;
                        boolean z17 = bVar2.f206945a;
                        boolean z18 = bVar2.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z17);
                        bundle3.putBoolean("ARGS_IS_DURATION_TYPE_CHANGED", z18);
                        iVar.setArguments(bundle3);
                        newCreateChallengeActivity.ka(iVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i18 = 4;
        la().f206940k.f(this, new b(new e23.l(this) { // from class: mt0.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCreateChallengeActivity f120587b;

            {
                this.f120587b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                NewCreateChallengeActivity newCreateChallengeActivity = this.f120587b;
                switch (i19) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(newCreateChallengeActivity.la().f206931b.f37989c);
                        if (sVarB2 != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                            String string = newCreateChallengeActivity.getString(R.string.lbl_next);
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            boolean z14 = !bool.booleanValue();
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVarA = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a.a(null, false, string, 0, sVarB2, zBooleanValue, z14);
                            newCreateChallengeActivity.updateActionBarNavigation(2);
                            newCreateChallengeActivity.ka(gVarA);
                        }
                        break;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar3 = NewCreateChallengeActivity.f37257f;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.d.f37401h;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", zBooleanValue2);
                        dVar.setArguments(bundle2);
                        newCreateChallengeActivity.ka(dVar);
                        break;
                    case 2:
                        zt0.a.b bVar = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar5 = NewCreateChallengeActivity.f37257f;
                        boolean z15 = bVar.f206945a;
                        boolean z16 = bVar.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        newCreateChallengeActivity.ka(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b.a(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h, null, null, z15, z16, 3));
                        break;
                    case 3:
                        NewCreateChallengeActivity.a aVar6 = NewCreateChallengeActivity.f37257f;
                        ((Unit) obj).getClass();
                        newCreateChallengeActivity.updateActionBarNavigation(1);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d.getClass();
                        newCreateChallengeActivity.ka(new com.garmin.android.apps.connectmobile.leaderboard.challenges.a());
                        break;
                    case 4:
                        AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) obj;
                        NewCreateChallengeActivity.a aVar7 = NewCreateChallengeActivity.f37257f;
                        AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                        adHocChallengeDTO2.getClass();
                        aVar8.getClass();
                        Intent intent = new Intent(newCreateChallengeActivity, (Class<?>) AdHocChallengeDetailsActivity.class);
                        intent.putExtra("GCM_ad_hoc_challenge", adHocChallengeDTO2);
                        newCreateChallengeActivity.startActivity(intent);
                        newCreateChallengeActivity.finish();
                        break;
                    default:
                        zt0.a.b bVar2 = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar9 = NewCreateChallengeActivity.f37257f;
                        boolean z17 = bVar2.f206945a;
                        boolean z18 = bVar2.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z17);
                        bundle3.putBoolean("ARGS_IS_DURATION_TYPE_CHANGED", z18);
                        iVar.setArguments(bundle3);
                        newCreateChallengeActivity.ka(iVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i19 = 5;
        la().f206942m.f(this, new b(new e23.l(this) { // from class: mt0.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCreateChallengeActivity f120587b;

            {
                this.f120587b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i19;
                NewCreateChallengeActivity newCreateChallengeActivity = this.f120587b;
                switch (i110) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar = NewCreateChallengeActivity.f37257f;
                        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(newCreateChallengeActivity.la().f206931b.f37989c);
                        if (sVarB2 != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                            String string = newCreateChallengeActivity.getString(R.string.lbl_next);
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            boolean z14 = !bool.booleanValue();
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVarA = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a.a(null, false, string, 0, sVarB2, zBooleanValue, z14);
                            newCreateChallengeActivity.updateActionBarNavigation(2);
                            newCreateChallengeActivity.ka(gVarA);
                        }
                        break;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        NewCreateChallengeActivity.a aVar3 = NewCreateChallengeActivity.f37257f;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.d.f37401h;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", zBooleanValue2);
                        dVar.setArguments(bundle2);
                        newCreateChallengeActivity.ka(dVar);
                        break;
                    case 2:
                        zt0.a.b bVar = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar5 = NewCreateChallengeActivity.f37257f;
                        boolean z15 = bVar.f206945a;
                        boolean z16 = bVar.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        newCreateChallengeActivity.ka(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b.a(com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h, null, null, z15, z16, 3));
                        break;
                    case 3:
                        NewCreateChallengeActivity.a aVar6 = NewCreateChallengeActivity.f37257f;
                        ((Unit) obj).getClass();
                        newCreateChallengeActivity.updateActionBarNavigation(1);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d.getClass();
                        newCreateChallengeActivity.ka(new com.garmin.android.apps.connectmobile.leaderboard.challenges.a());
                        break;
                    case 4:
                        AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) obj;
                        NewCreateChallengeActivity.a aVar7 = NewCreateChallengeActivity.f37257f;
                        AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                        adHocChallengeDTO2.getClass();
                        aVar8.getClass();
                        Intent intent = new Intent(newCreateChallengeActivity, (Class<?>) AdHocChallengeDetailsActivity.class);
                        intent.putExtra("GCM_ad_hoc_challenge", adHocChallengeDTO2);
                        newCreateChallengeActivity.startActivity(intent);
                        newCreateChallengeActivity.finish();
                        break;
                    default:
                        zt0.a.b bVar2 = (zt0.a.b) obj;
                        NewCreateChallengeActivity.a aVar9 = NewCreateChallengeActivity.f37257f;
                        boolean z17 = bVar2.f206945a;
                        boolean z18 = bVar2.f206946b;
                        newCreateChallengeActivity.updateActionBarNavigation(2);
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.i iVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("ARGS_IS_FROM_CONFIRM_PAGE", z17);
                        bundle3.putBoolean("ARGS_IS_DURATION_TYPE_CHANGED", z18);
                        iVar.setArguments(bundle3);
                        newCreateChallengeActivity.ka(iVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/NewCreateChallengeActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

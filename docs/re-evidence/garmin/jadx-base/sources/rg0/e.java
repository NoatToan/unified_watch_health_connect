package rg0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedUserConsentActivity f152530b;

    public /* synthetic */ e(AuthorizedUserConsentActivity authorizedUserConsentActivity, int i14) {
        this.f152529a = i14;
        this.f152530b = authorizedUserConsentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    @Override // e23.a
    public final Object invoke() {
        hl.a aVar;
        Parcelable parcelable;
        int i14 = this.f152529a;
        AuthorizedUserConsentActivity authorizedUserConsentActivity = this.f152530b;
        switch (i14) {
            case 0:
                AuthorizedUserConsentActivity.a aVar2 = AuthorizedUserConsentActivity.f34946c;
                Bundle extras = authorizedUserConsentActivity.getIntent().getExtras();
                if (extras != null) {
                    long j8 = extras.getLong("AuthorizedUserConsentFragmentInviteeIdKey");
                    Long lValueOf = j8 == 0 ? null : Long.valueOf(j8);
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        Bundle extras2 = authorizedUserConsentActivity.getIntent().getExtras();
                        if (extras2 == null) {
                            aVar = hl.a.c.f84256b;
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras2.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras2.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            aVar = (hl.a) parcelable;
                            if (aVar == null) {
                                aVar = hl.a.c.f84256b;
                            }
                        }
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a.C0596a(jLongValue, aVar);
                    }
                }
                vb.h.z("Invitee ID cannot be empty");
                return null;
            case 1:
                AuthorizedUserConsentActivity.a aVar3 = AuthorizedUserConsentActivity.f34946c;
                authorizedUserConsentActivity.onBackPressed();
                return Unit.INSTANCE;
            case 2:
                AuthorizedUserConsentActivity.a aVar4 = AuthorizedUserConsentActivity.f34946c;
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersAddAgreed");
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a aVarEa = authorizedUserConsentActivity.ea();
                aVarEa.f35020e.k(null, Boolean.TRUE);
                ge1.b.T(v1.a(aVarEa), aVarEa.f35018c.f22991c, null, new h(aVarEa, null), 2);
                return Unit.INSTANCE;
            case 3:
                AuthorizedUserConsentActivity.a aVar5 = AuthorizedUserConsentActivity.f34946c;
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersAddCanceled");
                authorizedUserConsentActivity.setResult(-1);
                authorizedUserConsentActivity.finish();
                return Unit.INSTANCE;
            default:
                authorizedUserConsentActivity.f34948b.b(authorizedUserConsentActivity);
                return Unit.INSTANCE;
        }
    }
}

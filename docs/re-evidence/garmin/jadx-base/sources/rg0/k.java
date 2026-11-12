package rg0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewerDetailActivity f152571b;

    public /* synthetic */ k(AuthorizedViewerDetailActivity authorizedViewerDetailActivity, int i14) {
        this.f152570a = i14;
        this.f152571b = authorizedViewerDetailActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Object serializable;
        int i14 = this.f152570a;
        int i15 = 0;
        AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152571b;
        switch (i14) {
            case 0:
                AuthorizedViewerDetailActivity.a aVar = AuthorizedViewerDetailActivity.f34963c;
                Bundle extras = authorizedViewerDetailActivity.getIntent().getExtras();
                Parcelable parcelable = null;
                if (extras != null) {
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 33) {
                        serializable = extras.getSerializable("userDataKey", com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a.class);
                    } else {
                        Object serializable2 = extras.getSerializable("userDataKey");
                        if (!(serializable2 instanceof com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a)) {
                            serializable2 = null;
                        }
                        serializable = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a) serializable2;
                    }
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a aVar2 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a) serializable;
                    if (aVar2 != null) {
                        Bundle extras2 = authorizedViewerDetailActivity.getIntent().getExtras();
                        if (i16 < 33) {
                            Parcelable parcelable2 = extras2 != null ? extras2.getParcelable("GCM_extra_screen_access_role") : null;
                            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                        } else if (extras2 != null) {
                            parcelable = (Parcelable) extras2.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                        }
                        hl.a aVar3 = (hl.a) parcelable;
                        if (aVar3 == null) {
                            aVar3 = hl.a.c.f84256b;
                        }
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.b(aVar2, aVar3);
                    }
                }
                vb.h.z("Viewer data cannot be empty");
                return null;
            case 1:
                AuthorizedViewerDetailActivity.a aVar4 = AuthorizedViewerDetailActivity.f34963c;
                authorizedViewerDetailActivity.onBackPressed();
                return Unit.INSTANCE;
            case 2:
                AuthorizedViewerDetailActivity.a aVar5 = AuthorizedViewerDetailActivity.f34963c;
                AuthorizedViewerDetailActivity authorizedViewerDetailActivity2 = this.f152571b;
                c22.f.c(c22.f.f23050a, authorizedViewerDetailActivity2, R.string.remove_account_access_confirmation, R.string.are_you_sure_remove_access, new o13.p(authorizedViewerDetailActivity2.getString(R.string.lbl_remove), new j(authorizedViewerDetailActivity2, i15)), new o13.p(authorizedViewerDetailActivity2.getString(R.string.lbl_cancel), new j(authorizedViewerDetailActivity2, 1)), 96).show();
                return Unit.INSTANCE;
            case 3:
                AuthorizedViewerDetailActivity.a aVar6 = AuthorizedViewerDetailActivity.f34963c;
                AuthorizedViewerDetailActivity authorizedViewerDetailActivity3 = this.f152571b;
                c22.f.c(c22.f.f23050a, authorizedViewerDetailActivity3, R.string.revoke_access_question, R.string.revoke_access_description, new o13.p(authorizedViewerDetailActivity3.getString(R.string.revoke_access), new j(authorizedViewerDetailActivity3, 2)), new o13.p(authorizedViewerDetailActivity3.getString(R.string.lbl_cancel), new j(authorizedViewerDetailActivity3, 3)), 96).show();
                return Unit.INSTANCE;
            case 4:
                AuthorizedViewerDetailActivity.a aVar7 = AuthorizedViewerDetailActivity.f34963c;
                c22.f fVar = c22.f.f23050a;
                AuthorizedViewerDetailActivity authorizedViewerDetailActivity4 = this.f152571b;
                String string = authorizedViewerDetailActivity4.getString(R.string.lbl_common_continue);
                string.getClass();
                o13.p pVar = new o13.p(string, new j(authorizedViewerDetailActivity4, 4));
                String string2 = authorizedViewerDetailActivity4.getString(R.string.common_cancel);
                string2.getClass();
                androidx.appcompat.app.e eVarC = c22.f.c(fVar, authorizedViewerDetailActivity4, R.string.redirect, R.string.not_signed_out_garmin_website, pVar, new o13.p(string2, new r72.g((byte) 0, 19)), 96);
                androidx.appcompat.app.e eVar = authorizedViewerDetailActivity4.f34965b;
                if (eVar != null) {
                    eVar.dismiss();
                }
                eVarC.show();
                authorizedViewerDetailActivity4.f34965b = eVarC;
                return Unit.INSTANCE;
            default:
                AuthorizedViewerDetailActivity.a aVar8 = AuthorizedViewerDetailActivity.f34963c;
                authorizedViewerDetailActivity.da().x4();
                return Unit.INSTANCE;
        }
    }
}

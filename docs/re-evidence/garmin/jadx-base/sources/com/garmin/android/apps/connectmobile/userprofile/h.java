package com.garmin.android.apps.connectmobile.userprofile;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import e23.l;
import g12.p;
import lc.u0;
import m12.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p3.x3;
import r22.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class h extends q implements l<i.c, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfileActivity f46746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<i.d> f46747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<g3<com.garmin.android.apps.connectmobile.userprofile.model.q>> f46748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UserProfileActivity userProfileActivity, x3<i.d> x3Var, x3<g3<com.garmin.android.apps.connectmobile.userprofile.model.q>> x3Var2) {
        super(1, s.a.class, "handleEvent", "initViews$lambda$2$handleEvent(Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileActivity;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lcom/garmin/android/apps/connectmobile/userprofile/UserProfileViewModel$ProfileHeaderEventType;)V", 0);
        this.f46746a = userProfileActivity;
        this.f46747b = x3Var;
        this.f46748c = x3Var2;
    }

    @Override // e23.l
    public final Unit invoke(i.c cVar) {
        Intent intentO;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo2;
        Intent intentR;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar3;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo3;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar4;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo4;
        i.c cVar2 = cVar;
        cVar2.getClass();
        UserProfileActivity.a aVar = UserProfileActivity.f46494x;
        int i14 = UserProfileActivity.e.f46515a[cVar2.ordinal()];
        UserProfileActivity userProfileActivity = this.f46746a;
        x3<i.d> x3Var = this.f46747b;
        x3<g3<com.garmin.android.apps.connectmobile.userprofile.model.q>> x3Var2 = this.f46748c;
        String strB = null;
        switch (i14) {
            case 1:
                userProfileActivity.getClass();
                EditProfileActivity.f46981h.getClass();
                Intent intent = new Intent(userProfileActivity, (Class<?>) EditProfileActivity.class);
                intent.putExtra("EXTRA_FOCUS", false);
                userProfileActivity.startActivityForResult(intent, 1001);
                break;
            case 2:
                if (!s3.b()) {
                    userProfileActivity.f46510v.c(userProfileActivity);
                } else {
                    userProfileActivity.getClass();
                    new androidx.appcompat.app.e.a(userProfileActivity).setTitle(R.string.follow_unable_to_share_profile).setCancelable(false).setMessage(R.string.follow_unable_to_share_profile_message).setPositiveButton(R.string.lbl_ok, new f20.i(7)).show();
                }
                break;
            case 3:
                com.garmin.android.apps.connectmobile.userprofile.model.q qVar5 = userProfileActivity.f46496f;
                if ((qVar5 != null ? qVar5.getUserFollowProfile() : null) != null) {
                    i iVarGa = userProfileActivity.ga();
                    dh.b.I(m.a(v1.a(iVarGa).f183565a, new p(iVarGa, true, null), 2), userProfileActivity, new g12.h(userProfileActivity, 0));
                }
                break;
            case 4:
                i.d f182175a = x3Var.getF182175a();
                if (f182175a != null) {
                    if (f182175a.f46788a) {
                        intentO = userProfileActivity.f46510v.w(userProfileActivity);
                    } else if (userProfileActivity.ga().z4()) {
                        r rVar = userProfileActivity.f46510v;
                        g3<com.garmin.android.apps.connectmobile.userprofile.model.q> f182175a2 = x3Var2.getF182175a();
                        String displayName = (f182175a2 == null || (qVar2 = f182175a2.f35301b) == null || (userInfo2 = qVar2.getUserInfo()) == null) ? null : userInfo2.getDisplayName();
                        g3<com.garmin.android.apps.connectmobile.userprofile.model.q> f182175a3 = x3Var2.getF182175a();
                        if (f182175a3 != null && (qVar = f182175a3.f35301b) != null && (userInfo = qVar.getUserInfo()) != null) {
                            strB = userInfo.b();
                        }
                        intentO = rVar.o(userProfileActivity, displayName, strB);
                    }
                    userProfileActivity.startActivity(intentO);
                }
                break;
            case 5:
                i.d f182175a4 = x3Var.getF182175a();
                if (f182175a4 != null) {
                    if (f182175a4.f46788a) {
                        intentR = userProfileActivity.f46510v.x(userProfileActivity);
                    } else if (userProfileActivity.ga().z4()) {
                        r rVar2 = userProfileActivity.f46510v;
                        g3<com.garmin.android.apps.connectmobile.userprofile.model.q> f182175a5 = x3Var2.getF182175a();
                        String displayName2 = (f182175a5 == null || (qVar4 = f182175a5.f35301b) == null || (userInfo4 = qVar4.getUserInfo()) == null) ? null : userInfo4.getDisplayName();
                        g3<com.garmin.android.apps.connectmobile.userprofile.model.q> f182175a6 = x3Var2.getF182175a();
                        if (f182175a6 != null && (qVar3 = f182175a6.f35301b) != null && (userInfo3 = qVar3.getUserInfo()) != null) {
                            strB = userInfo3.b();
                        }
                        intentR = rVar2.r(userProfileActivity, displayName2, strB);
                    }
                    userProfileActivity.startActivity(intentR);
                }
                break;
            case 6:
                userProfileActivity.ja(true);
                break;
            case 7:
                userProfileActivity.ja(false);
                break;
            case 8:
                q0 q0Var = userProfileActivity.f46511w;
                if (q0Var != null) {
                    q0Var.dismiss();
                }
                q0.b bVar = q0.f149800b;
                View viewFindViewById = userProfileActivity.findViewById(R.id.user_profile_main_layout);
                viewFindViewById.getClass();
                String string = userProfileActivity.getString(R.string.txt_error_occurred);
                string.getClass();
                q0 q0VarC = q0.b.c(bVar, viewFindViewById, string, null, 12);
                userProfileActivity.f46511w = q0VarC;
                q0VarC.show();
                break;
            case 9:
                userProfileActivity.fa(false);
                UserProfileActivity.c cVar3 = userProfileActivity.f46503m;
                if (cVar3 != null) {
                    cVar3.c();
                }
                userProfileActivity.ca();
                break;
            case 10:
                userProfileActivity.fa(false);
                break;
            default:
                u0.r();
                return null;
        }
        return Unit.INSTANCE;
    }
}

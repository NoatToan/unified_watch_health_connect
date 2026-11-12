package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.consent.UploadConsentRedirectActivity;
import com.garmin.android.apps.connectmobile.follow.domain.InviteFriendsActivity;
import com.garmin.android.apps.connectmobile.smartscale.IndexScaleTellUSMoreActivity;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/t5;", "Lwn1/j0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t5 implements wn1.j0 {
    @Override // wn1.j0
    public final void a(IndexScaleTellUSMoreActivity indexScaleTellUSMoreActivity, com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        lVar.getClass();
        UploadConsentRedirectActivity.f32243t.getClass();
        Intent intent = new Intent(indexScaleTellUSMoreActivity, (Class<?>) UploadConsentRedirectActivity.class);
        intent.putExtra("GCM_deviceDTO", lVar);
        indexScaleTellUSMoreActivity.startActivity(intent);
    }

    @Override // wn1.j0
    public final void b(IndexScaleTellUSMoreActivity indexScaleTellUSMoreActivity) {
        com.garmin.android.apps.connectmobile.navigation.b.a.b(com.garmin.android.apps.connectmobile.navigation.b.f39357a, ty0.b.E1, indexScaleTellUSMoreActivity, null, 12);
    }

    @Override // wn1.j0
    public final void c(long j8, String str) {
        str.getClass();
        zb0.n0.a(j8, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wn1.j0
    public final Object d(v13.c cVar) {
        s5 s5Var;
        List<ue0.l> listC;
        if (cVar instanceof s5) {
            s5Var = (s5) cVar;
            int i14 = s5Var.f104361c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s5Var.f104361c = i14 - Integer.MIN_VALUE;
            } else {
                s5Var = new s5(this, cVar);
            }
        } else {
            s5Var = new s5(this, cVar);
        }
        Object objI = s5Var.f104359a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s5Var.f104361c;
        ArrayList arrayList = null;
        if (i15 == 0) {
            o13.r.b(objI);
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            s5Var.f104361c = 1;
            objI = oVar.i(s5Var);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objI;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return new com.garmin.android.apps.connectmobile.v2.a(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
        ue0.k kVar = (ue0.k) bVar.f47386a;
        if (kVar != null && (listC = kVar.c()) != null) {
            ArrayList<ue0.l> arrayList2 = new ArrayList();
            for (Object obj : listC) {
                ue0.l lVar = (ue0.l) obj;
                if (lVar.getUserId() != null && lVar.getMemberRole() == ue0.m.CHILD) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList2, 10));
            for (ue0.l lVar2 : arrayList2) {
                lVar2.getClass();
                arrayList.add(new hi0.a(lVar2.getUserId(), lVar2.getDisplayName(), lVar2.getFullName(), lVar2.getUserLevel(), lVar2.getLocation(), null, null, new com.garmin.android.apps.connectmobile.userprofile.model.j(p13.t0.b(new o13.p(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, lVar2.getProfileImageUrlMedium()))), null));
            }
        }
        return new com.garmin.android.apps.connectmobile.v2.b(arrayList, bVar.f47387b, null, null, 12, null);
    }

    @Override // wn1.j0
    public final void e(Context context, long j8, String str) {
        context.getClass();
        str.getClass();
        InviteFriendsActivity.f35263d.getClass();
        Intent intent = new Intent(context, (Class<?>) InviteFriendsActivity.class);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceDisplayName", str);
        context.startActivity(intent);
    }
}

package bp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import bt1.u;
import c2.a2;
import c2.c2;
import c2.g2;
import c2.l3;
import c2.m3;
import ca0.b1;
import ca0.n1;
import ca0.t1;
import cf.b0;
import cf.c0;
import cf.e0;
import cf.f0;
import cf.n;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.photos.PostPhotoManagementActivity;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.maps.model.LatLng;
import d53.w;
import dy1.p;
import f5.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.i3;
import lc.m0;
import lc.u0;
import lc.y;
import p005kotlin.Unit;
import p3.x3;
import p5.h0;
import p5.k0;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19390c;

    public /* synthetic */ h(c30.g gVar, ArrayList arrayList, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        this.f19388a = 8;
        this.f19390c = arrayList;
        this.f19389b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Object value;
        p pVar;
        String str;
        String string;
        Object next;
        d31.e eVar;
        int i14 = this.f19388a;
        Object obj2 = this.f19390c;
        Object obj3 = this.f19389b;
        switch (i14) {
            case 0:
                PostPhotoManagementActivity postPhotoManagementActivity = (PostPhotoManagementActivity) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                g3 g3Var = (g3) obj;
                PostPhotoManagementActivity.a aVar = PostPhotoManagementActivity.f29721q;
                g3Var.getClass();
                int i15 = PostPhotoManagementActivity.c.f29727a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    postPhotoManagementActivity.ga(arrayList);
                    if (arrayList.size() != postPhotoManagementActivity.ca().f82691g) {
                        Toast.makeText(postPhotoManagementActivity, R.string.delete_photo_error, 0).show();
                    }
                    postPhotoManagementActivity.W2(false);
                    postPhotoManagementActivity.hideProgressOverlay();
                } else if (i15 == 2) {
                    postPhotoManagementActivity.hideProgressOverlay();
                    Toast.makeText(postPhotoManagementActivity, R.string.delete_photo_error, 0).show();
                    postPhotoManagementActivity.da().scrollToPosition(0);
                    postPhotoManagementActivity.ca().t();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    postPhotoManagementActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 1:
                u uVar = (u) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                String string2 = ((Context) obj3).getString(R.string.range_from_to_content_description, uVar.f21153f.invoke((String) uVar.f21156i.getF182175a()), uVar.f21153f.invoke((String) uVar.f21157j.getF182175a()));
                string2.getClass();
                h0.n(k0Var, string2);
                return Unit.INSTANCE;
            case 2:
                Activity activity = (Activity) obj3;
                ey1.a aVar2 = (ey1.a) obj2;
                String str2 = (String) obj;
                by1.m mVar = by1.m.f22196a;
                str2.getClass();
                if (activity != null) {
                    b2 b2Var = aVar2.f67289w;
                    p2 p2Var = aVar2.f67276h;
                    do {
                        value = p2Var.getValue();
                        pVar = (p) value;
                        if (w.J(str2)) {
                            mx1.f fVar = ((p) b2Var.f150540a.getValue()).f61598d;
                            if (fVar == null || !fVar.c()) {
                                mx1.f fVar2 = ((p) b2Var.f150540a.getValue()).f61598d;
                                string = fVar2 != null ? activity.getString(fVar2.f121397c) : null;
                            } else {
                                string = activity.getString(R.string.lbl_custom_strength);
                            }
                            str = string;
                        } else {
                            str = str2;
                        }
                    } while (!p2Var.b(value, p.a(pVar, null, null, null, null, null, null, null, null, str, null, 767)));
                }
                return Unit.INSTANCE;
            case 3:
                e23.p pVar2 = (e23.p) obj3;
                x3 x3Var = (x3) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (pVar2 != null) {
                    pVar2.invoke(i3Var, ((c12.h.b) x3Var.getF182175a()).f22560b.f22562a);
                }
                return Unit.INSTANCE;
            case 4:
                a2 a2Var = (a2) obj3;
                v1 v1Var = (v1) obj2;
                v1.a aVar3 = (v1.a) obj;
                boolean z14 = a2Var.f22591c;
                float f14 = a2Var.f22589a;
                if (z14) {
                    v1.a.B(aVar3, v1Var, aVar3.f0(f14), aVar3.f0(a2Var.f22590b));
                } else {
                    aVar3.r(v1Var, aVar3.f0(f14), aVar3.f0(a2Var.f22590b), 0.0f);
                }
                return Unit.INSTANCE;
            case 5:
                c2 c2Var = (c2) obj3;
                v1 v1Var2 = (v1) obj2;
                v1.a aVar4 = (v1.a) obj;
                long j8 = c2Var.f22611a.invoke(aVar4).f76005a;
                if (c2Var.f22612b) {
                    v1.a.E(aVar4, v1Var2, (int) (j8 >> 32), (int) (j8 & 4294967295L));
                } else {
                    v1.a.K(aVar4, v1Var2, (int) (j8 >> 32), (int) (j8 & 4294967295L), null, 12);
                }
                return Unit.INSTANCE;
            case 6:
                g2 g2Var = (g2) obj3;
                v1 v1Var3 = (v1) obj2;
                v1.a aVar5 = (v1.a) obj;
                boolean z15 = g2Var.f22666e;
                float f15 = g2Var.f22662a;
                if (z15) {
                    v1.a.B(aVar5, v1Var3, aVar5.f0(f15), aVar5.f0(g2Var.f22663b));
                } else {
                    aVar5.r(v1Var3, aVar5.f0(f15), aVar5.f0(g2Var.f22663b), 0.0f);
                }
                return Unit.INSTANCE;
            case 7:
                m3 m3Var = (m3) obj3;
                View view2 = (View) obj2;
                m3Var.a(view2);
                return new l3(m3Var, view2);
            case 8:
                ArrayList<List> arrayList2 = (ArrayList) obj2;
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) obj3;
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) it.next();
                        for (List list2 : arrayList2) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    GeoPointDTO geoPointDTO = (GeoPointDTO) next;
                                    Double d14 = geoPointDTO.latitude;
                                    double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                                    Double d15 = geoPointDTO.longitude;
                                    if (!gVar.i(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d))) {
                                        it = it;
                                    }
                                } else {
                                    it = it;
                                    next = null;
                                }
                            }
                            GeoPointDTO geoPointDTO2 = (GeoPointDTO) next;
                            if (geoPointDTO2 != null) {
                                int iIndexOf = arrayList2.indexOf(list2);
                                ArrayList arrayList3 = new ArrayList(list2);
                                arrayList3.remove(list2.indexOf(geoPointDTO2));
                                arrayList2.set(iIndexOf, arrayList3);
                            }
                            it = it;
                        }
                        eVar2.f(gVar);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                ud.a aVar6 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar6.getClass();
                ((com.garmin.android.apps.connectmobile.onboarding.data.local.a) obj3).f39664b.c(aVar6, (List) obj2);
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.onboarding.data.local.b bVar2 = (com.garmin.android.apps.connectmobile.onboarding.data.local.b) obj3;
                d31.c cVar = (d31.c) obj2;
                ud.a aVar7 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.b.C0713b c0713b = com.garmin.android.apps.connectmobile.onboarding.data.local.b.f39667d;
                aVar7.getClass();
                ud.c cVarM0 = aVar7.M0("SELECT * FROM prompt_onboarding_items WHERE status = ?");
                try {
                    bVar2.f39670c.getClass();
                    cVarM0.q3(1, c31.a.e(cVar));
                    int iB = ge1.b.B(cVarM0, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB2 = ge1.b.B(cVarM0, "status");
                    int iB3 = ge1.b.B(cVarM0, "reminderDate");
                    int iB4 = ge1.b.B(cVarM0, "badgeKey");
                    int iB5 = ge1.b.B(cVarM0, "badgePk");
                    int iB6 = ge1.b.B(cVarM0, "badgeUUID");
                    int iB7 = ge1.b.B(cVarM0, "challengeCategory");
                    int iB8 = ge1.b.B(cVarM0, "sharedImagePk");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarM0.J0()) {
                        d31.d dVarD = c31.a.d(cVarM0.M1(iB));
                        d31.c cVarC = c31.a.c(cVarM0.M1(iB2));
                        b63.u uVarB = c31.a.b(cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3));
                        if (cVarM0.isNull(iB4) && cVarM0.isNull(iB5) && cVarM0.isNull(iB6) && cVarM0.isNull(iB7) && cVarM0.isNull(iB8)) {
                            iB3 = iB3;
                            eVar = null;
                        } else {
                            eVar = new d31.e(cVarM0.isNull(iB4) ? null : cVarM0.M1(iB4), cVarM0.isNull(iB5) ? null : Long.valueOf(cVarM0.getLong(iB5)), cVarM0.isNull(iB6) ? null : cVarM0.M1(iB6), cVarM0.isNull(iB7) ? null : Integer.valueOf((int) cVarM0.getLong(iB7)), cVarM0.isNull(iB8) ? null : Integer.valueOf((int) cVarM0.getLong(iB8)));
                        }
                        arrayList4.add(new d31.f(dVarD, cVarC, uVarB, eVar));
                        iB3 = iB3;
                        break;
                    }
                    return arrayList4;
                } finally {
                    cVarM0.close();
                }
            case 11:
                ud.a aVar8 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.b.C0713b c0713b2 = com.garmin.android.apps.connectmobile.onboarding.data.local.b.f39667d;
                aVar8.getClass();
                ((com.garmin.android.apps.connectmobile.onboarding.data.local.b) obj3).f39669b.c(aVar8, (List) obj2);
                return Unit.INSTANCE;
            case 12:
                ((q40.b) obj).getClass();
                ((c60.b) obj3).invoke();
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 13:
                ((q40.b) obj).getClass();
                ((c60.a) obj3).invoke();
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 14:
                q40.b bVar3 = (q40.b) obj;
                bVar3.getClass();
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = new com.garmin.android.apps.connectmobile.courses.model.g((com.garmin.android.apps.connectmobile.courses.model.g) obj3);
                s20.b.f156004a.getClass();
                s20.b.a(gVar2, bVar3);
                ((e23.l) obj2).invoke(gVar2);
                return Unit.INSTANCE;
            case 15:
                e23.l lVar = (e23.l) obj2;
                com.garmin.android.apps.connectmobile.courses.model.g gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                gVar3.getClass();
                ((c60.b) obj3).invoke();
                if (lVar != null) {
                    lVar.invoke(gVar3);
                }
                return Unit.INSTANCE;
            case 16:
                GeoPointDTO geoPointDTO3 = (GeoPointDTO) obj;
                geoPointDTO3.getClass();
                ((c60.a) obj3).invoke();
                ((e23.l) obj2).invoke(geoPointDTO3);
                return Unit.INSTANCE;
            case 17:
                q90.d dVar = (q90.d) obj;
                dVar.getClass();
                ((m0) obj3).n();
                ((t1) obj2).invoke(dVar);
                return Unit.INSTANCE;
            case 18:
                Long l14 = (Long) obj;
                l14.getClass();
                y.l((m0) obj3, new b1.l((l90.b) obj2, l14));
                return Unit.INSTANCE;
            case 19:
                l90.b bVar4 = (l90.b) obj;
                bVar4.getClass();
                y.l((m0) obj3, new b1.i(bVar4, (l90.k) obj2));
                return Unit.INSTANCE;
            case 20:
                sg1.c cVar2 = (sg1.c) obj;
                cVar2.getClass();
                ((qa0.f) obj3).x4(cVar2.f159207e, true, true);
                ((m0) obj2).n();
                return Unit.INSTANCE;
            case 21:
                n1.l lVar2 = (n1.l) obj3;
                q90.c cVar3 = lVar2.f26378a;
                ((aa2.f) obj2).invoke(cVar3, ((Boolean) obj).booleanValue() ? lVar2.f26380c ? new q90.f.C2707f(cVar3.f143493a) : new q90.f.e(cVar3.f143493a) : q90.f.a.f143522a, Boolean.valueOf(lVar2.f26381d));
                return Unit.INSTANCE;
            case 22:
                n1.k kVar = (n1.k) obj3;
                q90.c cVar4 = kVar.f26374a;
                ((aa2.f) obj2).invoke(cVar4, ((Boolean) obj).booleanValue() ? new q90.f.d(cVar4.f143493a) : q90.f.a.f143522a, Boolean.valueOf(kVar.f26376c));
                return Unit.INSTANCE;
            case 23:
                ud.a aVar9 = (ud.a) obj;
                cf.c.b bVar5 = cf.c.f26902c;
                aVar9.getClass();
                ((cf.c) obj3).f26904b.d(aVar9, (cf.a) obj2);
                return Unit.INSTANCE;
            case 24:
                ud.a aVar10 = (ud.a) obj;
                cf.f.b bVar6 = cf.f.f26912c;
                aVar10.getClass();
                ((cf.f) obj3).f26914b.d(aVar10, (cf.d) obj2);
                return Unit.INSTANCE;
            case 25:
                ud.a aVar11 = (ud.a) obj;
                cf.l.b bVar7 = cf.l.f26926c;
                aVar11.getClass();
                ((cf.l) obj3).f26928b.d(aVar11, (cf.i) obj2);
                return Unit.INSTANCE;
            case 26:
                ud.a aVar12 = (ud.a) obj;
                cf.p.b bVar8 = cf.p.f26933c;
                aVar12.getClass();
                ((cf.p) obj3).f26935b.d(aVar12, (n) obj2);
                return Unit.INSTANCE;
            case 27:
                androidx.work.c cVar5 = (androidx.work.c) obj3;
                String str3 = (String) obj2;
                ud.a aVar13 = (ud.a) obj;
                b0.c cVar6 = b0.f26898d;
                aVar13.getClass();
                ud.c cVarM1 = aVar13.M0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    androidx.work.c.f11464b.getClass();
                    cVarM1.t(1, androidx.work.c.b.c(cVar5));
                    cVarM1.q3(2, str3);
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 28:
                ue.h0.c cVar7 = (ue.h0.c) obj3;
                String str4 = (String) obj2;
                ud.a aVar14 = (ud.a) obj;
                b0.c cVar8 = b0.f26898d;
                aVar14.getClass();
                ud.c cVarM2 = aVar14.M0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    cVarM2.h(1, f0.i(cVar7));
                    cVarM2.q3(2, str4);
                    cVarM2.J0();
                    return Integer.valueOf(g8.i.L(aVar14));
                } finally {
                    cVarM2.close();
                }
            default:
                ud.a aVar15 = (ud.a) obj;
                e0.b bVar9 = e0.f26909c;
                aVar15.getClass();
                ((e0) obj3).f26911b.d(aVar15, (c0) obj2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f19388a = i14;
        this.f19389b = obj;
        this.f19390c = obj2;
    }
}

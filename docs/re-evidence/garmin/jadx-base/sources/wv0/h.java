package wv0;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import com.google.gson.Gson;
import e2.f0;
import e23.p;
import gl1.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l72.i3;
import lc.k0;
import lc.v;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import p008y1.b0;
import p008y1.m1;
import p008y1.n1;
import p008y1.o2;
import p008y1.y1;
import p13.h0;
import p13.j0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import r1.l;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f187400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f187401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f187402e;

    public /* synthetic */ h(e23.a aVar, e23.a aVar2, c.q qVar, Context context) {
        this.f187398a = 13;
        this.f187400c = aVar;
        this.f187399b = aVar2;
        this.f187401d = qVar;
        this.f187402e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v53, types: [T, android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String profileImageUrlSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String profileImageUrlMedium;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        String invitorProfilePicURL;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3;
        ab1.g powerGuidanceSummary;
        String strB;
        int i14 = this.f187398a;
        final int i15 = 0;
        final int i16 = 2;
        final int i17 = 1;
        Object obj2 = this.f187402e;
        Object obj3 = this.f187401d;
        Object obj4 = this.f187400c;
        Object obj5 = this.f187399b;
        switch (i14) {
            case 0:
                i53.c cVar = (i53.c) obj5;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.b(f0Var, null, new z3.e(962935786, true, new ak0.p((e23.a) obj4, 28)), 3);
                f0Var.a(cVar.size(), null, new i.p(i.o.f187428a, cVar), new z3.e(802480018, true, new i.q(cVar, (e23.l) obj3, (e23.l) obj2)));
                return Unit.INSTANCE;
            case 1:
                i53.c cVar2 = (i53.c) obj5;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0.b(f0Var2, null, new z3.e(-1602581166, true, new ak0.p((e23.a) obj4, 27)), 3);
                f0Var2.a(cVar2.size(), null, new m(l.f187438a, cVar2), new z3.e(802480018, true, new n(cVar2, (e23.l) obj3, (z3.e) obj2)));
                return Unit.INSTANCE;
            case 2:
                wz0.a aVar = ((wz0.b) obj5).f188141f;
                List list = (List) obj4;
                m0 m0Var = (m0) obj3;
                Context context = (Context) obj2;
                uz0.d dVar = (uz0.d) obj;
                int i18 = wz0.b.f188136g;
                dVar.getClass();
                vz0.b.a aVar2 = vz0.b.f180871b;
                Integer requestKey = dVar.getRequestKey();
                aVar2.getClass();
                vz0.b bVarB = vz0.b.a.b(requestKey);
                int i19 = bVarB == null ? -1 : wz0.b.c.f188144a[bVarB.ordinal()];
                if (i19 == 1 || i19 == 2) {
                    Object objFromJson = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                    objFromJson.getClass();
                    uz0.b bVar = (uz0.b) objFromJson;
                    Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = aVar.f188131c;
                    Long userProfileId = bVar.getUserProfileId();
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar = map.get(userProfileId != null ? Integer.valueOf((int) userProfileId.longValue()) : null);
                    if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlSmall = profileImageUrls.f46876e) == null) {
                        profileImageUrlSmall = bVar.getProfileImageUrlSmall();
                    }
                    list.add(new b12.b(profileImageUrlSmall, null, null, null, null, 30, null));
                    m0Var.f105804a |= p005kotlin.jvm.internal.s.g(bVar.getRequestViewed(), Boolean.FALSE);
                    return sz0.o.f(bVar, context, bVarB, null, lVar);
                }
                if (i19 == 3) {
                    Object objFromJson2 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.m.class);
                    objFromJson2.getClass();
                    uz0.m mVar = (uz0.m) objFromJson2;
                    Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map2 = aVar.f188131c;
                    Long userId = mVar.getUserId();
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar2 = map2.get(userId != null ? Integer.valueOf((int) userId.longValue()) : null);
                    if (lVar2 == null || (profileImageUrls2 = lVar2.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls2.f46876e) == null) {
                        profileImageUrlMedium = mVar.getProfileImageUrlMedium();
                    }
                    list.add(new b12.b(profileImageUrlMedium, null, null, null, null, 30, null));
                    m0Var.f105804a |= p005kotlin.jvm.internal.s.g(mVar.getRequestViewed(), Boolean.FALSE);
                    return sz0.o.g(mVar, context, null, lVar2);
                }
                if (i19 != 4) {
                    vb.h.s("Need implement new type dto transfer to notification entry");
                    return null;
                }
                Object objFromJson3 = new Gson().fromJson(dVar.getData(), (Class<Object>) com.garmin.android.apps.connectmobile.smartscale.model.b.class);
                objFromJson3.getClass();
                com.garmin.android.apps.connectmobile.smartscale.model.b bVar2 = (com.garmin.android.apps.connectmobile.smartscale.model.b) objFromJson3;
                Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map3 = aVar.f188131c;
                Long invitorID = bVar2.getInvitorID();
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar3 = map3.get(invitorID != null ? Integer.valueOf((int) invitorID.longValue()) : null);
                if (lVar3 == null || (profileImageUrls3 = lVar3.getProfileImageUrls()) == null || (invitorProfilePicURL = profileImageUrls3.f46876e) == null) {
                    invitorProfilePicURL = bVar2.getInvitorProfilePicURL();
                }
                list.add(new b12.b(invitorProfilePicURL, null, null, null, null, 30, null));
                m0Var.f105804a |= p005kotlin.jvm.internal.s.g(bVar2.getRequestViewed(), Boolean.FALSE);
                return sz0.o.d(bVar2, context, null, lVar3);
            case 3:
                ab1.f fVar = (ab1.f) obj5;
                Long l14 = (Long) obj4;
                xa1.k kVar = (xa1.k) obj3;
                y0 y0Var = (y0) obj2;
                ok1.b bVar3 = (ok1.b) obj;
                ab1.d dVar2 = fVar.f2563a;
                Integer num = (dVar2 == null || (powerGuidanceSummary = dVar2.getPowerGuidanceSummary()) == null) ? null : powerGuidanceSummary.f2573f;
                if (num != null) {
                    if (l14 != null) {
                        PowerZonesDTO powerZonesDTO = bVar3.f132582a;
                        Integer numValueOf = powerZonesDTO != null ? Integer.valueOf(powerZonesDTO.f43987b) : null;
                        if (numValueOf != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = numValueOf.intValue();
                            int i24 = xa1.k.f189751k;
                            kVar.getClass();
                            if (Math.abs(iIntValue2 - iIntValue) >= 5) {
                                if (dVar2.getAlertUserSettingsChanges() == null) {
                                    dVar2.h(new ab1.a(p13.w.c(new ab1.a.b.C0031a(numValueOf.intValue())), ab1.a.AbstractC0027a.C0028a.f2534a));
                                } else {
                                    ab1.a alertUserSettingsChanges = dVar2.getAlertUserSettingsChanges();
                                    List<? extends ab1.a.b> list2 = alertUserSettingsChanges != null ? alertUserSettingsChanges.f2532a : null;
                                    if (list2 == null) {
                                        list2 = j0.f134944a;
                                    }
                                    ArrayList arrayListD1 = h0.d1(list2);
                                    arrayListD1.add(new ab1.a.b.C0031a(numValueOf.intValue()));
                                    ab1.a alertUserSettingsChanges2 = dVar2.getAlertUserSettingsChanges();
                                    if (alertUserSettingsChanges2 != null) {
                                        alertUserSettingsChanges2.f2532a = arrayListD1;
                                    }
                                }
                            }
                        }
                    }
                    PowerZonesDTO powerZonesDTO2 = bVar3.f132582a;
                    if (powerZonesDTO2 != null) {
                        int iIntValue3 = num.intValue();
                        ok1.a aVar3 = ok1.a.f132581a;
                        powerZonesDTO2.f43987b = iIntValue3;
                        ok1.a.d(powerZonesDTO2);
                    }
                }
                fVar.f2565c = bVar3.f132582a;
                kVar.f189760i.j(fVar);
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(fVar));
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj5;
                xc0.l lVar4 = (xc0.l) obj4;
                String str2 = (String) obj3;
                gj1.c cVar3 = (gj1.c) obj2;
                vm2.h hVar = (vm2.h) obj;
                Logger logger = xc0.l.f189932m;
                ew2.e.f66901a.getClass();
                AlertDialog alertDialog = ew2.e.f66903c;
                if (alertDialog != null) {
                    alertDialog.cancel();
                }
                if (hVar != null && hVar.f178831a) {
                    new Handler(Looper.getMainLooper()).post(new uj2.b(lVar4, 9, str2, cVar3));
                    return Unit.INSTANCE;
                }
                ew2.f fVar2 = xc0.l.f189933n;
                if (fVar2 != null) {
                    fVar2.a(str);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceRemovalOperationDelegate");
                throw null;
            case 5:
                xu2.c cVar4 = (xu2.c) obj5;
                xu2.d dVar3 = (xu2.d) obj4;
                dx2.c cVar5 = (dx2.c) obj3;
                Map<String, ? extends Object> map4 = (Map) obj2;
                StyledTextView styledTextView = cVar4.f192260d;
                String strF = dVar3.f(cVar5, map4);
                if (strF.length() == 0) {
                    cVar4.f192257a.d(null, "Did not find the translation for Row ID: " + map4.get(gw2.i.ROW_ID.f79975a));
                    cVar4.f192259c.setVisibility(8);
                }
                styledTextView.setText(strF);
                cVar4.j(cVar5, map4, null);
                cVar4.k(dVar3, cVar5, map4);
                return Unit.INSTANCE;
            case 6:
                Integer num2 = (Integer) obj5;
                e23.l lVar5 = (e23.l) obj3;
                e23.l lVar6 = (e23.l) obj2;
                p1 p1Var = (p1) obj4;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                s5.c cVar6 = l0Var.f188878a;
                if (cVar6.f157138b.length() <= num2.intValue() && num2.intValue() > 0) {
                    String str3 = (String) lVar5.invoke(cVar6.f157138b);
                    lVar6.invoke(str3);
                    int length = str3.length();
                    p1Var.setValue(l0.a(l0Var, str3, og.a.l(length, length), 4));
                }
                return Unit.INSTANCE;
            case 7:
                o0 o0Var = (o0) obj5;
                b0 b0Var = (b0) obj2;
                s1.j jVar = (s1.j) obj;
                float fFloatValue = ((Number) jVar.f155607e.getF182175a()).floatValue() - o0Var.f105806a;
                float f14 = ((o2) obj4).f(fFloatValue);
                o0Var.f105806a = ((Number) jVar.f155607e.getF182175a()).floatValue();
                ((o0) obj3).f105806a = ((Number) jVar.b()).floatValue();
                if (Math.abs(fFloatValue - f14) > 0.5f) {
                    jVar.a();
                }
                b0Var.getClass();
                return Unit.INSTANCE;
            case 8:
                o0 o0Var2 = (o0) obj5;
                n1 n1Var = (n1) obj4;
                y1 y1Var = (y1) obj3;
                ug2.q qVar = (ug2.q) obj2;
                s1.j jVar2 = (s1.j) obj;
                float fFloatValue2 = ((Number) jVar2.f155607e.getF182175a()).floatValue() - o0Var2.f105806a;
                if (!m1.a(fFloatValue2)) {
                    if (!m1.a(fFloatValue2 - n1Var.d(y1Var, fFloatValue2))) {
                        jVar2.a();
                        return Unit.INSTANCE;
                    }
                    o0Var2.f105806a += fFloatValue2;
                }
                if (((Boolean) qVar.invoke(Float.valueOf(o0Var2.f105806a))).booleanValue()) {
                    jVar2.a();
                }
                return Unit.INSTANCE;
            case 9:
                Context context2 = (Context) obj5;
                c.q qVar2 = (c.q) obj4;
                r0 r0Var = (r0) obj3;
                p1 p1Var2 = (p1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ?? C = y22.e.c(context2);
                    r0Var.f105810a = C;
                    qVar2.a(C, null);
                } else {
                    p1Var2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 10:
                final yk1.i iVar = (yk1.i) obj5;
                final StrideLengthSettingsActivity strideLengthSettingsActivity = (StrideLengthSettingsActivity) obj3;
                final e23.a aVar4 = (e23.a) obj4;
                k0 k0Var = (k0) obj;
                StrideLengthSettingsActivity.a aVar5 = StrideLengthSettingsActivity.f44198b;
                k0Var.getClass();
                nc.n.b(k0Var, "HomeSettingsScreen", null, null, null, null, null, null, new z3.e(-1419095632, true, new qw.b(iVar, strideLengthSettingsActivity, aVar4, (lc.m0) obj2, 16)), 254);
                nc.n.b(k0Var, "WALKING", null, null, null, null, null, null, new z3.e(1692044327, true, new e23.r() { // from class: yk1.d
                    @Override // e23.r
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i25 = i17;
                        final i iVar2 = iVar;
                        l lVar7 = (l) obj6;
                        v vVar = (v) obj7;
                        m mVar2 = (m) obj8;
                        ((Integer) obj9).getClass();
                        StrideLengthSettingsActivity.a aVar6 = StrideLengthSettingsActivity.f44198b;
                        switch (i25) {
                            case 0:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var = n.f135158a;
                                String strQ = y.Q(mVar2, R.string.lbl_pushing_stroke_length);
                                final int i26 = 0;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity2 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity2.fa(strQ, aVar4, z3.f.c(-956339762, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i27 = i26;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity3 = strideLengthSettingsActivity2;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i27) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var2 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity3.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var3 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity3.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity3.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                            case 1:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var2 = n.f135158a;
                                String strQ2 = y.Q(mVar2, R.string.lbl_walking_stride_length);
                                final int i27 = 2;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity3 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity3.fa(strQ2, aVar4, z3.f.c(-1522873396, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i28 = i27;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity4 = strideLengthSettingsActivity3;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i28) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var3 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity4.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity4.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity4.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                            default:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var3 = n.f135158a;
                                String strQ3 = y.Q(mVar2, R.string.lbl_running_stride_length);
                                final int i28 = 1;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity4 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity4.fa(strQ3, aVar4, z3.f.c(907877069, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i28;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity4;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                nc.n.b(k0Var, "RUNNING", null, null, null, null, null, null, new z3.e(-172172504, true, new e23.r() { // from class: yk1.d
                    @Override // e23.r
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i25 = i16;
                        final i iVar2 = iVar;
                        l lVar7 = (l) obj6;
                        v vVar = (v) obj7;
                        m mVar2 = (m) obj8;
                        ((Integer) obj9).getClass();
                        StrideLengthSettingsActivity.a aVar6 = StrideLengthSettingsActivity.f44198b;
                        switch (i25) {
                            case 0:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var = n.f135158a;
                                String strQ = y.Q(mVar2, R.string.lbl_pushing_stroke_length);
                                final int i26 = 0;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity2 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity2.fa(strQ, aVar4, z3.f.c(-956339762, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i26;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity2;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                            case 1:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var2 = n.f135158a;
                                String strQ2 = y.Q(mVar2, R.string.lbl_walking_stride_length);
                                final int i27 = 2;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity3 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity3.fa(strQ2, aVar4, z3.f.c(-1522873396, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i27;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity3;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                            default:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var3 = n.f135158a;
                                String strQ3 = y.Q(mVar2, R.string.lbl_running_stride_length);
                                final int i28 = 1;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity4 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity4.fa(strQ3, aVar4, z3.f.c(907877069, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i28;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity4;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                nc.n.b(k0Var, "WHEELCHAIR_PUSHING", null, null, null, null, null, null, new z3.e(-2036389335, true, new e23.r() { // from class: yk1.d
                    @Override // e23.r
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i25 = i15;
                        final i iVar2 = iVar;
                        l lVar7 = (l) obj6;
                        v vVar = (v) obj7;
                        m mVar2 = (m) obj8;
                        ((Integer) obj9).getClass();
                        StrideLengthSettingsActivity.a aVar6 = StrideLengthSettingsActivity.f44198b;
                        switch (i25) {
                            case 0:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var = n.f135158a;
                                String strQ = y.Q(mVar2, R.string.lbl_pushing_stroke_length);
                                final int i26 = 0;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity2 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity2.fa(strQ, aVar4, z3.f.c(-956339762, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i26;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity2;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                            case 1:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var2 = n.f135158a;
                                String strQ2 = y.Q(mVar2, R.string.lbl_walking_stride_length);
                                final int i27 = 2;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity3 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity3.fa(strQ2, aVar4, z3.f.c(-1522873396, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i27;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity3;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                            default:
                                lVar7.getClass();
                                vVar.getClass();
                                x1 x1Var3 = n.f135158a;
                                String strQ3 = y.Q(mVar2, R.string.lbl_running_stride_length);
                                final int i28 = 1;
                                final StrideLengthSettingsActivity strideLengthSettingsActivity4 = strideLengthSettingsActivity;
                                strideLengthSettingsActivity4.fa(strQ3, aVar4, z3.f.c(907877069, new p() { // from class: yk1.e
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i29 = i28;
                                        StrideLengthSettingsActivity strideLengthSettingsActivity5 = strideLengthSettingsActivity4;
                                        i iVar3 = iVar2;
                                        m mVar3 = (m) obj10;
                                        int iIntValue4 = ((Integer) obj11).intValue();
                                        switch (i29) {
                                            case 0:
                                                StrideLengthSettingsActivity.a aVar7 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    iVar3.z4("WHEELCHAIR_PUSHING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WHEELCHAIR_PUSHING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            case 1:
                                                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    iVar3.z4("RUNNING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "RUNNING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                            default:
                                                StrideLengthSettingsActivity.a aVar9 = StrideLengthSettingsActivity.f44198b;
                                                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    iVar3.z4("WALKING");
                                                    strideLengthSettingsActivity5.ca(iVar3, "WALKING", mVar3, 48);
                                                } else {
                                                    mVar3.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), mVar2, 384);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                return Unit.INSTANCE;
            case 11:
                DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) obj5;
                androidx.appcompat.app.e.a aVar6 = (androidx.appcompat.app.e.a) obj;
                aVar6.getClass();
                aVar6.setTitle(R.string.wallet_title_maintenance_notice);
                String string = aVar6.getContext().getString(R.string.wallet_message_maintenance_notice);
                string.getClass();
                aVar6.setMessage(String.format(string, Arrays.copyOf(new Object[]{dateTimeFormatter.print((LocalTime) obj3), dateTimeFormatter.print((LocalTime) obj2)}, 2)));
                aVar6.setPositiveButton(R.string.lbl_ok, new c32.a((e23.a) obj4, 14));
                return Unit.INSTANCE;
            case 12:
                yv2.g gVar = (yv2.g) obj5;
                dx2.c cVar7 = (dx2.c) obj4;
                Map<String, ? extends Object> map5 = (Map) obj3;
                yv2.f fVar3 = (yv2.f) obj2;
                cx2.h hVar2 = yv2.g.f199864f;
                gVar.j(cVar7, map5, null);
                StyledTextView styledTextView2 = gVar.f199865a;
                String strB2 = fVar3.b(dx2.c.M4(map5));
                if (strB2.length() == 0) {
                    yv2.g.f199864f.d(null, "Did not find the translation for Row ID: " + map5.get(gw2.i.ROW_ID.f79975a));
                    gVar.f199868d.setVisibility(8);
                }
                styledTextView2.setText(strB2);
                cx2.g.g(gVar.f199866b, fVar3.e(cVar7, map5));
                gVar.f199867c.setVisibility(cVar7.Z4(map5) ? 0 : 8);
                return Unit.INSTANCE;
            case 13:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                gl1.d.D(i3Var, new fv0.d((c.q) obj3, (Context) obj2, 10), (e23.a) obj4, (e23.a) obj5);
                return Unit.INSTANCE;
            case 14:
                zv2.c cVar8 = (zv2.c) obj5;
                zv2.b bVar4 = (zv2.b) obj4;
                dx2.c cVar9 = (dx2.c) obj3;
                Map<String, ? extends Object> map6 = (Map) obj2;
                StyledTextView styledTextView3 = cVar8.f207182c;
                Context context3 = cVar8.ctx;
                Context context4 = bVar4.f207282a;
                Object obj6 = map6.get(gw2.i.LINK_OPTIONS.f79975a);
                Map map7 = obj6 instanceof Map ? (Map) obj6 : null;
                if (p005kotlin.jvm.internal.s.g(map7 != null ? map7.get(gw2.i.DEST_PAGE.f79975a) : null, "GARMIN_PAY_SETUP")) {
                    strB = context4.getString(R.string.common_conjunct_ampersand_2, context4.getString(R.string.wallet_brand), context4.getString(R.string.wallet_garmin_pay));
                    strB.getClass();
                } else {
                    strB = bVar4.b(dx2.c.M4(map6));
                }
                if (strB.length() == 0) {
                    zv2.c.f207179g.d(null, "Did not find the translation for Row ID: " + map6.get(gw2.i.ROW_ID.f79975a));
                    cVar8.f207181b.setVisibility(8);
                }
                String str4 = zw2.f.d(cVar9, map6).f207295b;
                if (str4 != null) {
                    AppCompatImageView appCompatImageView = cVar8.leftIconImageView;
                    dw2.a.f61447a.getClass();
                    context3.getClass();
                    appCompatImageView.setContentDescription(str4.equals("ADD_ACTION") ? context3.getString(R.string.rts_lbl_add_to_device, strB) : null);
                }
                String str5 = cVar9.I4(map6).f207295b;
                if (str5 != null) {
                    AppCompatImageView appCompatImageView2 = cVar8.iconImageView;
                    dw2.a.f61447a.getClass();
                    context3.getClass();
                    appCompatImageView2.setContentDescription(str5.equals("ADD_ACTION") ? context3.getString(R.string.rts_lbl_add_to_device, strB) : null);
                }
                styledTextView3.setText(strB);
                cVar8.j(cVar9, map6, bVar4);
                return Unit.INSTANCE;
            default:
                zv2.d dVar4 = (zv2.d) obj5;
                zw2.h hVar3 = (zw2.h) obj4;
                dx2.c cVar10 = (dx2.c) obj3;
                Map<String, ? extends Object> map8 = (Map) obj2;
                AppCompatImageView appCompatImageView3 = dVar4.f207191e;
                zw2.g.c cVarI4 = cVar10.I4(map8);
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                cx2.g.f(appCompatImageView3, cVarI4, com.garmin.realtimesettings.app.initialization.b.f52593e, 4);
                StyledTextView styledTextView4 = dVar4.f207192f;
                String strF2 = hVar3.f(cVar10, map8);
                if (strF2.length() == 0) {
                    dVar4.f207190d.d(null, "Did not find the translation for Row ID: " + map8.get(gw2.i.ROW_ID.f79975a));
                    dVar4.f207194h.setVisibility(8);
                }
                styledTextView4.setText(strF2);
                dVar4.k(hVar3.k(dVar4));
                dVar4.j(cVar10, map8, null);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f187398a = i14;
        this.f187399b = obj;
        this.f187400c = obj2;
        this.f187401d = obj3;
        this.f187402e = obj4;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f187398a = i14;
        this.f187399b = obj;
        this.f187401d = obj2;
        this.f187402e = obj3;
        this.f187400c = obj4;
    }

    public /* synthetic */ h(yk1.i iVar, StrideLengthSettingsActivity strideLengthSettingsActivity, e23.a aVar, lc.m0 m0Var) {
        this.f187398a = 10;
        this.f187399b = iVar;
        this.f187401d = strideLengthSettingsActivity;
        this.f187400c = aVar;
        this.f187402e = m0Var;
    }
}

package qn0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.badges.redesign.CompareBadgesActivity;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity;
import ei0.u0;
import nr.m0;
import nr.w0;
import p005kotlin.Unit;
import p13.h0;
import p3.l1;
import p3.p1;
import p3.x3;
import qs.e0;
import r22.e2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f145796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f145797c;

    public /* synthetic */ f(Context context, com.garmin.android.apps.connectmobile.badges.service.model.q qVar) {
        this.f145795a = 18;
        this.f145797c = context;
        this.f145796b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Long userId;
        int i14 = this.f145795a;
        Object obj = this.f145797c;
        Object obj2 = this.f145796b;
        switch (i14) {
            case 0:
                int i15 = i.f145805f;
                h82.c.f((i) obj2, (Context) obj, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                return Unit.INSTANCE;
            case 1:
                qr.t tVar = qr.t.this;
                int i16 = qr.t.A2;
                tVar.E4((w0) obj);
                return Unit.INSTANCE;
            case 2:
                qr.t tVar2 = (qr.t) obj2;
                int i17 = qr.t.A2;
                String str = ((mr.p) obj).f120281a;
                tVar2.getClass();
                tVar2.E4(new w0.z(str));
                return Unit.INSTANCE;
            case 3:
                qr.t tVar3 = (qr.t) obj2;
                int i18 = qr.t.A2;
                q91.d dVar = ((m0) obj).f127262e;
                tVar3.getClass();
                tVar3.E4(new w0.n0(dVar));
                return Unit.INSTANCE;
            case 4:
                int i19 = qr.t.A2;
                ((qr.t) obj2).E4(new w0.k((am.g) obj));
                return Unit.INSTANCE;
            case 5:
                int i24 = qr.t.A2;
                ((qr.t) obj2).E4(new w0.e1((ps.p) obj));
                return Unit.INSTANCE;
            case 6:
                int i25 = qr.t.A2;
                ((qr.t) obj2).E4(new w0.s(((pe0.a) obj).f137398a));
                return Unit.INSTANCE;
            case 7:
                int i26 = qr.t.A2;
                e0 e0Var = (e0) ((Enum) obj);
                ((qr.t) obj2).P5(new nr.y.c(e0Var.getF147042b(), e0Var.getF147043c()));
                return Unit.INSTANCE;
            case 8:
                cs.a aVar = (cs.a) obj;
                int i27 = qr.t.A2;
                ((qr.t) obj2).P5(new nr.y.b(Integer.valueOf(aVar.f55443a), Integer.valueOf(aVar.f55444b), Integer.valueOf(aVar.f55445c)));
                return Unit.INSTANCE;
            case 9:
                int i28 = qr.t.A2;
                ((qr.t) obj2).E4(w0.g1.a((w0.g1) obj, null, null, 31));
                return Unit.INSTANCE;
            case 10:
                int i29 = qr.t.A2;
                ((qr.t) obj2).P5(new nr.y.a((Integer) obj));
                return Unit.INSTANCE;
            case 11:
                ps.x xVar = (ps.x) obj;
                int i30 = qr.t.A2;
                ((qr.t) obj2).E4(new w0.a0(xVar.getCalendarEventId(), xVar.getCalendarEventUuid()));
                return Unit.INSTANCE;
            case 12:
                ((e23.l) obj2).invoke((bx.b) obj);
                return Unit.INSTANCE;
            case 13:
                ((e23.l) obj2).invoke((dy1.u) obj);
                return Unit.INSTANCE;
            case 14:
                ((e23.l) obj2).invoke((mx1.f) obj);
                return Unit.INSTANCE;
            case 15:
                return Boolean.valueOf((((b63.o) ((x3) obj2).getF182175a()) == null && ((i53.f) ((x3) obj).getF182175a()) == null) ? false : true);
            case 16:
                i53.c cVar = (i53.c) obj2;
                p1 p1Var = (p1) obj;
                if (cVar.size() == 1) {
                    return ((b11.i) h0.b0(cVar)).h((b63.v) p1Var.getF182175a());
                }
                return null;
            case 17:
                ((e23.l) obj2).invoke((l01.a) obj);
                return Unit.INSTANCE;
            case 18:
                Context context = (Context) obj;
                com.garmin.android.apps.connectmobile.badges.service.model.q qVar = (com.garmin.android.apps.connectmobile.badges.service.model.q) obj2;
                CompareBadgesActivity.a aVar2 = CompareBadgesActivity.f30346q;
                Integer userProfileId = qVar.getUserProfileId();
                int iIntValue = userProfileId != null ? userProfileId.intValue() : 0;
                String fullName = qVar.getFullName();
                String displayName = qVar.getDisplayName();
                Integer userLevel = qVar.getUserLevel();
                com.garmin.android.apps.connectmobile.badges.service.model.v vVar = new com.garmin.android.apps.connectmobile.badges.service.model.v(iIntValue, fullName, displayName, false, null, null, null, userLevel != null ? userLevel.intValue() : 0, qVar.getUserPoint(), 0, null, false, qVar.getHasPrivate(), null, 11896, null);
                aVar2.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) CompareBadgesActivity.class);
                intent.putExtra("GCM_extra_connection_profile_badges", vVar);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 19:
                e2 e2Var = (e2) obj2;
                e2Var.f149644f.invoke(Double.valueOf(((l1) obj).getDoubleValue()));
                e2Var.dismiss();
                return Unit.INSTANCE;
            case 20:
                ((e23.l) obj2).invoke(Long.valueOf(((k31.a) obj).f102603a));
                return Unit.INSTANCE;
            case 21:
                ((e23.l) obj2).invoke(((k31.c) obj).f102645a);
                return Unit.INSTANCE;
            case 22:
                ((qw0.y) obj2).invoke((GeoPointDTO) obj);
                return Unit.INSTANCE;
            case 23:
                CoursePointListActivity coursePointListActivity = (CoursePointListActivity) obj2;
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                CoursePointListActivity.a aVar3 = CoursePointListActivity.f33079c;
                if (coursePointListActivity.hasInternetConnection()) {
                    r50.g gVarDa = coursePointListActivity.da();
                    gVarDa.getClass();
                    fVar.getClass();
                    gVarDa.y4(new t50.c.e(fVar));
                } else {
                    coursePointListActivity.displayFailedMessage();
                    coursePointListActivity.da().x4();
                    coursePointListActivity.da().z4();
                }
                return Unit.INSTANCE;
            case 24:
                p1 p1Var2 = (p1) obj;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                Boolean bool = (Boolean) p1Var2.getF182175a();
                bool.getClass();
                ((r72.m) obj2).invoke(bool);
                return Unit.INSTANCE;
            case 25:
                p1 p1Var3 = (p1) obj;
                p1Var3.setValue(Boolean.valueOf(!((Boolean) p1Var3.getF182175a()).booleanValue()));
                Boolean bool2 = (Boolean) p1Var3.getF182175a();
                bool2.getClass();
                ((r72.m) obj2).invoke(bool2);
                return Unit.INSTANCE;
            case 26:
                ((e23.l) obj2).invoke(Long.valueOf(((u0.a) ((id1.c.e) obj)).f64330a));
                return Unit.INSTANCE;
            case 27:
                InviteAuthorizedUserActivity.a aVar4 = InviteAuthorizedUserActivity.f34996q;
                ((p1) obj).setValue(Boolean.TRUE);
                ((InviteAuthorizedUserActivity) obj2).da();
                return Unit.INSTANCE;
            case 28:
                InviteAuthorizedUserActivity inviteAuthorizedUserActivity = (InviteAuthorizedUserActivity) obj2;
                Context context2 = (Context) obj;
                InviteAuthorizedUserActivity.a aVar5 = InviteAuthorizedUserActivity.f34996q;
                hi0.a aVar6 = (hi0.a) r53.s.d(inviteAuthorizedUserActivity.ha().f35156e).f150540a.getValue();
                if (aVar6 == null || (userId = aVar6.getUserId()) == null) {
                    return Unit.INSTANCE;
                }
                long jLongValue = userId.longValue();
                f.c<Intent> cVar2 = inviteAuthorizedUserActivity.f35003p;
                AuthorizedUserConsentActivity.a aVar7 = AuthorizedUserConsentActivity.f34946c;
                hl.a.c cVar3 = hl.a.c.f84256b;
                aVar7.getClass();
                context2.getClass();
                cVar3.getClass();
                Intent intent2 = new Intent(context2, (Class<?>) AuthorizedUserConsentActivity.class);
                intent2.putExtra("AuthorizedUserConsentFragmentInviteeIdKey", jLongValue);
                intent2.putExtra("GCM_extra_screen_access_role", cVar3);
                cVar2.a(intent2, null);
                return Unit.INSTANCE;
            default:
                ((e23.l) obj2).invoke(((uk0.g) obj).h());
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f145795a = i14;
        this.f145796b = obj;
        this.f145797c = obj2;
    }
}

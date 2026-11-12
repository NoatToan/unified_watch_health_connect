package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardActivity;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeRulesActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupListDTO;
import com.garmin.android.apps.connectmobile.feed.activity.exception.DeletedActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.PrivateActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/d3;", "Ljm0/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d3 implements jm0.b {
    @Override // jm0.b
    public final Object A(String str, h10.j jVar) {
        ym0.a.f197886f.getClass();
        ym0.a aVarA = ym0.a.C3709a.a();
        return com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.j0(aVarA, str, null), jVar);
    }

    @Override // jm0.b
    public final boolean B() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("social_group_invite_member_auto_completion_enabled");
    }

    @Override // jm0.b
    public final void a(Context context, GroupChallengeDTO groupChallengeDTO) {
        GroupChallengeRulesActivity.ca(context, groupChallengeDTO, 1);
    }

    @Override // jm0.b
    public final Intent b(Activity activity, Uri uri, Rect rect, float f14) {
        activity.getClass();
        uri.getClass();
        return UCropImageActivity.a.a(UCropImageActivity.f44623o, activity, uri, 100, 48, null, rect, f14, 16);
    }

    @Override // jm0.b
    public final Object c(long j8, long j14, v13.i iVar) {
        ym0.a.f197886f.getClass();
        ym0.a aVarA = ym0.a.C3709a.a();
        return com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.c(aVarA, j8, new wm0.c(new Long(j14), null, null, null, null, 30, null), null), iVar);
    }

    @Override // jm0.b
    public final Intent d(Context context, String str, String str2, String str3) {
        context.getClass();
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        return UserProfileActivity.a.b(context, str, str2, str3);
    }

    @Override // jm0.b
    public final String e(Context context, GroupChallengeDTO groupChallengeDTO) {
        return com.garmin.android.apps.connectmobile.leaderboard.challenges.x.j(context, c22.j0.N(groupChallengeDTO.f31520i, true), c22.j0.N(groupChallengeDTO.f31521j, true), true, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // jm0.b
    public final Object f(Context context, String str, String str2, GroupDTO.c cVar, v13.c cVar2) {
        z2 z2Var;
        Context context2;
        GroupDTO.c cVar3;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        GroupDTO.c cVar4;
        ActivityListItemDTO activityListItemDTO;
        if (cVar2 instanceof z2) {
            z2Var = (z2) cVar2;
            int i14 = z2Var.f104478g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z2Var.f104478g = i14 - Integer.MIN_VALUE;
            } else {
                z2Var = new z2(this, cVar2);
            }
        } else {
            z2Var = new z2(this, cVar2);
        }
        Object objJ = z2Var.f104476e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z2Var.f104478g;
        if (i15 == 0) {
            o13.r.b(objJ);
            ym0.a.f197886f.getClass();
            ym0.a aVarA = ym0.a.C3709a.a();
            context2 = context;
            z2Var.f104472a = context2;
            cVar3 = cVar;
            z2Var.f104473b = cVar3;
            z2Var.f104478g = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.s(aVarA, str, str2, null), z2Var);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            GroupDTO.c cVar5 = z2Var.f104473b;
            Context context3 = z2Var.f104472a;
            o13.r.b(objJ);
            cVar3 = cVar5;
            context2 = context3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            activityListItemDTO = z2Var.f104475d;
            com.garmin.android.apps.connectmobile.v2.b bVar = z2Var.f104474c;
            GroupDTO.c cVar6 = z2Var.f104473b;
            Context context4 = z2Var.f104472a;
            o13.r.b(objJ);
            context2 = context4;
            v2Var = bVar;
            cVar4 = cVar6;
        }
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = (Map) objJ;
        activityListItemDTO.Y1 = map;
        return new com.garmin.android.apps.connectmobile.v2.b(wg0.j.b(activityListItemDTO, context2, true, map, cVar4, null, 16), ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47387b, null, null, 12, null);
        com.garmin.android.apps.connectmobile.v2 v2Var2 = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            Integer num = ((com.garmin.android.apps.connectmobile.v2.a) v2Var2).f47384b;
            if (num != null && num.intValue() == 403) {
                return new com.garmin.android.apps.connectmobile.v2.a(new PrivateActivityException(), null, null, 6, null);
            }
            return (num != null && num.intValue() == 404) ? new com.garmin.android.apps.connectmobile.v2.a(new DeletedActivityException(), null, null, 6, null) : new com.garmin.android.apps.connectmobile.v2.a(new UnavailableReasonUnknownException(), null, null, 6, null);
        }
        com.garmin.android.apps.connectmobile.v2.b bVar2 = (com.garmin.android.apps.connectmobile.v2.b) v2Var2;
        ActivityListItemDTO activityListItemDTO2 = (ActivityListItemDTO) bVar2.f47386a;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map2 = activityListItemDTO2.Y1;
        map2.getClass();
        ArrayList arrayList = new ArrayList(map2.size());
        Iterator<Map.Entry<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().getKey()));
        }
        a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
        z2Var.f104472a = context2;
        z2Var.f104473b = cVar3;
        z2Var.f104474c = bVar2;
        z2Var.f104475d = activityListItemDTO2;
        z2Var.f104478g = 2;
        a22.i.a aVar2 = a22.i.f537b;
        Object objA = iVar.a(arrayList, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, z2Var);
        if (objA != aVar) {
            v2Var = v2Var2;
            objJ = objA;
            cVar4 = cVar3;
            activityListItemDTO = activityListItemDTO2;
            Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map3 = (Map) objJ;
            activityListItemDTO.Y1 = map3;
            return new com.garmin.android.apps.connectmobile.v2.b(wg0.j.b(activityListItemDTO, context2, true, map3, cVar4, null, 16), ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47387b, null, null, 12, null);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // jm0.b
    public final Object g(Context context, String str, String str2, GroupDTO.c cVar, v13.c cVar2) {
        a3 a3Var;
        GroupDTO.c cVar3;
        Object objJ;
        Context context2;
        Context context3;
        GroupDTO.c cVar4;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        jo1.e eVar;
        if (cVar2 instanceof a3) {
            a3Var = (a3) cVar2;
            int i14 = a3Var.f103977g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a3Var.f103977g = i14 - Integer.MIN_VALUE;
            } else {
                a3Var = new a3(this, cVar2);
            }
        } else {
            a3Var = new a3(this, cVar2);
        }
        Object obj = a3Var.f103975e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a3Var.f103977g;
        if (i15 == 0) {
            o13.r.b(obj);
            ym0.a.f197886f.getClass();
            ym0.a aVarA = ym0.a.C3709a.a();
            a3Var.f103971a = context;
            cVar3 = cVar;
            a3Var.f103972b = cVar3;
            a3Var.f103977g = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.f0(aVarA, str, "GROUP", str2, null), a3Var);
            if (objJ != aVar) {
                context2 = context;
            }
            return aVar;
        }
        if (i15 == 1) {
            cVar3 = a3Var.f103972b;
            Context context4 = a3Var.f103971a;
            o13.r.b(obj);
            objJ = obj;
            context2 = context4;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = a3Var.f103974d;
            v2Var = a3Var.f103973c;
            cVar4 = a3Var.f103972b;
            context3 = a3Var.f103971a;
            o13.r.b(obj);
        }
        return new com.garmin.android.apps.connectmobile.v2.b(wg0.j.a(eVar, context3, cVar4, (Map) obj), ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47387b, null, null, 12, null);
        com.garmin.android.apps.connectmobile.v2 v2Var2 = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (!(v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            Integer num = ((com.garmin.android.apps.connectmobile.v2.a) v2Var2).f47384b;
            if (num != null && num.intValue() == 403) {
                return new com.garmin.android.apps.connectmobile.v2.a(new PrivateActivityException(), null, null, 6, null);
            }
            return (num != null && num.intValue() == 404) ? new com.garmin.android.apps.connectmobile.v2.a(new DeletedActivityException(), null, null, 6, null) : new com.garmin.android.apps.connectmobile.v2.a(new UnavailableReasonUnknownException(), null, null, 6, null);
        }
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var2;
        jo1.e eVar2 = (jo1.e) bVar.f47386a;
        a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
        List<String> listC = p13.w.c(String.valueOf(eVar2.getUserProfilePk()));
        a3Var.f103971a = context2;
        a3Var.f103972b = cVar3;
        a3Var.f103973c = bVar;
        a3Var.f103974d = eVar2;
        a3Var.f103977g = 2;
        a22.i.a aVar2 = a22.i.f537b;
        Object objA = iVar.a(listC, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, a3Var);
        if (objA != aVar) {
            context3 = context2;
            obj = objA;
            cVar4 = cVar3;
            v2Var = v2Var2;
            eVar = eVar2;
            return new com.garmin.android.apps.connectmobile.v2.b(wg0.j.a(eVar, context3, cVar4, (Map) obj), ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47387b, null, null, 12, null);
        }
        return aVar;
    }

    @Override // jm0.b
    public final boolean h() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        String strH = gh2.i.f77458c.a().f77477b.h("group_creation_enabled");
        if (p005kotlin.jvm.internal.s.g(strH, "allUser")) {
            return true;
        }
        if (!p005kotlin.jvm.internal.s.g(strH, "mbTester")) {
            return false;
        }
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_MBTESTER");
    }

    @Override // jm0.b
    public final String i() {
        return GCMSettingManager.k().b();
    }

    @Override // jm0.b
    public final Intent j(String str) {
        str.getClass();
        return am.r1.q(str, null);
    }

    @Override // jm0.b
    public final void k(GroupDetailActivity groupDetailActivity, Intent intent) {
        intent.getClass();
        ro1.g0.f153957a.getClass();
        ro1.g0.g(groupDetailActivity, intent);
    }

    @Override // jm0.b
    public final Intent l(Activity activity, GroupDetailsDTO groupDetailsDTO) {
        GroupTransferOwnershipActivity.f36209d.getClass();
        Intent intent = new Intent(activity, (Class<?>) GroupTransferOwnershipActivity.class);
        intent.putExtra("GCM_extra_connection_group", groupDetailsDTO);
        return intent;
    }

    @Override // jm0.b
    public final void m() {
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            aVarB.i(qd2.a.b.CONNECTION_GROUPS_LIST);
        }
    }

    @Override // jm0.b
    public final Intent n(GroupDetailActivity groupDetailActivity, GroupDetailsDTO groupDetailsDTO) {
        int i14 = GroupSettingsActivity.f31420z;
        Intent intent = new Intent(groupDetailActivity, (Class<?>) GroupSettingsActivity.class);
        intent.putExtra("GCM_extra_connection_group", groupDetailsDTO);
        return intent;
    }

    @Override // jm0.b
    public final void o(Context context, String str) {
        str.getClass();
        GroupChallengeLeaderboardActivity.ca(context, str, false);
    }

    @Override // jm0.b
    public final String p(Context context, GroupChallengeDTO groupChallengeDTO) {
        context.getClass();
        return com.garmin.android.apps.connectmobile.leaderboard.challenges.x.j(context, c22.j0.N(groupChallengeDTO.f31520i, true), c22.j0.N(groupChallengeDTO.f31521j, true), true, false);
    }

    @Override // jm0.b
    public final Object q(long j8, Long l14, v13.i iVar) {
        ym0.a.f197886f.getClass();
        ym0.a aVarA = ym0.a.C3709a.a();
        return com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.b(aVarA, String.valueOf(j8), new wm0.a(l14, null, null, null, null, null, null, 126, null), null), iVar);
    }

    @Override // jm0.b
    public final Object r(long j8, long j14, v13.i iVar) {
        ym0.a.f197886f.getClass();
        ym0.a aVarA = ym0.a.C3709a.a();
        return com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.d(aVarA, j8, new wm0.c(new Long(j14), null, null, null, null, 30, null), null), iVar);
    }

    @Override // jm0.b
    public final int s(Context context, String str) {
        Object next;
        k10.a.f102143a.getClass();
        Iterator it = k10.a.a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((l10.a) next).f108051b.equals(str));
        l10.a aVar = (l10.a) next;
        if (aVar != null) {
            return aVar.f108050a;
        }
        k10.a aVar2 = k10.a.f102143a;
        return 2131232829;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // jm0.b
    public final Serializable t(double d14, double d15, v13.c cVar) {
        c3 c3Var;
        Object next;
        Object next2;
        tj1.l lVar;
        if (cVar instanceof c3) {
            c3Var = (c3) cVar;
            int i14 = c3Var.f104016c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c3Var.f104016c = i14 - Integer.MIN_VALUE;
            } else {
                c3Var = new c3(this, cVar);
            }
        } else {
            c3Var = new c3(this, cVar);
        }
        Object objJ = c3Var.f104014a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c3Var.f104016c;
        if (i15 == 0) {
            o13.r.b(objJ);
            tj1.n nVarA = tj1.n.a.a(tj1.n.f165155b);
            c3Var.f104016c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(nVarA, new tj1.p(nVarA, d14, d15, null), c3Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return new o13.p(null, null);
            }
            lc.u0.r();
            return null;
        }
        List list = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            lVar = (tj1.l) next;
            if (lVar.getAdminType() == tj1.b.State) {
                break;
            }
        } while (lVar.getAdminType() != tj1.b.Province);
        tj1.l lVar2 = (tj1.l) next;
        String name = lVar2 != null ? lVar2.getName() : null;
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((tj1.l) next2).getAdminType() != tj1.b.City);
        tj1.l lVar3 = (tj1.l) next2;
        return new o13.p(name, lVar3 != null ? lVar3.getName() : null);
    }

    @Override // jm0.b
    public final Object u(String str, boolean z14, v13.i iVar) throws JSONException {
        ym0.a.f197886f.getClass();
        ym0.a aVarA = ym0.a.C3709a.a();
        kb0.d dVar = new kb0.d(14);
        if (!z14) {
            return aVarA.a(str, dVar, iVar);
        }
        qd2.a aVarB = qd2.a.b();
        String[] strArrD = aVarB != null ? aVarB.d(qd2.a.b.CONNECTION_GROUPS_LIST) : null;
        if (strArrD == null) {
            return aVarA.a(str, dVar, iVar);
        }
        GroupListDTO groupListDTO = new GroupListDTO();
        groupListDTO.k(new JSONObject(strArrD[1].toString()));
        return new com.garmin.android.apps.connectmobile.v2.b(groupListDTO, 200, null, null, 12, null);
    }

    @Override // jm0.b
    public final ArrayList v(Context context) {
        context.getClass();
        k10.a.f102143a.getClass();
        ArrayList<l10.a> arrayListA = k10.a.a(context);
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListA, 10));
        for (l10.a aVar : arrayListA) {
            arrayList.add(new o13.p(Integer.valueOf(aVar.f108050a), aVar.f108051b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jm0.b
    public final Object w(String str, v13.c cVar) {
        b3 b3Var;
        if (cVar instanceof b3) {
            b3Var = (b3) cVar;
            int i14 = b3Var.f103998c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b3Var.f103998c = i14 - Integer.MIN_VALUE;
            } else {
                b3Var = new b3(this, cVar);
            }
        } else {
            b3Var = new b3(this, cVar);
        }
        Object objJ = b3Var.f103996a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b3Var.f103998c;
        if (i15 == 0) {
            o13.r.b(objJ);
            ym0.a.f197886f.getClass();
            ym0.a aVarA = ym0.a.C3709a.a();
            b3Var.f103998c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.y(aVarA, str, null), b3Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            com.garmin.android.apps.connectmobile.v2.a aVar2 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
            return new com.garmin.android.apps.connectmobile.v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            return new com.garmin.android.apps.connectmobile.v2.b(bVar.f47386a, bVar.f47387b, null, null, 12, null);
        }
        lc.u0.r();
        return null;
    }

    @Override // jm0.b
    public final Intent x(Context context, String str, String str2, Boolean bool) {
        context.getClass();
        str.getClass();
        return GroupDetailActivity.a.a(GroupDetailActivity.f36137j, context, str, str2, bool, null, null, 48);
    }

    @Override // jm0.b
    public final String y(long j8) {
        ro1.g0.f153957a.getClass();
        return GCMSettingManager.k().b() + "/modern/group/" + j8;
    }

    @Override // jm0.b
    public final Object z(long j8, Long l14, v13.i iVar) {
        ym0.a.f197886f.getClass();
        ym0.a aVarA = ym0.a.C3709a.a();
        return com.garmin.android.apps.connectmobile.f0.J(aVarA, new ym0.g(aVarA, String.valueOf(j8), new wm0.a(l14, null, null, null, null, null, null, 126, null), null), iVar);
    }
}

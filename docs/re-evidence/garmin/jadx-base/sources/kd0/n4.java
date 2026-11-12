package kd0;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.manual.ActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageActivity;
import com.garmin.android.apps.connectmobile.activities.photos.PhotoManagementActivity;
import com.garmin.android.apps.connectmobile.activities.photos.PostPhotoManagementActivity;
import com.garmin.android.apps.connectmobile.activities.photos.ViewImageActivity;
import com.garmin.android.apps.connectmobile.feed.activity.exception.DeletedActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.PrivateActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/n4;", "Liz0/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n4 implements iz0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f104243a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.NewsfeedDelegateImpl$markNewsFeedActivityAsEdited$1", f = "NewsfeedDelegateImpl.kt", l = {316}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i.c f104245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f104246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f104247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i.c cVar, long j8, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f104245b = cVar;
            this.f104246c = j8;
            this.f104247d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f104245b, this.f104246c, this.f104247d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104244a;
            if (i14 == 0) {
                o13.r.b(obj);
                hz0.m.f86458c.getClass();
                hz0.m mVarA = hz0.m.a.a(this.f104245b);
                this.f104244a = 1;
                Object objA = mVarA.f86460b.f().a(new lz0.b(this.f104246c, System.currentTimeMillis(), this.f104247d), this);
                if (objA != aVar) {
                    objA = Unit.INSTANCE;
                }
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f104248a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f104248a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f104248a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104248a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // iz0.a
    public final hz0.t a() {
        return new hz0.t((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // iz0.a
    public final void b(Context context, String str, String str2) {
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        UserProfileActivity.a.c(context, str, str2, null);
    }

    @Override // iz0.a
    public final void c(androidx.fragment.app.m mVar, com.garmin.android.library.mapsdkadapter.i.d dVar, int i14) {
        dVar.getClass();
        if (dVar == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
            Dialog errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(mVar, i14, -1);
            if (errorDialog != null) {
                errorDialog.show();
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "NewsfeedDelegate", "Baidu map is unavailable");
    }

    @Override // iz0.a
    public final Intent d(androidx.fragment.app.m mVar, String str, List list, Boolean bool) {
        str.getClass();
        PostPhotoManagementActivity.a aVar = PostPhotoManagementActivity.f29721q;
        boolean zBooleanValue = bool.booleanValue();
        aVar.getClass();
        Intent intent = new Intent(mVar, (Class<?>) PostPhotoManagementActivity.class);
        intent.putExtra("GCM_extra_connection_group_id", str);
        intent.putParcelableArrayListExtra("GCM_extra_images_data", new ArrayList<>(list));
        intent.putExtra("GCM_extra_activity_open_mode", zBooleanValue);
        return intent;
    }

    @Override // iz0.a
    public final void e(Context context) {
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.SUGGESTED;
        aVar.getClass();
        context.startActivity(new Intent(FriendListActivity.a.a(context, kVar)));
    }

    @Override // iz0.a
    public final boolean f(int i14, int i15) {
        if (i14 != 0 && i15 >= 3) {
            mz0.a.f121640a.getClass();
            Set<nz0.a> set = mz0.a.a().f128379a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((nz0.a) obj) != nz0.a.All) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                Set<am.x0> set2 = mz0.a.a().f128380b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : set2) {
                    if (((am.x0) obj2) != am.x0.f4304m) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    f12.l lVar = a().f86479a;
                    int iI2 = lVar.i2(0, "keyNewsFeedSuggestedConnectionAppearanceCount");
                    com.garmin.android.apps.connectmobile.l.g().getClass();
                    int iG = (int) gh2.i.f77458c.a().f77477b.g("newsfeed_suggested_connections_reappearance_count");
                    if (iG != 0) {
                        int i16 = iI2 % iG;
                        lVar.u2(i16 + 1, "keyNewsFeedSuggestedConnectionAppearanceCount");
                        if (i16 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // iz0.a
    public final Object g(Context context, int i14, fo1.v0 v0Var) {
        hz0.m.f86458c.getClass();
        return hz0.m.a.a(context).a(i14, v0Var);
    }

    @Override // iz0.a
    public final Intent h(androidx.fragment.app.m mVar, ps.q qVar, ArrayList arrayList, wg0.c cVar, boolean z14) {
        qVar.getClass();
        ViewImageActivity.a aVar = ViewImageActivity.f29734o;
        int i14 = cVar.f185076a;
        aVar.getClass();
        return ViewImageActivity.a.a(mVar, qVar, arrayList, i14, z14);
    }

    @Override // iz0.a
    public final Object i(Context context, long j8, fo1.v0 v0Var) {
        hz0.m.f86458c.getClass();
        return hz0.m.a.a(context).b(j8, v0Var);
    }

    @Override // iz0.a
    public final void j(Context context) {
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.FOLLOWING;
        aVar.getClass();
        context.startActivity(new Intent(FriendListActivity.a.a(context, kVar)));
    }

    @Override // iz0.a
    public final void k(androidx.fragment.app.m mVar, wg0.a aVar) {
        aVar.getClass();
        Long l14 = aVar.f185042a;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            am.x0 x0Var = aVar.f185044c;
            am.h hVar = aVar.j() ? am.h.VIEW_EDIT : am.h.VIEW_ONLY;
            aq.b bVar = new aq.b();
            bVar.f11823b = jLongValue;
            if (hVar != null) {
                bVar.f11824c = hVar;
            }
            bVar.f11825d = aVar.j();
            bVar.f11827f = x0Var.f4358a;
            mVar.startActivity(bVar.a(mVar));
        }
    }

    @Override // iz0.a
    public final void l() {
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        com.garmin.android.apps.connectmobile.newsfeed.a.f39474b.f148604g = true;
    }

    @Override // iz0.a
    public final Object m(Context context, long j8, fo1.v0 v0Var) {
        hz0.m.f86458c.getClass();
        return hz0.m.a.a(context).f86460b.f().e(j8, v0Var);
    }

    @Override // iz0.a
    public final void n(Context context, ps.j jVar) {
        ViewImageActivity.f29734o.getClass();
        Intent intent = new Intent(context, (Class<?>) ViewImageActivity.class);
        intent.putParcelableArrayListExtra("GCM_extra_images_data", p13.x.d(jVar));
        intent.putExtra("allowActivityMetric", true);
        intent.putExtra("imagePosition", 1);
        context.startActivity(intent);
    }

    @Override // iz0.a
    public final void o(i.c cVar, long j8, boolean z14) {
        cVar.getClass();
        androidx.lifecycle.i0 i0VarW = o53.f0.w(cVar);
        x53.c cVar2 = o53.s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new b(cVar, j8, z14, null), 2);
    }

    @Override // iz0.a
    public final Intent p(androidx.fragment.app.m mVar, String str, List list, boolean z14) {
        str.getClass();
        GroupPostViewImageActivity.f29703m.getClass();
        return GroupPostViewImageActivity.a.a(mVar, str, list, 1, z14);
    }

    @Override // iz0.a
    public final void q(final com.garmin.android.apps.connectmobile.r0 r0Var, final boolean z14, cn1.d dVar) {
        final hz0.t tVarA = a();
        mz0.a.f121640a.getClass();
        final boolean z15 = mz0.a.a().f128379a.size() == 1 && mz0.a.a().f128379a.contains(nz0.a.You);
        final DateTime dateTimeNow = DateTime.now();
        f12.l lVar = tVarA.f86479a;
        String strA0 = lVar.a0("keyNewsfeedUnreadBubbleExpirationGMT");
        final boolean z16 = strA0.equals("") || dateTimeNow.getMillis() > c22.j0.f23101c.parseDateTime(strA0).getMillis();
        final c22.u2 u2VarP4 = lVar.P4("keyShouldCheckNewsfeedUnreadStatus", true);
        u2VarP4.f(r0Var, new c(new e23.l() { // from class: kd0.m4
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i14 = n4.f104243a;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                boolean z17 = z14;
                hz0.t tVar = tVarA;
                com.garmin.android.apps.connectmobile.r0 r0Var2 = r0Var;
                if (z17 || z15) {
                    tVar.d(false);
                } else if (z16) {
                    ge1.b.T(o53.f0.w(r0Var2), null, null, new r4(tVar, dateTimeNow, r0Var2, null), 3);
                } else {
                    tVar.d(true);
                }
                u2VarP4.l(r0Var2);
                tVar.e(false);
                return Unit.INSTANCE;
            }
        }));
        dh.b.L(lVar.P4("keyIsNewsfeedUnreadBubbleRequired", false), r0Var, new c(new iz1.f(dVar, 24)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // iz0.a
    public final Object r(Context context, long j8, v13.c cVar) {
        o4 o4Var;
        Context context2;
        if (cVar instanceof o4) {
            o4Var = (o4) cVar;
            int i14 = o4Var.f104269d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o4Var.f104269d = i14 - Integer.MIN_VALUE;
            } else {
                o4Var = new o4(this, cVar);
            }
        } else {
            o4Var = new o4(this, cVar);
        }
        Object objC = o4Var.f104267b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o4Var.f104269d;
        if (i15 == 0) {
            o13.r.b(objC);
            hz0.m.f86458c.getClass();
            hz0.m mVarA = hz0.m.a.a(context);
            o4Var.f104266a = context;
            o4Var.f104269d = 1;
            objC = mVarA.C(new hz0.o(mVarA, j8, null), o4Var);
            if (objC == aVar) {
                return aVar;
            }
            context2 = context;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Context context3 = o4Var.f104266a;
            o13.r.b(objC);
            context2 = context3;
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objC;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) bVar.f47386a;
            if (activityListItemDTO == null) {
                return new com.garmin.android.apps.connectmobile.v2.a(new UnavailableReasonUnknownException(), null, null, 6, null);
            }
            Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = activityListItemDTO.Y1;
            map.getClass();
            return new com.garmin.android.apps.connectmobile.v2.b(wg0.j.b(activityListItemDTO, context2, false, map, null, null, 26), bVar.f47387b, null, null, 12, null);
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        Integer num = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47384b;
        if (num != null && num.intValue() == 403) {
            return new com.garmin.android.apps.connectmobile.v2.a(new PrivateActivityException(), null, null, 6, null);
        }
        return (num != null && num.intValue() == 404) ? new com.garmin.android.apps.connectmobile.v2.a(new DeletedActivityException(), null, null, 6, null) : new com.garmin.android.apps.connectmobile.v2.a(new UnavailableReasonUnknownException(), null, null, 6, null);
    }

    @Override // iz0.a
    public final Intent s(androidx.fragment.app.m mVar, ps.q qVar, ArrayList arrayList, Boolean bool) {
        qVar.getClass();
        PhotoManagementActivity.a aVar = PhotoManagementActivity.f29713t;
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean zBooleanValue = bool.booleanValue();
        aVar.getClass();
        return PhotoManagementActivity.a.a(mVar, qVar, arrayList2, zBooleanValue, null, null);
    }

    @Override // iz0.a
    public final Intent t(Context context) {
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.SUGGESTED;
        aVar.getClass();
        return FriendListActivity.a.a(context, kVar);
    }

    @Override // iz0.a
    public final void u(androidx.fragment.app.m mVar, long j8, String str, am.x0 x0Var, ie2.c cVar) {
        x0Var.getClass();
        ActivityMapActivity.la(mVar, x0Var == am.x0.C ? os.b.ACTIVITY_MULTISPORT_MAP : os.b.ACTIVITY_LAPS_MAP, null, j8, true, true, null, str, Boolean.FALSE, Boolean.TRUE, null, cVar);
    }

    @Override // iz0.a
    public final r53.i v(long j8, ArrayList arrayList) {
        am.m mVar = (am.m) KoinJavaComponent.get$default(am.m.class, null, null, 6, null);
        ArrayList arrayList2 = new ArrayList(arrayList);
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.u0(arrayList2, mVar, j8, null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    @Override // iz0.a
    public final void w(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, hz0.j jVar) {
        hz0.j jVar2;
        JSONException jSONException;
        am.b bVarM = am.b.M();
        bVarM.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (hVar.f29457j != null) {
                    jSONObject.put("accessControlRuleDTO", new JSONObject(GsonUtil.a(hVar.f29457j)));
                }
                String string = jSONObject.toString();
                long j8 = hVar.f29448a;
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar.f29460m;
                jVar2 = jVar;
                try {
                    bVarM.N(j8, i0Var != null ? i0Var.f29492c : 0L, string, jVar2);
                } catch (JSONException e4) {
                    e = e4;
                    jSONException = e;
                    lc.u0.v(jSONException, new StringBuilder("Update activity json object error: "), com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesDataManager");
                    jVar2.a(lj0.b.f112956j);
                }
            } catch (JSONException e14) {
                jSONException = e14;
                jVar2 = jVar;
                lc.u0.v(jSONException, new StringBuilder("Update activity json object error: "), com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesDataManager");
                jVar2.a(lj0.b.f112956j);
            }
        } catch (JSONException e15) {
            e = e15;
            jVar2 = jVar;
        }
    }

    @Override // iz0.a
    public final q4 x() {
        return new q4();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // iz0.a
    public final Object y(Context context, Long l14, v13.c cVar) {
        p4 p4Var;
        Context context2;
        Long parentId;
        Long l15 = l14;
        if (cVar instanceof p4) {
            p4Var = (p4) cVar;
            int i14 = p4Var.f104289f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p4Var.f104289f = i14 - Integer.MIN_VALUE;
            } else {
                p4Var = new p4(this, cVar);
            }
        } else {
            p4Var = new p4(this, cVar);
        }
        Object objB = p4Var.f104287d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p4Var.f104289f;
        if (i15 == 0) {
            o13.r.b(objB);
            if (l15 != null) {
                mr.g0 g0Var = (mr.g0) KoinJavaComponent.get$default(mr.g0.class, null, null, 6, null);
                long jLongValue = l15.longValue();
                g0Var.getClass();
                r53.c2 c2Var = new r53.c2(new mr.f0(g0Var, jLongValue, null));
                context2 = context;
                p4Var.f104284a = context2;
                p4Var.f104285b = l15;
                p4Var.f104289f = 1;
                objB = r53.s.B(c2Var, p4Var);
                if (objB != aVar) {
                }
            }
            return null;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Intent intent = p4Var.f104286c;
            o13.r.b(objB);
            return intent;
        }
        l15 = p4Var.f104285b;
        context2 = p4Var.f104284a;
        o13.r.b(objB);
        ps.a0 a0Var = (ps.a0) objB;
        if (a0Var != null) {
            Intent intent2 = new Intent(context2, (Class<?>) ActivitiesEditActivity.class);
            ps.r rVar = a0Var.f139647a;
            ActivityDetailChartDTO activityDetailChartDTO = a0Var.f139648b;
            ps.s0 s0Var = a0Var.f139649c;
            ps.p pVar = a0Var.f139650d;
            boolean zG = p005kotlin.jvm.internal.s.g(a0Var.f139651e, Boolean.TRUE);
            List<String> list = a0Var.f139652f;
            ps.q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            boolean zQ = bm.m.q(summaryDTO != null ? summaryDTO.getDistance() : null, activityDetailChartDTO);
            boolean zS = bm.m.s(summaryDTO != null ? summaryDTO.getDuration() : null, activityDetailChartDTO);
            boolean zR = bm.m.r(list);
            boolean zO = bm.m.o(activityDetailChartDTO);
            String str = (rVar == null || rVar.getParentId() == null) ? null : am.x0.C.f4358a;
            Bundle bundle = new Bundle();
            Long l16 = l15;
            bundle.putBoolean("GCM_supports_advanced_leg_editing", zR);
            bundle.putBoolean("GCM_extra_has_trim_chart_data", zO);
            bundle.putBoolean("GCM_extra_has_trim_time_fragment", zS);
            bundle.putBoolean("GCM_extra_has_trim_distance_fragment", zQ);
            bundle.putBoolean("GCM_has_device_info", zG);
            bundle.putLong("GCM_extra_activity_parent_id", (rVar == null || (parentId = rVar.getParentId()) == null) ? -1L : parentId.longValue());
            bundle.putParcelable("GCM_workout_exercise_set", s0Var);
            bundle.putParcelable("GCM_extra_activity_summary", rVar);
            bundle.putParcelable("GCM_extra_activity_splits", pVar);
            bundle.putString("GCM_extra_activity_parent_type_key", str);
            com.airbnb.lottie.animation.keyframe.a.q(com.garmin.android.apps.connectmobile.l2.f37135b, intent2, bundle);
            hz0.m.f86458c.getClass();
            hz0.m mVarA = hz0.m.a.a(context2);
            long jLongValue2 = l16.longValue();
            p4Var.f104284a = null;
            p4Var.f104285b = null;
            p4Var.f104286c = intent2;
            p4Var.f104289f = 2;
            Object objA = mVarA.f86460b.f().a(new lz0.b(jLongValue2, System.currentTimeMillis(), false), p4Var);
            if (objA != aVar) {
                objA = Unit.INSTANCE;
            }
            return objA == aVar ? aVar : intent2;
        }
        return null;
    }

    @Override // iz0.a
    public final void z() {
        a().d(false);
        hz0.t tVarA = a();
        String strPrint = c22.j0.f23101c.print(DateTime.now());
        strPrint.getClass();
        tVarA.f86479a.S("keyNewsfeedLastViewedTimeGMT", strPrint);
        a().f86479a.S("keyNewsfeedUnreadBubbleExpirationGMT", "");
        ht.a aVar = ht.a.f85464a;
        Bundle bundle = new Bundle(1);
        bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, "5.30.1");
        Unit unit = Unit.INSTANCE;
        aVar.getClass();
        ht.a.a(bundle, "PageViewNewsFeed");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/n4$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

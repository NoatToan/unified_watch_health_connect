package qm0;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p40.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lqm0/p;", "Lcom/garmin/android/apps/connectmobile/e0$b;", "", "Lwg0/a;", "", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p extends com.garmin.android.apps.connectmobile.e0.b<String, wg0.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f145525h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f145526b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GroupDTO.c f145527c = GroupDTO.c.NOT_DEFINED;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym0.a f145528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final um0.a f145529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a22.i f145530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<s51.e> f145531g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145532a;

        static {
            int[] iArr = new int[x.b.values().length];
            try {
                iArr[x.b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.b.ACTIVITY_FEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.b.POST_FEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145532a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.BaseGroupFeedViewModel$requestDeletePostFeed$1", f = "BaseGroupFeedViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f145534b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ jo1.e f145536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f145537e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jo1.e eVar, e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f145536d = eVar;
            this.f145537e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = p.this.new c(this.f145536d, this.f145537e, dVar);
            cVar.f145534b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f145534b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145533a;
            p pVar = p.this;
            if (i14 == 0) {
                o13.r.b(obj);
                ym0.a aVar2 = pVar.f145528d;
                jo1.e eVar = this.f145536d;
                String strValueOf = String.valueOf(eVar.getUserGroupPk());
                String uuid = eVar.getUuid();
                this.f145534b = b0Var;
                this.f145533a = 1;
                aVar2.getClass();
                obj = f0.J(aVar2, new ym0.k(aVar2, strValueOf, "GROUP", uuid, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "deletePost failed: ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.p(a2Var, "BaseGroupFeedViewModel", strD);
                pVar.f145531g.j(s51.e.FAILED);
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                pVar.f145531g.j(s51.e.LOADED);
                this.f145537e.invoke();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, "BaseGroupFeedViewModel", "request delete post success");
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public p() {
        ym0.a.f197886f.getClass();
        this.f145528d = ym0.a.C3709a.a();
        this.f145529e = new um0.a(null, null, 0, false, 15, null);
        a22.i.f537b.getClass();
        this.f145530f = a22.i.a.a();
        this.f145531g = new y0<>();
    }

    public final wg0.a A4(String str) {
        ps.q qVar;
        Object obj = null;
        try {
            long j8 = Long.parseLong(str);
            for (Object obj2 : this.f145529e.f171990a) {
                wg0.a aVar = (wg0.a) obj2;
                aVar.getClass();
                if (aVar.h() && (qVar = aVar.f185057p) != null && qVar.getActivityId() == j8) {
                    obj = obj2;
                    break;
                }
            }
            wg0.a aVar2 = (wg0.a) obj;
            if (aVar2 == null) {
                String strE = org.apache.commons.lang3.e.e(j8, "refresh post image by activity id failed. Can not find activity feed with activity id: ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.p(a2Var, "BaseGroupFeedViewModel", strE);
                Unit unit = Unit.INSTANCE;
            }
            return aVar2;
        } catch (Exception unused) {
            String strN = fb1.c.n("Cannot find activity with id: ", str);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.p(a2Var2, "BaseGroupFeedViewModel", strN);
            return null;
        }
    }

    public final wg0.a B4(String str) {
        Object next;
        o60.b bVar = new o60.b(str, 11);
        Iterator<T> it = this.f145529e.f171990a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) bVar.invoke((wg0.a) next)).booleanValue());
        wg0.a aVar = (wg0.a) next;
        if (aVar == null) {
            String strN = fb1.c.n("Did not find suitable post with uuid: ", str);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var, "BaseGroupFeedViewModel", strN);
            Unit unit = Unit.INSTANCE;
        }
        return aVar;
    }

    public void C4(wg0.a aVar) {
        aVar.getClass();
        boolean zM = aVar.m();
        um0.a aVar2 = this.f145529e;
        if (zM) {
            jo1.e eVar = aVar.f185061v;
            if (eVar == null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.p(a2Var, "BaseGroupFeedViewModel", "NewsPost to be deleted is null!!\n ActivityFeed; " + aVar);
                return;
            }
            String strH = com.airbnb.lottie.animation.keyframe.a.h("remove post success: ", aVar2.a(new qd0.a(eVar, 20)));
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "BaseGroupFeedViewModel", strH);
            aVar2.f171993d = true;
            com.garmin.android.apps.connectmobile.e0.b.a aVar5 = this.f34755a;
            if (aVar5 != null) {
                aVar5.a(true);
                return;
            }
            return;
        }
        if (!aVar.i()) {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar6.getClass();
            i2.a.p(a2Var3, "BaseGroupFeedViewModel", "Can not delete feed which is neither PostFeed nor Announcement. ActivityFeed: " + aVar);
            return;
        }
        GroupAnnouncementDTO groupAnnouncementDTO = aVar.f185064y;
        if (groupAnnouncementDTO == null) {
            i2.a aVar7 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar7.getClass();
            i2.a.p(a2Var4, "BaseGroupFeedViewModel", "Announcement to be deleted is Null!!\n ActivityFeed: " + aVar);
            return;
        }
        String strH2 = com.airbnb.lottie.animation.keyframe.a.h("remove announcement success: ", aVar2.a(new qd0.a(groupAnnouncementDTO, 21)));
        i2.a aVar8 = i2.f36769a;
        a2 a2Var5 = a2.GENERAL;
        aVar8.getClass();
        i2.a.b(a2Var5, "BaseGroupFeedViewModel", strH2);
        aVar2.f171993d = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar9 = this.f34755a;
        if (aVar9 != null) {
            aVar9.a(true);
        }
    }

    public final void D4(Context context, String str, x.b bVar) {
        str.getClass();
        bVar.getClass();
        int i14 = b.f145532a[bVar.ordinal()];
        if (i14 == 1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "BaseGroupFeedViewModel", "Use ACTIVITY_FEED and POST_FEED to refresh post item");
            return;
        }
        y0<s51.e> y0Var = this.f145531g;
        if (i14 == 2) {
            if (A4(str) != null) {
                w9.a aVarA = v1.a(this);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new r(this, str, context, null), 2);
                return;
            } else {
                String strConcat = "refresh post by activity id failed. Can not find activity feed with activity id: ".concat(str);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var2, "BaseGroupFeedViewModel", strConcat);
                y0Var.j(s51.e.FAILED);
                return;
            }
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        if (B4(str) != null) {
            w9.a aVarA2 = v1.a(this);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(aVarA2, x53.b.f189152a, null, new s(this, str, context, null), 2);
        } else {
            String strConcat2 = "Can not find post with uuid: ".concat(str);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.p(a2Var3, "BaseGroupFeedViewModel", strConcat2);
            y0Var.j(s51.e.FAILED);
        }
    }

    public final void E4() {
        um0.a aVar = this.f145529e;
        aVar.f171990a.clear();
        aVar.f171991b = null;
        aVar.f171993d = false;
        com.garmin.android.apps.connectmobile.e0.b.a aVar2 = this.f34755a;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    public final void F4(wg0.a aVar, e23.a<Unit> aVar2) {
        aVar.getClass();
        if (aVar.m()) {
            G4(aVar.f185061v, aVar2);
            return;
        }
        if (!aVar.i()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.p(a2Var, "BaseGroupFeedViewModel", "Can not delete unsupported ActivityFeed: " + aVar);
            return;
        }
        GroupAnnouncementDTO groupAnnouncementDTO = aVar.f185064y;
        y0<s51.e> y0Var = this.f145531g;
        if (groupAnnouncementDTO != null) {
            y0Var.j(s51.e.LOADING);
            w9.a aVarA = v1.a(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new t(this, groupAnnouncementDTO, aVar2, null), 2);
            return;
        }
        y0Var.j(s51.e.FAILED);
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.p(a2Var2, "BaseGroupFeedViewModel", "announcementDTO to be deleted is null!!");
    }

    public final void G4(jo1.e eVar, e23.a<Unit> aVar) {
        y0<s51.e> y0Var = this.f145531g;
        if (eVar != null) {
            y0Var.j(s51.e.LOADING);
            w9.a aVarA = v1.a(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new c(eVar, aVar, null), 2);
            return;
        }
        y0Var.j(s51.e.FAILED);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.p(a2Var, "BaseGroupFeedViewModel", "newsPostDTO to be deleted is null!!");
    }

    public final void H4(final wg0.a aVar) {
        boolean zH = aVar.h();
        um0.a aVar2 = this.f145529e;
        if (zH) {
            final int i14 = 0;
            aVar2.b(aVar, new e23.l() { // from class: qm0.o
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i15 = i14;
                    boolean z14 = false;
                    wg0.a aVar3 = aVar;
                    wg0.a aVar4 = (wg0.a) obj;
                    switch (i15) {
                        case 0:
                            int i16 = p.f145525h;
                            aVar4.getClass();
                            if (aVar4.h()) {
                                ps.q qVar = aVar4.f185057p;
                                Long lValueOf = qVar != null ? Long.valueOf(qVar.getActivityId()) : null;
                                ps.q qVar2 = aVar3.f185057p;
                                if (p005kotlin.jvm.internal.s.g(lValueOf, qVar2 != null ? Long.valueOf(qVar2.getActivityId()) : null)) {
                                    z14 = true;
                                }
                            }
                            return Boolean.valueOf(z14);
                        default:
                            int i17 = p.f145525h;
                            aVar4.getClass();
                            if (aVar4.m()) {
                                jo1.e eVar = aVar4.f185061v;
                                String uuid = eVar != null ? eVar.getUuid() : null;
                                jo1.e eVar2 = aVar3.f185061v;
                                if (p005kotlin.jvm.internal.s.g(uuid, eVar2 != null ? eVar2.getUuid() : null)) {
                                    z14 = true;
                                }
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            });
            aVar2.f171993d = true;
            com.garmin.android.apps.connectmobile.e0.b.a aVar3 = this.f34755a;
            if (aVar3 != null) {
                aVar3.a(true);
                return;
            }
            return;
        }
        if (aVar.m()) {
            final int i15 = 1;
            aVar2.b(aVar, new e23.l() { // from class: qm0.o
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    boolean z14 = false;
                    wg0.a aVar4 = aVar;
                    wg0.a aVar5 = (wg0.a) obj;
                    switch (i16) {
                        case 0:
                            int i17 = p.f145525h;
                            aVar5.getClass();
                            if (aVar5.h()) {
                                ps.q qVar = aVar5.f185057p;
                                Long lValueOf = qVar != null ? Long.valueOf(qVar.getActivityId()) : null;
                                ps.q qVar2 = aVar4.f185057p;
                                if (p005kotlin.jvm.internal.s.g(lValueOf, qVar2 != null ? Long.valueOf(qVar2.getActivityId()) : null)) {
                                    z14 = true;
                                }
                            }
                            return Boolean.valueOf(z14);
                        default:
                            int i18 = p.f145525h;
                            aVar5.getClass();
                            if (aVar5.m()) {
                                jo1.e eVar = aVar5.f185061v;
                                String uuid = eVar != null ? eVar.getUuid() : null;
                                jo1.e eVar2 = aVar4.f185061v;
                                if (p005kotlin.jvm.internal.s.g(uuid, eVar2 != null ? eVar2.getUuid() : null)) {
                                    z14 = true;
                                }
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            });
            aVar2.f171993d = true;
            com.garmin.android.apps.connectmobile.e0.b.a aVar4 = this.f34755a;
            if (aVar4 != null) {
                aVar4.a(true);
                return;
            }
            return;
        }
        i2.a aVar5 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar5.getClass();
        i2.a.p(a2Var, "BaseGroupFeedViewModel", "Unsupported type to update, ActivityFeed: " + aVar);
    }

    public final void I4(String str, List<? extends Parcelable> list, x.b bVar) {
        List<wg0.c> list2;
        List<wg0.c> list3;
        String body;
        List<wg0.c> list4;
        List<wg0.c> list5;
        str.getClass();
        list.getClass();
        bVar.getClass();
        int i14 = b.f145532a[bVar.ordinal()];
        if (i14 == 1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "BaseGroupFeedViewModel", "Use ACTIVITY_FEED and POST_FEED to update specific ActivityType");
            return;
        }
        if (i14 == 2) {
            wg0.a aVarA4 = A4(str);
            if (aVarA4 == null) {
                return;
            }
            wg0.a aVarD = wg0.a.d(aVarA4);
            wg0.l lVar = aVarD.f185059r;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ps.j) {
                    arrayList.add(obj);
                }
            }
            if (aVarA4.f185057p == null) {
                String strConcat = "Target activity feed did not contain ActivityListItemDTO, activityId: ".concat(str);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var2, "BaseGroupFeedViewModel", strConcat);
                return;
            }
            if (lVar != null && (list3 = lVar.f185103b) != null) {
                list3.clear();
            }
            if (lVar != null && (list2 = lVar.f185103b) != null) {
                list2.addAll(wg0.j.d(arrayList));
            }
            H4(aVarD);
            return;
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        wg0.a aVarB4 = B4(str);
        if (aVarB4 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof jo1.f) {
                arrayList2.add(obj2);
            }
        }
        wg0.a aVarD2 = wg0.a.d(aVarB4);
        wg0.l lVar2 = aVarD2.f185059r;
        jo1.e eVar = aVarD2.f185061v;
        if (eVar == null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "BaseGroupFeedViewModel", "Should not update post images to a ActivityFeed who's NewsPostDTO is null!!");
            return;
        }
        eVar.s(arrayList2);
        if (lVar2 != null && (list5 = lVar2.f185103b) != null) {
            list5.clear();
        }
        if (lVar2 != null && (list4 = lVar2.f185103b) != null) {
            list4.addAll(eVar.t());
        }
        List<jo1.f> listK = eVar.k();
        if ((listK != null && !listK.isEmpty()) || ((body = eVar.getBody()) != null && body.length() != 0)) {
            H4(aVarD2);
        } else if (aVarB4.k()) {
            G4(eVar, new o0(28, this, aVarD2));
        } else {
            C4(aVarD2);
        }
    }

    public abstract wg0.a y4(Context context, ActivityListItemDTO activityListItemDTO, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map, GroupDTO.c cVar);

    public abstract wg0.a z4(Context context, jo1.e eVar, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqm0/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

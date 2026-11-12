package mt0;

import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lmt0/z;", "Lyc/h3;", "", "Lmt0/t;", "Lmt0/v;", "cache", "", "", "preSelectedFollowerUserIds", "", "preSelectedFollowersReadOnly", "wheelchairUser", "<init>", "(Lmt0/v;Ljava/util/List;ZZ)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends yc.h3<Integer, t> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f120941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f120942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f120943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f120944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei0.d f120945f;

    static {
        new a(null);
    }

    public z(v vVar, List<Long> list, boolean z14, boolean z15) {
        vVar.getClass();
        list.getClass();
        this.f120941b = vVar;
        this.f120942c = list;
        this.f120943d = z14;
        this.f120944e = z15;
        this.f120945f = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
        ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
    }

    @Override // yc.h3
    public final Integer c(yc.i3<Integer, t> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(yc.h3.a aVar, v13.c cVar) {
        a0 a0Var;
        o13.p pVar;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f120505d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f120505d = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objK0 = a0Var.f120503b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f120505d;
        v vVar = this.f120941b;
        if (i15 == 0) {
            o13.r.b(objK0);
            boolean z14 = vVar.f120890b;
            List<t> list = vVar.f120889a;
            if (z14 && !list.isEmpty()) {
                vVar.f120890b = false;
                com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar3.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "AdHocChallengeManagePlayersPagingSource", "load cached data list");
                return new yc.h3.b.c(p13.h0.b1(list), null, vVar.f120891c);
            }
            com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar4.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "AdHocChallengeManagePlayersPagingSource", "load followers from API");
            if (aVar instanceof yc.h3.a.C3655a) {
                int size = list.size();
                int i16 = ((yc.h3.a.C3655a) aVar).f196007a;
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "AdHocChallengeManagePlayersPagingSource", tn.k.e(size, i16, "Append follower List, start: ", ", limit: "));
                Integer num = vVar.f120891c;
                pVar = new o13.p(new Integer(num != null ? num.intValue() : list.size()), new Integer(i16));
            } else {
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "AdHocChallengeManagePlayersPagingSource", "Refresh follower List. limit: " + aVar.f196007a);
                pVar = new o13.p(new Integer(0), new Integer(aVar.f196007a));
            }
            int iIntValue = ((Number) pVar.f128594a).intValue();
            int iIntValue2 = ((Number) pVar.f128595b).intValue();
            List listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND);
            Boolean boolValueOf = Boolean.valueOf(this.f120944e);
            new Integer(iIntValue);
            new Integer(iIntValue2);
            a0Var.f120502a = aVar;
            a0Var.f120505d = 1;
            objK0 = this.f120945f.k0(listK, boolValueOf, ei0.p0.f64292c, a0Var);
            if (objK0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = a0Var.f120502a;
            o13.r.b(objK0);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objK0;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            Exception exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
            String strN = fb1.c.n("fetch follower failed: ", exc.getMessage());
            com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar5.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "AdHocChallengeManagePlayersPagingSource", strN);
            return new yc.h3.b.a(exc);
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            lc.u0.r();
            return null;
        }
        Iterable<hi0.a> iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (hi0.a aVar6 : iterable) {
            t tVarY = gl1.d.Y(aVar6, p13.h0.R(this.f120942c, aVar6.getUserId()), this.f120943d);
            if (tVarY != null) {
                arrayList.add(tVarY);
            }
        }
        String strH = am.j.h(arrayList.size(), "fetch follower data size: ");
        com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar7.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "AdHocChallengeManagePlayersPagingSource", strH);
        vVar.f120889a.addAll(arrayList);
        Integer num2 = arrayList.size() < aVar.f196007a ? null : new Integer(vVar.f120889a.size() + 1);
        vVar.f120891c = num2;
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "AdHocChallengeManagePlayersPagingSource", "nextKey = " + num2);
        return new yc.h3.b.c(arrayList, null, vVar.f120891c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmt0/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ z(v vVar, List list, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, list, z14, (i14 & 8) != 0 ? false : z15);
    }
}

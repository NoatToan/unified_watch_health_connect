package mt0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmt0/p3;", "Landroidx/lifecycle/u1;", "", "La22/i;", "userProfileRepo", "<init>", "(La22/i;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p3 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a22.i f120808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> f120809b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.ProfileInfoViewModel", f = "ProfileInfoViewModel.kt", l = {23}, m = "getProfileInfos", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p3 f120810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f120811b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f120813d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f120811b = obj;
            this.f120813d |= Integer.MIN_VALUE;
            return p3.this.x4(null, null, this);
        }
    }

    public p3(a22.i iVar) {
        iVar.getClass();
        this.f120808a = iVar;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f120809b = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x4(List<Integer> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l>> dVar) {
        a aVar;
        p3 p3Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f120813d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f120813d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f120811b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f120813d;
        if (i15 == 0) {
            o13.r.b(objA);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            aVar.f120810a = this;
            aVar.f120813d = 1;
            objA = this.f120808a.a(arrayList, list2, aVar);
            if (objA == aVar2) {
                return aVar2;
            }
            p3Var = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p3Var = aVar.f120810a;
            o13.r.b(objA);
        }
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = (Map) objA;
        p3Var.getClass();
        map.getClass();
        p3Var.f120809b = map;
        return this.f120809b;
    }
}

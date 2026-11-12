package wn1;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.ManagePeopleViewModel$getAllInvitedIndexUsers$1", f = "ManagePeopleViewModel.kt", l = {49, 53}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f186214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f186215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f186216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f186217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, long j8, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f186216c = h0Var;
        this.f186217d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f186216c, this.f186217d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        Map map;
        Long userProfileId;
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0;
        Long l14;
        Long userProfileId2;
        Integer num;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186215b;
        h0 h0Var = this.f186216c;
        Object obj2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = h0Var.f186243b;
            this.f186215b = 1;
            tVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(tVar, new x(this.f186217d, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f186214a;
            o13.r.b(obj);
        }
        map = (Map) obj;
        v2.b bVar = (v2.b) v2Var;
        for (com.garmin.android.apps.connectmobile.smartscale.model.e eVar : (Iterable) bVar.f47386a) {
            userProfileId2 = eVar.getUserProfileId();
            if (userProfileId2 != null) {
                num = new Integer((int) userProfileId2.longValue());
            } else {
                num = null;
            }
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
            if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                str = null;
            } else {
                str = profileImageUrls.f46880i;
            }
            eVar.f44460k = new b12.b(str, null, null, null, null, 30, null);
        }
        T t7 = bVar.f47386a;
        h0Var.f186246e = (List) t7;
        h0Var.f186244c.j(fw.m.a.g(fw.m.f73767e, t7, 1));
        if (h0Var.f186248g) {
            for (Object obj3 : h0Var.f186246e) {
                com.garmin.android.apps.connectmobile.smartscale.model.e eVar2 = (com.garmin.android.apps.connectmobile.smartscale.model.e) obj3;
                userProfileId = eVar2.getUserProfileId();
                gVarW0 = h0Var.f186247f.W0();
                if (gVarW0 != null) {
                    l14 = gVarW0.f46857a;
                } else {
                    l14 = null;
                }
                if (!p005kotlin.jvm.internal.s.g(userProfileId, l14) && eVar2.getIsAccepted()) {
                    obj2 = obj3;
                    break;
                }
            }
            h0Var.f186249h = obj2 == null;
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
            v2.b bVar2 = (v2.b) v2Var2;
            Iterable iterable = (Iterable) bVar2.f47386a;
            ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((com.garmin.android.apps.connectmobile.smartscale.model.e) it.next()).getUserProfileId()));
            }
            List<String> listB1 = p13.h0.b1(arrayList);
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
            this.f186214a = bVar2;
            this.f186215b = 2;
            Object objA = iVar.a(listB1, listC, this);
            if (objA != aVar) {
                v2Var = v2Var2;
                obj = objA;
                map = (Map) obj;
                v2.b bVar3 = (v2.b) v2Var;
                while (r1.hasNext()) {
                    userProfileId2 = eVar.getUserProfileId();
                    if (userProfileId2 != null) {
                        num = new Integer((int) userProfileId2.longValue());
                    } else {
                        num = null;
                    }
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                    if (lVar != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    eVar.f44460k = new b12.b(str, null, null, null, null, 30, null);
                }
                T t14 = bVar3.f47386a;
                h0Var.f186246e = (List) t14;
                h0Var.f186244c.j(fw.m.a.g(fw.m.f73767e, t14, 1));
                if (h0Var.f186248g) {
                    while (r15.hasNext()) {
                        com.garmin.android.apps.connectmobile.smartscale.model.e eVar3 = (com.garmin.android.apps.connectmobile.smartscale.model.e) obj3;
                        userProfileId = eVar3.getUserProfileId();
                        gVarW0 = h0Var.f186247f.W0();
                        if (gVarW0 != null) {
                            l14 = gVarW0.f46857a;
                        } else {
                            l14 = null;
                        }
                        if (!p005kotlin.jvm.internal.s.g(userProfileId, l14)) {
                        }
                    }
                    h0Var.f186249h = obj2 == null;
                }
            }
            return aVar;
        }
        if (!(v2Var2 instanceof v2.a)) {
            u0.r();
            return null;
        }
        h0Var.f186244c.j(fw.m.a.b(fw.m.f73767e, ((v2.a) v2Var2).f47383a instanceof NoNetworkException ? new fw.h() : new fw.r(), null, 1));
        return Unit.INSTANCE;
    }
}

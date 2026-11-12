package uu;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getMyBadgeDetails$1", f = "BadgesViewModel.kt", l = {124, 129}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f172792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.m>> f172794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f172795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f172798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.m>> y0Var, q qVar, int i14, int i15, boolean z14, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f172794c = y0Var;
        this.f172795d = qVar;
        this.f172796e = i14;
        this.f172797f = i15;
        this.f172798g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f172794c, this.f172795d, this.f172796e, this.f172797f, this.f172798g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v26, types: [T, com.garmin.android.apps.connectmobile.badges.service.model.m] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        List<String> listB1;
        r0 r0Var2;
        Map map;
        List<com.garmin.android.apps.connectmobile.badges.service.model.p> listF0;
        ArrayList arrayList;
        Long userProfileId;
        Integer num;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172793b;
        q qVar = this.f172795d;
        y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.m>> y0Var = this.f172794c;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            zu.p pVar = qVar.f172737b;
            this.f172793b = 1;
            obj = pVar.a(this.f172796e, this.f172797f, this.f172798g, this);
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
            r0Var2 = this.f172792a;
            o13.r.b(obj);
        }
        map = (Map) obj;
        listF0 = ((com.garmin.android.apps.connectmobile.badges.service.model.m) r0Var2.f105810a).f0();
        if (listF0 != null) {
            arrayList = new ArrayList(p13.y.r(listF0, 10));
            for (com.garmin.android.apps.connectmobile.badges.service.model.p pVar2 : listF0) {
                userProfileId = pVar2.getUserProfileId();
                if (userProfileId != null) {
                    num = new Integer((int) userProfileId.longValue());
                } else {
                    num = null;
                }
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                    str = null;
                } else {
                    str = profileImageUrls.f46879h;
                }
                arrayList.add(com.garmin.android.apps.connectmobile.badges.service.model.p.b(pVar2, str, null, 247));
            }
        } else {
            arrayList = null;
        }
        r0Var2.f105810a = com.garmin.android.apps.connectmobile.badges.service.model.m.d((com.garmin.android.apps.connectmobile.badges.service.model.m) r0Var2.f105810a, arrayList, null, 8063);
        r0Var = r0Var2;
        u62.z.h(g3.f35298f, r0Var.f105810a, y0Var);
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            r0Var = new r0();
            T t7 = ((v2.b) v2Var).f47386a;
            r0Var.f105810a = t7;
            List<com.garmin.android.apps.connectmobile.badges.service.model.p> listF1 = ((com.garmin.android.apps.connectmobile.badges.service.model.m) t7).f0();
            if (listF1 != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(listF1, 10));
                Iterator<T> it = listF1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((com.garmin.android.apps.connectmobile.badges.service.model.p) it.next()).getUserProfileId()));
                }
                listB1 = p13.h0.b1(p13.h0.f1(arrayList2));
            } else {
                listB1 = null;
            }
            if (listB1 != null) {
                a22.i iVar = qVar.f172743h;
                List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                this.f172792a = r0Var;
                this.f172793b = 2;
                obj = iVar.a(listB1, listC, this);
                if (obj != aVar) {
                    r0Var2 = r0Var;
                    map = (Map) obj;
                    listF0 = ((com.garmin.android.apps.connectmobile.badges.service.model.m) r0Var2.f105810a).f0();
                    if (listF0 != null) {
                        arrayList = new ArrayList(p13.y.r(listF0, 10));
                        while (r1.hasNext()) {
                            userProfileId = pVar2.getUserProfileId();
                            if (userProfileId != null) {
                                num = new Integer((int) userProfileId.longValue());
                            } else {
                                num = null;
                            }
                            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                            if (lVar != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            arrayList.add(com.garmin.android.apps.connectmobile.badges.service.model.p.b(pVar2, str, null, 247));
                        }
                    } else {
                        arrayList = null;
                    }
                    r0Var2.f105810a = com.garmin.android.apps.connectmobile.badges.service.model.m.d((com.garmin.android.apps.connectmobile.badges.service.model.m) r0Var2.f105810a, arrayList, null, 8063);
                    r0Var = r0Var2;
                }
                return aVar;
            }
            u62.z.h(g3.f35298f, r0Var.f105810a, y0Var);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            y0Var.j(g3.a.a(g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}

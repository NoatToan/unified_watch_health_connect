package dp1;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lyo1/h;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.GroupRideSummaryViewModel$fetchSocialGroupRideDetailsWithActivity$1", f = "GroupRideSummaryViewModel.kt", l = {46, 49, 60, 72}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<t0<g3<? extends yo1.h>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yo1.h f60664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f60665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f60667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f60668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f60669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f60670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Long f60671h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, String str2, Long l14, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f60668e = jVar;
        this.f60669f = str;
        this.f60670g = str2;
        this.f60671h = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f60668e, this.f60669f, this.f60670g, this.f60671h, dVar);
        iVar.f60667d = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends yo1.h>> t0Var, t13.d<? super Unit> dVar) {
        return ((i) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091 A[LOOP:1: B:24:0x008b->B:26:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        v2 v2Var;
        g3 g3VarA;
        yo1.h hVar;
        List<yo1.i> listG;
        ArrayList arrayList;
        Iterator<T> it;
        Object objA;
        yo1.h hVar2;
        List<yo1.i> list;
        Map map;
        l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        t0 t0Var = (t0) this.f60667d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60666c;
        if (i14 == 0) {
            r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f60667d = t0Var;
            this.f60666c = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                objB = obj;
                v2Var = (v2) objB;
                if (v2Var instanceof v2.b) {
                    hVar = (yo1.h) ((v2.b) v2Var).f47386a;
                    listG = hVar.f198481d.g();
                    arrayList = new ArrayList(y.r(listG, 10));
                    it = listG.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((yo1.i) it.next()).getUserPk()));
                    }
                    a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
                    List<? extends k> listK = x.k(k.FRAMED_FRIEND, k.PREMIUM_FRIEND);
                    this.f60667d = t0Var;
                    this.f60664a = hVar;
                    this.f60665b = listG;
                    this.f60666c = 3;
                    objA = iVar.a(arrayList, listK, this);
                    if (objA != aVar) {
                        hVar2 = hVar;
                        list = listG;
                        map = (Map) objA;
                        for (yo1.i iVar2 : list) {
                            lVar = (l) q6.f.l((int) iVar2.getUserPk(), map);
                            if (lVar == null) {
                            }
                        }
                        g3.f35298f.getClass();
                        g3VarA = g3.a.d(hVar2);
                        this.f60667d = null;
                        this.f60664a = null;
                        this.f60665b = null;
                        this.f60666c = 4;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f60667d = null;
                    this.f60664a = null;
                    this.f60665b = null;
                    this.f60666c = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                list = this.f60665b;
                yo1.h hVar3 = this.f60664a;
                r.b(obj);
                hVar2 = hVar3;
                objA = obj;
                map = (Map) objA;
                while (r3.hasNext()) {
                    lVar = (l) q6.f.l((int) iVar2.getUserPk(), map);
                    if (lVar == null && (profileImageUrls = lVar.getProfileImageUrls()) != null) {
                        iVar2.f198502n = profileImageUrls;
                    }
                }
                g3.f35298f.getClass();
                g3VarA = g3.a.d(hVar2);
                this.f60667d = null;
                this.f60664a = null;
                this.f60665b = null;
                this.f60666c = 4;
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
        vo1.c cVar = this.f60668e.f60672a;
        this.f60667d = t0Var;
        this.f60666c = 2;
        objB = cVar.b(this.f60669f, this.f60670g, this.f60671h, this);
        if (objB != aVar) {
            v2Var = (v2) objB;
            if (v2Var instanceof v2.b) {
                hVar = (yo1.h) ((v2.b) v2Var).f47386a;
                listG = hVar.f198481d.g();
                arrayList = new ArrayList(y.r(listG, 10));
                it = listG.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((yo1.i) it.next()).getUserPk()));
                }
                a22.i iVar3 = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
                List<? extends k> listK2 = x.k(k.FRAMED_FRIEND, k.PREMIUM_FRIEND);
                this.f60667d = t0Var;
                this.f60664a = hVar;
                this.f60665b = listG;
                this.f60666c = 3;
                objA = iVar3.a(arrayList, listK2, this);
                if (objA != aVar) {
                    hVar2 = hVar;
                    list = listG;
                    map = (Map) objA;
                    while (r3.hasNext()) {
                        lVar = (l) q6.f.l((int) iVar2.getUserPk(), map);
                        if (lVar == null) {
                        }
                    }
                    g3.f35298f.getClass();
                    g3VarA = g3.a.d(hVar2);
                    this.f60667d = null;
                    this.f60664a = null;
                    this.f60665b = null;
                    this.f60666c = 4;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f60667d = null;
                this.f60664a = null;
                this.f60665b = null;
                this.f60666c = 4;
            }
        }
        return aVar;
    }
}

package zo1;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$refreshData$1", f = "GroupRideDetailsViewModel.kt", l = {197, 208}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f206452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo1.h f206453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f206454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f206455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f206456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f206457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f206457f = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f206457f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        int i14;
        yo1.h hVar;
        q qVar2;
        List<yo1.i> list;
        Map map;
        p2 p2Var;
        Object value;
        yo1.h hVar2;
        yo1.h hVarA;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f206456e;
        q qVar3 = this.f206457f;
        if (i15 == 0) {
            o13.r.b(obj);
            p2 p2Var2 = qVar3.f206421h;
            b2 b2Var = qVar3.f206424k;
            p2Var2.k(null, Boolean.TRUE);
            yo1.h hVar3 = (yo1.h) b2Var.f150540a.getValue();
            String str = hVar3 != null ? hVar3.f198479b : null;
            yo1.h hVar4 = (yo1.h) b2Var.f150540a.getValue();
            Long l14 = hVar4 != null ? hVar4.f198478a : null;
            String strB = hb2.h.b();
            if (str != null) {
                vo1.c cVar = qVar3.f206414a;
                this.f206452a = qVar3;
                this.f206455d = 0;
                this.f206456e = 1;
                obj = cVar.b(str, strB, l14, this);
                if (obj != aVar) {
                    qVar = qVar3;
                    i14 = 0;
                }
                return aVar;
            }
            qVar3.f206421h.k(null, Boolean.FALSE);
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            i14 = this.f206455d;
            qVar = this.f206452a;
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.f206454c;
            hVar = this.f206453b;
            qVar2 = this.f206452a;
            o13.r.b(obj);
        }
        map = (Map) obj;
        for (yo1.i iVar : list) {
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) iVar.getUserPk(), map);
            if (lVar != null) {
                profileImageUrls = lVar.getProfileImageUrls();
            } else {
                profileImageUrls = null;
            }
            iVar.f198502n = profileImageUrls;
        }
        p2Var = qVar2.f206423j;
        do {
            value = p2Var.getValue();
            hVar2 = (yo1.h) value;
            if (hVar2 != null) {
                hVarA = yo1.h.a(hVar2, hVar.f198481d, hVar.f198482e, hVar.f198483f, hVar.f198484g, hVar.f198485h, hVar.f198486i, 519);
            } else {
                hVarA = null;
            }
        } while (!p2Var.b(value, hVarA));
        qVar3.f206421h.k(null, Boolean.FALSE);
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            yo1.h hVar5 = (yo1.h) ((v2.b) v2Var).f47386a;
            List<yo1.i> listG = hVar5.f198481d.g();
            ArrayList arrayList = new ArrayList(p13.y.r(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((yo1.i) it.next()).getUserPk()));
            }
            a22.i iVar2 = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            this.f206452a = qVar;
            this.f206453b = hVar5;
            this.f206454c = listG;
            this.f206455d = i14;
            this.f206456e = 2;
            Object objA = iVar2.a(arrayList, listK, this);
            if (objA != aVar) {
                hVar = hVar5;
                obj = objA;
                qVar2 = qVar;
                list = listG;
                map = (Map) obj;
                while (r0.hasNext()) {
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) iVar.getUserPk(), map);
                    if (lVar != null) {
                        profileImageUrls = lVar.getProfileImageUrls();
                    } else {
                        profileImageUrls = null;
                    }
                    iVar.f198502n = profileImageUrls;
                }
                p2Var = qVar2.f206423j;
                do {
                    value = p2Var.getValue();
                    hVar2 = (yo1.h) value;
                    if (hVar2 != null) {
                        hVarA = yo1.h.a(hVar2, hVar.f198481d, hVar.f198482e, hVar.f198483f, hVar.f198484g, hVar.f198485h, hVar.f198486i, 519);
                    } else {
                        hVarA = null;
                    }
                } while (!p2Var.b(value, hVarA));
            }
            return aVar;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        qVar3.f206421h.k(null, Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

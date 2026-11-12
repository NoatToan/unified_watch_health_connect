package ho1;

import am.c2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import ei0.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lho1/j;", "Lei0/b;", "Lmo1/f;", "", "groupId", "Lam/c2;", "resourceType", "", "resourceId", "Lfo1/f;", "conversationRepo", "La22/i;", "userProfileRepo", "", "startIndex", "pageSize", "<init>", "(JLam/c2;Ljava/lang/String;Lfo1/f;La22/i;II)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends ei0.b<mo1.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f84807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f84808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fo1.f f84810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ei0.d f84811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j8, c2 c2Var, String str, fo1.f fVar, a22.i iVar, int i14, int i15) {
        super(i14, i15);
        fVar.getClass();
        iVar.getClass();
        this.f84807e = j8;
        this.f84808f = c2Var;
        this.f84809g = str;
        this.f84810h = fVar;
        this.f84811i = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.b
    public final Object f(List list, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f84803c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f84803c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objR0 = hVar.f84801a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f84803c;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(objR0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String userProfilePk = ((mo1.f) it.next()).getUserProfilePk();
                Integer num = userProfilePk != null ? new Integer(Integer.parseInt(userProfilePk)) : null;
                if (num != null) {
                    arrayListX.add(num);
                }
            }
            List listB1 = h0.b1(h0.f1(arrayListX));
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            hVar.f84803c = 1;
            objR0 = this.f84811i.r0(listB1, listC, p0.f64292c, hVar);
            if (objR0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objR0);
        }
        v2 v2Var = (v2) objR0;
        if (!(v2Var instanceof v2.b)) {
            return new ArrayList();
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            arrayList.add(hi0.b.a((hi0.a) it3.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.b
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i16 = iVar.f84806c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                iVar.f84806c = i16 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objJ = iVar.f84804a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = iVar.f84806c;
        if (i17 == 0) {
            r.b(objJ);
            c2 c2Var = this.f84808f;
            if (c2Var == null) {
                vb.h.s("resourceType is null");
                return null;
            }
            String str = this.f84809g;
            if (str == null) {
                vb.h.s("resourceId is null");
                return null;
            }
            String strValueOf = String.valueOf(this.f84807e);
            iVar.f84806c = 1;
            fo1.f fVar = this.f84810h;
            fVar.getClass();
            objJ = f0.J(fVar, new fo1.o(fVar, strValueOf, c2Var, str, i14, i15, null), iVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        List list = (List) ((v2.b) v2Var).f47386a;
        list.getClass();
        return list;
    }
}

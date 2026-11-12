package ho1;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lho1/d;", "Lei0/b;", "Lmo1/b;", "", "commentUuid", "Lfo1/f;", "conversationRepo", "La22/i;", "userProfileRepo", "", "startIndex", "pageSize", "<init>", "(Ljava/lang/String;Lfo1/f;La22/i;II)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ei0.b<mo1.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fo1.f f84789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ei0.d f84790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, fo1.f fVar, a22.i iVar, int i14, int i15) {
        super(i14, i15);
        fVar.getClass();
        iVar.getClass();
        this.f84788e = str;
        this.f84789f = fVar;
        this.f84790g = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.b
    public final Object f(List list, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f84784c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f84784c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objR0 = bVar.f84782a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f84784c;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(objR0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String userProfilePk = ((mo1.b) it.next()).getUserProfilePk();
                Integer num = userProfilePk != null ? new Integer(Integer.parseInt(userProfilePk)) : null;
                if (num != null) {
                    arrayListX.add(num);
                }
            }
            List listB1 = h0.b1(h0.f1(arrayListX));
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            bVar.f84784c = 1;
            objR0 = this.f84790g.r0(listB1, listC, p0.f64292c, bVar);
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
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ei0.b
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f84787c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f84787c = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f84785a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar2.f84787c;
        if (i17 == 0) {
            r.b(objJ);
            String str = this.f84788e;
            if (str == null) {
                vb.h.s("commentUuid is null");
                return null;
            }
            Integer num = new Integer(i14);
            Integer num2 = new Integer(i15);
            cVar2.f84787c = 1;
            fo1.f fVar = this.f84789f;
            fVar.getClass();
            objJ = f0.J(fVar, new fo1.l(fVar, str, num, num2, null), cVar2);
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
        List<mo1.b> listB = ((mo1.c) ((v2.b) v2Var).f47386a).b();
        listB.getClass();
        return listB;
    }
}

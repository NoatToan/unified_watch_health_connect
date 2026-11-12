package zu;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzu/k;", "", "Lav/g;", "badgesRepo", "Lzu/b;", "addBadgeTranslationsUseCase", "<init>", "(Lav/g;Lzu/b;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.g f207047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f207048b;

    public k(av.g gVar, b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f207047a = gVar;
        this.f207048b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f207046d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f207046d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f207044b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f207046d;
        if (i15 == 0) {
            r.b(objJ);
            jVar.f207046d = 1;
            av.g gVar = this.f207047a;
            objJ = f0.J(gVar, new av.l(gVar, str, str2, null), jVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = jVar.f207043a;
            r.b(objJ);
            return bVar;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var;
            e eVar = new e(bVar2, 2);
            jVar.f207043a = bVar2;
            jVar.f207046d = 2;
            if (this.f207048b.a(eVar, jVar) == aVar) {
                return aVar;
            }
        }
        return v2Var;
    }
}

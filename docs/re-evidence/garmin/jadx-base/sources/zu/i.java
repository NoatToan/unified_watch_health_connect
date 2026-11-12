package zu;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzu/i;", "", "Lav/g;", "badgesRepo", "Lzu/b;", "addBadgeTranslationsUseCase", "<init>", "(Lav/g;Lzu/b;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.g f207041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f207042b;

    public i(av.g gVar, b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f207041a = gVar;
        this.f207042b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i14, String str, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i15 = hVar.f207040e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f207040e = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objJ = hVar.f207038c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar.f207040e;
        if (i16 == 0) {
            r.b(objJ);
            hVar.f207037b = i14;
            hVar.f207040e = 1;
            av.g gVar = this.f207041a;
            objJ = f0.J(gVar, new av.k(gVar, str, i14, null), hVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = hVar.f207036a;
            r.b(objJ);
            return bVar;
        }
        i14 = hVar.f207037b;
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var;
            e eVar = new e(bVar2, 1);
            hVar.f207036a = bVar2;
            hVar.f207037b = i14;
            hVar.f207040e = 2;
            if (this.f207042b.a(eVar, hVar) == aVar) {
                return aVar;
            }
        }
        return v2Var;
    }
}

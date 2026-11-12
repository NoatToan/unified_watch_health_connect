package zu;

import av.x;
import av.y;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;
import p13.u;
import p13.u0;
import zy0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzu/m;", "", "Lav/g;", "badgesRepo", "Lzu/b;", "addBadgeTranslationsUseCase", "<init>", "(Lav/g;Lzu/b;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.g f207055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f207056b;

    public m(av.g gVar, b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f207055a = gVar;
        this.f207056b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr, com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr, int i14, int i15, v13.c cVar) {
        l lVar;
        int i16;
        int i17;
        Object obj;
        Object obj2;
        Object obj3;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i18 = lVar.f207054f;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                lVar.f207054f = i18 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object objA = lVar2.f207052d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = lVar2.f207054f;
        if (i19 != 0) {
            if (i19 == 1) {
                i17 = lVar2.f207051c;
                i16 = lVar2.f207050b;
                r.b(objA);
            } else {
                if (i19 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = lVar2.f207049a;
                r.b(objA);
            }
            obj = obj2;
            v2.b bVar = (v2.b) obj;
            obj3 = (List) bVar.f47386a;
            if (obj3 == null) {
                obj3 = j0.f134944a;
            }
            return new v2.b(obj3, bVar.f47387b, null, null, 12, null);
        }
        r.b(objA);
        com.garmin.android.apps.connectmobile.badges.service.model.b.a aVar2 = com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d;
        List listI0 = bVarArr != null ? u.i0(bVarArr) : null;
        aVar2.getClass();
        ArrayList arrayListB = com.garmin.android.apps.connectmobile.badges.service.model.b.a.b(listI0);
        com.garmin.android.apps.connectmobile.badges.service.model.d dVar = com.garmin.android.apps.connectmobile.badges.service.model.d.EASY;
        List list = dVarArr == null ? null : (List) Arrays.stream(dVarArr).map(new com.garmin.android.apps.connectmobile.badges.service.model.c(0)).collect(Collectors.toList());
        lVar2.f207050b = i14;
        lVar2.f207051c = i15;
        lVar2.f207054f = 1;
        av.g gVar = this.f207055a;
        objA = gVar.f13087d.a(new x(gVar, arrayListB, list, i14, i15, null), new y(), q.a(u0.e(new o13.p("categoryIds", arrayListB), new o13.p("difficultyIds", list), new o13.p(TtmlNode.START, new Integer(i14)), new o13.p(MapboxMap.QFE_LIMIT, new Integer(i15))), zy0.a.GET_EARNED_BADGES_URL.f207440a, new Object[0]), lVar2);
        if (objA != aVar) {
            i16 = i14;
            i17 = i15;
        }
        return aVar;
        obj = ((zy0.p) objA).f207459a;
        if (!(obj instanceof v2.b)) {
            if (obj instanceof v2.a) {
                v2.a aVar3 = (v2.a) obj;
                return new v2.a(aVar3.f47383a, aVar3.f47384b, null, 4, null);
            }
            lc.u0.r();
            return 0;
        }
        v2.b bVar2 = (v2.b) obj;
        List list2 = (List) bVar2.f47386a;
        if (list2 != null) {
            vr.e eVar = new vr.e(list2, 3);
            lVar2.f207049a = bVar2;
            lVar2.f207050b = i16;
            lVar2.f207051c = i17;
            lVar2.f207054f = 2;
            if (this.f207056b.a(eVar, lVar2) != aVar) {
                obj2 = obj;
                obj = obj2;
            }
            return aVar;
        }
        v2.b bVar3 = (v2.b) obj;
        obj3 = (List) bVar3.f47386a;
        if (obj3 == null) {
            obj3 = j0.f134944a;
        }
        return new v2.b(obj3, bVar3.f47387b, null, null, 12, null);
    }
}

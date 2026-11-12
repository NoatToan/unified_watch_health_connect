package zu;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzu/d;", "", "Lav/g;", "badgesRepo", "Lzu/b;", "addBadgeTranslationsUseCase", "<init>", "(Lav/g;Lzu/b;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.g f207026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f207027b;

    public d(av.g gVar, b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f207026a = gVar;
        this.f207027b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr, com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr, int i14, int i15, boolean z14, v13.c cVar) {
        c cVar2;
        boolean z15;
        int i16;
        int i17;
        Object obj;
        Object obj2;
        List list;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i18 = cVar2.f207025h;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                cVar2.f207025h = i18 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object objA = cVar3.f207023f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = cVar3.f207025h;
        if (i19 != 0) {
            if (i19 == 1) {
                z15 = cVar3.f207022e;
                i17 = cVar3.f207021d;
                i16 = cVar3.f207020c;
                r.b(objA);
            } else {
                if (i19 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = cVar3.f207019b;
                obj2 = cVar3.f207018a;
                r.b(objA);
            }
            if (list == null) {
                obj = obj2;
                list = j0.f134944a;
                obj2 = obj;
            }
            return new v2.b(list, ((v2.b) obj2).f47387b, null, null, 12, null);
        }
        r.b(objA);
        com.garmin.android.apps.connectmobile.badges.service.model.b.a aVar2 = com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d;
        List listI0 = bVarArr != null ? u.i0(bVarArr) : null;
        aVar2.getClass();
        ArrayList arrayListB = com.garmin.android.apps.connectmobile.badges.service.model.b.a.b(listI0);
        com.garmin.android.apps.connectmobile.badges.service.model.d dVar = com.garmin.android.apps.connectmobile.badges.service.model.d.EASY;
        List list2 = dVarArr == null ? null : (List) Arrays.stream(dVarArr).map(new com.garmin.android.apps.connectmobile.badges.service.model.c(0)).collect(Collectors.toList());
        cVar3.f207020c = i14;
        cVar3.f207021d = i15;
        cVar3.f207022e = z14;
        cVar3.f207025h = 1;
        av.g gVar = this.f207026a;
        objA = gVar.f13087d.a(new av.o(gVar, arrayListB, list2, i14, i15, z14, null), new av.p(), q.a(u0.e(new o13.p("categoryIds", arrayListB), new o13.p("difficultyIds", list2), new o13.p(TtmlNode.START, new Integer(i14)), new o13.p(MapboxMap.QFE_LIMIT, new Integer(i15))), zy0.a.GET_AVAILABLE_BADGES.f207440a, new Object[0]), cVar3);
        if (objA != aVar) {
            z15 = z14;
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
        v2.b bVar = (v2.b) obj;
        List list3 = (List) bVar.f47386a;
        if (list3 != null) {
            vr.e eVar = new vr.e(list3, 2);
            cVar3.f207018a = bVar;
            cVar3.f207019b = list3;
            cVar3.f207020c = i16;
            cVar3.f207021d = i17;
            cVar3.f207022e = z15;
            cVar3.f207025h = 2;
            if (this.f207027b.a(eVar, cVar3) != aVar) {
                obj2 = obj;
                list = list3;
                if (list == null) {
                    obj = obj2;
                    list = j0.f134944a;
                    obj2 = obj;
                }
            }
            return aVar;
        }
        list = j0.f134944a;
        obj2 = obj;
        return new v2.b(list, ((v2.b) obj2).f47387b, null, null, 12, null);
    }
}

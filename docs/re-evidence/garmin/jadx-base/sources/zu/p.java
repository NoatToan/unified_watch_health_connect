package zu;

import av.b0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.s0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.Arrays;
import java.util.List;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.u0;
import p13.w;
import zy0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzu/p;", "", "Lyu/c;", "badgesDomainRepo", "Lav/g;", "badgesRepo", "Lzu/b;", "addBadgeTranslationsUseCase", "<init>", "(Lyu/c;Lav/g;Lzu/b;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yu.c f207066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.g f207067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f207068c;

    public p(yu.c cVar, av.g gVar, b bVar) {
        cVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.f207066a = cVar;
        this.f207067b = gVar;
        this.f207068c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i14, int i15, boolean z14, v13.c cVar) {
        o oVar;
        Object obj;
        boolean z15;
        zy0.p pVar;
        v2 v2Var;
        int i16;
        boolean z16;
        int i17;
        v2 v2Var2;
        s0 s0Var;
        int i18 = i14;
        int i19 = i15;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i24 = oVar.f207065h;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                oVar.f207065h = i24 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        o oVar2 = oVar;
        Object objJ = oVar2.f207063f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i25 = oVar2.f207065h;
        if (i25 == 0) {
            r.b(objJ);
            oVar2.f207058a = i18;
            oVar2.f207059b = i19;
            oVar2.f207060c = z14;
            oVar2.f207065h = 1;
            yu.c cVar2 = this.f207066a;
            Object objB = zy0.b.b(cVar2.f199683b, new yu.a(cVar2, i18, i19, null), new yu.b(), z14, String.format(zy0.a.GET_FOLLOWINGS_BADGE_DETAILS.f207440a, Arrays.copyOf(new Object[]{new Integer(i18), new Integer(i19)}, 2)), null, oVar2, 48);
            if (objB != aVar) {
                obj = objB;
                z15 = z14;
            }
            return aVar;
        }
        if (i25 == 1) {
            boolean z17 = oVar2.f207060c;
            i19 = oVar2.f207059b;
            int i26 = oVar2.f207058a;
            r.b(objJ);
            z15 = z17;
            i18 = i26;
            obj = objJ;
        } else {
            if (i25 == 2) {
                z16 = oVar2.f207060c;
                int i27 = oVar2.f207059b;
                int i28 = oVar2.f207058a;
                v2Var = oVar2.f207062e;
                zy0.p pVar2 = oVar2.f207061d;
                r.b(objJ);
                i17 = i27;
                i16 = i28;
                pVar = pVar2;
                if (((com.garmin.android.apps.connectmobile.badges.service.model.m) ((v2.b) v2Var).f47386a).getIsBadgeViewed()) {
                    return v2Var;
                }
                List listC = w.c(new Integer(i16));
                oVar2.f207061d = pVar;
                oVar2.f207062e = v2Var;
                oVar2.f207058a = i16;
                oVar2.f207059b = i17;
                oVar2.f207060c = z16;
                oVar2.f207065h = 3;
                av.g gVar = this.f207067b;
                objJ = f0.J(gVar, new b0(gVar, listC, null), oVar2);
                if (objJ != aVar) {
                    v2Var2 = v2Var;
                }
                return aVar;
            }
            if (i25 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z16 = oVar2.f207060c;
            i16 = oVar2.f207058a;
            v2Var2 = oVar2.f207062e;
            pVar = oVar2.f207061d;
            r.b(objJ);
        }
        if (((v2) objJ) instanceof v2.b) {
            ((com.garmin.android.apps.connectmobile.badges.service.model.m) ((v2.b) v2Var2).f47386a).A0();
        }
        s0Var = (s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null);
        if (pVar.f207460b == zy0.c.SERVER && z16) {
            s0Var.b(q.a(u0.e(new o13.p(TtmlNode.START, new Integer(0)), new o13.p(MapboxMap.QFE_LIMIT, new Integer(0))), zy0.a.GET_FOLLOWINGS_WITH_BADGE.f207440a, new Integer(i16)));
        }
        return v2Var2;
        pVar = (zy0.p) obj;
        v2Var = pVar.f207459a;
        if (!(v2Var instanceof v2.b)) {
            return v2Var;
        }
        yw2.h hVar = new yw2.h(v2Var, 22);
        oVar2.f207061d = pVar;
        oVar2.f207062e = v2Var;
        oVar2.f207058a = i18;
        oVar2.f207059b = i19;
        oVar2.f207060c = z15;
        oVar2.f207065h = 2;
        if (this.f207068c.a(hVar, oVar2) != aVar) {
            int i29 = i19;
            i16 = i18;
            z16 = z15;
            i17 = i29;
            if (((com.garmin.android.apps.connectmobile.badges.service.model.m) ((v2.b) v2Var).f47386a).getIsBadgeViewed()) {
                return v2Var;
            }
            List listC2 = w.c(new Integer(i16));
            oVar2.f207061d = pVar;
            oVar2.f207062e = v2Var;
            oVar2.f207058a = i16;
            oVar2.f207059b = i17;
            oVar2.f207060c = z16;
            oVar2.f207065h = 3;
            av.g gVar2 = this.f207067b;
            objJ = f0.J(gVar2, new b0(gVar2, listC2, null), oVar2);
            if (objJ != aVar) {
                v2Var2 = v2Var;
                if (((v2) objJ) instanceof v2.b) {
                    ((com.garmin.android.apps.connectmobile.badges.service.model.m) ((v2.b) v2Var2).f47386a).A0();
                }
                s0Var = (s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null);
                if (pVar.f207460b == zy0.c.SERVER) {
                    s0Var.b(q.a(u0.e(new o13.p(TtmlNode.START, new Integer(0)), new o13.p(MapboxMap.QFE_LIMIT, new Integer(0))), zy0.a.GET_FOLLOWINGS_WITH_BADGE.f207440a, new Integer(i16)));
                }
                return v2Var2;
            }
        }
        return aVar;
    }
}

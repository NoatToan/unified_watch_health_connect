package jd0;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/m;", "Loe0/g;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements oe0.g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98353a;

        static {
            int[] iArr = new int[jr.l.values().length];
            try {
                iArr[jr.l.ActivityName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f98353a = iArr;
        }
    }

    @Override // oe0.g
    public final void a(Context context, ActivityListItemDTO activityListItemDTO) {
        context.getClass();
        activityListItemDTO.getClass();
        aq.b bVar = new aq.b();
        bVar.f11823b = activityListItemDTO.f29250b;
        am.h hVar = am.h.VIEW_EDIT;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11827f = activityListItemDTO.f29265g.f4358a;
        bVar.f11825d = true;
        context.startActivity(bVar.a(context));
    }

    @Override // oe0.g
    public final oe0.h b(Context context, ActivityListItemDTO activityListItemDTO) {
        jr.q qVar;
        ArrayList arrayList;
        String strB;
        String strB2;
        String encodedSamples;
        String str;
        List<jr.r> listG;
        Object next;
        context.getClass();
        activityListItemDTO.getClass();
        ps.q qVarA = ss.c.a(activityListItemDTO);
        x0 x0VarO = qVarA.o();
        l22.a aVar = new l22.a(context);
        List<jr.q> listA = new kr.a(context).a(x0VarO).a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((jr.q) next).d() != jr.s.Home);
            qVar = (jr.q) next;
        } else {
            qVar = null;
        }
        List listA2 = (qVar == null || (listG = qVar.g()) == null) ? j0.f134944a : is.o.a(listG, qVarA);
        jr.p pVar = (jr.p) h0.e0(0, listA2);
        ls.e eVarA = pVar != null ? is.m.a(pVar) : null;
        jr.p pVar2 = (jr.p) h0.e0(1, listA2);
        ls.e eVarA2 = pVar2 != null ? is.m.a(pVar2) : null;
        jr.p pVar3 = (jr.p) h0.e0(2, listA2);
        ls.e eVarA3 = pVar3 != null ? is.m.a(pVar3) : null;
        String strA = dh.b.A(context, x0VarO.f4360c);
        jr.l lVarC = qVar != null ? qVar.c() : null;
        String str2 = ((lVarC == null ? -1 : a.f98353a[lVarC.ordinal()]) != 1 || (str = activityListItemDTO.f29253c) == null) ? strA : str;
        ps.m mVar = activityListItemDTO.f29300x;
        if (mVar == null || (encodedSamples = mVar.getEncodedSamples()) == null) {
            arrayList = null;
        } else {
            List<LatLng> listDecode = PolyUtil.decode(encodedSamples);
            listDecode.getClass();
            ArrayList arrayList2 = new ArrayList(p13.y.r(listDecode, 10));
            for (LatLng latLng : listDecode) {
                arrayList2.add(new o13.p(Double.valueOf(latLng.latitude), Double.valueOf(latLng.longitude)));
            }
            arrayList = arrayList2;
        }
        return new oe0.h(str2, (eVarA == null || (strB2 = ss.k.b(eVarA, aVar, ss.k.k(eVarA, qVarA), ss.k.c(eVarA))) == null) ? "" : strB2, (eVarA2 == null || (strB = ss.k.b(eVarA2, aVar, ss.k.k(eVarA2, qVarA), ss.k.c(eVarA2))) == null) ? "" : strB, eVarA3 != null ? ss.k.b(eVarA3, aVar, ss.k.k(eVarA3, qVarA), ss.k.c(eVarA3)) : null, arrayList);
    }
}

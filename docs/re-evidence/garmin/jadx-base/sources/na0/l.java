package na0;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.CameraOptions;
import gg1.o0;
import java.util.ArrayList;
import java.util.List;
import lc.v;
import m4.g0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r1.j2;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f125146b;

    public /* synthetic */ l(e23.l lVar, int i14) {
        this.f125145a = i14;
        this.f125146b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        x52.f fVar;
        m52.e eVar;
        m52.d dVar;
        m52.a aVar;
        int i14 = this.f125145a;
        int i15 = 10;
        Object obj2 = null;
        int i16 = 0;
        e23.l lVar = this.f125146b;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                w13.c cVar = o0.f77290i;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : cVar) {
                    if (((o0) obj3) != o0.STATUTE_UK) {
                        arrayList.add(obj3);
                    }
                }
                o0 o0Var = (o0) h0.e0(iIntValue, arrayList);
                if (o0Var != null) {
                    lVar.invoke(o0Var);
                }
                return Unit.INSTANCE;
            case 1:
                r1.n nVar = (r1.n) obj;
                lc.h0 h0Var = ((v) nVar.f()).f111882b;
                h0Var.getClass();
                lc.h0.f111771f.getClass();
                for (lc.h0 h0Var2 : lc.h0.a.b((nc.e.b) h0Var)) {
                }
                if (lVar != null) {
                    return (j2) lVar.invoke(nVar);
                }
                return null;
            case 2:
                CameraOptions cameraOptions = (CameraOptions) obj;
                int i17 = ne2.n.f125688h;
                cameraOptions.getClass();
                lVar.invoke(cameraOptions);
                return Unit.INSTANCE;
            case 3:
                List list = (List) obj;
                list.getClass();
                lVar.invoke(list);
                return Unit.INSTANCE;
            case 4:
                List<Uri> list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                for (Uri uri : list2) {
                    String string = uri.toString();
                    string.getClass();
                    arrayList2.add(new bq0.k(uri, string, "jpg", 0.0d));
                }
                lVar.invoke(arrayList2);
                return Unit.INSTANCE;
            case 5:
                int iIntValue2 = ((Integer) obj).intValue();
                x52.f.f189078g.getClass();
                lVar.invoke(x52.f.a.d(iIntValue2));
                return Unit.INSTANCE;
            case 6:
                int iIntValue3 = ((Integer) obj).intValue();
                x52.f.f189078g.getClass();
                x52.f[] fVarArrValues = x52.f.values();
                int length = fVarArrValues.length;
                while (i16 < length) {
                    fVar = fVarArrValues[i16];
                    if (fVar.f189096a == iIntValue3) {
                        lVar.invoke(fVar);
                        return Unit.INSTANCE;
                    }
                    i16++;
                }
                fVar = x52.f.f189081j;
                lVar.invoke(fVar);
                return Unit.INSTANCE;
            case 7:
                int iIntValue4 = ((Integer) obj).intValue();
                x52.f.f189078g.getClass();
                lVar.invoke(x52.f.a.d(iIntValue4));
                return Unit.INSTANCE;
            case 8:
                int iIntValue5 = ((Integer) obj).intValue();
                m52.e.f116695b.getClass();
                m52.e[] eVarArrValues = m52.e.values();
                int length2 = eVarArrValues.length;
                while (i16 < length2) {
                    eVar = eVarArrValues[i16];
                    if (eVar.f116703a == iIntValue5) {
                        lVar.invoke(eVar);
                        return Unit.INSTANCE;
                    }
                    i16++;
                }
                eVar = m52.e.NONE;
                lVar.invoke(eVar);
                return Unit.INSTANCE;
            case 9:
                int iIntValue6 = ((Integer) obj).intValue();
                m52.d.f116681c.getClass();
                for (Object obj4 : m52.d.f116692n) {
                    if (((m52.d) obj4).f116694b == iIntValue6) {
                        obj2 = obj4;
                        dVar = (m52.d) obj2;
                        if (dVar == null) {
                            dVar = m52.d.OTHER;
                        }
                        lVar.invoke(dVar);
                        return Unit.INSTANCE;
                    }
                }
                dVar = (m52.d) obj2;
                if (dVar == null) {
                    dVar = m52.d.OTHER;
                }
                lVar.invoke(dVar);
                return Unit.INSTANCE;
            case 10:
                int iIntValue7 = ((Integer) obj).intValue();
                m52.f.f116704d.getClass();
                m52.f[] fVarArrValues2 = m52.f.values();
                int length3 = fVarArrValues2.length;
                while (i16 < length3) {
                    m52.f fVar2 = fVarArrValues2[i16];
                    if (fVar2.f116711a == iIntValue7) {
                        obj2 = fVar2;
                        lVar.invoke(obj2);
                        return Unit.INSTANCE;
                    }
                    i16++;
                }
                lVar.invoke(obj2);
                return Unit.INSTANCE;
            case 11:
                int iIntValue8 = ((Integer) obj).intValue();
                m52.a.f116647c.getClass();
                m52.a[] aVarArrValues = m52.a.values();
                int length4 = aVarArrValues.length;
                while (i16 < length4) {
                    aVar = aVarArrValues[i16];
                    if (aVar.f116661a == iIntValue8) {
                        lVar.invoke(aVar);
                        return Unit.INSTANCE;
                    }
                    i16++;
                }
                aVar = m52.a.f116658n;
                lVar.invoke(aVar);
                return Unit.INSTANCE;
            case 12:
                int iIntValue9 = ((Integer) obj).intValue();
                x52.f.f189078g.getClass();
                lVar.invoke(x52.f.a.d(iIntValue9));
                return Unit.INSTANCE;
            case 13:
                int iIntValue10 = ((Integer) obj).intValue();
                x52.f.f189078g.getClass();
                lVar.invoke(x52.f.a.d(iIntValue10));
                return Unit.INSTANCE;
            case 14:
                int iIntValue11 = ((Integer) obj).intValue();
                qs.f.f147060d.getClass();
                qs.f fVarA = qs.f.a.a(iIntValue11);
                lVar.invoke(fVarA != qs.f.NONE ? fVarA : null);
                return Unit.INSTANCE;
            case 15:
                Double d14 = (Double) obj;
                d14.doubleValue();
                lVar.invoke(d14);
                return Unit.INSTANCE;
            case 16:
                int iIntValue12 = ((Integer) obj).intValue();
                w13.c cVar2 = o0.f77290i;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : cVar2) {
                    if (((o0) obj5) != o0.STATUTE_UK) {
                        arrayList3.add(obj5);
                    }
                }
                o0 o0Var2 = (o0) h0.e0(iIntValue12, arrayList3);
                if (o0Var2 != null) {
                    lVar.invoke(o0Var2);
                }
                return Unit.INSTANCE;
            case 17:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                lVar.invoke(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 18:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                lVar.invoke(l0Var);
                return Unit.INSTANCE;
            case 19:
                o0 o0Var3 = (o0) obj;
                o0Var3.getClass();
                lVar.invoke(o0Var3);
                return Unit.INSTANCE;
            case 20:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 2000) {
                    lVar.invoke(str);
                }
                return Unit.INSTANCE;
            case 21:
                b63.v vVar = (b63.v) obj;
                vVar.getClass();
                lVar.invoke(vVar);
                return Unit.INSTANCE;
            case 22:
                b63.v vVar2 = (b63.v) obj;
                vVar2.getClass();
                lVar.invoke(vVar2);
                return Unit.INSTANCE;
            case 23:
                q40.b bVar = (q40.b) obj;
                bVar.getClass();
                lVar.invoke(bVar);
                return Unit.INSTANCE;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                lVar.invoke(str2);
                return Unit.INSTANCE;
            case 25:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                lVar.invoke(dateTime);
                return Unit.INSTANCE;
            case 26:
                DateTime dateTime2 = (DateTime) obj;
                dateTime2.getClass();
                lVar.invoke(dateTime2);
                return Unit.INSTANCE;
            case 27:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_title_maintenance_notice);
                aVar2.setMessage(R.string.wallet_message_urgent_maintenance_notice);
                aVar2.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, i15));
                aVar2.setCancelable(false);
                return Unit.INSTANCE;
            case 28:
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                aVar3.getClass();
                aVar3.setTitle(R.string.wallet_transaction_canceled);
                aVar3.setMessage(R.string.wallet_dont_cancel_transaction);
                aVar3.setCancelable(false);
                aVar3.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 14));
                return Unit.INSTANCE;
            default:
                mp.b bVar2 = (mp.b) obj;
                bVar2.getClass();
                lVar.invoke(bVar2);
                return Unit.INSTANCE;
        }
    }
}

package jd0;

import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/h;", "Lis1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements is1.a {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // is1.a
    public final Serializable a(DateTime dateTime, v13.c cVar) {
        g gVar;
        DateTime dateTimePlusSeconds;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f98349c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f98349c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objD = gVar.f98347a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f98349c;
        if (i15 == 0) {
            o13.r.b(objD);
            String string = dateTime.toString("yyyy-MM-dd");
            if (string == null) {
                string = "";
            }
            ff0.l lVar = (ff0.l) KoinJavaComponent.get$default(ff0.l.class, null, null, 6, null);
            gVar.f98349c = 1;
            objD = lVar.d(string, string, gVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            pf0.s sVar = new pf0.s(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c());
            List<gf0.a> listA = ((ff0.g) ((v2.b) v2Var).f47386a).a();
            if (listA != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
                for (gf0.a aVar2 : listA) {
                    DateTime dateTimeK = aVar2.k();
                    DateTime dateTime2 = dateTimeK != null ? dateTimeK.toDateTime(DateTimeZone.UTC) : null;
                    sn.h hVar = new sn.h(1L, new sn.c(aVar2.getDetailId()), aVar2.getStartTimeLocal(), dateTime2 != null ? dateTime2.toString("yyyy-MM-dd'T'HH:mm:ss.SSS") : null, (dateTime2 == null || (dateTimePlusSeconds = dateTime2.plusSeconds(30)) == null) ? null : dateTimePlusSeconds.toString("yyyy-MM-dd'T'HH:mm:ss.SSS"), null, null, null, "ECG", null, null, null, p13.w.c(new sn.g("HEART_RATE", null, null, aVar2.getHeartRateAverage(), 6, null)), null, null, null, 61152, null);
                    hVar.F(sVar.b(aVar2));
                    arrayList.add(hVar);
                }
                return arrayList;
            }
        }
        return null;
    }
}

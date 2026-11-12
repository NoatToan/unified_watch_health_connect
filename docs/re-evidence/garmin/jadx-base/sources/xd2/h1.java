package xd2;

import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
public final class h1 {
    public static final <T, R> g1<R> a(yd2.b<? extends T> bVar, e23.l<? super T, ? extends R> lVar) {
        ae2.d dVar;
        String name;
        List<ae2.d> listA;
        bVar.getClass();
        if (bVar instanceof yd2.b.C3683b) {
            return new g1.b(lVar.invoke(((yd2.b.C3683b) bVar).f196776a));
        }
        if (!(bVar instanceof yd2.b.a)) {
            lc.u0.r();
            return null;
        }
        try {
            String str = ((yd2.b.a) bVar).f196774c;
            ae2.e eVar = str != null ? (ae2.e) new Gson().fromJson(str, (Class) ae2.e.class) : null;
            dVar = (eVar == null || (listA = eVar.a()) == null) ? null : (ae2.d) p13.h0.d0(listA);
        } catch (JsonSyntaxException e4) {
            ds.e0.v("Exception while parsing error body: ", e4.getMessage(), i2.a("OperationResult"));
        }
        g1.a.C3545a c3545a = g1.a.f190161a;
        yd2.b.a aVar = (yd2.b.a) bVar;
        Exception exc = aVar.f196772a;
        Integer num = aVar.f196773b;
        c3545a.getClass();
        exc.getClass();
        if (dVar == null || (name = dVar.getName()) == null) {
            String str2 = dVar != null ? dVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null;
            name = str2 == null ? "" : str2;
        }
        if (exc instanceof NoNetworkException) {
            return g1.a.d.f190164b;
        }
        if (num != null && 403 == num.intValue() && "LiveTrack Consent".equalsIgnoreCase(name)) {
            return g1.a.c.f190163b;
        }
        if (num != null && 404 == num.intValue()) {
            return g1.a.e.f190165b;
        }
        return "Maintenance".equalsIgnoreCase(name) ? g1.a.b.f190162b : g1.a.f.f190166b;
    }
}

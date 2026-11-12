package xl;

import android.content.Context;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gs1.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxl/d;", "", "<init>", "()V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f191303a = new d();

    private d() {
    }

    public static i53.c a(Context context, List list, ArrayList arrayList, boolean z14) {
        double dN;
        String string = context.getString(R.string.no_value);
        string.getClass();
        List<h> listN0 = h0.N0(list, new a());
        ArrayList arrayList2 = new ArrayList(y.r(listN0, 10));
        for (h hVar : listN0) {
            Date date = hVar.a().toDate();
            date.getClass();
            String strG = j0.g(date, "MMM d, yyyy", null);
            l3.a aVar = l3.f23124b;
            double d14 = hVar.f78765b;
            aVar.getClass();
            String strA0 = l3.a.A0(context, d14, 0);
            if (strA0 == null) {
                strA0 = "";
            }
            String str = strA0;
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    j0 j0Var = j0.f23099a;
                    DateTime dateTime = new DateTime(((gs1.y) obj).f78892a);
                    DateTime dateTimeA = hVar.a();
                    j0Var.getClass();
                    if (j0.F(dateTime, dateTimeA)) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Double.valueOf(((gs1.y) it.next()).f78893b));
                }
                dN = h0.N(arrayList4);
            } else {
                dN = Double.NaN;
            }
            l3.a aVar2 = l3.f23124b;
            double d15 = !Double.isNaN(dN) ? MathKt.d(dN) : Double.NaN;
            aVar2.getClass();
            String strC0 = l3.a.c0(context, d15, z14, true, false);
            if (strC0.length() == 0) {
                strC0 = string;
            }
            long millis = hVar.a().getMillis();
            String string2 = context.getString(R.string.avg_value, strC0);
            string2.getClass();
            arrayList2.add(new yl.a(millis, strG, str, string2));
        }
        return i53.a.e(arrayList2);
    }
}

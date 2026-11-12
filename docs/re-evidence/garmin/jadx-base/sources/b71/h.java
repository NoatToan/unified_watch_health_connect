package b71;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb71/h;", "Ltz/a;", "La71/e;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "Lb71/j;", "dataConfig", "Lb71/l;", "rendererConfig", "Lqz/e;", "hoverConfig", "Lqz/f;", "legendConfig", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;Lb71/j;Lb71/l;Lqz/e;Lqz/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends tz.a<a71.e> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CustomLineChart customLineChart, j jVar, l lVar, qz.e eVar, qz.f fVar) {
        super(customLineChart, jVar, lVar, eVar, fVar, null, 32, null);
        customLineChart.getClass();
        jVar.getClass();
        lVar.getClass();
        eVar.getClass();
        fVar.getClass();
    }

    @Override // tz.a, qz.a
    public final void a(Object obj, String str) {
        a71.e eVar = (a71.e) obj;
        super.a(eVar, str);
        Object obj2 = this.f167285b;
        obj2.getClass();
        j jVar = (j) obj2;
        List listN0 = null;
        List<a71.d> list = eVar != null ? eVar.f1751a : null;
        Float fValueOf = Float.valueOf(2.3f);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!Double.isNaN(((a71.d) obj3).f1739c)) {
                    arrayList.add(obj3);
                }
            }
            listN0 = h0.N0(arrayList, new k());
        }
        if (listN0 == null || listN0.isEmpty()) {
            jVar.f16354l = new o13.p<>(Float.valueOf(0.0f), fValueOf);
        } else {
            jVar.f16354l = new o13.p<>(Float.valueOf(Math.min((float) ((a71.d) h0.b0(listN0)).f1739c, 0.0f)), fValueOf);
        }
    }
}

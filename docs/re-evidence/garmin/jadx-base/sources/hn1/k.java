package hn1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f84534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f84535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u82.f f84536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f84537e;

    public /* synthetic */ k(DateTime dateTime, DateTime dateTime2, u82.f fVar, String str, int i14) {
        this.f84533a = i14;
        this.f84534b = dateTime;
        this.f84535c = dateTime2;
        this.f84536d = fVar;
        this.f84537e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        DateTime dateTime;
        List<i41.f> listB;
        i41.e eVar;
        mm1.b bVar;
        List<mm1.c> listB2;
        switch (this.f84533a) {
            case 0:
                CustomCombinedChart customCombinedChart = (CustomCombinedChart) obj;
                customCombinedChart.getClass();
                DateTime dateTime2 = this.f84534b;
                if (dateTime2 != null && (dateTime = this.f84535c) != null) {
                    Context context = customCombinedChart.getContext();
                    context.getClass();
                    b41.b bVar2 = new b41.b(customCombinedChart, new a41.a(context), new d41.b(customCombinedChart, dateTime2, dateTime), new c41.a(customCombinedChart), new k00.g(customCombinedChart), null, 32, null);
                    u82.f fVar = this.f84536d;
                    if (fVar == null || (eVar = (i41.e) fVar.a()) == null || (listB = eVar.b()) == null) {
                        listB = j0.f134944a;
                    }
                    qz.a.b(bVar2, n41.c.a.a(n41.c.f123606a, listB, dateTime2, dateTime), this.f84537e, 4);
                }
                break;
            default:
                CustomBarChart customBarChart = (CustomBarChart) obj;
                customBarChart.getClass();
                DateTime dateTime3 = this.f84534b;
                ym1.c cVar = null;
                LocalDate localDate = dateTime3 != null ? dateTime3.toLocalDate() : null;
                DateTime dateTime4 = this.f84535c;
                p pVar = new p(localDate, dateTime4 != null ? dateTime4.toLocalDate() : null);
                LocalDate localDate2 = (LocalDate) pVar.f128594a;
                LocalDate localDate3 = (LocalDate) pVar.f128595b;
                if (localDate2 != null && localDate3 != null) {
                    Context context2 = customBarChart.getContext();
                    context2.getClass();
                    rz.a aVar = new rz.a(customBarChart, new ym1.a(context2, localDate2, localDate3, true), new ym1.b(customBarChart, localDate2, localDate3), new k00.m(customBarChart), new k00.g(customBarChart), null, 32, null);
                    u82.f fVar2 = this.f84536d;
                    if (fVar2 != null && (bVar = (mm1.b) fVar2.a()) != null && (listB2 = bVar.b()) != null) {
                        cVar = new ym1.c(vm1.a.g(listB2), vm1.a.h(listB2));
                    }
                    qz.a.b(aVar, cVar, this.f84537e, 4);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

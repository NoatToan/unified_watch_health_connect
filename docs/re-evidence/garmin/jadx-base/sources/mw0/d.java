package mw0;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f121250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pv0.r f121251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.a f121252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw0.f f121253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f121254f;

    public /* synthetic */ d(p1 p1Var, pv0.r rVar, hw0.a aVar, kw0.f fVar, String str, int i14) {
        this.f121249a = i14;
        this.f121250b = p1Var;
        this.f121251c = rVar;
        this.f121252d = aVar;
        this.f121253e = fVar;
        this.f121254f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) obj;
        switch (this.f121249a) {
            case 0:
                customCombinedChart.getClass();
                pv0.r rVar = ((Boolean) this.f121250b.getF182175a()).booleanValue() ? this.f121251c : null;
                hw0.a aVar = this.f121252d;
                aVar.getClass();
                String str = this.f121254f;
                str.getClass();
                aVar.b(rVar);
                uz.a.a(aVar, this.f121253e, str, 4);
                break;
            default:
                customCombinedChart.getClass();
                pv0.r rVar2 = ((Boolean) this.f121250b.getF182175a()).booleanValue() ? this.f121251c : null;
                hw0.a aVar2 = this.f121252d;
                aVar2.getClass();
                String str2 = this.f121254f;
                str2.getClass();
                aVar2.b(rVar2);
                uz.a.a(aVar2, this.f121253e, str2, 4);
                break;
        }
        return Unit.INSTANCE;
    }
}

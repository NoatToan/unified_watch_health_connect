package kx;

import android.content.Context;
import android.view.MotionEvent;
import b00.h;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import zz.j;
import zz.k;
import zz.u;
import zz.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkx/c;", "Lqz/e;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lkotlin/Function0;", "", "onChartInteraction", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Le23/a;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f107007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f107008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b00.b f107009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f107010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f107011e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<MotionEvent, Unit> {
        public a(Object obj) {
            super(1, obj, pz.d.class, "toggleSingleHighlight", "toggleSingleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.h((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    public c(CustomCombinedChart customCombinedChart, e23.a<Unit> aVar) {
        CustomCombinedChart customCombinedChart2;
        b00.b hVar;
        customCombinedChart.getClass();
        this.f107007a = customCombinedChart;
        this.f107008b = aVar;
        if (customCombinedChart.getContext().getResources().getConfiguration().orientation == 2) {
            final int i14 = 0;
            hVar = new b00.e(customCombinedChart, new a(customCombinedChart), new e23.a(this) { // from class: kx.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f107006b;

                {
                    this.f107006b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    e23.a<Unit> aVar2;
                    e23.a<Unit> aVar3;
                    switch (i14) {
                        case 0:
                            c cVar = this.f107006b;
                            if (!cVar.f107007a.isEmpty() && (aVar2 = cVar.f107008b) != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            c cVar2 = this.f107006b;
                            if (!cVar2.f107007a.isEmpty() && (aVar3 = cVar2.f107008b) != null) {
                                aVar3.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            customCombinedChart2 = customCombinedChart;
        } else {
            final int i15 = 1;
            customCombinedChart2 = customCombinedChart;
            hVar = new h(customCombinedChart2, new e23.a(this) { // from class: kx.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f107006b;

                {
                    this.f107006b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    e23.a<Unit> aVar2;
                    e23.a<Unit> aVar3;
                    switch (i15) {
                        case 0:
                            c cVar = this.f107006b;
                            if (!cVar.f107007a.isEmpty() && (aVar2 = cVar.f107008b) != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            c cVar2 = this.f107006b;
                            if (!cVar2.f107007a.isEmpty() && (aVar3 = cVar2.f107008b) != null) {
                                aVar3.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, null, 4, null);
        }
        this.f107009c = hVar;
        ViewPortHandler viewPortHandler = customCombinedChart2.getViewPortHandler();
        viewPortHandler.getClass();
        this.f107010d = new v(viewPortHandler, 0.0f, 2, null);
        Context context = customCombinedChart2.getContext();
        context.getClass();
        this.f107011e = new u(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f107011e;
    }

    @Override // qz.e
    public final j c() {
        return this.f107010d;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entry = new Entry();
        entry.setData(pz.d.a(this.f107007a, highlight.getX()));
        return entry;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b00.b getF107009c() {
        return this.f107009c;
    }

    public /* synthetic */ c(CustomCombinedChart customCombinedChart, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(customCombinedChart, (i14 & 2) != 0 ? null : aVar);
    }
}

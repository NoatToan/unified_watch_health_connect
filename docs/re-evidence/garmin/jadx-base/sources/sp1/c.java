package sp1;

import android.view.MotionEvent;
import b00.e;
import com.github.mikephil.charting.charts.BarLineChartBase;
import e23.l;
import k00.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsp1/c;", "Lk00/j;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f160510e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<MotionEvent, Unit> {
        public a(Object obj) {
            super(1, obj, pz.d.class, "toggleDoubleHighlight", "toggleDoubleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.g((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarLineChartBase<?> barLineChartBase) {
        super(barLineChartBase);
        barLineChartBase.getClass();
        this.f160510e = new e(barLineChartBase, new a(barLineChartBase), null, 4, null);
    }

    @Override // k00.j, qz.e
    public final b00.b f() {
        return this.f160510e;
    }
}

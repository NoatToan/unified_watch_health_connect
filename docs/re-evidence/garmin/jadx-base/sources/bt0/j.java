package bt0;

import c22.l3;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbt0/j;", "Li00/b;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends i00.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ValueFormatter f21082i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21083a;

        static {
            int[] iArr = new int[xs0.b.values().length];
            try {
                iArr[xs0.b.PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f21083a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bt0/j$b", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            l3.f23124b.getClass();
            return l3.a.w0((int) f14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xs0.b bVar, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        yAxis.getClass();
        this.f21082i = (bVar == null ? -1 : a.f21083a[bVar.ordinal()]) == 1 ? new b() : new yz.e();
    }

    @Override // i00.b
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ValueFormatter getF21082i() {
        return this.f21082i;
    }
}

package i00;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Li00/a;", "Lcom/github/mikephil/charting/renderer/YAxisRendererHorizontalBarChart;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "axisRight", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends YAxisRendererHorizontalBarChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f86708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f86709e;

    static {
        new C1719a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        h.o(viewPortHandler, yAxis, transformer);
        this.f86705a = true;
        this.f86706b = true;
        new yz.e();
        this.f86707c = 5;
        this.f86708d = true;
        this.f86709e = 5.0f;
    }

    /* JADX INFO: renamed from: i00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li00/a$a;", "", "<init>", "()V", "", "DEFAULT_Y_LABEL_COUNT", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1719a {
        public /* synthetic */ C1719a(j jVar) {
            this();
        }

        private C1719a() {
        }
    }
}

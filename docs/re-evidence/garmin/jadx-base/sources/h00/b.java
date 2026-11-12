package h00;

import android.graphics.Paint;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh00/b;", "Lcom/github/mikephil/charting/renderer/XAxisRenderer;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends XAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f80597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f80598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f80599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<xz.h> f80600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueFormatter f80601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f80604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f80605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f80606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f80607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f80608l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        this.f80602f = 6;
        this.f80605i = 5.0f;
        this.f80608l = true;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getF80606j() {
        return this.f80606j;
    }

    public void b() {
        this.f80606j = false;
    }
}

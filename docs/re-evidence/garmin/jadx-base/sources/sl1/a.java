package sl1;

import android.text.TextPaint;
import android.text.TextUtils;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import g22.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsl1/a;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lsl1/a$a;", "mappedLabelsProvider", "<init>", "(Lcom/github/mikephil/charting/components/YAxis;Lsl1/a$a;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YAxis f159977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3024a f159978b;

    /* JADX INFO: renamed from: sl1.a$a, reason: collision with other inner class name */
    public interface InterfaceC3024a {
        String a(float f14, YAxis yAxis);
    }

    public a(YAxis yAxis, InterfaceC3024a interfaceC3024a) {
        yAxis.getClass();
        interfaceC3024a.getClass();
        this.f159977a = yAxis;
        this.f159978b = interfaceC3024a;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        String string;
        TextPaint textPaint = new TextPaint();
        YAxis yAxis = this.f159977a;
        textPaint.setColor(yAxis.getTextColor());
        textPaint.setTextSize(yAxis.getTextSize());
        textPaint.setTypeface(yAxis.getTypeface());
        String strA = this.f159978b.a(f14, yAxis);
        if (strA == null) {
            return "";
        }
        if (!n.d(strA)) {
            strA = null;
        }
        return (strA == null || (string = TextUtils.ellipsize(strA, textPaint, Utils.convertDpToPixel(yAxis.getMaxWidth()), TextUtils.TruncateAt.END).toString()) == null) ? "" : string;
    }
}

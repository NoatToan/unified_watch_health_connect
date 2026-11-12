package yz;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyz/b;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "digits", "<init>", "(I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f200225a;

    public b(int i14) {
        this.f200225a = i14;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i14 = 0; i14 < this.f200225a; i14++) {
            if (i14 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        String str = new DecimalFormat("###,###,###,##0" + ((Object) stringBuffer)).format(Float.valueOf(f14));
        str.getClass();
        return str;
    }
}

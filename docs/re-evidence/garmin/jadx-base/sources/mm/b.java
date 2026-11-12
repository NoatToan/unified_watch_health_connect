package mm;

import com.google.android.material.timepicker.TimeModel;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class b extends NumberFormat {
    @Override // java.text.NumberFormat
    public final StringBuffer format(long j8, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j8 / 60)));
        stringBuffer.append(":");
        stringBuffer.append(String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j8 % 60)));
        return stringBuffer;
    }

    @Override // java.text.NumberFormat
    public final Number parse(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.NumberFormat
    public final StringBuffer format(double d14, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        format((long) d14, stringBuffer, fieldPosition);
        return stringBuffer;
    }
}

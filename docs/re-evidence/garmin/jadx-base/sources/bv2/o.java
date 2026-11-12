package bv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv2/o;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends fw2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.rts_pulse_ox_range_view, this);
        TextView textView = (TextView) findViewById(R.id.pulse_ox_range_1);
        textView.setText(textView.getContext().getString(R.string.value_dash_range, NumberFormat.getIntegerInstance().format(100L), NumberFormat.getPercentInstance().format(0.9d)));
        TextView textView2 = (TextView) findViewById(R.id.pulse_ox_range_2);
        textView2.setText(textView2.getContext().getString(R.string.value_dash_range, NumberFormat.getIntegerInstance().format(89L), NumberFormat.getPercentInstance().format(0.8d)));
        TextView textView3 = (TextView) findViewById(R.id.pulse_ox_range_3);
        textView3.setText(textView3.getContext().getString(R.string.value_dash_range, NumberFormat.getIntegerInstance().format(79L), NumberFormat.getPercentInstance().format(0.7d)));
        TextView textView4 = (TextView) findViewById(R.id.pulse_ox_range_4);
        textView4.setText(textView4.getContext().getString(R.string.less_value, NumberFormat.getPercentInstance().format(0.7d)));
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}

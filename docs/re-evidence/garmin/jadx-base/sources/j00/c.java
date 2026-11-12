package j00;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import g22.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    @SuppressLint({"InflateParams"})
    public static final void a(Canvas canvas, Context context, String str, String str2, RectF rectF) {
        if (n.d(str)) {
            int iWidth = (int) rectF.width();
            int iHeight = (int) rectF.height();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.chart_no_data_text, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.chart_no_data_text)).setText(str);
            TextView textView = (TextView) viewInflate.findViewById(R.id.chart_no_data_text_description);
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            textView.setText(str2);
            viewInflate.measure(View.MeasureSpec.makeMeasureSpec(iWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iHeight, Integer.MIN_VALUE));
            int measuredWidth = viewInflate.getMeasuredWidth();
            int measuredHeight = viewInflate.getMeasuredHeight();
            viewInflate.layout(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(rectF.centerX() - (measuredWidth / 2), rectF.centerY() - (measuredHeight / 2));
            viewInflate.draw(canvas);
            canvas.restore();
        }
    }
}

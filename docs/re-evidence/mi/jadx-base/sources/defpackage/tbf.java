package defpackage;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;

/* JADX INFO: loaded from: classes4.dex */
public class tbf {
    public static int a(float f, YogaMeasureMode yogaMeasureMode) {
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        return yogaMeasureMode == YogaMeasureMode.AT_MOST ? View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}

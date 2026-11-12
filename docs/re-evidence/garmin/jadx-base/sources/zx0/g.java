package zx0;

import am.x0;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public class g {
    public static LayerDrawable a(int i14, x0 x0Var, Context context) {
        if (x0Var == x0.E || x0Var == x0.f4355z1 || x0Var == x0.A1 || x0Var == x0.f4351y1) {
            return r0.a(context, x0Var.f4361d, R.color.gcm_red_activity_icon, R.color.gcm_icon_on_color, (int) xy2.b.n(context.getResources(), 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT);
        }
        return i14 == 0 ? r0.a(context, x0Var.f4361d, R.color.gcm_activity_color, R.color.gcm_icon_on_color, (int) xy2.b.n(context.getResources(), 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT) : r0.a(context, x0Var.f4361d, R.color.gcm_icon_secondary, R.color.gcm_icon_on_color, (int) xy2.b.n(context.getResources(), 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT);
    }
}

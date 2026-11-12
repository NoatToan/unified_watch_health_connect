package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class p5 extends a0 {
    public p5(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        com.garmin.android.apps.connectmobile.i2.k(com.garmin.android.apps.connectmobile.a2.SETTINGS, "Vivofit4ColorThemeField", "inflating view");
        return f(R.layout.gcm3_field_select_color_theme);
    }

    @Override // ch1.w3
    public final int r() {
        return R.id.device_settings_color_theme_section;
    }

    @Override // ch1.w3
    public final Map t() {
        HashMap map = new HashMap();
        map.put("DEFAULT", b(R.string.lbl_theme_default));
        map.put("HIGH_CONTRAST", b(R.string.lbl_theme_high_contrast));
        map.put("DUAL_COLOR", b(R.string.lbl_theme_dual_color));
        map.put("BLUE", b(R.string.lbl_theme_blue));
        map.put("GREEN", b(R.string.lbl_theme_green));
        return map;
    }

    @Override // ch1.w3
    public final HashMap u() {
        HashMap map = new HashMap();
        q6.f.r(R.id.color_theme_button_1, map, "DEFAULT", R.id.color_theme_button_2, "HIGH_CONTRAST");
        q6.f.r(R.id.color_theme_button_3, map, "DUAL_COLOR", R.id.color_theme_button_4, "BLUE");
        map.put("GREEN", Integer.valueOf(R.id.color_theme_button_5));
        return map;
    }
}

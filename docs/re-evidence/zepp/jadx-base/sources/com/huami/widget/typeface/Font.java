package com.huami.widget.typeface;

import androidx.annotation.Nullable;
import com.huami.moving.ui.utils.SportAnalytics;

/* JADX INFO: loaded from: classes17.dex */
public enum Font {
    OSWALD("ow", "fonts/Oswald-Regular.ttf"),
    LT("lt", "fonts/MiLanTing-Regular.ttf"),
    LT_BOLD("lt-bold", "fonts/MiLanTing-Bold.ttf"),
    KM(SportAnalytics.ParamValue.MapButtonType.KM, "fonts/Oswald-Regular.ttf"),
    DIN_MED("din-med", "fonts/dincond_medium.otf");

    private final String name;
    private final String path;

    Font(String str, String str2) {
        this.name = str;
        this.path = str2;
    }

    @Nullable
    public static Font from(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        for (Font font : values()) {
            if (str.equals(font.getName())) {
                return font;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }
}

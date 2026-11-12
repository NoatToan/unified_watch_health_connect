package cl0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcl0/c;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f27927a = new c();

    private c() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            String string = context.getString(R.string.no_value_card);
            string.getClass();
            return string;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1915184754:
                    if (str.equals("MATCH_PLAY")) {
                        String string2 = context.getString(R.string.golf_scorecards_match_play);
                        string2.getClass();
                        return string2;
                    }
                    break;
                case -197770213:
                    if (str.equals("SKINS_GAME")) {
                        String string3 = context.getString(R.string.golf_scorecards_skins_game);
                        string3.getClass();
                        return string3;
                    }
                    break;
                case -180783909:
                    if (str.equals("STROKE_PLAY")) {
                        String string4 = context.getString(R.string.golf_scorecards_stroke_play);
                        string4.getClass();
                        return string4;
                    }
                    break;
                case 1667853942:
                    if (str.equals("STABLEFORD")) {
                        String string5 = context.getString(R.string.golf_scorecards_stableford);
                        string5.getClass();
                        return string5;
                    }
                    break;
            }
        }
        String string6 = context.getString(R.string.no_value_card);
        string6.getClass();
        return string6;
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.media3.common.C;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwadvancednumberpicker.R;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xde {
    private static final Typeface e = Typeface.create(Constants.FONT, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Typeface f52728a = Typeface.create(C.SANS_SERIF_NAME, 0);

    public static String b(int i) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault());
        numberInstance.setGroupingUsed(false);
        return numberInstance.format(i);
    }

    public static void b(Typeface typeface, Paint paint) {
        if (paint != null) {
            paint.setTypeface(typeface);
        }
    }

    public static boolean c(Context context) {
        if (context == null || context.getResources() == null) {
            return false;
        }
        Configuration configuration = context.getResources().getConfiguration();
        String language = configuration.locale.getLanguage();
        String country = configuration.locale.getCountry();
        return "my".equals(language) && ("MM".equals(country) || "ZG".equals(country));
    }

    public static float d(Context context, float f) {
        return (f / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Typeface a(Context context) {
        return Typeface.create(context.getResources().getString(R.string.emui_text_font_family_medium), 0);
    }

    public static Typeface b(Context context) {
        return Typeface.create(context.getResources().getString(R.string.emui_text_font_family_regular), 0);
    }
}

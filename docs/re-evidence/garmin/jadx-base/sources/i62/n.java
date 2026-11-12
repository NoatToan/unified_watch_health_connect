package i62;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    public static final String a(Resources resources) {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        String string = resources.getString(R.string.locale_pattern, language, Locale.getDefault().getCountry());
        string.getClass();
        String[] stringArray = resources.getStringArray(R.array.msn_languages);
        stringArray.getClass();
        int length = stringArray.length;
        int i14 = 0;
        while (true) {
            str = null;
            if (i14 >= length) {
                str2 = null;
                break;
            }
            str2 = stringArray[i14];
            if (s.g(str2, string)) {
                break;
            }
            i14++;
        }
        if (str2 != null) {
            return str2;
        }
        for (String str3 : stringArray) {
            if (s.g(Locale.forLanguageTag(str3).getLanguage(), language)) {
                str = str3;
                break;
            }
        }
        return str == null ? "en-US" : str;
    }

    public static final String b() {
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            return fb1.c.n("https://", (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).D() ? zi2.b.GARMIN_ATP_GATEWAY : zi2.b.GARMIN_ATP_GATEWAY_TEST).f204887b);
        }
        return fb1.c.n("https://", (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).D() ? zi2.b.GARMIN_ATP_GATEWAY : zi2.b.GARMIN_ATP_GATEWAY_TEST).f204886a);
    }

    public static final String c() {
        return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() ? fb1.c.n("http://", zi2.b.GARMIN_VIDEO.f204887b) : fb1.c.n("http://", zi2.b.GARMIN_VIDEO.f204886a);
    }
}

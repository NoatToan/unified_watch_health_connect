package c22;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/b0;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f23008a = new b0();

    private b0() {
    }

    public static String a(String str, boolean z14) {
        str.getClass();
        Locale locale = Locale.getDefault();
        if (z14 || !(TextUtils.equals(locale.getLanguage(), "en") || TextUtils.equals(locale.getLanguage(), "zh"))) {
            String displayCountry = new Locale("", str).getDisplayCountry();
            displayCountry.getClass();
            return displayCountry;
        }
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        if (str.equals("CN")) {
            String string = contextC.getString(R.string.china_display_name_overwrite);
            string.getClass();
            return string;
        }
        String displayCountry2 = new Locale("", str).getDisplayCountry();
        displayCountry2.getClass();
        return displayCountry2;
    }

    public static final String b(String str) {
        String str2;
        String str3 = null;
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        if (str == null) {
            str = hb2.h.a(contextC).getCountry();
        }
        f12.l.f68084a.getClass();
        Pair<String, Long> pairU0 = f12.l.a.a().U0();
        if (pairU0 != null && (str2 = (String) pairU0.first) != null && ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c() && f12.l.a.a().A1()) {
            str3 = str2;
        }
        if (str3 != null) {
            str = str3;
        }
        str.getClass();
        Locale locale = Locale.US;
        return j20.x.f(locale, str, locale);
    }

    public static final String c() {
        String strA = hb2.e.a(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c());
        strA.getClass();
        return strA;
    }

    public static final boolean d() {
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            return true;
        }
        String upperCase = b(null).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase.equals(Locale.CHINA.getCountry());
    }
}

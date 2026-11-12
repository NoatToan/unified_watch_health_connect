package re2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.LocaleList;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import o53.s0;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.p0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lre2/l0;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f152316a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f152317b = o13.m.b(new r70.n(29));

    private l0() {
    }

    public static String a(long j8) {
        return am.j.m("(rate limit expires ", ((SimpleDateFormat) f152317b.getValue()).format(Long.valueOf(j8)), ")");
    }

    public static final String b(Context context) {
        Locale locale;
        String language;
        String country;
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        locales.getClass();
        int size = locales.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                locale = null;
                break;
            }
            locale = locales.get(i14);
            if (locale != null) {
                String language2 = locale.getLanguage();
                language2.getClass();
                if (!d53.w.J(language2)) {
                    break;
                }
            }
            i14++;
        }
        if (locale == null || (language = locale.getLanguage()) == null) {
            language = Locale.getDefault().getLanguage();
            language.getClass();
        }
        if (d53.w.J(language)) {
            return "en";
        }
        if (locale == null || (country = locale.getCountry()) == null) {
            country = "";
        }
        int iHashCode = language.hashCode();
        if (iHashCode != 2862) {
            if (iHashCode != 2894) {
                if (iHashCode == 3365) {
                    return !language.equals("in") ? language : TtmlNode.ATTR_ID;
                }
                if (iHashCode == 3374) {
                    return !language.equals("iw") ? language : "he";
                }
                if (iHashCode == 3508) {
                    return !language.equals("nb") ? language : BooleanUtils.NO;
                }
                if (iHashCode == 3588) {
                    return (language.equals("pt") && !country.equalsIgnoreCase("PT")) ? "pt_BR" : language;
                }
                if (iHashCode != 3854) {
                    if (iHashCode != 3886 || !language.equals("zh")) {
                        return language;
                    }
                } else if (!language.equals("zH")) {
                    return language;
                }
            } else if (!language.equals("Zh")) {
                return language;
            }
        } else if (!language.equals("ZH")) {
            return language;
        }
        return country.equalsIgnoreCase("TW") ? "zh_TW" : language;
    }

    public static Logger c(String str) {
        Logger logger = LoggerFactory.getLogger("MA#".concat(str));
        logger.getClass();
        return logger;
    }

    public static final String d(Context context) {
        context.getClass();
        j23.l lVarO = j23.t.o(0, context.getResources().getConfiguration().getLocales().size());
        ArrayList<Locale> arrayList = new ArrayList();
        Iterator<Integer> it = lVarO.iterator();
        while (it.hasNext()) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(((p0) it).nextInt());
            if (locale != null) {
                arrayList.add(locale);
            }
        }
        for (Locale locale2 : arrayList) {
            String language = locale2.getLanguage();
            if (language != null && !d53.w.J(language)) {
                if (d53.u.q(locale2.getLanguage(), "nb", true)) {
                    return BooleanUtils.NO;
                }
                if (d53.u.q(locale2.getLanguage(), "iw", true)) {
                    return "he";
                }
                if (d53.u.q(locale2.getLanguage(), "in", true)) {
                    return TtmlNode.ATTR_ID;
                }
                String country = locale2.getCountry();
                if (country != null && !d53.w.J(country)) {
                    return (d53.u.q(locale2.getCountry(), "TW", true) && d53.u.q(locale2.getLanguage(), "zh", true)) ? "zh_TW" : e5.g(locale2.getLanguage(), "_", locale2.getCountry());
                }
            }
        }
        return "en_US";
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        vc2.c.f177088e.getClass();
        ConnectivityManager connectivityManagerB = vc2.h.b(context);
        return (connectivityManagerB == null || (activeNetworkInfo = connectivityManagerB.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static Object f(v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new k0(null), cVar);
    }
}

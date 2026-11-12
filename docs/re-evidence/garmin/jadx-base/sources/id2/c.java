package id2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.w;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lid2/c;", "Lid2/e;", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "", "(I)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93037b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(kd2.a.a(context));
        context.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        String language;
        String upperCase;
        Request.Builder builderHeader = chain.request().newBuilder().header("X-app-ver", this.f93037b);
        Locale locale = Locale.getDefault();
        String language2 = locale.getLanguage();
        Locale locale2 = Locale.CHINESE;
        if (!s.g(language2, locale2.getLanguage())) {
            language = locale.getLanguage();
        } else if (s.g(locale.getLanguage(), locale2.getLanguage())) {
            String country = locale.getCountry();
            if (country != null) {
                int iHashCode = country.hashCode();
                upperCase = "CN";
                if (iHashCode != 2307) {
                    if (iHashCode != 2466) {
                        if (iHashCode != 2644 || !country.equals("SG")) {
                        }
                    } else if (country.equals("MO")) {
                        if (!s.g(locale.getScript(), "Hans")) {
                            upperCase = "TW";
                        }
                    }
                    String country2 = locale.getCountry();
                    country2.getClass();
                    upperCase = country2.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                } else if (!country.equals("HK")) {
                    String country3 = locale.getCountry();
                    country3.getClass();
                    upperCase = country3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                } else if (!s.g(locale.getScript(), "Hans")) {
                    upperCase = "TW";
                }
            } else {
                String country4 = locale.getCountry();
                country4.getClass();
                upperCase = country4.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            }
            if (w.J(upperCase)) {
                upperCase = null;
            }
            language = upperCase != null ? "zh_".concat(upperCase) : "en";
        } else {
            language = locale.getLanguage();
            language.getClass();
        }
        language.getClass();
        return chain.proceed(builderHeader.header("X-lang", language).build());
    }

    public c(String str) {
        str.getClass();
        this.f93037b = str;
    }

    public c(int i14) {
        this(String.valueOf(i14));
    }
}

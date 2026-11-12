package defpackage;

import io.sentry.SentryOptions;
import io.sentry.util.p;
import java.net.URI;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class jok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f22981a;

    public jok(@NotNull SentryOptions sentryOptions) {
        this.f22981a = (SentryOptions) p.c(sentryOptions, "options is required");
    }

    @NotNull
    public iok a() {
        String str;
        k67 k67VarRetrieveParsedDsn = this.f22981a.retrieveParsedDsn();
        URI uriC = k67VarRetrieveParsedDsn.c();
        String string = uriC.resolve(uriC.getPath() + "/envelope/").toString();
        String strA = k67VarRetrieveParsedDsn.a();
        String strB = k67VarRetrieveParsedDsn.b();
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=7,sentry_client=");
        sb.append(this.f22981a.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(strA);
        if (strB == null || strB.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strB;
        }
        sb.append(str);
        String string2 = sb.toString();
        String sentryClientName = this.f22981a.getSentryClientName();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        return new iok(string, map);
    }
}

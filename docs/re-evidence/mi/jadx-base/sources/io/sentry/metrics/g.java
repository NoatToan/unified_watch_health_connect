package io.sentry.metrics;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.gv5;
import io.sentry.MeasurementUnit;
import io.sentry.util.Random;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f21750a = Pattern.compile("\\W+");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21751b = Pattern.compile("[^\\w\\-.]+");
    public static final Pattern c = Pattern.compile("[^\\w\\-./]+");
    public static long d = (long) (new Random().nextFloat() * 10000.0f);

    public static void a(long j, @NotNull Collection<e> collection, @NotNull StringBuilder sb) {
        for (e eVar : collection) {
            sb.append(e(eVar.a()));
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(h(d(eVar.d())));
            for (Object obj : eVar.f()) {
                sb.append(":");
                sb.append(obj);
            }
            sb.append("|");
            sb.append(eVar.c().statsdCode);
            Map<String, String> mapB = eVar.b();
            if (mapB != null) {
                sb.append("|#");
                boolean z = true;
                for (Map.Entry<String, String> entry : mapB.entrySet()) {
                    String strF = f(entry.getKey());
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(strF);
                    sb.append(":");
                    sb.append(g(entry.getValue()));
                }
            }
            sb.append("|T");
            sb.append(j);
            sb.append("\n");
        }
    }

    public static long b(long j) {
        return (j - 10000) - d;
    }

    public static long c(long j) {
        long j2 = ((j / 1000) / 10) * 10;
        return j >= 0 ? j2 : j2 - 1;
    }

    @NotNull
    public static String d(@Nullable MeasurementUnit measurementUnit) {
        return measurementUnit != null ? measurementUnit.apiName() : "none";
    }

    @NotNull
    public static String e(@NotNull String str) {
        return f21751b.matcher(str).replaceAll(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
    }

    @NotNull
    public static String f(@NotNull String str) {
        return c.matcher(str).replaceAll("");
    }

    @NotNull
    public static String g(@NotNull String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '|') {
                sb.append("\\u{7c}");
            } else if (cCharAt == ',') {
                sb.append("\\u{2c}");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @NotNull
    public static String h(@NotNull String str) {
        return f21750a.matcher(str).replaceAll("");
    }
}

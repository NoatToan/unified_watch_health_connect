package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class ktd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtd f24279a;

    public ktd(int i) {
        this.f24279a = new xtd(i);
    }

    public void a(@NotNull h4h h4hVar, @NotNull ILogger iLogger, @Nullable Object obj) throws IOException {
        if (obj == null) {
            h4hVar.l();
            return;
        }
        if (obj instanceof Character) {
            h4hVar.c(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            h4hVar.c((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            h4hVar.f(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            h4hVar.i((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(h4hVar, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(h4hVar, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof cud) {
            ((cud) obj).serialize(h4hVar, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(h4hVar, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(h4hVar, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(h4hVar, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            h4hVar.c(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(h4hVar, iLogger, l.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            h4hVar.f(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            h4hVar.c(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            h4hVar.c(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            h4hVar.c(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            h4hVar.c(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(h4hVar, iLogger, l.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            h4hVar.c(obj.toString());
            return;
        }
        try {
            a(h4hVar, iLogger, this.f24279a.d(obj, iLogger));
        } catch (Exception e) {
            iLogger.a(SentryLevel.ERROR, "Failed serializing unknown object.", e);
            h4hVar.c("[OBJECT]");
        }
    }

    public final void b(@NotNull h4h h4hVar, @NotNull ILogger iLogger, @NotNull Collection<?> collection) throws IOException {
        h4hVar.b();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(h4hVar, iLogger, it.next());
        }
        h4hVar.a();
    }

    public final void c(@NotNull h4h h4hVar, @NotNull ILogger iLogger, @NotNull Date date) throws IOException {
        try {
            h4hVar.c(yq5.g(date));
        } catch (Exception e) {
            iLogger.a(SentryLevel.ERROR, "Error when serializing Date", e);
            h4hVar.l();
        }
    }

    public final void d(@NotNull h4h h4hVar, @NotNull ILogger iLogger, @NotNull Map<?, ?> map) throws IOException {
        h4hVar.beginObject();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                h4hVar.g((String) obj);
                a(h4hVar, iLogger, map.get(obj));
            }
        }
        h4hVar.endObject();
    }

    public final void e(@NotNull h4h h4hVar, @NotNull ILogger iLogger, @NotNull TimeZone timeZone) throws IOException {
        try {
            h4hVar.c(timeZone.getID());
        } catch (Exception e) {
            iLogger.a(SentryLevel.ERROR, "Error when serializing TimeZone", e);
            h4hVar.l();
        }
    }
}

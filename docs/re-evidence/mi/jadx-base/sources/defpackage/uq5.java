package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.format.TextStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<uq5> f36021a = new AtomicReference<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final uq5 f36022a = a();

        public static uq5 a() {
            d8i.a(uq5.f36021a, null, new qcm());
            return (uq5) uq5.f36021a.get();
        }
    }

    public static uq5 b() {
        return a.f36022a;
    }

    public abstract String c(z4p z4pVar, long j, TextStyle textStyle, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> d(z4p z4pVar, TextStyle textStyle, Locale locale);
}

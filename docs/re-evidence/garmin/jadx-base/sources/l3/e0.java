package l3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll3/e0;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f109226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f109227b = new LinkedHashMap();

    public e0(Locale locale) {
        this.f109226a = locale;
    }

    public abstract String a(long j8, String str, Locale locale);

    public abstract d0 b(long j8);

    public abstract k0 c(Locale locale);

    public abstract int d();

    public abstract h0 e(int i14, int i15);

    public abstract h0 f(long j8);

    public abstract h0 g(d0 d0Var);

    public abstract d0 h();

    public abstract ArrayList i();

    public abstract d0 j(String str, String str2, Locale locale);

    public abstract h0 k(h0 h0Var, int i14);
}

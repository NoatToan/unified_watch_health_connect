package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class pqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale f45847a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45848c;
    private final String d;
    private final String e;

    private pqp(String str, String str2, String str3, Locale locale) {
        this.f45848c = str;
        this.e = str2;
        this.d = str3;
        this.f45847a = locale;
    }

    public static pqp c(String str, String str2, String str3, Locale locale) {
        return new pqp(str, str2, str3, locale);
    }

    public String a() {
        return this.f45848c;
    }

    public String b() {
        return this.e;
    }

    public String e() {
        return this.d;
    }

    public Locale c() {
        return this.f45847a;
    }
}

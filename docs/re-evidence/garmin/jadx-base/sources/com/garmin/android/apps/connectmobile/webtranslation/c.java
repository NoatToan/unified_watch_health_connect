package com.garmin.android.apps.connectmobile.webtranslation;

import am.j;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/c;", "", "b", "a", "apiValue", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47979b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f47980c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47981a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/c$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
    }

    static {
        String language = Locale.ENGLISH.getLanguage();
        language.getClass();
        f47980c = language;
    }

    private /* synthetic */ c(String str) {
        this.f47981a = str;
    }

    public static final /* synthetic */ c a(String str) {
        return new c(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return s.g(this.f47981a, ((c) obj).f47981a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47981a.hashCode();
    }

    public final String toString() {
        return j.m("WebTranslationLocale(apiValue=", this.f47981a, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a() {
            String language;
            Locale locale = Locale.getDefault();
            if (s.g(locale.getLanguage(), "zh") && s.g(locale.getCountry(), "TW")) {
                language = "zh_TW";
            } else {
                language = s.g(locale.getLanguage(), "zh") ? "zh_CN" : locale.getLanguage();
            }
            language.getClass();
            a aVar = c.f47979b;
            return language;
        }

        private a() {
        }
    }
}

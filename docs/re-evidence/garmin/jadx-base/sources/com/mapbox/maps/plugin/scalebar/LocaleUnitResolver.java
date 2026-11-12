package com.mapbox.maps.plugin.scalebar;

import java.util.Locale;
import p005kotlin.Metadata;
import sn.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/LocaleUnitResolver;", "", "()V", "isMetricSystem", "", "()Z", "ImperialCountryCode", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocaleUnitResolver {
    public static final LocaleUnitResolver INSTANCE = new LocaleUnitResolver();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/LocaleUnitResolver$ImperialCountryCode;", "", "()V", "LIBERIA", "", "MYANMAR", ImperialCountryCode.US, "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ImperialCountryCode {
        public static final ImperialCountryCode INSTANCE = new ImperialCountryCode();
        public static final String LIBERIA = "LR";
        public static final String MYANMAR = "MM";
        public static final String US = "US";

        private ImperialCountryCode() {
        }
    }

    private LocaleUnitResolver() {
    }

    public final boolean isMetricSystem() {
        String country = Locale.getDefault().getCountry();
        country.getClass();
        String strG = a.g(country);
        int iHashCode = strG.hashCode();
        if (iHashCode == 2438) {
            return !strG.equals(ImperialCountryCode.LIBERIA);
        }
        if (iHashCode != 2464) {
            return (iHashCode == 2718 && strG.equals(ImperialCountryCode.US)) ? false : true;
        }
        return !strG.equals(ImperialCountryCode.MYANMAR);
    }
}

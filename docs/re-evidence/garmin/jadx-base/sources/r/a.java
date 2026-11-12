package r;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f148632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f148633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f148634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f148635d;

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    public static final class C2800a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f148636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f148637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f148638c;
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f148632a = num;
        this.f148633b = num2;
        this.f148634c = num3;
        this.f148635d = num4;
    }

    public static a a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new a((Integer) bundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer) bundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f148632a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f148633b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f148634c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f148635d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
